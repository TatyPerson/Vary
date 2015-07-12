package org.sonar.vary.parser;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.sonar.sslr.grammar.GrammarRuleKey;
import org.sonar.sslr.grammar.LexerfulGrammarBuilder;
import org.sonar.vary.VaryConfiguration;
import org.sonar.vary.api.VaryKeyword;
import org.sonar.vary.api.VaryPunctuator;
import org.sonar.vary.api.VaryTokenType;

import com.sonar.sslr.api.Grammar;

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
	 FUNCION_FICHERO_ABRIR,
	 FUNCION_FICHERO_CERRAR,
	 MODO_APERTURA,
	 NOMBRE_INTERNA,
	 ENTERO,
	 REAL,
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
	 CADENA,
	 CARACTER,
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
	 SUMA_RESTA,
	 MULTIPLICACION_DIVISION,
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
		 if(conf.getErrorRecoveryEnabled() == true) {
			 
			 b.rule(CODIGO).is(
						b.firstOf(ALGORITMO, MODULO));
			 
			 
			 b.rule(ALGORITMO).is(b.sequence(
					 VaryKeyword.ALGORITMO.getValue(), 
					 CADENA,
					 VaryKeyword.IMPORTA.getValue(),
					 b.zeroOrMore(MODULO_REF),
					 VaryKeyword.FIN_IMPORTA.getValue(),
					 VaryKeyword.CONST.getValue(),
					 b.zeroOrMore(CONSTANTES),
					 VaryKeyword.TIPO.getValue(),
					 b.zeroOrMore(TIPO_COMPLEJO), 
					 VaryKeyword.VAR.getValue(),
					 b.zeroOrMore(DECLARACION), 
					 b.zeroOrMore(SUBPROCESO), 
					 INICIO,
					 VaryKeyword.FIN_ALGORITMO.getValue()));	
			 
			 b.rule(MODULO_REF).is(CADENA);
			 b.rule(CONSTANTE_REF).is(CADENA);
			 b.rule(TIPO_REF).is(CADENA);
			 
			 b.rule(MODULO).is(b.sequence(
					 VaryKeyword.MODULO.getValue(),
					 CADENA,
					 VaryKeyword.IMPORTA.getValue(),
					 b.zeroOrMore(MODULO_REF),
					 VaryKeyword.FIN_IMPORTA.getValue(),
					 VaryKeyword.EXPORTA.getValue(),
					 VaryKeyword.CONST.getValue(),
					 b.zeroOrMore(CONSTANTE_REF),
					 VaryKeyword.TIPO.getValue(),
					 b.zeroOrMore(TIPO_REF),
					 VaryKeyword.VAR.getValue(),
					 b.zeroOrMore(DECLARACION),
					 b.zeroOrMore(CABECERA_SUBPROCESO),
					 VaryKeyword.FIN_EXPORTA.getValue(),
					 IMPLEMENTACION,
					 VaryKeyword.FIN_MODULO.getValue()));
			 
		 }
		 else {

			 b.rule(CODIGO).is(
						b.firstOf(ALGORITMO, MODULO));
			 
			 
			 b.rule(ALGORITMO).is(b.sequence(
					 VaryKeyword.ALGORITMO.getValue(), 
					 CADENA,
					 VaryKeyword.IMPORTA.getValue(),
					 b.zeroOrMore(MODULO_REF),
					 VaryKeyword.FIN_IMPORTA.getValue(),
					 VaryKeyword.CONST.getValue(),
					 b.zeroOrMore(CONSTANTES),
					 VaryKeyword.TIPO.getValue(),
					 b.zeroOrMore(TIPO_COMPLEJO), 
					 VaryKeyword.VAR.getValue(),
					 b.zeroOrMore(DECLARACION), 
					 b.zeroOrMore(SUBPROCESO), 
					 INICIO,
					 VaryKeyword.FIN_ALGORITMO.getValue()));	
			 
			 b.rule(MODULO_REF).is(CADENA);
			 b.rule(CONSTANTE_REF).is(CADENA);
			 b.rule(TIPO_REF).is(CADENA);
			 
			 b.rule(MODULO).is(b.sequence(
					 VaryKeyword.MODULO.getValue(),
					 CADENA,
					 VaryKeyword.IMPORTA.getValue(),
					 b.zeroOrMore(MODULO_REF),
					 VaryKeyword.FIN_IMPORTA.getValue(),
					 VaryKeyword.EXPORTA.getValue(),
					 VaryKeyword.CONST.getValue(),
					 b.zeroOrMore(CONSTANTE_REF),
					 VaryKeyword.TIPO.getValue(),
					 b.zeroOrMore(TIPO_REF),
					 VaryKeyword.VAR.getValue(),
					 b.zeroOrMore(DECLARACION),
					 b.zeroOrMore(CABECERA_SUBPROCESO),
					 VaryKeyword.FIN_EXPORTA.getValue(),
					 IMPLEMENTACION,
					 VaryKeyword.FIN_MODULO.getValue()));	
		 }
	 }
	 
	 private static void types(LexerfulGrammarBuilder b) {
		 b.rule(CADENA).is(VaryTokenType.CADENA.getValue());
		 b.rule(LOGICO).is(b.firstOf(VaryKeyword.VERDADERO.getValue(), VaryKeyword.FALSO.getValue()));
		 b.rule(CARACTER).is(VaryTokenType.CARACTER.getValue());
		 b.rule(ENTERO).is(VaryTokenType.NUMERO.getValue());
		 b.rule(REAL).is(VaryTokenType.NUMERO.getValue()); 
		 b.rule(TIPO_COMPLEJO).is(
				 b.firstOf(VECTOR, MATRIZ, REGISTRO, ARCHIVO, ENUMERADO, SUBRANGO));
		 
		 b.rule(VECTOR).is(
				 b.sequence(VaryKeyword.VECTOR.getValue(),
						 VaryPunctuator.CORCHETE_IZQ.getValue(),
						 PRIMARIA,
						 VaryPunctuator.CORCHETE_DER.getValue(),
						 VaryKeyword.DE.getValue(),
						 TIPO,
						 VaryPunctuator.DOS_PUNTOS.getValue(),
						 CADENA));
		 
		 b.rule(MATRIZ).is(
				 b.sequence(VaryKeyword.MATRIZ.getValue(),
						 VaryPunctuator.CORCHETE_IZQ.getValue(),
						 PRIMARIA,
						 VaryPunctuator.CORCHETE_DER.getValue(),
						 VaryPunctuator.CORCHETE_IZQ.getValue(),
						 PRIMARIA,
						 VaryPunctuator.CORCHETE_DER.getValue(),
						 VaryKeyword.DE.getValue(),
						 TIPO,
						 VaryPunctuator.DOS_PUNTOS.getValue(),
						 CADENA));
		 
		 b.rule(REGISTRO).is(
				 b.sequence(VaryKeyword.REGISTRO.getValue(),
						 CADENA,
						 b.oneOrMore(DECLARACION),
						 VaryKeyword.FIN_REGISTRO.getValue()));
		 
		 b.rule(ARCHIVO).is(
				 b.sequence(VaryKeyword.ARCHIVO.getValue(),
						 TIPO,
						 VaryPunctuator.DOS_PUNTOS.getValue(),
						 CADENA));
		 
		 b.rule(ENUMERADO).is(
				 b.sequence(CADENA,
						 VaryPunctuator.IGUAL.getValue(),
						 VaryPunctuator.LLAVE_IZQ.getValue(),
						 PRIMARIA,
						 b.oneOrMore(VaryPunctuator.COMA.getValue(), PRIMARIA),
						 VaryPunctuator.LLAVE_DER.getValue()));
		 
		 b.rule(SUBRANGO).is(
				 b.firstOf(SUBRANGO_ENUMERADO, SUBRANGO_NUMERICO));
		 
		 b.rule(SUBRANGO_NUMERICO).is(
				 b.sequence(CADENA,
						 VaryPunctuator.IGUAL.getValue(),
						 ENTERO,
						 VaryPunctuator.PUNTOS_SUSPENSIVOS.getValue(),
						 ENTERO));
		 
		 b.rule(SUBRANGO_ENUMERADO).is(
				 b.sequence(CADENA,
						 VaryPunctuator.IGUAL.getValue(),
						 CADENA,
						 VaryPunctuator.PUNTOS_SUSPENSIVOS.getValue(),
						 CADENA));
		 
		 b.rule(TIPO).is(
				 b.firstOf(TIPO_DEFINIDO, TIPO_EXISTENTE));
		 
		 b.rule(TIPO_DEFINIDO).is(CADENA);
		 
		 b.rule(TIPO_EXISTENTE).is(TIPO_VARIABLE);
		 
		 b.rule(CABECERA_SUBPROCESO).is(b.firstOf(CABECERA_FUNCION, CABECERA_PROCEDIMIENTO));
		 
		 b.rule(CABECERA_FUNCION).is(b.sequence(TIPO_VARIABLE,
					VaryKeyword.FUNCION.getValue(),
					CADENA,
					VaryPunctuator.PARENTESIS_IZQ.getValue(),
					b.zeroOrMore(b.firstOf(PARAMETRO_FUNCION, b.sequence(VaryPunctuator.COMA.getValue(), PARAMETRO_FUNCION))),
					VaryPunctuator.PARENTESIS_DER.getValue()));
		 
		 b.rule(CABECERA_PROCEDIMIENTO).is(b.sequence(VaryKeyword.PROCEDIMIENTO.getValue(),
					CADENA,
					VaryPunctuator.PARENTESIS_IZQ.getValue(),
					b.zeroOrMore(b.firstOf(PARAMETRO_FUNCION, b.sequence(VaryPunctuator.COMA.getValue(), PARAMETRO_FUNCION))),
					VaryPunctuator.PARENTESIS_DER.getValue()));
						 
	 }
	 
	 private static void expressions(LexerfulGrammarBuilder b) {
		 
		 b.rule(PRIMARIA).is(
				 b.firstOf(OPERACION,
						 VARIABLES_BASICAS,
						 b.sequence("-(", OPERACION, VaryPunctuator.PARENTESIS_DER.getValue()),
						 b.sequence("no(", OPERACION, VaryPunctuator.PARENTESIS_DER.getValue()),
						 FUNCIONES,
						 VARIABLES_COMPLEJAS)
		).skipIfOneChild();
		 
		 b.rule(OPERACION).is(OR);
		 
		 b.rule(OR).is(
				 b.oneOrMore(b.sequence(AND, SIGNO_OR, AND))).skipIfOneChild();
		 
		 b.rule(SIGNO_OR).is(VaryPunctuator.O.getValue());
		 
		 b.rule(AND).is(
				 b.oneOrMore(b.sequence(IGUALDAD, SIGNO_AND, IGUALDAD))).skipIfOneChild();
		 
		 b.rule(SIGNO_AND).is(VaryPunctuator.Y.getValue());
		 
		 b.rule(IGUALDAD).is(
				 b.oneOrMore(b.sequence(COMPARACION, SIGNO_IGUALDAD, COMPARACION))).skipIfOneChild();
		 
		 b.rule(SIGNO_IGUALDAD).is(b.firstOf(
				 VaryPunctuator.IGUAL.getValue(),
				 VaryPunctuator.DISTINTO.getValue()));
		 
		 b.rule(COMPARACION).is(
				 b.oneOrMore(b.sequence(SUMA_RESTA, SIGNO_COMPARACION, SUMA_RESTA))).skipIfOneChild();
		 
		 b.rule(SIGNO_COMPARACION).is(b.firstOf(
				 VaryPunctuator.MENOR.getValue(),
				 VaryPunctuator.MAYOR.getValue(),
				 VaryPunctuator.MENOR_IGUAL.getValue(),
				 VaryPunctuator.MAYOR_IGUAL.getValue()));
		 
		 b.rule(SUMA_RESTA).is(b.firstOf(
				 b.oneOrMore(b.sequence(MULTIPLICACION_DIVISION, SIGNO_SUMA, MULTIPLICACION_DIVISION)),
				 b.oneOrMore(b.sequence(MULTIPLICACION_DIVISION, SIGNO_RESTA, MULTIPLICACION_DIVISION)))).skipIfOneChild();
		 
		 
		 b.rule(SIGNO_SUMA).is(VaryPunctuator.SUMA.getValue());
		 b.rule(SIGNO_RESTA).is(VaryPunctuator.RESTA.getValue());
		 
		 b.rule(MULTIPLICACION_DIVISION).is(b.firstOf(
				 b.oneOrMore(b.sequence(PRIMARIA, SIGNO_MULTIPLICACION, PRIMARIA)),
				 b.oneOrMore(b.sequence(PRIMARIA, SIGNO_DIVISION, PRIMARIA)))).skipIfOneChild();
		 
		 b.rule(SIGNO_MULTIPLICACION).is(VaryPunctuator.MULTIPLICACION.getValue());
		 b.rule(SIGNO_DIVISION).is(VaryPunctuator.DIVISION.getValue());
		 
		 b.rule(VARIABLES_BASICAS).is(b.firstOf(
				 VaryTokenType.NUMERO.getValue(),
				 VaryTokenType.CADENA.getValue(),
				 VaryTokenType.CARACTER.getValue(),
				 VaryTokenType.LOGICO.getValue()));
		 
		 b.rule(VARIABLES_COMPLEJAS).is(b.firstOf(
				 VALOR_VECTOR,
				 VALOR_MATRIZ,
				 VALOR_REGISTRO
				 ));
		 
		 b.rule(VALOR_VECTOR).is(
				 b.sequence(CADENA, VaryPunctuator.CORCHETE_IZQ.getValue(), VARIABLES_BASICAS, VaryPunctuator.CORCHETE_DER.getValue(), b.zeroOrMore(b.sequence(VaryPunctuator.PUNTO.getValue(), CAMPO_REGISTRO))));
		 
		 b.rule(VALOR_MATRIZ).is(
				 b.sequence(CADENA, VaryPunctuator.CORCHETE_IZQ.getValue(), VARIABLES_BASICAS, VaryPunctuator.CORCHETE_DER.getValue(),
						 VaryPunctuator.CORCHETE_IZQ.getValue(), VARIABLES_BASICAS, VaryPunctuator.CORCHETE_DER.getValue(), b.zeroOrMore(b.sequence(VaryPunctuator.PUNTO.getValue(), CAMPO_REGISTRO))));
		 
		 b.rule(VALOR_REGISTRO).is(
				 b.sequence(CADENA, b.oneOrMore(b.sequence(VaryPunctuator.PUNTO.getValue(), CAMPO_REGISTRO))));
		 
		 
		 b.rule(CAMPO_REGISTRO).is(CADENA);
		 
		 b.rule(FUNCIONES).is(b.firstOf(
				 LLAMADA_FUNCION,
				 INTERNAS));
		 
		 b.rule(LLAMADA_FUNCION).is(
				 b.sequence(CADENA, VaryPunctuator.PARENTESIS_IZQ.getValue(), b.sequence(OPERACION, b.zeroOrMore(b.sequence(VaryPunctuator.COMA.getValue(), OPERACION), VaryPunctuator.PARENTESIS_DER.getValue()))));
		 
		 b.rule(INTERNAS).is(
				 b.sequence(NOMBRE_INTERNA, VaryPunctuator.PARENTESIS_IZQ.getValue(), b.sequence(OPERACION, b.zeroOrMore(b.sequence(VaryPunctuator.COMA.getValue(), OPERACION), VaryPunctuator.PARENTESIS_DER.getValue()))));
		 
		 b.rule(NOMBRE_INTERNA).is(b.firstOf("cos", "cuadrado", "exp", "ln", "log", "sen", "sqrt", "longitud", "concatena"));
		  
	 }	 
	 
	 public static void statements(LexerfulGrammarBuilder b) {
		 b.rule(SENTENCIAS).is(
				 b.firstOf(
						 ESCRIBIR,
						 LEER,
						 BLOQUE,
						 FUNCION_FICHERO_ABRIR,
						 FUNCION_FICHERO_CERRAR,
						 ASIGNACION,
						 FUNCIONES));
		 
		 b.rule(ESCRIBIR).is(b.firstOf(
				 b.sequence(VaryKeyword.ESCRIBIR.getValue(), VaryPunctuator.PARENTESIS_IZQ.getValue(), b.oneOrMore(VaryPunctuator.COMA.getValue(), OPERACION), VaryPunctuator.PARENTESIS_DER.getValue()),
				 b.sequence(VaryKeyword.ESCRIBIR.getValue(), VaryPunctuator.PARENTESIS_IZQ.getValue(), b.oneOrMore(VaryPunctuator.COMA.getValue(), PRIMARIA), VaryPunctuator.PARENTESIS_DER.getValue())));
		 
		 b.rule(LEER).is(
				 b.sequence(VaryKeyword.LEER.getValue(), VaryPunctuator.PARENTESIS_IZQ.getValue(), PRIMARIA, VaryPunctuator.PARENTESIS_DER.getValue()));
		 
		 b.rule(BLOQUE).is(b.firstOf(
				 SI,
				 MIENTRAS,
				 REPETIR,
				 DESDE,
				 SEGUN));
		 
		 b.rule(SI).is(
				 b.sequence(VaryKeyword.SI.getValue(), 
						 OPERACION,
						 VaryKeyword.ENTONCES.getValue(),
						 b.zeroOrMore(SENTENCIAS),
						 b.zeroOrMore(VaryKeyword.DEVOLVER.getValue()),
						 b.zeroOrMore(SINO),
						 VaryKeyword.FIN_SI.getValue()));
		 
		 b.rule(SINO).is(
				 b.sequence(VaryKeyword.SINO.getValue(),
						 b.zeroOrMore(SENTENCIAS),
						 b.zeroOrMore(VaryKeyword.DEVOLVER.getValue())));
		 
		 b.rule(MIENTRAS).is(
				 b.sequence(VaryKeyword.MIENTRAS.getValue(),
						 OPERACION,
						 VaryKeyword.HACER.getValue(),
						 b.zeroOrMore(SENTENCIAS),
						 VaryKeyword.FIN_MIENTRAS.getValue()));
		 
		 b.rule(REPETIR).is(
				 b.sequence(VaryKeyword.REPETIR.getValue(),
						 b.zeroOrMore(SENTENCIAS),
						 VaryKeyword.HASTA_QUE.getValue(),
						 OPERACION));
		 
		 b.rule(DESDE).is(
				 b.sequence(VaryKeyword.DESDE.getValue(),
						 ASIGNACION_NORMAL,
						 VaryKeyword.HASTA.getValue(),
						 OPERACION,
						 VaryKeyword.HACER.getValue(),
						 b.zeroOrMore(SENTENCIAS),
						 VaryKeyword.FIN_DESDE.getValue()));
		 
		 b.rule(SEGUN).is(
				 b.sequence(VaryKeyword.SEGUN_SEA.getValue(),
						 VaryPunctuator.CORCHETE_IZQ.getValue(),
						 PRIMARIA,
						 VaryPunctuator.CORCHETE_DER.getValue(),
						 b.zeroOrMore(CASO),
						 VaryKeyword.EN_OTRO_CASO.getValue(),
						 b.zeroOrMore(SENTENCIAS),
						 b.zeroOrMore(VaryKeyword.DEVOLVER.getValue()),
						 VaryKeyword.FIN_SEGUN.getValue()));
		 
		 b.rule(CASO).is(
				 b.sequence(VaryKeyword.CASO.getValue(),
						 PRIMARIA,
						 VaryPunctuator.DOS_PUNTOS.getValue(),
						 b.zeroOrMore(SENTENCIAS),
						 b.zeroOrMore(VaryKeyword.DEVOLVER.getValue())));
		 
		 b.rule(FUNCION_FICHERO_ABRIR).is(
				 b.sequence(VaryKeyword.ABRIR.getValue(),
						 VaryPunctuator.PARENTESIS_IZQ.getValue(),
						 PRIMARIA,
						 VaryPunctuator.COMA.getValue(),
						 MODO_APERTURA,
						 VaryPunctuator.COMA.getValue(),
						 PRIMARIA,
						 VaryPunctuator.PARENTESIS_DER.getValue()));
		 
		 b.rule(MODO_APERTURA).is(
				 b.firstOf("escritura", "lectura"));
		 
		 b.rule(FUNCION_FICHERO_CERRAR).is(
				 b.sequence(VaryKeyword.CERRAR.getValue(),
						 VaryPunctuator.PARENTESIS_IZQ.getValue(),
						 PRIMARIA,
						 VaryPunctuator.PARENTESIS_DER.getValue()));
		 
		 b.rule(ASIGNACION).is(
				 b.firstOf(ASIGNACION_NORMAL, ASIGNACION_COMPLEJA));
		 
		 b.rule(ASIGNACION_NORMAL).is(
				 b.sequence(CADENA,
						 VaryPunctuator.ASIGNACION.getValue(),
						 OPERACION));
		 
		 b.rule(ASIGNACION_COMPLEJA).is(
				 b.sequence(VARIABLES_COMPLEJAS,
						 VaryPunctuator.ASIGNACION.getValue(),
						 OPERACION));	 
	 }
	 
	public static void functions(LexerfulGrammarBuilder b) {
		
		b.rule(SUBPROCESO).is(
				b.firstOf(FUNCION, PROCEDIMIENTO));
		
		b.rule(FUNCION).is(
				b.sequence(TIPO_VARIABLE,
						VaryKeyword.FUNCION.getValue(),
						CADENA,
						VaryPunctuator.PARENTESIS_IZQ.getValue(),
						b.zeroOrMore(b.firstOf(PARAMETRO_FUNCION, b.sequence(VaryPunctuator.COMA.getValue(), PARAMETRO_FUNCION))),
						VaryPunctuator.PARENTESIS_DER.getValue(),
						b.optional(VaryKeyword.CONST.getValue()),
						b.optional(VaryKeyword.TIPO.getValue()),
						VaryKeyword.VAR.getValue(),
						b.zeroOrMore(DECLARACION),
						VaryKeyword.INICIO.getValue(),
						b.zeroOrMore(SENTENCIAS),
						VaryKeyword.DEVOLVER.getValue(),
						VaryKeyword.FIN_FUNCION.getValue()));
		
		b.rule(PROCEDIMIENTO).is(
				b.sequence(VaryKeyword.PROCEDIMIENTO.getValue(),
						CADENA,
						VaryPunctuator.PARENTESIS_IZQ.getValue(),
						b.zeroOrMore(b.firstOf(PARAMETRO_FUNCION, b.sequence(VaryPunctuator.COMA.getValue(), PARAMETRO_FUNCION))),
						VaryPunctuator.PARENTESIS_DER.getValue(),
						b.optional(VaryKeyword.CONST.getValue()),
						b.optional(VaryKeyword.TIPO.getValue()),
						VaryKeyword.VAR.getValue(),
						b.zeroOrMore(DECLARACION),
						VaryKeyword.INICIO.getValue(),
						b.zeroOrMore(SENTENCIAS),
						VaryKeyword.FIN_PROCEDIMIENTO.getValue()));
		
		b.rule(PARAMETRO_FUNCION).is(
				b.sequence(TIPO_PASO,
						TIPO,
						VaryPunctuator.DOS_PUNTOS.getValue(),
						VARIABLE));
		
		b.rule(VARIABLE).is(CADENA);
		
		b.rule(TIPO_PASO).is(
				b.firstOf("E", "E/S", "S"));
		
		b.rule(INICIO).is(
				b.sequence(VaryKeyword.PRINCIPAL.getValue(),
						VaryKeyword.VAR.getValue(),
						b.zeroOrMore(DECLARACION),
						VaryKeyword.INICIO.getValue(),
						b.zeroOrMore(SENTENCIAS),
						VaryKeyword.FIN_INICIO.getValue()));
		
		b.rule(IMPLEMENTACION).is(b.sequence(VaryKeyword.IMPLEMENTACION.getValue(),
				VaryKeyword.CONST.getValue(),
				b.zeroOrMore(CONSTANTES),
				VaryKeyword.TIPO.getValue(),
				b.zeroOrMore(TIPO_COMPLEJO),
				VaryKeyword.VAR.getValue(),
				b.zeroOrMore(DECLARACION),
				b.zeroOrMore(SUBPROCESO),
				VaryKeyword.FIN_IMPLEMENTACION.getValue()));
		
	}
	
	public static void declarations(LexerfulGrammarBuilder b) {
		
		b.rule(DECLARACION).is(
				b.firstOf(DECLARACION_VARIABLE, DECLARACION_PROPIA));
		
		b.rule(DECLARACION_VARIABLE).is(
				b.sequence(TIPO_VARIABLE,
						VaryPunctuator.DOS_PUNTOS.getValue(),
						VARIABLE,
						b.zeroOrMore(VaryPunctuator.COMA.getValue(), VARIABLE)));
		
		b.rule(DECLARACION_PROPIA).is(
				b.sequence(CADENA,
						VaryPunctuator.DOS_PUNTOS.getValue(),
						VARIABLE,
						b.zeroOrMore(VaryPunctuator.COMA.getValue(), VARIABLE)));
		
		b.rule(TIPO_VARIABLE).is(
				b.firstOf("entero", "logico", "real", "caracter", "cadena"));
		
		b.rule(CONSTANTES).is(
				b.sequence(VARIABLE,
						VaryPunctuator.IGUAL.getValue(),
						PRIMARIA));
	}
	 
}
