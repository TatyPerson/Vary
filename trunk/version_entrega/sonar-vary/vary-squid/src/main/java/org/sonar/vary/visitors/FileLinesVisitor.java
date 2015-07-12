package org.sonar.vary.visitors;

import java.util.List;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.sonar.api.batch.fs.FileSystem;
import org.sonar.api.measures.CoreMetrics;
import org.sonar.api.measures.FileLinesContext;
import org.sonar.api.measures.FileLinesContextFactory;
import org.sonar.api.resources.File;
import org.sonar.api.scan.filesystem.PathResolver;
import org.sonar.vary.api.VaryMetric;
import org.sonar.squidbridge.SquidAstVisitor;
import org.sonar.sslr.parser.LexerlessGrammar;

import com.google.common.collect.Sets;
import com.sonar.sslr.api.AstAndTokenVisitor;
import com.sonar.sslr.api.AstNode;
import com.sonar.sslr.api.GenericTokenType;
import com.sonar.sslr.api.Token;
import com.sonar.sslr.api.Trivia;

/**
 * Visitor that computes {@link CoreMetrics#NCLOC_DATA_KEY} and {@link CoreMetrics#COMMENT_LINES_DATA_KEY} metrics used by the DevCockpit.
 */
public class FileLinesVisitor extends SquidAstVisitor<LexerlessGrammar> implements AstAndTokenVisitor {

  private static final Logger LOG = LoggerFactory.getLogger(FileLinesVisitor.class);

  private final FileLinesContextFactory fileLinesContextFactory;
  private final FileSystem fileSystem;
  private final PathResolver pathResolver;

  private final Set<Integer> linesOfCode = Sets.newHashSet();
  private final Set<Integer> linesOfComments = Sets.newHashSet();

  public FileLinesVisitor(FileLinesContextFactory fileLinesContextFactory, FileSystem fileSystem, PathResolver pathResolver) {
    this.fileLinesContextFactory = fileLinesContextFactory;
    this.fileSystem = fileSystem;
    this.pathResolver = pathResolver;
  }

  @Override
  public void visitToken(Token token) {
    if (token.getType().equals(GenericTokenType.EOF)) {
      return;
    }

    linesOfCode.add(token.getLine());
    List<Trivia> trivias = token.getTrivia();
    for (Trivia trivia : trivias) {
      if (trivia.isComment()) {
        linesOfComments.add(trivia.getToken().getLine());
      }
    }
  }

  @Override
  public void leaveFile(AstNode astNode) {
    FileLinesContext fileLinesContext = fileLinesContextFactory.createFor(File.create(pathResolver.relativePath(fileSystem.baseDir(), getContext().getFile().getAbsoluteFile())));

    if (fileLinesContext != null) {

      int fileLength = getContext().peekSourceCode().getInt(VaryMetric.LINES);
      for (int line = 1; line <= fileLength; line++) {
        fileLinesContext.setIntValue(CoreMetrics.NCLOC_DATA_KEY, line, linesOfCode.contains(line) ? 1 : 0);
        fileLinesContext.setIntValue(CoreMetrics.COMMENT_LINES_DATA_KEY, line, linesOfComments.contains(line) ? 1 : 0);
      }
      fileLinesContext.save();

    } else {
      LOG.warn("Cannot save measures for DevCockpit for file {}. Unable to retrieve the associated sonar resource.", getContext().getFile().getName());
    }

    linesOfCode.clear();
    linesOfComments.clear();
  }

}
