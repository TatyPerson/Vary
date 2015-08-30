package org.sonar.vary.parser;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.sonar.sslr.grammar.GrammarRuleKey;
import org.sonar.sslr.grammar.LexerfulGrammarBuilder;
import org.sonar.vary.VaryConfiguration;
import org.sonar.vary.api.VaryKeyword;
import org.sonar.vary.api.VaryPunctuator;

import com.sonar.sslr.api.Grammar;

import static com.sonar.sslr.api.GenericTokenType.IDENTIFIER;
import static com.sonar.sslr.api.GenericTokenType.EOL;
import static org.sonar.vary.api.VaryTokenType.NUMERO;
import static org.sonar.vary.api.VaryTokenType.CADENA;
import static org.sonar.vary.api.VaryTokenType.CARACTER;

public enum VaryGrammarImpl implements GrammarRuleKey {
	 CODIGO,
	 ALGORITMO,
	 MODULO,
	 MODULO_REF,
	 CONSTANTE_REF,
	 TIPO_REF,
	 CABECERA_SUBPROCESO,
	 CABECERA_FUNCION,
	 CABECERA_PROCEDIMIENTO,
	 IMPLEMENTACION,
	 TIPO_COMPLEJO,
	 SUBPROCESO,
	 SENTENCIAS,
	 BLOQUE,
	 DECLARACION,
	 DECLARACION_GLOBAL,
	 FUNCION_FICHERO_ABRIR,
	 FUNCION_FICHERO_CERRAR,
	 MODO_APERTURA,
	 NOMBRE_INTERNA,
	 CAMPO_REGISTRO,
	 TIPO,
	 TIPO_DEFINIDO,
	 TIPO_EXISTENTE,
	 CONSTANTES,
	 VECTOR,
	 MATRIZ,
	 REGISTRO,
	 ARCHIVO,
	 ENUMERADO,
	 SUBRANGO,
	 SUBRANGO_ENUMERADO,
	 SUBRANGO_NUMERICO,
	 INICIO,
	 DECLARACION_VARIABLE,
	 DECLARACION_PROPIA,
	 ASIGNACION,
	 ASIGNACION_NORMAL,
	 ASIGNACION_COMPLEJA,
	 ESCRIBIR,
	 LEER,
	 SI,
	 MIENTRAS,
	 DESDE,
	 SEGUN,
	 REPETIR,
	 CASO,
	 TIPO_VARIABLE,
	 VARIABLE,
	 LOGICO,
	 SIGNO_OR,
	 SIGNO_AND,
	 SIGNO_IGUALDAD,
	 SIGNO_COMPARACION,
	 SIGNO_SUMA,
	 SIGNO_RESTA,
	 SIGNO_MULTIPLICACION,
	 SIGNO_DIVISION,
	 OPERACION,
	 OR,
	 AND,
	 IGUALDAD,
	 COMPARACION,
	 SUMA,
	 RESTA,
	 MULTIPLICACION,
	 DIVISION,
	 PRIMARIA,
	 FUNCIONES,
	 VARIABLES_COMPLEJAS,
	 VARIABLES_BASICAS,
	 SINO,
	 PARAMETRO_FUNCION,
	 FUNCION,
	 PROCEDIMIENTO,
	 TIPO_PASO,
	 VALOR_VECTOR,
	 VALOR_MATRIZ,
	 VALOR_REGISTRO,
	 LLAMADA_FUNCION,
	 DEVOLVER,
	 INTERNAS;
	 
	 public static final Logger LOG = LoggerFactory.getLogger("VaryGrammarImpl");
	 
	 public static Grammar create(VaryConfiguration conf) {
		 LexerfulGrammarBuilder b = LexerfulGrammarBuilder.create();

		 toplevel(b, conf);
		 types(b);
		 expressions(b);
		 statements(b);
		 functions(b);
		 declarations(b);

		 b.setRootRule(CODIGO);

		 return b.buildWithMemoizationOfMatchesForAllRules();
	}
	 
	 private static void toplevel(LexerfulGrammarBuilder b, VaryConfiguration conf) {
		 /*if(conf.getErrorRecoveryEnabled() == true) {*/
			 
			 b.rule(CODIGO).is(
						b.firstOf(ALGORITMO, MODULO)).skipIfOneChild();
			 
			 
			 b.rule(ALGORITMO).is(b.sequence(
					 b.isOneOfThem(VaryKeyword.ALGORITMO, VaryKeyword.ALGORITMO), 
					 IDENTIFIER,
					 b.isOneOfThem(VaryKeyword.IMPORTA, VaryKeyword.IMPORTA),
					 b.zeroOrMore(MODULO_REF),
					 b.isOneOfThem(VaryKeyword.FIN_IMPORTA, VaryKeyword.FIN_IMPORTA),
					 b.isOneOfThem(VaryKeyword.CONST, VaryKeyword.CONST),
					 b.zeroOrMore(CONSTANTES),
					 b.isOneOfThem(VaryKeyword.TIPO, VaryKeyword.TIPO),
					 b.zeroOrMore(TIPO_COMPLEJO), 
					 b.isOneOfThem(VaryKeyword.VAR, VaryKeyword.VAR),
					 b.zeroOrMore(DECLARACION_GLOBAL), 
					 b.zeroOrMore(SUBPROCESO), 
					 INICIO,
					 b.isOneOfThem(VaryKeyword.FIN_ALGORITMO, VaryKeyword.FIN_ALGORITMO)));
			 
			 b.rule(MODULO_REF).is(IDENTIFIER);
			 b.rule(CONSTANTE_REF).is(IDENTIFIER);
			 b.rule(TIPO_REF).is(IDENTIFIER);
			 
			 b.rule(MODULO).is(b.sequence(
					 b.isOneOfThem(VaryKeyword.MODULO, VaryKeyword.MODULO), 
					 IDENTIFIER,
					 b.isOneOfThem(VaryKeyword.IMPORTA, VaryKeyword.IMPORTA), 
					 b.zeroOrMore(MODULO_REF),
					 b.isOneOfThem(VaryKeyword.FIN_IMPORTA, VaryKeyword.FIN_IMPORTA), 
					 b.isOneOfThem(VaryKeyword.EXPORTA, VaryKeyword.EXPORTA), 
					 b.optional(b.isOneOfThem(VaryKeyword.CONST, VaryKeyword.CONST)), 
					 b.zeroOrMore(CONSTANTE_REF),
					 b.optional(b.isOneOfThem(VaryKeyword.TIPO, VaryKeyword.TIPO)), 
					 b.zeroOrMore(TIPO_REF),
					 b.optional(b.isOneOfThem(VaryKeyword.VAR, VaryKeyword.VAR)), 
					 b.zeroOrMore(DECLARACION),
					 b.zeroOrMore(CABECERA_SUBPROCESO),
					 b.isOneOfThem(VaryKeyword.FIN_EXPORTA, VaryKeyword.FIN_EXPORTA), 
					 IMPLEMENTACION,
					 b.isOneOfThem(VaryKeyword.FIN_MODULO, VaryKeyword.FIN_MODULO)));
			 
		 /*}
		 else {

			 b.rule(CODIGO).is(
						b.firstOf(ALGORITMO, MODULO)).skipIfOneChild();
			 
			 
			 b.rule(ALGORITMO).is(b.sequence(
					 VaryKeyword.ALGORITMO.getValue(), 
					 IDENTIFIER,
					 VaryKeyword.IMPORTA.getValue(),
					 b.zeroOrMore(MODULO_REF),
					 VaryKeyword.FIN_IMPORTA.getValue(),
					 VaryKeyword.CONST.getValue(),
					 b.zeroOrMore(CONSTANTES),
					 VaryKeyword.TIPO.getValue(),
					 b.zeroOrMore(TIPO_COMPLEJO), 
					 VaryKeyword.VAR.getValue(),
					 b.zeroOrMore(DECLARACION_GLOBAL), 
					 b.zeroOrMore(SUBPROCESO), 
					 INICIO,
					 VaryKeyword.FIN_ALGORITMO.getValue()));	
			 
			 b.rule(MODULO_REF).is(IDENTIFIER);
			 b.rule(CONSTANTE_REF).is(IDENTIFIER);
			 b.rule(TIPO_REF).is(IDENTIFIER);
			 
			 b.rule(MODULO).is(b.sequence(
					 VaryKeyword.MODULO.getValue(),
					 IDENTIFIER,
					 VaryKeyword.IMPORTA.getValue(),
					 b.zeroOrMore(MODULO_REF),
					 VaryKeyword.FIN_IMPORTA.getValue(),
					 VaryKeyword.EXPORTA.getValue(),
					 VaryKeyword.CONST.getValue(),
					 b.zeroOrMore(CONSTANTE_REF),
					 VaryKeyword.TIPO.getValue(),
					 b.zeroOrMore(TIPO_REF),
					 VaryKeyword.VAR.getValue(),
					 b.zeroOrMore(DECLARACION_GLOBAL),
					 b.zeroOrMore(CABECERA_SUBPROCESO),
					 VaryKeyword.FIN_EXPORTA.getValue(),
					 IMPLEMENTACION,
					 VaryKeyword.FIN_MODULO.getValue()));	
		 }*/
	 }
	 
	 private static void types(LexerfulGrammarBuilder b) {
		 //b.rule(CADENA).is(VaryTokenType.CADENA);
		 b.rule(LOGICO).is((b.isOneOfThem(VaryKeyword.VERDADERO, VaryKeyword.FALSO)));
		 //b.rule(CARACTER).is(VaryTokenType.CARACTER);
		 //b.rule(NUMERO).is(VaryTokenType.NUMERO);
		 //b.rule(REAL).is(VaryTokenType.NUMERO.getValue()); 
		 
		 b.rule(TIPO_COMPLEJO).is(
				 b.firstOf(VECTOR, MATRIZ, REGISTRO, ARCHIVO, ENUMERADO, SUBRANGO)).skipIfOneChild();
		 
		 b.rule(VECTOR).is(
				 b.sequence(VaryKeyword.VECTOR.getValue(),
						 b.isOneOfThem(VaryPunctuator.CORCHETE_IZQ, VaryPunctuator.CORCHETE_IZQ), 
						 PRIMARIA,
						 b.isOneOfThem(VaryPunctuator.CORCHETE_DER, VaryPunctuator.CORCHETE_DER),
						 b.isOneOfThem(VaryKeyword.DE, VaryKeyword.DE),
						 TIPO,
						 b.isOneOfThem(VaryPunctuator.DOS_PUNTOS, VaryPunctuator.DOS_PUNTOS),
						 IDENTIFIER));
		 
		 b.rule(MATRIZ).is(
				 b.sequence(VaryKeyword.MATRIZ.getValue(),
						 b.isOneOfThem(VaryPunctuator.CORCHETE_IZQ, VaryPunctuator.CORCHETE_IZQ),
						 PRIMARIA,
						 b.isOneOfThem(VaryPunctuator.CORCHETE_DER, VaryPunctuator.CORCHETE_DER),
						 b.isOneOfThem(VaryPunctuator.CORCHETE_IZQ, VaryPunctuator.CORCHETE_IZQ),
						 PRIMARIA,
						 b.isOneOfThem(VaryPunctuator.CORCHETE_DER, VaryPunctuator.CORCHETE_DER),
						 b.isOneOfThem(VaryKeyword.DE, VaryKeyword.DE),
						 TIPO,
						 b.isOneOfThem(VaryPunctuator.DOS_PUNTOS, VaryPunctuator.DOS_PUNTOS),
						 IDENTIFIER));
		 
		 b.rule(REGISTRO).is(
				 b.sequence(b.isOneOfThem(VaryKeyword.REGISTRO, VaryKeyword.REGISTRO),
						 b.isOneOfThem(VaryPunctuator.DOS_PUNTOS, VaryPunctuator.DOS_PUNTOS),
						 IDENTIFIER,
						 b.oneOrMore(DECLARACION),
						 b.isOneOfThem(VaryKeyword.FIN_REGISTRO, VaryKeyword.FIN_REGISTRO)));
		 
		 b.rule(ARCHIVO).is(
				 b.sequence(b.isOneOfThem(VaryKeyword.ARCHIVO, VaryKeyword.ARCHIVO),
						 TIPO,
						 b.isOneOfThem(VaryPunctuator.DOS_PUNTOS, VaryPunctuator.DOS_PUNTOS),
						 IDENTIFIER));
		 
		 b.rule(ENUMERADO).is(
				 b.sequence(IDENTIFIER,
						 b.isOneOfThem(VaryPunctuator.IGUAL, VaryPunctuator.IGUAL),
						 b.isOneOfThem(VaryPunctuator.LLAVE_IZQ, VaryPunctuator.LLAVE_IZQ),
						 PRIMARIA,
						 b.oneOrMore(b.isOneOfThem(VaryPunctuator.COMA, VaryPunctuator.COMA), PRIMARIA),
						 b.isOneOfThem(VaryPunctuator.CORCHETE_DER, VaryPunctuator.CORCHETE_DER)));
		 
		 b.rule(SUBRANGO).is(
				 b.firstOf(SUBRANGO_ENUMERADO, SUBRANGO_NUMERICO)).skipIfOneChild();
		 
		 b.rule(SUBRANGO_NUMERICO).is(
				 b.sequence(IDENTIFIER,
						 b.isOneOfThem(VaryPunctuator.IGUAL, VaryPunctuator.IGUAL),
						 b.isOneOfThem(NUMERO, NUMERO),
						 b.isOneOfThem(VaryPunctuator.PUNTOS_SUSPENSIVOS, VaryPunctuator.PUNTOS_SUSPENSIVOS),
						 b.isOneOfThem(NUMERO, NUMERO)));
		 
		 b.rule(SUBRANGO_ENUMERADO).is(
				 b.sequence(IDENTIFIER,
						 b.isOneOfThem(VaryPunctuator.IGUAL, VaryPunctuator.IGUAL),
						 IDENTIFIER,
						 b.isOneOfThem(VaryPunctuator.PUNTOS_SUSPENSIVOS, VaryPunctuator.PUNTOS_SUSPENSIVOS),
						 IDENTIFIER));
		 
		 b.rule(TIPO).is(
				 b.firstOf(TIPO_DEFINIDO, TIPO_EXISTENTE)).skipIfOneChild();
		 
		 b.rule(TIPO_DEFINIDO).is(IDENTIFIER);
		 
		 b.rule(TIPO_EXISTENTE).is(TIPO_VARIABLE);
		 
		 b.rule(CABECERA_SUBPROCESO).is(b.firstOf(CABECERA_FUNCION, CABECERA_PROCEDIMIENTO)).skipIfOneChild();
		 
		 b.rule(CABECERA_FUNCION).is(TIPO_VARIABLE,
				    b.isOneOfThem(VaryKeyword.FUNCION, VaryKeyword.FUNCION),
					IDENTIFIER,
					b.isOneOfThem(VaryPunctuator.PARENTESIS_IZQ, VaryPunctuator.PARENTESIS_IZQ),
					b.zeroOrMore(b.firstOf(PARAMETRO_FUNCION, b.sequence(b.isOneOfThem(VaryPunctuator.COMA, VaryPunctuator.COMA), PARAMETRO_FUNCION))),
					b.isOneOfThem(VaryPunctuator.PARENTESIS_DER, VaryPunctuator.PARENTESIS_DER));
		 
		 b.rule(CABECERA_PROCEDIMIENTO).is(b.sequence(b.isOneOfThem(VaryKeyword.PROCEDIMIENTO, VaryKeyword.PROCEDIMIENTO),
					IDENTIFIER,
					b.isOneOfThem(VaryPunctuator.PARENTESIS_IZQ, VaryPunctuator.PARENTESIS_IZQ),
					b.zeroOrMore(b.firstOf(PARAMETRO_FUNCION, b.sequence(b.isOneOfThem(VaryPunctuator.COMA, VaryPunctuator.COMA), PARAMETRO_FUNCION))),
					b.isOneOfThem(VaryPunctuator.PARENTESIS_DER, VaryPunctuator.PARENTESIS_DER)));
						 
	 }
	 
	 private static void expressions(LexerfulGrammarBuilder b) {
		 
		 b.rule(PRIMARIA).is(
				 b.firstOf(//b.sequence(b.isOneOfThem(VaryPunctuator.PARENTESIS_DER, VaryPunctuator.PARENTESIS_DER), OPERACION, b.isOneOfThem(VaryPunctuator.PARENTESIS_IZQ, VaryPunctuator.PARENTESIS_IZQ)),
						 FUNCIONES,
						 VARIABLES_COMPLEJAS,
						 VARIABLES_BASICAS,
						 b.sequence("-(", OPERACION, b.isOneOfThem(VaryPunctuator.PARENTESIS_DER, VaryPunctuator.PARENTESIS_DER)),
						 b.sequence("no(", OPERACION, b.isOneOfThem(VaryPunctuator.PARENTESIS_DER, VaryPunctuator.PARENTESIS_DER)))).skipIfOneChild();
		 
		 b.rule(OPERACION).is(DIVISION);
		 
		 b.rule(OR).is(
				 b.oneOrMore(b.sequence(PRIMARIA,  b.zeroOrMore(SIGNO_OR, PRIMARIA)))).skipIfOneChild();
		 
		 b.rule(SIGNO_OR).is(b.isOneOfThem(VaryPunctuator.O, VaryPunctuator.O));
		 
		 b.rule(AND).is(
				 b.oneOrMore(b.sequence(OR,  b.zeroOrMore(SIGNO_AND, OR)))).skipIfOneChild();
		 
		 b.rule(SIGNO_AND).is(b.isOneOfThem(VaryPunctuator.Y, VaryPunctuator.Y));
		 
		 b.rule(IGUALDAD).is(
				 b.oneOrMore(b.sequence(AND,  b.zeroOrMore(SIGNO_IGUALDAD, AND)))).skipIfOneChild();
		 
		 b.rule(SIGNO_IGUALDAD).is(b.isOneOfThem(VaryPunctuator.IGUAL, VaryPunctuator.DISTINTO));
		 
		 b.rule(COMPARACION).is(
				 b.oneOrMore(b.sequence(IGUALDAD,  b.zeroOrMore(SIGNO_COMPARACION, IGUALDAD)))).skipIfOneChild();
		 
		 b.rule(SIGNO_COMPARACION).is(b.isOneOfThem(VaryPunctuator.MENOR, VaryPunctuator.MAYOR, VaryPunctuator.MENOR_IGUAL, VaryPunctuator.MAYOR_IGUAL));
		 
		 b.rule(SUMA).is(b.oneOrMore(b.sequence(COMPARACION,  b.zeroOrMore(SIGNO_SUMA, COMPARACION))));

		 b.rule(RESTA).is(b.oneOrMore(b.sequence(SUMA,  b.zeroOrMore(SIGNO_RESTA, SUMA))));
		 
		 
		 b.rule(SIGNO_SUMA).is(b.isOneOfThem(VaryPunctuator.SUMA, VaryPunctuator.SUMA));
		 b.rule(SIGNO_RESTA).is(b.isOneOfThem(VaryPunctuator.RESTA, VaryPunctuator.RESTA));
		 
		 b.rule(MULTIPLICACION).is(b.oneOrMore(b.sequence(RESTA,  b.zeroOrMore(SIGNO_MULTIPLICACION, RESTA))));
				 
		 b.rule(DIVISION).is(b.oneOrMore(b.sequence(MULTIPLICACION,  b.zeroOrMore(SIGNO_DIVISION, MULTIPLICACION))));
		 
		 b.rule(SIGNO_MULTIPLICACION).is(b.isOneOfThem(VaryPunctuator.MULTIPLICACION, VaryPunctuator.MULTIPLICACION));
		 b.rule(SIGNO_DIVISION).is(b.isOneOfThem(VaryPunctuator.DIVISION, VaryPunctuator.DIVISION));
		 
		 b.rule(VARIABLES_BASICAS).is(b.firstOf(
				 IDENTIFIER,
				 b.isOneOfThem(NUMERO, CADENA, CARACTER),
				 LOGICO));
		 
		 b.rule(VARIABLES_COMPLEJAS).is(b.firstOf(
				 VALOR_MATRIZ,
				 VALOR_VECTOR,
				 VALOR_REGISTRO
				 ));
		 
		 b.rule(VALOR_VECTOR).is(
				 b.sequence(IDENTIFIER, b.isOneOfThem(VaryPunctuator.CORCHETE_IZQ, VaryPunctuator.CORCHETE_IZQ), VARIABLES_BASICAS, b.isOneOfThem(VaryPunctuator.CORCHETE_DER, VaryPunctuator.CORCHETE_DER), b.zeroOrMore(b.sequence(b.isOneOfThem(VaryPunctuator.PUNTO, VaryPunctuator.PUNTO), CAMPO_REGISTRO))));
		 
		 b.rule(VALOR_MATRIZ).is(
				 b.sequence(IDENTIFIER, b.isOneOfThem(VaryPunctuator.CORCHETE_IZQ, VaryPunctuator.CORCHETE_IZQ), VARIABLES_BASICAS, b.isOneOfThem(VaryPunctuator.CORCHETE_DER, VaryPunctuator.CORCHETE_DER),
						 b.isOneOfThem(VaryPunctuator.CORCHETE_IZQ, VaryPunctuator.CORCHETE_IZQ), VARIABLES_BASICAS, b.isOneOfThem(VaryPunctuator.CORCHETE_DER, VaryPunctuator.CORCHETE_DER), b.zeroOrMore(b.sequence(b.isOneOfThem(VaryPunctuator.PUNTO, VaryPunctuator.PUNTO), CAMPO_REGISTRO))));
		 
		 b.rule(VALOR_REGISTRO).is(
				 b.sequence(IDENTIFIER, b.oneOrMore(b.sequence(b.isOneOfThem(VaryPunctuator.PUNTO, VaryPunctuator.PUNTO), CAMPO_REGISTRO))));
		 
		 
		 b.rule(CAMPO_REGISTRO).is(IDENTIFIER);
		 
		 b.rule(FUNCIONES).is(b.firstOf(
				 LLAMADA_FUNCION,
				 INTERNAS)).skipIfOneChild();
		 
		 b.rule(LLAMADA_FUNCION).is(
				 b.sequence(IDENTIFIER, 
				 b.isOneOfThem(VaryPunctuator.PARENTESIS_IZQ, VaryPunctuator.PARENTESIS_IZQ), 
				 b.optional(b.sequence(OPERACION, b.zeroOrMore(b.sequence(b.isOneOfThem(VaryPunctuator.COMA, VaryPunctuator.COMA), OPERACION)))),
				 b.isOneOfThem(VaryPunctuator.PARENTESIS_DER, VaryPunctuator.PARENTESIS_DER)));
		 
		 b.rule(INTERNAS).is(
				 b.sequence(NOMBRE_INTERNA, b.isOneOfThem(VaryPunctuator.PARENTESIS_IZQ, VaryPunctuator.PARENTESIS_IZQ), b.sequence(OPERACION, b.zeroOrMore(b.sequence(b.isOneOfThem(VaryPunctuator.COMA, VaryPunctuator.COMA), OPERACION), b.isOneOfThem(VaryPunctuator.PARENTESIS_DER, VaryPunctuator.PARENTESIS_DER)))));
		 
		 b.rule(NOMBRE_INTERNA).is(b.firstOf("cos", "cuadrado", "exp", "ln", "log", "sen", "sqrt", "longitud", "concatena")).skipIfOneChild();
		 
		 b.rule(DEVOLVER).is(b.sequence(b.isOneOfThem(VaryKeyword.DEVOLVER, VaryKeyword.DEVOLVER), OPERACION));
		  
	 }	 
	 
	 public static void statements(LexerfulGrammarBuilder b) {
		 b.rule(SENTENCIAS).is(
				 b.firstOf(
						 ASIGNACION_NORMAL,
						 ASIGNACION_COMPLEJA,
						 ESCRIBIR,
						 LEER,
						 BLOQUE,
						 FUNCION_FICHERO_ABRIR,
						 FUNCION_FICHERO_CERRAR,
						 FUNCIONES)).skipIfOneChild();
		 
		 b.rule(ESCRIBIR).is(b.firstOf(
				 b.sequence(b.isOneOfThem(VaryKeyword.ESCRIBIR, VaryKeyword.ESCRIBIR), b.isOneOfThem(VaryPunctuator.PARENTESIS_IZQ, VaryPunctuator.PARENTESIS_IZQ), PRIMARIA, b.optional(b.oneOrMore(b.isOneOfThem(VaryPunctuator.COMA, VaryPunctuator.COMA), OPERACION)), b.isOneOfThem(VaryPunctuator.PARENTESIS_DER, VaryPunctuator.PARENTESIS_DER)),
				 b.sequence(b.isOneOfThem(VaryKeyword.ESCRIBIR, VaryKeyword.ESCRIBIR), b.isOneOfThem(VaryPunctuator.PARENTESIS_IZQ, VaryPunctuator.PARENTESIS_IZQ), PRIMARIA, b.optional(b.oneOrMore(b.isOneOfThem(VaryPunctuator.COMA, VaryPunctuator.COMA), PRIMARIA)), b.isOneOfThem(VaryPunctuator.PARENTESIS_DER, VaryPunctuator.PARENTESIS_DER)))).skipIfOneChild();
		 
		 b.rule(LEER).is(
				 b.sequence(b.isOneOfThem(VaryKeyword.LEER, VaryKeyword.LEER), b.isOneOfThem(VaryPunctuator.PARENTESIS_IZQ, VaryPunctuator.PARENTESIS_IZQ), PRIMARIA, b.isOneOfThem(VaryPunctuator.PARENTESIS_DER, VaryPunctuator.PARENTESIS_DER)));
		 
		 b.rule(BLOQUE).is(b.firstOf(
				 SI,
				 MIENTRAS,
				 REPETIR,
				 DESDE,
				 SEGUN)).skipIfOneChild();
		 
		 b.rule(SI).is(
				 b.sequence(b.isOneOfThem(VaryKeyword.SI, VaryKeyword.SI), 
						 OPERACION,
						 b.isOneOfThem(VaryKeyword.ENTONCES, VaryKeyword.ENTONCES),
						 b.zeroOrMore(SENTENCIAS),
						 b.zeroOrMore(DEVOLVER),
						 b.zeroOrMore(SINO),
						 b.isOneOfThem(VaryKeyword.FIN_SI, VaryKeyword.FIN_SI)));
		 
		 b.rule(SINO).is(
				 b.sequence(b.isOneOfThem(VaryKeyword.SINO, VaryKeyword.SINO),
						 b.zeroOrMore(SENTENCIAS),
						 b.zeroOrMore(DEVOLVER)));
		 
		 b.rule(MIENTRAS).is(
				 b.sequence(b.isOneOfThem(VaryKeyword.MIENTRAS, VaryKeyword.MIENTRAS),
						 OPERACION,
						 b.isOneOfThem(VaryKeyword.HACER, VaryKeyword.HACER),
						 b.zeroOrMore(SENTENCIAS),
						 b.isOneOfThem(VaryKeyword.FIN_MIENTRAS, VaryKeyword.FIN_MIENTRAS)));
		 
		 b.rule(REPETIR).is(
				 b.sequence(b.isOneOfThem(VaryKeyword.REPETIR, VaryKeyword.REPETIR),
						 b.zeroOrMore(SENTENCIAS),
						 b.isOneOfThem(VaryKeyword.HASTA_QUE, VaryKeyword.HASTA_QUE),
						 OPERACION));
		 
		 b.rule(DESDE).is(
				 b.sequence(b.isOneOfThem(VaryKeyword.DESDE, VaryKeyword.DESDE),
						 ASIGNACION_NORMAL,
						 b.isOneOfThem(VaryKeyword.HASTA, VaryKeyword.HASTA),
						 OPERACION,
						 b.isOneOfThem(VaryKeyword.HACER, VaryKeyword.HACER),
						 b.zeroOrMore(SENTENCIAS),
						 b.isOneOfThem(VaryKeyword.FIN_DESDE, VaryKeyword.FIN_DESDE)));
		 
		 b.rule(SEGUN).is(
				 b.sequence(b.isOneOfThem(VaryKeyword.SEGUN_SEA, VaryKeyword.SEGUN_SEA),
						 b.isOneOfThem(VaryPunctuator.PARENTESIS_IZQ, VaryPunctuator.PARENTESIS_IZQ),
						 PRIMARIA,
						 b.isOneOfThem(VaryPunctuator.PARENTESIS_DER, VaryPunctuator.PARENTESIS_DER),
						 b.isOneOfThem(VaryKeyword.HACER, VaryKeyword.HACER),
						 b.zeroOrMore(CASO),
						 b.isOneOfThem(VaryKeyword.EN_OTRO_CASO, VaryKeyword.EN_OTRO_CASO),
						 b.isOneOfThem(VaryPunctuator.DOS_PUNTOS, VaryPunctuator.DOS_PUNTOS),
						 b.zeroOrMore(SENTENCIAS),
						 b.zeroOrMore(DEVOLVER),
						 b.isOneOfThem(VaryKeyword.FIN_SEGUN, VaryKeyword.FIN_SEGUN)));
		 
		 b.rule(CASO).is(
				 b.sequence(b.isOneOfThem(VaryKeyword.CASO, VaryKeyword.CASO),
						 PRIMARIA,
						 b.isOneOfThem(VaryPunctuator.DOS_PUNTOS, VaryPunctuator.DOS_PUNTOS),
						 b.zeroOrMore(SENTENCIAS),
						 b.zeroOrMore(DEVOLVER)));
		 
		 b.rule(FUNCION_FICHERO_ABRIR).is(
				 b.sequence(b.isOneOfThem(VaryKeyword.ABRIR, VaryKeyword.ABRIR),
						 b.isOneOfThem(VaryPunctuator.PARENTESIS_IZQ, VaryPunctuator.PARENTESIS_IZQ),
						 PRIMARIA,
						 b.isOneOfThem(VaryPunctuator.COMA, VaryPunctuator.COMA),
						 MODO_APERTURA,
						 b.isOneOfThem(VaryPunctuator.COMA, VaryPunctuator.COMA),
						 PRIMARIA,
						 b.isOneOfThem(VaryPunctuator.PARENTESIS_DER, VaryPunctuator.PARENTESIS_DER)));
		 
		 b.rule(MODO_APERTURA).is(
				 b.firstOf("escritura", "lectura")).skipIfOneChild();
		 
		 b.rule(FUNCION_FICHERO_CERRAR).is(
				 b.sequence(b.isOneOfThem(VaryKeyword.CERRAR, VaryKeyword.CERRAR),
						 b.isOneOfThem(VaryPunctuator.PARENTESIS_IZQ, VaryPunctuator.PARENTESIS_IZQ),
						 PRIMARIA,
						 b.isOneOfThem(VaryPunctuator.PARENTESIS_DER, VaryPunctuator.PARENTESIS_DER)));
		 
		 b.rule(ASIGNACION).is(
				 b.firstOf(ASIGNACION_NORMAL, ASIGNACION_COMPLEJA));
		 
		 b.rule(ASIGNACION_NORMAL).is(
				 b.sequence(IDENTIFIER,
						 b.isOneOfThem(VaryPunctuator.ASIGNACION, VaryPunctuator.ASIGNACION),
						 OPERACION));
		 
		 b.rule(ASIGNACION_COMPLEJA).is(
				 b.sequence(VARIABLES_COMPLEJAS,
						 b.isOneOfThem(VaryPunctuator.ASIGNACION, VaryPunctuator.ASIGNACION),
						 OPERACION));	 
	 }
	 
	public static void functions(LexerfulGrammarBuilder b) {
		
		b.rule(SUBPROCESO).is(
				b.firstOf(FUNCION, PROCEDIMIENTO)).skipIfOneChild();
		
		b.rule(FUNCION).is(
				b.sequence(TIPO_VARIABLE,
						b.isOneOfThem(VaryKeyword.FUNCION, VaryKeyword.FUNCION),
						IDENTIFIER,
						b.isOneOfThem(VaryPunctuator.PARENTESIS_IZQ, VaryPunctuator.PARENTESIS_IZQ),
						b.zeroOrMore(b.firstOf(PARAMETRO_FUNCION, b.sequence(b.isOneOfThem(VaryPunctuator.COMA, VaryPunctuator.COMA), PARAMETRO_FUNCION))),
						b.isOneOfThem(VaryPunctuator.PARENTESIS_DER, VaryPunctuator.PARENTESIS_DER),
						b.optional(b.isOneOfThem(VaryKeyword.CONST, VaryKeyword.CONST)),
						b.optional(b.isOneOfThem(VaryKeyword.TIPO, VaryKeyword.TIPO)),
						b.isOneOfThem(VaryKeyword.VAR, VaryKeyword.VAR),
						b.zeroOrMore(DECLARACION),
						b.isOneOfThem(VaryKeyword.INICIO, VaryKeyword.INICIO),
						b.zeroOrMore(SENTENCIAS),
						DEVOLVER,
						b.isOneOfThem(VaryKeyword.FIN_FUNCION, VaryKeyword.FIN_FUNCION)));
		
		b.rule(PROCEDIMIENTO).is(
				b.sequence(b.isOneOfThem(VaryKeyword.PROCEDIMIENTO, VaryKeyword.PROCEDIMIENTO),
						IDENTIFIER,
						b.isOneOfThem(VaryPunctuator.PARENTESIS_IZQ, VaryPunctuator.PARENTESIS_IZQ),
						b.zeroOrMore(b.firstOf(PARAMETRO_FUNCION, b.sequence(b.isOneOfThem(VaryPunctuator.COMA, VaryPunctuator.COMA), PARAMETRO_FUNCION))),
						b.isOneOfThem(VaryPunctuator.PARENTESIS_DER, VaryPunctuator.PARENTESIS_DER),
						b.optional(b.isOneOfThem(VaryKeyword.CONST, VaryKeyword.CONST)),
						b.optional(b.isOneOfThem(VaryKeyword.TIPO, VaryKeyword.TIPO)),
						b.isOneOfThem(VaryKeyword.VAR, VaryKeyword.VAR),
						b.zeroOrMore(DECLARACION),
						b.isOneOfThem(VaryKeyword.INICIO, VaryKeyword.INICIO),
						b.zeroOrMore(SENTENCIAS),
						b.isOneOfThem(VaryKeyword.FIN_PROCEDIMIENTO, VaryKeyword.FIN_PROCEDIMIENTO)));
		
		b.rule(PARAMETRO_FUNCION).is(
				b.sequence(TIPO_PASO,
						TIPO,
						b.isOneOfThem(VaryPunctuator.DOS_PUNTOS, VaryPunctuator.DOS_PUNTOS),
						VARIABLE));
		
		b.rule(VARIABLE).is(IDENTIFIER);
		
		b.rule(TIPO_PASO).is(
				b.firstOf("E", "E/S", "S")).skipIfOneChild();
		
		b.rule(INICIO).is(
				b.sequence(b.isOneOfThem(VaryKeyword.PRINCIPAL, VaryKeyword.PRINCIPAL),
						b.isOneOfThem(VaryKeyword.VAR, VaryKeyword.VAR),
						b.zeroOrMore(DECLARACION),
						b.isOneOfThem(VaryKeyword.INICIO, VaryKeyword.INICIO),
						b.zeroOrMore(SENTENCIAS),
						b.isOneOfThem(VaryKeyword.FIN_INICIO, VaryKeyword.FIN_INICIO)));
		
		b.rule(IMPLEMENTACION).is(b.sequence(b.isOneOfThem(VaryKeyword.IMPLEMENTACION, VaryKeyword.IMPLEMENTACION),
				b.optional(b.isOneOfThem(VaryKeyword.CONST, VaryKeyword.CONST)),
				b.zeroOrMore(CONSTANTES),
				b.optional(b.isOneOfThem(VaryKeyword.TIPO, VaryKeyword.TIPO)),
				b.zeroOrMore(TIPO_COMPLEJO),
				b.optional(b.isOneOfThem(VaryKeyword.VAR, VaryKeyword.VAR)),
				b.zeroOrMore(DECLARACION_GLOBAL),
				b.zeroOrMore(SUBPROCESO),
				b.isOneOfThem(VaryKeyword.FIN_IMPLEMENTACION, VaryKeyword.FIN_IMPLEMENTACION)));
		
	}
	
	public static void declarations(LexerfulGrammarBuilder b) {
		
		b.rule(DECLARACION_GLOBAL).is(DECLARACION);
		
		b.rule(DECLARACION).is(
				b.firstOf(DECLARACION_VARIABLE, DECLARACION_PROPIA)).skipIfOneChild();
		
		b.rule(DECLARACION_VARIABLE).is(
				b.sequence(TIPO_VARIABLE,
						b.isOneOfThem(VaryPunctuator.DOS_PUNTOS, VaryPunctuator.DOS_PUNTOS),
						VARIABLE,
						b.zeroOrMore(b.isOneOfThem(VaryPunctuator.COMA, VaryPunctuator.COMA), VARIABLE)));
		
		b.rule(DECLARACION_PROPIA).is(
				b.sequence(IDENTIFIER,
						b.isOneOfThem(VaryPunctuator.DOS_PUNTOS, VaryPunctuator.DOS_PUNTOS),
						VARIABLE,
						b.zeroOrMore(b.isOneOfThem(VaryPunctuator.COMA, VaryPunctuator.COMA), VARIABLE)));
		
		b.rule(TIPO_VARIABLE).is(
				b.firstOf("entero", "logico", "real", "caracter", "cadena")).skipIfOneChild();
		
		b.rule(CONSTANTES).is(
				b.sequence(VARIABLE,
						b.isOneOfThem(VaryPunctuator.IGUAL, VaryPunctuator.IGUAL),
						PRIMARIA));
	}
	 
}
