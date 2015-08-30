package org.sonar.vary.checks;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.sonar.api.server.rule.RulesDefinition;
import org.sonar.check.Priority;
import org.sonar.check.Rule;
import org.sonar.check.RuleProperty;
import org.sonar.squidbridge.annotations.ActivatedByDefault;
import org.sonar.squidbridge.annotations.SqaleConstantRemediation;
import org.sonar.squidbridge.annotations.SqaleSubCharacteristic;
import org.sonar.squidbridge.checks.SquidCheck;
import org.sonar.vary.api.VaryKeyword;
import org.sonar.vary.parser.VaryGrammarImpl;

import com.sonar.sslr.api.AstNode;
import com.sonar.sslr.api.Grammar;

@Rule(
		key = "TooMuchComplexityMain",
		name = "The main algorithm must contain the fewest possible sentences",
		priority = Priority.MAJOR)
		@ActivatedByDefault
		@SqaleSubCharacteristic(RulesDefinition.SubCharacteristics.UNDERSTANDABILITY)
		@SqaleConstantRemediation("8min")
public class TooMuchComplexityMain extends SquidCheck<Grammar> {
	
	private static final Logger LOG = LoggerFactory
            .getLogger("TooMuchComplexityMain");
	
	private static final int MAXIMUM_NUMBER_SENTENCES = 20;
	
	private final List<Integer> numberSentences = new ArrayList<Integer>();
	
	@RuleProperty(
		    key = "maximumNumberSentences",
		    description = "the maximum number allowed of sentences.",
		    defaultValue = "" + MAXIMUM_NUMBER_SENTENCES)
		  public int maximumNumberSentences = MAXIMUM_NUMBER_SENTENCES;
	
	@Override
	  public void init() {
		  subscribeTo(VaryGrammarImpl.INICIO);
	  }
	  
	  @Override
	  public void visitFile(AstNode node) {
		numberSentences.clear();
	  }
	  
	  @Override
	  public void visitNode(AstNode node) {
		  if(!node.getChildren(VaryKeyword.FIN_INICIO).isEmpty()) {
			  numberSentences.add(node.getChildren(VaryKeyword.INICIO).get(0).getTokenLine());
			  numberSentences.add(node.getChildren(VaryKeyword.FIN_INICIO).get(0).getTokenLine());
		  }
		  else {
			  numberSentences.add(node.getChildren(VaryKeyword.INITIATION).get(0).getTokenLine());
			  numberSentences.add(node.getChildren(VaryKeyword.END_INITIATION).get(0).getTokenLine());
		  }
	  }
	  
	  @Override
	  public void leaveFile(AstNode node) {
		  if(numberSentences.size() > 1) {
			  int numberLines = numberSentences.get(1) - numberSentences.get(0);
			  //LOG.debug("El número de sentencias es: "+numberLines);
			  if(numberLines > maximumNumberSentences) {
				  getContext().createLineViolation(this, "The number of sentences is " + numberLines + " and the maximum is " +  maximumNumberSentences + ". The number of sentences should be reduced by dividing the functionality into subprocess.", numberSentences.get(0));
			  }
		  }
	  }
	
}
