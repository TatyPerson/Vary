package vary.pseudocodigo.dsl.c.generator

import java.util.Map
import java.util.HashMap
import java.util.ArrayList
import diagramapseudocodigo.Codigo
import diagramapseudocodigo.TipoComplejo
import diagramapseudocodigo.Enumerado
import diagramapseudocodigo.Valor
import diagramapseudocodigo.Operador
import diagramapseudocodigo.VariableID
import diagramapseudocodigo.Declaracion
import diagramapseudocodigo.DeclaracionBasica
import diagramapseudocodigo.Variable
import diagramapseudocodigo.DeclaracionDefinida
import diagramapseudocodigo.Subproceso
import diagramapseudocodigo.Parametro
import diagramapseudocodigo.TipoBasico
import diagramapseudocodigo.TipoDefinido
import diagramapseudocodigo.Vector
import diagramapseudocodigo.Matriz
import diagramapseudocodigo.Registro
import diagramapseudocodigo.Archivo
import diagramapseudocodigo.SubrangoNumerico
import diagramapseudocodigo.SubrangoEnumerado
import diagramapseudocodigo.Tipo
import diagramapseudocodigo.Constante
import diagramapseudocodigo.FuncionFicheroAbrir
import diagramapseudocodigo.FuncionFicheroCerrar
import diagramapseudocodigo.Inicio
import diagramapseudocodigo.Funcion
import diagramapseudocodigo.Procedimiento
import org.eclipse.emf.common.util.EList
import diagramapseudocodigo.Sentencia
import diagramapseudocodigo.AsignacionNormal
import diagramapseudocodigo.AsignacionCompleja
import diagramapseudocodigo.LlamadaFuncion
import diagramapseudocodigo.Si
import diagramapseudocodigo.Segun
import diagramapseudocodigo.Caso
import diagramapseudocodigo.Mientras
import diagramapseudocodigo.Repetir
import diagramapseudocodigo.Desde
import diagramapseudocodigo.Leer
import diagramapseudocodigo.Escribir
import diagramapseudocodigo.ValorComplejo
import diagramapseudocodigo.ValorRegistro
import diagramapseudocodigo.ValorVector
import diagramapseudocodigo.ValorMatriz
import diagramapseudocodigo.CampoRegistro
import diagramapseudocodigo.Entero
import diagramapseudocodigo.Real
import diagramapseudocodigo.Logico
import diagramapseudocodigo.CadenaCaracteres
import diagramapseudocodigo.Caracter
import diagramapseudocodigo.Operacion
import diagramapseudocodigo.FuncionInterna
import diagramapseudocodigo.Suma
import diagramapseudocodigo.Resta
import diagramapseudocodigo.Multiplicacion
import diagramapseudocodigo.DivisionEntera
import diagramapseudocodigo.Or
import diagramapseudocodigo.And
import diagramapseudocodigo.Comparacion
import diagramapseudocodigo.Igualdad
import diagramapseudocodigo.Devolver
import diagramapseudocodigo.Sino
import java.util.List
import diagramapseudocodigo.Algoritmo
import diagramapseudocodigo.Modulo
import vary.pseudocodigo.dsl.c.generator.VaryGeneratorInterface
import vary.pseudocodigo.dsl.c.validation.messages.ReadMessagesValidatorInterface
import diagramapseudocodigo.Mod
import diagramapseudocodigo.DivisionReal
import diagramapseudocodigo.OperacionParentesis
import diagramapseudocodigo.OperacionCompleta
import org.eclipse.xtext.EcoreUtil2
import diagramapseudocodigo.TipoFuncion
import diagramapseudocodigo.TipoProcedimiento

public abstract class VaryGrammarAbstractGeneratorCCPP implements VaryGeneratorInterface {
	
	protected Algoritmo algoritmoActual;
	protected Modulo moduloActual;
	
	protected static Map<String, String> variablesInicio = new HashMap<String,String>();
	protected static Map<String, Map<String,String>>variablesSubprocesos = new HashMap<String,Map<String,String>>();
	protected static Map<String,String> vectoresMatrices = new HashMap<String,String>();
	protected static Map<String, Map<String,String>> registros = new HashMap<String, Map<String,String>>();
	protected static Map<String, ArrayList<String>> variablesEnumerados = new HashMap<String, ArrayList<String>>();
	protected static ArrayList<String> archivos = new ArrayList<String>();
	protected static Map<String, String> funciones = new HashMap<String,String>();
	protected static ArrayList<String> enumerados = new ArrayList<String>();
	protected static boolean cabeceras;
	protected static Map<String,ArrayList<Integer>> subprocesosConPunteros = new HashMap<String,ArrayList<Integer>>();
	protected static Map<String, String> tiposSubprocesos = new HashMap<String, String>();
	protected static ReadMessagesValidatorInterface readerMessages;
	
	/*
	 * Función auxiliar de doGenerate para obtener el nombre del Algoritmo o Modulo.
	 */
	def getNombre(Codigo codigo) {
		if (codigo.eClass.name.equals("Algoritmo")) {
			var Algoritmo algoritmo = codigo as Algoritmo
			return algoritmo.nombre
		}
		else if(codigo.eClass.name.equals("Modulo")) {
			var Modulo modulo = codigo as Modulo
			return modulo.nombre
		}
	}
	
	/*
	 * Función auxiliar de doGenerate para generar los respectivos ficheros de cabecera (.h).
	 */
	def CharSequence generateCabeceras(Codigo codigo) {
		if (codigo.eClass.name.equals("Algoritmo")) {
			var Algoritmo algoritmo = codigo as Algoritmo
			generateCabeceras(algoritmo)
		}
		else if(codigo.eClass.name.equals("Modulo")) {
			var Modulo modulo = codigo as Modulo
			generateCabeceras(modulo)
		}
	}
	
	/*
	 * Función auxiliar de doGenerate para generar los respectivos ficheros de cabecera (.h) - Modulo.
	 */
	def CharSequence generateCabeceras(Modulo modulo) {}
	
	/*
	 * Función auxiliar de doGenerate para generar los respectivos ficheros de cabecera (.h) - Algoritmo.
	 */
	def CharSequence generateCabeceras(Algoritmo algoritmo) {}
	
	/*
	 * Función auxiliar de generateCabeceras(Algoritmo|Modulo) para generar las cabeceras de las funciones que aparecen en los ficheros de cabecera (.h).
	 */
	def generateCabeceras(Subproceso subproceso) {
		if (subproceso.eClass.name.equals("Funcion")) {
			var Funcion funcion = subproceso as Funcion
			return generateCabecerasAux(funcion.parametros, funcion.tipo.getTipoVariable + " " + funcion.nombre);
			
		} else if (subproceso.eClass.name.equals("Procedimiento")) {
			var Procedimiento procedimiento = subproceso as Procedimiento
			return generateCabecerasAux(procedimiento.parametros, "void" + " " + procedimiento.nombre);
		}
	}
	
	/*
	 * Función auxiliar de generateCabeceras(Subproceso) para generar las cabeceras de las funciones que aparecen en los ficheros de cabecera (.h).
	 */
	def generateCabecerasAux(EList<Parametro> parametros, String cabecera) {
		var cabeceraAux = cabecera;
		for (p : parametros) {
			if (parametros.indexOf(p) != 0) {
				cabeceraAux = cabeceraAux + ", " } 
			
			if (p.paso.equals(readerMessages.getBundle().getString("TIPO_PASO_ENTRADA"))) {
				cabeceraAux = cabeceraAux + "const " + p.tipo.generate;
			} else if (p.paso.equals(readerMessages.getBundle().getString("TIPO_PASO_ENTRADA_SALIDA")) && p.tipo instanceof TipoBasico) {
				cabeceraAux = cabeceraAux + p.tipo.generate + "*";
			} else if (p.paso.equals(readerMessages.getBundle().getString("TIPO_PASO_SALIDA")) && p.tipo instanceof TipoBasico) {
				cabeceraAux = cabeceraAux + p.tipo.generate + "*";
			} else {
				cabeceraAux = cabeceraAux + p.tipo.generate + " ";
			}
		}
		return cabeceraAux + ");";
		
	}
	
	/* 2) /* -------------------------------------------------------------------------------------------------------------------- */
	/**
	 * Función encargada de generar la entidad Codigo (entidad principal del metamodelo).
	 * @param codigo
	 */
	override generate(Codigo codigo) {
		if (codigo.eClass.name.equals("Algoritmo")) {
			var Algoritmo algoritmo = codigo as Algoritmo
			algoritmo.generate
		}
		else if(codigo.eClass.name.equals("Modulo")) {
			var Modulo modulo = codigo as Modulo
			modulo.generate
		}
	}
	
	/* 3) /* -------------------------------------------------------------------------------------------------------------------- */
	/**
	 * Función encargada de generar la entidad Algoritmo.
	 * @param algoritmo
	 */
	 override generate(Algoritmo algoritmo) {}
	
	/* 4) /* -------------------------------------------------------------------------------------------------------------------- */
	/**
	 * Función encargada de generar la entidad Modulo.
	 * @param modulo
	 */
	 override generate(Modulo modulo) {}
	
	/*
	 * Función auxiliar de generate(Algoritmo|Modulo) que se encarga de recoger la información importante para ser utilizada en otras funciones.
	 */
	def void registrarInformacion(List<TipoComplejo> complejos, List<Subproceso> subprocesos, List<Declaracion> declaracionesInicio) {
		for(Subproceso s: subprocesos) {
			if (s.eClass.name.equals("Funcion")) {
				var Funcion funcion = s as Funcion
				funciones.put(funcion.nombre, funcion.tipo)
				subprocesosConPunteros.put(funcion.nombre, new ArrayList<Integer>());
				var numParametro = 1;
				for(Parametro parametro: funcion.parametros) {
					if(parametro.paso.equals(readerMessages.getBundle().getString("TIPO_PASO_ENTRADA_SALIDA")) && parametro.tipo instanceof TipoBasico) {
						subprocesosConPunteros.get(funcion.nombre).add(numParametro)
					}
					else if(parametro.paso.equals(readerMessages.getBundle().getString("TIPO_PASO_SALIDA")) && parametro.tipo instanceof TipoBasico) {
						subprocesosConPunteros.get(funcion.nombre).add(numParametro)
					}
					numParametro = numParametro + 1;
				}
				
			} else if (s.eClass.name.equals("Procedimiento")) {
				var Procedimiento procedimiento = s as Procedimiento
				funciones.put(procedimiento.nombre, "void")
				subprocesosConPunteros.put(procedimiento.nombre, new ArrayList<Integer>());
				var numParametro = 1;
				for(Parametro parametro: procedimiento.parametros) {
					if(parametro.paso.equals(readerMessages.getBundle().getString("TIPO_PASO_ENTRADA_SALIDA")) && parametro.tipo instanceof TipoBasico) {
						subprocesosConPunteros.get(procedimiento.nombre).add(numParametro)
					}
					else if(parametro.paso.equals(readerMessages.getBundle().getString("TIPO_PASO_SALIDA")) && parametro.tipo instanceof TipoBasico) {
						subprocesosConPunteros.get(procedimiento.nombre).add(numParametro)
					}
					numParametro = numParametro + 1;
				}
			}
		}
		
		if(declaracionesInicio != null) {
			for(Declaracion d: declaracionesInicio) {
				if(d instanceof DeclaracionBasica) {
					var dec = d as DeclaracionBasica;
					for(Variable v: dec.variables) {
						variablesInicio.put(v.nombre, dec.tipo);
					}
				}
				else if(d instanceof DeclaracionDefinida) {
					var dec = d as DeclaracionDefinida;
					for(Variable v: dec.variables) {
						variablesInicio.put(v.nombre, dec.tipo);
					}
				}
			}
		}
	
		for(Subproceso s: subprocesos) {
			variablesSubprocesos.put(s.nombre, new HashMap<String,String>());
			for(Declaracion d: s.declaraciones) {
				if(d instanceof DeclaracionBasica) {
					var dec = d as DeclaracionBasica;
					for(Variable v: dec.variables) {
						variablesSubprocesos.get(s.nombre).put(v.nombre, dec.tipo);
					}
				}
				else if(d instanceof DeclaracionDefinida) {
					var dec = d as DeclaracionDefinida;
					for(Variable v: dec.variables) {
						variablesSubprocesos.get(s.nombre).put(v.nombre, dec.tipo);
					}
				}
			}
			for(Parametro p: s.parametros) {
				variablesSubprocesos.get(s.nombre).put(p.variable.nombre, p.tipo.nombre);
			}
		}
	
		for(TipoComplejo complejo: complejos) {
			if(complejo.eClass.name.equals("Vector")) {
				var v = complejo as Vector;
				vectoresMatrices.put(v.nombre, v.tipo.nombre);
			} else if(complejo.eClass.name.equals("Matriz")) {
				var m = complejo as Matriz;
				vectoresMatrices.put(m.nombre, m.tipo.nombre);
			} else if(complejo.eClass.name.equals("Registro")) {
				var r = complejo as Registro;
				registros.put(r.nombre, new HashMap<String,String>());
				for(Declaracion d: r.campos) {
					if(d instanceof DeclaracionBasica) {
						var dec = d as DeclaracionBasica;
						for(Variable v: dec.variables) {
							registros.get(r.nombre).put(v.nombre, dec.tipo);
						}
					} else if(d instanceof DeclaracionDefinida) {
						var dec = d as DeclaracionDefinida;
						for(Variable v: dec.variables) {
							registros.get(r.nombre).put(v.nombre, dec.tipo);
						}
					}
				}
			} else if(complejo.eClass.name.equals("Archivo")) {
				var a = complejo as Archivo
				archivos.add(a.nombre)
			} else if(complejo.eClass.name.equals("Enumerado")) {
				var enumerado = complejo as Enumerado;
				variablesEnumerados.put(enumerado.nombre, new ArrayList<String>());
				enumerados.add(enumerado.nombre);
				for(Valor v: enumerado.posiblesValores) {
				  if(v instanceof Operador) {
				  	var v2 = v as Operador
					if(v2 instanceof VariableID) {
						var aux = v2 as VariableID
						variablesEnumerados.get(enumerado.nombre).add(aux.nombre)
					}
				  }
			  	}
			} else if(complejo.eClass.name.equals("TipoFuncion")) {
				var tipoFuncion = complejo as TipoFuncion;
				tiposSubprocesos.put(tipoFuncion.nombre, tipoFuncion.tipo);
			} else if(complejo.eClass.name.equals("TipoProcedimiento")) {
				var tipoProcedimiento = complejo as TipoProcedimiento;
				tiposSubprocesos.put(tipoProcedimiento.nombre, "void");
			}
		}
	}
	
	/* 5) /* -------------------------------------------------------------------------------------------------------------------- */
	/**
	 * Función encargada de generar la entidad TipoComplejo.
	 * @param complejo
	 */
	override generate(TipoComplejo complejo) {
		if (complejo.eClass.name.equals("Vector")) {
			var Vector vector = complejo as Vector
			vector.generate
		} else if (complejo.eClass.name.equals("Matriz")) {
			var Matriz matriz = complejo as Matriz
			matriz.generate
		} else if (complejo.eClass.name.equals("Registro")) {
			var Registro registro = complejo as Registro
			registro.generate
		} else if (complejo.eClass.name.equals("Archivo")) {
			var Archivo archivo = complejo as Archivo
			archivo.generate
		} else if (complejo.eClass.name.equals("Enumerado")) {
			var Enumerado enumerado = complejo as Enumerado
			enumerado.generate
		} else if (complejo.eClass.name.equals("SubrangoNumerico")) {
			var SubrangoNumerico subrangoNumerico = complejo as SubrangoNumerico
			subrangoNumerico.generate
		} else if (complejo.eClass.name.equals("SubrangoEnumerado")) {
			var SubrangoEnumerado subrangoEnumerado = complejo as SubrangoEnumerado
			subrangoEnumerado.generate
		} else if (complejo.eClass.name.equals("TipoFuncion")) {
			var TipoFuncion tipoFuncion = complejo as TipoFuncion
			tipoFuncion.generate
		} else if (complejo.eClass.name.equals("TipoProcedimiento")) {
			var TipoProcedimiento tipoProcedimiento = complejo as TipoProcedimiento
			tipoProcedimiento.generate
		}
	}
	
	/*
	 * Función auxiliar de generate(TipoComplejo) que se encarga de generar la entidad Vector.
	 */
	override generate(Vector vector) '''
		typedef «vector.tipo.generate» «vector.nombre»[«vector.valor.generate(null)»];
	'''
	
	/*
	 * Función auxiliar de generate(TipoComplejo) que se encarga de generar la entidad Matriz.
	 */
	override generate(Matriz matriz) '''
		typedef «matriz.tipo.generate» «matriz.nombre»[«matriz.valor.get(0).generate(null)»][«matriz.valor.get(1).generate(null)»];
	'''
	
	/*
	 * Función auxiliar de generate(TipoComplejo) que se encarga de generar la entidad Registro.
	 */
	override generate(Registro registro) '''
		typedef struct {
			«FOR myVariable:registro.campos»
				«myVariable.generate»
			«ENDFOR»
		} «registro.nombre»;
	'''
	
	/*
	 * Función auxiliar de generate(TipoComplejo) que se encarga de generar la entidad Archivo.
	 */
	override generate(Archivo archivo) '''
		typedef FILE *«archivo.nombre»;
	'''
	
	/*
	 * Función auxiliar de generate(TipoComplejo) que se encarga de generar la entidad Enumerado.
	 */
	override generate(Enumerado enumerado) '''
		typedef enum {«FOR variable:enumerado.posiblesValores»«IF variable == enumerado.posiblesValores.get(enumerado.posiblesValores.size()-1)»«variable.generate(null)»«ELSE»«variable.generate(null)», «ENDIF»«ENDFOR»} «enumerado.nombre»;
	'''
	
	/*
	 * Función auxiliar de generate(TipoComplejo) que se encarga de generar la entidad SubrangoNumerico.
	 */
	override generate(SubrangoNumerico subrangoNumerico) '''
		typedef enum {«getValoresSubrangoNumerico(subrangoNumerico.limite_inf,subrangoNumerico.limite_sup)»} «subrangoNumerico.nombre»;
	'''
	
	/*
	 * Función auxiliar de generate(TipoComplejo) que se encarga de generar la entidad SubrangoEnumerado.
	 */
	override generate(SubrangoEnumerado subrangoEnumerado) '''
		typedef enum {«getValoresSubrangoEnumerado(subrangoEnumerado.limite_inf,subrangoEnumerado.limite_sup)»} «subrangoEnumerado.nombre»;
	'''
	
	/*
	 * Función auxiliar de generate(subrangoNumerico) que se encarga de generar los valores numéricos referenciados.
	 */
	def getValoresSubrangoNumerico(int limite_inf,int limite_sup) {
		var valoresNumericos = new String
		var i = limite_inf
		while (i < limite_sup) {
			valoresNumericos = valoresNumericos + readerMessages.getBundle().getString("SUBRANGO_NUMERO") + i + ", "
			i = i + 1
		}
		return valoresNumericos + readerMessages.getBundle().getString("SUBRANGO_NUMERO") + i;
	}
	
	/*
	 * Función auxiliar de generate(subrangoEnumerado) que se encarga de generar los valores correspondientes al enumerado referenciado.
	 */
	def getValoresSubrangoEnumerado(String limite_inf, String limite_sup) {
		var valoresEnumerado = new String
		for(String nombre: enumerados) {
			if(variablesEnumerados.get(nombre).contains(limite_inf) && variablesEnumerados.get(nombre).contains(limite_sup)) {
				var index_limite_inf = variablesEnumerados.get(nombre).indexOf(limite_inf);
				var index_limite_sup = variablesEnumerados.get(nombre).indexOf(limite_sup);
				var sublista = variablesEnumerados.get(nombre).subList(index_limite_inf, index_limite_sup);
				for(String aux: sublista) {
					valoresEnumerado = valoresEnumerado + aux + ", "
				}
				return valoresEnumerado + limite_sup
			}
		}
	}
	
	/*
	 * Función auxiliar de generate(TipoComplejo) que se encarga de generar la entidad TipoFuncion.
	 */
	 override generate(TipoFuncion tipoFuncion) '''
	 typedef «tipoFuncion.tipo.getTipoVariable» (* «tipoFuncion.nombre»)(«tipoFuncion.parametros.generate»);
	 '''
	 
	 /*
	 * Función auxiliar de generate(TipoComplejo) que se encarga de generar la entidad TipoFuncion.
	 */
	 override generate(TipoProcedimiento tipoProcedimiento) '''
	 typedef void (* «tipoProcedimiento.nombre»)(«tipoProcedimiento.parametros.generate»);
	 '''
	
	/* 6) /* -------------------------------------------------------------------------------------------------------------------- */
	/**
	 * Función encargada de generar la entidad TipoComplejo.
	 * @param complejo
	 */
	 override generate(Tipo tipo) {
		if (tipo.eClass.name.equals("TipoDefinido")) {
			var TipoDefinido tipoDefinido = tipo as TipoDefinido
			tipoDefinido.generate
		} else if (tipo.eClass.name.equals("TipoBasico")) {
			var TipoBasico tipoBasico = tipo as TipoBasico
			tipoBasico.generate
		}
	}
	
	/*
	 * Función auxiliar de generate(Tipo) que se encarga de generar la entidad TipoDefinido.
	 */
	override generate(TipoDefinido tipoDefinido) {
		return tipoDefinido.nombre
	}
	
	/*
	 * Función auxiliar de generate(Tipo) que se encarga de generar la entidad TipoBasico.
	 */
	override generate(TipoBasico tipoBasico) {
		return getTipoVariable(tipoBasico.nombre)
	}
	
	/*
	 * Función auxiliar de generate(TipoExistente) que se encarga de obtener los tipos de datos correspondientes en C.
	 */	
	def String getTipoVariable(String tipo) {}
	
	/* 7) /* -------------------------------------------------------------------------------------------------------------------- */
	/**
	 * Función encargada de generar la entidad Subproceso.
	 * @param subproceso
	 */
	override generate(Subproceso subproceso) {
		if (subproceso.eClass.name.equals("Funcion")) {
			var Funcion funcion = subproceso as Funcion
			funcion.generate
		} else if (subproceso.eClass.name.equals("Procedimiento")) {
			var Procedimiento procedimiento = subproceso as Procedimiento
			procedimiento.generate
		}
	}
	
	/*
	 * Función auxiliar de generate(Subproceso) que se encarga de generar la entidad Funcion.
	 */	
	override generate(Funcion funcion) {
		return generateSubprocesoAux(funcion.tipo.getTipoVariable, funcion.nombre, funcion.parametros, funcion.declaraciones, funcion.sentencias, funcion.devuelve);
	}
	
	/*
	 * Función auxiliar de generate(Subproceso) que se encarga de generar la entidad Procedimiento.
	 */
	override generate(Procedimiento procedimiento) {
		return generateSubprocesoAux("void", procedimiento.nombre, procedimiento.parametros, procedimiento.declaraciones, procedimiento.sentencias, null);
	}
	
	/*
	 * Función auxiliar de generate(Funcion|Procedimiento) que se encarga de generar la declaración completa - DRY.
	 */
	def generateSubprocesoAux(String tipo, String nombre, EList<Parametro> parametros, List<Declaracion> declaraciones, List<Sentencia> sentencias, Devolver devolver) {
		var declaracionSubproceso = tipo + " " + nombre + parametros.generate + "){" + "\n";
		var punteros = new ArrayList<String>();
		for(parametroFuncion: parametros) {
			if(parametroFuncion.paso.equals(readerMessages.getBundle().getString("TIPO_PASO_ENTRADA_SALIDA")) && parametroFuncion.tipo instanceof TipoBasico) {
				punteros.add(parametroFuncion.variable.nombre)
			}
			else if(parametroFuncion.paso.equals(readerMessages.getBundle().getString("TIPO_PASO_SALIDA")) && parametroFuncion.tipo instanceof TipoBasico) {
				punteros.add(parametroFuncion.variable.nombre)
			}
		}
		for(declaracion:declaraciones) {
			declaracionSubproceso = declaracionSubproceso + "\t" + declaracion.generate + "\n";
		}
		
		for(sentencia:sentencias) {
			declaracionSubproceso = declaracionSubproceso + "\t" + sentencia.generate(punteros) + "\n";
		}
			
		if(devolver != null) {
			declaracionSubproceso = declaracionSubproceso + "\t" + devolver.generate(punteros) + "\n";
		}
		return declaracionSubproceso + "\n" + "}";
	}
	

	/*
	 * Función auxiliar de generateSubprocesoAux() que se encarga de generar la lista de parámetros de la cabecera.
	 */
	override generate(EList<Parametro> parametros) {
		var declaracionParametros = "";
		
		for(parametro : parametros) {
			if(parametros.indexOf(parametro) != 0)
				declaracionParametros = declaracionParametros + ", "
			if(parametro.paso.equals(readerMessages.getBundle().getString("TIPO_PASO_ENTRADA"))) {
				declaracionParametros = declaracionParametros + "const " + parametro.tipo.generate + " " + parametro.variable.nombre;
			} else if(parametro.paso.equals(readerMessages.getBundle().getString("TIPO_PASO_ENTRADA_SALIDA")) && parametro.tipo instanceof TipoBasico) {
				declaracionParametros = declaracionParametros + parametro.tipo.generate + "* " + parametro.variable.nombre;
			} else if(parametro.paso.equals(readerMessages.getBundle().getString("TIPO_PASO_SALIDA")) && parametro.tipo instanceof TipoBasico) {
				declaracionParametros = declaracionParametros + parametro.tipo.generate + "* " + parametro.variable.nombre;
			} else {
				declaracionParametros = declaracionParametros + parametro.tipo.generate + " " + parametro.variable.nombre;
			}
		}
		return declaracionParametros;
	}
	
	/* 8) /* -------------------------------------------------------------------------------------------------------------------- */
	/**
	 * Función encargada de generar la entidad Declaracion.
	 * @param declaracion
	 */
	override generate(Declaracion declaracion) {
		if (declaracion.eClass.name.equals("DeclaracionBasica")) {
			var DeclaracionBasica declaracionBasica = declaracion as DeclaracionBasica
			declaracionBasica.generate
		} else if (declaracion.eClass.name.equals("DeclaracionDefinida")) {
			var DeclaracionDefinida declaracionDefinida = declaracion as DeclaracionDefinida
			declaracionDefinida.generate
		}
	}
	
	/*
	 * Función auxiliar de generate(Declaracion) que se encarga de generar la entidad DeclaracionBasica.
	 */
	override generate(DeclaracionBasica declaracionBasica) {
		return declaracionBasica.tipo.getTipoVariable + " " + getVariables(declaracionBasica.variables);	
	}
	
	/*
	 * Función auxiliar de generate(Declaracion) que se encarga de generar la entidad DeclaracionDefinida.
	 */
	override generate(DeclaracionDefinida declaracionDefinida) '''
		«declaracionDefinida.tipo» «getVariables(declaracionDefinida.variables)»
	'''
	
	/*
	 * Función auxiliar de generate(DeclaracionVariable|DeclaracionPropia) que se encarga de generar las variables referenciadas en la Declaracion.
	 */
	def getVariables(EList<Variable> variables) '''
		«variables.get(0).nombre»«FOR matri:variables.get(0).mat»«matri.toString»«ENDFOR»«FOR id:variables»«IF id.nombre != variables.get(0).nombre», «id.nombre»«FOR matri2:id.mat»«matri2.toString»«ENDFOR»«ENDIF»«ENDFOR»;
	'''
	
	/* 9) /* -------------------------------------------------------------------------------------------------------------------- */
	/**
	 * Función encargada de generar la entidad Internas.
	 * @param interna, sentencia
	 */
	override generate(FuncionInterna interna, boolean sentencia, List<String> punteros) {}
	
	/* 10) /* -------------------------------------------------------------------------------------------------------------------- */
	/**
	 * Función encargada de generar la entidad Si.
	 * @param si
	 */
	override generate(Si si, List<String> punteros) '''
		if(«si.condicion.generate(punteros)»){
			«FOR sentencia:si.sentencias»
				«sentencia.generate(punteros)»
			«ENDFOR»
			«IF si.devuelve != null» 
			«si.devuelve.generate(punteros)»
			«ENDIF»	
		}
		«IF si.sino != null» 
			«si.sino.generate(punteros)»
		«ENDIF»
	'''
	
	/* 11) /* -------------------------------------------------------------------------------------------------------------------- */
	/**
	 * Función encargada de generar la entidad Sino.
	 * @param sino
	 */
	override generate(Sino sino, List<String> punteros) '''
		else{
			«FOR sentencia:sino.sentencias»	
				«sentencia.generate(punteros)»
			«ENDFOR»
			«IF sino.devuelve != null» 
			«sino.devuelve.generate(punteros)»
			«ENDIF»	
		}
	'''
	
	/* 12) /* -------------------------------------------------------------------------------------------------------------------- */
	/**
	 * Función encargada de generar la entidad Segun.
	 * @param segun
	 */	
	override generate(Segun segun, List<String> punteros) '''
		switch(«segun.condicion.generate(punteros)»){
			«FOR caso:segun.casos»
				«caso.generate(punteros)» 
			«ENDFOR»
			default:
				«FOR sentencia:segun.sentencias»
					«sentencia.generate(punteros)»
				«ENDFOR»
				«IF segun.devuelve != null» 
				«segun.devuelve.generate(punteros)»
				«ENDIF»
			break;
		}
	'''
	
	/* 13) /* -------------------------------------------------------------------------------------------------------------------- */
	/**
	 * Función encargada de generar la entidad Caso.
	 * @param caso
	 */
	override generate(Caso caso, List<String> punteros) '''
		case «caso.operador.generate(punteros)»:
			«FOR sentencia:caso.sentencias»
				«sentencia.generate(punteros)»
			«ENDFOR»
			«IF caso.devuelve != null» 
			«caso.devuelve.generate(punteros)»
			«ENDIF»
		break;
	'''
	
	/* 14) /* -------------------------------------------------------------------------------------------------------------------- */
	/**
	 * Función encargada de generar la entidad Mientras.
	 * @param mientras
	 */	
	override generate(Mientras mientras, List<String> punteros) '''
		while(«mientras.condicion.generate(punteros)»){
			«FOR sentencia:mientras.sentencias»
				«sentencia.generate(punteros)»
			«ENDFOR»
		}
	'''
	
	/* 15) /* -------------------------------------------------------------------------------------------------------------------- */
	/**
	 * Función encargada de generar la entidad Desde.
	 * @param desde
	 */	
	override generate(Desde desde, List<String> punteros) '''
		for(«desde.asignacion.generate(punteros)» «desde.asignacion.valor_asignacion.toString» <= «desde.condicion.generate(punteros)»; «desde.asignacion.valor_asignacion.toString»++){
			«FOR sentencia:desde.sentencias»
				«sentencia.generate(punteros)»
			«ENDFOR»
		}
	'''
	
	/* 16) /* -------------------------------------------------------------------------------------------------------------------- */
	/**
	 * Función encargada de generar la entidad Repetir.
	 * @param repetir
	 */
	override generate(Repetir repetir, List<String> punteros) '''
		do{
			«FOR sentencia:repetir.sentencias»
				«sentencia.generate(punteros)»
			«ENDFOR»
		}while(!(«repetir.condicion.generate(null)»));
	'''
	
	/* 17) /* -------------------------------------------------------------------------------------------------------------------- */
	/**
	 * Función encargada de generar la entidad Devolver.
	 * @param devolver
	 */
	 override generate(Devolver devolver, List<String> punteros) '''
		return «devolver.devuelve.generate(punteros)»;
	'''
	
	/* 18) /* -------------------------------------------------------------------------------------------------------------------- */
	/**
	 * Función encargada de generar la entidad Inicio.
	 * @param inicio
	 */
	override generate(Inicio inicio) '''
		int main(){
			«FOR declaracion:inicio.declaraciones»
				«declaracion.generate»
			«ENDFOR»
			«FOR sentencia:inicio.sentencias»
				«sentencia.generate(null)»
			«ENDFOR»
		}
	'''
	
	/* 19) /* -------------------------------------------------------------------------------------------------------------------- */
	/**
	 * Función encargada de generar la entidad Sentencia.
	 * @param sentencia
	 */
	override generate(Sentencia sentencia, List<String> punteros) {
		if(sentencia.eClass.name.equals("AsignacionNormal")) {
			var AsignacionNormal asignacionNormal = sentencia as AsignacionNormal
			asignacionNormal.generate(punteros)
		} else if(sentencia.eClass.name.equals("AsignacionCompleja")) {
			var AsignacionCompleja asignacionCompleja = sentencia as AsignacionCompleja
			asignacionCompleja.generate(punteros)
		} else if(sentencia.eClass.name.equals("LlamadaFuncion")) {
			var LlamadaFuncion llamadaFuncion = sentencia as LlamadaFuncion
			llamadaFuncion.generate(true, punteros)
		} else if(sentencia.eClass.name.equals("Si")) {
			var Si si = sentencia as Si
			si.generate(punteros)
		} else if(sentencia.eClass.name.equals("Segun")) {
			var Segun segun = sentencia as Segun
			segun.generate(punteros)
		} else if(sentencia.eClass.name.equals("Caso")) {
			var Caso caso = sentencia as Caso
			caso.generate(punteros)
		} else if (sentencia.eClass.name.equals("Mientras")) {
			var Mientras mientras = sentencia as Mientras
			mientras.generate(punteros)
		} else if (sentencia.eClass.name.equals("Repetir")) {
			var Repetir repetir = sentencia as Repetir
			repetir.generate(punteros)
		} else if (sentencia.eClass.name.equals("Desde")) {
			var Desde desde = sentencia as Desde
			desde.generate(punteros)
		} else if (sentencia.eClass.name.equals("Leer")) {
			if(moduloActual != null) {
				var Leer leer = sentencia as Leer
				leer.generate(null, moduloActual.implementacion.subprocesos, false)
			} else {
				var Leer leer = sentencia as Leer
				var inicio = EcoreUtil2.getContainerOfType(leer, Inicio);
				if(inicio != null) {
					leer.generate(algoritmoActual.inicio.sentencias, algoritmoActual.subprocesos, true)
				} else {
					leer.generate(algoritmoActual.inicio.sentencias, algoritmoActual.subprocesos, false)
				}
			}
		} else if (sentencia.eClass.name.equals("Escribir")) {
			if(moduloActual != null) {
				var Escribir escribir = sentencia as Escribir
				escribir.generate(punteros, null, moduloActual.implementacion.subprocesos, false)
			} else {
				var Escribir escribir = sentencia as Escribir
				var inicio = EcoreUtil2.getContainerOfType(escribir, Inicio);
				if(inicio != null) {
					escribir.generate(punteros, algoritmoActual.inicio.sentencias, algoritmoActual.subprocesos, true)
				} else {
					escribir.generate(punteros, algoritmoActual.inicio.sentencias, algoritmoActual.subprocesos, false)
				}
			}
		} else if (sentencia.eClass.name.equals("FuncionFicheroAbrir")) {
			var FuncionFicheroAbrir funcionFicheroAbrir = sentencia as FuncionFicheroAbrir
			funcionFicheroAbrir.generate
		} else if (sentencia.eClass.name.equals("FuncionFicheroCerrar")) {
			var FuncionFicheroCerrar funcionFicheroCerrar = sentencia as FuncionFicheroCerrar
			funcionFicheroCerrar.generate
		} else if (sentencia.eClass.name.equals("FuncionInterna")) {
			var FuncionInterna interna = sentencia as FuncionInterna
			interna.generate(true, punteros)
		}
	}
	
	/* 20) /* -------------------------------------------------------------------------------------------------------------------- */
	/**
	 * Función encargada de generar la entidad ValorComplejo.
	 * @param valorComplejo
	 */
	override generate(ValorComplejo valorComplejo) {
		if(valorComplejo.eClass.name.equals("ValorRegistro")) {
			var ValorRegistro valorRegistro = valorComplejo as ValorRegistro
			valorRegistro.generate
		} else if(valorComplejo.eClass.name.equals("ValorVector")) {
			var ValorVector valorVector = valorComplejo as ValorVector
			valorVector.generate
		} else if(valorComplejo.eClass.name.equals("ValorMatriz")) {
			var ValorMatriz valorMatriz = valorComplejo as ValorMatriz
			valorMatriz.generate
		}
	}
	
	/*
	 * Función auxiliar de generate(ValorComplejo) que se encarga de generar la entidad ValorRegistro.
	 */
	 override generate(ValorRegistro valorRegistro) {
		var declaracionValorRegistro = new String;
		declaracionValorRegistro = valorRegistro.nombre_registro.toString + '.'
		for (campo : valorRegistro.campos) {
			if(valorRegistro.campos.indexOf(campo) == valorRegistro.campos.size() - 1) {
				declaracionValorRegistro = declaracionValorRegistro + campo.generate.toString;
			} else {
				declaracionValorRegistro = declaracionValorRegistro + campo.generate.toString + ".";
			}
		}
		return declaracionValorRegistro;
	}
	
	/*
	 * Función auxiliar de generate(ValorComplejo) que se encarga de generar la entidad ValorVector.
	 */
	override generate(ValorVector valorVector) {
		var declaracionValorVector = new String;
		if(valorVector.campos.size() == 0) {
			declaracionValorVector = valorVector.nombre_vector.toString + '[' + valorVector.indice.generate(null) + ']';
		}
		else {
			declaracionValorVector = valorVector.nombre_vector.toString + '[' + valorVector.indice.generate(null) + ']' + '.' + valorVector.campos.get(0).nombre_campo;
		}
		return declaracionValorVector;
	}
	
	/*
	 * Función auxiliar de generate(ValorComplejo) que se encarga de generar la entidad ValorMatriz.
	 */
	override generate(ValorMatriz valorMatriz) {
		var declaracionValorMatriz = new String;
		if(valorMatriz.campos.size() == 0) {
			declaracionValorMatriz = valorMatriz.nombre_matriz.toString + '[' + valorMatriz.primerIndice.generate(null) + '][' + valorMatriz.segundoIndice.generate(null) + ']';
		}
		else {
			declaracionValorMatriz = valorMatriz.nombre_matriz.toString + '[' + valorMatriz.primerIndice.generate(null) + '][' + valorMatriz.segundoIndice.generate(null) + ']' + '.' + valorMatriz.campos.get(0).nombre_campo;
		}
		return declaracionValorMatriz;
	}
	
	/*
	 * Función auxiliar de generate(ValorRegistro|ValorVector|ValorMatriz) que se encarga de generar la entidad CampoRegistro.
	 */
	override generate(CampoRegistro campoRegistro) {
		if(campoRegistro.primerIndice != null) { //Es un campo de tipo vector
			return campoRegistro.nombre_campo + '[' + campoRegistro.primerIndice.generate(null) + ']';
		} else if(campoRegistro.primerIndice != null && campoRegistro.segundoIndice != null) { //Es un campo de tipo matriz
			return campoRegistro.nombre_campo + '[' + campoRegistro.primerIndice.generate(null) + '][' + campoRegistro.segundoIndice.generate(null) + ']';
		} else { //Es un campo de tipo registro
			return campoRegistro.nombre_campo;
		}
	}
	
	/* 21) /* -------------------------------------------------------------------------------------------------------------------- */
	/**
	 * Función encargada de generar la entidad Operacion.
	 * @param operacion, punteros
	 */
	override generate(Operacion operacion, List<String> punteros) {
		if(operacion.eClass.name.equals("Entero")) {
			var Entero entero = operacion as Entero
			entero.generate	
		} else if(operacion.eClass.name.equals("Real")) {
			var Real real = operacion as Real
			real.generate
		} else if(operacion.eClass.name.equals("Logico")) {
			var Logico logico = operacion as Logico
			logico.generate
		} else if(operacion.eClass.name.equals("CadenaCaracteres")) {
			var CadenaCaracteres cadena = operacion as CadenaCaracteres
			cadena.generate
		} else if(operacion.eClass.name.equals("Caracter")) {
			var Caracter caracter = operacion as Caracter
			caracter.generate
		} else if(operacion.eClass.name.equals("VariableID")) {
			var VariableID variableID = operacion as VariableID
			if(punteros != null) {
				if(punteros.contains(variableID.nombre)) {
					return '*('+ variableID.generate + ')';
				}
				else {
					variableID.generate
				}
			} else {
				variableID.generate
			}
		} else if(operacion.eClass.name.equals("ValorRegistro")) {
			var ValorRegistro valorRegistro = operacion as ValorRegistro
			valorRegistro.generate
		} else if(operacion.eClass.name.equals("ValorVector")) {
			var ValorVector valorVector = operacion as ValorVector
			valorVector.generate
		} else if(operacion.eClass.name.equals("ValorMatriz")) {
			var ValorMatriz valorMatriz = operacion as ValorMatriz
			valorMatriz.generate
		} else if(operacion.eClass.name.equals("LlamadaFuncion")) {
			var LlamadaFuncion llamadaFuncion = operacion as LlamadaFuncion
			llamadaFuncion.generate(false, punteros)
		} else if(operacion.eClass.name.equals("FuncionInterna")) {
			var FuncionInterna interna = operacion as FuncionInterna
			interna.generate(false, punteros)
		} else if(operacion.eClass.name.equals("Suma")) {
			var Suma suma = operacion as Suma
			suma.generate(punteros)
		} else if(operacion.eClass.name.equals("Resta")) {
			var Resta resta = operacion as Resta
			resta.generate(punteros)
		} else if(operacion.eClass.name.equals("Multiplicacion")) {
			var Multiplicacion multiplicacion = operacion as Multiplicacion
			multiplicacion.generate(punteros)
		} else if(operacion.eClass.name.equals("DivisionEntera")) {
			var DivisionEntera divisionEntera = operacion as DivisionEntera
			divisionEntera.generate(punteros)
		} else if(operacion.eClass.name.equals("DivisionReal")) {
			var DivisionReal divisionReal = operacion as DivisionReal
			divisionReal.generate(punteros)
		} else if(operacion.eClass.name.equals("Mod")) {
			var Mod mod = operacion as Mod
			mod.generate(punteros)
		} else if(operacion.eClass.name.equals("OperacionParentesis")) {
			var OperacionParentesis operacionParentesis = operacion as OperacionParentesis
			operacionParentesis.generate(punteros)
		} else if (operacion.eClass.name.equals("Or")) {
			var Or or = operacion as Or
			or.generate(punteros)
		} else if (operacion.eClass.name.equals("And")) {
			var And and = operacion as And
			and.generate(punteros)
		} else if (operacion.eClass.name.equals("Comparacion")) {
			var Comparacion comparacion = operacion as Comparacion
			comparacion.generate(punteros)
		} else if(operacion.eClass.name.equals("Igualdad")) {
			var Igualdad igualdad = operacion as Igualdad
			igualdad.generate(punteros)
		} else if(operacion.eClass.name.equals("OperacionCompleta")) {
			var OperacionCompleta operacionCompleta = operacion as OperacionCompleta
			operacionCompleta.generate(punteros)
		}
	}
	
	/*
	 * Función auxiliar de generate(Operacion) que se encarga de generar la entidad Entero.
	 */
	override generate(Entero entero) {
		return entero.valor.toString
	}
	
	/*
	 * Función auxiliar de generate(Operacion) que se encarga de generar la entidad Real.
	 */
	override generate(Real real) {
		return real.valor.toString
	}
	
	/*
	 * Función auxiliar de generate(Operacion) que se encarga de generar la entidad Logico.
	 */
	override generate(Logico logico) {
		if (logico.valor.equals(readerMessages.getBundle().getString("VERDADERO")))
			return "1"
		else
			return "0"
	}
	
	/*
	 * Función auxiliar de generate(Operacion) que se encarga de generar la entidad CadenaCaracteres.
	 */
	override generate(CadenaCaracteres cadena) {
		return cadena.valor;
	}
	
	/*
	 * Función auxiliar de generate(Operacion) que se encarga de generar la entidad Caracter.
	 */
	override generate(Caracter caracter) {
		return caracter.valor;
	}
	
	/*
	 * Función auxiliar de generate(Operacion) que se encarga de generar la entidad VariableID.
	 */
	override generate(VariableID variableID) '''
	«IF variableID.nombre.equals(readerMessages.getBundle().getString("INTERNAS_COS"))»cos«ELSEIF variableID.nombre.equals(readerMessages.getBundle().getString("INTERNAS_SEN"))»sin«ELSEIF variableID.nombre.equals(readerMessages.getBundle().getString("INTERNAS_CUADRADO"))»pow«ELSEIF variableID.nombre.equals(readerMessages.getBundle().getString("INTERNAS_EXP"))»exp2«ELSEIF variableID.nombre.equals(readerMessages.getBundle().getString("INTERNAS_LN"))»log«ELSEIF variableID.nombre.equals(readerMessages.getBundle().getString("INTERNAS_LOG"))»log10«ELSEIF variableID.nombre.equals(readerMessages.getBundle().getString("INTERNAS_SQRT"))»sqrt«ELSEIF variableID.nombre.equals(readerMessages.getBundle().getString("INTERNAS_CONCATENA"))»strcat«ELSEIF variableID.nombre.equals(readerMessages.getBundle().getString("INTERNAS_COPIAR"))»strcpy«ELSEIF variableID.nombre.equals(readerMessages.getBundle().getString("INTERNAS_LONGITUD"))»strlen«ELSE»«variableID.nombre»«ENDIF»«FOR matri:variableID.mat»«matri.toString»«ENDFOR»'''
	
	/*
	 * Función auxiliar de generate(Operacion) que se encarga de generar la entidad Suma.
	 */
	override generate(Suma suma, List<String> punteros) {
		return suma.left.generate(punteros) + " " + suma.signo_op + " " + suma.getNegacionesFinales().generate + " " + suma.right.generate(punteros);
	}
	
	/*
	 * Función auxiliar de generate(Operacion) que se encarga de generar la entidad Resta.
	 */
	override generate(Resta resta, List<String> punteros) {
		return resta.left.generate(punteros) + " " + resta.signo_op + " " + resta.getNegacionesFinales().generate + " " + resta.right.generate(punteros);
	}
	
	/*
	 * Función auxiliar de generate(Operacion) que se encarga de generar la entidad DivisionEntera.
	 */
	override generate(DivisionEntera divisionEntera, List<String> punteros) {
		return divisionEntera.left.generate(punteros) + " " + divisionEntera.signo_op + " " + divisionEntera.getNegacionesFinales().generate + " " + divisionEntera.right.generate(punteros);
	}
	
	/*
	 * Función auxiliar de generate(Operacion) que se encarga de generar la entidad Multiplicacion.
	 */
	override generate(Multiplicacion multiplicacion, List<String> punteros) {
		return multiplicacion.left.generate(punteros) + " " + multiplicacion.signo_op + " " + multiplicacion.getNegacionesFinales().generate + " " + multiplicacion.right.generate(punteros);
	}
	
	
	/*
	 * Función auxiliar de generate(Operacion) que se encarga de generar la entidad OperacionParentesis.
	 */
	override generate(OperacionParentesis operacionParentesis, List<String> punteros) {
		return "(" + operacionParentesis.getNegacionesFinales().generate + " " + operacionParentesis.valor_operacion.generate(punteros) + ")"
	}
	
	/*
	 * Función auxiliar de generate(Operacion) que se encarga de generar la entidad DivisionReal.
	 */	
	override generate(DivisionReal divisionReal, List<String> punteros) {
		return divisionReal.left.generate(punteros) + " / " + divisionReal.getNegacionesFinales().generate + " " + divisionReal.right.generate(punteros);
	}
	
	
	/*
	 * Función auxiliar de generate(Operacion) que se encarga de generar la entidad Mod.
	 */
	override generate(Mod mod, List<String> punteros) {
		return mod.left.generate(punteros) + " " + "%" + " " + mod.getNegacionesFinales().generate + " " + mod.right.generate(punteros);
	}
	
	/*
	 * Función auxiliar de generate(Operacion) que se encarga de generar la entidad Or.
	 */
	override generate(Or or, List<String> punteros) {
		return or.left.generate(punteros) + " " + "||" + " " + or.getNegacionesFinales().generate + " " + or.right.generate(punteros);
	}
	
	/*
	 * Función auxiliar de generate(Operacion) que se encarga de generar la entidad And.
	 */
	override generate(And and, List<String> punteros) {
		return and.left.generate(punteros) + " " + "&&" + " " + and.getNegacionesFinales().generate + " " + and.right.generate(punteros);
	}
	
	/*
	 * Función auxiliar de generate(Operacion) que se encarga de generar la entidad Comparacion.
	 */
	override generate(Comparacion comparacion, List<String> punteros) {
		return comparacion.left.generate(punteros) + " " + comparacion.signo_op + " " + comparacion.getNegacionesFinales().generate + " " + comparacion.right.generate(punteros);
	}
	
	/*
	 * Función auxiliar de generate(Operacion) que se encarga de generar la entidad Igualdad.
	 */
	override generate(Igualdad igualdad, List<String> punteros) {
		if(igualdad.signo_op.literal.equals("=")) {
			return igualdad.left.generate(punteros) + " " + "==" + " " + igualdad.getNegacionesFinales().generate + " " + igualdad.right.generate(punteros);
		} else {
			return igualdad.left.generate(punteros) + " " + "!=" + " " + igualdad.getNegacionesFinales().generate + " " + igualdad.right.generate(punteros);
		}
	}
	
	/*
	 * Función auxiliar de generate(Operacion) que se encarga de generar la entidad OperacionCompleta.
	 */
	override generate(OperacionCompleta operacionCompleta, List<String> punteros) {
		return operacionCompleta.negacionesIniciales.generate + " " + operacionCompleta.valor_operacion.generate(punteros);
	}
	
	/*
	 * Función auxiliar de generate(Operacion) que se encarga de generar las negaciones.
	 */
	def generate(List<String> negaciones) {
		var negacionesString = "";
		for(String negacion: negaciones) {
			if(negacion.equals("no")) {
				negacionesString = negacionesString + "!";
			} else {
				negacionesString = negacionesString + negacion;	
			}
		}
		return negacionesString;
	}
	
	/* 22) /* -------------------------------------------------------------------------------------------------------------------- */
	/**
	 * Función encargada de generar la entidad Constante.
	 * @param constante
	 */
	override generate(Constante constante) '''
		#define «constante.variable.nombre»  «constante.valor.generate(null)»
	'''
	
	
	/* 23) /* -------------------------------------------------------------------------------------------------------------------- */
	/**
	 * Función encargada de generar la entidad AsignacionNormal.
	 * @param asignacionNormal
	 */
	override generate(AsignacionNormal asignacionNormal, List<String> punteros) {
		var asignacion = new String();
		
		//lado izquierdo de la asignación
		if(punteros != null) {
			if(punteros.contains(asignacionNormal.valor_asignacion)) {
				asignacion = "*(" + asignacionNormal.valor_asignacion + ")";
			} else {
				asignacion = asignacionNormal.valor_asignacion;
			}
		}
		else {
			asignacion = asignacionNormal.valor_asignacion;
		}
		
		//lado derecho de la asignación
		for(matri:asignacionNormal.mat) {
			asignacion = asignacion + matri.toString;
		}
		asignacion = asignacion + " = " + asignacionNormal.operador.generate(punteros) + ";";
		return asignacion;
	}
	
	/* 24) /* -------------------------------------------------------------------------------------------------------------------- */
	/**
	 * Función encargada de generar la entidad AsignacionCompleja.
	 * @param asignacionCompleja
	 */
	override generate(AsignacionCompleja asignacionCompleja, List<String> punteros) '''
	«asignacionCompleja.valor_asignacion.generate(punteros).toString» = «asignacionCompleja.operador.generate(punteros).toString»;'''
	
	
	/* 25) /* -------------------------------------------------------------------------------------------------------------------- */
	/**
	 * Función encargada de generar la entidad LlamadaFuncion.
	 * @param llamadaFuncion, sentencia
	 */
	override generate(LlamadaFuncion llamadaFuncion, boolean sentencia, List<String> punteros) {}
	
	
	/*
	 * Función auxiliar de generate(LlamadaFuncion) que se encarga de generar los parametros utilizados en la llamada.
	 */
	def getParametros(EList<Operacion> operaciones, String nombreSubproceso, List<String> punteros) {
		var definicionParametros = "";
		for (operacion : operaciones) {
			if (operaciones.indexOf(operacion) != 0) {
				definicionParametros = definicionParametros + ", "
			}
			if(subprocesosConPunteros.containsKey(nombreSubproceso)) {
				if(subprocesosConPunteros.get(nombreSubproceso).contains(operaciones.indexOf(operacion)+1)) {
					definicionParametros = definicionParametros + " &" + operacion.generate(punteros);
				}
				else {
					definicionParametros = definicionParametros + operacion.generate(punteros);
				}
			}
			else {
				definicionParametros = definicionParametros + operacion.generate(punteros);
			}
		}
		return definicionParametros;
	}
	
	/* 26) /* -------------------------------------------------------------------------------------------------------------------- */
	/**
	 * Función encargada de generar la entidad FuncionFicheroAbrir.
	 * @param funcionFicheroAbrir
	 */
	override generate(FuncionFicheroAbrir funcionFicheroAbrir) '''
		«funcionFicheroAbrir.variable.get(0).generate(null)» = fopen(«funcionFicheroAbrir.variable.get(1).generate(null)»,"«getModoApertura(funcionFicheroAbrir.modo.getName)»");
	'''
	
	/*
	 * Función auxiliar de generate(FuncionFicheroAbrir) que se encarga de obtener el modo de apertura del fichero seleccionado.
	 */
	def getModoApertura(String modoApertura) {
		if(modoApertura.equals(readerMessages.getBundle().getString("ESCRITURA"))) {
			return "w";
		}
		else if(modoApertura.equals(readerMessages.getBundle().getString("LECTURA"))) {
			return "r";
		}
	}
	
	/* 27) /* -------------------------------------------------------------------------------------------------------------------- */
	/**
	 * Función encargada de generar la entidad FuncionFicheroCerrar.
	 * @param funcionFicheroCerrar
	 */
	override generate(FuncionFicheroCerrar funcionFicheroCerrar)'''
		fclose(«funcionFicheroCerrar.variable.generate(null)»);
	'''
	
	
	/* 28) /* -------------------------------------------------------------------------------------------------------------------- */
	/**
	 * Función encargada de generar la entidad Escribir.
	 * @param escribir, punteros
	 */
	override generate(Escribir escribir, List<String> punteros, List<Sentencia> sentencias, List<Subproceso> subprocesos, boolean inicio) {}
	
	/*
	 * Función auxiliar de generate(Escribir) que se encarga de buscar el tipo de una operacion.
	 */
	def String getTipoOperador(Operacion operacion, boolean inicio, String nombreActual) {
		if(operacion.eClass.name.equals("OperacionCompleta")) {
			var operacionCompleta = operacion as OperacionCompleta;
			return getTipoOperadorAux(operacionCompleta.valor_operacion, inicio, nombreActual);
		} else {
			return getTipoOperadorAux(operacion, inicio, nombreActual);
		}
	}
	
	/*
	 * Función auxiliar de getTipoOperador(Operacion) - DRY.
	 */
	def String getTipoOperadorAux(Operacion operacion, boolean inicio, String nombreActual) {
		if(operacion.eClass.name.equals("VariableID")) {
			var varID = operacion as VariableID;
			if(inicio) {
				return variablesInicio.get(varID.nombre);
			} else {
				return variablesSubprocesos.get(nombreActual).get(varID.nombre);
			}
		} else if(operacion.eClass.name.equals("ValorVector")) {
				var vector = operacion as ValorVector;
				if(vector.campos.size() == 0) {
					if(inicio) {
						return vectoresMatrices.get(variablesInicio.get(vector.nombre_vector));
					} else {
						return vectoresMatrices.get(variablesSubprocesos.get(nombreActual).get(vector.nombre_vector));
					}
				} else {
					if(inicio) {
						return registros.get(vectoresMatrices.get(variablesInicio.get(vector.nombre_vector))).get(vector.campos.get(0).nombre_campo);
					} else {
						return registros.get(vectoresMatrices.get(variablesSubprocesos.get(nombreActual).get(vector.nombre_vector))).get(vector.campos.get(0).nombre_campo);
					}
				}	
		} else if(operacion.eClass.name.equals("ValorMatriz")) {
				var matriz = operacion as ValorMatriz;
				if(matriz.campos.size() == 0) {
					if(inicio) {
						return vectoresMatrices.get(variablesInicio.get(matriz.nombre_matriz));
					} else {
						return vectoresMatrices.get(variablesSubprocesos.get(nombreActual).get(matriz.nombre_matriz));
					}
				}
				else {
					if(inicio) {
						return registros.get(vectoresMatrices.get(variablesInicio.get(matriz.nombre_matriz))).get(matriz.campos.get(0).nombre_campo);
					} else {
						return registros.get(vectoresMatrices.get(variablesSubprocesos.get(nombreActual).get(matriz.nombre_matriz))).get(matriz.campos.get(0).nombre_campo);
					}
				}
		} else if(operacion.eClass.name.equals("ValorRegistro")) {
				var registro = operacion as ValorRegistro;
				//El último campo nos proporcionará el tipo
				if(registro.campos.size() == 1) {
					if(inicio) {
						return registros.get(variablesInicio.get(registro.nombre_registro)).get(registro.campos.get(0).nombre_campo);
					} else {
						return registros.get(variablesSubprocesos.get(nombreActual).get(registro.nombre_registro)).get(registro.campos.get(0).nombre_campo);
					}
				} else {
					var campoAnterior = "";
					var registroReferenciado = "";
						
					for(campo: registro.campos) {
						if(registro.campos.indexOf(campo) != 0) {
							var registroReferenciadoAux = "";
								
							if(registroReferenciado != "") {
								registroReferenciadoAux = registros.get(registroReferenciado).get(campoAnterior);
							} else {
								if(inicio) {
									registroReferenciadoAux = registros.get(variablesInicio.get(registro.nombre_registro)).get(campoAnterior);
								} else {
									registroReferenciadoAux = registros.get(variablesSubprocesos.get(nombreActual).get(registro.nombre_registro)).get(campoAnterior);
								}
							}
								
							if(registroReferenciadoAux != null && !registroReferenciadoAux.equals(readerMessages.getBundle().getString("TIPO_ENTERO")) && !registroReferenciadoAux.equals(readerMessages.getBundle().getString("TIPO_REAL")) 
								&& !registroReferenciadoAux.equals(readerMessages.getBundle().getString("TIPO_CADENA")) && !registroReferenciadoAux.equals(readerMessages.getBundle().getString("TIPO_CARACTER")) &&
									!registroReferenciadoAux.equals(readerMessages.getBundle().getString("TIPO_LOGICO"))) {
										registroReferenciado = registroReferenciadoAux;
							}
						}
						campoAnterior = campo.getNombre_campo();
					}
					return registros.get(registroReferenciado).get(campoAnterior);
				}	
		} else if(operacion.eClass.name.equals("LlamadaFuncion")) {
			var llamadaFuncion = operacion as LlamadaFuncion;
			if(funciones.containsKey(llamadaFuncion.nombre)) {
				return funciones.get(llamadaFuncion.nombre);
			} else {
				if(inicio) {
					return tiposSubprocesos.get(variablesInicio.get(llamadaFuncion.nombre.replace("(", "")));
				} else {
					return tiposSubprocesos.get(variablesSubprocesos.get(nombreActual).get(llamadaFuncion.nombre.replace("(", "")));
				}
			}
		} else if(operacion.eClass.name.equals("Entero") || operacion.eClass.name.equals("Logico")) {
			return readerMessages.getBundle().getString("TIPO_ENTERO");	
		} else if(operacion.eClass.name.equals("CadenaCaracteres")) {
			return readerMessages.getBundle().getString("TIPO_CADENA");	
		} else if(operacion.eClass.name.equals("Caracter")) {
			return readerMessages.getBundle().getString("TIPO_CARACTER");
		} else if(operacion.eClass.name.equals("Real")) {
			return readerMessages.getBundle().getString("TIPO_REAL");
		} else if(operacion.eClass.name.equals("FuncionInterna")) {
			var interna = operacion as FuncionInterna;
			if(interna.nombre.equals(readerMessages.getBundle().getString("INTERNAS_CONCATENA") + '(') 
				|| interna.nombre.equals(readerMessages.getBundle().getString("INTERNAS_COPIAR") + '(')) {
				return readerMessages.getBundle().getString("TIPO_CADENA");	
			} else if(interna.nombre.equals(readerMessages.getBundle().getString("INTERNAS_LONGITUD") + '(')) {
				return readerMessages.getBundle().getString("TIPO_ENTERO");	
			} else {
				return readerMessages.getBundle().getString("TIPO_REAL");
			}
		} else if(operacion.eClass.name.equals("Suma")) {
			var suma = operacion as Suma;
			var tipoRight = suma.right.getTipoOperador(inicio, nombreActual);
			var tipoLeft = suma.left.getTipoOperador(inicio, nombreActual);
				
			if(tipoRight.equals(tipoLeft)) {
				return tipoRight;
			} else {
				if(tipoRight.equals(readerMessages.getBundle().getString("TIPO_CADENA")) || tipoLeft.equals(readerMessages.getBundle().getString("TIPO_CADENA"))) {
					return readerMessages.getBundle().getString("TIPO_CADENA");
				} else if(tipoRight.equals(readerMessages.getBundle().getString("TIPO_REAL")) || tipoLeft.equals(readerMessages.getBundle().getString("TIPO_REAL"))) {
					return readerMessages.getBundle().getString("TIPO_REAL");
				}
			}
		} else if(operacion.eClass.name.equals("Resta")) {
			var resta = operacion as Resta;
				
			var tipoRight = resta.right.getTipoOperador(inicio, nombreActual);
			var tipoLeft = resta.left.getTipoOperador(inicio, nombreActual);
				
			if(tipoRight.equals(tipoLeft)) {
				return tipoRight;
			} else {
				if(tipoRight.equals(readerMessages.getBundle().getString("TIPO_CADENA")) || tipoLeft.equals(readerMessages.getBundle().getString("TIPO_CADENA"))) {
					return readerMessages.getBundle().getString("TIPO_CADENA");
				} else if(tipoRight.equals(readerMessages.getBundle().getString("TIPO_REAL")) || tipoLeft.equals(readerMessages.getBundle().getString("TIPO_REAL"))) {
					return readerMessages.getBundle().getString("TIPO_REAL");
				}
			}
		} else if(operacion.eClass.name.equals("Multiplicacion")) {
			var multiplicacion = operacion as Multiplicacion;
				
			var tipoRight = multiplicacion.right.getTipoOperador(inicio, nombreActual);
			var tipoLeft = multiplicacion.left.getTipoOperador(inicio, nombreActual);
				
			if(tipoRight.equals(tipoLeft)) {
				return tipoRight;
			} else {
				if(tipoRight.equals(readerMessages.getBundle().getString("TIPO_CADENA")) || tipoLeft.equals(readerMessages.getBundle().getString("TIPO_CADENA"))) {
					return readerMessages.getBundle().getString("TIPO_CADENA");
				} else if(tipoRight.equals(readerMessages.getBundle().getString("TIPO_REAL")) || tipoLeft.equals(readerMessages.getBundle().getString("TIPO_REAL"))) {
					return readerMessages.getBundle().getString("TIPO_REAL");
				}
			}
		} else if(operacion.eClass.name.equals("DivisionEntera")) {
			var divisionEntera = operacion as DivisionEntera;
				
			var tipoRight = divisionEntera.right.getTipoOperador(inicio, nombreActual);
			var tipoLeft = divisionEntera.left.getTipoOperador(inicio, nombreActual);
				
			if(tipoRight.equals(tipoLeft)) {
				return tipoRight;
			} else {
				if(tipoRight.equals(readerMessages.getBundle().getString("TIPO_CADENA")) || tipoLeft.equals(readerMessages.getBundle().getString("TIPO_CADENA"))) {
					return readerMessages.getBundle().getString("TIPO_CADENA");
				} else if(tipoRight.equals(readerMessages.getBundle().getString("TIPO_REAL")) || tipoLeft.equals(readerMessages.getBundle().getString("TIPO_REAL"))) {
					return readerMessages.getBundle().getString("TIPO_REAL");
				}
			}
		} else if(operacion.eClass.name.equals("DivisionReal")) {
			var divisionReal = operacion as DivisionReal;
				
			var tipoRight = divisionReal.right.getTipoOperador(inicio, nombreActual);
			var tipoLeft = divisionReal.left.getTipoOperador(inicio, nombreActual);
				
			if(tipoRight.equals(tipoLeft)) {
				return tipoRight;
			} else {
				if(tipoRight.equals(readerMessages.getBundle().getString("TIPO_CADENA")) || tipoLeft.equals(readerMessages.getBundle().getString("TIPO_CADENA"))) {
					return readerMessages.getBundle().getString("TIPO_CADENA");
				} else if(tipoRight.equals(readerMessages.getBundle().getString("TIPO_REAL")) || tipoLeft.equals(readerMessages.getBundle().getString("TIPO_REAL"))) {
					return readerMessages.getBundle().getString("TIPO_REAL");
				}
			}
		} else if(operacion.eClass.name.equals("Mod")) {
			var mod = operacion as Mod;
				
			var tipoRight = mod.right.getTipoOperador(inicio, nombreActual);
			var tipoLeft = mod.left.getTipoOperador(inicio, nombreActual);
				
			if(tipoRight.equals(tipoLeft)) {
				return tipoRight;
			} else {
				if(tipoRight.equals(readerMessages.getBundle().getString("TIPO_CADENA")) || tipoLeft.equals(readerMessages.getBundle().getString("TIPO_CADENA"))) {
					return readerMessages.getBundle().getString("TIPO_CADENA");
				} else if(tipoRight.equals(readerMessages.getBundle().getString("TIPO_REAL")) || tipoLeft.equals(readerMessages.getBundle().getString("TIPO_REAL"))) {
					return readerMessages.getBundle().getString("TIPO_REAL");
				}
			}
		} else if(operacion.eClass.name.equals("Or")) {
			var or = operacion as Or;
				
			var tipoRight = or.right.getTipoOperador(inicio, nombreActual);
			var tipoLeft = or.left.getTipoOperador(inicio, nombreActual);
				
			if(tipoRight.equals(tipoLeft)) {
				return tipoRight;
			} else {
				if(tipoRight.equals(readerMessages.getBundle().getString("TIPO_CADENA")) || tipoLeft.equals(readerMessages.getBundle().getString("TIPO_CADENA"))) {
					return readerMessages.getBundle().getString("TIPO_CADENA");
				} else if(tipoRight.equals(readerMessages.getBundle().getString("TIPO_REAL")) || tipoLeft.equals(readerMessages.getBundle().getString("TIPO_REAL"))) {
					return readerMessages.getBundle().getString("TIPO_REAL");
				}
			}
		} else if(operacion.eClass.name.equals("And")) {
			var and = operacion as And;
				
			var tipoRight = and.right.getTipoOperador(inicio, nombreActual);
			var tipoLeft = and.left.getTipoOperador(inicio, nombreActual);
				
			if(tipoRight.equals(tipoLeft)) {
				return tipoRight;
			} else {
				if(tipoRight.equals(readerMessages.getBundle().getString("TIPO_CADENA")) || tipoLeft.equals(readerMessages.getBundle().getString("TIPO_CADENA"))) {
					return readerMessages.getBundle().getString("TIPO_CADENA");
				} else if(tipoRight.equals(readerMessages.getBundle().getString("TIPO_REAL")) || tipoLeft.equals(readerMessages.getBundle().getString("TIPO_REAL"))) {
					return readerMessages.getBundle().getString("TIPO_REAL");
				}
			}
		} else if(operacion.eClass.name.equals("Comparacion")) {
			var comparacion = operacion as Comparacion;
				
			var tipoRight = comparacion.right.getTipoOperador(inicio, nombreActual);
			var tipoLeft = comparacion.left.getTipoOperador(inicio, nombreActual);
				
			if(tipoRight.equals(tipoLeft)) {
				return tipoRight;
			} else {
				if(tipoRight.equals(readerMessages.getBundle().getString("TIPO_CADENA")) || tipoLeft.equals(readerMessages.getBundle().getString("TIPO_CADENA"))) {
					return readerMessages.getBundle().getString("TIPO_CADENA");
				} else if(tipoRight.equals(readerMessages.getBundle().getString("TIPO_REAL")) || tipoLeft.equals(readerMessages.getBundle().getString("TIPO_REAL"))) {
					return readerMessages.getBundle().getString("TIPO_REAL");
				}
			}
		} else if(operacion.eClass.name.equals("Igualdad")) {
			var igualdad = operacion as Igualdad;
				
			var tipoRight = igualdad.right.getTipoOperador(inicio, nombreActual);
			var tipoLeft = igualdad.left.getTipoOperador(inicio, nombreActual);
				
			if(tipoRight.equals(tipoLeft)) {
				return tipoRight;
			} else {
				if(tipoRight.equals(readerMessages.getBundle().getString("TIPO_CADENA")) || tipoLeft.equals(readerMessages.getBundle().getString("TIPO_CADENA"))) {
					return readerMessages.getBundle().getString("TIPO_CADENA");
				} else if(tipoRight.equals(readerMessages.getBundle().getString("TIPO_REAL")) || tipoLeft.equals(readerMessages.getBundle().getString("TIPO_REAL"))) {
					return readerMessages.getBundle().getString("TIPO_REAL");
				}
			}
		} else if(operacion.eClass.name.equals("OperacionParentesis")) {
			var operacionParentesis = operacion as OperacionParentesis;
			return operacionParentesis.valor_operacion.getTipoOperador(inicio, nombreActual);
		}
	}	
	
	/* 29) /* -------------------------------------------------------------------------------------------------------------------- */
	/**
	 * Función encargada de generar la entidad Leer.
	 * @param leer, sentencias, subprocesos, algoritmo
	 */
	override generate(Leer leer, List<Sentencia> sentencias, List<Subproceso> subprocesos, boolean inicio) {}
}