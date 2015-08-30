package org.sonar.vary.parser;

import java.io.File;

import com.sonar.sslr.api.AstNode;
import com.sonar.sslr.api.Grammar;
import com.sonar.sslr.impl.Parser;

import org.apache.commons.io.FileUtils;
import org.sonar.vary.VaryConfiguration;
import org.sonar.vary.lexer.VaryLexer;
import org.sonar.squidbridge.SquidAstVisitorContext;
import org.sonar.squidbridge.SquidAstVisitorContextImpl;
import org.sonar.squidbridge.api.SourceProject;

public final class VaryParser {

	  private VaryParser() {
	  }
	  
	  /*private static final Parser<Grammar> P = VaryParser.create();
	  
	  public static Parser<Grammar> create() {
		    return Parser.builder(VaryGrammarImpl.create()).withLexer(VaryLexer.create()).build();
      }

	  public static AstNode parseFile(String filePath) {
		 File file = FileUtils.toFile(VaryParser.class.getResource(filePath));
		 if (file == null || !file.exists()) {
		    throw new AssertionError("The file \"" + filePath + "\" does not exist.");
	     }

		 return P.parse(file);
	 }

      public static AstNode parseString(String source) {
		 return P.parse(source);
	 }*/

	  public static Parser<Grammar> create() {
		//return create(new SquidAstVisitorContextImpl<Grammar>(new SourceProject("")));
	    return create(new SquidAstVisitorContextImpl<Grammar>(new SourceProject("")),
	                  new VaryConfiguration());
	  }

	  public static Parser<Grammar> create(SquidAstVisitorContext<Grammar> context) {
	    return create(context, new VaryConfiguration());
	    //return Parser.builder(VaryGrammarImpl.create(new VaryConfiguration())).withLexer(VaryLexer.create(new VaryConfiguration())).build();
	  }

	 public static Parser<Grammar> create(SquidAstVisitorContext<Grammar> context,
	                                       VaryConfiguration conf) {
	    return Parser.builder(VaryGrammarImpl.create(conf))
	      .withLexer(VaryLexer.create(conf))
	      .build();
	  }

}
