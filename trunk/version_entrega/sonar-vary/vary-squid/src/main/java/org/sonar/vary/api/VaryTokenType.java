package org.sonar.vary.api;

import com.sonar.sslr.api.AstNode;
import com.sonar.sslr.api.TokenType;
import org.sonar.sslr.grammar.GrammarRuleKey;

public enum VaryTokenType implements TokenType, GrammarRuleKey {
  CARACTER,
  NUMERO,
  LOGICO,
  CADENA,

  // TODO in fact it's STRING_LITERAL, but we need to keep compatibility of XPath expressions

  IDENTIFICADOR;

  public String getName() {
    return name();
  }

  public String getValue() {
    return name();
  }

  public boolean hasToBeSkippedFromAst(AstNode node) {
    return false;
  }

}
