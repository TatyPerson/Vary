package vary.pseudocodigo.dsl.c.validation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.EList;

import vary.pseudocodigo.dsl.c.generator.util.IdiomaProyecto;
import diagramapseudocodigo.And;
import diagramapseudocodigo.Archivo;
import diagramapseudocodigo.Caracter;
import diagramapseudocodigo.Comparacion;
import diagramapseudocodigo.ConstCadena;
import diagramapseudocodigo.Constantes;
import diagramapseudocodigo.Declaracion;
import diagramapseudocodigo.DeclaracionPropia;
import diagramapseudocodigo.DeclaracionVariable;
import diagramapseudocodigo.DiagramapseudocodigoPackage;
import diagramapseudocodigo.Division;
import diagramapseudocodigo.Enumerado;
import diagramapseudocodigo.Funcion;
import diagramapseudocodigo.Igualdad;
import diagramapseudocodigo.Inicio;
import diagramapseudocodigo.LlamadaFuncion;
import diagramapseudocodigo.Matriz;
import diagramapseudocodigo.Multiplicacion;
import diagramapseudocodigo.Negacion;
import diagramapseudocodigo.Negativa;
import diagramapseudocodigo.NumeroDecimal;
import diagramapseudocodigo.NumeroEntero;
import diagramapseudocodigo.Operador;
import diagramapseudocodigo.Or;
import diagramapseudocodigo.ParametroFuncion;
import diagramapseudocodigo.Registro;
import diagramapseudocodigo.Resta;
import diagramapseudocodigo.Sentencias;
import diagramapseudocodigo.Subproceso;
import diagramapseudocodigo.Subrango;
import diagramapseudocodigo.Suma;
import diagramapseudocodigo.Tipo;
import diagramapseudocodigo.TipoComplejo;
import diagramapseudocodigo.TipoDefinido;
import diagramapseudocodigo.TipoExistente;
import diagramapseudocodigo.ValorBooleano;
import diagramapseudocodigo.ValorMatriz;
import diagramapseudocodigo.ValorRegistro;
import diagramapseudocodigo.ValorVector;
import diagramapseudocodigo.Variable;
import diagramapseudocodigo.VariableID;
import diagramapseudocodigo.Vector;
import diagramapseudocodigo.operacion;
import diagramapseudocodigo.signo;
import diagramapseudocodigo.valor;

public class VaryGrammarValidatorAux extends AbstractVaryGrammarValidator {
	
	protected Map<String,String> registrarVariablesTipadas(List<Declaracion> declaraciones) {
		Map<String,String> variablesDeclaradas = new HashMap<String,String>();
		for(Declaracion d: declaraciones) {
			if(d instanceof DeclaracionVariable) {
				DeclaracionVariable dec = (DeclaracionVariable) d;
				//Registramos todas las variables declaradas y sus respectivos tipos
				//Nota: No se comprueba si están repetidas porque ya hay una función que se encarga de ello.
				for(Variable var: dec.getVariable()) {
					variablesDeclaradas.put(var.getNombre(), dec.getTipo().getName());
				}
			}
			else if(d instanceof DeclaracionPropia) {
				DeclaracionPropia dec = (DeclaracionPropia) d;
				//Registramos todas las variables declaradas y sus respectivos tipos
				//Nota: No se comprueba si están repetidas porque ya hay una función que se encarga de ello.
				for(Variable var: dec.getVariable()) {
					variablesDeclaradas.put(var.getNombre(), dec.getTipo());
				}
			}
		}
		return variablesDeclaradas;
	}
	
	protected Map<String,String> registrarGlobalesTipadas(List<Declaracion> globales, List<Declaracion> variables) {
		List<String> nombresGlobales = registrarVariables(globales);
		List<String> nombresVariables = registrarVariables(variables);		
		List<String> variablesRepetidas = new ArrayList<String>();
		
		//Registramos las que estan repetidas en ambos lugares
		for(String s: nombresGlobales) {
			if(nombresVariables.contains(s)) {
				variablesRepetidas.add(s);
			}
		}
		
		//Ahora registramos en el map las que no estan repetidas solamente
		
		Map<String,String> variablesDeclaradas = new HashMap<String,String>();
		
		for(Declaracion d: globales) {
			if(d instanceof DeclaracionVariable) {
				DeclaracionVariable dec = (DeclaracionVariable) d;
				//Registramos las variables que no han sido declaradas en el cuerpo de la función como locales
				for(Variable var: dec.getVariable()) {
					if(!variablesRepetidas.contains(var.getNombre())) {
						variablesDeclaradas.put(var.getNombre(), dec.getTipo().getName());
					}
				}
			}
			else if(d instanceof DeclaracionPropia) {
				DeclaracionPropia dec = (DeclaracionPropia) d;
				//Registramos las variables que no han sido declaradas en el cuerpo de la función como locales
				for(Variable var: dec.getVariable()) {
					if(!variablesRepetidas.contains(var.getNombre())) {
						variablesDeclaradas.put(var.getNombre(), dec.getTipo());
					}
				}
			}
		}
		
		return variablesDeclaradas;
		
	}
	
	protected Map<String,String> registrarConstantesTipadas(List<Constantes> constantes) {
		Map<String,String> constantesTipadas = new HashMap<String,String>();
		
		for(Constantes c: constantes) {
			if(c.getValor() instanceof NumeroEntero) {
				constantesTipadas.put(c.getVariable().getNombre(), "entero");
			}
			else if(c.getValor() instanceof NumeroDecimal) {
				constantesTipadas.put(c.getVariable().getNombre(), "real");
			}
			else if(c.getValor() instanceof ConstCadena) {
				constantesTipadas.put(c.getVariable().getNombre(), "cadena");
			}
			else if(c.getValor() instanceof Caracter) {
				constantesTipadas.put(c.getVariable().getNombre(), "caracter");
			}
			else if(c.getValor() instanceof ValorBooleano) {
				constantesTipadas.put(c.getVariable().getNombre(), "logico");
			}
		}
		
		return constantesTipadas;
		
	}
	
	protected Map<String,String> registrarParametrosTipados(List<ParametroFuncion> parametros) {
		Map<String,String> parametrosTipados = new HashMap<String,String>();
		for(ParametroFuncion p: parametros) {
			if(p.getTipo() instanceof TipoDefinido) {
				TipoDefinido tipo = (TipoDefinido) p.getTipo();
				parametrosTipados.put(p.getVariable().getNombre(), tipo.getTipo());
			}
			else if(p.getTipo() instanceof TipoExistente) {
				TipoExistente tipo = (TipoExistente) p.getTipo();
				parametrosTipados.put(p.getVariable().getNombre(), tipo.getTipo().getName());
			}
		}
		return parametrosTipados;
	}
	
	/*
	protected void checkLlamadasInicio(Inicio i, List<String> tipos, String nombre, int parametros) {
		//Recogemos todas las variables que hay declaradas con sus respectivos tipos para buscar luego las necesarias (no hay repetidas)
		Map<String,String> variablesDeclaradas = registrarVariablesTipadas(i.getDeclaracion());
		List<String> nombresVariables = new ArrayList<String>();
		for(Sentencias s: i.getTiene()) {
			if(s instanceof LlamadaFuncion) {
				LlamadaFuncion f = (LlamadaFuncion) s;
				if(f.getNombre().equals(nombre) && f.getOperador().size() == parametros) {
					for(valor val: f.getOperador()) {
						if(val instanceof Operador) {
							Operador o = (Operador) val;
							if(o instanceof VariableID) {
								VariableID v = (VariableID) o;
								nombresVariables.add(v.getNombre());	
							}
						}
					}
					boolean correcto = true; 
					for(String n: nombresVariables) {
						if(variablesDeclaradas.get(n) != tipos.get(nombresVariables.indexOf(n))) {
							correcto = false;
						}
					}
					if(!correcto) {
						error("Los tipos de las variables no coinciden con los de la declaración de la cabecera de la función", f, DiagramapseudocodigoPackage.Literals.LLAMADA_FUNCION__NOMBRE);
					}
				}
			}
		}
	}*/
	
	protected List<String> registrarTipos(List<TipoComplejo> tipoComplejo) {
		List<String> tipos = new ArrayList<String>();
		
		for(TipoComplejo com: tipoComplejo) {
			if(com instanceof Vector) {
				Vector v = (Vector) com;
				tipos.add(v.getNombre());
			}
			else if(com instanceof Matriz) {
				Matriz m = (Matriz) com;
				tipos.add(m.getNombre());
			}
			else if(com instanceof Registro) {
				Registro r = (Registro) com;
				tipos.add(r.getNombre());
			}
			else if(com instanceof Enumerado) {
				Enumerado e = (Enumerado) com;
				tipos.add(e.getNombre());
			}
			else if(com instanceof Archivo) {
				Archivo a = (Archivo) com;
				tipos.add(a.getNombre());
			}
			else {
				Subrango s = (Subrango) com;
				tipos.add(s.getNombre());
			}
		}
		
		return tipos;
	}
	
	protected List<String> registrarVariables(List<Declaracion> declaraciones) {
		List<String> variables = new ArrayList<String>();
		for(Declaracion d: declaraciones) {
			if(d instanceof DeclaracionVariable) {
				DeclaracionVariable dec = (DeclaracionVariable) d;
				for(Variable v: dec.getVariable()) {
					variables.add(v.getNombre());
				}
			}
			else {
				DeclaracionPropia dec = (DeclaracionPropia) d;
				for(Variable v: dec.getVariable()) {
					variables.add(v.getNombre());
				}
			}
		}
		return variables;
	}
	
	protected List<String> registrarConstantes(List<Constantes> constantes) {
		List<String> constantesAux = new ArrayList<String>();
		for(Constantes c: constantes) {
			constantesAux.add(c.getVariable().getNombre());
		}
		return constantesAux;
	}
	
	protected List<String> registrarParametros(List<ParametroFuncion> parametros) {
		List<String> parametrosDeclarados = new ArrayList<String>();
		for(ParametroFuncion p: parametros) {
			//Registramos los tipos que requiere la función en su cabecera
			parametrosDeclarados.add(p.getVariable().getNombre());
		}
		return parametrosDeclarados;
	}
	
	private String prioridadTipoOperacion(String tipo1, String tipo2) {
		String salida = "";
		if(tipo1.equals("cadena")) {
			salida = tipo1;
		}
		else if(tipo2.equals("cadena")) {
			salida = tipo2;
		}
		else if(tipo1.equals("entero") && tipo2.equals("real")) {
			salida = tipo1;
		}
		else if(tipo1.equals("real") && tipo2.equals("entero")) {
			salida = tipo2;
		}
		else if(tipo1.equals("logico") && tipo2.equals("entero") || tipo2.equals("real")) {
			salida = tipo2;
		}
		else if(tipo2.equals("logico") && tipo1.equals("entero") || tipo1.equals("real")) {
			salida = tipo1;
		}
		else if(tipo1.equals("caracter") && tipo2.equals("entero") || tipo2.equals("real")) {
			salida = tipo2;
		}
		else if(tipo1.equals("caracter") && tipo2.equals("entero") || tipo2.equals("real")) {
			salida = tipo2;
		}
		return salida;
	}
	
	private String getValorTotalOperacion(List<valor> valores, Map<String,String> variablesDeclaradas, Map<String,String> tiposVectoresMatrices, Map<String,HashMap<String,String>> tiposRegistros) {
		List<String> tipos = new ArrayList<String>();
		for(valor v: valores) {
			if(v instanceof Operador) {
				Operador op = (Operador) v;
				if(op instanceof VariableID) {
					//Si es una variable vamos a buscar de que tipo es
					VariableID var = (VariableID) op;
					tipos.add(variablesDeclaradas.get(var.getNombre()));
						
				}
				else if(op instanceof ValorVector) {
					ValorVector vector = (ValorVector) op;
					//Si es un vector vamos a ver de que tipo es
					if(vector.getCampo().size() == 0) {
						tipos.add(tiposVectoresMatrices.get(variablesDeclaradas.get(vector.getNombre_vector())));
					}
					else {
						//Cogemos el último campo:
						tipos.add(tiposRegistros.get(tiposVectoresMatrices.get(variablesDeclaradas.get(vector.getNombre_vector()))).get(vector.getCampo().get(vector.getCampo().size()-1)));
					}
				}
				else if(op instanceof ValorMatriz) {
					ValorMatriz matriz = (ValorMatriz) op;
					//Si es una matriz vamos a ver de que tipo es
					if(matriz.getCampo().size() == 0) {
						tipos.add(tiposVectoresMatrices.get(variablesDeclaradas.get(matriz.getNombre_matriz())));
					}
					else {
						//Cogemos el último campo:
						tipos.add(tiposRegistros.get(tiposVectoresMatrices.get(variablesDeclaradas.get(matriz.getNombre_matriz()))).get(matriz.getCampo().get(matriz.getCampo().size()-1)));
					}
				}
				else if(op instanceof ValorRegistro) {
					ValorRegistro registro = (ValorRegistro) op;
					//Si es un registro vemos de que tipo es:
					tipos.add(tiposRegistros.get(variablesDeclaradas.get(registro.getNombre_registro())).get(registro.getCampo().get(registro.getCampo().size()-1).getNombre_campo()));

				}
				else if(op instanceof NumeroEntero) {
					tipos.add("entero");
				}
				else if(op instanceof NumeroDecimal) {
					tipos.add("real");
				}
				else if(op instanceof ValorBooleano) {
					tipos.add("logico");
				}
				else if(op instanceof ConstCadena) {
					tipos.add("cadena");
				}
				else if(op instanceof Caracter) {
					tipos.add("caracter");
				}
			}
		}
		//Por ahora solo 2 operadores
		return prioridadTipoOperacion(tipos.get(0), tipos.get(1));
	}

	protected void registrarParametros(List<operacion> operaciones, List<String> nombresVariables, Map<String,String> nombresVariablesCampos, List<String> tiposNativos, Map<String,String> variablesDeclaradas, Map<String,String> tiposVectoresMatrices, Map<String,HashMap<String,String>> tiposRegistros, List<String> nombresValoresComplejos) {
		for(operacion op: operaciones) { 
			if(op instanceof Operador) {
				Operador o = (Operador) op;
				if(o instanceof VariableID) {
					VariableID v = (VariableID) o;
					nombresVariables.add(v.getNombre());	
				}
				else if(o instanceof ValorVector) {
					ValorVector v = (ValorVector) o;
					nombresVariables.add(v.getNombre_vector());
					nombresValoresComplejos.add(v.getNombre_vector());
					if(v.getCampo().size() != 0) {
						nombresVariablesCampos.put(v.getNombre_vector(), v.getCampo().get(v.getCampo().size()-1).getNombre_campo());
					}
				}
				else if(o instanceof ValorMatriz) {
					ValorMatriz m = (ValorMatriz) o;
					nombresVariables.add(m.getNombre_matriz());
					nombresValoresComplejos.add(m.getNombre_matriz());
					if(m.getCampo().size() != 0) {
						nombresVariablesCampos.put(m.getNombre_matriz(), m.getCampo().get(m.getCampo().size()-1).getNombre_campo());
					}
				}
				else if(o instanceof ValorRegistro) {
					ValorRegistro r = (ValorRegistro) o;
					nombresVariables.add(r.getNombre_registro());
					nombresValoresComplejos.add(r.getNombre_registro());
					String campo = r.getCampo().get(r.getCampo().size()-1).getNombre_campo();
					nombresVariablesCampos.put(r.getNombre_registro(), campo);
				}
				else if(o instanceof NumeroEntero) {
					nombresVariables.add("tipoNativo");
					tiposNativos.add("entero");
				}
				else if(o instanceof NumeroDecimal) {
					nombresVariables.add("tipoNativo");
					tiposNativos.add("real");
				}
				else if(o instanceof ValorBooleano) {
					nombresVariables.add("tipoNativo");
					tiposNativos.add("logico");
				}
				else if(o instanceof ConstCadena) {
					nombresVariables.add("tipoNativo");
					tiposNativos.add("cadena");
				}
				else if(o instanceof Caracter) {
					nombresVariables.add("tipoNativo");
					tiposNativos.add("caracter");
				}
			}
			else if(esOperacion(op)) {
				ArrayList<valor> valoresAux = new ArrayList<valor>();
				valoresAux = registrarValoresOperacion(op, valoresAux);
				String tipoOperacion = getValorTotalOperacion(valoresAux, variablesDeclaradas, tiposVectoresMatrices, tiposRegistros);
				nombresVariables.add("tipoNativo");
				tiposNativos.add(tipoOperacion);
			}
		}
	}
	
	protected String getCadenaTiposCorrectos(List<String> tipos) {
		String salidaCorrecta = "";
		for(int i=0; i < tipos.size()-1; i++) {
			salidaCorrecta += tipos.get(i) + ", ";
		}
		salidaCorrecta += tipos.get(tipos.size()-1);
		return salidaCorrecta;
	}
	
	protected String getCadenaTiposIncorrectos(List<String> nombresVariablesUsadas, Map<String,String> variablesDeclaradas, Map<String,String> tiposVectoresMatrices, Map<String,HashMap<String,String>> tiposRegistros, Map<String,String> nombresVariablesCampos, List<String> tiposNativos, List<String> nombresValoresComplejos) {
		String salidaIncorrecta = "";
		int tiposNativosUsados = 0;
		for(int i=0; i < nombresVariablesUsadas.size()-1; i++) {
			if(nombresVariablesUsadas.get(i) == "tipoNativo") {
				salidaIncorrecta += tiposNativos.get(tiposNativosUsados) + ", ";
				tiposNativosUsados++;
			}
			else if(tiposVectoresMatrices.containsKey(variablesDeclaradas.get(nombresVariablesUsadas.get(i))) && nombresValoresComplejos.contains(nombresVariablesUsadas.get(i))) {
				//Si lo contiene es un vector o una matriz
				if(!nombresVariablesCampos.containsKey(nombresVariablesUsadas.get(i))) {
					salidaIncorrecta += tiposVectoresMatrices.get(variablesDeclaradas.get(nombresVariablesUsadas.get(i))) + ", ";
				}
				else {
					//Cogemos el último campo:
					salidaIncorrecta += tiposRegistros.get(tiposVectoresMatrices.get(variablesDeclaradas.get(i))).get(nombresVariablesCampos.get(nombresVariablesUsadas.get(i))) + ", ";
				}
			}
			else if(tiposRegistros.containsKey(variablesDeclaradas.get(nombresVariablesUsadas.get(i))) && nombresVariablesCampos.get(nombresVariablesUsadas.get(i)) != null && nombresValoresComplejos.contains(nombresVariablesUsadas.get(i))) {
				//Si lo contiene es un registro y si además tiene un campo es que es del tipo nombreRegistro.campo, por lo tanto debemos averiguar de que tipo es ese campo.
				salidaIncorrecta += tiposRegistros.get(variablesDeclaradas.get(nombresVariablesUsadas.get(i))).get(nombresVariablesCampos.get(nombresVariablesUsadas.get(i))) + ", ";

			}
			else {
				salidaIncorrecta += variablesDeclaradas.get(nombresVariablesUsadas.get(i)) + ", ";
			}
		}
		if(nombresVariablesUsadas.get(nombresVariablesUsadas.size()-1) == "tipoNativo") {
			salidaIncorrecta += tiposNativos.get(tiposNativosUsados);
		}
		else if(tiposVectoresMatrices.containsKey(variablesDeclaradas.get(nombresVariablesUsadas.get(nombresVariablesUsadas.size()-1))) && nombresValoresComplejos.contains(nombresVariablesUsadas.get(nombresVariablesUsadas.size()-1))) {
			//Si lo contiene es un vector o una matriz
			if(!nombresVariablesCampos.containsKey(nombresVariablesUsadas.get(nombresVariablesUsadas.size()-1))) {
				salidaIncorrecta += tiposVectoresMatrices.get(variablesDeclaradas.get(nombresVariablesUsadas.get(nombresVariablesUsadas.size()-1)));
			}
			else {
				//Cogemos el último campo:
				salidaIncorrecta += tiposRegistros.get(tiposVectoresMatrices.get(variablesDeclaradas.get(nombresVariablesUsadas.get(nombresVariablesUsadas.size()-1)))).get(nombresVariablesCampos.get(nombresVariablesUsadas.get(nombresVariablesUsadas.size()-1)));
			}
		}
		else if(tiposRegistros.containsKey(variablesDeclaradas.get(nombresVariablesUsadas.get(nombresVariablesUsadas.size()-1))) && nombresVariablesCampos.get(nombresVariablesUsadas.get(nombresVariablesUsadas.size()-1)) != null && nombresValoresComplejos.contains(nombresVariablesUsadas.get(nombresVariablesUsadas.size()-1))) {
			//Si lo contiene es un registro
			salidaIncorrecta += tiposRegistros.get(variablesDeclaradas.get(nombresVariablesUsadas.get(nombresVariablesUsadas.size()-1))).get(nombresVariablesCampos.get(nombresVariablesUsadas.get(nombresVariablesUsadas.size()-1)));

		}
		else {
			salidaIncorrecta += variablesDeclaradas.get(nombresVariablesUsadas.get(nombresVariablesUsadas.size()-1));
		}
		
		return salidaIncorrecta;
	}
	
	protected String getTipoParametro(Tipo tipo) {
		if(tipo instanceof TipoExistente) {
			TipoExistente t = (TipoExistente) tipo;
			return t.getTipo().getName();
		}
		else {
			TipoDefinido t = (TipoDefinido) tipo;
			return t.getTipo();
		}
	}
	
	protected Map<String,String> registrarTiposNativosdeComplejos(List<TipoComplejo> complejos) {
		Map<String,String> tiposNativos = new HashMap<String,String>();
		for(TipoComplejo t: complejos) {
			if(t instanceof Vector) {
				Vector v = (Vector) t;
				tiposNativos.put(v.getNombre(), getTipoParametro(v.getTipo()));
			}
			else if(t instanceof Matriz) {
				Matriz m = (Matriz) t;
				tiposNativos.put(m.getNombre(), getTipoParametro(m.getTipo()));
			}
		}
		return tiposNativos;
	}

	protected Map<String,HashMap<String,String>>registrarTiposNativosRegistros(List<TipoComplejo> complejos) {
		Map<String,HashMap<String,String>> tiposNativos = new HashMap<String,HashMap<String,String>>();
		for(TipoComplejo t: complejos) {
			if(t instanceof Registro) {
				Registro r = (Registro) t;
				tiposNativos.put(r.getNombre(), registrarCamposRegistro(r.getVariable()));
			}
		}
		return tiposNativos;
	}
	
	/*
	
	protected boolean comprobarCorreccionTiposLlamada(List<String> nombres, Map<String,String> variablesDeclaradas, List<String> tipos) {
		boolean tiposCorrectos = true;
		for(String n: nombres) {
			if(variablesDeclaradas.get(n) != tipos.get(nombres.indexOf(n)) && variablesDeclaradas.containsKey(n)) {
				tiposCorrectos = false;
			}
		}
		return tiposCorrectos;
	}
	
	/*
	 * 
	 */
	
	protected List<String> getTiposCabecera(List<ParametroFuncion> parametros) {
		List<String> tipos = new ArrayList<String>();
		for(ParametroFuncion p: parametros) {
			//Registramos los tipos que requiere la función en su cabecera
			tipos.add(getTipoParametro(p.getTipo()));
		}
		return tipos;
	}
	
	protected void getTiposCabecera(List<ParametroFuncion> parametros, Map<String,String> variablesDeclaradas) {
		for(ParametroFuncion p: parametros) {
			//Registramos los tipos que requiere la función en su cabecera
			variablesDeclaradas.put(p.getVariable().getNombre(), getTipoParametro(p.getTipo()));
		}
	}
	
	/*
	 * 
	 */
	
	protected boolean esOperacion(operacion op) {
		if(op instanceof Suma | op instanceof Resta | op instanceof Multiplicacion | op instanceof Division | op instanceof Or | op instanceof And | op instanceof Comparacion | op instanceof Igualdad | op instanceof Negativa | op instanceof Negacion) {
			return true;
		}
		else {
			return false;
		}
	}
	
	protected boolean esOperacion(valor v) {
		if(v instanceof Suma | v instanceof Resta | v instanceof Multiplicacion | v instanceof Division | v instanceof Or | v instanceof And | v instanceof Comparacion | v instanceof Igualdad | v instanceof Negativa | v instanceof Negacion) {
			return true;
		}
		else {
			return false;
		}
	}

	protected ArrayList<valor> registrarValoresOperacion(operacion op, ArrayList<valor> valores) {
		if(op instanceof Suma) {
			Suma suma = (Suma) op;
			if(esOperacion(suma.getLeft()) && esOperacion(suma.getRight())) {
				registrarValoresOperacion(suma.getLeft(), valores);
				registrarValoresOperacion(suma.getRight(), valores);
			}
			else if(!esOperacion(suma.getLeft()) && esOperacion(suma.getRight())) {
				registrarValoresOperacion(suma.getRight(), valores);
				valores.add(suma.getLeft());
			}
			else if(esOperacion(suma.getLeft()) && !esOperacion(suma.getRight())) {
				registrarValoresOperacion(suma.getLeft(), valores);
				valores.add(suma.getRight());
			}
			else {
				valores.add(suma.getLeft());
				valores.add(suma.getRight());
			}
		} else if(op instanceof Resta) {
			Resta resta = (Resta) op;
			if(esOperacion(resta.getLeft()) && esOperacion(resta.getRight())) {
				registrarValoresOperacion(resta.getLeft(), valores);
				registrarValoresOperacion(resta.getRight(), valores);
			}
			else if(!esOperacion(resta.getLeft()) && esOperacion(resta.getRight())) {
				registrarValoresOperacion(resta.getRight(), valores);
				valores.add(resta.getLeft());
			}
			else if(esOperacion(resta.getLeft()) && !esOperacion(resta.getRight())) {
				registrarValoresOperacion(resta.getLeft(), valores);
				valores.add(resta.getRight());
			}
			else {
				valores.add(resta.getLeft());
				valores.add(resta.getRight());
			}
		} else if(op instanceof Multiplicacion) {
			Multiplicacion multiplicacion = (Multiplicacion) op;
			if(esOperacion(multiplicacion.getLeft()) && esOperacion(multiplicacion.getRight())) {
				registrarValoresOperacion(multiplicacion.getLeft(), valores);
				registrarValoresOperacion(multiplicacion.getRight(), valores);
			}
			else if(!esOperacion(multiplicacion.getLeft()) && esOperacion(multiplicacion.getRight())) {
				registrarValoresOperacion(multiplicacion.getRight(), valores);
				valores.add(multiplicacion.getLeft());
			}
			else if(esOperacion(multiplicacion.getLeft()) && !esOperacion(multiplicacion.getRight())) {
				registrarValoresOperacion(multiplicacion.getLeft(), valores);
				valores.add(multiplicacion.getRight());
			}
			else {
				valores.add(multiplicacion.getLeft());
				valores.add(multiplicacion.getRight());
			}
		} else if(op instanceof Division) {
			Division division = (Division) op;
			if(esOperacion(division.getLeft()) && esOperacion(division.getRight())) {
				registrarValoresOperacion(division.getLeft(), valores);
				registrarValoresOperacion(division.getRight(), valores);
			}
			else if(!esOperacion(division.getLeft()) && esOperacion(division.getRight())) {
				registrarValoresOperacion(division.getRight(), valores);
				valores.add(division.getLeft());
			}
			else if(esOperacion(division.getLeft()) && !esOperacion(division.getRight())) {
				registrarValoresOperacion(division.getLeft(), valores);
				valores.add(division.getRight());
			}
			else {
				valores.add(division.getLeft());
				valores.add(division.getRight());
			}
		} else if(op instanceof Or) {
			Or or = (Or) op;
			if(esOperacion(or.getLeft()) && esOperacion(or.getRight())) {
				registrarValoresOperacion(or.getLeft(), valores);
				registrarValoresOperacion(or.getRight(), valores);
			}
			else if(!esOperacion(or.getLeft()) && esOperacion(or.getRight())) {
				registrarValoresOperacion(or.getRight(), valores);
				valores.add(or.getLeft());
			}
			else if(esOperacion(or.getLeft()) && !esOperacion(or.getRight())) {
				registrarValoresOperacion(or.getLeft(), valores);
				valores.add(or.getRight());
			}
			else {
				valores.add(or.getLeft());
				valores.add(or.getRight());
			}
		} else if(op instanceof And) {
			And and = (And) op;
			if(esOperacion(and.getLeft()) && esOperacion(and.getRight())) {
				registrarValoresOperacion(and.getLeft(), valores);
				registrarValoresOperacion(and.getRight(), valores);
			}
			else if(!esOperacion(and.getLeft()) && esOperacion(and.getRight())) {
				registrarValoresOperacion(and.getRight(), valores);
				valores.add(and.getLeft());
			}
			else if(esOperacion(and.getLeft()) && !esOperacion(and.getRight())) {
				registrarValoresOperacion(and.getLeft(), valores);
				valores.add(and.getRight());
			}
			else {
				valores.add(and.getLeft());
				valores.add(and.getRight());
			}
		} else if(op instanceof Comparacion) {
			Comparacion comparacion = (Comparacion) op;
			if(esOperacion(comparacion.getLeft()) && esOperacion(comparacion.getRight())) {
				registrarValoresOperacion(comparacion.getLeft(), valores);
				registrarValoresOperacion(comparacion.getRight(), valores);
			}
			else if(!esOperacion(comparacion.getLeft()) && esOperacion(comparacion.getRight())) {
				registrarValoresOperacion(comparacion.getRight(), valores);
				valores.add(comparacion.getLeft());
			}
			else if(esOperacion(comparacion.getLeft()) && !esOperacion(comparacion.getRight())) {
				registrarValoresOperacion(comparacion.getLeft(), valores);
				valores.add(comparacion.getRight());
			}
			else {
				valores.add(comparacion.getLeft());
				valores.add(comparacion.getRight());
			}
		} else if(op instanceof Igualdad) {
			Igualdad igualdad = (Igualdad) op;
			if(esOperacion(igualdad.getLeft()) && esOperacion(igualdad.getRight())) {
				registrarValoresOperacion(igualdad.getLeft(), valores);
				registrarValoresOperacion(igualdad.getRight(), valores);
			}
			else if(!esOperacion(igualdad.getLeft()) && esOperacion(igualdad.getRight())) {
				registrarValoresOperacion(igualdad.getRight(), valores);
				valores.add(igualdad.getLeft());
			}
			else if(esOperacion(igualdad.getLeft()) && !esOperacion(igualdad.getRight())) {
				registrarValoresOperacion(igualdad.getLeft(), valores);
				valores.add(igualdad.getRight());
			}
			else {
				valores.add(igualdad.getLeft());
				valores.add(igualdad.getRight());
			}
		} else if(op instanceof Negativa) {
			Negativa negativa = (Negativa) op;
			if(esOperacion(negativa.getValor_operacion())) {
				registrarValoresOperacion(negativa.getValor_operacion(), valores);

			}
			else {
				valores.add(negativa.getValor_operacion());
			}
		} else if(op instanceof Negacion) {
			Negacion negacion = (Negacion) op;
			if(esOperacion(negacion.getValor_operacion())) {
				registrarValoresOperacion(negacion.getValor_operacion(), valores);

			}
			else {
				valores.add(negacion.getValor_operacion());
			}
		}
		return valores;
	}
	
	
	/*
	
	protected void registrarValoresOperacionRec(operacion o, List<valor> valores) {
		if(!(o.getOp_der().getOper_der() instanceof operacion)) {
			valor v = (valor) o.getOp_der().getOper_der();
			valores.add(v);
		}
		if(!(o.getOp_izq().getOper_izq() instanceof operacion)) {
			valor v = (valor) o.getOp_izq().getOper_izq();
			valores.add(v);
		}
		else {
			registrarValoresOperacionRec((operacion)o.getOp_der().getOper_der(), valores);
			registrarValoresOperacionRec((operacion)o.getOp_izq().getOper_izq(), valores);
			
		}
	}
	
	protected List<signo> registrarSignosOperacion(operacion o) {
		List<signo> signos = new ArrayList<signo>();
		if(!( instanceof operacion)) {
			signo s = (signo) o.getSigno_op();
			signos.add(s);
		}
		if(!(o.getOp_izq().getOper_izq() instanceof operacion)) {
			signo s = (signo) o.getSigno_op();
			signos.add(s);
		}
		else {
			registrarSignosOperacionRec((operacion)o.getOp_der().getOper_der(), signos);
			registrarSignosOperacionRec((operacion)o.getOp_izq().getOper_izq(), signos);
			
		}
		return signos;
	}
	
	*/
	
	//Función que devuelve true cuando hay almenos una operación que no sea lógica en la condición de un si
	protected boolean checkOperacionLogica(operacion op) {
		if(op instanceof  Suma) {
			return false;
		}
		else if(op instanceof Resta) {
			return false;
		}
		else if(op instanceof Multiplicacion) {
			return false;
		}
		else if(op instanceof Division) {
			return false;
		}
		else if(op instanceof Negativa) {
			return false;
		}
		else if(op instanceof Or) {
			Or or = (Or) op;
			if(or.getLeft() instanceof operacion && or.getRight() instanceof operacion) {
				return checkOperacionLogica(or.getLeft()) && checkOperacionLogica(or.getRight());
			}
			else if(!(or.getLeft() instanceof operacion) && or.getRight() instanceof operacion) {
				return checkOperacionLogica(or.getRight());
			}
			else if(or.getLeft() instanceof operacion && !(or.getRight() instanceof operacion)) {
				return checkOperacionLogica(or.getLeft());
			}
			else {
				return true;
			}
		}
		else if(op instanceof And) {
			And and = (And) op;
			if(and.getLeft() instanceof operacion && and.getRight() instanceof operacion) {
				return checkOperacionLogica(and.getLeft()) && checkOperacionLogica(and.getRight());
			}
			else if(!(and.getLeft() instanceof operacion) && and.getRight() instanceof operacion) {
				return checkOperacionLogica(and.getRight());
			}
			else if(and.getLeft() instanceof operacion && !(and.getRight() instanceof operacion)) {
				return checkOperacionLogica(and.getLeft());
			}
			else {
				return true;
			}
		}
		else if(op instanceof Comparacion) {
			Comparacion comp = (Comparacion) op;
			if(comp.getLeft() instanceof operacion && comp.getRight() instanceof operacion) {
				return checkOperacionLogica(comp.getLeft()) && checkOperacionLogica(comp.getRight());
			}
			else if(!(comp.getLeft() instanceof operacion) && comp.getRight() instanceof operacion) {
				return checkOperacionLogica(comp.getRight());
			}
			else if(comp.getLeft() instanceof operacion && !(comp.getRight() instanceof operacion)) {
				return checkOperacionLogica(comp.getLeft());
			}
			else {
				return true;
			}
		}
		else if(op instanceof Igualdad) {
			Igualdad igualdad = (Igualdad) op;
			if(igualdad.getLeft() instanceof operacion && igualdad.getRight() instanceof operacion) {
				return checkOperacionLogica(igualdad.getLeft()) && checkOperacionLogica(igualdad.getRight());
			}
			else if(!(igualdad.getLeft() instanceof operacion) && igualdad.getRight() instanceof operacion) {
				return checkOperacionLogica(igualdad.getRight());
			}
			else if(igualdad.getLeft() instanceof operacion && !(igualdad.getRight() instanceof operacion)) {
				return checkOperacionLogica(igualdad.getLeft());
			}
			else {
				return true;
			}
		}
		else if(op instanceof Negacion) {
			//Lo pasamos por alto también porque lo validamos en otra función
			return true;
		}
		else {
			//Lo pasamos por alto y lo validamos en otra función
			return true;
		}
	}
	
	/*
	protected void registrarSignosOperacionRec(operacion o, List<signo> signos) {
		if(!(o.getOp_der().getOper_der() instanceof operacion)) {
			signo s = (signo) o.getSigno_op();
			signos.add(s);
		}
		if(!(o.getOp_izq().getOper_izq() instanceof operacion)) {
			signo s = (signo) o.getSigno_op();
			signos.add(s);
		}
		else {
			registrarSignosOperacionRec((operacion)o.getOp_der().getOper_der(), signos);
			registrarSignosOperacionRec((operacion)o.getOp_izq().getOper_izq(), signos);
			
		}
	}
	
	/*
	 * 
	 */
	
	protected List<valor> buscarProblemasOperacion(String tipo, List<valor> valores) {
		List<valor> valoresProblem = new ArrayList<valor>();
		if(tipo.equals("entero")) {
			for(valor v: valores) {
				if(!(v instanceof NumeroEntero)) {
					valoresProblem.add(v);
				}
			}
		}
		else if(tipo == "real") {
			for(valor v: valores) {
				if(!(v instanceof NumeroDecimal) && !(v instanceof NumeroEntero)) {
					valoresProblem.add(v);
				}
			}
		}
		else if(tipo == "logico") {
			for(valor v: valores) {
				if(!(v instanceof ValorBooleano)) {
					valoresProblem.add(v);
				}
			}
		}
		else if(tipo == "cadena") {
			for(valor v: valores) {
				if(!(v instanceof ConstCadena)) {
					valoresProblem.add(v);
				}
			}
		}
		else if(tipo == "caracter") {
			for(valor v: valores) {
				if(!(v instanceof Caracter)) {
					valoresProblem.add(v);
				}
			}
		}
		
		return valoresProblem;
		
	}
	
	
	
	protected boolean esValorSimple(valor v) {
		return !(v instanceof VariableID) && !(v instanceof LlamadaFuncion) && !(v instanceof ValorRegistro) && !(v instanceof ValorVector) && !(v instanceof ValorMatriz) && !esOperacion(v);
	}
	
	protected int asignacionOperacionVariable(List<valor> valoresProblem, Map<String,String> variables, List<String> tiposValidos) {
		int check = 1;
			for(valor v: valoresProblem) {
				if(v instanceof NumeroDecimal && tiposValidos.get(0).equals("entero") && esValorSimple(v)) {
					check = 2;
				}
				else if(!(v instanceof NumeroEntero) && !(v instanceof NumeroDecimal) && tiposValidos.get(0).equals("entero") && esValorSimple(v)) {
					return 3;
				}
				else if(!(v instanceof ValorBooleano) && tiposValidos.get(0) == "logico" && esValorSimple(v)) {
					return 3;
				}
				else if(!(v instanceof ConstCadena) && tiposValidos.get(0) == "cadena" && esValorSimple(v)) {
					return 3;
				}
				else if(!(v instanceof Caracter) && tiposValidos.get(0) == "caracter" && esValorSimple(v)) {
					return 3;
				}
				else if(!(v instanceof NumeroEntero) && !(v instanceof NumeroDecimal) && tiposValidos.get(0) == "real" && esValorSimple(v)) {
					return 3;
				}
				else if(v instanceof VariableID) {
					VariableID var = (VariableID) v;
					if(tiposValidos.get(0).equals("entero")) {
						if(variables.get(var.getNombre()) != tiposValidos.get(0) && variables.get(var.getNombre()) != tiposValidos.get(1) && variables.containsKey(var.getNombre())) {
							return 3;
						}
						else if(variables.get(var.getNombre()) == tiposValidos.get(1)) {
							check = 2;
						}
					}
					else if(tiposValidos.get(0) == "real") {
						if(variables.get(var.getNombre()) != tiposValidos.get(0) && variables.get(var.getNombre()) != tiposValidos.get(1) && variables.containsKey(var.getNombre())) {
							return 3;
						}
					}
					else {
						if(variables.get(var.getNombre()) != tiposValidos.get(0) && variables.containsKey(var.getNombre())) {
							return 3;
						}
					}

				}
			}
		return check;
	}
	
	protected int asignacionOperacionRegistro(List<valor> valoresProblem, Map<String,String> variables, List<String> tiposValidos, Map<String,HashMap<String,String>> registros, List<String> nombresRegistros) {
		int check = 1;
		for(valor v: valoresProblem) {
			if(v instanceof ValorRegistro) {
				//Lo buscamos y miramos su tipo
				ValorRegistro vr = (ValorRegistro) v;
				for(String nombre: nombresRegistros) {
					if(nombre.equals(variables.get(vr.getNombre_registro()))) {
						if(tiposValidos.get(0).equals("entero")) {
							if(registros.get(nombre).get(vr.getCampo().get(0).getNombre_campo()) != tiposValidos.get(0) && registros.get(nombre).get(vr.getCampo().get(0).getNombre_campo()) != tiposValidos.get(1)) {
								return 3;
							}
							else if(registros.get(nombre).get(vr.getCampo().get(0).getNombre_campo()) == tiposValidos.get(1)) {
								check = 2;
							}
						}
						else if(tiposValidos.get(0) == "real") {
							if(registros.get(nombre).get(vr.getCampo().get(0).getNombre_campo()) != tiposValidos.get(0) && registros.get(nombre).get(vr.getCampo().get(0).getNombre_campo()) != tiposValidos.get(1)) {
								return 3;
							}
						}
						else {
							if(registros.get(nombre).get(vr.getCampo().get(0).getNombre_campo()) != tiposValidos.get(0)) {
								return 3;
							}
						}
					}
				}
			}
		}
		return check;
	}
	
	protected int asignacionOperacionFuncion(List<valor> valoresProblem, Map<String,String> variables, List<String> tiposValidos, Map<String,HashMap<Integer,String>> funcionesTipadas) {
		int check = 1;
		for(valor v: valoresProblem) {
			if(v instanceof LlamadaFuncion) {
				LlamadaFuncion f = (LlamadaFuncion) v;
				if(tiposValidos.get(0).equals("entero")) {
					if(funcionesTipadas.get(f.getNombre()).get(f.getOperadores().size()) != tiposValidos.get(0) && funcionesTipadas.get(f.getNombre()).get(f.getOperadores().size()) != tiposValidos.get(1) && funcionesTipadas.containsKey(f.getNombre()) && funcionesTipadas.get(f.getNombre()).containsKey(f.getOperadores().size())) {
						return 3;
					}
					else if(funcionesTipadas.get(f.getNombre()).get(f.getOperadores().size()) == tiposValidos.get(1) &&  funcionesTipadas.get(f.getNombre()).containsKey(f.getOperadores().size())) {
						check = 2;
					}
				}
				else if(tiposValidos.get(0) == "real") {
					if(funcionesTipadas.get(f.getNombre()).get(f.getOperadores().size()) != tiposValidos.get(0) && funcionesTipadas.get(f.getNombre()).get(f.getOperadores().size()) != tiposValidos.get(1) && funcionesTipadas.containsKey(f.getNombre()) && funcionesTipadas.get(f.getNombre()).containsKey(f.getOperadores().size())) {
						return 3;
					}
				}
				else {
					if(funcionesTipadas.get(f.getNombre()).get(f.getOperadores().size()) != tiposValidos.get(0) && funcionesTipadas.containsKey(f.getNombre()) && funcionesTipadas.get(f.getNombre()).containsKey(f.getOperadores().size())) {
						return 3;
					}
				}
			}
		}
		return check;
	}
	
	protected int asignacionOperacionVector(List<valor> valoresProblem, Map<String,String> variables, List<String> tiposValidos, Map<String,String> vectores) {
		int check = 1;
		for(valor v: valoresProblem) {
			if(v instanceof ValorVector) {
				ValorVector vector = (ValorVector) v;
				if(tiposValidos.get(0).equals("entero")) {
					if(vectores.get(variables.get(vector.getNombre_vector())) != tiposValidos.get(0) && vectores.get(variables.get(vector.getNombre_vector())) != tiposValidos.get(1) && vectores.containsKey(variables.get(vector.getNombre_vector()))) {
						return 3;
					}
					else if(vectores.get(variables.get(vector.getNombre_vector())) == tiposValidos.get(1)) {
						check = 2;
					}
				}
				else if(tiposValidos.get(0) == "real") {
					if(vectores.get(variables.get(vector.getNombre_vector())) != tiposValidos.get(0) && vectores.get(variables.get(vector.getNombre_vector())) != tiposValidos.get(1) && vectores.containsKey(variables.get(vector.getNombre_vector()))) {
						return 3;
					}
				}
				else {
					if(vectores.get(variables.get(vector.getNombre_vector())) != tiposValidos.get(0) && vectores.containsKey(variables.get(vector.getNombre_vector()))) {
						return 3;
					}
				}
			}
		}
		return check;
	}
	
	protected int asignacionOperacionMatriz(List<valor> valoresProblem, Map<String,String> variables, List<String> tiposValidos, Map<String,String> matrices) {
		int check = 1;
		for(valor v: valoresProblem) {
			if(v instanceof ValorMatriz) {
				ValorMatriz matriz = (ValorMatriz) v;
				if(tiposValidos.get(0).equals("entero")) {
					if(matrices.get(variables.get(matriz.getNombre_matriz())) != tiposValidos.get(0) && matrices.get(variables.get(matriz.getNombre_matriz())) != tiposValidos.get(1) && matrices.containsKey(variables.get(matriz.getNombre_matriz()))) {
						return 3;
					}
					else if(matrices.get(variables.get(matriz.getNombre_matriz())) == tiposValidos.get(1)) {
						check = 2;
					}
				}
				else if(tiposValidos.get(0) == "real") {
					if(matrices.get(variables.get(matriz.getNombre_matriz())) != tiposValidos.get(0) && matrices.get(variables.get(matriz.getNombre_matriz())) != tiposValidos.get(1) && matrices.containsKey(variables.get(matriz.getNombre_matriz()))) {
						return 3;
					}
				}
				else {
					if(matrices.get(variables.get(matriz.getNombre_matriz())) != tiposValidos.get(0) && matrices.containsKey(variables.get(matriz.getNombre_matriz()))) {
						return 3;
					}
				}
			}
		}
		return check;
	}
	
	protected List<ValorRegistro> variablesRegistroExistentes(List<valor> valores, Map<String,String> variables, List<String> nombresRegistros) {
		List<ValorRegistro> valoresRegistro = new ArrayList<ValorRegistro>();
		for(valor v: valores) {
			if(v instanceof ValorRegistro) {
				//Buscamos si el tipo con el que se declaró es uno de tipo registro
				ValorRegistro vr = (ValorRegistro) v;
				if(!nombresRegistros.contains(variables.get(vr.getNombre_registro())) && variables.containsKey(vr.getNombre_registro())) {
					valoresRegistro.add(vr);
				}
			}
		}
		//Devolvemos todas las variables que se estan usando como registro y no lo son
		return valoresRegistro;
	}
	
	protected List<ValorVector> variablesVectorExistentes(List<valor> valores, Map<String,String> variables, List<String> nombresVectores) {
		List<ValorVector> valoresVector = new ArrayList<ValorVector>();
		for(valor v: valores) {
			if(v instanceof ValorVector) {
				//Buscamos si el tipo con el que se declaró es uno de tipo registro
				ValorVector vv = (ValorVector) v;
				if(!nombresVectores.contains(variables.get(vv.getNombre_vector())) && variables.containsKey(vv.getNombre_vector())) {
					valoresVector.add(vv);
				}
			}
		}
		//Devolvemos todas las variables que se estan usando como registro y no lo son
		return valoresVector;
	}
	
	protected List<ValorMatriz> variablesMatrizExistentes(List<valor> valores, Map<String,String> variables, List<String> nombresMatrices) {
		List<ValorMatriz> valoresMatriz = new ArrayList<ValorMatriz>();
		for(valor v: valores) {
			if(v instanceof ValorMatriz) {
				//Buscamos si el tipo con el que se declaró es uno de tipo registro
				ValorMatriz vm = (ValorMatriz) v;
				if(!nombresMatrices.contains(variables.get(vm.getNombre_matriz())) && variables.containsKey(vm.getNombre_matriz())) {
					valoresMatriz.add(vm);
				}
			}
		}
		//Devolvemos todas las variables que se estan usando como registro y no lo son
		return valoresMatriz;
	}
	
	/*
	 * 
	 */
	
	protected List<ValorRegistro> variablesRegistroDeclaradas(List<valor> valores, List<String> variables) {
		List<ValorRegistro> variablesNoDeclaradas = new ArrayList<ValorRegistro>();
		for(valor v: valores) {
			if(v instanceof ValorRegistro) {
				//Buscamos si ha sido definida (la comprobación de si pertenece al tipo registro lo omitimos porque ya hay otra función
				//que se encarga de ello
				ValorRegistro vr = (ValorRegistro) v;
				if(!variables.contains(vr.getNombre_registro())) {
					variablesNoDeclaradas.add(vr);
				}
			}
		}
		return variablesNoDeclaradas;
	}
	
	protected List<ValorVector> variablesVectorDeclaradas(List<valor> valores, List<String> variables) {
		List<ValorVector> variablesNoDeclaradas = new ArrayList<ValorVector>();
		for(valor v: valores) {
			if(v instanceof ValorVector) {
				ValorVector vv = (ValorVector) v;
				if(!variables.contains(vv.getNombre_vector())) {
					variablesNoDeclaradas.add(vv);
				}
			}
		}
		return variablesNoDeclaradas;
	}
	
	protected List<ValorMatriz> variablesMatrizDeclaradas(List<valor> valores, List<String> variables) {
		List<ValorMatriz> variablesNoDeclaradas = new ArrayList<ValorMatriz>();
		for(valor v: valores) {
			if(v instanceof ValorMatriz) {
				ValorMatriz vm = (ValorMatriz) v;
				if(!variables.contains(vm.getNombre_matriz())) {
					variablesNoDeclaradas.add(vm);
				}
			}
		}
		return variablesNoDeclaradas;
	}
	
	/*
	 * 
	 */
	
	protected List<VariableID> variablesDeclaradas(List<valor> valores, List<String> variables) {
		List<VariableID> variablesNoDeclaradas = new ArrayList<VariableID>();
		for(valor v: valores) {
			if(v instanceof VariableID) {
				//Comprobamos si la variable ha sido definida
				VariableID var = (VariableID) v;
				if(!variables.contains(var.getNombre())) {
					variablesNoDeclaradas.add(var);
				}
			}
			else if(v instanceof LlamadaFuncion) {
				//Comprobamos si alguno de los parámetros es una variable no definida
				LlamadaFuncion f = (LlamadaFuncion) v;
				for(valor val: f.getOperadores()) {
					if(val instanceof Operador) {
						Operador o = (Operador) val;
						if(o instanceof VariableID) {
							VariableID var = (VariableID) o;
							if(!variables.contains(var.getNombre())) {
								variablesNoDeclaradas.add(var);
							}
						}
					}
				}
			}
		}
		return variablesNoDeclaradas;
	}
	
	protected List<String> registrarCamposRegistroSinTipo(List<Declaracion> declaraciones) {
		List<String> campos = new ArrayList<String>();
		for(Declaracion d: declaraciones) {
			if(d instanceof DeclaracionPropia) {
				DeclaracionPropia dec = (DeclaracionPropia) d;
				for(Variable v: dec.getVariable()) {
					campos.add(v.getNombre());
				}
			}
			else {
				DeclaracionVariable dec = (DeclaracionVariable) d;
				for(Variable v: dec.getVariable()) {
					campos.add(v.getNombre());
				}
			}
		}
		return campos;
	}
	
	protected HashMap<String,String> registrarCamposRegistro(List<Declaracion> declaraciones) {
		HashMap<String,String> campos = new HashMap<String,String>();
		for(Declaracion d: declaraciones) {
			if(d instanceof DeclaracionPropia) {
				DeclaracionPropia dec = (DeclaracionPropia) d;
				for(Variable v: dec.getVariable()) {
					campos.put(v.getNombre(), dec.getTipo());
				}
			}
			else {
				DeclaracionVariable dec = (DeclaracionVariable) d;
				for(Variable v: dec.getVariable()) {
					campos.put(v.getNombre(), dec.getTipo().getName());
				}
			}
		}
		return campos;
	}
	
	protected void prepararColeccionesTiposComplejos(EList<TipoComplejo> complejos, Map<String,HashMap<String,String>> registros, List<String> nombresRegistros, Map<String,String> vectores, Map<String,String> matrices) {
		
		for(TipoComplejo t: complejos) {
			if(t instanceof Registro) {
				Registro r = (Registro) t;
				registros.put(r.getNombre(), registrarCamposRegistro(r.getVariable()));
				nombresRegistros.add(r.getNombre());
			}
			else if(t instanceof Vector) {
				Vector v = (Vector) t;
				vectores.put(v.getNombre(), getTipoParametro(v.getTipo()));
				
			}
			else if(t instanceof Matriz) {
				Matriz m = (Matriz) t;
				matrices.put(m.getNombre(), getTipoParametro(m.getTipo()));
			}
		}
	}
	
	protected void prepararColeccionFunciones(List<Subproceso> funciones, Map<String,HashMap<Integer,String>> funcionesTipadas) {
		
		for(Subproceso s: funciones) {
			if(s instanceof Funcion) {
				Funcion f = (Funcion) s;
				//Como hay otra función que se encarga de que no esten repetidos obviamos la comprobación
				HashMap<Integer,String> aux = new HashMap<Integer,String>();
				for(Subproceso s2: funciones) {
					if(s2 instanceof Funcion) {
						Funcion f2 = (Funcion) s2;
						if(f.getNombre().equals(f2.getNombre())) {
							aux.put(f2.getParametrofuncion().size(), f2.getTipo().getName());
						}
					}
				}
				funcionesTipadas.put(f.getNombre(), aux);
			}
		}
		
	}
	
}
