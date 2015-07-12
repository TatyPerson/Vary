package org.sonar.vary.visitors;

import com.sonar.sslr.api.AstAndTokenVisitor;
import com.sonar.sslr.api.AstNode;
import com.sonar.sslr.api.Grammar;
import com.sonar.sslr.api.Token;

import org.sonar.vary.api.VaryKeyword;
import org.sonar.vary.api.VaryMetric;
import org.sonar.vary.api.VaryPunctuator;
import org.sonar.squidbridge.SquidAstVisitor;
import org.sonar.squidbridge.SquidAstVisitorContext;
import org.sonar.sslr.parser.LexerlessGrammar;

public class VaryComplexityVisitor<GRAMMAR extends Grammar> extends SquidAstVisitor<GRAMMAR>
implements AstAndTokenVisitor {
	
	  private SquidAstVisitorContext context = null;

	  public VaryComplexityVisitor(SquidAstVisitorContext context){
	    this.context = context;
	  }

	  @Override
	  public void init() {
	    subscribeTo(
	      // Functions
	      VaryKeyword.FUNCION,
	      VaryKeyword.PROCEDIMIENTO,
	      VaryKeyword.PRINCIPAL,

	      // Branching nodes
	      VaryKeyword.SI,
	      VaryKeyword.MIENTRAS,
	      VaryKeyword.DESDE,
	      VaryKeyword.REPETIR,
	      VaryKeyword.SEGUN_SEA,
	      VaryKeyword.CASO,
	      VaryKeyword.DEVOLVER,

	      // Expressions
	      VaryPunctuator.Y,
	      VaryPunctuator.O);
	  }

	  @Override
	  public void visitNode(AstNode astNode) {

	    if (astNode.is(VaryKeyword.DEVOLVER) && isLastReturnStatement(astNode)) {
	      return;
	    }
	    getContext().peekSourceCode().add(VaryMetric.COMPLEXITY, 1);
	  }

	  private static boolean isLastReturnStatement(AstNode returnNode) {
	    AstNode nextNode = returnNode.getNextAstNode();
	    return (nextNode.is(VaryKeyword.FIN_FUNCION) || nextNode.is(VaryKeyword.FIN_PROCEDIMIENTO) || nextNode.is(VaryKeyword.FIN_INICIO));
	  }

	@Override
	public void visitToken(Token arg0) {
		// TODO Auto-generated method stub
		
	}

}
