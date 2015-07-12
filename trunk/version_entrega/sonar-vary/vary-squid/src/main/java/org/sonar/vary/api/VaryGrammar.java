package org.sonar.vary.api;

import com.sonar.sslr.api.Grammar;
import com.sonar.sslr.api.Rule;

public class VaryGrammar extends Grammar {
	
	 public Rule CODIGO;
	 public Rule ALGORITMO;
	 public Rule MODULO;
	 public Rule MODULO_REF;
	 public Rule CONSTANTE_REF;
	 public Rule TIPO_REF;
	 public Rule CABECERA_SUBPROCESO;
	 public Rule CABECERA_FUNCION;
	 public Rule CABECERA_PROCEDIMIENTO;
	 public Rule IMPLEMENTACION;
	 public Rule TIPO_COMPLEJO;
	 public Rule SUBPROCESO;
	 public Rule COMENTARIOS;
	 public Rule SENTENCIAS;
	 public Rule BLOQUE;
	 public Rule DECLARACION;
	 public Rule FUNCION_FICHERO_ABRIR;
	 public Rule FUNCION_FICHERO_CERRAR;
	 public Rule MODO_APERTURA;
	 public Rule NOMBRE_INTERNA;
	 public Rule ENTERO;
	 public Rule REAL;
	 public Rule CAMPO_REGISTRO;
	 public Rule TIPO;
	 public Rule TIPO_DEFINIDO;
	 public Rule TIPO_EXISTENTE;
	 public Rule CONSTANTES;
	 public Rule VECTOR;
	 public Rule MATRIZ;
	 public Rule REGISTRO;
	 public Rule ARCHIVO;
	 public Rule ENUMERADO;
	 public Rule SUBRANGO;
	 public Rule SUBRANGO_ENUMERADO;
	 public Rule SUBRANGO_NUMERICO;
	 public Rule INICIO;
	 public Rule CADENA;
	 public Rule CARACTER;
	 public Rule DECLARACION_VARIABLE;
	 public Rule DECLARACION_PROPIA;
	 public Rule ASIGNACION;
	 public Rule ASIGNACION_NORMAL;
	 public Rule ASIGNACION_COMPLEJA;
	 public Rule ESCRIBIR;
	 public Rule LEER;
	 public Rule SI;
	 public Rule MIENTRAS;
	 public Rule DESDE;
	 public Rule SEGUN;
	 public Rule REPETIR;
	 public Rule CASO;
	 public Rule TIPO_VARIABLE;
	 public Rule VARIABLE;
	 public Rule LOGICO;
	 public Rule SIGNO_OR;
	 public Rule SIGNO_AND;
	 public Rule SIGNO_IGUALDAD;
	 public Rule SIGNO_COMPARACION;
	 public Rule SIGNO_SUMA;
	 public Rule SIGNO_RESTA;
	 public Rule SIGNO_MULTIPLICACION;
	 public Rule SIGNO_DIVISION;
	 public Rule OPERACION;
	 public Rule OR;
	 public Rule AND;
	 public Rule IGUALDAD;
	 public Rule COMPARACION;
	 public Rule SUMA_RESTA;
	 public Rule MULTIPLICACION_DIVISION;
	 public Rule PRIMARIA;
	 public Rule FUNCIONES;
	 public Rule VARIABLES_COMPLEJAS;
	 public Rule VARIABLES_BASICAS;
	 public Rule SINO;
	 public Rule PARAMETRO_FUNCION;
	 public Rule FUNCION;
	 public Rule PROCEDIMIENTO;
	 public Rule TIPO_PASO;
	 public Rule VALOR_VECTOR;
	 public Rule VALOR_MATRIZ;
	 public Rule VALOR_REGISTRO;
	 public Rule LLAMADA_FUNCION;
	 public Rule INTERNAS;
	

	@Override
	public Rule getRootRule() {
		// TODO Auto-generated method stub
		return CODIGO;
	}

}
