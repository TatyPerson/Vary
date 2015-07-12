package org.sonar.vary.visitors;

import java.util.Set;

import org.sonar.vary.api.VaryKeyword;
import org.sonar.vary.api.VaryMetric;
import org.sonar.squidbridge.SquidAstVisitor;
import org.sonar.squidbridge.api.SourceCode;

import com.google.common.collect.Sets;
import com.sonar.sslr.api.AstAndTokenVisitor;
import com.sonar.sslr.api.AstNode;
import com.sonar.sslr.api.Grammar;
import com.sonar.sslr.api.Token;
import com.sonar.sslr.api.Trivia;

public class VaryCommentLinesVisitor <GRAMMAR extends Grammar> extends SquidAstVisitor<GRAMMAR> implements AstAndTokenVisitor {

  private Set<Integer> comments = Sets.newHashSet();
  private boolean seenFirstToken;

  @Override
  public void init() {
    subscribeTo(VaryKeyword.ALGORITMO);
  }

  @Override
  public void visitFile(AstNode astNode) {
    comments.clear();
    seenFirstToken = false;
  }

  public void visitToken(Token token) {
    for (Trivia trivia : token.getTrivia()) {
      if (trivia.isComment()) {
        if (seenFirstToken) {
          String[] commentLines = getContext().getCommentAnalyser().getContents(trivia.getToken().getOriginalValue())
              .split("(\r)?\n|\r", -1);
          int line = trivia.getToken().getLine();
          for (String commentLine : commentLines) {
            if (!commentLine.contains("NOSONAR") && !getContext().getCommentAnalyser().isBlank(commentLine)) {
              comments.add(line);
            }
            line++;
          }
        } else {
          seenFirstToken = true;
        }
      }
    }
    seenFirstToken = true;
  }

  @Override
  public void leaveNode(AstNode astNode) {
    SourceCode sourceCode = getContext().peekSourceCode();
    int commentlines = 0;
    for (int line = sourceCode.getStartAtLine(); line <= sourceCode.getEndAtLine(); line++) {
      if (comments.contains(line)) {
        commentlines++;
      }
    }
    sourceCode.setMeasure(VaryMetric.COMMENT_LINES, commentlines);
  }

  public void leaveFile(AstNode ast) {
    getContext().peekSourceCode().setMeasure(VaryMetric.COMMENT_LINES, comments.size());
    comments.clear();
  }

}
