package org.sonar.vary.api;

import com.sonar.sslr.api.AstNode;
import com.sonar.sslr.api.TokenType;
import org.sonar.sslr.grammar.GrammarRuleKey;

public enum VaryKeyword implements TokenType, GrammarRuleKey {

  ALGORITMO("Algoritmo"),
  MODULO("Modulo"),
  IMPORTA("importa"),
  FIN_IMPORTA("fin_importa"),
  EXPORTA("exporta"),
  FIN_EXPORTA("fin_exporta"),
  FIN_MODULO("fin_modulo"),
  IMPLEMENTACION("implementacion"),
  FIN_IMPLEMENTACION("fin_implementacion"),
  CONST("const"),
  TIPO("tipo"),
  VAR("var"),
  FIN_ALGORITMO("fin_algoritmo"),
  ABRIR("abrir"),
  CERRAR("cerrar"),
  VECTOR("vector"),
  MATRIZ("matriz"),
  REGISTRO("registro"),
  FIN_REGISTRO("fin_registro"),
  ARCHIVO("archivo de "),
  PRINCIPAL("principal"),
  INICIO("inicio"),
  FIN_INICIO("fin_inicio"),
  ESCRIBIR("escribir"),
  LEER("leer"),
  SI("si"),
  ENTONCES("entonces"),
  FIN_SI("fin_si"),
  MIENTRAS("mientras"),
  HACER("hacer"),
  FIN_MIENTRAS("fin_mientras"),
  REPETIR("repetir"),
  HASTA_QUE("hasta_que"),
  DESDE("desde"),
  HASTA("hasta"),
  FIN_DESDE("fin_desde"),
  CASO("caso"),
  SEGUN_SEA("segun_sea"),
  EN_OTRO_CASO("en_otro_caso"),
  FIN_SEGUN("fin_segun"),
  ENTERO("entero"),
  REAL("real"),
  CADENA("cadena"),
  CARACTER("caracter"),
  LOGICO("logico"),
  VERDADERO("verdadero"),
  FALSO("falso"),
  NO("no"),
  SINO("sino"),
  DEVOLVER("devolver"),
  FUNCION("funcion"),
  FIN_FUNCION("fin_funcion"),
  PROCEDIMIENTO("procedimiento"),
  FIN_PROCEDIMIENTO("fin_procedimiento"),
  E("E"),
  E_S("E/S"),
  S("S"),
  DE("de");

  private final String value;

  private VaryKeyword(String value) {
    this.value = value;
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

  public static String[] keywordValues() {
    VaryKeyword[] keywordsEnum = VaryKeyword.values();
    String[] keywords = new String[keywordsEnum.length];
    for (int i = 0; i < keywords.length; i++) {
      keywords[i] = keywordsEnum[i].getValue();
    }
    return keywords;
  }

}
