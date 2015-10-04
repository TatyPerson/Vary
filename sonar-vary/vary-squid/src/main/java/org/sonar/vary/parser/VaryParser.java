package org.sonar.vary.parser;

import com.sonar.sslr.api.Grammar;
import com.sonar.sslr.impl.Parser;
import org.sonar.vary.VaryConfiguration;
import org.sonar.vary.lexer.VaryLexer;
import org.sonar.squidbridge.SquidAstVisitorContext;
import org.sonar.squidbridge.SquidAstVisitorContextImpl;
import org.sonar.squidbridge.api.SourceProject;

public final class VaryParser {

	  private VaryParser() {
	  }

	  public static Parser<Grammar> create() {
	    return create(new SquidAstVisitorContextImpl<Grammar>(new SourceProject("")),
	                  new VaryConfiguration());
	  }

	  public static Parser<Grammar> create(SquidAstVisitorContext<Grammar> context) {
	    return create(context, new VaryConfiguration());
	  }

	 public static Parser<Grammar> create(SquidAstVisitorContext<Grammar> context,
	                                       VaryConfiguration conf) {
	    return Parser.builder(VaryGrammarImpl.create(conf))
	      .withLexer(VaryLexer.create(conf))
	      .build();
	  }

}
