package vary.pseudocodigo.dsl.c.generator.c

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.generator.IFileSystemAccess
import java.util.Map
import java.util.HashMap
import java.util.ArrayList
import diagramapseudocodigo.Codigo
import diagramapseudocodigo.TipoComplejo
import diagramapseudocodigo.Enumerado
import diagramapseudocodigo.valor
import diagramapseudocodigo.Operador
import diagramapseudocodigo.VariableID
import diagramapseudocodigo.Declaracion
import diagramapseudocodigo.DeclaracionVariable
import diagramapseudocodigo.Variable
import diagramapseudocodigo.DeclaracionPropia
import diagramapseudocodigo.Subproceso
import diagramapseudocodigo.ParametroFuncion
import diagramapseudocodigo.TipoExistente
import diagramapseudocodigo.TipoDefinido
import diagramapseudocodigo.Vector
import diagramapseudocodigo.Matriz
import diagramapseudocodigo.Registro
import diagramapseudocodigo.impl.VectorImpl
import diagramapseudocodigo.impl.MatrizImpl
import diagramapseudocodigo.impl.RegistroImpl
import diagramapseudocodigo.impl.ArchivoImpl
import diagramapseudocodigo.Archivo
import diagramapseudocodigo.impl.EnumeradoImpl
import diagramapseudocodigo.impl.SubrangoNumericoImpl
import diagramapseudocodigo.SubrangoNumerico
import diagramapseudocodigo.SubrangoEnumerado
import diagramapseudocodigo.impl.SubrangoEnumeradoImpl
import diagramapseudocodigo.Tipo
import diagramapseudocodigo.impl.TipoDefinidoImpl
import diagramapseudocodigo.impl.TipoExistenteImpl
import diagramapseudocodigo.Comentario
import diagramapseudocodigo.Constantes
import diagramapseudocodigo.FuncionFicheroAbrir
import diagramapseudocodigo.FuncionFicheroCerrar
import diagramapseudocodigo.Inicio
import diagramapseudocodigo.Funcion
import diagramapseudocodigo.impl.FuncionImpl
import diagramapseudocodigo.Procedimiento
import diagramapseudocodigo.impl.ProcedimientoImpl
import diagramapseudocodigo.TipoVariable
import org.eclipse.emf.common.util.EList
import diagramapseudocodigo.Sentencias
import diagramapseudocodigo.AsignacionNormal
import diagramapseudocodigo.impl.AsignacionNormalImpl
import diagramapseudocodigo.AsignacionCompleja
import diagramapseudocodigo.impl.AsignacionComplejaImpl
import diagramapseudocodigo.LlamadaFuncion
import diagramapseudocodigo.impl.LlamadaFuncionImpl
import diagramapseudocodigo.impl.SiImpl
import diagramapseudocodigo.Si
import diagramapseudocodigo.impl.segunImpl
import diagramapseudocodigo.segun
import diagramapseudocodigo.impl.CasoImpl
import diagramapseudocodigo.Caso
import diagramapseudocodigo.impl.mientrasImpl
import diagramapseudocodigo.mientras
import diagramapseudocodigo.impl.repetirImpl
import diagramapseudocodigo.repetir
import diagramapseudocodigo.impl.desdeImpl
import diagramapseudocodigo.desde
import diagramapseudocodigo.Negacion
import diagramapseudocodigo.impl.LeerImpl
import diagramapseudocodigo.Leer
import diagramapseudocodigo.impl.EscribirImpl
import diagramapseudocodigo.Escribir
import diagramapseudocodigo.impl.FuncionFicheroAbrirImpl
import diagramapseudocodigo.impl.FuncionFicheroCerrarImpl
import diagramapseudocodigo.impl.DeclaracionVariableImpl
import diagramapseudocodigo.impl.DeclaracionPropiaImpl
import diagramapseudocodigo.ValorComplejo
import diagramapseudocodigo.ValorRegistro
import diagramapseudocodigo.impl.ValorRegistroImpl
import diagramapseudocodigo.ValorVector
import diagramapseudocodigo.impl.ValorVectorImpl
import diagramapseudocodigo.ValorMatriz
import diagramapseudocodigo.impl.ValorMatrizImpl
import diagramapseudocodigo.CampoRegistro
import diagramapseudocodigo.NumeroEntero
import diagramapseudocodigo.impl.NumeroEnteroImpl
import diagramapseudocodigo.NumeroDecimal
import diagramapseudocodigo.impl.NumeroDecimalImpl
import diagramapseudocodigo.ValorBooleano
import diagramapseudocodigo.impl.ValorBooleanoImpl
import diagramapseudocodigo.ConstCadena
import diagramapseudocodigo.impl.ConstCadenaImpl
import diagramapseudocodigo.Caracter
import diagramapseudocodigo.impl.CaracterImpl
import diagramapseudocodigo.impl.VariableIDImpl
import diagramapseudocodigo.operacion
import diagramapseudocodigo.impl.operacionImpl
import diagramapseudocodigo.Internas
import diagramapseudocodigo.impl.InternasImpl
import diagramapseudocodigo.NombreInterna
import diagramapseudocodigo.Suma
import diagramapseudocodigo.impl.SumaImpl
import diagramapseudocodigo.Resta
import diagramapseudocodigo.impl.RestaImpl
import diagramapseudocodigo.Multiplicacion
import diagramapseudocodigo.impl.MultiplicacionImpl
import diagramapseudocodigo.impl.DivisionImpl
import diagramapseudocodigo.Division
import diagramapseudocodigo.impl.OrImpl
import diagramapseudocodigo.Or
import diagramapseudocodigo.impl.AndImpl
import diagramapseudocodigo.And
import diagramapseudocodigo.impl.ComparacionImpl
import diagramapseudocodigo.Comparacion
import diagramapseudocodigo.impl.IgualdadImpl
import diagramapseudocodigo.Igualdad
import diagramapseudocodigo.Negativa
import diagramapseudocodigo.Devolver
import diagramapseudocodigo.Sino
import vary.pseudocodigo.dsl.c.generator.util.ReadFileProperties
import vary.pseudocodigo.dsl.c.generator.util.ProjectLocationFolder
import java.io.IOException
import java.util.List
import diagramapseudocodigo.Algoritmo
import diagramapseudocodigo.impl.AlgoritmoImpl
import diagramapseudocodigo.Modulo
import diagramapseudocodigo.impl.ModuloImpl
import diagramapseudocodigo.Subrango
import vary.pseudocodigo.dsl.c.generator.VaryGeneratorInterface
import vary.pseudocodigo.dsl.c.validation.messages.ReadMessagesValidatorInterface
import diagramapseudocodigo.Mod
import diagramapseudocodigo.impl.ModImpl
import diagramapseudocodigo.Div
import diagramapseudocodigo.impl.DivImpl
import diagramapseudocodigo.OperacionParentesis
import diagramapseudocodigo.impl.OperacionParentesisImpl
import diagramapseudocodigo.OperacionCompleta
import diagramapseudocodigo.impl.OperacionCompletaImpl

/**
 * Generates code from your model files on save.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#TutorialCodeGeneration
 */
class VaryGrammarGeneratorC implements IGenerator, VaryGeneratorInterface {
	static Map<String, String> variablesInicio = new HashMap<String,String>();
	static Map<String, Map<String,String>>variablesSubprocesos = new HashMap<String,Map<String,String>>();
	static Map<String,String> vectoresMatrices = new HashMap<String,String>();
	static Map<String, Map<String,String>> registros = new HashMap<String, Map<String,String>>();
	static Map<String, ArrayList<String>> variablesEnumerados = new HashMap<String, ArrayList<String>>();
	static Map<String, String> funciones = new HashMap<String,String>();
	static ArrayList<String> enumerados = new ArrayList<String>();
	Algoritmo algoritmo;
	Modulo modulo;
	static boolean cabeceras;
	static ReadFileProperties readerFileProperties = new ReadFileProperties();
	static Map<String,ArrayList<Integer>> subprocesosConPunteros = new HashMap<String,ArrayList<Integer>>();
	static ReadMessagesValidatorInterface readerMessages;
	
	new(ReadMessagesValidatorInterface readerMessages) {
		VaryGrammarGeneratorC.readerMessages = readerMessages;
	}

	override void doGenerate(Resource resource, IFileSystemAccess myCFile) {

		for (myPseudo : resource.allContents.toIterable.filter(typeof(Codigo))) {
			
			algoritmo = null
			modulo = null
			
			ProjectLocationFolder.setResource(resource);
			
			System.out.println("La uri cogida es:"+ProjectLocationFolder.getPath())
			var contenidoFichero = new String();
			
			try {
					
				if(ProjectLocationFolder.getOS().equals("WIN32")) {
					contenidoFichero = readerFileProperties.readFilePropertiesWindows(ProjectLocationFolder.getPath() + ".varyproject", 1);
				}
					
				else {
					contenidoFichero = readerFileProperties.readFilePropertiesUnix("file:"+ProjectLocationFolder.getPath(), 1);
				}
					
			} catch(IOException e) {
				e.printStackTrace();
			}
			
			//Recogemos el tipo de proyecto de la cadena
			
			var tipoProyecto = contenidoFichero.replaceAll("ficheroCabeceras=","");
			
			if(tipoProyecto == "false") {
				cabeceras = false;
				if(myPseudo instanceof Algoritmo) {
					myCFile.generateFile(myPseudo.obtenerNombre + ".c", myPseudo.generate)	
				} else {
					myCFile.generateFile(myPseudo.obtenerNombre +".c", myPseudo.generate)
					myCFile.generateFile(myPseudo.obtenerNombre + ".h", myPseudo.generarCabeceras)
				}
			}
			else {
				cabeceras = true;
				myCFile.generateFile(myPseudo.obtenerNombre +".c", myPseudo.generate)
				myCFile.generateFile(myPseudo.obtenerNombre + ".h", myPseudo.generarCabeceras)
			}
		}
	}
	
	def obtenerNombre(Codigo myCodigo) {
		if (myCodigo.eClass.name.equals("Algoritmo")) {
			var Algoritmo algoritmo = new AlgoritmoImpl
			algoritmo = myCodigo as Algoritmo
			return algoritmo.nombre
		}
		else if(myCodigo.eClass.name.equals("Modulo")) {
			var Modulo modulo = new ModuloImpl
			modulo = myCodigo as Modulo
			return modulo.nombre
		}
	}
	
	
	def generarCabeceras(Codigo myCodigo) {
		if (myCodigo.eClass.name.equals("Algoritmo")) {
			var Algoritmo algoritmo = new AlgoritmoImpl
			algoritmo = myCodigo as Algoritmo
			generarCabeceras(algoritmo)
		}
		else if(myCodigo.eClass.name.equals("Modulo")) {
			var Modulo modulo = new ModuloImpl
			modulo = myCodigo as Modulo
			generarCabeceras(modulo)
		}
	}
	
	def generarCabeceras(Modulo myModulo) '''
		
		#ifndef «myModulo.nombre.toUpperCase»_H
		#define «myModulo.nombre.toUpperCase»_H
		
		«FOR myRefModulo:myModulo.importaciones»
			#include "«myRefModulo.nombre».h"
		«ENDFOR»
		
		«FOR myConstante:myModulo.implementacion.constantes»
			«IF myModulo.exporta_constantes.contains(myConstante.variable.nombre)»
				«myConstante.generate»
			«ENDIF»
		«ENDFOR»

		
		«FOR myTipo:myModulo.implementacion.tipocomplejo»
			«IF myTipo.eClass.name.equals("Vector")»
				«var vector = myTipo as Vector»
				«IF myModulo.exporta_tipos.contains(vector.nombre)»
					«vector.generate»
				«ENDIF»
			«ENDIF»
			«IF myTipo.eClass.name.equals("Matriz")»
				«var matriz = myTipo as Matriz»
				«IF myModulo.exporta_tipos.contains(matriz.nombre)»
					«matriz.generate»
				«ENDIF»
			«ENDIF»
			«IF myTipo.eClass.name.equals("Registro")»
				«var registro = myTipo as Registro»
				«IF myModulo.exporta_tipos.contains(registro.nombre)»
					«registro.generate»
				«ENDIF»
			«ENDIF»
			«IF myTipo.eClass.name.equals("Archivo")»
				«var archivo = myTipo as Archivo»
				«IF myModulo.exporta_tipos.contains(archivo.nombre)»
					«archivo.generate»
				«ENDIF»
			«ENDIF»
			«IF myTipo.eClass.name.equals("Enumerado")»
				«var enumerado = myTipo as Enumerado»
				«IF myModulo.exporta_tipos.contains(enumerado.nombre)»
					«enumerado.generate»
				«ENDIF»
			«ENDIF»
			«IF myTipo.eClass.name.equals("Subrango")»
				«var subrango = myTipo as Subrango»
				«IF myModulo.exporta_tipos.contains(subrango.nombre)»
					«subrango.generate»
				«ENDIF»
			«ENDIF»
		«ENDFOR»
		
		«FOR exportaCabecera:myModulo.exporta_funciones»
			«FOR mySubproceso:myModulo.implementacion.funcion»
				«IF mySubproceso.eClass.name.equals("Procedimiento")»
					«var procedimiento = mySubproceso as Procedimiento»
					«IF (!myModulo.exporta_funciones.contains(procedimiento.nombre)) && procedimiento.parametrofuncion.size == exportaCabecera.parametrofuncion.size»
						«procedimiento.cabecerasFuncion»
					«ENDIF»
				«ENDIF»
				«IF mySubproceso.eClass.name.equals("Funcion")»
					«var funcion = mySubproceso as Funcion»
					«IF (!myModulo.exporta_funciones.contains(funcion.nombre)) && funcion.parametrofuncion.size == exportaCabecera.parametrofuncion.size»
						«funcion.cabecerasFuncion»
					«ENDIF»
				«ENDIF»
			«ENDFOR»
		«ENDFOR»
		
		#endif /* «myModulo.nombre.toUpperCase»_H */
	'''
	
	def generarCabeceras(Algoritmo myAlgoritmo) '''
		
		#ifndef «algoritmo.nombre.toUpperCase»_H
		#define «algoritmo.nombre.toUpperCase»_H
		
		«FOR myRefModulo:myAlgoritmo.importaciones»
			#include "«myRefModulo.nombre».h"
		«ENDFOR»
		
		«FOR myConstante:myAlgoritmo.constantes»
			«myConstante.generate»
		«ENDFOR»
		«FOR myComplejo:myAlgoritmo.tipocomplejo»
			«myComplejo.generate»
		«ENDFOR»
		«FOR funcion:myAlgoritmo.funcion»
			«funcion.cabecerasFuncion»
		«ENDFOR»
		
		#endif /* «algoritmo.nombre.toUpperCase»_H */
	'''
	
	def cabecerasFuncion(Subproceso s) {
		if (s.eClass.name.equals("Funcion")) {
			var Funcion funcion = new FuncionImpl
			funcion = s as Funcion
			var cabecera = funcion.tipo.tipoVariableC + " " + funcion.nombre;
			return variablesCabecerasSubproceso(funcion.parametrofuncion, cabecera);
			
		} else if (s.eClass.name.equals("Procedimiento")) {
			var Procedimiento procedimiento = new ProcedimientoImpl
			procedimiento = s as Procedimiento
			var cabecera = "void" + " " + procedimiento.nombre;
			return variablesCabecerasSubproceso(procedimiento.parametrofuncion, cabecera);
		}
	}
	
	def variablesCabecerasSubproceso(EList<ParametroFuncion> parametros, String cabecera) {
		var total = cabecera;
		var actual = 1;
		for (p : parametros) {
			if (actual != 1)
				total = total + ", "
			if (p.paso.equals(readerMessages.getBundle().getString("TIPO_PASO_ENTRADA"))) {
				total = total + "const " + p.tipo.generate;
			} else if (p.paso.equals(readerMessages.getBundle().getString("TIPO_PASO_ENTRADA_SALIDA")) && p.tipo instanceof TipoExistente) {
				total = total + p.tipo.generate + "*";
			} else if (p.paso.equals(readerMessages.getBundle().getString("TIPO_PASO_SALIDA")) && p.tipo instanceof TipoExistente) {
				total = total + p.tipo.generate + "*";
			}
			else {
				total = total + p.tipo.generate + " ";
			}
			actual = actual + 1;
		}
		total = total + ");"
		return total;
		
	}
	
	override generate(Codigo myCodigo) {
		if (myCodigo.eClass.name.equals("Algoritmo")) {
			var Algoritmo algoritmo = new AlgoritmoImpl
			algoritmo = myCodigo as Algoritmo
			algoritmo.generate
		}
		else if(myCodigo.eClass.name.equals("Modulo")) {
			var Modulo modulo = new ModuloImpl
			modulo = myCodigo as Modulo
			modulo.generate
		}
	}
	
	def void addProcedimiento(Procedimiento procedimiento, List<Procedimiento> procedimientos) {
		procedimientos.add(procedimiento)
	}
	
	def void addFuncion(Funcion funcion, List<Funcion> funciones) {
		funciones.add(funcion)
	}
	
	override generate(Modulo myModulo) {
		
		modulo = myModulo
		
		for(TipoComplejo t: modulo.implementacion.tipocomplejo) {
		if(t instanceof Enumerado) {
			var enumerado = t as Enumerado;
			variablesEnumerados.put(enumerado.nombre, new ArrayList<String>());
			enumerados.add(enumerado.nombre);
			for(valor v: enumerado.valor) {
			  if(v instanceof Operador) {
			  	var v2 = v as Operador
				if(v2 instanceof VariableID) {
					var aux = v2 as VariableID
					variablesEnumerados.get(enumerado.nombre).add(aux.nombre)
				}
			  }
			}
		}
	}
	
	for(Subproceso s: modulo.implementacion.funcion) {
		if (s.eClass.name.equals("Funcion")) {
			var Funcion funcion = new FuncionImpl
			funcion = s as Funcion
			funciones.put(funcion.nombre, funcion.tipo)
			subprocesosConPunteros.put(funcion.nombre, new ArrayList<Integer>());
			var numParametro = 1;
			for(ParametroFuncion parametro: funcion.parametrofuncion) {
				if(parametro.paso.equals(readerMessages.getBundle().getString("TIPO_PASO_ENTRADA_SALIDA")) && parametro.tipo instanceof TipoExistente) {
					subprocesosConPunteros.get(funcion.nombre).add(numParametro)
				}
				else if(parametro.paso.equals(readerMessages.getBundle().getString("TIPO_PASO_SALIDA")) && parametro.tipo instanceof TipoExistente) {
					subprocesosConPunteros.get(funcion.nombre).add(numParametro)
				}
				numParametro = numParametro + 1;
			}
			
		} else if (s.eClass.name.equals("Procedimiento")) {
			var Procedimiento procedimiento = new ProcedimientoImpl
			procedimiento = s as Procedimiento
			funciones.put(procedimiento.nombre, "void")
			subprocesosConPunteros.put(procedimiento.nombre, new ArrayList<Integer>());
			var numParametro = 1;
			for(ParametroFuncion parametro: procedimiento.parametrofuncion) {
				if(parametro.paso.equals(readerMessages.getBundle().getString("TIPO_PASO_ENTRADA_SALIDA")) && parametro.tipo instanceof TipoExistente) {
					subprocesosConPunteros.get(procedimiento.nombre).add(numParametro)
				}
				else if(parametro.paso.equals(readerMessages.getBundle().getString("TIPO_PASO_SALIDA")) && parametro.tipo instanceof TipoExistente) {
					subprocesosConPunteros.get(procedimiento.nombre).add(numParametro)
				}
				numParametro = numParametro + 1;
			}
		}
	}
	
	for(Subproceso s: modulo.implementacion.funcion) {
		variablesSubprocesos.put(s.nombre, new HashMap<String,String>());
		for(Declaracion d: s.declaracion) {
			if(d instanceof DeclaracionVariable) {
				var dec = d as DeclaracionVariable;
				for(Variable v: dec.variable) {
					variablesSubprocesos.get(s.nombre).put(v.nombre, dec.tipo);
				}
			}
			else if(d instanceof DeclaracionPropia) {
				var dec = d as DeclaracionPropia;
				for(Variable v: dec.variable) {
					variablesSubprocesos.get(s.nombre).put(v.nombre, dec.tipo);
				}
			}
		}
		for(ParametroFuncion p: s.parametrofuncion) {
			if(p.tipo.eClass.name.equals("TipoExistente")) {
				var tipo = p.tipo as TipoExistente;
				variablesSubprocesos.get(s.nombre).put(p.variable.nombre, tipo.tipo);
			}
			else if(p.tipo.eClass.name.equals("TipoDefinido")) {
				var tipo = p.tipo as TipoDefinido;
				variablesSubprocesos.get(s.nombre).put(p.variable.nombre, tipo.tipo);
			}
		}
	}
	
	for(TipoComplejo t: modulo.implementacion.tipocomplejo) {
		if(t.eClass.name.equals("Vector")) {
			var v = t as Vector;
			if(v.tipo.eClass.name.equals("TipoExistente")) {
				var tipo = v.tipo as TipoExistente;
				vectoresMatrices.put(v.nombre, tipo.tipo);
			}
			else if(v.tipo.eClass.name.equals("TipoDefinido")) {
				var tipo = v.tipo as TipoDefinido;
				vectoresMatrices.put(v.nombre, tipo.tipo);
			}
		}
		else if(t.eClass.name.equals("Matriz")) {
			var m = t as Matriz;
			if(m.tipo.eClass.name.equals("TipoExistente")) {
				var tipo = m.tipo as TipoExistente;
				vectoresMatrices.put(m.nombre, tipo.tipo);
			}
			else if(m.tipo.eClass.name.equals("TipoDefinido")) {
				var tipo = m.tipo as TipoDefinido;
				vectoresMatrices.put(m.nombre, tipo.tipo);
			}
		}
		else if(t.eClass.name.equals("Registro")) {
			var r = t as Registro;
			registros.put(r.nombre, new HashMap<String,String>());
			for(Declaracion d: r.variable) {
				if(d instanceof DeclaracionVariable) {
					var dec = d as DeclaracionVariable;
					for(Variable v: dec.variable) {
						registros.get(r.nombre).put(v.nombre, dec.tipo);
					}
				}
				else if(d instanceof DeclaracionPropia) {
					var dec = d as DeclaracionPropia;
					for(Variable v: dec.variable) {
						registros.get(r.nombre).put(v.nombre, dec.tipo);
					}
				}
			}
		}
	}
		
		'''
		#include <stdio.h>
		#include <stdlib.h>
		#include <string.h>
		#include "«myModulo.nombre».h"
		
		«FOR myConstante:myModulo.implementacion.constantes»
			«IF !myModulo.exporta_constantes.contains(myConstante.variable.nombre)»
				«myConstante.generate»
			«ENDIF»
		«ENDFOR»
		
		«FOR myVariable:modulo.implementacion.global»
			«myVariable.generate»
		«ENDFOR»
		
		«FOR myTipo:myModulo.implementacion.tipocomplejo»
			«IF myTipo.eClass.name.equals("Vector")»
				«var vector = myTipo as Vector»
				«IF !myModulo.exporta_tipos.contains(vector.nombre)»
					«vector.generate»
				«ENDIF»
			«ENDIF»
			«IF myTipo.eClass.name.equals("Matriz")»
				«var matriz = myTipo as Matriz»
				«IF !myModulo.exporta_tipos.contains(matriz.nombre)»
					«matriz.generate»
				«ENDIF»
			«ENDIF»
			«IF myTipo.eClass.name.equals("Registro")»
				«var registro = myTipo as Registro»
				«IF !myModulo.exporta_tipos.contains(registro.nombre)»
					«registro.generate»
				«ENDIF»
			«ENDIF»
			«IF myTipo.eClass.name.equals("Archivo")»
				«var archivo = myTipo as Archivo»
				«IF !myModulo.exporta_tipos.contains(archivo.nombre)»
					«archivo.generate»
				«ENDIF»
			«ENDIF»
			«IF myTipo.eClass.name.equals("Enumerado")»
				«var enumerado = myTipo as Enumerado»
				«IF !myModulo.exporta_tipos.contains(enumerado.nombre)»
					«enumerado.generate»
				«ENDIF»
			«ENDIF»
			«IF myTipo.eClass.name.equals("Subrango")»
				«var subrango = myTipo as Subrango»
				«IF !myModulo.exporta_tipos.contains(subrango.nombre)»
					«subrango.generate»
				«ENDIF»
			«ENDIF»
		«ENDFOR»
		
		
		«FOR mySubproceso:myModulo.implementacion.funcion»
			«mySubproceso.generate»
		«ENDFOR»
		
		'''
	}

	override generate(Algoritmo myAlgoritmo) {
	
	algoritmo = myAlgoritmo;
	
	for(TipoComplejo t: algoritmo.tipocomplejo) {
		if(t instanceof Enumerado) {
			var enumerado = t as Enumerado;
			variablesEnumerados.put(enumerado.nombre, new ArrayList<String>());
			enumerados.add(enumerado.nombre);
			for(valor v: enumerado.valor) {
			  if(v instanceof Operador) {
			  	var v2 = v as Operador
				if(v2 instanceof VariableID) {
					var aux = v2 as VariableID
					variablesEnumerados.get(enumerado.nombre).add(aux.nombre)
				}
			  }
			}
		}
	}
	
	for(Subproceso s: algoritmo.funcion) {
		if (s.eClass.name.equals("Funcion")) {
			var Funcion funcion = new FuncionImpl
			funcion = s as Funcion
			funciones.put(funcion.nombre, funcion.tipo)
			subprocesosConPunteros.put(funcion.nombre, new ArrayList<Integer>());
			var numParametro = 1;
			for(ParametroFuncion parametro: funcion.parametrofuncion) {
				if(parametro.paso.equals(readerMessages.getBundle().getString("TIPO_PASO_ENTRADA_SALIDA")) && parametro.tipo instanceof TipoExistente) {
					subprocesosConPunteros.get(funcion.nombre).add(numParametro)
				}
				else if(parametro.paso.equals(readerMessages.getBundle().getString("TIPO_PASO_SALIDA")) && parametro.tipo instanceof TipoExistente) {
					subprocesosConPunteros.get(funcion.nombre).add(numParametro)
				}
				numParametro = numParametro + 1;
			}
			
		} else if (s.eClass.name.equals("Procedimiento")) {
			var Procedimiento procedimiento = new ProcedimientoImpl
			procedimiento = s as Procedimiento
			funciones.put(procedimiento.nombre, "void")
			subprocesosConPunteros.put(procedimiento.nombre, new ArrayList<Integer>());
			var numParametro = 1;
			for(ParametroFuncion parametro: procedimiento.parametrofuncion) {
				if(parametro.paso.equals(readerMessages.getBundle().getString("TIPO_PASO_ENTRADA_SALIDA")) && parametro.tipo instanceof TipoExistente) {
					subprocesosConPunteros.get(procedimiento.nombre).add(numParametro)
				}
				else if(parametro.paso.equals(readerMessages.getBundle().getString("TIPO_PASO_SALIDA")) && parametro.tipo instanceof TipoExistente) {
					subprocesosConPunteros.get(procedimiento.nombre).add(numParametro)
				}
				numParametro = numParametro + 1;
			}
		}
	}
	
	for(Declaracion d: algoritmo.tiene.declaracion) {
		if(d instanceof DeclaracionVariable) {
			var dec = d as DeclaracionVariable;
			for(Variable v: dec.variable) {
				variablesInicio.put(v.nombre, dec.tipo);
			}
		}
		else if(d instanceof DeclaracionPropia) {
			var dec = d as DeclaracionPropia;
			for(Variable v: dec.variable) {
				variablesInicio.put(v.nombre, dec.tipo);
			}
		}
	}
	for(Subproceso s: algoritmo.funcion) {
		variablesSubprocesos.put(s.nombre, new HashMap<String,String>());
		for(Declaracion d: s.declaracion) {
			if(d instanceof DeclaracionVariable) {
				var dec = d as DeclaracionVariable;
				for(Variable v: dec.variable) {
					variablesSubprocesos.get(s.nombre).put(v.nombre, dec.tipo);
				}
			}
			else if(d instanceof DeclaracionPropia) {
				var dec = d as DeclaracionPropia;
				for(Variable v: dec.variable) {
					variablesSubprocesos.get(s.nombre).put(v.nombre, dec.tipo);
				}
			}
		}
		for(ParametroFuncion p: s.parametrofuncion) {
			if(p.tipo.eClass.name.equals("TipoExistente")) {
				var tipo = p.tipo as TipoExistente;
				variablesSubprocesos.get(s.nombre).put(p.variable.nombre, tipo.tipo);
			}
			else if(p.tipo.eClass.name.equals("TipoDefinido")) {
				var tipo = p.tipo as TipoDefinido;
				variablesSubprocesos.get(s.nombre).put(p.variable.nombre, tipo.tipo);
			}
		}
	}
	
	for(TipoComplejo t: algoritmo.tipocomplejo) {
		if(t.eClass.name.equals("Vector")) {
			var v = t as Vector;
			if(v.tipo.eClass.name.equals("TipoExistente")) {
				var tipo = v.tipo as TipoExistente;
				vectoresMatrices.put(v.nombre, tipo.tipo);
			}
			else if(v.tipo.eClass.name.equals("TipoDefinido")) {
				var tipo = v.tipo as TipoDefinido;
				vectoresMatrices.put(v.nombre, tipo.tipo);
			}
		}
		else if(t.eClass.name.equals("Matriz")) {
			var m = t as Matriz;
			if(m.tipo.eClass.name.equals("TipoExistente")) {
				var tipo = m.tipo as TipoExistente;
				vectoresMatrices.put(m.nombre, tipo.tipo);
			}
			else if(m.tipo.eClass.name.equals("TipoDefinido")) {
				var tipo = m.tipo as TipoDefinido;
				vectoresMatrices.put(m.nombre, tipo.tipo);
			}
		}
		else if(t.eClass.name.equals("Registro")) {
			var r = t as Registro;
			registros.put(r.nombre, new HashMap<String,String>());
			for(Declaracion d: r.variable) {
				if(d instanceof DeclaracionVariable) {
					var dec = d as DeclaracionVariable;
					for(Variable v: dec.variable) {
						registros.get(r.nombre).put(v.nombre, dec.tipo);
					}
				}
				else if(d instanceof DeclaracionPropia) {
					var dec = d as DeclaracionPropia;
					for(Variable v: dec.variable) {
						registros.get(r.nombre).put(v.nombre, dec.tipo);
					}
				}
			}
		}
	}
	
	'''
		#include <stdio.h>
		#include <stdlib.h>
		#include <string.h>
		«IF cabeceras»
		#include "«algoritmo.nombre».h"
		«ENDIF»
		
		«IF !cabeceras»
		
		«FOR myRefModulo:myAlgoritmo.importaciones»
			#include "«myRefModulo.nombre».h"
		«ENDFOR»
		«ENDIF»

		«FOR myComentario:algoritmo.comentarios»
			«myComentario.generate»
		«ENDFOR»
		«IF !cabeceras»
			«FOR myConstante:algoritmo.constantes»
				«myConstante.generate»
			«ENDFOR»
			«FOR myComplejo:algoritmo.tipocomplejo»
				«myComplejo.generate»
			«ENDFOR»
		«ENDIF»
		«FOR myVariable:algoritmo.global»
			«myVariable.generate»
		«ENDFOR»
		
		«FOR funcion:algoritmo.funcion»
			«funcion.generate»
			
		«ENDFOR»
		«algoritmo.tiene.generate»
	'''
	}

	override generate(TipoComplejo myComplejo) {
		if (myComplejo.eClass.name.equals("Vector")) {
			var Vector prueba = new VectorImpl
			prueba = myComplejo as Vector
			prueba.generate
		} else if (myComplejo.eClass.name.equals("Matriz")) {
			var Matriz prueba = new MatrizImpl
			prueba = myComplejo as Matriz
			prueba.generate
		} else if (myComplejo.eClass.name.equals("Registro")) {
			var Registro prueba = new RegistroImpl
			prueba = myComplejo as Registro
			prueba.generate
		} else if (myComplejo.eClass.name.equals("Archivo")) {
			var Archivo prueba = new ArchivoImpl
			prueba = myComplejo as Archivo
			prueba.generate
		} else if (myComplejo.eClass.name.equals("Enumerado")) {
			var Enumerado prueba = new EnumeradoImpl
			prueba = myComplejo as Enumerado
			prueba.generate
		} else if (myComplejo.eClass.name.equals("SubrangoNumerico")) {
			var SubrangoNumerico prueba = new SubrangoNumericoImpl
			prueba = myComplejo as SubrangoNumerico
			prueba.generate
		} else if (myComplejo.eClass.name.equals("SubrangoEnumerado")) {
			var SubrangoEnumerado prueba = new SubrangoEnumeradoImpl
			prueba = myComplejo as SubrangoEnumerado
			prueba.generate
		}
	}

	override generate(Tipo myTipo) {
		if (myTipo.eClass.name.equals("TipoDefinido")) {
			var TipoDefinido prueba = new TipoDefinidoImpl
			prueba = myTipo as TipoDefinido
			prueba.generate
		} else if (myTipo.eClass.name.equals("TipoExistente")) {
			var TipoExistente prueba = new TipoExistenteImpl
			prueba = myTipo as TipoExistente
			prueba.generate
		}
	}

	override generate(TipoExistente myTipo) {
		return tipoVariableC(myTipo.tipo)
	}
	
	override generate(Comentario myComentario)
		'''«myComentario.mensaje»'''

	override generate(TipoDefinido myTipo) {
		return myTipo.tipo
	}

	override generate(Constantes myConstante) '''
		#define «myConstante.variable.nombre»  «myConstante.valor.generate»
	'''

	override generate(Vector myVector) '''
		typedef «myVector.tipo.generate» «myVector.nombre»[«myVector.valor.generate»];
	'''

	override generate(Matriz myMatriz) '''
		typedef «myMatriz.tipo.generate» «myMatriz.nombre»[«myMatriz.valor.get(0).generate»][«myMatriz.valor.get(1).generate»];
	'''

	override generate(Registro myRegistro) '''
		typedef struct {
			«FOR myVariable:myRegistro.variable»
				«myVariable.generate»
			«ENDFOR»
		} «myRegistro.nombre»;
	'''

	override generate(Archivo myArchivo) '''
		typedef FILE *«myArchivo.nombre»;
	'''

	override generate(Enumerado myEnumerado) '''
		typedef enum {«FOR myVariable:myEnumerado.valor»«IF myVariable == myEnumerado.valor.get(myEnumerado.valor.size()-1)»«myVariable.generate»«ELSE»«myVariable.generate», «ENDIF»«ENDFOR»} «myEnumerado.nombre»;
	'''
	
	override generate(SubrangoNumerico mySubrango) '''
		typedef enum {«generaSubrango(mySubrango.limite_inf,mySubrango.limite_sup)»} «mySubrango.nombre»;
	'''
	
	override generate(SubrangoEnumerado mySubrango) '''
		typedef enum {«generaSubrangoEnumerado(mySubrango.limite_inf,mySubrango.limite_sup)»} «mySubrango.nombre»;
	'''
	
	def obtenerModo(String modo) {
		if(modo == "escritura") {
			return "w";
		}
		else if(modo == "lectura") {
			return "r";
		}
	}
	
	override generate(FuncionFicheroAbrir myFuncionFicheroAbrir) '''
		«myFuncionFicheroAbrir.variable.get(0).generate» = fopen(«myFuncionFicheroAbrir.variable.get(1).generate»,"«obtenerModo(myFuncionFicheroAbrir.modo.getName)»")
	'''
	
	override generate(FuncionFicheroCerrar myFuncionFicheroCerrar)'''
		fclose(«myFuncionFicheroCerrar.variable.generate»)
	'''

	def generaSubrango(int limite_inf,int limite_sup) {
		var concat = new String
		var i = limite_inf
		while (i < limite_sup) {
			concat = concat + "numero" + i + ", "
			i = i + 1
		}
		concat = concat + "numero" + i;
		return concat;
	}
	
	def generaSubrangoEnumerado(String limite_inf, String limite_sup) {
		var concat = new String
		for(String nombre: enumerados) {
			if(variablesEnumerados.get(nombre).contains(limite_inf) && variablesEnumerados.get(nombre).contains(limite_sup)) {
				var index_limite_inf = variablesEnumerados.get(nombre).indexOf(limite_inf);
				var index_limite_sup = variablesEnumerados.get(nombre).indexOf(limite_sup);
				var sublista = variablesEnumerados.get(nombre).subList(index_limite_inf, index_limite_sup);
				for(String aux: sublista) {
					concat = concat + aux + ", "
				}
				concat = concat + limite_sup
				return concat
			}
		}
	}

	override generate(Inicio myInicio) '''
		int main(){
			«FOR myVariable:myInicio.declaracion»
				«myVariable.generate»
			«ENDFOR»
			«FOR mySentencia:myInicio.tiene»
				«mySentencia.generate»
			«ENDFOR»
		}
	'''

	override generate(Subproceso subp) {
		if (subp.eClass.name.equals("Funcion")) {
			var Funcion prueba = new FuncionImpl
			prueba = subp as Funcion
			prueba.generate
		} else if (subp.eClass.name.equals("Procedimiento")) {
			var Procedimiento prueba = new ProcedimientoImpl
			prueba = subp as Procedimiento
			prueba.generate
		}
	}
	
	def tipoVariableC(String tipo) {
		if(tipo.equals(readerMessages.getBundle().getString("TIPO_ENTERO"))) return "int";
		if(tipo.equals(readerMessages.getBundle().getString("TIPO_CARACTER"))) return "char";
		if(tipo.equals(readerMessages.getBundle().getString("TIPO_REAL"))) return "float";
		if(tipo.equals(readerMessages.getBundle().getString("TIPO_LOGICO"))) return "int";
		if(tipo.equals(readerMessages.getBundle().getString("TIPO_CADENA"))) return "char *";
	}

	override generate(EList<ParametroFuncion> parametros) {
		var total = "";
		var actual = 1;
		
		for (p : parametros) {
			if (actual != 1)
				total = total + ", "
			if (p.paso.equals(readerMessages.getBundle().getString("TIPO_PASO_ENTRADA"))) {
				total = total + "const " + p.tipo.generate + " " + p.variable.nombre;
			} else if (p.paso.equals(readerMessages.getBundle().getString("TIPO_PASO_ENTRADA_SALIDA")) && p.tipo instanceof TipoExistente) {
				total = total + p.tipo.generate + "* " + p.variable.nombre;
			} else if (p.paso.equals(readerMessages.getBundle().getString("TIPO_PASO_SALIDA")) && p.tipo instanceof TipoExistente) {
				total = total + p.tipo.generate + "* " + p.variable.nombre;
			}
			else {
				total = total + p.tipo.generate + " " + p.variable.nombre;
			}
			actual = actual + 1;
		}
		return total;
	}
	
	override generate(Funcion myFun) {
		var funcionDeclarada = myFun.tipo.tipoVariableC + " " + myFun.nombre + myFun.parametrofuncion.generate + "){" + "\n";
		var punteros = new ArrayList<String>();
		for(parametroFuncion: myFun.parametrofuncion) {
			if(parametroFuncion.paso.equals(readerMessages.getBundle().getString("TIPO_PASO_ENTRADA_SALIDA")) && parametroFuncion.tipo instanceof TipoExistente) {
				punteros.add(parametroFuncion.variable.nombre)
			}
			else if(parametroFuncion.paso.equals(readerMessages.getBundle().getString("TIPO_PASO_SALIDA")) && parametroFuncion.tipo instanceof TipoExistente) {
				punteros.add(parametroFuncion.variable.nombre)
			}
		}
		for(myVariable:myFun.declaracion) {
			funcionDeclarada = funcionDeclarada + "\t" + myVariable.generate + "\n";
		}
		if(punteros.size() == 0) {
			for(mySentencia:myFun.sentencias) {
				funcionDeclarada = funcionDeclarada + "\t" + mySentencia.generate + "\n";
			}
			
			if(myFun.devuelve != null) {
				funcionDeclarada = funcionDeclarada + "\t" + myFun.devuelve.generate + "\n";
			}
		}
		else {
			for(mySentencia:myFun.sentencias) {
				funcionDeclarada = funcionDeclarada + "\t" + mySentencia.generatePunteros(punteros) + "\n";
			}
			
			if(myFun.devuelve != null) {
				funcionDeclarada = funcionDeclarada + "\t" + myFun.devuelve.generate(punteros) + "\n";
			}
		}
		funcionDeclarada = funcionDeclarada + "\n" + "}";
		return funcionDeclarada;
	}
	
	override generate(Procedimiento myProc) {
		var procedimientoDeclarado = "void " + myProc.nombre + myProc.parametrofuncion.generate + "){" + "\n";
		var punteros = new ArrayList<String>();
		for(parametroFuncion: myProc.parametrofuncion) {
			if(parametroFuncion.paso.equals(readerMessages.getBundle().getString("TIPO_PASO_ENTRADA_SALIDA")) && parametroFuncion.tipo instanceof TipoExistente) {
				punteros.add(parametroFuncion.variable.nombre)
			}
			else if(parametroFuncion.paso.equals(readerMessages.getBundle().getString("TIPO_PASO_SALIDA")) && parametroFuncion.tipo instanceof TipoExistente) {
				punteros.add(parametroFuncion.variable.nombre)
			}
		}
		for(myVariable:myProc.declaracion) {
			procedimientoDeclarado = procedimientoDeclarado + "\t" + myVariable.generate + "\n";
		}
		if(punteros.size() == 0) {
			for(mySentencia:myProc.sentencias) {
				procedimientoDeclarado = procedimientoDeclarado + "\t" + mySentencia.generate + "\n";
			}
		}
		else {
			for(mySentencia:myProc.sentencias) {
				procedimientoDeclarado = procedimientoDeclarado + "\t" + mySentencia.generatePunteros(punteros) + "\n";
			}
		}
		procedimientoDeclarado = procedimientoDeclarado + "\n" + "}";
		return procedimientoDeclarado;
	}
	
	def generatePunteros(Sentencias mySent, List<String> punteros) {
		if (mySent.eClass.name.equals("AsignacionNormal")) {
			var AsignacionNormal prueba = new AsignacionNormalImpl
			prueba = mySent as AsignacionNormal
			prueba.generateAsignacionPunteros(punteros)
		} else if (mySent.eClass.name.equals("AsignacionCompleja")) {
			var AsignacionCompleja prueba = new AsignacionComplejaImpl
			prueba = mySent as AsignacionCompleja
			prueba.generate
		} else if (mySent.eClass.name.equals("LlamadaFuncion")) {
			var LlamadaFuncion prueba = new LlamadaFuncionImpl
			prueba = mySent as LlamadaFuncion
			prueba.generate(true)
		} else if (mySent.eClass.name.equals("Si")) {
			var Si prueba = new SiImpl
			prueba = mySent as Si
			prueba.generateSiPunteros(punteros)
		} else if (mySent.eClass.name.equals("segun")) {
			var segun prueba = new segunImpl
			prueba = mySent as segun
			prueba.generateSegunPunteros(punteros)
		} else if (mySent.eClass.name.equals("Caso")) {
			var Caso prueba = new CasoImpl
			prueba = mySent as Caso
			prueba.generateCasoPunteros(punteros)
		} else if (mySent.eClass.name.equals("mientras")) {
			var mientras prueba = new mientrasImpl
			prueba = mySent as mientras
			prueba.generateMientrasPunteros(punteros)
		} else if (mySent.eClass.name.equals("repetir")) {
			var repetir prueba = new repetirImpl
			prueba = mySent as repetir
			prueba.generateRepetirPunteros(punteros)
		} else if (mySent.eClass.name.equals("desde")) {
			var desde prueba = new desdeImpl
			prueba = mySent as desde
			prueba.generateDesdePunteros(punteros)
		} else if (mySent.eClass.name.equals("Leer")) {
			if(modulo != null) {
				var Leer prueba = new LeerImpl
				prueba = mySent as Leer
				prueba.generateModulo
			} else {
				var Leer prueba = new LeerImpl
				prueba = mySent as Leer
				prueba.generate
			}
		} else if (mySent.eClass.name.equals("Escribir")) {
			if(modulo != null) {
				var Escribir prueba = new EscribirImpl
				prueba = mySent as Escribir
				prueba.generateModuloPunteros(punteros)
			} else {
				var Escribir prueba = new EscribirImpl
				prueba = mySent as Escribir
				prueba.generateEscribirPunteros(punteros)
			}
		} else if (mySent.eClass.name.equals("FuncionFicheroAbrir")) {
			var FuncionFicheroAbrir prueba = new FuncionFicheroAbrirImpl
			prueba = mySent as FuncionFicheroAbrir
			prueba.generate
		} else if (mySent.eClass.name.equals("FuncionFicheroCerrar")) {
			var FuncionFicheroCerrar prueba = new FuncionFicheroCerrarImpl
			prueba = mySent as FuncionFicheroCerrar
			prueba.generate
		}
	}
	
	def generateEscribirPunteros(Escribir a, List<String> punteros) {
				var perteneceInicio = false;
		if(!algoritmo.tiene.tiene.contains(a)) {
			for(Sentencias s: algoritmo.tiene.tiene) {
				if(s.eClass.name.equals("mientras") && perteneceInicio == false) {
					var mientras = s as mientras;
					perteneceInicio = contienenExpresionEscribir(mientras.sentencias, a);
				}
				else if(s.eClass.name.equals("repetir") && perteneceInicio == false) {
					var repetir = s as repetir;
					perteneceInicio = contienenExpresionEscribir(repetir.sentencias, a);
				}
				else if(s.eClass.name.equals("desde") && perteneceInicio == false) {
					var desde = s as desde;
					perteneceInicio = contienenExpresionEscribir(desde.sentencias, a);
				}
				else if(s.eClass.name.equals("Si") && perteneceInicio == false) {
					var si = s as Si;
					perteneceInicio = contienenExpresionEscribir(si.sentencias, a);
					if(si.sino != null) {
						perteneceInicio = contienenExpresionEscribir(si.sino.sentencias, a);
					}
				}	
				else if(s.eClass.name.equals("segun") && perteneceInicio == false) {
					var segun = s as segun;
					for(Caso c: segun.caso) {
						if(perteneceInicio == false) {
							perteneceInicio = contienenExpresionEscribir(c.sentencias, a);
						}
					}
				}
		 	}
		}
		if(algoritmo.tiene.tiene.contains(a) || (perteneceInicio && a.operador.size() > 0)) {
			var iterador = 0;
			var cadena = new String();
			if(a.operador.get(0).eClass.name.equals("ConstCadena")) {
				//En este caso el usuario ha introducido un texto
				var primero = a.operador.get(0) as ConstCadena;
				cadena = primero.contenido;
				cadena = cadena.substring(0, cadena.length()-1);
			}
			
			if(a.operador.size() == 1 && !a.operador.get(0).eClass.name.equals("ConstCadena")) {
				cadena = cadena + "\"";
			}
			
			if(a.operador.size() == 1 && a.operador.get(0).eClass.name.equals("ConstCadena")) {
				cadena = cadena + " \\n\"";
			}
			
			for(o: a.operador) {
				if(a.operador.indexOf(o) == 0 && !o.eClass.name.equals("ConstCadena") || a.operador.indexOf(o) != 0) {
					var tipo = "";
					if(o.eClass.name.equals("VariableID")) {
						var varID = o as VariableID;
						tipo = variablesInicio.get(varID.nombre);
						System.out.println("tipo es:" +tipo)
					}
					else if(o.eClass.name.equals("ValorVector")) {
						var vector = o as ValorVector;
						if(vector.campo.size() == 0) {
							tipo = vectoresMatrices.get(variablesInicio.get(vector.nombre_vector));
						}
						else {
							tipo = registros.get(vectoresMatrices.get(variablesInicio.get(vector.nombre_vector))).get(vector.campo.get(0).nombre_campo);
						}	
					}
					else if(o.eClass.name.equals("ValorMatriz")) {
						var matriz = o as ValorMatriz;
						if(matriz.campo.size() == 0) {
							tipo = vectoresMatrices.get(variablesInicio.get(matriz.nombre_matriz));
						}
						else {
							tipo = registros.get(vectoresMatrices.get(variablesInicio.get(matriz.nombre_matriz))).get(matriz.campo.get(0).nombre_campo);
						}
					}
					else if(o.eClass.name.equals("ValorRegistro")) {
						var registro = o as ValorRegistro;
						tipo = registros.get(variablesInicio.get(registro.nombre_registro)).get(registro.campo.get(0).nombre_campo);
					}
					else if(o.eClass.name.equals("LlamadaFuncion")) {
						var llamadaFuncion = o as LlamadaFuncion;
						tipo = funciones.get(llamadaFuncion.nombre);
					}
					if(tipo.equals(readerMessages.getBundle().getString("TIPO_ENTERO")) || o.eClass.name.equals("NumeroEntero")) {
						if(a.operador.indexOf(o) == a.operador.size - 1) {
							cadena = cadena + " %i \\n \"";
						}
						else {
							cadena = cadena + " %i";
						}
					}
					else if(tipo.equals(readerMessages.getBundle().getString("TIPO_CARACTER")) || o.eClass.name.equals("Caracter")) {
						if(a.operador.indexOf(o) == a.operador.size - 1) {
							cadena = cadena + " %c \\n \"";
						}
						else {
							cadena = cadena + " %c";
						}
					}
					else if(tipo.equals(readerMessages.getBundle().getString("TIPO_CADENA")) || o.eClass.name.equals("ConstCadena")) {
						if(a.operador.indexOf(o) == a.operador.size - 1) {
							cadena = cadena + " %s \\n \"";
						}
						else {
							cadena = cadena + " %s";
						}
					}
					else if(tipo.equals(readerMessages.getBundle().getString("TIPO_REAL")) || o.eClass.name.equals("NumeroDecimal")) {
						if(a.operador.indexOf(o) == a.operador.size - 1) {
							cadena = cadena + " %f \\n \"";
						}
						else {
							cadena = cadena + " %f";
						}
					} else if(vectoresMatrices.containsKey(tipo)) {
							var tipoAux = vectoresMatrices.get(tipo);
							if(tipoAux.equals(readerMessages.getBundle().getString("TIPO_ENTERO")) || o.eClass.name.equals("NumeroEntero")) {
								if(a.operador.indexOf(o) == a.operador.size - 1) {
									cadena = cadena + " %i \\n \"";
								}
								else {
									cadena = cadena + " %i";
								}
							}
							else if(tipoAux.equals(readerMessages.getBundle().getString("TIPO_CADENA")) || tipoAux.equals(readerMessages.getBundle().getString("TIPO_CARACTER"))) {
								if(a.operador.indexOf(o) == a.operador.size - 1) {
									cadena = cadena + " %s \\n \"";
								}
								else {
									cadena = cadena + " %s";
								}
							}
							else if(tipoAux.equals(readerMessages.getBundle().getString("TIPO_REAL"))) {
								if(a.operador.indexOf(o) == a.operador.size - 1) {
									cadena = cadena + " %f \\n \"";
								}	
								else {
									cadena = cadena + " %f";
								}
							}
						}
				}
			}
			if(a.operador.size > 1 || (a.operador.size == 1 && !a.operador.get(0).eClass.name.equals("ConstCadena"))) {
				cadena = cadena + ", " + a.operador.coutOperadoresCPunteros(punteros);
				return '''printf(«cadena»);'''	
			}
			else {
				return '''printf(«cadena»);'''
			}
		}
		else {
			for(Subproceso s: algoritmo.funcion) {
				var perteneceSubproceso = false;
				if(!s.sentencias.contains(a) && a.operador.size() > 0) {
					for(Sentencias sent: s.sentencias) {
						if(sent.eClass.name.equals("mientras") && perteneceSubproceso == false) {
						var mientras = sent as mientras;
						perteneceSubproceso = contienenExpresionEscribir(mientras.sentencias, a);
					}
					else if(sent.eClass.name.equals("repetir") && perteneceSubproceso == false) {
						var repetir = sent as repetir;
						perteneceSubproceso = contienenExpresionEscribir(repetir.sentencias, a);
					}
					else if(sent.eClass.name.equals("desde") && perteneceSubproceso == false) {
						var desde = sent as desde;
						perteneceSubproceso = contienenExpresionEscribir(desde.sentencias, a);
					}
					else if(sent.eClass.name.equals("Si") && perteneceSubproceso == false) {
						var si = sent as Si;
						perteneceSubproceso = contienenExpresionEscribir(si.sentencias, a);
						if(si.sino != null) {
							perteneceSubproceso = contienenExpresionEscribir(si.sino.sentencias, a);
						}
					}	
					else if(sent.eClass.name.equals("segun") && perteneceSubproceso == false) {
						var segun = sent as segun;
						for(Caso c: segun.caso) {
							if(perteneceSubproceso == false) {
								perteneceSubproceso = contienenExpresionEscribir(c.sentencias, a);
							}
						}
					}
		 		}
		 	}
			if(s.sentencias.contains(a) || (perteneceSubproceso && a.operador.size() > 0)) {
				var cadena = new String();
				if(a.operador.get(0).eClass.name.equals("ConstCadena")) {
					//En este caso el usuario ha introducido un texto
					var primero = a.operador.get(0) as ConstCadena;
					cadena = primero.contenido;
					cadena = cadena.substring(0, cadena.length()-1);
				}
				
				if(a.operador.size() == 1 && !a.operador.get(0).eClass.name.equals("ConstCadena")) {
					cadena = cadena + "\"";
				}
				
				if(a.operador.size() == 1 && a.operador.get(0).eClass.name.equals("ConstCadena")) {
					cadena = cadena + " \\n\"";
				}
				for(o: a.operador) {
					//Si es el primer elemento y es distinto a una cadena si, sino se lo salta
					if(a.operador.indexOf(o) == 0 && !o.eClass.name.equals("ConstCadena") || a.operador.indexOf(o) != 0) {
						var tipo = "";
						if(o.eClass.name.equals("VariableID")) {
							var varID = o as VariableID;
							tipo = variablesSubprocesos.get(s.nombre).get(varID.nombre);
						}
						else if(o.eClass.name.equals("ValorVector")) {
							var vector = o as ValorVector;
							if(vector.campo.size() == 0) {
								tipo = vectoresMatrices.get(variablesSubprocesos.get(s.nombre).get(vector.nombre_vector));
							}
							else {
								tipo = registros.get(vectoresMatrices.get(variablesSubprocesos.get(s.nombre).get(vector.nombre_vector))).get(vector.campo.get(0).nombre_campo);
							}
						}
						else if(o.eClass.name.equals("ValorMatriz")) {
							var matriz = o as ValorMatriz;
							if(matriz.campo.size() == 0) {
								tipo = vectoresMatrices.get(variablesSubprocesos.get(s.nombre).get(matriz.nombre_matriz));
							}
							else {
								tipo = registros.get(vectoresMatrices.get(variablesSubprocesos.get(s.nombre).get(matriz.nombre_matriz))).get(matriz.campo.get(0).nombre_campo);
							}
						}	
						else if(o.eClass.name.equals("ValorRegistro")) {
							var registro = o as ValorRegistro;
							tipo = registros.get(variablesSubprocesos.get(s.nombre).get(registro.nombre_registro)).get(registro.campo.get(0).nombre_campo);
						}
						else if(o.eClass.name.equals("LlamadaFuncion")) {
							var llamadaFuncion = o as LlamadaFuncion;
							tipo = funciones.get(llamadaFuncion.nombre);
						}
						if(tipo.equals(readerMessages.getBundle().getString("TIPO_ENTERO")) || o.eClass.name.equals("NumeroEntero")) {
							if(a.operador.indexOf(o) == a.operador.size - 1) {
								cadena = cadena + " %i \\n \"";
							}
							else {
								cadena = cadena + " %i";
							}
						}
						else if(tipo.equals(readerMessages.getBundle().getString("TIPO_CARACTER"))) {
							if(a.operador.indexOf(o) == a.operador.size - 1) {
								cadena = cadena + " %c \\n \"";
							}
							else {
								cadena = cadena + " %c";
							}
						}
						else if(tipo.equals(readerMessages.getBundle().getString("TIPO_CADENA"))) {
							if(a.operador.indexOf(o) == a.operador.size - 1) {
								cadena = cadena + " %s \\n \"";
							}
							else {
								cadena = cadena + " %s";
							}
						}
						else if(tipo.equals(readerMessages.getBundle().getString("TIPO_REAL"))) {
							if(a.operador.indexOf(o) == a.operador.size - 1) {
								cadena = cadena + " %f \\n \"";
							}	
							else {
								cadena = cadena + " %f";
							}
						} else if(vectoresMatrices.containsKey(tipo)) {
							var tipoAux = vectoresMatrices.get(tipo);
							if(tipoAux.equals(readerMessages.getBundle().getString("TIPO_ENTERO")) || o.eClass.name.equals("NumeroEntero")) {
								if(a.operador.indexOf(o) == a.operador.size - 1) {
									cadena = cadena + " %i \\n \"";
								}
								else {
									cadena = cadena + " %i";
								}
							}
							else if(tipoAux.equals(readerMessages.getBundle().getString("TIPO_CADENA")) || tipoAux.equals(readerMessages.getBundle().getString("TIPO_CARACTER"))) {
								if(a.operador.indexOf(o) == a.operador.size - 1) {
									cadena = cadena + " %s \\n \"";
								}
								else {
									cadena = cadena + " %s";
								}
							}
							else if(tipoAux.equals(readerMessages.getBundle().getString("TIPO_REAL"))) {
								if(a.operador.indexOf(o) == a.operador.size - 1) {
									cadena = cadena + " %f \\n \"";
								}	
								else {
									cadena = cadena + " %f";
								}
							}
						}
					}
			}
			if(a.operador.size > 1 || (a.operador.size == 1 && !a.operador.get(0).eClass.name.equals("ConstCadena"))) {
				cadena = cadena + ", " + a.operador.coutOperadoresCPunteros(punteros);
				return '''printf(«cadena»);'''	
			}
			else {
				return '''printf(«cadena»);'''
			}
		}	
	}
	}
	}
	
	override generate(Sentencias mySent) {
		if (mySent.eClass.name.equals("AsignacionNormal")) {
			var AsignacionNormal prueba = new AsignacionNormalImpl
			prueba = mySent as AsignacionNormal
			prueba.generate
		} else if (mySent.eClass.name.equals("AsignacionCompleja")) {
			var AsignacionCompleja prueba = new AsignacionComplejaImpl
			prueba = mySent as AsignacionCompleja
			prueba.generate
		} else if (mySent.eClass.name.equals("LlamadaFuncion")) {
			var LlamadaFuncion prueba = new LlamadaFuncionImpl
			prueba = mySent as LlamadaFuncion
			prueba.generate(true)
		} else if (mySent.eClass.name.equals("Si")) {
			var Si prueba = new SiImpl
			prueba = mySent as Si
			prueba.generate
		} else if (mySent.eClass.name.equals("segun")) {
			var segun prueba = new segunImpl
			prueba = mySent as segun
			prueba.generate
		} else if (mySent.eClass.name.equals("Caso")) {
			var Caso prueba = new CasoImpl
			prueba = mySent as Caso
			prueba.generate
		} else if (mySent.eClass.name.equals("mientras")) {
			var mientras prueba = new mientrasImpl
			prueba = mySent as mientras
			prueba.generate
		} else if (mySent.eClass.name.equals("repetir")) {
			var repetir prueba = new repetirImpl
			prueba = mySent as repetir
			prueba.generate
		} else if (mySent.eClass.name.equals("desde")) {
			var desde prueba = new desdeImpl
			prueba = mySent as desde
			prueba.generate
		} else if (mySent.eClass.name.equals("Leer")) {
			if(modulo != null) {
				var Leer prueba = new LeerImpl
				prueba = mySent as Leer
				prueba.generateModulo
			} else {
				var Leer prueba = new LeerImpl
				prueba = mySent as Leer
				prueba.generate
			}
		} else if (mySent.eClass.name.equals("Escribir")) {
			if(modulo != null) {
				var Escribir prueba = new EscribirImpl
				prueba = mySent as Escribir
				prueba.generateModulo
			} else {
				var Escribir prueba = new EscribirImpl
				prueba = mySent as Escribir
				prueba.generate
			}
		} else if (mySent.eClass.name.equals("FuncionFicheroAbrir")) {
			var FuncionFicheroAbrir prueba = new FuncionFicheroAbrirImpl
			prueba = mySent as FuncionFicheroAbrir
			prueba.generate
		} else if (mySent.eClass.name.equals("FuncionFicheroCerrar")) {
			var FuncionFicheroCerrar prueba = new FuncionFicheroCerrarImpl
			prueba = mySent as FuncionFicheroCerrar
			prueba.generate
		}
	}

	def pintarVariables(EList<Variable> v) '''
		«v.get(0).nombre»«FOR matri:v.get(0).mat»«matri.toString»«ENDFOR»«FOR id:v»«IF id.nombre != v.get(0).nombre», «id.nombre»«FOR matri2:id.mat»«matri2.toString»«ENDFOR»«ENDIF»«ENDFOR»;	
	'''
	def pintarVariablesCadena(EList<Variable> v) {
		var resultado = v.get(0).nombre;
		for(matri: v.get(0).mat) {
			resultado = resultado + matri.toString;
		}
		for(id: v) {
			if(id.nombre != v.get(0).nombre) {
				resultado = resultado + " ," + id.nombre;
				for(matri2: id.mat) {
					resultado = resultado + matri2.toString;
				}
			}
		}
		return resultado;
	}

	override generate(Declaracion myDec) {
		if (myDec.eClass.name.equals("DeclaracionVariable")) {
			var DeclaracionVariable prueba = new DeclaracionVariableImpl
			prueba = myDec as DeclaracionVariable
			prueba.generate
		} else if (myDec.eClass.name.equals("DeclaracionPropia")) {
			var DeclaracionPropia prueba = new DeclaracionPropiaImpl
			prueba = myDec as DeclaracionPropia
			prueba.generate
		}

	}
	
	override generate(DeclaracionVariable myDec) {
		return myDec.tipo.tipoVariableC + " " + pintarVariables(myDec.variable);
	}

	override generate(DeclaracionPropia myDec) '''
		«myDec.tipo» «pintarVariables(myDec.variable)»
	'''
	
	def generateAsignacionPunteros(AsignacionNormal asig, List<String> punteros) {
		var asignacion = new String();
		
		//lado izquierdo de la asignación
		if(punteros.contains(asig.valor_asignacion)) {
			asignacion = "*(" + asig.valor_asignacion + ")";
		}
		else {
			asignacion = asig.valor_asignacion;
		}
		
		//lado derecho de la asignación
		for(matri:asig.mat) {
			asignacion = asignacion + matri.toString;
		}
		asignacion = asignacion + " = " + asig.operador.generate(punteros) + ";";
		return asignacion;
	}
	
	override generate(AsignacionNormal asig) '''
	«asig.valor_asignacion»«FOR matri:asig.mat»«matri.toString»«ENDFOR» = «asig.operador.generate»;'''

	override generate(AsignacionCompleja asig) '''
	«asig.valor_asignacion.generate.toString» = «asig.operador.generate.toString»;'''

	override generate(ValorComplejo myComplejo) {
		if (myComplejo.eClass.name.equals("ValorRegistro")) {
			var ValorRegistro prueba = new ValorRegistroImpl
			prueba = myComplejo as ValorRegistro
			prueba.generate
		}
		else if(myComplejo.eClass.name.equals("ValorVector")) {
			var ValorVector prueba = new ValorVectorImpl
			prueba = myComplejo as ValorVector
			prueba.generate
		}
		else if(myComplejo.eClass.name.equals("ValorMatriz")) {
			var ValorMatriz prueba = new ValorMatrizImpl
			prueba = myComplejo as ValorMatriz
			prueba.generate
		}
	}

	override generate(ValorRegistro myValor) {
		//Este metodo esta escrito con otra sintaxis diferente porque me generaba un salto de linea innecesario
		var concat = new String;
		concat = myValor.nombre_registro.toString + '.'
		for (myVariable : myValor.campo) {
			if(myValor.campo.indexOf(myVariable) == myValor.campo.size() - 1) {
				concat = concat + myVariable.generate.toString;
			} else {
				concat = concat + myVariable.generate.toString + ".";
			}
		}
		return concat;
	}

	override generate(ValorVector myValor) {
		var concat = new String;
		if(myValor.campo.size() == 0) {
			concat = myValor.nombre_vector.toString + '[' + myValor.indice.generate + ']';
		}
		else {
			concat = myValor.nombre_vector.toString + '[' + myValor.indice.generate + ']' + '.' + myValor.campo.get(0).nombre_campo;
		}
		return concat;
	}

	override generate(CampoRegistro myCampo) {

		//Este metodo esta escrito con otra sintaxis diferente porque me generaba un salto de linea innecesario
		return myCampo.nombre_campo;
	}

	override generate(ValorMatriz myValor) {
		var concat = new String;
		if(myValor.campo.size() == 0) {
			concat = myValor.nombre_matriz.toString + '[' + myValor.primerIndice.generate + '][' + myValor.segundoIndice.generate + ']';
		}
		else {
			concat = myValor.nombre_matriz.toString + '[' + myValor.primerIndice.generate + '][' + myValor.segundoIndice.generate + ']' + '.' + myValor.campo.get(0).nombre_campo;
		}
		return concat;
	}

	override generate(valor myVal) {
		if (myVal.eClass.name.equals("NumeroEntero")) {
			var NumeroEntero prueba = new NumeroEnteroImpl
			prueba = myVal as NumeroEntero
			prueba.generate
		} else if (myVal.eClass.name.equals("NumeroDecimal")) {
			var NumeroDecimal prueba = new NumeroDecimalImpl
			prueba = myVal as NumeroDecimal
			prueba.generate
		} else if (myVal.eClass.name.equals("ValorBooleano")) {
			var ValorBooleano prueba = new ValorBooleanoImpl
			prueba = myVal as ValorBooleano
			prueba.generate
		} else if (myVal.eClass.name.equals("ConstCadena")) {
			var ConstCadena prueba = new ConstCadenaImpl
			prueba = myVal as ConstCadena
			prueba.generate
		} else if (myVal.eClass.name.equals("Caracter")) {
			var Caracter prueba = new CaracterImpl
			prueba = myVal as Caracter
			prueba.generate
		} else if (myVal.eClass.name.equals("VariableID")) {
			var VariableID prueba = new VariableIDImpl
			prueba = myVal as VariableID
			prueba.generate
		} else if (myVal.eClass.name.equals("LlamadaFuncion")) {
			var LlamadaFuncion prueba = new LlamadaFuncionImpl
			prueba = myVal as LlamadaFuncion
			prueba.generate(false)
		} else if (myVal.eClass.name.equals("operacion")) {
			var operacion prueba = new operacionImpl
			prueba = myVal as operacion
			prueba.generate
		} else if (myVal.eClass.name.equals("Internas")) {
			var Internas prueba = new InternasImpl
			prueba = myVal as Internas
			prueba.generate
		} else if (myVal.eClass.name.equals("unaria")) {
			//var unaria prueba = new unariaImpl
			//prueba = myVal as unaria
			//prueba.generate
		} else if (myVal.eClass.name.equals("ValorRegistro")) {
			var ValorRegistro prueba = new ValorRegistroImpl
			prueba = myVal as ValorRegistro
			prueba.generate
		} else if (myVal.eClass.name.equals("ValorVector")) {
			var ValorVector prueba = new ValorVectorImpl
			prueba = myVal as ValorVector
			prueba.generate
		} else if (myVal.eClass.name.equals("ValorMatriz")) {
			var ValorMatriz prueba = new ValorMatrizImpl
			prueba = myVal as ValorMatriz
			prueba.generate
		}
	}

	override generate(NumeroEntero numero) {
		return numero.valor.toString
	}

	override generate(NumeroDecimal numero) {
		return numero.valor.toString
	}

	override generate(ValorBooleano valBool) {
		if (valBool.valor.equals(readerMessages.getBundle().getString("VERDADERO")))
			return "1"
		else
			return "0"
	}

	override generate(ConstCadena cadena) {
		print(cadena.contenido)
	}

	override generate(Caracter caracter) {
		print(caracter.contenido)
	}

	override generate(VariableID variable) '''
	«variable.nombre»«FOR matri:variable.mat»«matri.toString»«ENDFOR»'''
	
	def generatePuntero(VariableID variable) '''
	*«variable.nombre»«FOR matri:variable.mat»«matri.toString»«ENDFOR»'''

	//override generate(unaria myUnaria) {
	//	return "!" + myUnaria.variable.generate;
	//}
	
	def contienenExpresionLeer(EList<Sentencias> sentencias, Leer l) {
		if(sentencias.contains(l)) {
			return true;
		}
		for(Sentencias s: sentencias) {
			if(s.eClass.name.equals("mientras")) {
				var mientras = s as mientras;
				if(mientras.sentencias.contains(l)) {
					return true;
				}
				else {
					if(contienenExpresionLeer(mientras.sentencias, l) == true) {
						return true;
					}
				}
			}
			else if(s.eClass.name.equals("repetir")) {
				var repetir = s as repetir;
				if(repetir.sentencias.contains(l)) {
					return true;
				}
				else {
					if(contienenExpresionLeer(repetir.sentencias, l) == true) {
						return true;
					}
				}
			}
			else if(s.eClass.name.equals("desde")) {
				var desde = s as desde;
				if(desde.sentencias.contains(l)) {
					return true;
				}
				else {
					if(contienenExpresionLeer(desde.sentencias, l) == true) {
						return true;
					}
				}
			}
			else if(s.eClass.name.equals("Si")) {
				var si = s as Si;
				if(si.sentencias.contains(l)) {
					return true;
				}
				else if(si.sino != null) {
					if(si.sino.sentencias.contains(l)) {
						return true;
					}
					else {
						if(contienenExpresionLeer(si.sino.sentencias, l) == true) {
							return true;
						}
					}
				}
				else {
					if(contienenExpresionLeer(si.sentencias, l) == true) {
						return true;
					}
				}
			}
			else if(s.eClass.name.equals("segun")) {
				var segun = s as segun;
				for(Caso c: segun.caso) {
					if(c.sentencias.contains(l)) {
						return true;
					}
					else {
						if(contienenExpresionLeer(c.sentencias, l) == true) {
							return true;
						}
					}
				}
			}
		}
		return false;
	}
	
	def generateModulo(Leer l) {
		for(Subproceso s: modulo.implementacion.funcion) {
			var perteneceSubproceso = false;
			if(!s.sentencias.contains(l)) {
				for(Sentencias sent: s.sentencias) {
					if(sent.eClass.name.equals("mientras") && perteneceSubproceso == false) {
						var mientras = sent as mientras;
						perteneceSubproceso = contienenExpresionLeer(mientras.sentencias, l);
					}
					else if(sent.eClass.name.equals("repetir") && perteneceSubproceso == false) {
						var repetir = sent as repetir;
						perteneceSubproceso = contienenExpresionLeer(repetir.sentencias, l);
					}
					else if(sent.eClass.name.equals("desde") && perteneceSubproceso == false) {
						var desde = sent as desde;
						perteneceSubproceso = contienenExpresionLeer(desde.sentencias, l);
					}
					else if(sent.eClass.name.equals("Si") && perteneceSubproceso == false) {
						var si = sent as Si;
						perteneceSubproceso = contienenExpresionLeer(si.sentencias, l);
						if(si.sino != null) {
							perteneceSubproceso = contienenExpresionLeer(si.sino.sentencias, l);
						}
					}	
					else if(sent.eClass.name.equals("segun") && perteneceSubproceso == false) {
						var segun = sent as segun;
						for(Caso c: segun.caso) {
							if(perteneceSubproceso == false) {
								perteneceSubproceso = contienenExpresionLeer(c.sentencias, l);
							}
						}
					}
		 		}
		 	}
		 	if(s.sentencias.contains(l) || perteneceSubproceso) {
		 		var tipo = "";
		 		var resultado = "";
		 		for(operacion op: l.variable) {
		 			if(op.eClass.name.equals("VariableID")) {
						var varID = op as VariableID;
						tipo = variablesSubprocesos.get(s.nombre).get(varID.nombre);
				}
				else if(op.eClass.name.equals("ValorVector")) {
					var vector = op as ValorVector;
					if(vector.campo.size() == 0) {
						tipo = vectoresMatrices.get(variablesSubprocesos.get(s.nombre).get(vector.nombre_vector));
					}
					else {
						tipo = registros.get(vectoresMatrices.get(variablesSubprocesos.get(s.nombre).get(vector.nombre_vector))).get(vector.campo.get(0).nombre_campo);
					}
				}
				else if(op.eClass.name.equals("ValorMatriz")) {
					var matriz = op as ValorMatriz;
					if(matriz.campo.size() == 0) {
						tipo = vectoresMatrices.get(variablesSubprocesos.get(s.nombre).get(matriz.nombre_matriz));
					}
					else {
						tipo = registros.get(vectoresMatrices.get(variablesSubprocesos.get(s.nombre).get(matriz.nombre_matriz))).get(matriz.campo.get(0).nombre_campo);
					}
				}	
				else if(op.eClass.name.equals("ValorRegistro")) {
					var registro = op as ValorRegistro;
					if(registro.campo.size() == 1) {
						tipo = registros.get(variablesInicio.get(registro.nombre_registro)).get(registro.campo.get(0).nombre_campo);
					} else {
						var tipoRegistro = registros.get(variablesInicio.get(registro.nombre_registro)).get(registro.campo.get(registro.campo.size() - 2).nombre_campo);
						tipo = registros.get(tipoRegistro).get(registro.campo.get(registro.campo.size() - 1).nombre_campo);
					}
				}
				if(tipo.equals(readerMessages.getBundle().getString("TIPO_ENTERO"))) {
					if(resultado == "") {
						resultado = '''scanf("%i", &«op.generate»);'''
					}
					else {
						resultado = resultado + "\n";
						resultado = resultado + '''scanf("%i", &«op.generate»);'''
					}
				}
				else if(tipo.equals(readerMessages.getBundle().getString("TIPO_CARACTER"))) {
					if(resultado == "") {
						resultado = '''scanf("%c", &«op.generate»);'''
					}
					else {
						resultado = resultado + "\n";
						resultado = resultado + '''scanf("%c", &«op.generate»);'''
					}
				}
				else if(tipo.equals(readerMessages.getBundle().getString("TIPO_CADENA"))) {
					if(resultado == "") {
						resultado = '''scanf("%s", &«op.generate»);'''
					}
					else {
						resultado = resultado + "\n";
						resultado = resultado + '''scanf("%s", &«op.generate»);'''
					}
				}
				else if(tipo.equals(readerMessages.getBundle().getString("TIPO_REAL"))) {
					if(resultado == "") {
						resultado = '''scanf("%f", &«op.generate»);'''
					}
					else {
						resultado = resultado + "\n";
						resultado = resultado + '''scanf("%f", &«op.generate»);'''
					}
		 		}
		 		}
		 		return resultado;
			}	
		}	
	}
	
	override generate(Leer l) {
		var perteneceInicio = false;
		if(!algoritmo.tiene.tiene.contains(l)) {
			for(Sentencias s: algoritmo.tiene.tiene) {
				if(s.eClass.name.equals("mientras") && perteneceInicio == false) {
					var mientras = s as mientras;
					perteneceInicio = contienenExpresionLeer(mientras.sentencias, l);
				}
				else if(s.eClass.name.equals("repetir") && perteneceInicio == false) {
					var repetir = s as repetir;
					perteneceInicio = contienenExpresionLeer(repetir.sentencias, l);
				}
				else if(s.eClass.name.equals("desde") && perteneceInicio == false) {
					var desde = s as desde;
					perteneceInicio = contienenExpresionLeer(desde.sentencias, l);
				}
				else if(s.eClass.name.equals("Si") && perteneceInicio == false) {
					var si = s as Si;
					perteneceInicio = contienenExpresionLeer(si.sentencias, l);
					if(si.sino != null) {
						perteneceInicio = contienenExpresionLeer(si.sino.sentencias, l);
					}
				}	
				else if(s.eClass.name.equals("segun") && perteneceInicio == false) {
					var segun = s as segun;
					for(Caso c: segun.caso) {
						if(perteneceInicio == false) {
							perteneceInicio = contienenExpresionLeer(c.sentencias, l);
						}
					}
				}
		 	}
		}
		if(algoritmo.tiene.tiene.contains(l) || perteneceInicio) {
			var tipo = "";
			var resultado = "";
			for(operacion op: l.variable) {
				if(op.eClass.name.equals("VariableID")) {
				var varID = op as VariableID;
				tipo = variablesInicio.get(varID.nombre);
			}
			else if(op.eClass.name.equals("ValorVector")) {
				var vector = op as ValorVector;
				if(vector.campo.size() == 0) {
					tipo = vectoresMatrices.get(variablesInicio.get(vector.nombre_vector));
				}
				else {
					tipo = registros.get(vectoresMatrices.get(variablesInicio.get(vector.nombre_vector))).get(vector.campo.get(0).nombre_campo);
				}
			}
			else if(op.eClass.name.equals("ValorMatriz")) {
				var matriz = op as ValorMatriz;
				if(matriz.campo.size() == 0) {
					tipo = vectoresMatrices.get(variablesInicio.get(matriz.nombre_matriz));
				}
				else {
					tipo = registros.get(vectoresMatrices.get(variablesInicio.get(matriz.nombre_matriz))).get(matriz.campo.get(0).nombre_campo);
				}
			}
			else if(op.eClass.name.equals("ValorRegistro")) {
				var registro = op as ValorRegistro;
				if(registro.campo.size() == 1) {
					tipo = registros.get(variablesInicio.get(registro.nombre_registro)).get(registro.campo.get(0).nombre_campo);
				} else {
					var tipoRegistro = registros.get(variablesInicio.get(registro.nombre_registro)).get(registro.campo.get(registro.campo.size() - 2).nombre_campo);
					tipo = registros.get(tipoRegistro).get(registro.campo.get(registro.campo.size() - 1).nombre_campo);
				}
			}
			if(tipo.equals(readerMessages.getBundle().getString("TIPO_ENTERO"))) {
					if(resultado == "") {
						resultado = '''scanf("%i", &«op.generate»);'''
					}
					else {
						resultado = resultado + "\n";
						resultado = resultado + '''scanf("%i", &«op.generate»);'''
					}
				}
				else if(tipo.equals(readerMessages.getBundle().getString("TIPO_CARACTER"))) {
					if(resultado == "") {
						resultado = '''scanf("%c", &«op.generate»);'''
					}
					else {
						resultado = resultado + "\n";
						resultado = resultado + '''scanf("%c", &«op.generate»);'''
					}
				}
				else if(tipo.equals(readerMessages.getBundle().getString("TIPO_CADENA"))) {
					if(resultado == "") {
						resultado = '''scanf("%s", &«op.generate»);'''
					}
					else {
						resultado = resultado + "\n";
						resultado = resultado + '''scanf("%s", &«op.generate»);'''
					}
				}
				else if(tipo.equals(readerMessages.getBundle().getString("TIPO_REAL"))) {
					if(resultado == "") {
						resultado = '''scanf("%f", &«op.generate»);'''
					}
					else {
						resultado = resultado + "\n";
						resultado = resultado + '''scanf("%f", &«op.generate»);'''
					}
		 		}
		 		else if(vectoresMatrices.containsKey(tipo)) {
					var tipoAux = vectoresMatrices.get(tipo);
					if(tipoAux.equals(readerMessages.getBundle().getString("TIPO_ENTERO"))) {
						if(resultado == "") {
							resultado = '''scanf("%i", &«op.generate»);'''
						}
						else {
							resultado = resultado + "\n";
							resultado = resultado + '''scanf("%i", &«op.generate»);'''
						}
					}
					else if(tipoAux.equals(readerMessages.getBundle().getString("TIPO_CADENA")) || tipoAux.equals(readerMessages.getBundle().getString("TIPO_CARACTER"))) {
						if(resultado == "") {
							resultado = '''scanf("%s", &«op.generate»);'''
						}
						else {
							resultado = resultado + "\n";
							resultado = resultado + '''scanf("%s", &«op.generate»);'''
						}
					}
					else if(tipoAux.equals(readerMessages.getBundle().getString("TIPO_REAL"))) {
						if(resultado == "") {
							resultado = '''scanf("%f", &«op.generate»);'''
						}
						else {
							resultado = resultado + "\n";
							resultado = resultado + '''scanf("%f", &«op.generate»);'''
						}
					}
				}
			}
			return resultado;
		}
		else {
			for(Subproceso s: algoritmo.funcion) {
				var perteneceSubproceso = false;
				if(!s.sentencias.contains(l)) {
					for(Sentencias sent: s.sentencias) {
						if(sent.eClass.name.equals("mientras") && perteneceSubproceso == false) {
						var mientras = sent as mientras;
						perteneceSubproceso = contienenExpresionLeer(mientras.sentencias, l);
					}
					else if(sent.eClass.name.equals("repetir") && perteneceSubproceso == false) {
						var repetir = sent as repetir;
						perteneceSubproceso = contienenExpresionLeer(repetir.sentencias, l);
					}
					else if(sent.eClass.name.equals("desde") && perteneceSubproceso == false) {
						var desde = sent as desde;
						perteneceSubproceso = contienenExpresionLeer(desde.sentencias, l);
					}
					else if(sent.eClass.name.equals("Si") && perteneceSubproceso == false) {
						var si = sent as Si;
						perteneceSubproceso = contienenExpresionLeer(si.sentencias, l);
						if(si.sino != null) {
							perteneceSubproceso = contienenExpresionLeer(si.sino.sentencias, l);
						}
					}	
					else if(sent.eClass.name.equals("segun") && perteneceSubproceso == false) {
						var segun = sent as segun;
						for(Caso c: segun.caso) {
							if(perteneceSubproceso == false) {
								perteneceSubproceso = contienenExpresionLeer(c.sentencias, l);
							}
						}
					}
		 		}
		 	}
		 	if(s.sentencias.contains(l) || perteneceSubproceso) {
		 		var tipo = "";
		 		var resultado = "";
		 		for(operacion op: l.variable) {
		 			if(op.eClass.name.equals("VariableID")) {
						var varID = op as VariableID;
						tipo = variablesSubprocesos.get(s.nombre).get(varID.nombre);
				}
				else if(op.eClass.name.equals("ValorVector")) {
					var vector = op as ValorVector;
					if(vector.campo.size() == 0) {
						tipo = vectoresMatrices.get(variablesSubprocesos.get(s.nombre).get(vector.nombre_vector));
					}
					else {
						tipo = registros.get(vectoresMatrices.get(variablesSubprocesos.get(s.nombre).get(vector.nombre_vector))).get(vector.campo.get(0).nombre_campo);
					}
				}
				else if(op.eClass.name.equals("ValorMatriz")) {
					var matriz = op as ValorMatriz;
					if(matriz.campo.size() == 0) {
						tipo = vectoresMatrices.get(variablesSubprocesos.get(s.nombre).get(matriz.nombre_matriz));
					}
					else {
						tipo = registros.get(vectoresMatrices.get(variablesSubprocesos.get(s.nombre).get(matriz.nombre_matriz))).get(matriz.campo.get(0).nombre_campo);
					}
				}	
				else if(op.eClass.name.equals("ValorRegistro")) {
					var registro = op as ValorRegistro;
					if(registro.campo.size() == 1) {
						tipo = registros.get(variablesInicio.get(registro.nombre_registro)).get(registro.campo.get(0).nombre_campo);
					} else {
						var tipoRegistro = registros.get(variablesInicio.get(registro.nombre_registro)).get(registro.campo.get(registro.campo.size() - 2).nombre_campo);
						tipo = registros.get(tipoRegistro).get(registro.campo.get(registro.campo.size() - 1).nombre_campo);
					}
				}
				if(tipo.equals(readerMessages.getBundle().getString("TIPO_ENTERO"))) {
					if(resultado == "") {
						resultado = '''scanf("%i", &«op.generate»);'''
					}
					else {
						resultado = resultado + "\n";
						resultado = resultado + '''scanf("%i", &«op.generate»);'''
					}
				}
				else if(tipo.equals(readerMessages.getBundle().getString("TIPO_CARACTER"))) {
					if(resultado == "") {
						resultado = '''scanf("%c", &«op.generate»);'''
					}
					else {
						resultado = resultado + "\n";
						resultado = resultado + '''scanf("%c", &«op.generate»);'''
					}
				}
				else if(tipo.equals(readerMessages.getBundle().getString("TIPO_CADENA"))) {
					if(resultado == "") {
						resultado = '''scanf("%s", &«op.generate»);'''
					}
					else {
						resultado = resultado + "\n";
						resultado = resultado + '''scanf("%s", &«op.generate»);'''
					}
				}
				else if(tipo.equals(readerMessages.getBundle().getString("TIPO_REAL"))) {
					if(resultado == "") {
						resultado = '''scanf("%f", &«op.generate»);'''
					}
					else {
						resultado = resultado + "\n";
						resultado = resultado + '''scanf("%f", &«op.generate»);'''
					}
		 		}
		 		else if(vectoresMatrices.containsKey(tipo)) {
					var tipoAux = vectoresMatrices.get(tipo);
					if(tipoAux.equals(readerMessages.getBundle().getString("TIPO_ENTERO"))) {
						if(resultado == "") {
							resultado = '''scanf("%i", &«op.generate»);'''
						}
						else {
							resultado = resultado + "\n";
							resultado = resultado + '''scanf("%i", &«op.generate»);'''
						}
					}
					else if(tipoAux.equals(readerMessages.getBundle().getString("TIPO_CADENA")) || tipoAux.equals(readerMessages.getBundle().getString("TIPO_CARACTER"))) {
						if(resultado == "") {
							resultado = '''scanf("%s", &«op.generate»);'''
						}
						else {
							resultado = resultado + "\n";
							resultado = resultado + '''scanf("%s", &«op.generate»);'''
						}
					}
					else if(tipoAux.equals(readerMessages.getBundle().getString("TIPO_REAL"))) {
						if(resultado == "") {
							resultado = '''scanf("%f", &«op.generate»);'''
						}
						else {
							resultado = resultado + "\n";
							resultado = resultado + '''scanf("%f", &«op.generate»);'''
						}
					}
				}
			}
			return resultado;
			}
		}
		}
	}

	override generate(Internas i) {
		if (i.nombre == NombreInterna::COS) {
			'''cos(«i.operadores.get(0).generate»)'''
		} else if (i.nombre == NombreInterna::SEN) {
			'''sin(«i.operadores.get(0).generate»)'''
		} else if (i.nombre == NombreInterna::CUADRADO) {
			'''pow(«i.operadores.get(0).generate»,«2.0»)'''
		} else if (i.nombre == NombreInterna::EXP) {
			'''exp2(«i.operadores.get(0).generate»)'''
		} else if (i.nombre == NombreInterna::LN) {
			'''log(«i.operadores.get(0).generate»)'''
		} else if (i.nombre == NombreInterna::LOG) {
			'''log10(«i.operadores.get(0).generate»)'''
		} else if (i.nombre == NombreInterna::SQRT) {
			'''sqrt(«i.operadores.get(0).generate»)'''
		} else if (i.nombre == NombreInterna::LONGITUD) {
			'''strlen(«i.operadores.get(0).generate»)'''
		} else if (i.nombre == NombreInterna::CONCATENA) {
			'''strcat(«i.operadores.get(0).generate»,«i.operadores.get(1).generate»)'''
		} 
	}
	
	def coutOperadoresC(EList<operacion> operaciones) {
		var resultado = "";
		var numero = 1;
		for (op : operaciones) {
			if(operaciones.size() > 1 && numero < operaciones.size && numero != 1) {
				resultado = resultado + op.generate + " , ";
			}
			else if(numero != 1 || operaciones.size() == 1) {
				resultado = resultado + op.generate;
			}
			numero = numero + 1;
		}
		return resultado;
	}
	
	def coutOperadoresCPunteros(EList<operacion> operaciones, List<String> punteros) {
		var resultado = "";
		var numero = 1;
		for (op : operaciones) {
			if(operaciones.size() > 1 && numero < operaciones.size && numero != 1) {
				resultado = resultado + op.generatePunteros(punteros) + " , ";
			}
			else if(numero != 1 || operaciones.size() == 1) {
				resultado = resultado + op.generatePunteros(punteros);
			}
			numero = numero + 1;
		}
		return resultado;
	}
	
	def contienenExpresionEscribir(EList<Sentencias> sentencias, Escribir e) {
		if(sentencias.contains(e)) {
			return true;
		}
		for(Sentencias s: sentencias) {
			if(s.eClass.name.equals("mientras")) {
				var mientras = s as mientras;
				if(mientras.sentencias.contains(e)) {
					return true;
				}
				else {
					if(contienenExpresionEscribir(mientras.sentencias, e) == true) {
						return true;
					}
				}
			}
			else if(s.eClass.name.equals("repetir")) {
				var repetir = s as repetir;
				if(repetir.sentencias.contains(e)) {
					return true;
				}
				else {
					if(contienenExpresionEscribir(repetir.sentencias, e) == true) {
						return true;
					}
				}
			}
			else if(s.eClass.name.equals("desde")) {
				var desde = s as desde;
				if(desde.sentencias.contains(e)) {
					return true;
				}
				else {
					if(contienenExpresionEscribir(desde.sentencias, e) == true) {
						return true;
					}
				}
			}
			else if(s.eClass.name.equals("Si")) {
				var si = s as Si;
				if(si.sentencias.contains(e)) {
					return true;
				}
				else if(si.sino != null) {
					if(si.sino.sentencias.contains(e)) {
						return true;
					}
					else {
						if(contienenExpresionEscribir(si.sino.sentencias, e) == true) {
							return true;
						}
					}
				}
				else {
					if(contienenExpresionEscribir(si.sentencias, e) == true) {
						return true;
					}
				}
			}
			else if(s.eClass.name.equals("segun")) {
				var segun = s as segun;
				for(Caso c: segun.caso) {
					if(c.sentencias.contains(e)) {
						return true;
					}
					else {
						if(contienenExpresionEscribir(c.sentencias, e) == true) {
							return true;
						}
					}
				}
			}
		}
		return false;
	}
	
	def generateModuloPunteros(Escribir a, List<String> punteros) {
		   for(Subproceso s: modulo.implementacion.funcion) {
			var perteneceSubproceso = false;
			if(!s.sentencias.contains(a) && a.operador.size() > 0) {
				for(Sentencias sent: s.sentencias) {
					if(sent.eClass.name.equals("mientras") && perteneceSubproceso == false) {
						var mientras = sent as mientras;
						perteneceSubproceso = contienenExpresionEscribir(mientras.sentencias, a);
					}
					else if(sent.eClass.name.equals("repetir") && perteneceSubproceso == false) {
						var repetir = sent as repetir;
						perteneceSubproceso = contienenExpresionEscribir(repetir.sentencias, a);
					}
					else if(sent.eClass.name.equals("desde") && perteneceSubproceso == false) {
						var desde = sent as desde;
						perteneceSubproceso = contienenExpresionEscribir(desde.sentencias, a);
					}
					else if(sent.eClass.name.equals("Si") && perteneceSubproceso == false) {
						var si = sent as Si;
						perteneceSubproceso = contienenExpresionEscribir(si.sentencias, a);
						if(si.sino != null) {
							perteneceSubproceso = contienenExpresionEscribir(si.sino.sentencias, a);
						}
					}	
					else if(sent.eClass.name.equals("segun") && perteneceSubproceso == false) {
						var segun = sent as segun;
						for(Caso c: segun.caso) {
							if(perteneceSubproceso == false) {
								perteneceSubproceso = contienenExpresionEscribir(c.sentencias, a);
							}
						}
					}
		 		}
		 	}
			if(s.sentencias.contains(a) || (perteneceSubproceso && a.operador.size() > 0)) {
				var cadena = new String();
				if(a.operador.get(0).eClass.name.equals("ConstCadena")) {
					//En este caso el usuario ha introducido un texto
					var primero = a.operador.get(0) as ConstCadena;
					cadena = primero.contenido;
					cadena = cadena.substring(0, cadena.length()-1);
				}
				
				if(a.operador.size() == 1 && !a.operador.get(0).eClass.name.equals("ConstCadena")) {
					cadena = cadena + "\"";
				}
				
				if(a.operador.size() == 1 && a.operador.get(0).eClass.name.equals("ConstCadena")) {
					cadena = cadena + " \\n\"";
				}
				for(o: a.operador) {
					//Si es el primer elemento y es distinto a una cadena si, sino se lo salta
					if(a.operador.indexOf(o) == 0 && !o.eClass.name.equals("ConstCadena") || a.operador.indexOf(o) != 0) {
						var tipo = "";
						if(o.eClass.name.equals("VariableID")) {
							var varID = o as VariableID;
							tipo = variablesSubprocesos.get(s.nombre).get(varID.nombre);
						}
						else if(o.eClass.name.equals("ValorVector")) {
							var vector = o as ValorVector;
							if(vector.campo.size() == 0) {
								tipo = vectoresMatrices.get(variablesSubprocesos.get(s.nombre).get(vector.nombre_vector));
							}
							else {
								tipo = registros.get(vectoresMatrices.get(variablesSubprocesos.get(s.nombre).get(vector.nombre_vector))).get(vector.campo.get(0).nombre_campo);
							}
						}
						else if(o.eClass.name.equals("ValorMatriz")) {
							var matriz = o as ValorMatriz;
							if(matriz.campo.size() == 0) {
								tipo = vectoresMatrices.get(variablesSubprocesos.get(s.nombre).get(matriz.nombre_matriz));
							}
							else {
								tipo = registros.get(vectoresMatrices.get(variablesSubprocesos.get(s.nombre).get(matriz.nombre_matriz))).get(matriz.campo.get(0).nombre_campo);
							}
						}	
						else if(o.eClass.name.equals("ValorRegistro")) {
							var registro = o as ValorRegistro;
							//El último campo nos proporcionará el tipo
							if(registro.campo.size() == 1) {
								tipo = registros.get(variablesInicio.get(registro.nombre_registro)).get(registro.campo.get(0).nombre_campo);
							} else {
								var tipoRegistro = registros.get(variablesInicio.get(registro.nombre_registro)).get(registro.campo.get(registro.campo.size() - 2).nombre_campo);
								tipo = registros.get(tipoRegistro).get(registro.campo.get(registro.campo.size() - 1).nombre_campo);
							}
						}
						else if(o.eClass.name.equals("LlamadaFuncion")) {
							var llamadaFuncion = o as LlamadaFuncion;
							tipo = funciones.get(llamadaFuncion.nombre);
						}
						if(tipo.equals(readerMessages.getBundle().getString("TIPO_ENTERO")) || o.eClass.name.equals("NumeroEntero")) {
							if(a.operador.indexOf(o) == a.operador.size - 1) {
								cadena = cadena + " %i \\n \"";
							}
							else {
								cadena = cadena + " %i";
							}
						}
						else if(tipo.equals(readerMessages.getBundle().getString("TIPO_CARACTER"))) {
							if(a.operador.indexOf(o) == a.operador.size - 1) {
								cadena = cadena + " %c \\n \"";
							}
							else {
								cadena = cadena + " %c";
							}
						}
						else if(tipo.equals(readerMessages.getBundle().getString("TIPO_CADENA"))) {
							if(a.operador.indexOf(o) == a.operador.size - 1) {
								cadena = cadena + " %s \\n \"";
							}
							else {
								cadena = cadena + " %s";
							}
						}
						else if(tipo.equals(readerMessages.getBundle().getString("TIPO_REAL"))) {
							if(a.operador.indexOf(o) == a.operador.size - 1) {
								cadena = cadena + " %f \\n \"";
							}	
							else {
								cadena = cadena + " %f";
							}
						}
					}
			}
			if(a.operador.size > 1 || (a.operador.size == 1 && !a.operador.get(0).eClass.name.equals("ConstCadena"))) {
				cadena = cadena + ", " + a.operador.coutOperadoresCPunteros(punteros);
				return '''printf(«cadena»);'''	
			}
			else {
				return '''printf(«cadena»);'''
			}
		}	
	}
	}
	
	def generateModulo(Escribir a) {	
		for(Subproceso s: modulo.implementacion.funcion) {
			var perteneceSubproceso = false;
			if(!s.sentencias.contains(a) && a.operador.size() > 0) {
				for(Sentencias sent: s.sentencias) {
					if(sent.eClass.name.equals("mientras") && perteneceSubproceso == false) {
						var mientras = sent as mientras;
						perteneceSubproceso = contienenExpresionEscribir(mientras.sentencias, a);
					}
					else if(sent.eClass.name.equals("repetir") && perteneceSubproceso == false) {
						var repetir = sent as repetir;
						perteneceSubproceso = contienenExpresionEscribir(repetir.sentencias, a);
					}
					else if(sent.eClass.name.equals("desde") && perteneceSubproceso == false) {
						var desde = sent as desde;
						perteneceSubproceso = contienenExpresionEscribir(desde.sentencias, a);
					}
					else if(sent.eClass.name.equals("Si") && perteneceSubproceso == false) {
						var si = sent as Si;
						perteneceSubproceso = contienenExpresionEscribir(si.sentencias, a);
						if(si.sino != null) {
							perteneceSubproceso = contienenExpresionEscribir(si.sino.sentencias, a);
						}
					}	
					else if(sent.eClass.name.equals("segun") && perteneceSubproceso == false) {
						var segun = sent as segun;
						for(Caso c: segun.caso) {
							if(perteneceSubproceso == false) {
								perteneceSubproceso = contienenExpresionEscribir(c.sentencias, a);
							}
						}
					}
		 		}
		 	}
			if(s.sentencias.contains(a) || (perteneceSubproceso && a.operador.size() > 0)) {
				var cadena = new String();
				if(a.operador.get(0).eClass.name.equals("ConstCadena")) {
					//En este caso el usuario ha introducido un texto
					var primero = a.operador.get(0) as ConstCadena;
					cadena = primero.contenido;
					cadena = cadena.substring(0, cadena.length()-1);
				}
				
				if(a.operador.size() == 1 && !a.operador.get(0).eClass.name.equals("ConstCadena")) {
					cadena = cadena + "\"";
				}
				
				if(a.operador.size() == 1 && a.operador.get(0).eClass.name.equals("ConstCadena")) {
					cadena = cadena + " \\n\"";
				}
				for(o: a.operador) {
					//Si es el primer elemento y es distinto a una cadena si, sino se lo salta
					if(a.operador.indexOf(o) == 0 && !o.eClass.name.equals("ConstCadena") || a.operador.indexOf(o) != 0) {
						var tipo = "";
						if(o.eClass.name.equals("VariableID")) {
							var varID = o as VariableID;
							tipo = variablesSubprocesos.get(s.nombre).get(varID.nombre);
						}
						else if(o.eClass.name.equals("ValorVector")) {
							var vector = o as ValorVector;
							if(vector.campo.size() == 0) {
								tipo = vectoresMatrices.get(variablesSubprocesos.get(s.nombre).get(vector.nombre_vector));
							}
							else {
								tipo = registros.get(vectoresMatrices.get(variablesSubprocesos.get(s.nombre).get(vector.nombre_vector))).get(vector.campo.get(0).nombre_campo);
							}
						}
						else if(o.eClass.name.equals("ValorMatriz")) {
							var matriz = o as ValorMatriz;
							if(matriz.campo.size() == 0) {
								tipo = vectoresMatrices.get(variablesSubprocesos.get(s.nombre).get(matriz.nombre_matriz));
							}
							else {
								tipo = registros.get(vectoresMatrices.get(variablesSubprocesos.get(s.nombre).get(matriz.nombre_matriz))).get(matriz.campo.get(0).nombre_campo);
							}
						}	
						else if(o.eClass.name.equals("ValorRegistro")) {
							var registro = o as ValorRegistro;
							//El último campo nos proporcionará el tipo
							if(registro.campo.size() == 1) {
								tipo = registros.get(variablesInicio.get(registro.nombre_registro)).get(registro.campo.get(0).nombre_campo);
							} else {
								var tipoRegistro = registros.get(variablesInicio.get(registro.nombre_registro)).get(registro.campo.get(registro.campo.size() - 2).nombre_campo);
								tipo = registros.get(tipoRegistro).get(registro.campo.get(registro.campo.size() - 1).nombre_campo);
							}
						}
						else if(o.eClass.name.equals("LlamadaFuncion")) {
							var llamadaFuncion = o as LlamadaFuncion;
							tipo = funciones.get(llamadaFuncion.nombre);
						}
						if(tipo.equals(readerMessages.getBundle().getString("TIPO_ENTERO")) || o.eClass.name.equals("NumeroEntero")) {
							if(a.operador.indexOf(o) == a.operador.size - 1) {
								cadena = cadena + " %i \\n \"";
							}
							else {
								cadena = cadena + " %i";
							}
						}
						else if(tipo.equals(readerMessages.getBundle().getString("TIPO_CARACTER"))) {
							if(a.operador.indexOf(o) == a.operador.size - 1) {
								cadena = cadena + " %c \\n \"";
							}
							else {
								cadena = cadena + " %c";
							}
						}
						else if(tipo.equals(readerMessages.getBundle().getString("TIPO_CADENA"))) {
							if(a.operador.indexOf(o) == a.operador.size - 1) {
								cadena = cadena + " %s \\n \"";
							}
							else {
								cadena = cadena + " %s";
							}
						}
						else if(tipo.equals(readerMessages.getBundle().getString("TIPO_REAL"))) {
							if(a.operador.indexOf(o) == a.operador.size - 1) {
								cadena = cadena + " %f \\n \"";
							}	
							else {
								cadena = cadena + " %f";
							}
						}
					}
			}
			if(a.operador.size > 1 || (a.operador.size == 1 && !a.operador.get(0).eClass.name.equals("ConstCadena"))) {
				cadena = cadena + ", " + a.operador.coutOperadoresC;
				return '''printf(«cadena»);'''	
			}
			else {
				return '''printf(«cadena»);'''
			}
		}	
	}
		
	}
	
	override generate(Escribir a) {
		var perteneceInicio = false;
		if(!algoritmo.tiene.tiene.contains(a)) {
			for(Sentencias s: algoritmo.tiene.tiene) {
				if(s.eClass.name.equals("mientras") && perteneceInicio == false) {
					var mientras = s as mientras;
					perteneceInicio = contienenExpresionEscribir(mientras.sentencias, a);
				}
				else if(s.eClass.name.equals("repetir") && perteneceInicio == false) {
					var repetir = s as repetir;
					perteneceInicio = contienenExpresionEscribir(repetir.sentencias, a);
				}
				else if(s.eClass.name.equals("desde") && perteneceInicio == false) {
					var desde = s as desde;
					perteneceInicio = contienenExpresionEscribir(desde.sentencias, a);
				}
				else if(s.eClass.name.equals("Si") && perteneceInicio == false) {
					var si = s as Si;
					perteneceInicio = contienenExpresionEscribir(si.sentencias, a);
					if(si.sino != null && perteneceInicio == false) {
						perteneceInicio = contienenExpresionEscribir(si.sino.sentencias, a);
					}
				}	
				else if(s.eClass.name.equals("segun") && perteneceInicio == false) {
					var segun = s as segun;
					for(Caso c: segun.caso) {
						if(perteneceInicio == false) {
							perteneceInicio = contienenExpresionEscribir(c.sentencias, a);
						}
					}
				}
		 	}
		}
		if(algoritmo.tiene.tiene.contains(a) || (perteneceInicio && a.operador.size() > 0)) {
			var iterador = 0;
			var cadena = new String();
			if(a.operador.get(0).eClass.name.equals("ConstCadena")) {
				//En este caso el usuario ha introducido un texto
				var primero = a.operador.get(0) as ConstCadena;
				cadena = primero.contenido;
				cadena = cadena.substring(0, cadena.length()-1);
			}
			
			if(a.operador.size() == 1 && !a.operador.get(0).eClass.name.equals("ConstCadena")) {
				cadena = cadena + "\"";
			}
			
			if(a.operador.size() == 1 && a.operador.get(0).eClass.name.equals("ConstCadena")) {
				cadena = cadena + " \\n\"";
			}
			for(o: a.operador) {
				if(a.operador.indexOf(o) == 0 && !o.eClass.name.equals("ConstCadena") || a.operador.indexOf(o) != 0) {
					var tipo = "";
					if(o.eClass.name.equals("VariableID")) {
						var varID = o as VariableID;
						tipo = variablesInicio.get(varID.nombre);
						System.out.println("tipo es:" +tipo)
					}
					else if(o.eClass.name.equals("ValorVector")) {
						var vector = o as ValorVector;
						if(vector.campo.size() == 0) {
							tipo = vectoresMatrices.get(variablesInicio.get(vector.nombre_vector));
						}
						else {
							tipo = registros.get(vectoresMatrices.get(variablesInicio.get(vector.nombre_vector))).get(vector.campo.get(0).nombre_campo);
						}	
					}
					else if(o.eClass.name.equals("ValorMatriz")) {
						var matriz = o as ValorMatriz;
						if(matriz.campo.size() == 0) {
							tipo = vectoresMatrices.get(variablesInicio.get(matriz.nombre_matriz));
						}
						else {
							tipo = registros.get(vectoresMatrices.get(variablesInicio.get(matriz.nombre_matriz))).get(matriz.campo.get(0).nombre_campo);
						}
					}
					else if(o.eClass.name.equals("ValorRegistro")) {
						var registro = o as ValorRegistro;
						//El último campo nos proporcionará el tipo
						if(registro.campo.size() == 1) {
							tipo = registros.get(variablesInicio.get(registro.nombre_registro)).get(registro.campo.get(0).nombre_campo);
						} else {
							var tipoRegistro = registros.get(variablesInicio.get(registro.nombre_registro)).get(registro.campo.get(registro.campo.size() - 2).nombre_campo);
							tipo = registros.get(tipoRegistro).get(registro.campo.get(registro.campo.size() - 1).nombre_campo);
						}	
					}
					else if(o.eClass.name.equals("LlamadaFuncion")) {
						var llamadaFuncion = o as LlamadaFuncion;
						tipo = funciones.get(llamadaFuncion.nombre);
					}
					if(tipo.equals(readerMessages.getBundle().getString("TIPO_ENTERO")) || o.eClass.name.equals("NumeroEntero")) {
						if(a.operador.indexOf(o) == a.operador.size - 1) {
							cadena = cadena + " %i \\n \"";
						}
						else {
							cadena = cadena + " %i";
						}
					}
					else if(tipo.equals(readerMessages.getBundle().getString("TIPO_CARACTER")) || o.eClass.name.equals("Caracter")) {
						if(a.operador.indexOf(o) == a.operador.size - 1) {
							cadena = cadena + " %c \\n \"";
						}
						else {
							cadena = cadena + " %c";
						}
					}
					else if(tipo.equals(readerMessages.getBundle().getString("TIPO_CADENA")) || o.eClass.name.equals("ConstCadena")) {
						if(a.operador.indexOf(o) == a.operador.size - 1) {
							cadena = cadena + " %s \\n \"";
						}
						else {
							cadena = cadena + " %s";
						}
					}
					else if(tipo.equals(readerMessages.getBundle().getString("TIPO_REAL")) || o.eClass.name.equals("NumeroDecimal")) {
						if(a.operador.indexOf(o) == a.operador.size - 1) {
							cadena = cadena + " %f \\n \"";
						}
						else {
							cadena = cadena + " %f";
						}
					}
					else if(vectoresMatrices.containsKey(tipo)) {
							var tipoAux = vectoresMatrices.get(tipo);
							if(tipoAux.equals(readerMessages.getBundle().getString("TIPO_ENTERO")) || o.eClass.name.equals("NumeroEntero")) {
								if(a.operador.indexOf(o) == a.operador.size - 1) {
									cadena = cadena + " %i \\n \"";
								}
								else {
									cadena = cadena + " %i";
								}
							}
							else if(tipoAux.equals(readerMessages.getBundle().getString("TIPO_CADENA")) || tipoAux.equals(readerMessages.getBundle().getString("TIPO_CARACTER"))) {
								if(a.operador.indexOf(o) == a.operador.size - 1) {
									cadena = cadena + " %s \\n \"";
								}
								else {
									cadena = cadena + " %s";
								}
							}
							else if(tipoAux.equals(readerMessages.getBundle().getString("TIPO_REAL"))) {
								if(a.operador.indexOf(o) == a.operador.size - 1) {
									cadena = cadena + " %f \\n \"";
								}	
								else {
									cadena = cadena + " %f";
								}
							}
						}
				}
			}
			if(a.operador.size > 1 || (a.operador.size == 1 && !a.operador.get(0).eClass.name.equals("ConstCadena"))) {
				cadena = cadena + ", " + a.operador.coutOperadoresC;
				return '''printf(«cadena»);'''	
			}
			else {
				return '''printf(«cadena»);'''
			}
		}
		else {
			for(Subproceso s: algoritmo.funcion) {
				var perteneceSubproceso = false;
				if(!s.sentencias.contains(a) && a.operador.size() > 0) {
					for(Sentencias sent: s.sentencias) {
						if(sent.eClass.name.equals("mientras") && perteneceSubproceso == false) {
						var mientras = sent as mientras;
						perteneceSubproceso = contienenExpresionEscribir(mientras.sentencias, a);
					}
					else if(sent.eClass.name.equals("repetir") && perteneceSubproceso == false) {
						var repetir = sent as repetir;
						perteneceSubproceso = contienenExpresionEscribir(repetir.sentencias, a);
					}
					else if(sent.eClass.name.equals("desde") && perteneceSubproceso == false) {
						var desde = sent as desde;
						perteneceSubproceso = contienenExpresionEscribir(desde.sentencias, a);
					}
					else if(sent.eClass.name.equals("Si") && perteneceSubproceso == false) {
						var si = sent as Si;
						perteneceSubproceso = contienenExpresionEscribir(si.sentencias, a);
						if(si.sino != null) {
							perteneceSubproceso = contienenExpresionEscribir(si.sino.sentencias, a);
						}
					}	
					else if(sent.eClass.name.equals("segun") && perteneceSubproceso == false) {
						var segun = sent as segun;
						for(Caso c: segun.caso) {
							if(perteneceSubproceso == false) {
								perteneceSubproceso = contienenExpresionEscribir(c.sentencias, a);
							}
						}
						//Si no esta en los case "genéricos" puede estar en el default
						if(perteneceSubproceso == false) {
							perteneceSubproceso = contienenExpresionEscribir(segun.sentencias, a);		
						}
					}
		 		}
		 	}
			if(s.sentencias.contains(a) || (perteneceSubproceso && a.operador.size() > 0)) {
				var cadena = new String();
				if(a.operador.get(0).eClass.name.equals("ConstCadena")) {
					//En este caso el usuario ha introducido un texto
					var primero = a.operador.get(0) as ConstCadena;
					cadena = primero.contenido;
					cadena = cadena.substring(0, cadena.length()-1);
				}
				
				if(a.operador.size() == 1 && !a.operador.get(0).eClass.name.equals("ConstCadena")) {
					cadena = cadena + "\"";
				}
				
				if(a.operador.size() == 1 && a.operador.get(0).eClass.name.equals("ConstCadena")) {
					cadena = cadena + " \\n\"";
				}
				for(o: a.operador) {
					//Si es el primer elemento y es distinto a una cadena si, sino se lo salta
					if(a.operador.indexOf(o) == 0 && !o.eClass.name.equals("ConstCadena") || a.operador.indexOf(o) != 0) {
						var tipo = "";
						if(o.eClass.name.equals("VariableID")) {
							var varID = o as VariableID;
							tipo = variablesSubprocesos.get(s.nombre).get(varID.nombre);
						}
						else if(o.eClass.name.equals("ValorVector")) {
							var vector = o as ValorVector;
							if(vector.campo.size() == 0) {
								tipo = vectoresMatrices.get(variablesSubprocesos.get(s.nombre).get(vector.nombre_vector));
							}
							else {
								tipo = registros.get(vectoresMatrices.get(variablesSubprocesos.get(s.nombre).get(vector.nombre_vector))).get(vector.campo.get(0).nombre_campo);
							}
						}
						else if(o.eClass.name.equals("ValorMatriz")) {
							var matriz = o as ValorMatriz;
							if(matriz.campo.size() == 0) {
								tipo = vectoresMatrices.get(variablesSubprocesos.get(s.nombre).get(matriz.nombre_matriz));
							}
							else {
								tipo = registros.get(vectoresMatrices.get(variablesSubprocesos.get(s.nombre).get(matriz.nombre_matriz))).get(matriz.campo.get(0).nombre_campo);
							}
						}	
						else if(o.eClass.name.equals("ValorRegistro")) {
							var registro = o as ValorRegistro;
							//El último campo nos proporcionará el tipo
							if(registro.campo.size() == 1) {
								tipo = registros.get(variablesInicio.get(registro.nombre_registro)).get(registro.campo.get(0).nombre_campo);
							} else {
								var tipoRegistro = registros.get(variablesInicio.get(registro.nombre_registro)).get(registro.campo.get(registro.campo.size() - 2).nombre_campo);
								tipo = registros.get(tipoRegistro).get(registro.campo.get(registro.campo.size() - 1).nombre_campo);
							}
						}
						else if(o.eClass.name.equals("LlamadaFuncion")) {
							var llamadaFuncion = o as LlamadaFuncion;
							tipo = funciones.get(llamadaFuncion.nombre);
						}
						if(tipo.equals(readerMessages.getBundle().getString("TIPO_ENTERO")) || o.eClass.name.equals("NumeroEntero")) {
							if(a.operador.indexOf(o) == a.operador.size - 1) {
								cadena = cadena + " %i \\n \"";
							}
							else {
								cadena = cadena + " %i";
							}
						}
						else if(tipo.equals(readerMessages.getBundle().getString("TIPO_CARACTER"))) {
							if(a.operador.indexOf(o) == a.operador.size - 1) {
								cadena = cadena + " %c \\n \"";
							}
							else {
								cadena = cadena + " %c";
							}
						}
						else if(tipo.equals(readerMessages.getBundle().getString("TIPO_CADENA"))) {
							if(a.operador.indexOf(o) == a.operador.size - 1) {
								cadena = cadena + " %s \\n \"";
							}
							else {
								cadena = cadena + " %s";
							}
						}
						else if(tipo.equals(readerMessages.getBundle().getString("TIPO_REAL"))) {
							if(a.operador.indexOf(o) == a.operador.size - 1) {
								cadena = cadena + " %f \\n \"";
							}	
							else {
								cadena = cadena + " %f";
							}
						}
						else if(vectoresMatrices.containsKey(tipo)) {
							var tipoAux = vectoresMatrices.get(tipo);
							if(tipoAux.equals(readerMessages.getBundle().getString("TIPO_ENTERO")) || o.eClass.name.equals("NumeroEntero")) {
								if(a.operador.indexOf(o) == a.operador.size - 1) {
									cadena = cadena + " %i \\n \"";
								}
								else {
									cadena = cadena + " %i";
								}
							}
							else if(tipoAux.equals(readerMessages.getBundle().getString("TIPO_CADENA")) || tipoAux.equals(readerMessages.getBundle().getString("TIPO_CARACTER"))) {
								if(a.operador.indexOf(o) == a.operador.size - 1) {
									cadena = cadena + " %s \\n \"";
								}
								else {
									cadena = cadena + " %s";
								}
							}
							else if(tipoAux.equals(readerMessages.getBundle().getString("TIPO_REAL"))) {
								if(a.operador.indexOf(o) == a.operador.size - 1) {
									cadena = cadena + " %f \\n \"";
								}	
								else {
									cadena = cadena + " %f";
								}
							}
						}
					}
			}
			if(a.operador.size > 1 || (a.operador.size == 1 && !a.operador.get(0).eClass.name.equals("ConstCadena"))) {
				cadena = cadena + ", " + a.operador.coutOperadoresC;
				return '''printf(«cadena»);'''	
			}
			else {
				return '''printf(«cadena»);'''
			}
		}	
	}
	}
	
	}

	def generaParametros(EList<operacion> operaciones) {
		var total = "";
		var actual = 1;
		for (op : operaciones) {
			if (actual != 1)
				total = total + ", "
			total = total + op.generate;
			actual = actual + 1;
		}
		return total;
	}
	
	def generaParametrosPunteros(EList<operacion> operaciones, String nombreSubproceso) {
		var total = "";
		var actual = 1;
		for (op : operaciones) {
			if (actual != 1) {
				total = total + ", "
			}
			if(subprocesosConPunteros.get(nombreSubproceso).contains(actual)) {
					total = total + " &" + op.generate;
					actual = actual + 1;
			}
			else {
				total = total + op.generate;
				actual = actual + 1;
			}
		}
		return total;
	}

	override generate(LlamadaFuncion fun, boolean a) '''«fun.nombre»«IF subprocesosConPunteros.get(fun.nombre).size() == 0»«fun.operadores.generaParametros»«ELSE»«fun.operadores.generaParametrosPunteros(fun.nombre)»«ENDIF»)«IF a»;«ENDIF»'''

	override generate(Operador op) {
		if (op.eClass.name.equals("NumeroEntero")) {
			var NumeroEntero prueba = new NumeroEnteroImpl
			prueba = op as NumeroEntero
			prueba.generate
		} else if (op.eClass.name.equals("NumeroDecimal")) {
			var NumeroDecimal prueba = new NumeroDecimalImpl
			prueba = op as NumeroDecimal
			prueba.generate
		} else if (op.eClass.name.equals("ValorBooleano")) {
			var ValorBooleano prueba = new ValorBooleanoImpl
			prueba = op as ValorBooleano
			prueba.generate
		} else if (op.eClass.name.equals("ConstCadena")) {
			var ConstCadena prueba = new ConstCadenaImpl
			prueba = op as ConstCadena
			prueba.generate
		} else if (op.eClass.name.equals("Caracter")) {
			var Caracter prueba = new CaracterImpl
			prueba = op as Caracter
			prueba.generate
		} else if (op.eClass.name.equals("VariableID")) {
			var VariableID prueba = new VariableIDImpl
			prueba = op as VariableID
			prueba.generate
		}
		else if (op.eClass.name.equals("ValorRegistro")) {
			var ValorRegistro prueba = new ValorRegistroImpl
			prueba = op as ValorRegistro
			prueba.generate
		}
		else if (op.eClass.name.equals("ValorVector")) {
			var ValorVector prueba = new ValorVectorImpl
			prueba = op as ValorVector
			prueba.generate
		}
		else if (op.eClass.name.equals("ValorMatriz")) {
			var ValorMatriz prueba = new ValorMatrizImpl
			prueba = op as ValorMatriz
			prueba.generate
		}
	}
	
	def generatePunteros(Operador op, List<String> punteros) {
		if (op.eClass.name.equals("NumeroEntero")) {
			var NumeroEntero prueba = new NumeroEnteroImpl
			prueba = op as NumeroEntero
			prueba.generate
		} else if (op.eClass.name.equals("NumeroDecimal")) {
			var NumeroDecimal prueba = new NumeroDecimalImpl
			prueba = op as NumeroDecimal
			prueba.generate
		} else if (op.eClass.name.equals("ValorBooleano")) {
			var ValorBooleano prueba = new ValorBooleanoImpl
			prueba = op as ValorBooleano
			prueba.generate
		} else if (op.eClass.name.equals("ConstCadena")) {
			var ConstCadena prueba = new ConstCadenaImpl
			prueba = op as ConstCadena
			prueba.generate
		} else if (op.eClass.name.equals("Caracter")) {
			var Caracter prueba = new CaracterImpl
			prueba = op as Caracter
			prueba.generate
		} else if (op.eClass.name.equals("VariableID")) {
			var VariableID prueba = new VariableIDImpl
			prueba = op as VariableID
			if(punteros.contains(prueba.nombre)) {
				prueba.generatePuntero
			} else {
				prueba.generate
			}
		}
		else if (op.eClass.name.equals("ValorRegistro")) {
			var ValorRegistro prueba = new ValorRegistroImpl
			prueba = op as ValorRegistro
			prueba.generate
		}
		else if (op.eClass.name.equals("ValorVector")) {
			var ValorVector prueba = new ValorVectorImpl
			prueba = op as ValorVector
			prueba.generate
		}
		else if (op.eClass.name.equals("ValorMatriz")) {
			var ValorMatriz prueba = new ValorMatrizImpl
			prueba = op as ValorMatriz
			prueba.generate
		}
	}
	
		def generatePunteros(operacion op, List<String> punteros) {
		if (op.eClass.name.equals("NumeroEntero")) {
			var NumeroEntero prueba = new NumeroEnteroImpl
			prueba = op as NumeroEntero
			prueba.generate	
		} else if (op.eClass.name.equals("NumeroDecimal")) {
			var NumeroDecimal prueba = new NumeroDecimalImpl
			prueba = op as NumeroDecimal
			prueba.generate
		} else if (op.eClass.name.equals("ValorBooleano")) {
			var ValorBooleano prueba = new ValorBooleanoImpl
			prueba = op as ValorBooleano
			prueba.generate
		} else if (op.eClass.name.equals("ConstCadena")) {
			var ConstCadena prueba = new ConstCadenaImpl
			prueba = op as ConstCadena
			prueba.generate
		} else if (op.eClass.name.equals("Caracter")) {
			var Caracter prueba = new CaracterImpl
			prueba = op as Caracter
			prueba.generate
		} else if (op.eClass.name.equals("VariableID")) {
			var VariableID prueba = new VariableIDImpl
			prueba = op as VariableID
			if(punteros.contains(prueba.nombre)) {
				prueba.generatePuntero
			} else {
				prueba.generate
			}
		}
		else if (op.eClass.name.equals("ValorRegistro")) {
			var ValorRegistro prueba = new ValorRegistroImpl
			prueba = op as ValorRegistro
			prueba.generate
		}
		else if (op.eClass.name.equals("ValorVector")) {
			var ValorVector prueba = new ValorVectorImpl
			prueba = op as ValorVector
			prueba.generate
		}
		else if (op.eClass.name.equals("ValorMatriz")) {
			var ValorMatriz prueba = new ValorMatrizImpl
			prueba = op as ValorMatriz
			prueba.generate
		}
		else if (op.eClass.name.equals("LlamadaFuncion")) {
			var LlamadaFuncion prueba = new LlamadaFuncionImpl
			prueba = op as LlamadaFuncion
			prueba.generate(false)
		}
		else if (op.eClass.name.equals("Internas")) {
			var Internas prueba = new InternasImpl
			prueba = op as Internas
			prueba.generate
		}
		else if (op.eClass.name.equals("Suma")) {
			var Suma prueba = new SumaImpl
			prueba = op as Suma
			prueba.generate
		}
		else if (op.eClass.name.equals("Resta")) {
			var Resta prueba = new RestaImpl
			prueba = op as Resta
			prueba.generate
		}
		else if (op.eClass.name.equals("Multiplicacion")) {
			var Multiplicacion prueba = new MultiplicacionImpl
			prueba = op as Multiplicacion
			prueba.generate
		}
		else if (op.eClass.name.equals("Division")) {
			var Division prueba = new DivisionImpl
			prueba = op as Division
			prueba.generate
		}
		else if (op.eClass.name.equals("Div")) {
			var Div prueba = new DivImpl
			prueba = op as Div
			prueba.generate
		}
		else if(op.eClass.name.equals("OperacionParentesis")) {
			var OperacionParentesis prueba = new OperacionParentesisImpl
			prueba = op as OperacionParentesis
			prueba.generate
		}
		else if(op.eClass.name.equals("Mod")) {
			var Mod prueba = new ModImpl
			prueba = op as Mod
			prueba.generate
		}
		else if (op.eClass.name.equals("Or")) {
			var Or prueba = new OrImpl
			prueba = op as Or
			prueba.generate
		}
		else if (op.eClass.name.equals("And")) {
			var And prueba = new AndImpl
			prueba = op as And
			prueba.generate
		}
		else if (op.eClass.name.equals("Comparacion")) {
			var Comparacion prueba = new ComparacionImpl
			prueba = op as Comparacion
			prueba.generate
		}
		else if (op.eClass.name.equals("Igualdad")) {
			var Igualdad prueba = new IgualdadImpl
			prueba = op as Igualdad
			prueba.generate
		}
		else if (op.eClass.name.equals("OperacionCompleta")) {
			var OperacionCompleta prueba = new OperacionCompletaImpl
			prueba = op as OperacionCompleta
			prueba.generate
		}
	}
	
	def generate(operacion op, List<String> punteros) {
		if (op.eClass.name.equals("NumeroEntero")) {
			var NumeroEntero prueba = new NumeroEnteroImpl
			prueba = op as NumeroEntero
			prueba.generate	
		} else if (op.eClass.name.equals("NumeroDecimal")) {
			var NumeroDecimal prueba = new NumeroDecimalImpl
			prueba = op as NumeroDecimal
			prueba.generate
		} else if (op.eClass.name.equals("ValorBooleano")) {
			var ValorBooleano prueba = new ValorBooleanoImpl
			prueba = op as ValorBooleano
			prueba.generate
		} else if (op.eClass.name.equals("ConstCadena")) {
			var ConstCadena prueba = new ConstCadenaImpl
			prueba = op as ConstCadena
			prueba.generate
		} else if (op.eClass.name.equals("Caracter")) {
			var Caracter prueba = new CaracterImpl
			prueba = op as Caracter
			prueba.generate
		} else if (op.eClass.name.equals("VariableID")) {
			var VariableID prueba = new VariableIDImpl
			prueba = op as VariableID
			if(punteros.contains(prueba.nombre)) {
				return '*('+ prueba.generate + ')';
			}
			else {
				prueba.generate
			}
		}
		else if (op.eClass.name.equals("ValorRegistro")) {
			var ValorRegistro prueba = new ValorRegistroImpl
			prueba = op as ValorRegistro
			prueba.generate
		}
		else if (op.eClass.name.equals("ValorVector")) {
			var ValorVector prueba = new ValorVectorImpl
			prueba = op as ValorVector
			prueba.generate
		}
		else if (op.eClass.name.equals("ValorMatriz")) {
			var ValorMatriz prueba = new ValorMatrizImpl
			prueba = op as ValorMatriz
			prueba.generate
		}
		else if (op.eClass.name.equals("LlamadaFuncion")) {
			var LlamadaFuncion prueba = new LlamadaFuncionImpl
			prueba = op as LlamadaFuncion
			prueba.generate(false)
		}
		else if (op.eClass.name.equals("Internas")) {
			var Internas prueba = new InternasImpl
			prueba = op as Internas
			prueba.generate
		}
		else if (op.eClass.name.equals("Suma")) {
			var Suma prueba = new SumaImpl
			prueba = op as Suma
			prueba.generate(punteros)
		}
		else if (op.eClass.name.equals("Resta")) {
			var Resta prueba = new RestaImpl
			prueba = op as Resta
			prueba.generate(punteros)
		}
		else if (op.eClass.name.equals("Multiplicacion")) {
			var Multiplicacion prueba = new MultiplicacionImpl
			prueba = op as Multiplicacion
			prueba.generate(punteros)
		}
		else if (op.eClass.name.equals("Division")) {
			var Division prueba = new DivisionImpl
			prueba = op as Division
			prueba.generate(punteros)
		}
		else if (op.eClass.name.equals("Div")) {
			var Div prueba = new DivImpl
			prueba = op as Div
			prueba.generate(punteros)
		}
		else if(op.eClass.name.equals("Mod")) {
			var Mod prueba = new ModImpl
			prueba = op as Mod
			prueba.generate(punteros)
		}
		else if(op.eClass.name.equals("OperacionParentesis")) {
			var OperacionParentesis prueba = new OperacionParentesisImpl
			prueba = op as OperacionParentesis
			prueba.generate(punteros)
		}
		else if (op.eClass.name.equals("Or")) {
			var Or prueba = new OrImpl
			prueba = op as Or
			prueba.generate(punteros)
		}
		else if (op.eClass.name.equals("And")) {
			var And prueba = new AndImpl
			prueba = op as And
			prueba.generate(punteros)
		}
		else if (op.eClass.name.equals("Comparacion")) {
			var Comparacion prueba = new ComparacionImpl
			prueba = op as Comparacion
			prueba.generate(punteros)
		}
		else if (op.eClass.name.equals("Igualdad")) {
			var Igualdad prueba = new IgualdadImpl
			prueba = op as Igualdad
			prueba.generate(punteros)
		}
		else if (op.eClass.name.equals("OperacionCompleta")) {
			var OperacionCompleta prueba = new OperacionCompletaImpl
			prueba = op as OperacionCompleta
			prueba.generate
		}
	}

	override generate(operacion op) {
		if (op.eClass.name.equals("NumeroEntero")) {
			var NumeroEntero prueba = new NumeroEnteroImpl
			prueba = op as NumeroEntero
			prueba.generate	
		} else if (op.eClass.name.equals("NumeroDecimal")) {
			var NumeroDecimal prueba = new NumeroDecimalImpl
			prueba = op as NumeroDecimal
			prueba.generate
		} else if (op.eClass.name.equals("ValorBooleano")) {
			var ValorBooleano prueba = new ValorBooleanoImpl
			prueba = op as ValorBooleano
			prueba.generate
		} else if (op.eClass.name.equals("ConstCadena")) {
			var ConstCadena prueba = new ConstCadenaImpl
			prueba = op as ConstCadena
			prueba.generate
		} else if (op.eClass.name.equals("Caracter")) {
			var Caracter prueba = new CaracterImpl
			prueba = op as Caracter
			prueba.generate
		} else if (op.eClass.name.equals("VariableID")) {
			var VariableID prueba = new VariableIDImpl
			prueba = op as VariableID
			prueba.generate
		}
		else if (op.eClass.name.equals("ValorRegistro")) {
			var ValorRegistro prueba = new ValorRegistroImpl
			prueba = op as ValorRegistro
			prueba.generate
		}
		else if (op.eClass.name.equals("ValorVector")) {
			var ValorVector prueba = new ValorVectorImpl
			prueba = op as ValorVector
			prueba.generate
		}
		else if (op.eClass.name.equals("ValorMatriz")) {
			var ValorMatriz prueba = new ValorMatrizImpl
			prueba = op as ValorMatriz
			prueba.generate
		}
		else if (op.eClass.name.equals("LlamadaFuncion")) {
			var LlamadaFuncion prueba = new LlamadaFuncionImpl
			prueba = op as LlamadaFuncion
			prueba.generate(false)
		}
		else if (op.eClass.name.equals("Internas")) {
			var Internas prueba = new InternasImpl
			prueba = op as Internas
			prueba.generate
		}
		else if (op.eClass.name.equals("Suma")) {
			var Suma prueba = new SumaImpl
			prueba = op as Suma
			prueba.generate
		}
		else if (op.eClass.name.equals("Resta")) {
			var Resta prueba = new RestaImpl
			prueba = op as Resta
			prueba.generate
		}
		else if (op.eClass.name.equals("Multiplicacion")) {
			var Multiplicacion prueba = new MultiplicacionImpl
			prueba = op as Multiplicacion
			prueba.generate
		}
		else if (op.eClass.name.equals("Division")) {
			var Division prueba = new DivisionImpl
			prueba = op as Division
			prueba.generate
		}
		else if (op.eClass.name.equals("Div")) {
			var Div prueba = new DivImpl
			prueba = op as Div
			prueba.generate
		}
		else if(op.eClass.name.equals("Mod")) {
			var Mod prueba = new ModImpl
			prueba = op as Mod
			prueba.generate
		}
		else if(op.eClass.name.equals("OperacionParentesis")) {
			var OperacionParentesis prueba = new OperacionParentesisImpl
			prueba = op as OperacionParentesis
			prueba.generate
		}
		else if (op.eClass.name.equals("Or")) {
			var Or prueba = new OrImpl
			prueba = op as Or
			prueba.generate
		}
		else if (op.eClass.name.equals("And")) {
			var And prueba = new AndImpl
			prueba = op as And
			prueba.generate
		}
		else if (op.eClass.name.equals("Comparacion")) {
			var Comparacion prueba = new ComparacionImpl
			prueba = op as Comparacion
			prueba.generate
		}
		else if (op.eClass.name.equals("Igualdad")) {
			var Igualdad prueba = new IgualdadImpl
			prueba = op as Igualdad
			prueba.generate
		}
		else if (op.eClass.name.equals("OperacionCompleta")) {
			var OperacionCompleta prueba = new OperacionCompletaImpl
			prueba = op as OperacionCompleta
			prueba.generate
		}
	}
	
	override generate(Suma mySuma) {
		return mySuma.left.generate + " " + mySuma.signo_op + " " + mySuma.getNegacionesFinales().generate + " " +  mySuma.right.generate;
	}
	
	def generate(Suma mySuma, List<String> punteros) {
		return mySuma.left.generate(punteros) + " " + mySuma.signo_op + " " + mySuma.getNegacionesFinales().generate + " " + mySuma.right.generate(punteros);
	}
	
	override generate(Resta myResta) {
		return myResta.left.generate + " " + myResta.signo_op + " " + myResta.getNegacionesFinales().generate + " " + myResta.right.generate;
	}
	
	def generate(Resta myResta, List<String> punteros) {
		return myResta.left.generate(punteros) + " " + myResta.signo_op + " " + myResta.getNegacionesFinales().generate + " " + myResta.right.generate(punteros);
	}
	
	override generate(Multiplicacion myMulti) {
		return myMulti.left.generate + " " + myMulti.signo_op + " " + myMulti.getNegacionesFinales().generate + " " + myMulti.right.generate;
	}
	
	def generate(Multiplicacion myMulti, List<String> punteros) {
		return myMulti.left.generate(punteros) + " " + myMulti.signo_op + " " + myMulti.getNegacionesFinales().generate + " " + myMulti.right.generate(punteros);
	}
	
	override generate(Division myDivi) {
		return myDivi.left.generate + " " + myDivi.signo_op + " " + myDivi.getNegacionesFinales().generate + " " + myDivi.right.generate;
	}
	
	def generate(OperacionParentesis op) {
		return op.negacionesIniciales.generate + " " + "(" + op.negacionesFinales.generate + op.valor_operacion.generate + ")"
	}
	
	def generate(OperacionParentesis op, EList<String> punteros) {
		return "(" + op.getNegacionesFinales().generate + " " + op.valor_operacion.generate(punteros) + ")"
	}
	
	def generate(Div myDivi) {
		return myDivi.left.generate + " / " + myDivi.getNegacionesFinales().generate + " " + myDivi.right.generate;
	}
	
	def generate(Div myDivi, List<String> punteros) {
		return myDivi.left.generate(punteros) + " / " + myDivi.getNegacionesFinales().generate + " " + myDivi.right.generate(punteros);
	}
	
	def generate(Mod myMod) {
		return myMod.left.generate + " " + "%" + " " + myMod.getNegacionesFinales().generate + " " + myMod.right.generate;
	}
	
	def generate(Mod myMod, List<String> punteros) {
		return myMod.left.generate(punteros) + " " + "%" + " " + myMod.getNegacionesFinales().generate + " " + myMod.right.generate(punteros);
	}
	
	def generate(Division myDivi, List<String> punteros) {
		return myDivi.left.generate(punteros) + " " + myDivi.signo_op + " " + myDivi.getNegacionesFinales().generate + " " + myDivi.right.generate(punteros);
	}
	
	override generate(Or myOr) {
		return myOr.left.generate + " " + "||" + " " + myOr.getNegacionesFinales().generate + " " + myOr.right.generate;
	}
	
	def generate(Or myOr, List<String> punteros) {
		return myOr.left.generate(punteros) + " " + "||" + " " + myOr.getNegacionesFinales().generate + " " + myOr.right.generate(punteros);
	}
	
	override generate(And myAnd) {
		return myAnd.left.generate + " " + "&&" + " " + myAnd.getNegacionesFinales().generate + " " + myAnd.right.generate;
	}
	
	def generate(And myAnd, List<String> punteros) {
		return myAnd.left.generate(punteros) + " " + "&&" + " " + myAnd.getNegacionesFinales().generate + " " + myAnd.right.generate(punteros);
	}
	
	override generate(Comparacion myComparacion) {
		return myComparacion.left.generate + " " + myComparacion.signo_op + " " + myComparacion.getNegacionesFinales().generate + " " + myComparacion.right.generate;
	}
	
	def generate(Comparacion myComparacion, List<String> punteros) {
		return myComparacion.left.generate(punteros) + " " + myComparacion.signo_op + " " + myComparacion.getNegacionesFinales().generate + " " + myComparacion.right.generate(punteros);
	}
	
	override generate(Igualdad myIgualdad) {
		if(myIgualdad.signo_op.literal.equals("=")) {
			return myIgualdad.left.generate + " " + "==" + " " + myIgualdad.getNegacionesFinales().generate + " " + myIgualdad.right.generate;
		}
		else {
			return myIgualdad.left.generate + " " + "!=" + " " + myIgualdad.getNegacionesFinales().generate + " " + myIgualdad.right.generate;
		}
	}
	
	def generate(Igualdad myIgualdad, List<String> punteros) {
		if(myIgualdad.signo_op.literal.equals("=")) {
			return myIgualdad.left.generate(punteros) + " " + "==" + " " + myIgualdad.getNegacionesFinales().generate + " " + myIgualdad.right.generate(punteros);
		}
		else {
			return myIgualdad.left.generate(punteros) + " " + "!=" + " " + myIgualdad.getNegacionesFinales().generate + " " + myIgualdad.right.generate(punteros);
		}
	}
	
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
	
	def generate(OperacionCompleta operacion) {
		return operacion.negacionesIniciales.generate + " " + operacion.valor_operacion.generate;
	}
	
	def generateSiPunteros(Si mySi, List<String> punteros) '''
		if(«mySi.valor.generate»){
			«FOR sent:mySi.sentencias»
				«sent.generatePunteros(punteros)»
			«ENDFOR»
			«IF mySi.devuelve != null» 
			«mySi.devuelve.generate(punteros)»
			«ENDIF»	
		}
		«IF mySi.sino != null» 
			«mySi.sino.generateSinoPunteros(punteros)»
		«ENDIF»
	'''

	override generate(Si mySi) '''
		if(«mySi.valor.generate»){
			«FOR sent:mySi.sentencias»
				«sent.generate»
			«ENDFOR»
			«IF mySi.devuelve != null» 
			«mySi.devuelve.generate»
			«ENDIF»	
		}
		«IF mySi.sino != null» 
			«mySi.sino.generate»
		«ENDIF»
	'''
	
	def generateCasoPunteros(Caso myCaso, List<String> punteros) '''
		case «myCaso.operador.generate»:
			«FOR sent:myCaso.sentencias»
				«sent.generatePunteros(punteros)»
			«ENDFOR»
			«IF myCaso.devuelve != null» 
			«myCaso.devuelve.generate(punteros)»
			«ENDIF»
		break;
	'''

	override generate(Caso myCaso) '''
		case «myCaso.operador.generate»:
			«FOR sent:myCaso.sentencias»
				«sent.generate»
			«ENDFOR»
			«IF myCaso.devuelve != null» 
			«myCaso.devuelve.generate»
			«ENDIF»
		break;
	'''
	
	def generateSegunPunteros(segun mySegun, List<String> punteros) '''
		switch(«mySegun.valor.generate»){
			«FOR caso:mySegun.caso»
				«caso.generate» 
			«ENDFOR»
			default:
				«FOR sent:mySegun.sentencias»
					«sent.generatePunteros(punteros)»
				«ENDFOR»
				«IF mySegun.devuelve != null» 
				«mySegun.devuelve.generate(punteros)»
				«ENDIF»
			break;
		}
	'''

	override generate(segun mySegun) '''
		switch(«mySegun.valor.generate»){
			«FOR caso:mySegun.caso»
				«caso.generate» 
			«ENDFOR»
			default:
				«FOR sent:mySegun.sentencias»
					«sent.generate»
				«ENDFOR»
				«IF mySegun.devuelve != null» 
				«mySegun.devuelve.generate»
				«ENDIF»
			break;
		}
	'''

	override generate(Devolver myDevuelve) '''
		return «myDevuelve.devuelve.generate»;
	'''
	
	def generate(Devolver myDevuelve, List<String> punteros) '''
		return «myDevuelve.devuelve.generate(punteros)»;
	'''
	
	def generateSinoPunteros(Sino mySino, List<String> punteros) '''
		else{
			«FOR sent:mySino.sentencias»	
				«sent.generatePunteros(punteros)»
			«ENDFOR»
			«IF mySino.devuelve != null» 
			«mySino.devuelve.generate(punteros)»
			«ENDIF»	
		}
	'''

	override generate(Sino mySino) '''
		else{
			«FOR sent:mySino.sentencias»	
				«sent.generate»
			«ENDFOR»
			«IF mySino.devuelve != null» 
			«mySino.devuelve.generate»
			«ENDIF»	
		}
	'''
	
	def generateMientrasPunteros(mientras m, List<String> punteros) '''
		while(«m.valor.generate»){
			«FOR sent:m.sentencias»
				«sent.generatePunteros(punteros)»
			«ENDFOR»
		}
	'''

	override generate(mientras m) '''
		while(«m.valor.generate»){
			«FOR sent:m.sentencias»
				«sent.generate»
			«ENDFOR»
		}
	'''
	
	def generateDesdePunteros(desde d, List<String> punteros) '''
		for(«d.asignacion.generate» «d.asignacion.valor_asignacion.toString» <= «d.valor.generate»; «d.asignacion.valor_asignacion.toString»++){
			«FOR sent:d.sentencias»
				«sent.generatePunteros(punteros)»
			«ENDFOR»
		}
	'''
	
	override generate(desde d) '''
		for(«d.asignacion.generate» «d.asignacion.valor_asignacion.toString» <= «d.valor.generate»; «d.asignacion.valor_asignacion.toString»++){
			«FOR sent:d.sentencias»
				«sent.generate»
			«ENDFOR»
		}
	'''
	
	def generateRepetirPunteros(repetir r, List<String> punteros) '''
		do{
			«FOR sent:r.sentencias»
				«sent.generatePunteros(punteros)»
			«ENDFOR»
		}while(!(«r.valor.generate»));
	'''

	override generate(repetir r) '''
		do{
			«FOR sent:r.sentencias»
				«sent.generate»
			«ENDFOR»
		}while(!(«r.valor.generate»));
	'''
}
