package org.sonar.vary;

import com.sonar.sslr.api.Grammar;
import com.sonar.sslr.impl.Parser;

import org.sonar.vary.api.VaryKeyword;
import org.sonar.vary.api.VaryMetric;
import org.sonar.vary.visitors.VaryCharsetAwareVisitor;
import org.sonar.vary.visitors.VaryComplexityVisitor;
import org.sonar.vary.visitors.VaryFileVisitor;
import org.sonar.vary.parser.VaryGrammarImpl;
import org.sonar.vary.parser.VaryParser;
import org.sonar.squidbridge.AstScanner;
import org.sonar.squidbridge.SquidAstVisitor;
import org.sonar.squidbridge.SquidAstVisitorContextImpl;
import org.sonar.squidbridge.api.SourceCode;
import org.sonar.squidbridge.api.SourceFile;
import org.sonar.squidbridge.api.SourceProject;
import org.sonar.squidbridge.indexer.QueryByType;
import org.sonar.squidbridge.metrics.CommentsVisitor;
import org.sonar.squidbridge.metrics.CounterVisitor;
import org.sonar.squidbridge.metrics.LinesOfCodeVisitor;
import org.sonar.squidbridge.metrics.LinesVisitor;

import java.io.File;
import java.util.Collection;

public final class VaryAstScanner {

  private VaryAstScanner() {
  }

  /**
   * Helper method for testing checks without having to deploy them on a Sonar instance.
   */
  public static SourceFile scanSingleFileConfig(File file, VaryConfiguration varyConfig, SquidAstVisitor<Grammar>... visitors) {
	    if (!file.isFile()) {
	      throw new IllegalArgumentException("File '" + file + "' not found.");
	    }
	    AstScanner<Grammar> scanner = create(varyConfig, visitors);
	    scanner.scanFile(file);
	    Collection<SourceCode> sources = scanner.getIndex().search(new QueryByType(SourceFile.class));
	    if (sources.size() != 1) {
	      throw new IllegalStateException("Only one SourceFile was expected whereas " + sources.size() + " has been returned.");
	    }
	    return (SourceFile) sources.iterator().next();
  }

  public static AstScanner<Grammar> create(VaryConfiguration conf, SquidAstVisitor<Grammar>... visitors) {
	final SquidAstVisitorContextImpl<Grammar> context = new SquidAstVisitorContextImpl<Grammar>(new SourceProject("Vary Project"));;
    final Parser<Grammar> parser = VaryParser.create(/*context, conf*/);

    AstScanner.Builder<Grammar> builder = AstScanner.<Grammar> builder(context).setBaseParser(parser);

    /* Metrics */
    builder.withMetrics(VaryMetric.values());

    /* Comments */
    builder.setCommentAnalyser(new VaryCommentAnalyser());

    /* Files */
    builder.setFilesMetric(VaryMetric.FILES);

    /* Functions */
    builder.withSquidAstVisitor(CounterVisitor.<Grammar> builder()
            .setMetricDef(VaryMetric.FUNCTIONS)
            .subscribeTo(VaryGrammarImpl.FUNCION,
            		VaryGrammarImpl.PROCEDIMIENTO)
            .build());

    /* Metrics */
    builder.withSquidAstVisitor(new LinesVisitor<Grammar>(VaryMetric.LINES));
    builder.withSquidAstVisitor(new LinesOfCodeVisitor<Grammar>(VaryMetric.LINES_OF_CODE));
    builder.withSquidAstVisitor(CommentsVisitor.<Grammar>builder().withCommentMetric(
    	      VaryMetric.COMMENT_LINES)
    	      .withNoSonar(true)
    	      /*.withIgnoreHeaderComment(conf.getIgnoreHeaderComments())*/.build());
    builder.withSquidAstVisitor(CounterVisitor.<Grammar> builder()
        .setMetricDef(VaryMetric.STATEMENTS)
        .subscribeTo(
        	VaryGrammarImpl.LLAMADA_FUNCION,
        	VaryGrammarImpl.ASIGNACION_NORMAL,
        	VaryGrammarImpl.ASIGNACION_COMPLEJA,
        	VaryGrammarImpl.DECLARACION_VARIABLE,
        	VaryGrammarImpl.DECLARACION_PROPIA,
        	VaryGrammarImpl.MIENTRAS,
        	VaryGrammarImpl.REPETIR,
        	VaryGrammarImpl.DESDE,
        	VaryGrammarImpl.SI,
        	VaryGrammarImpl.SINO,
        	VaryGrammarImpl.SEGUN,
        	VaryGrammarImpl.CASO,
        	VaryGrammarImpl.ESCRIBIR,
        	VaryGrammarImpl.LEER)
        .build());
    
    builder.withSquidAstVisitor(new VaryFileVisitor<Grammar>(context));
    builder.withSquidAstVisitor(new VaryComplexityVisitor<Grammar>(context));

    for (SquidAstVisitor<Grammar> visitor : visitors) {
        if (visitor instanceof VaryCharsetAwareVisitor) {
            ((VaryCharsetAwareVisitor) visitor).setCharset(conf.getCharset());
          }
        builder.withSquidAstVisitor(visitor);
    }

    return builder.build();
  }

}