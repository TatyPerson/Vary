package org.sonar.vary.visitors;

import com.google.common.collect.Sets;
import com.sonar.sslr.api.AstAndTokenVisitor;
import com.sonar.sslr.api.AstNode;
import com.sonar.sslr.api.Token;
import org.sonar.squidbridge.SquidAstVisitor;
import org.sonar.squidbridge.measures.MetricDef;
import org.sonar.sslr.parser.LexerlessGrammar;

import javax.annotation.Nullable;
import java.util.Set;

import static com.sonar.sslr.api.GenericTokenType.EOF;

/**
 * Visitor that computes the number of lines of code of a file.
 */
public class LinesOfCodeVisitor extends SquidAstVisitor<LexerlessGrammar> implements AstAndTokenVisitor {

  private final MetricDef metric;
  private Set<Integer> lines = Sets.newHashSet();

  public LinesOfCodeVisitor(MetricDef metric) {
    this.metric = metric;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public void visitFile(AstNode node) {
    lines.clear();
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public void visitToken(Token token) {
    if (token.getType() != EOF) {
      lines.add(token.getLine());
    }
  }

  @Override
  public void leaveFile(@Nullable AstNode astNode) {
    getContext().peekSourceCode().add(metric, lines.size());
  }
}
