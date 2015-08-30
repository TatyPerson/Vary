package org.sonar.vary.api;

import org.sonar.squidbridge.SquidAstVisitorContext;
import org.sonar.vary.VaryConfiguration;
import org.sonar.vary.parser.VaryParser;
import static org.mockito.Mockito.mock;

import com.sonar.sslr.api.Grammar;
import com.sonar.sslr.impl.Parser;

public class ParserBaseTest {
	  protected VaryConfiguration conf = null;
	  protected Parser<Grammar> p = null;
	  protected Grammar g = null;

	  public ParserBaseTest(){
	    conf = new VaryConfiguration();
	    conf.setErrorRecoveryEnabled(false);
	    p = VaryParser.create(mock(SquidAstVisitorContext.class), conf);
	    g = p.getGrammar();
	  }
}
