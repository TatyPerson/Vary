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
	 INTERNAS,
	 SIGNO_OP;
	 
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
					 b.isOneOfThem(VaryKeyword.ALGORITMO, VaryKeyword.ALGORITHM), 
					 IDENTIFIER,
					 b.isOneOfThem(VaryKeyword.IMPORTA, VaryKeyword.IMPORT),
					 b.zeroOrMore(MODULO_REF),
					 b.isOneOfThem(VaryKeyword.FIN_IMPORTA, VaryKeyword.END_IMPORT),
					 b.isOneOfThem(VaryKeyword.CONST, VaryKeyword.CONST),
					 b.zeroOrMore(CONSTANTES),
					 b.isOneOfThem(VaryKeyword.TIPO, VaryKeyword.TYPE),
					 b.zeroOrMore(TIPO_COMPLEJO), 
					 b.isOneOfThem(VaryKeyword.VAR, VaryKeyword.VAR),
					 b.zeroOrMore(DECLARACION_GLOBAL), 
					 b.zeroOrMore(SUBPROCESO), 
					 INICIO,
					 b.isOneOfThem(VaryKeyword.FIN_ALGORITMO, VaryKeyword.END_ALGORITHM)));
			 
			 b.rule(MODULO_REF).is(IDENTIFIER);
			 b.rule(CONSTANTE_REF).is(IDENTIFIER);
			 b.rule(TIPO_REF).is(IDENTIFIER);
			 
			 b.rule(MODULO).is(b.sequence(
					 b.isOneOfThem(VaryKeyword.MODULO, VaryKeyword.MODULE), 
					 IDENTIFIER,
					 b.isOneOfThem(VaryKeyword.IMPORTA, VaryKeyword.IMPORT), 
					 b.zeroOrMore(MODULO_REF),
					 b.isOneOfThem(VaryKeyword.FIN_IMPORTA, VaryKeyword.END_IMPORT), 
					 b.isOneOfThem(VaryKeyword.EXPORTA, VaryKeyword.EXPORT), 
					 b.optional(b.isOneOfThem(VaryKeyword.CONST, VaryKeyword.CONST)), 
					 b.zeroOrMore(CONSTANTE_REF),
					 b.optional(b.isOneOfThem(VaryKeyword.TIPO, VaryKeyword.TYPE)), 
					 b.zeroOrMore(TIPO_REF),
					 b.optional(b.isOneOfThem(VaryKeyword.VAR, VaryKeyword.VAR)), 
					 b.zeroOrMore(DECLARACION),
					 b.zeroOrMore(CABECERA_SUBPROCESO),
					 b.isOneOfThem(VaryKeyword.FIN_EXPORTA, VaryKeyword.END_EXPORT), 
					 IMPLEMENTACION,
					 b.isOneOfThem(VaryKeyword.FIN_MODULO, VaryKeyword.END_MODULE)));
	 }
	 
	 private static void types(LexerfulGrammarBuilder b) {
		 
		 b.rule(LOGICO).is((b.isOneOfThem(VaryKeyword.VERDADERO, VaryKeyword.TRUE, VaryKeyword.FALSO, VaryKeyword.FALSE)));

		 b.rule(TIPO_COMPLEJO).is(
				 b.firstOf(VECTOR, MATRIZ, REGISTRO, ARCHIVO, ENUMERADO, SUBRANGO)).skipIfOneChild();
		 
		 b.rule(VECTOR).is(
				 b.sequence(b.isOneOfThem(VaryKeyword.VECTOR, VaryKeyword.VECTOR),
						 b.isOneOfThem(VaryPunctuator.CORCHETE_IZQ, VaryPunctuator.CORCHETE_IZQ), 
						 PRIMARIA,
						 b.isOneOfThem(VaryPunctuator.CORCHETE_DER, VaryPunctuator.CORCHETE_DER),
						 b.isOneOfThem(VaryKeyword.DE, VaryKeyword.OF),
						 TIPO,
						 b.isOneOfThem(VaryPunctuator.DOS_PUNTOS, VaryPunctuator.DOS_PUNTOS),
						 IDENTIFIER));
		 
		 b.rule(MATRIZ).is(
				 b.sequence(b.isOneOfThem(VaryKeyword.MATRIZ, VaryKeyword.MATRIX),
						 b.isOneOfThem(VaryPunctuator.CORCHETE_IZQ, VaryPunctuator.CORCHETE_IZQ),
						 PRIMARIA,
						 b.isOneOfThem(VaryPunctuator.CORCHETE_DER, VaryPunctuator.CORCHETE_DER),
						 b.isOneOfThem(VaryPunctuator.CORCHETE_IZQ, VaryPunctuator.CORCHETE_IZQ),
						 PRIMARIA,
						 b.isOneOfThem(VaryPunctuator.CORCHETE_DER, VaryPunctuator.CORCHETE_DER),
						 b.isOneOfThem(VaryKeyword.DE, VaryKeyword.OF),
						 TIPO,
						 b.isOneOfThem(VaryPunctuator.DOS_PUNTOS, VaryPunctuator.DOS_PUNTOS),
						 IDENTIFIER));
		 
		 b.rule(REGISTRO).is(
				 b.sequence(b.isOneOfThem(VaryKeyword.REGISTRO, VaryKeyword.REGISTRY),
						 b.isOneOfThem(VaryPunctuator.DOS_PUNTOS, VaryPunctuator.DOS_PUNTOS),
						 IDENTIFIER,
						 b.oneOrMore(DECLARACION),
						 b.isOneOfThem(VaryKeyword.FIN_REGISTRO, VaryKeyword.END_REGISTRY)));
		 
		 b.rule(ARCHIVO).is(
				 b.sequence(b.isOneOfThem(VaryKeyword.ARCHIVO, VaryKeyword.ARCHIVE),
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
				    b.isOneOfThem(VaryKeyword.FUNCION, VaryKeyword.FUNCTION),
					IDENTIFIER,
					b.isOneOfThem(VaryPunctuator.PARENTESIS_IZQ, VaryPunctuator.PARENTESIS_IZQ),
					b.zeroOrMore(b.firstOf(PARAMETRO_FUNCION, b.sequence(b.isOneOfThem(VaryPunctuator.COMA, VaryPunctuator.COMA), PARAMETRO_FUNCION))),
					b.isOneOfThem(VaryPunctuator.PARENTESIS_DER, VaryPunctuator.PARENTESIS_DER));
		 
		 b.rule(CABECERA_PROCEDIMIENTO).is(b.sequence(b.isOneOfThem(VaryKeyword.PROCEDIMIENTO, VaryKeyword.PROCEDURE),
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
						 b.sequence("no(", OPERACION, b.isOneOfThem(VaryPunctuator.PARENTESIS_DER, VaryPunctuator.PARENTESIS_DER)),
						 b.sequence("not(", OPERACION, b.isOneOfThem(VaryPunctuator.PARENTESIS_DER, VaryPunctuator.PARENTESIS_DER))));

		 
		 b.rule(SIGNO_OP).is(b.firstOf(
				 SIGNO_OR,
				 SIGNO_AND,
				 SIGNO_IGUALDAD,
				 SIGNO_SUMA,
				 SIGNO_RESTA,
				 SIGNO_MULTIPLICACION,
				 SIGNO_DIVISION));
		 
		 b.rule(SIGNO_OR).is(b.isOneOfThem(VaryPunctuator.O, VaryPunctuator.OR));
		 b.rule(SIGNO_AND).is(b.isOneOfThem(VaryPunctuator.Y, VaryPunctuator.AND));
		 b.rule(SIGNO_IGUALDAD).is(b.isOneOfThem(VaryPunctuator.IGUAL, VaryPunctuator.DISTINTO));
		 b.rule(SIGNO_COMPARACION).is(b.isOneOfThem(VaryPunctuator.MENOR, VaryPunctuator.MAYOR, VaryPunctuator.MENOR_IGUAL, VaryPunctuator.MAYOR_IGUAL));
		 b.rule(SIGNO_SUMA).is(b.isOneOfThem(VaryPunctuator.SUMA, VaryPunctuator.SUMA));
		 b.rule(SIGNO_RESTA).is(b.isOneOfThem(VaryPunctuator.RESTA, VaryPunctuator.RESTA));
		 b.rule(SIGNO_MULTIPLICACION).is(b.isOneOfThem(VaryPunctuator.MULTIPLICACION, VaryPunctuator.MULTIPLICACION));
		 b.rule(SIGNO_DIVISION).is(b.isOneOfThem(VaryPunctuator.DIVISION, VaryPunctuator.DIVISION));
		 
		 b.rule(OPERACION).is(DIVISION);
		 
		 b.rule(OR).is(
				 b.oneOrMore(b.sequence(b.firstOf(ASIGNACION, PRIMARIA),  b.zeroOrMore(SIGNO_OR, PRIMARIA))));
		 
		 b.rule(AND).is(
				 b.oneOrMore(b.sequence(OR,  b.zeroOrMore(SIGNO_AND, OR))));
		 
		 b.rule(IGUALDAD).is(
				 b.oneOrMore(b.sequence(AND,  b.zeroOrMore(SIGNO_IGUALDAD, AND))));
		 
		 b.rule(COMPARACION).is(
				 b.oneOrMore(b.sequence(IGUALDAD,  b.zeroOrMore(SIGNO_COMPARACION, IGUALDAD))));
		 
		 b.rule(SUMA).is(b.oneOrMore(b.sequence(COMPARACION,  b.zeroOrMore(SIGNO_SUMA, COMPARACION))));

		 b.rule(RESTA).is(b.oneOrMore(b.sequence(SUMA,  b.zeroOrMore(SIGNO_RESTA, SUMA))));
		 
		 b.rule(MULTIPLICACION).is(b.oneOrMore(b.sequence(RESTA,  b.zeroOrMore(SIGNO_MULTIPLICACION, RESTA))));
				 
		 b.rule(DIVISION).is(b.oneOrMore(b.sequence(MULTIPLICACION,  b.zeroOrMore(SIGNO_DIVISION, MULTIPLICACION))));

		 
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
				 b.sequence(IDENTIFIER, b.isOneOfThem(VaryPunctuator.CORCHETE_IZQ, VaryPunctuator.CORCHETE_IZQ), OPERACION, b.isOneOfThem(VaryPunctuator.CORCHETE_DER, VaryPunctuator.CORCHETE_DER), b.zeroOrMore(b.sequence(b.isOneOfThem(VaryPunctuator.PUNTO, VaryPunctuator.PUNTO), CAMPO_REGISTRO))));
		 
		 b.rule(VALOR_MATRIZ).is(
				 b.sequence(IDENTIFIER, b.isOneOfThem(VaryPunctuator.CORCHETE_IZQ, VaryPunctuator.CORCHETE_IZQ), OPERACION, b.isOneOfThem(VaryPunctuator.CORCHETE_DER, VaryPunctuator.CORCHETE_DER),
						 b.isOneOfThem(VaryPunctuator.CORCHETE_IZQ, VaryPunctuator.CORCHETE_IZQ), OPERACION, b.isOneOfThem(VaryPunctuator.CORCHETE_DER, VaryPunctuator.CORCHETE_DER), b.zeroOrMore(b.sequence(b.isOneOfThem(VaryPunctuator.PUNTO, VaryPunctuator.PUNTO), CAMPO_REGISTRO))));
		 
		 b.rule(VALOR_REGISTRO).is(
				 b.sequence(IDENTIFIER, b.oneOrMore(b.sequence(b.isOneOfThem(VaryPunctuator.PUNTO, VaryPunctuator.PUNTO), CAMPO_REGISTRO))));
		 
		 
		 b.rule(CAMPO_REGISTRO).is(IDENTIFIER);
		 
		 b.rule(FUNCIONES).is(b.firstOf(
				 LLAMADA_FUNCION,
				 INTERNAS));
		 
		 b.rule(LLAMADA_FUNCION).is(
				 b.sequence(IDENTIFIER, 
				 b.isOneOfThem(VaryPunctuator.PARENTESIS_IZQ, VaryPunctuator.PARENTESIS_IZQ), 
				 b.optional(b.sequence(OPERACION, b.zeroOrMore(b.sequence(b.isOneOfThem(VaryPunctuator.COMA, VaryPunctuator.COMA), OPERACION)))),
				 b.isOneOfThem(VaryPunctuator.PARENTESIS_DER, VaryPunctuator.PARENTESIS_DER)));
		 
		 b.rule(INTERNAS).is(
				 b.sequence(NOMBRE_INTERNA, b.isOneOfThem(VaryPunctuator.PARENTESIS_IZQ, VaryPunctuator.PARENTESIS_IZQ), b.sequence(OPERACION, b.zeroOrMore(b.sequence(b.isOneOfThem(VaryPunctuator.COMA, VaryPunctuator.COMA), OPERACION), b.isOneOfThem(VaryPunctuator.PARENTESIS_DER, VaryPunctuator.PARENTESIS_DER)))));
		 
		 b.rule(NOMBRE_INTERNA).is(b.firstOf("cos", b.firstOf("cuadrado", "square"), "exp", "ln", "log", "sen", "sqrt", b.firstOf("longitud", "lenght"), "concatena")).skipIfOneChild();
		 
		 b.rule(DEVOLVER).is(b.sequence(b.isOneOfThem(VaryKeyword.DEVOLVER, VaryKeyword.RETURN), OPERACION));
		  
	 }	 
	 
	 public static void statements(LexerfulGrammarBuilder b) {
		 b.rule(SENTENCIAS).is(
				 b.firstOf(
						 ASIGNACION,
						 ESCRIBIR,
						 LEER,
						 BLOQUE,
						 FUNCION_FICHERO_ABRIR,
						 FUNCION_FICHERO_CERRAR,
						 FUNCIONES));
		 
		 b.rule(ESCRIBIR).is(b.firstOf(
				 b.sequence(b.isOneOfThem(VaryKeyword.ESCRIBIR, VaryKeyword.WRITE), b.isOneOfThem(VaryPunctuator.PARENTESIS_IZQ, VaryPunctuator.PARENTESIS_IZQ), PRIMARIA, b.optional(b.oneOrMore(b.isOneOfThem(VaryPunctuator.COMA, VaryPunctuator.COMA), OPERACION)), b.isOneOfThem(VaryPunctuator.PARENTESIS_DER, VaryPunctuator.PARENTESIS_DER)),
				 b.sequence(b.isOneOfThem(VaryKeyword.ESCRIBIR, VaryKeyword.WRITE), b.isOneOfThem(VaryPunctuator.PARENTESIS_IZQ, VaryPunctuator.PARENTESIS_IZQ), PRIMARIA, b.optional(b.oneOrMore(b.isOneOfThem(VaryPunctuator.COMA, VaryPunctuator.COMA), PRIMARIA)), b.isOneOfThem(VaryPunctuator.PARENTESIS_DER, VaryPunctuator.PARENTESIS_DER)))).skipIfOneChild();
		 
		 b.rule(LEER).is(
				 b.sequence(b.isOneOfThem(VaryKeyword.LEER, VaryKeyword.READ), b.isOneOfThem(VaryPunctuator.PARENTESIS_IZQ, VaryPunctuator.PARENTESIS_IZQ), PRIMARIA, b.isOneOfThem(VaryPunctuator.PARENTESIS_DER, VaryPunctuator.PARENTESIS_DER)));
		 
		 b.rule(BLOQUE).is(b.firstOf(
				 SI,
				 MIENTRAS,
				 REPETIR,
				 DESDE,
				 SEGUN));
		 
		 b.rule(SI).is(
				 b.sequence(b.isOneOfThem(VaryKeyword.SI, VaryKeyword.IF), 
						 OPERACION,
						 b.isOneOfThem(VaryKeyword.ENTONCES, VaryKeyword.THEN),
						 b.zeroOrMore(SENTENCIAS),
						 b.zeroOrMore(DEVOLVER),
						 b.zeroOrMore(SINO),
						 b.isOneOfThem(VaryKeyword.FIN_SI, VaryKeyword.END_IF)));
		 
		 b.rule(SINO).is(
				 b.sequence(b.isOneOfThem(VaryKeyword.SINO, VaryKeyword.ELSE),
						 b.zeroOrMore(SENTENCIAS),
						 b.zeroOrMore(DEVOLVER)));
		 
		 b.rule(MIENTRAS).is(
				 b.sequence(b.isOneOfThem(VaryKeyword.MIENTRAS, VaryKeyword.WHILE),
						 OPERACION,
						 b.isOneOfThem(VaryKeyword.HACER, VaryKeyword.DO),
						 b.zeroOrMore(SENTENCIAS),
						 b.isOneOfThem(VaryKeyword.FIN_MIENTRAS, VaryKeyword.END_WHILE)));
		 
		 b.rule(REPETIR).is(
				 b.sequence(b.isOneOfThem(VaryKeyword.REPETIR, VaryKeyword.REPEAT),
						 b.zeroOrMore(SENTENCIAS),
						 b.isOneOfThem(VaryKeyword.HASTA_QUE, VaryKeyword.UNTIL),
						 OPERACION));
		 
		 b.rule(DESDE).is(
				 b.sequence(b.isOneOfThem(VaryKeyword.DESDE, VaryKeyword.FOR),
						 ASIGNACION_NORMAL,
						 b.isOneOfThem(VaryKeyword.HASTA, VaryKeyword.TO),
						 OPERACION,
						 b.isOneOfThem(VaryKeyword.HACER, VaryKeyword.DO),
						 b.zeroOrMore(SENTENCIAS),
						 b.isOneOfThem(VaryKeyword.FIN_DESDE, VaryKeyword.END_FOR)));
		 
		 b.rule(SEGUN).is(
				 b.sequence(b.isOneOfThem(VaryKeyword.SEGUN_SEA, VaryKeyword.ACCORDING_TO),
						 b.isOneOfThem(VaryPunctuator.PARENTESIS_IZQ, VaryPunctuator.PARENTESIS_IZQ),
						 PRIMARIA,
						 b.isOneOfThem(VaryPunctuator.PARENTESIS_DER, VaryPunctuator.PARENTESIS_DER),
						 b.isOneOfThem(VaryKeyword.HACER, VaryKeyword.DO),
						 b.zeroOrMore(CASO),
						 b.isOneOfThem(VaryKeyword.EN_OTRO_CASO, VaryKeyword.OTHERWISE),
						 b.isOneOfThem(VaryPunctuator.DOS_PUNTOS, VaryPunctuator.DOS_PUNTOS),
						 b.zeroOrMore(SENTENCIAS),
						 b.zeroOrMore(DEVOLVER),
						 b.isOneOfThem(VaryKeyword.FIN_SEGUN, VaryKeyword.END_ACCORDING_TO)));
		 
		 b.rule(CASO).is(
				 b.sequence(b.isOneOfThem(VaryKeyword.CASO, VaryKeyword.CASE),
						 PRIMARIA,
						 b.isOneOfThem(VaryPunctuator.DOS_PUNTOS, VaryPunctuator.DOS_PUNTOS),
						 b.zeroOrMore(SENTENCIAS),
						 b.zeroOrMore(DEVOLVER)));
		 
		 b.rule(FUNCION_FICHERO_ABRIR).is(
				 b.sequence(b.isOneOfThem(VaryKeyword.ABRIR, VaryKeyword.OPEN),
						 b.isOneOfThem(VaryPunctuator.PARENTESIS_IZQ, VaryPunctuator.PARENTESIS_IZQ),
						 PRIMARIA,
						 b.isOneOfThem(VaryPunctuator.COMA, VaryPunctuator.COMA),
						 MODO_APERTURA,
						 b.isOneOfThem(VaryPunctuator.COMA, VaryPunctuator.COMA),
						 PRIMARIA,
						 b.isOneOfThem(VaryPunctuator.PARENTESIS_DER, VaryPunctuator.PARENTESIS_DER)));
		 
		 b.rule(MODO_APERTURA).is(
				 b.firstOf(b.firstOf("escritura", "writing"), b.firstOf("lectura", "reading"))).skipIfOneChild();
		 
		 b.rule(FUNCION_FICHERO_CERRAR).is(
				 b.sequence(b.isOneOfThem(VaryKeyword.CERRAR, VaryKeyword.CLOSE),
						 b.isOneOfThem(VaryPunctuator.PARENTESIS_IZQ, VaryPunctuator.PARENTESIS_IZQ),
						 PRIMARIA,
						 b.isOneOfThem(VaryPunctuator.PARENTESIS_DER, VaryPunctuator.PARENTESIS_DER)));
		 
		 b.rule(ASIGNACION).is(
				 b.firstOf(ASIGNACION_NORMAL, ASIGNACION_COMPLEJA));
		 
		 b.rule(ASIGNACION_NORMAL).is(
				 b.sequence(IDENTIFIER,
						 b.isOneOfThem(VaryPunctuator.ASIGNACION),
						 OPERACION));	
		 
		 b.rule(ASIGNACION_COMPLEJA).is(
				 b.sequence(VARIABLES_COMPLEJAS,
						 b.isOneOfThem(VaryPunctuator.ASIGNACION),
						 OPERACION));	 
	 }
	 
	public static void functions(LexerfulGrammarBuilder b) {
		
		b.rule(SUBPROCESO).is(
				b.firstOf(FUNCION, PROCEDIMIENTO)).skipIfOneChild();
		
		b.rule(FUNCION).is(
				b.sequence(TIPO_VARIABLE,
						b.isOneOfThem(VaryKeyword.FUNCION, VaryKeyword.FUNCTION),
						IDENTIFIER,
						b.isOneOfThem(VaryPunctuator.PARENTESIS_IZQ, VaryPunctuator.PARENTESIS_IZQ),
						b.zeroOrMore(b.firstOf(PARAMETRO_FUNCION, b.sequence(b.isOneOfThem(VaryPunctuator.COMA, VaryPunctuator.COMA), PARAMETRO_FUNCION))),
						b.isOneOfThem(VaryPunctuator.PARENTESIS_DER, VaryPunctuator.PARENTESIS_DER),
						b.optional(b.isOneOfThem(VaryKeyword.CONST, VaryKeyword.CONST)),
						b.optional(b.isOneOfThem(VaryKeyword.TIPO, VaryKeyword.TYPE)),
						b.isOneOfThem(VaryKeyword.VAR, VaryKeyword.VAR),
						b.zeroOrMore(DECLARACION),
						b.isOneOfThem(VaryKeyword.INICIO, VaryKeyword.INITIATION),
						b.zeroOrMore(SENTENCIAS),
						b.optional(DEVOLVER),
						b.isOneOfThem(VaryKeyword.FIN_INICIO, VaryKeyword.END_INITIATION),
						b.isOneOfThem(VaryKeyword.FIN_FUNCION, VaryKeyword.END_FUNCTION)));
		
		b.rule(PROCEDIMIENTO).is(
				b.sequence(b.isOneOfThem(VaryKeyword.PROCEDIMIENTO, VaryKeyword.PROCEDURE),
						IDENTIFIER,
						b.isOneOfThem(VaryPunctuator.PARENTESIS_IZQ, VaryPunctuator.PARENTESIS_IZQ),
						b.zeroOrMore(b.firstOf(PARAMETRO_FUNCION, b.sequence(b.isOneOfThem(VaryPunctuator.COMA, VaryPunctuator.COMA), PARAMETRO_FUNCION))),
						b.isOneOfThem(VaryPunctuator.PARENTESIS_DER, VaryPunctuator.PARENTESIS_DER),
						b.optional(b.isOneOfThem(VaryKeyword.CONST, VaryKeyword.CONST)),
						b.optional(b.isOneOfThem(VaryKeyword.TIPO, VaryKeyword.TYPE)),
						b.isOneOfThem(VaryKeyword.VAR, VaryKeyword.VAR),
						b.zeroOrMore(DECLARACION),
						b.isOneOfThem(VaryKeyword.INICIO, VaryKeyword.INITIATION),
						b.zeroOrMore(SENTENCIAS),
						b.isOneOfThem(VaryKeyword.FIN_INICIO, VaryKeyword.END_INITIATION),
						b.isOneOfThem(VaryKeyword.FIN_PROCEDIMIENTO, VaryKeyword.END_PROCEDURE)));
		
		b.rule(PARAMETRO_FUNCION).is(
				b.sequence(TIPO_PASO,
						TIPO,
						b.isOneOfThem(VaryPunctuator.DOS_PUNTOS, VaryPunctuator.DOS_PUNTOS),
						VARIABLE));
		
		b.rule(VARIABLE).is(IDENTIFIER);
		
		b.rule(TIPO_PASO).is(
				b.firstOf(b.firstOf("E", "I"), b.firstOf("E/S", "I/O"), b.firstOf("S", "O"))).skipIfOneChild();
		
		b.rule(INICIO).is(
				b.sequence(b.isOneOfThem(VaryKeyword.PRINCIPAL, VaryKeyword.MAIN),
						b.isOneOfThem(VaryKeyword.VAR, VaryKeyword.VAR),
						b.zeroOrMore(DECLARACION),
						b.isOneOfThem(VaryKeyword.INICIO, VaryKeyword.INITIATION),
						b.zeroOrMore(SENTENCIAS),
						b.isOneOfThem(VaryKeyword.FIN_INICIO, VaryKeyword.END_INITIATION)));
		
		b.rule(IMPLEMENTACION).is(b.sequence(b.isOneOfThem(VaryKeyword.IMPLEMENTACION, VaryKeyword.IMPLEMENTATION),
				b.optional(b.isOneOfThem(VaryKeyword.CONST, VaryKeyword.CONST)),
				b.zeroOrMore(CONSTANTES),
				b.optional(b.isOneOfThem(VaryKeyword.TIPO, VaryKeyword.TYPE)),
				b.zeroOrMore(TIPO_COMPLEJO),
				b.optional(b.isOneOfThem(VaryKeyword.VAR, VaryKeyword.VAR)),
				b.zeroOrMore(DECLARACION_GLOBAL),
				b.zeroOrMore(SUBPROCESO),
				b.isOneOfThem(VaryKeyword.FIN_IMPLEMENTACION, VaryKeyword.END_IMPLEMENTATION)));
		
	}
	
	public static void declarations(LexerfulGrammarBuilder b) {
		
		b.rule(DECLARACION_GLOBAL).is(DECLARACION);
		
		b.rule(DECLARACION).is(
				b.firstOf(DECLARACION_VARIABLE, DECLARACION_PROPIA));
		
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
				b.firstOf(b.firstOf("entero", "integer"), b.firstOf("logico", "boolean"), "real", b.firstOf("caracter", "character"), b.firstOf("cadena", "string"))).skipIfOneChild();
		
		b.rule(CONSTANTES).is(
				b.sequence(VARIABLE,
						b.isOneOfThem(VaryPunctuator.IGUAL_ASIGNACION, VaryPunctuator.IGUAL_ASIGNACION),
						PRIMARIA));
	} 
}
