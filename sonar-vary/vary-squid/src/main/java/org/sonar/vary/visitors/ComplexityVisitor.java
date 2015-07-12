package org.sonar.vary.visitors;

import com.sonar.sslr.api.AstNode;

import org.sonar.vary.api.VaryKeyword;
import org.sonar.vary.api.VaryMetric;
import org.sonar.vary.api.VaryPunctuator;
import org.sonar.squidbridge.SquidAstVisitor;
import org.sonar.sslr.parser.LexerlessGrammar;

public class ComplexityVisitor extends SquidAstVisitor<LexerlessGrammar> {

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

 /* private static boolean isNotNested(AstNode returnNode) {
    return returnNode.getParent().is(Kind.BLOCK) &&
      returnNode.getParent().getParent().is(
        Kind.SET_METHOD,
        Kind.GET_METHOD,
        Kind.METHOD,
        Kind.GENERATOR_METHOD,
        Kind.GENERATOR_FUNCTION_EXPRESSION,
        Kind.FUNCTION_EXPRESSION,
        Kind.FUNCTION_DECLARATION,
        Kind.GENERATOR_DECLARATION);
  }*/

}
