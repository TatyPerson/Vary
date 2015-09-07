package org.sonar.vary.api;

import org.junit.Test;
import org.sonar.vary.parser.VaryGrammarImpl;
import static org.sonar.sslr.tests.Assertions.assertThat;
import static com.sonar.sslr.api.GenericTokenType.COMMENT;

public class VaryParserTest extends ParserBaseTest {
	  @Test
	  public void statement() {
	    /*p.setRootRule(g.rule(VaryGrammarImpl.SENTENCIAS));

	    g.rule(VaryGrammarImpl.BLOQUE).mock();
	    g.rule(VaryGrammarImpl.SI).mock();
	    g.rule(VaryGrammarImpl.SINO).mock();
	    g.rule(VaryGrammarImpl.MIENTRAS).mock();
	    g.rule(VaryGrammarImpl.DESDE).mock();
	    g.rule(VaryGrammarImpl.REPETIR).mock();
	    g.rule(VaryGrammarImpl.SEGUN).mock();
	    g.rule(VaryGrammarImpl.ASIGNACION).mock();
	    g.rule(VaryGrammarImpl.DECLARACION).mock();*/

	    /*assertThat(p).matches("BLOQUE");
	    assertThat(p).matches("SI");
	    assertThat(p).matches("SINO");
	    assertThat(p).matches("MIENTRAS");
	    assertThat(p).matches("DESDE");
	    assertThat(p).matches("REPETIR");
	    assertThat(p).matches("SEGUN");
	    assertThat(p).matches("ASIGNACION");
	    assertThat(p).matches("DECLARACION");*/
	  }

	  @Test
	  public void tipos_reallife() {
	    p.setRootRule(g.rule(VaryGrammarImpl.LOGICO));
	    assertThat(p).matches("verdadero");
	    
	  }
	  
	  @Test
	  public void variables_reallife() {
		  
		  //Probando tipos de variables nativos
		  p.setRootRule(g.rule(VaryGrammarImpl.VARIABLES_BASICAS));
		    assertThat(p).matches("verdadero");
		    assertThat(p).matches("prueba");
		    assertThat(p).matches("\"hola\"");
		    assertThat(p).matches("\'a\'");
		    assertThat(p).matches("5");
		    assertThat(p).matches("2.2");
	  }
	  
	  @Test
	  public void declaraciones_reallife() {
		  
		  //Probando la sintaxis de las declaraciones de tipos nativos:
		  p.setRootRule(g.rule(VaryGrammarImpl.DECLARACION_VARIABLE));
		  assertThat(p).matches("entero: a");
		  assertThat(p).notMatches("prueba");
		  assertThat(p).notMatches("miVariable: a");
		  assertThat(p).matches("real: a");
		  assertThat(p).matches("logico: a");
		  assertThat(p).matches("cadena: a");
		  assertThat(p).matches("caracter: a");
		  
		  //Probando la sintaxis de las declaraciones de tipos creados por el usuario:
		  p.setRootRule(g.rule(VaryGrammarImpl.DECLARACION_PROPIA));
		  assertThat(p).notMatches("entero: a");
		  assertThat(p).notMatches("prueba");
		  assertThat(p).matches("miVariable: a");
		  assertThat(p).notMatches("real: a");
		  assertThat(p).notMatches("logico: a");
		  assertThat(p).notMatches("cadena: a");
		  assertThat(p).notMatches("caracter: a");
		  
		  //Probando la herencia:
		  p.setRootRule(g.rule(VaryGrammarImpl.DECLARACION));
		  assertThat(p).matches("miVariable: a");
		  assertThat(p).matches("entero: a");
		  assertThat(p).notMatches("prueba");
		  assertThat(p).notMatches("5.5");
		  
		  //Probando las variables globales para la métrica:
		  p.setRootRule(g.rule(VaryGrammarImpl.DECLARACION_GLOBAL));
		  assertThat(p).matches("miVariable: a");
		  assertThat(p).matches("entero: a");
		  assertThat(p).notMatches("prueba");
		  assertThat(p).notMatches("5.5");
	  }
	  
	  @Test
	  public void operacion_reallife() {
		  
		  //Comprobando el formato de las operaciones:
		  p.setRootRule(g.rule(VaryGrammarImpl.OPERACION));
		  assertThat(p).matches("a o b");
		  assertThat(p).matches("a y b");
		  assertThat(p).matches("prueba");
		  assertThat(p).matches("5");
		  assertThat(p).matches("a + b");
		  assertThat(p).matches("a - b");
		  assertThat(p).matches("a == b");
		  assertThat(p).matches("a * 2");
		  assertThat(p).matches("a != b");
		  assertThat(p).matches("4 + 5");
		  assertThat(p).matches("a - b");
		  assertThat(p).matches("a / b");
		  
		  //Comprobando el formato de las operaciones OR:
		  p.setRootRule(g.rule(VaryGrammarImpl.OR));
		  assertThat(p).matches("a o b");
		  //assertThat(p).notMatches("a y b");
		  
		//Comprobando el formato de las operaciones OR:
		  p.setRootRule(g.rule(VaryGrammarImpl.AND));
		  assertThat(p).matches("a y b");
		  //assertThat(p).notMatches("a o b");
		  
		  //Comprobando el formato de las operaciones Suma:
		  p.setRootRule(g.rule(VaryGrammarImpl.SUMA));
		  assertThat(p).matches("a + b");
		  assertThat(p).notMatches("a - b");
		  
		  //Comprobando el formato de las operaciones Resta:
		  p.setRootRule(g.rule(VaryGrammarImpl.RESTA));
		  assertThat(p).matches("a - b");
		  assertThat(p).notMatches("a / b");
		  
		  //Comprobando el formato de las operaciones primarias:
		  p.setRootRule(g.rule(VaryGrammarImpl.PRIMARIA));
		  assertThat(p).matches("a");
		  assertThat(p).matches("5.5");
		  assertThat(p).matches("8");
		  assertThat(p).matches("a[0]");
		  assertThat(p).matches("a.campo");
		  
	  }
	  
	  @Test
	  public void tiposComplejos_reallife() {
		  
		  //Comprobando el formato del valor de un vector:
		  p.setRootRule(g.rule(VaryGrammarImpl.VALOR_VECTOR));
		  assertThat(p).matches("a[0]");
		  assertThat(p).matches("a[i]");
		  assertThat(p).matches("a[i].campo");
		  assertThat(p).notMatches("4 + 5");
		  assertThat(p).notMatches("prueba");
		  
		  //Comprobando el formato del valor de una matriz:
		  p.setRootRule(g.rule(VaryGrammarImpl.VALOR_MATRIZ));
		  assertThat(p).matches("a[0][0]");
		  assertThat(p).matches("a[i][j]");
		  assertThat(p).matches("a[i][0]");
		  assertThat(p).matches("a[i][0].campo");
		  assertThat(p).notMatches("4 + 5");
		  assertThat(p).notMatches("prueba");
		  
		  //Comprobando el formato del valor de un registro:
		  p.setRootRule(g.rule(VaryGrammarImpl.VALOR_REGISTRO));
		  assertThat(p).matches("a.campo");
		  assertThat(p).matches("a.campo.campo2");
		  assertThat(p).notMatches("4 + 5");
		  assertThat(p).notMatches("prueba");
		  
		  //Comprobando la herencia:
		  p.setRootRule(g.rule(VaryGrammarImpl.VARIABLES_COMPLEJAS));
		  assertThat(p).matches("a[0]");
		  assertThat(p).matches("a[i]");
		  assertThat(p).matches("a[i].campo");
		  assertThat(p).matches("a[0][0]");
		  assertThat(p).matches("a[i][j]");
		  assertThat(p).matches("a[i][0]");
		  assertThat(p).matches("a[i][0].campo");
		  assertThat(p).matches("a.campo");
		  assertThat(p).matches("a.campo.campo2");
		  assertThat(p).notMatches("4 + 5");
		  assertThat(p).notMatches("prueba");
		  
	  }
	  
	  @Test
	  public void llamadaFuncion_reallife() {
		  
		  //Comprobando las llamadas a funciones de las creadas por el usuario:
		  p.setRootRule(g.rule(VaryGrammarImpl.LLAMADA_FUNCION));
		  assertThat(p).matches("fun()");
		  assertThat(p).matches("fun(a)");
		  assertThat(p).matches("fun(a,b)");
		  assertThat(p).notMatches("fun");
		  //assertThat(p).matches("funcion()");
		  //assertThat(p).notMatches("5");
		  //assertThat(p).notMatches("cuadrado(a)");
		  //assertThat(p).notMatches("prueba");
	  }
	  
	  @Test
	  public void asignacion_reallife() {
		  p.setRootRule(g.rule(VaryGrammarImpl.ASIGNACION_NORMAL));
		  assertThat(p).matches("a <- b");
		  assertThat(p).matches("a <- 0");
		  assertThat(p).notMatches("prueba");
		  assertThat(p).notMatches("5");
		  assertThat(p).matches("a <- b + 5");
		  
		  p.setRootRule(g.rule(VaryGrammarImpl.ASIGNACION_COMPLEJA));
		  assertThat(p).matches("a.campo <- b");
		  assertThat(p).matches("a[0] <- 0");
		  assertThat(p).notMatches("prueba");
		  assertThat(p).notMatches("5");
		  
		  p.setRootRule(g.rule(VaryGrammarImpl.ASIGNACION));
		  assertThat(p).matches("a <- b");
		  assertThat(p).matches("a <- 0");
		  assertThat(p).matches("res <- 1");
		  assertThat(p).matches("opcion <- 5");
		  assertThat(p).matches("a.campo <- b");
		  assertThat(p).matches("a[0] <- 0");
		  assertThat(p).matches("a <- fun()");
		  assertThat(p).matches("a <- fun(a,b)");
		  assertThat(p).matches("a <- fun(a,b) + 2");
		  assertThat(p).matches("variable <- w + reg.campoCadena");
		  assertThat(p).notMatches("prueba");
		  assertThat(p).notMatches("5");
		  
	  }
	  
	  @Test
	  public void tiposComplejosDeclaracion_reallife() {
		  p.setRootRule(g.rule(VaryGrammarImpl.REGISTRO));
		  assertThat(p).matches("registro: persona" + '\n' + "cadena: dni" + '\n' + "entero: edad" + '\n' + "cadena: nombre" + '\n' + "fin_registro");
		  assertThat(p).notMatches("5");
		  assertThat(p).notMatches("prueba");
		  assertThat(p).notMatches("entero: a");
	  }
	  
	  @Test
	  public void algoritmo_reallife() {
		  p.setRootRule(g.rule(VaryGrammarImpl.ALGORITMO));
		  assertThat(p).matches("Algoritmo prueba" + '\n' + "importa" + '\n' + "fin_importa" + '\n' + "const" + '\n' + "tipo" + '\n' + "var" + '\n' + "principal" + '\n' + "var" + '\n' + "inicio" + '\n' + "fin_inicio" + '\n' + "fin_algoritmo");
		  assertThat(p).matches("Algoritmo prueba" + '\n' + "importa" + '\n' + "fin_importa" + '\n' + "const" + '\n' + "tipo" + '\n' + "var" + '\n' + "entero: a" + '\n' + "entero: b" + '\n' + "principal" + '\n' + "var" + '\n' + "inicio" + '\n' + "fin_inicio" + '\n' + "fin_algoritmo");
		  assertThat(p).notMatches("5");
		  assertThat(p).notMatches("prueba");
	  }
	  
	  @Test
	  public void constantes_reallife() {
		  p.setRootRule(g.rule(VaryGrammarImpl.CONSTANTES));
		  assertThat(p).matches("DIM = 10");
		  //assertThat(p).matches("DIM2 = 20");
		  //assertThat(p).notMatches("a[0]");
		  //assertThat(p).notMatches("pepito");
	  }
	  
	  @Test
	  public void segun_reallife() {
		  p.setRootRule(g.rule(VaryGrammarImpl.SEGUN));
		  assertThat(p).matches("segun_sea(a) hacer" + '\n' + "caso 1: escribir(\"hola\")" + '\n' + "en_otro_caso: escribir(\"adios\")" + '\n' + "fin_segun");
	  }
	  
	  @Test
	  public void caso_reallife() {
		  p.setRootRule(g.rule(VaryGrammarImpl.CASO));
		  assertThat(p).matches("caso 1: a <- 0");
		  assertThat(p).matches("caso 1: escribir(\"hola\")");
	  }
	  
	  @Test
	  public void devolver_reallife() {
		  p.setRootRule(g.rule(VaryGrammarImpl.DEVOLVER));
		  assertThat(p).matches("devolver resultado");
	  }
	  
	  @Test
	  public void desde_reallife() {
		  p.setRootRule(g.rule(VaryGrammarImpl.DESDE));
		  assertThat(p).matches("desde i <- 0 hasta n hacer" + '\n' + "escribir(\"hola\")" + '\n' + "fin_desde");
	  }
	  
	  @Test
	  public void inicio_reallife() {
		  p.setRootRule(g.rule(VaryGrammarImpl.INICIO));
		  assertThat(p).matches("principal" + '\n' + "var" + '\n' + "entero: a" + '\n' + "inicio" + '\n' + "a <- 1 + 2" + '\n' + "fun(a)" + "\n" + "b <- 2 + a" + '\n' + "fin_inicio");
		  assertThat(p).matches("principal" + '\n' + "var" + '\n' + "entero: a" + '\n' + "inicio" + '\n' + "a <- 1 + 2" + '\n' + "escribir(\"hola\")" + "\n" + "b <- 2 + a" + '\n' + "fin_inicio");
		  assertThat(p).matches("principal" + '\n' + "var" + '\n' + "entero: a" + '\n' + "inicio" + '\n' + "a <- 1" + '\n' + "b <- 2" + '\n' + "fin_inicio");
		  assertThat(p).matches("principal" + '\n' + "var" + '\n' + "entero: a" + '\n' + "inicio" + '\n' + "v[0] <- 1" + '\n' + "v[1] <- 2" + '\n' + "fin_inicio");
	  }
	  
	  @Test
	  public void si_reallife() {
		 p.setRootRule(g.rule(VaryGrammarImpl.SI));
		 assertThat(p).matches("si v[j] > v[j+1] entonces" + "\n" + "fin_si");
	  }
}

