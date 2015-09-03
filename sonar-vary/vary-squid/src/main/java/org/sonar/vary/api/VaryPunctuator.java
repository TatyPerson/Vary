package org.sonar.vary.api;

import com.sonar.sslr.api.AstNode;
import com.sonar.sslr.api.TokenType;
import org.sonar.sslr.grammar.GrammarRuleKey;

public enum VaryPunctuator implements TokenType, GrammarRuleKey {

  //Gramática en español:	
  O("o"),
  Y("y"),
  IGUAL("=="),
  IGUAL_ASIGNACION("="),
  DISTINTO("!="),
  MENOR("<"),
  MAYOR(">"),
  MENOR_IGUAL("<="),
  MAYOR_IGUAL(">="),
  SUMA("+"),
  RESTA("-"),
  MULTIPLICACION("*"),
  DIVISION("/"),
  PARENTESIS_DER(")"),
  PARENTESIS_IZQ("("),
  COMA(","),
  PUNTO("."),
  DOS_PUNTOS(":"),
  PUNTOS_SUSPENSIVOS(".."),
  LLAVE_DER("}"),
  LLAVE_IZQ("{"),
  CORCHETE_DER("]"),
  CORCHETE_IZQ("["),
  ASIGNACION("<-"),
  
  //Gramática en inglés
  OR("or"),
  AND("and");
  

  private final String value;

  private VaryPunctuator(String word) {
    this.value = word;
  }

  public String getName() {
    return name();
  }

  public String getValue() {
    return value;
  }

  public boolean hasToBeSkippedFromAst(AstNode node) {
    return false;
  }

}
