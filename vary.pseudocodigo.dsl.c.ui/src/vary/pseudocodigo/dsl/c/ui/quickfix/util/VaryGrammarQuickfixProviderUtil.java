package vary.pseudocodigo.dsl.c.ui.quickfix.util;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.ui.editor.quickfix.DefaultQuickfixProvider;

import vary.pseudocodigo.dsl.c.keywords.ReadKeywordsInterface;
import diagramapseudocodigo.Algoritmo;
import diagramapseudocodigo.And;
import diagramapseudocodigo.Asignacion;
import diagramapseudocodigo.AsignacionCompleja;
import diagramapseudocodigo.AsignacionNormal;
import diagramapseudocodigo.CampoRegistro;
import diagramapseudocodigo.Caracter;
import diagramapseudocodigo.Caso;
import diagramapseudocodigo.Comparacion;
import diagramapseudocodigo.ConstCadena;
import diagramapseudocodigo.Declaracion;
import diagramapseudocodigo.DeclaracionPropia;
import diagramapseudocodigo.DeclaracionVariable;
import diagramapseudocodigo.Division;
import diagramapseudocodigo.Enumerado;
import diagramapseudocodigo.Funcion;
import diagramapseudocodigo.Igualdad;
import diagramapseudocodigo.Inicio;
import diagramapseudocodigo.LlamadaFuncion;
import diagramapseudocodigo.Matriz;
import diagramapseudocodigo.Multiplicacion;
import diagramapseudocodigo.NumeroDecimal;
import diagramapseudocodigo.NumeroEntero;
import diagramapseudocodigo.Operador;
import diagramapseudocodigo.Or;
import diagramapseudocodigo.ParametroFuncion;
import diagramapseudocodigo.Procedimiento;
import diagramapseudocodigo.Registro;
import diagramapseudocodigo.Resta;
import diagramapseudocodigo.Subproceso;
import diagramapseudocodigo.Suma;
import diagramapseudocodigo.TipoComplejo;
import diagramapseudocodigo.TipoDefinido;
import diagramapseudocodigo.TipoExistente;
import diagramapseudocodigo.TipoVariable;
import diagramapseudocodigo.ValorBooleano;
import diagramapseudocodigo.ValorMatriz;
import diagramapseudocodigo.ValorRegistro;
import diagramapseudocodigo.ValorVector;
import diagramapseudocodigo.Variable;
import diagramapseudocodigo.VariableID;
import diagramapseudocodigo.Vector;
import diagramapseudocodigo.operacion;
import diagramapseudocodigo.segun;

public class VaryGrammarQuickfixProviderUtil {
	
	public static String buscarIndiceVector(String cadena) {
		String indice = "";
		boolean esIndice = false;
		for(int i=0; i<cadena.length(); i++) {
			if(cadena.charAt(i) == ']') {
				esIndice = false;
			}
			if(esIndice) {
				indice = indice + cadena.charAt(i);
			}
			if(cadena.charAt(i) == '[') {
				esIndice = true;
			}
		}
		return indice;
	}
	
	public static String buscarTipoVariableSubproceso(Asignacion asignacion, String cadenaError, ReadKeywordsInterface readerKeywords, List<Declaracion> declaraciones, List<ParametroFuncion> parametros, List<Declaracion> globales, List<TipoComplejo> complejos, List<Subproceso> subprocesos) {
		String tipo = new String();
		if(asignacion instanceof AsignacionNormal) {
			AsignacionNormal asignacionNormal = (AsignacionNormal) asignacion;
			if(asignacionNormal.getValor_asignacion().equals(cadenaError)) {
				if(asignacionNormal.getOperador() instanceof VariableID) {
					VariableID operador = (VariableID) asignacionNormal.getOperador();
					tipo = buscarTipoDeclaracion(declaraciones, operador.getNombre());
					if(tipo.equals("")) {
						tipo = buscarTipoParametro(parametros, operador.getNombre());
					}
					if(tipo.equals("")) {
						tipo = buscarTipoDeclaracion(globales, operador.getNombre());
					}
					if(tipo.equals("")) {
						tipo = readerKeywords.getBundle().getString("KEYWORD_ENTERO");
					}
				}
				else if(asignacionNormal.getOperador() instanceof NumeroEntero) {
					tipo = readerKeywords.getBundle().getString("KEYWORD_ENTERO");
				}
				else if(asignacionNormal.getOperador() instanceof NumeroDecimal) {
					tipo = readerKeywords.getBundle().getString("KEYWORD_REAL");
				}
				else if(asignacionNormal.getOperador() instanceof ConstCadena) {
					tipo = readerKeywords.getBundle().getString("KEYWORD_CADENA");
				}
				else if(asignacionNormal.getOperador() instanceof ValorBooleano) {
					tipo = readerKeywords.getBundle().getString("KEYWORD_LOGICO");
				}
				else if(asignacionNormal.getOperador() instanceof Caracter) {
					tipo = readerKeywords.getBundle().getString("KEYWORD_CARACTER");
				}
				else if(asignacionNormal.getOperador() instanceof LlamadaFuncion) {
					LlamadaFuncion llamada = (LlamadaFuncion) asignacionNormal.getOperador();
					tipo = buscarTipoFuncion(llamada, subprocesos);
				}
				else if(asignacionNormal.getOperador() instanceof ValorVector) {
					ValorVector vector = (ValorVector) asignacionNormal.getOperador();
					tipo = buscarTipoVariableVectorMatriz(vector.getNombre_vector(), declaraciones, complejos);
					if(tipo.equals("")) {
						tipo = buscarTipoParametroVectorMatriz(vector.getNombre_vector(), parametros, complejos);
					}
					
				}
				else if(asignacionNormal.getOperador() instanceof ValorMatriz) {
					ValorMatriz matriz = (ValorMatriz) asignacionNormal.getOperador();
					tipo = buscarTipoVariableVectorMatriz(matriz.getNombre_matriz(), declaraciones, complejos);
					if(tipo.equals("")) {
						tipo = buscarTipoParametroVectorMatriz(matriz.getNombre_matriz(), parametros, complejos);
					}
				}
				else if(asignacionNormal.getOperador() instanceof ValorRegistro) {
					ValorRegistro registro = (ValorRegistro) asignacionNormal.getOperador();
					tipo = buscarTipoVariableRegistro(registro.getNombre_registro(), registro.getCampo(), declaraciones,complejos);
					if(tipo.equals("")) {
						tipo = buscarTipoParametroRegistro(registro.getNombre_registro(), registro.getCampo(), parametros, complejos);
					}
				}
				else if(asignacionNormal.getOperador() instanceof operacion) {
					operacion op = (operacion) asignacionNormal.getOperador();
					tipo = buscarTipoOperacionParametros(op, declaraciones, parametros, subprocesos, complejos, readerKeywords);
				}
			} else {
				tipo = buscarTipoDeclaracion(declaraciones, asignacionNormal.getValor_asignacion());
				if(tipo.equals("")) {
					tipo = buscarTipoParametro(parametros, asignacionNormal.getValor_asignacion());
				}
				System.out.println("Estoy entrando en el nuevo else y tipo = "+tipo);
			}
		}
		System.out.println("El tipo encontrado es: "+tipo);
		return tipo;
	}
	
	public static String buscarTipoVariable(Asignacion asignacion, String cadenaError, ReadKeywordsInterface readerKeywords, List<Declaracion> declaraciones, List<Declaracion> globales, List<TipoComplejo> complejos, List<Subproceso> subprocesos) {
		String tipo = new String();
		System.out.println("Estoy en la funcion");
		if(asignacion instanceof AsignacionNormal) {
			System.out.println("Estoy en el if de la función");
			AsignacionNormal asignacionNormal = (AsignacionNormal) asignacion;
			if(asignacionNormal.getValor_asignacion().equals(cadenaError)) {
				if(asignacionNormal.getOperador() instanceof VariableID) {
					VariableID operador = (VariableID) asignacionNormal.getOperador();
					tipo = buscarTipoDeclaracion(declaraciones, operador.getNombre());
					if(tipo.equals("")) {
						tipo = buscarTipoDeclaracion(globales, operador.getNombre());
					}
					if(tipo.equals("")) {
						tipo = readerKeywords.getBundle().getString("KEYWORD_ENTERO");
					}
				}
				else if(asignacionNormal.getOperador() instanceof NumeroEntero) {
					tipo = readerKeywords.getBundle().getString("KEYWORD_ENTERO");
				}
				else if(asignacionNormal.getOperador() instanceof NumeroDecimal) {
					tipo = readerKeywords.getBundle().getString("KEYWORD_REAL");
				}
				else if(asignacionNormal.getOperador() instanceof ConstCadena) {
					tipo = readerKeywords.getBundle().getString("KEYWORD_CADENA");
				}
				else if(asignacionNormal.getOperador() instanceof ValorBooleano) {
					tipo = readerKeywords.getBundle().getString("KEYWORD_LOGICO");
				}
				else if(asignacionNormal.getOperador() instanceof Caracter) {
					tipo = readerKeywords.getBundle().getString("KEYWORD_CARACTER");
				}
				else if(asignacionNormal.getOperador() instanceof LlamadaFuncion) {
					LlamadaFuncion llamada = (LlamadaFuncion) asignacionNormal.getOperador();
					tipo = buscarTipoFuncion(llamada, subprocesos);
				}
				else if(asignacionNormal.getOperador() instanceof ValorVector) {
					ValorVector vector = (ValorVector) asignacionNormal.getOperador();
					tipo = buscarTipoVariableVectorMatriz(vector.getNombre_vector(), declaraciones, complejos);
					
				}
				else if(asignacionNormal.getOperador() instanceof ValorMatriz) {
					ValorMatriz matriz = (ValorMatriz) asignacionNormal.getOperador();
					tipo = buscarTipoVariableVectorMatriz(matriz.getNombre_matriz(), declaraciones, complejos);
				}
				else if(asignacionNormal.getOperador() instanceof ValorRegistro) {
					ValorRegistro registro = (ValorRegistro) asignacionNormal.getOperador();
					tipo = buscarTipoVariableRegistro(registro.getNombre_registro(), registro.getCampo(), declaraciones,complejos);
				}
				else if(asignacionNormal.getOperador() instanceof operacion) {
					operacion op = (operacion) asignacionNormal.getOperador();
					tipo = buscarTipoOperacion(op, declaraciones, subprocesos, complejos, readerKeywords);
				}
			} else {
				System.out.println("Estoy en el else de la funcion");
				tipo = buscarTipoDeclaracion(declaraciones, asignacionNormal.getValor_asignacion());
				System.out.println("Estoy entrando en el nuevo else y tipo = "+tipo);
			}
		}
		System.out.println("El tipo encontrado es: "+tipo);
		return tipo;
	}
	
	public static String buscarTipoOperacionParametros(operacion op, List<Declaracion> declaraciones, List<ParametroFuncion> parametros, List<Subproceso> subprocesos, List<TipoComplejo> complejos, ReadKeywordsInterface readerKeywords) {
		String tipoRight = new String();
		String tipoLeft = new String();
		if(esAritmetica(op)) {
			if(op instanceof Suma) {
				Suma suma = (Suma) op;
				if(esAritmetica(suma.getRight())) {
					tipoRight = buscarTipoOperacionParametros(suma.getRight(), declaraciones, parametros, subprocesos, complejos, readerKeywords);
				}
				if(esAritmetica(suma.getLeft())) {
					tipoLeft = buscarTipoOperacionParametros(suma.getLeft(), declaraciones, parametros, subprocesos, complejos, readerKeywords);
				}
				if(esBase(suma.getRight())) {
					tipoRight = buscarTipoBaseOperacionAritmetica(suma.getRight(), declaraciones, subprocesos, complejos, readerKeywords);
					if(tipoRight.equals("")) {
						tipoRight = buscarTipoBaseOperacionAritmeticaParametros(suma.getRight(), parametros, subprocesos, complejos, readerKeywords);
					}
				}
				if(esBase(suma.getLeft())) {
					tipoLeft = buscarTipoBaseOperacionAritmetica(suma.getLeft(), declaraciones, subprocesos, complejos, readerKeywords);
					if(tipoLeft.equals("")) {
						tipoLeft = buscarTipoBaseOperacionAritmeticaParametros(suma.getLeft(), parametros, subprocesos, complejos, readerKeywords);
					}
				}
			}
			else if(op instanceof Resta) {
				Resta resta = (Resta) op;
				if(esAritmetica(resta.getRight())) {
					tipoRight = buscarTipoOperacionParametros(resta.getRight(), declaraciones, parametros, subprocesos, complejos, readerKeywords);
				}
				if(esAritmetica(resta.getLeft())) {
					tipoLeft = buscarTipoOperacionParametros(resta.getLeft(), declaraciones, parametros, subprocesos, complejos, readerKeywords);
				}
				if(esBase(resta.getRight())) {
					tipoRight = buscarTipoBaseOperacionAritmetica(resta.getRight(), declaraciones, subprocesos, complejos, readerKeywords);
					if(tipoRight.equals("")) {
						tipoRight = buscarTipoBaseOperacionAritmeticaParametros(resta.getRight(), parametros, subprocesos, complejos, readerKeywords);
					}
				}
				if(esBase(resta.getLeft())) {
					tipoLeft = buscarTipoBaseOperacionAritmetica(resta.getLeft(), declaraciones, subprocesos, complejos, readerKeywords);
					if(tipoLeft.equals("")) {
						tipoLeft = buscarTipoBaseOperacionAritmeticaParametros(resta.getLeft(), parametros, subprocesos, complejos, readerKeywords);
					}
				}
			}
			else if(op instanceof Multiplicacion) {
				Multiplicacion multiplicacion = (Multiplicacion) op;
				if(esAritmetica(multiplicacion.getRight())) {
					tipoRight = buscarTipoOperacionParametros(multiplicacion.getRight(), declaraciones, parametros, subprocesos, complejos, readerKeywords);
				}
				if(esAritmetica(multiplicacion.getLeft())) {
					tipoLeft = buscarTipoOperacionParametros(multiplicacion.getLeft(), declaraciones, parametros, subprocesos, complejos, readerKeywords);
				}
				if(esBase(multiplicacion.getRight())) {
					tipoRight = buscarTipoBaseOperacionAritmetica(multiplicacion.getRight(), declaraciones, subprocesos, complejos, readerKeywords);
					if(tipoRight.equals("")) {
						tipoRight = buscarTipoBaseOperacionAritmeticaParametros(multiplicacion.getRight(), parametros, subprocesos, complejos, readerKeywords);
					}
				}
				if(esBase(multiplicacion.getLeft())) {
					tipoLeft = buscarTipoBaseOperacionAritmetica(multiplicacion.getLeft(), declaraciones, subprocesos, complejos, readerKeywords);
					if(tipoLeft.equals("")) {
						tipoLeft = buscarTipoBaseOperacionAritmeticaParametros(multiplicacion.getLeft(), parametros, subprocesos, complejos, readerKeywords);
					}
				}
			}
			else {
				Division division = (Division) op;
				if(esAritmetica(division.getRight())) {
					tipoRight = buscarTipoOperacionParametros(division.getRight(), declaraciones, parametros, subprocesos, complejos, readerKeywords);
				}
				if(esAritmetica(division.getLeft())) {
					tipoLeft = buscarTipoOperacionParametros(division.getLeft(), declaraciones, parametros, subprocesos, complejos, readerKeywords);
				}
				if(esBase(division.getRight())) {
					tipoRight = buscarTipoBaseOperacionAritmetica(division.getRight(), declaraciones, subprocesos, complejos, readerKeywords);
					if(tipoRight.equals("")) {
						tipoRight = buscarTipoBaseOperacionAritmeticaParametros(division.getRight(), parametros, subprocesos, complejos, readerKeywords);
					}
				}
				if(esBase(division.getLeft())) {
					tipoLeft = buscarTipoBaseOperacionAritmetica(division.getLeft(), declaraciones, subprocesos, complejos, readerKeywords);
					if(tipoLeft.equals("")) {
						tipoLeft = buscarTipoBaseOperacionAritmeticaParametros(division.getLeft(), parametros, subprocesos, complejos, readerKeywords);
					}
				}
			}
			System.out.println("TipoRight: "+tipoRight);
			System.out.println("TipoLefft: "+tipoLeft);
			if(tipoRight.equals(tipoLeft)) {
				return tipoRight;
			}
			else {
				if(tipoRight.equals(readerKeywords.getBundle().getString("KEYWORD_ENTERO")) || tipoLeft.equals(readerKeywords.getBundle().getString("KEYWORD_ENTERO"))) {
					return readerKeywords.getBundle().getString("KEYWORD_ENTERO");
				}
				else if(tipoRight.equals(readerKeywords.getBundle().getString("KEYWORD_CADENA")) || tipoLeft.equals(readerKeywords.getBundle().getString("KEYWORD_CADENA"))) {
					return readerKeywords.getBundle().getString("KEYWORD_CADENA");
				}
				else {
					return readerKeywords.getBundle().getString("KEYWORD_ENTERO");
				}
			}
		}
		else { //Si no es aritmetica es lógica
			return readerKeywords.getBundle().getString("KEYWORD_LOGICO");
		}
	}
	
	public static String buscarTipoOperacion(operacion op, List<Declaracion> declaraciones, List<Subproceso> subprocesos, List<TipoComplejo> complejos, ReadKeywordsInterface readerKeywords) {
		String tipoRight = new String();
		String tipoLeft = new String();
		if(esAritmetica(op)) {
			if(op instanceof Suma) {
				Suma suma = (Suma) op;
				if(esAritmetica(suma.getRight())) {
					tipoRight = buscarTipoOperacion(suma.getRight(), declaraciones, subprocesos, complejos, readerKeywords);
				}
				if(esAritmetica(suma.getLeft())) {
					tipoLeft = buscarTipoOperacion(suma.getLeft(), declaraciones, subprocesos, complejos, readerKeywords);
				}
				if(esBase(suma.getRight())) {
					tipoRight = buscarTipoBaseOperacionAritmetica(suma.getRight(), declaraciones, subprocesos, complejos, readerKeywords);
				}
				if(esBase(suma.getLeft())) {
					tipoLeft = buscarTipoBaseOperacionAritmetica(suma.getLeft(), declaraciones, subprocesos, complejos, readerKeywords);
				}
			}
			else if(op instanceof Resta) {
				Resta resta = (Resta) op;
				if(esAritmetica(resta.getRight())) {
					tipoRight = buscarTipoOperacion(resta.getRight(), declaraciones, subprocesos, complejos, readerKeywords);
				}
				if(esAritmetica(resta.getLeft())) {
					tipoLeft = buscarTipoOperacion(resta.getLeft(), declaraciones, subprocesos, complejos, readerKeywords);
				}
				if(esBase(resta.getRight())) {
					tipoRight = buscarTipoBaseOperacionAritmetica(resta.getRight(), declaraciones, subprocesos, complejos, readerKeywords);
				}
				if(esBase(resta.getLeft())) {
					tipoLeft = buscarTipoBaseOperacionAritmetica(resta.getLeft(), declaraciones, subprocesos, complejos, readerKeywords);
				}
			}
			else if(op instanceof Multiplicacion) {
				Multiplicacion multiplicacion = (Multiplicacion) op;
				if(esAritmetica(multiplicacion.getRight())) {
					tipoRight = buscarTipoOperacion(multiplicacion.getRight(), declaraciones, subprocesos, complejos, readerKeywords);
				}
				if(esAritmetica(multiplicacion.getLeft())) {
					tipoLeft = buscarTipoOperacion(multiplicacion.getLeft(), declaraciones, subprocesos, complejos, readerKeywords);
				}
				if(esBase(multiplicacion.getRight())) {
					tipoRight = buscarTipoBaseOperacionAritmetica(multiplicacion.getRight(), declaraciones, subprocesos, complejos, readerKeywords);
				}
				if(esBase(multiplicacion.getLeft())) {
					tipoLeft = buscarTipoBaseOperacionAritmetica(multiplicacion.getLeft(), declaraciones, subprocesos, complejos, readerKeywords);
				}
			}
			else {
				Division division = (Division) op;
				if(esAritmetica(division.getRight())) {
					tipoRight = buscarTipoOperacion(division.getRight(), declaraciones, subprocesos, complejos, readerKeywords);
				}
				if(esAritmetica(division.getLeft())) {
					tipoLeft = buscarTipoOperacion(division.getLeft(), declaraciones, subprocesos, complejos, readerKeywords);
				}
				if(esBase(division.getRight())) {
					tipoRight = buscarTipoBaseOperacionAritmetica(division.getRight(), declaraciones, subprocesos, complejos, readerKeywords);
				}
				if(esBase(division.getLeft())) {
					tipoLeft = buscarTipoBaseOperacionAritmetica(division.getLeft(), declaraciones, subprocesos, complejos, readerKeywords);
				}
			}
			System.out.println("TipoRight: "+tipoRight);
			System.out.println("TipoLefft: "+tipoLeft);
			if(tipoRight.equals(tipoLeft)) {
				return tipoRight;
			}
			else {
				if(tipoRight.equals(readerKeywords.getBundle().getString("KEYWORD_ENTERO")) || tipoLeft.equals(readerKeywords.getBundle().getString("KEYWORD_ENTERO"))) {
					return readerKeywords.getBundle().getString("KEYWORD_ENTERO");
				}
				else if(tipoRight.equals(readerKeywords.getBundle().getString("KEYWORD_CADENA")) || tipoLeft.equals(readerKeywords.getBundle().getString("KEYWORD_CADENA"))) {
					return readerKeywords.getBundle().getString("KEYWORD_CADENA");
				}
				else {
					return readerKeywords.getBundle().getString("KEYWORD_ENTERO");
				}
			}
		}
		else { //Si no es aritmetica es lógica
			return readerKeywords.getBundle().getString("KEYWORD_LOGICO");
		}
	}
	
	public static String buscarTipoBaseOperacionAritmeticaParametros(operacion op, List<ParametroFuncion> parametros, List<Subproceso> subprocesos, List<TipoComplejo> complejos, ReadKeywordsInterface readerKeywords) {
		if(op instanceof NumeroEntero) {
			return readerKeywords.getBundle().getString("KEYWORD_ENTERO");
		}
		else if(op instanceof NumeroDecimal) {
			return readerKeywords.getBundle().getString("KEYWORD_REAL");
		}
		else if(op instanceof ConstCadena) {
			return readerKeywords.getBundle().getString("KEYWORD_CADENA");
		}
		else if(op instanceof Caracter) {
			return readerKeywords.getBundle().getString("KEYWORD_CARACTER");
		}
		else if(op instanceof VariableID) {
			VariableID variable = (VariableID) op;
			return buscarTipoParametro(parametros, variable.getNombre());
		}
		else if(op instanceof LlamadaFuncion) {
			LlamadaFuncion llamada = (LlamadaFuncion) op;
			return buscarTipoFuncion(llamada, subprocesos);
		}
		else if(op instanceof ValorVector) {
			ValorVector vector = (ValorVector) op;
			return buscarTipoParametroVectorMatriz(vector.getNombre_vector(), parametros, complejos);
		}
		else if(op instanceof ValorMatriz) {
			ValorMatriz matriz = (ValorMatriz) op;
			return buscarTipoParametroVectorMatriz(matriz.getNombre_matriz(), parametros, complejos);
		}
		else {
			ValorRegistro registro = (ValorRegistro) op;
			return buscarTipoParametroRegistro(registro.getNombre_registro(), registro.getCampo(), parametros, complejos);
		}
	}
	
	public static String buscarTipoBaseOperacionAritmetica(operacion op, List<Declaracion> declaraciones, List<Subproceso> subprocesos, List<TipoComplejo> complejos, ReadKeywordsInterface readerKeywords) {
		if(op instanceof NumeroEntero) {
			return readerKeywords.getBundle().getString("KEYWORD_ENTERO");
		}
		else if(op instanceof NumeroDecimal) {
			return readerKeywords.getBundle().getString("KEYWORD_REAL");
		}
		else if(op instanceof ConstCadena) {
			return readerKeywords.getBundle().getString("KEYWORD_CADENA");
		}
		else if(op instanceof Caracter) {
			return readerKeywords.getBundle().getString("KEYWORD_CARACTER");
		}
		else if(op instanceof VariableID) {
			VariableID variable = (VariableID) op;
			return buscarTipoDeclaracion(declaraciones, variable.getNombre());
		}
		else if(op instanceof LlamadaFuncion) {
			LlamadaFuncion llamada = (LlamadaFuncion) op;
			return buscarTipoFuncion(llamada, subprocesos);
		}
		else if(op instanceof ValorVector) {
			ValorVector vector = (ValorVector) op;
			return buscarTipoVariableVectorMatriz(vector.getNombre_vector(), declaraciones, complejos);
		}
		else if(op instanceof ValorMatriz) {
			ValorMatriz matriz = (ValorMatriz) op;
			return buscarTipoVariableVectorMatriz(matriz.getNombre_matriz(), declaraciones, complejos);
		}
		else {
			ValorRegistro registro = (ValorRegistro) op;
			return buscarTipoVariableRegistro(registro.getNombre_registro(), registro.getCampo(), declaraciones, complejos);
		}
	}
	
	public static boolean esAritmetica(operacion op) {
		if(op instanceof Suma || op instanceof Resta || op instanceof Multiplicacion || 
				op instanceof Division) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static boolean esBase(operacion op) {
		if(op instanceof VariableID || op instanceof NumeroEntero || op instanceof NumeroDecimal ||
				op instanceof ConstCadena || op instanceof Caracter || op instanceof LlamadaFuncion ||
				op instanceof ValorVector || op instanceof ValorMatriz || op instanceof ValorRegistro) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static String buscarTipoParametroRegistro(String nombreVariable, List<CampoRegistro> campos, List<ParametroFuncion> parametros, List<TipoComplejo> complejos) {
		String tipoParametro = buscarTipoParametro(parametros, nombreVariable);
		return buscarTipoRegistroAux(tipoParametro, complejos, campos);
	}
	
	public static String buscarTipoRegistroAux(String tipoVariable, List<TipoComplejo> complejos, List<CampoRegistro> campos) {
		String tipoFinal = new String();
		
		for(TipoComplejo complejo: complejos) {
			if(complejo instanceof Registro) {
				Registro registro = (Registro) complejo;
				if(registro.getNombre().equals(tipoVariable)) {
					if(campos.size() == 1) {
						for(Declaracion declaracion: registro.getVariable()) {
							if(declaracion instanceof DeclaracionVariable) {
								DeclaracionVariable declaracionVariable = (DeclaracionVariable) declaracion;
								for(Variable variable: declaracionVariable.getVariable()) {
									if(variable.getNombre().equals(campos.get(0).getNombre_campo())) {
										tipoFinal = declaracionVariable.getTipo().getLiteral();
									}
								}
							} else {
								DeclaracionPropia declaracionPropia = (DeclaracionPropia) declaracion;
								for(Variable variable: declaracionPropia.getVariable()) {
									if(variable.getNombre().equals(campos.get(0).getNombre_campo())) {
										tipoFinal = declaracionPropia.getTipo();
									}
								}
							}
						}
					}
				}
			}
		}
		
		return tipoFinal;
	}
	
	public static String buscarTipoVariableRegistro(String nombreVariable, List<CampoRegistro> campos, List<Declaracion> declaraciones, List<TipoComplejo> complejos) {
		String tipoVariable = buscarTipoDeclaracion(declaraciones, nombreVariable);
		return buscarTipoRegistroAux(tipoVariable, complejos, campos);
	}
	
	public static String buscarTipoParametroVectorMatriz(String nombreVariable, List<ParametroFuncion> parametros, List<TipoComplejo> complejos) {
		String tipoParametro = buscarTipoParametro(parametros, nombreVariable);
		return buscarTipoVectorMatrizAux(tipoParametro, complejos);
	}
	
	public static String buscarTipoVectorMatrizAux(String tipoVariable, List<TipoComplejo> complejos) {
		String tipoFinal = new String();
		
		for(TipoComplejo complejo: complejos) {
			if(complejo instanceof Vector) {
				Vector vector = (Vector) complejo;
				if(vector.getNombre().equals(tipoVariable)) {
					if(vector.getTipo() instanceof TipoExistente) {
						TipoExistente tipo = (TipoExistente) vector.getTipo();
						tipoFinal = tipo.getTipo().getLiteral();
					}
					else {
						TipoDefinido tipo = (TipoDefinido) vector.getTipo();
						tipoFinal = tipo.getTipo();
					}
				}
			}
			else if(complejo instanceof Matriz) {
				Matriz matriz = (Matriz) complejo;
				if(matriz.getNombre().equals(tipoVariable)) {
					if(matriz.getTipo() instanceof TipoExistente) {
						TipoExistente tipo = (TipoExistente) matriz.getTipo();
						tipoFinal = tipo.getTipo().getLiteral();
					}
					else {
						TipoDefinido tipo = (TipoDefinido) matriz.getTipo();
						tipoFinal = tipo.getTipo();
					}
				}
			}
		}
		
		return tipoFinal;
	}
	
	public static String buscarTipoVariableVectorMatriz(String nombreVariable, List<Declaracion> declaraciones, List<TipoComplejo> complejos) {
		String tipoVariable = buscarTipoDeclaracion(declaraciones, nombreVariable);
		return buscarTipoVectorMatrizAux(tipoVariable, complejos);
	}
	
	public static String buscarTipoFuncion(LlamadaFuncion llamada, List<Subproceso> subprocesos) {
		String tipo = new String();
		for(Subproceso s: subprocesos) {
			if(s instanceof Funcion) {
				Funcion funcion = (Funcion) s;
				if(funcion.getNombre().equals(llamada.getNombre()) && funcion.getParametrofuncion().size() == llamada.getOperadores().size()) {
					tipo = funcion.getTipo().getLiteral();
				}
			}
		}
		return tipo;
	}
	
	public static String buscarTipoParametro(List<ParametroFuncion> parametros, String nombreVariable) {
		String tipo = "";
		for(ParametroFuncion parametro : parametros) {
			System.out.println("Parametro nombre: "+parametro.getVariable().getNombre());
			System.out.println("Variable nombre: "+nombreVariable);
			if(parametro.getVariable().getNombre().equals(nombreVariable)) {
				if(parametro.getTipo() instanceof TipoDefinido) {
					TipoDefinido tipoDefinido = (TipoDefinido) parametro.getTipo();
					tipo = tipoDefinido.getTipo();
				}
				else {
					TipoExistente tipoExistente = (TipoExistente) parametro.getTipo();
					tipo = tipoExistente.getTipo().getLiteral();
				}
			}
		}
		return tipo;
	}
	
	public static String buscarTipoDeclaracion(List<Declaracion> declaraciones, String nombreVariable) {
		String tipo = "";
		for(Declaracion declaracion: declaraciones) {
			if(declaracion instanceof DeclaracionVariable) {
				DeclaracionVariable declaracionVariable = (DeclaracionVariable) declaracion;
				for(Variable v: declaracionVariable.getVariable()) {
					if(v.getNombre().equals(nombreVariable)) {
						tipo = declaracionVariable.getTipo().getLiteral();
					}
				}
			} else {
				DeclaracionPropia declaracionPropia = (DeclaracionPropia) declaracion;
				for(Variable v: declaracionPropia.getVariable()) {
					if(v.getNombre().equals(nombreVariable)) {
						tipo = declaracionPropia.getTipo();
					}
				}
			}
		}
		return tipo;
	}
	
	public static String buscarTipoParametroLlamada(LlamadaFuncion llamada, String cadenaError, List<Subproceso> subprocesos) {
		String tipo = new String();
		for(Subproceso s: subprocesos) {
			if(s instanceof Funcion) {
				Funcion funcion = (Funcion) s;
				if(funcion.getNombre().equals(llamada.getNombre()) && funcion.getParametrofuncion().size() == llamada.getOperadores().size()) {
					for(operacion op: llamada.getOperadores()) {
						if(op instanceof VariableID) {
							VariableID variable = (VariableID) op;
							if(variable.getNombre().equals(cadenaError)) {
								ParametroFuncion parametro = funcion.getParametrofuncion().get(llamada.getOperadores().indexOf(op));
								if(parametro.getTipo() instanceof TipoDefinido) {
									TipoDefinido tipoDefinido = (TipoDefinido) parametro.getTipo();
									tipo = tipoDefinido.getTipo();
								} else {
									TipoExistente tipoExistente = (TipoExistente) parametro.getTipo();
									tipo = tipoExistente.getTipo().getLiteral();
								}
							}
						}
					}
				}
			} else {
				Procedimiento procedimiento = (Procedimiento) s;
				if(procedimiento.getNombre().equals(llamada.getNombre()) && procedimiento.getParametrofuncion().size() == llamada.getOperadores().size()) {
					for(operacion op: llamada.getOperadores()) {
						if(op instanceof VariableID) {
							VariableID variable = (VariableID) op;
							if(variable.getNombre().equals(cadenaError)) {
								ParametroFuncion parametro = procedimiento.getParametrofuncion().get(llamada.getOperadores().indexOf(op));
								if(parametro.getTipo() instanceof TipoDefinido) {
									TipoDefinido tipoDefinido = (TipoDefinido) parametro.getTipo();
									tipo = tipoDefinido.getTipo();
								} else {
									TipoExistente tipoExistente = (TipoExistente) parametro.getTipo();
									tipo = tipoExistente.getTipo().getLiteral();
								}
							}
						}
					}
				}
			}
		}
		return tipo;
	}
	
	public static String buscarTipoVariableSegun(segun s, ReadKeywordsInterface readerKeywords) {
		String tipo = new String();
		if(s.getCaso().get(0).getOperador() instanceof NumeroEntero) {
			tipo = readerKeywords.getBundle().getString("KEYWORD_ENTERO");
		}
		else if(s.getCaso().get(0).getOperador() instanceof Caracter) {
			tipo = readerKeywords.getBundle().getString("KEYWORD_CARACTER");
		}
		else if(s.getCaso().get(0).getOperador() instanceof ConstCadena) {
			tipo = readerKeywords.getBundle().getString("KEYWORD_CADENA");
		}
		else if(s.getCaso().get(0).getOperador() instanceof NumeroDecimal) {
			tipo = readerKeywords.getBundle().getString("KEYWORD_REAL");
		}
		return tipo;
	}
	
	
}
