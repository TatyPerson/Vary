package vary.pseudocodigo.dsl.c.generator.cpp

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.generator.IFileSystemAccess
import java.util.ArrayList
import diagramapseudocodigo.Codigo
import diagramapseudocodigo.Declaracion
import diagramapseudocodigo.DeclaracionBasica
import diagramapseudocodigo.DeclaracionDefinida
import diagramapseudocodigo.Subproceso
import diagramapseudocodigo.Sentencia
import diagramapseudocodigo.LlamadaFuncion
import diagramapseudocodigo.Leer
import diagramapseudocodigo.Escribir
import diagramapseudocodigo.Funcion
import diagramapseudocodigo.Procedimiento
import org.eclipse.emf.common.util.EList
import diagramapseudocodigo.Operacion
import diagramapseudocodigo.FuncionInterna
import java.io.IOException
import java.util.List
import vary.pseudocodigo.dsl.c.generator.util.ReadFileProperties
import vary.pseudocodigo.dsl.c.generator.util.ProjectLocationFolder
import diagramapseudocodigo.Algoritmo
import diagramapseudocodigo.Modulo
import diagramapseudocodigo.CabeceraProcedimiento
import diagramapseudocodigo.CabeceraFuncion
import diagramapseudocodigo.CabeceraSubproceso
import vary.pseudocodigo.dsl.c.validation.messages.ReadMessagesValidatorInterface
import vary.pseudocodigo.dsl.c.generator.VaryGrammarAbstractGeneratorCCPP

/**
 * Generates code from your model files on save.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#TutorialCodeGeneration
 */
class VaryGrammarGeneratorCPP extends VaryGrammarAbstractGeneratorCCPP implements IGenerator {
	
	static ReadFileProperties readerFileProperties = new ReadFileProperties();
	
	new(ReadMessagesValidatorInterface readerMessages) {
		VaryGrammarAbstractGeneratorCCPP.readerMessages = readerMessages;
	}
	
	/* 1) /* -------------------------------------------------------------------------------------------------------------------- */
	/**
	 * Función principal encargada de generar los ficheros resultantes de la transformación.
	 * @param resource, sourceFile
	 */
	override void doGenerate(Resource resource, IFileSystemAccess sourceFile) {
		
		for (elemento : resource.allContents.toIterable.filter(typeof(Codigo))) {
			
			ProjectLocationFolder.setResource(resource);
			//System.out.println("La uri cogida es:"+ProjectLocationFolder.getPath())
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
			
			//Recogemos el tipo de proyecto:
			var tipoProyecto = contenidoFichero.replaceAll("ficheroCabeceras=","");
			
			if(tipoProyecto == "false") {
				cabeceras = false;
				if(elemento instanceof Algoritmo) {
					sourceFile.generateFile(elemento.getNombre + ".cpp", elemento.generate)	
				} else {
					sourceFile.generateFile(elemento.getNombre +".cpp", elemento.generate)
					sourceFile.generateFile(elemento.getNombre + ".h", elemento.generateCabeceras)
				}
			}
			else {
				cabeceras = true;
				sourceFile.generateFile(elemento.getNombre +".cpp", elemento.generate)
				sourceFile.generateFile(elemento.getNombre + ".h", elemento.generateCabeceras)
			}
		}
	}
	
	/*
	 * Función auxiliar de doGenerate para generar los respectivos ficheros de cabecera (.h) - Modulo.
	 */
	 override generateCabeceras(Modulo modulo) {
		var procedimientosUsados = new ArrayList<Procedimiento>();
		var funcionesUsadas = new ArrayList<Funcion>();
	
	'''
		#ifndef «modulo.nombre.toUpperCase»_H
		#define «modulo.nombre.toUpperCase»_H
		
		«FOR moduloRef:modulo.importaciones»
		#include "«moduloRef.nombre».h"
		«ENDFOR»
		
		using namespace std;
		
		«FOR constante:modulo.implementacion.constantes»
			«IF modulo.exporta_constantes.contains(constante.variable.nombre)»
		«constante.generate»
			«ENDIF»
		«ENDFOR»
		
		«FOR complejo:modulo.implementacion.complejos»
		«complejo.generate»
		«ENDFOR»
		
		«var variablesPublicas = new ArrayList<String>()»
		class  «modulo.nombre» {
			
			public:
				//Variables a exportar
				«FOR declaracion:modulo.exporta_globales»
					«variablesPublicas.addVariable(declaracion)»
				«declaracion.generate»
				«ENDFOR»
				
				//Métodos (funciones) a exportar
				«FOR exportaCabecera:modulo.exporta_subprocesos»
					«IF exportaCabecera.eClass.name.equals("CabeceraProcedimiento")»
						«var cabecera = exportaCabecera as CabeceraProcedimiento»
						«FOR subproceso:modulo.implementacion.subprocesos»
							«IF subproceso.eClass.name.equals("Procedimiento")»
								«var procedimiento = subproceso as Procedimiento»
								«IF	cabecera.nombre.equals(procedimiento.nombre) && procedimiento.parametros.size == cabecera.parametros.size»
				«subproceso.generateCabeceras»
								«procedimiento.addProcedimiento(procedimientosUsados)»
								«ENDIF»
							«ENDIF»
						«ENDFOR»
					«ENDIF»
					«IF exportaCabecera.eClass.name.equals("CabeceraFuncion")»
						«var cabecera = exportaCabecera as CabeceraFuncion»
						«FOR subproceso:modulo.implementacion.subprocesos»
							«IF subproceso.eClass.name.equals("Funcion")»
								«var funcion = subproceso as Funcion»
								«IF	cabecera.nombre.equals(funcion.nombre) && funcion.parametros.size == cabecera.parametros.size»
				«subproceso.generateCabeceras»
									«funcion.addFuncion(funcionesUsadas)»
								«ENDIF»
							«ENDIF»
						«ENDFOR»
					«ENDIF»
				«ENDFOR»
				
			private:
				//Variables privadas
				«FOR variable:modulo.implementacion.globales»
				«variable.generate»
				«ENDFOR»
				
				
				//Métodos (funciones) privadas de la clase
				«FOR subproceso:modulo.implementacion.subprocesos»
					«IF subproceso.eClass.name.equals("Procedimiento")»
						«var procedimiento = subproceso as Procedimiento»
						«IF !procedimientosUsados.contains(procedimiento)»
				«subproceso.generateCabecerasStatic»
						«ENDIF»
					«ENDIF»
					«IF subproceso.eClass.name.equals("Funcion")»
						«var funcion = subproceso as Funcion»
						«IF !funcionesUsadas.contains(funcion)»
				«subproceso.generateCabecerasStatic»
						«ENDIF»
					«ENDIF»
				«ENDFOR»
		};
		
		#endif /* «modulo.nombre.toUpperCase»_H */
	'''
	}
	
	/*
	 * Función auxiliar de generateCabeceras(Modulo) que se encarga de registrar las variables ya utilizadas.
	 */
	def void addVariable(List<String> variablesPublicas, Declaracion declaracion) {
		if(declaracion instanceof DeclaracionBasica) {
			var declaracionBasica = declaracion as DeclaracionBasica
			for(variable: declaracionBasica.variables) {
				variablesPublicas.add(variable.nombre)
			}
			
		} else {
			var declaracionDefinida = declaracion as DeclaracionDefinida
			for(variable: declaracionDefinida.variables) {
				variablesPublicas.add(variable.nombre)
			}
		}
	}
	
	/*
	 * Función auxiliar de doGenerate para generar los respectivos ficheros de cabecera (.h) - Algoritmo.
	 */
	override generateCabeceras(Algoritmo algoritmo) '''
		
		#ifndef «algoritmo.nombre.toUpperCase»_H
		#define «algoritmo.nombre.toUpperCase»_H
		
		using namespace std;
		
		«FOR moduloRef:algoritmo.importaciones»
		#include "«moduloRef.nombre».h"
		«ENDFOR»
		
		«FOR constante:algoritmo.constantes»
		«constante.generate»
		«ENDFOR»
		«FOR compleja:algoritmo.complejos»
		«compleja.generate»
		«ENDFOR»
		«FOR funcion:algoritmo.subprocesos»
		«funcion.generateCabeceras»
		«ENDFOR»
		
		#endif /* «algoritmo.nombre.toUpperCase»_H */
	'''
	
	/*
	 * Función auxiliar de generateCabeceras(Modulo) para generar las cabeceras de las funciones con el prefijo static (.h).
	 */
	def generateCabecerasStatic(Subproceso subproceso) {
		if(subproceso.eClass.name.equals("Funcion")) {
			var Funcion funcion = subproceso as Funcion
			return generateCabecerasAux(funcion.parametros, "static " + funcion.tipo.tipoVariable + " " + funcion.nombre);
		} else if(subproceso.eClass.name.equals("Procedimiento")) {
			var Procedimiento procedimiento = subproceso as Procedimiento
			return generateCabecerasAux(procedimiento.parametros, "static void" + " " + procedimiento.nombre);
		}
	}
	
	/* 3) /* -------------------------------------------------------------------------------------------------------------------- */
	/**
	 * Función encargada de generar la entidad Algoritmo.
	 * @param algoritmo
	 */
	 override generate(Algoritmo algoritmo) {
	
		algoritmoActual = algoritmo;
		registrarInformacion(algoritmo.complejos, algoritmo.subprocesos, algoritmo.inicio.declaraciones);
	
	'''
		#include <iostream>
		#include <string>
		#include <cmath>
		«IF cabeceras»
		#include "«algoritmo.nombre».h"		
		«ENDIF»
		
		«IF !cabeceras»
		«FOR moduloRef:algoritmo.importaciones»
		#include "«moduloRef.nombre».h"
		«ENDFOR»
		using namespace std;
		«ENDIF»
		
		//Instanciamos los modulos que vamos a usar
		«FOR moduloRef:algoritmo.importaciones»
		«moduloRef.nombre» ref«moduloRef.nombre» = «moduloRef.nombre»();
		«ENDFOR»
		
		«IF !cabeceras»
			«FOR constante:algoritmo.constantes»
		«constante.generate»
			«ENDFOR»
			«FOR complejo:algoritmo.complejos»
		«complejo.generate»
			«ENDFOR»
		«ENDIF»
		«FOR variable:algoritmo.globales»
		«variable.generate»
		«ENDFOR»
		
		«FOR funcion:algoritmo.subprocesos»
		«funcion.generate»
		«ENDFOR»
		«algoritmo.inicio.generate»
	'''
	}
	
	/* 4) /* -------------------------------------------------------------------------------------------------------------------- */
	/**
	 * Función encargada de generar la entidad Modulo.
	 * @param modulo
	 */
	 override generate(Modulo modulo) {
		
		moduloActual = modulo;
		registrarInformacion(modulo.implementacion.complejos, modulo.implementacion.subprocesos, null);
	
		var procedimientosUsados = new ArrayList<Procedimiento>();
		var funcionesUsadas = new ArrayList<Funcion>();
		
		'''
		#include <iostream>
		#include <string>
		#include <cmath>
		#include "«modulo.nombre».h"
		
		using namespace std;
		
		//Instanciamos los modulos que vamos a usar
		«FOR moduloRef:modulo.importaciones»
		«moduloRef.nombre» ref«moduloRef.nombre» = «moduloRef.nombre»();
		«ENDFOR»
		
		«FOR constante:modulo.implementacion.constantes»
			«IF !modulo.exporta_constantes.contains(constante.variable.nombre)»
		«constante.generate»
			«ENDIF»
		«ENDFOR»
		
		«FOR complejo:modulo.implementacion.complejos»
		«complejo.generate»
		«ENDFOR»
		
		//Metodos publicos
		
		«FOR exportaCabecera:modulo.exporta_subprocesos»
			«FOR subproceso:modulo.implementacion.subprocesos»
				«IF subproceso.eClass.name.equals("Procedimiento")»
					«var procedimiento = subproceso as Procedimiento»
					«IF (modulo.exporta_subprocesos.contains(procedimiento.nombre)) && procedimiento.parametros.size == exportaCabecera.parametros.size»
		«procedimiento.generate(modulo.nombre)»
						«procedimiento.addProcedimiento(procedimientosUsados)»
					«ENDIF»
				«ENDIF»
				«IF subproceso.eClass.name.equals("Funcion")»
					«var funcion = subproceso as Funcion»
					«IF (modulo.exporta_subprocesos.contains(funcion.nombre)) && funcion.parametros.size == exportaCabecera.parametros.size»
		«funcion.generate(modulo.nombre)»
						«funcion.addFuncion(funcionesUsadas)»
					«ENDIF»
				«ENDIF»
			«ENDFOR»
		«ENDFOR»
		
		//Metodos privados
		
		«FOR subproceso:modulo.implementacion.subprocesos»
			«IF subproceso.eClass.name.equals("Procedimiento")»
				«var procedimiento = subproceso as Procedimiento»
				«IF !procedimientosUsados.contains(procedimiento)»
		«procedimiento.generate(modulo.nombre)»
				«ENDIF»
			«ENDIF»
			«IF subproceso.eClass.name.equals("Funcion")»
				«var funcion = subproceso as Funcion»
				«IF !funcionesUsadas.contains(funcion)»
		«funcion.generate(modulo.nombre)»
				«ENDIF»
			«ENDIF»
		«ENDFOR»
		
		'''
	}
	
	/*
	 * Función auxiliar de generate(Modulo) que se encarga de registrar los procedimientos ya utilizados.
	 */
	def void addProcedimiento(Procedimiento procedimiento, List<Procedimiento> procedimientos) {
		procedimientos.add(procedimiento)
	}
	
	/*
	 * Función auxiliar de generate(Modulo) que se encarga de registrar las funciones ya registradas.
	 */
	def void addFuncion(Funcion funcion, List<Funcion> funciones) {
		funciones.add(funcion)
	}
	
	/*
	 * Función auxiliar de generate(TipoExistente) que se encarga de obtener los tipos de datos correspondientes en C.
	 */	
	override getTipoVariable(String tipo) {
		if(tipo.equals(readerMessages.getBundle().getString("TIPO_ENTERO"))) return "int";
		if(tipo.equals(readerMessages.getBundle().getString("TIPO_CARACTER"))) return "char";
		if(tipo.equals(readerMessages.getBundle().getString("TIPO_REAL"))) return "float";
		if(tipo.equals(readerMessages.getBundle().getString("TIPO_LOGICO"))) return "bool";
		if(tipo.equals(readerMessages.getBundle().getString("TIPO_CADENA"))) return "string";
	}
	
	/*
	 * Función auxiliar de generate(Subproceso) que se encarga de generar la entidad Funcion para uso en Modulo (static).
	 */
	def generate(Funcion funcion, String nombreModulo) {
		return generateSubprocesoAux(funcion.tipo.getTipoVariable + " " + nombreModulo + "::", funcion.nombre, funcion.parametros, funcion.declaraciones, funcion.sentencias, funcion.devuelve);
	}
	
	/*
	 * Función auxiliar de generate(Subproceso) que se encarga de generar la entidad Procedimiento para uso en Modulo (static).
	 */
	def generate(Procedimiento procedimiento, String nombreModulo) {
		return generateSubprocesoAux("void " + nombreModulo + "::", procedimiento.nombre, procedimiento.parametros, procedimiento.declaraciones, procedimiento.sentencias, null);
	}
	
	/* 9) /* -------------------------------------------------------------------------------------------------------------------- */
	/**
	 * Función encargada de generar la entidad FuncionInterna.
	 * @param interna, sentencia
	 */
	 override generate(FuncionInterna interna, boolean sentencia, List<String> punteros) {
		if (interna.nombre.equals(readerMessages.getBundle().getString("INTERNAS_COS") + '(')) {
			'''cos(«interna.parametros.get(0).generate(punteros)»)«IF sentencia»;«ENDIF»'''
		} else if (interna.nombre.equals(readerMessages.getBundle().getString("INTERNAS_SEN") + '(')) {
			'''sin(«interna.parametros.get(0).generate(punteros)»)«IF sentencia»;«ENDIF»'''
		} else if (interna.nombre.equals(readerMessages.getBundle().getString("INTERNAS_CUADRADO") + '(')) {
			'''pow(«interna.parametros.get(0).generate(punteros)»,«2.0»)«IF sentencia»;«ENDIF»'''
		} else if (interna.nombre.equals(readerMessages.getBundle().getString("INTERNAS_EXP") + '(')) {
			'''exp2(«interna.parametros.get(0).generate(punteros)»)«IF sentencia»;«ENDIF»'''
		} else if (interna.nombre.equals(readerMessages.getBundle().getString("INTERNAS_LN") + '(')) {
			'''log(«interna.parametros.get(0).generate(punteros)»)«IF sentencia»;«ENDIF»'''
		} else if (interna.nombre.equals(readerMessages.getBundle().getString("INTERNAS_LOG") + '(')) {
			'''log10(«interna.parametros.get(0).generate(punteros)»)«IF sentencia»;«ENDIF»'''
		} else if (interna.nombre.equals(readerMessages.getBundle().getString("INTERNAS_SQRT") + '(')) {
			'''sqrt(«interna.parametros.get(0).generate(punteros)»)«IF sentencia»;«ENDIF»'''
		} else if (interna.nombre.equals(readerMessages.getBundle().getString("INTERNAS_CONCATENA") + '(')) {
			'''«interna.parametros.get(0).generate(punteros)» = «interna.parametros.get(0).generate(punteros)» + «interna.parametros.get(1).generate(punteros)»«IF sentencia»;«ENDIF»'''
		} else if (interna.nombre.equals(readerMessages.getBundle().getString("INTERNAS_COPIAR") + '(')) {
			'''«interna.parametros.get(0).generate(punteros)» = «interna.parametros.get(1).generate(punteros)»«IF sentencia»;«ENDIF»'''
		} else if (interna.nombre.equals(readerMessages.getBundle().getString("INTERNAS_LONGITUD") + '(')) {
			'''strlen(«interna.parametros.get(0).generate(punteros)»)«IF sentencia»;«ENDIF»'''
		}
	}
	
	
	/* 25) /* -------------------------------------------------------------------------------------------------------------------- */
	/**
	 * Función encargada de generar la entidad LlamadaFuncion.
	 * @param llamadaFuncion, sentencia
	 */
	override generate(LlamadaFuncion llamadaFuncion, boolean a, List<String> punteros) {
		
		var nombreModulo = new String()
		
		if(algoritmoActual != null) {
			nombreModulo = getNombreModulo(llamadaFuncion.nombre, algoritmoActual.importaciones, llamadaFuncion.parametros.size);
		} else if(moduloActual != null) {
			nombreModulo = getNombreModulo(llamadaFuncion.nombre, moduloActual.importaciones, llamadaFuncion.parametros.size);
		}
		
		'''«IF !nombreModulo.isEmpty»
		ref«nombreModulo».«llamadaFuncion.nombre»«IF subprocesosConPunteros.get(llamadaFuncion.nombre).size() == 0»«llamadaFuncion.parametros.getParametros(llamadaFuncion.nombre, punteros)»«ELSE»«llamadaFuncion.parametros.getParametros(llamadaFuncion.nombre, punteros)»«ENDIF»)«IF a»;«ENDIF»
		«ELSE»
		«llamadaFuncion.nombre»«IF subprocesosConPunteros.get(llamadaFuncion.nombre).size() == 0»«llamadaFuncion.parametros.getParametros(llamadaFuncion.nombre, punteros)»«ELSE»«llamadaFuncion.parametros.getParametros(llamadaFuncion.nombre, punteros)»«ENDIF»)«IF a»;«ENDIF»«ENDIF»'''
	}
	
	/*
	 * Función auxiliar de generate(LlamadaFuncion) que se encarga de comprobar el nombre del Modulo al que pertenece la función (si lo tiene).
	 */
	def getNombreModulo(String nombreFuncion, List<Modulo> modulosImportados, int numeroParametros) {
		var nombreModulo = new String();
		
		for(Modulo modulo: modulosImportados) {
			for(CabeceraSubproceso cabecera: modulo.exporta_subprocesos) {
				if(cabecera instanceof CabeceraProcedimiento) {
					var cabeceraProcedimiento = cabecera as CabeceraProcedimiento
					if(nombreFuncion.equals(cabeceraProcedimiento.nombre) && numeroParametros == cabeceraProcedimiento.parametros.size) {
						nombreModulo = modulo.nombre
					}
				}
				else if(cabecera instanceof CabeceraFuncion) {
					var cabeceraFuncion = cabecera as CabeceraFuncion
					if(nombreFuncion.equals(cabeceraFuncion.nombre) && numeroParametros == cabeceraFuncion.parametros.size) {
						nombreModulo = modulo.nombre
					}
				}
			}	
		}
		return nombreModulo;
	}
	
	/* 28) /* -------------------------------------------------------------------------------------------------------------------- */
	/**
	 * Función encargada de generar la entidad Escribir.
	 * @param escribir, punteros
	 */
	 override generate(Escribir escribir, List<String> punteros, List<Sentencia> sentencias, List<Subproceso> subprocesos, boolean inicio) {
	 	if(inicio) {
	 		if(archivos.contains(escribir.operador.get(0).getTipoOperador(inicio, ""))) {
				var cadena = "";
				cadena = cadena + escribir.operador.get(0).generate(punteros) + ", \"";
				for(operador: escribir.operador) {
					if(escribir.operador.indexOf(operador) != 0 && !operador.eClass.name.equals("CadenaCaracteres") && !archivos.contains(escribir.operador.get(0).getTipoOperador(inicio, "")) || escribir.operador.indexOf(operador) != 0) {
						var tipo = operador.getTipoOperador(inicio, "");
						if(tipo.equals(readerMessages.getBundle().getString("TIPO_ENTERO")) || operador.eClass.name.equals("Entero")) {
							if(escribir.operador.indexOf(operador) == escribir.operador.size - 1) {
								cadena = cadena + " %i \\n \"";
							}
							else {
								cadena = cadena + " %i";
							}
						}
						else if(tipo.equals(readerMessages.getBundle().getString("TIPO_CARACTER")) || operador.eClass.name.equals("Caracter")) {
							if(escribir.operador.indexOf(operador) == escribir.operador.size - 1) {
								cadena = cadena + " %c \\n \"";
							}
							else {
								cadena = cadena + " %c";
							}
						}
						else if(tipo.equals(readerMessages.getBundle().getString("TIPO_CADENA")) || operador.eClass.name.equals("CadenaCaracteres")) {
							if(escribir.operador.indexOf(operador) == escribir.operador.size - 1) {
								cadena = cadena + " %s \\n \"";
							}
							else {
								cadena = cadena + " %s";
							}
						}
						else if(tipo.equals(readerMessages.getBundle().getString("TIPO_REAL")) || operador.eClass.name.equals("Real")) {
							if(escribir.operador.indexOf(operador) == escribir.operador.size - 1) {
								cadena = cadena + " %f \\n \"";
							}
							else {
								cadena = cadena + " %f";
							}
						}
						else if(vectoresMatrices.containsKey(tipo)) {
							var tipoAux = vectoresMatrices.get(tipo);
							if(tipoAux.equals(readerMessages.getBundle().getString("TIPO_ENTERO")) || operador.eClass.name.equals("Entero")) {
								if(escribir.operador.indexOf(operador) == escribir.operador.size - 1) {
									cadena = cadena + " %i \\n \"";
								}
								else {
									cadena = cadena + " %i";
								}
							}
							else if(tipoAux.equals(readerMessages.getBundle().getString("TIPO_CADENA")) || tipoAux.equals(readerMessages.getBundle().getString("TIPO_CARACTER"))) {
								if(escribir.operador.indexOf(operador) == escribir.operador.size - 1) {
									cadena = cadena + " %s \\n \"";
								}
								else {
									cadena = cadena + " %s";
								}
							}
							else if(tipoAux.equals(readerMessages.getBundle().getString("TIPO_REAL"))) {
								if(escribir.operador.indexOf(operador) == escribir.operador.size - 1) {
									cadena = cadena + " %f \\n \"";
								}	
								else {
									cadena = cadena + " %f";
								}
							}
						}
					}
				}
				if(escribir.operador.size > 1 || (escribir.operador.size == 1 && !escribir.operador.get(0).eClass.name.equals("CadenaCaracteres"))) {
					cadena = cadena + ", " + escribir.operador.getOperadoresFormatoC(true, punteros, inicio, "");
					return '''fprintf(«cadena»);'''
				}
				else {
					return '''fprintf(«cadena»);'''	
				}
			} else {
				return "cout" + escribir.operador.getOperadoresFormatoCpp(punteros) + " << endl;"	
			}
	 	} else {
	 		for(Subproceso subproceso: subprocesos) {
	 			if(archivos.contains(escribir.operador.get(0).getTipoOperador(inicio, subproceso.nombre))) {
	 				var cadena = "";
					cadena = cadena + escribir.operador.get(0).generate(punteros) + ", \"";
					for(operador: escribir.operador) {
						if(escribir.operador.indexOf(operador) != 0 && !operador.eClass.name.equals("CadenaCaracteres") && !archivos.contains(escribir.operador.get(0).getTipoOperador(inicio, "")) || escribir.operador.indexOf(operador) != 0) {
							var tipo = operador.getTipoOperador(inicio, subproceso.nombre);
							if(tipo.equals(readerMessages.getBundle().getString("TIPO_ENTERO")) || operador.eClass.name.equals("Entero")) {
								if(escribir.operador.indexOf(operador) == escribir.operador.size - 1) {
									cadena = cadena + " %i \\n \"";
								}
								else {
									cadena = cadena + " %i";
								}
							}
							else if(tipo.equals(readerMessages.getBundle().getString("TIPO_CARACTER")) || operador.eClass.name.equals("Caracter")) {
								if(escribir.operador.indexOf(operador) == escribir.operador.size - 1) {
									cadena = cadena + " %c \\n \"";
								}
								else {
									cadena = cadena + " %c";
								}
							}
							else if(tipo.equals(readerMessages.getBundle().getString("TIPO_CADENA")) || operador.eClass.name.equals("CadenaCaracteres")) {
								if(escribir.operador.indexOf(operador) == escribir.operador.size - 1) {
									cadena = cadena + " %s \\n \"";
								}
								else {
									cadena = cadena + " %s";
								}
							}
							else if(tipo.equals(readerMessages.getBundle().getString("TIPO_REAL")) || operador.eClass.name.equals("Real")) {
								if(escribir.operador.indexOf(operador) == escribir.operador.size - 1) {
									cadena = cadena + " %f \\n \"";
								}
								else {
									cadena = cadena + " %f";
								}
							}
							else if(vectoresMatrices.containsKey(tipo)) {
								var tipoAux = vectoresMatrices.get(tipo);
								if(tipoAux.equals(readerMessages.getBundle().getString("TIPO_ENTERO")) || operador.eClass.name.equals("Entero")) {
									if(escribir.operador.indexOf(operador) == escribir.operador.size - 1) {
										cadena = cadena + " %i \\n \"";
									}
									else {
										cadena = cadena + " %i";
									}
								}
								else if(tipoAux.equals(readerMessages.getBundle().getString("TIPO_CADENA")) || tipoAux.equals(readerMessages.getBundle().getString("TIPO_CARACTER"))) {
									if(escribir.operador.indexOf(operador) == escribir.operador.size - 1) {
										cadena = cadena + " %s \\n \"";
									}
									else {
										cadena = cadena + " %s";
									}
								}
								else if(tipoAux.equals(readerMessages.getBundle().getString("TIPO_REAL"))) {
									if(escribir.operador.indexOf(operador) == escribir.operador.size - 1) {
										cadena = cadena + " %f \\n \"";
									}	
									else {
										cadena = cadena + " %f";
									}
								}
							}
						}
					}
					if(escribir.operador.size > 1 || (escribir.operador.size == 1 && !escribir.operador.get(0).eClass.name.equals("CadenaCaracteres"))) {
						cadena = cadena + ", " + escribir.operador.getOperadoresFormatoC(true, punteros, inicio, subproceso.nombre);
						return '''fprintf(«cadena»);'''
					}
					else {
						return '''fprintf(«cadena»);'''	
					}
	 			} else {
	 				return "cout" + escribir.operador.getOperadoresFormatoCpp(punteros) + " << endl;"	
	 			}
	 		}
	 	}
	}
	 
	
	/*
	 * Función auxiliar de generate(Escribir) que se encarga de generar los operadores utilizados en la función Escribir (formato C).
	 */
	def getOperadoresFormatoC(EList<Operacion> operaciones, boolean saltarPrimero, List<String> punteros, boolean inicio, String nombreActual) {
		var descripcionOperadores = "";
		for (operacion : operaciones) {
			if((operaciones.indexOf(operacion) < operaciones.size - 1 && !saltarPrimero) || 
				(operaciones.indexOf(operacion) < operaciones.size - 1 && saltarPrimero && operaciones.indexOf(operacion) != 0)) {
				if(operacion.getTipoOperador(inicio, nombreActual).equals(readerMessages.getBundle().getString("TIPO_CADENA")) && !operacion.generate(punteros).toString.contains("\"")) {
					descripcionOperadores = descripcionOperadores + operacion.generate(punteros) + ".c_str() , ";
				} else {
					descripcionOperadores = descripcionOperadores + operacion.generate(punteros) + " , ";	
				}
			} else if(operaciones.indexOf(operacion) != 0 || (operaciones.size == 1 && !saltarPrimero)) {
				if(operacion.getTipoOperador(inicio, nombreActual).equals(readerMessages.getBundle().getString("TIPO_CADENA")) && !operacion.generate(punteros).toString.contains("\"")) {
					descripcionOperadores = descripcionOperadores + operacion.generate(punteros) + ".c_str()";
				} else {
					descripcionOperadores = descripcionOperadores + operacion.generate(punteros);	
				}
			}
		}
		return descripcionOperadores;
	}
	
	/*
	 * Función auxiliar de generate(Escribir) que se encarga de generar los operadores utilizados en la función Escribir (formato C++).
	 */
	def getOperadoresFormatoCpp(EList<Operacion> operaciones, List<String> punteros) {
		var descripcionOperadores = "";
		for (operacion : operaciones) {
			descripcionOperadores = descripcionOperadores + " << " + operacion.generate(punteros);
		}
		return descripcionOperadores;
	}
	 
	 /* 29) /* -------------------------------------------------------------------------------------------------------------------- */
	/**
	 * Función encargada de generar la entidad Leer.
	 * @param leer, sentencias, subprocesos, algoritmo
	 */
	 override generate(Leer leer, List<Sentencia> sentencias, List<Subproceso> subprocesos, boolean inicio) {
	 	var tipo = new String();
	 	var descripcionLeer = new String();
	 	if(inicio) {
	 		tipo = leer.variable.get(0).getTipoOperador(inicio, "");
	 		if(archivos.contains(tipo)) {
	 			var variableArchivo = leer.variable.get(0).generate(null).toString;
	 			tipo = leer.variable.get(1).getTipoOperador(inicio, "");
				if(tipo.equals(readerMessages.getBundle().getString("TIPO_ENTERO"))) {
					if(descripcionLeer.isEmpty) {
						descripcionLeer = '''fscanf(«variableArchivo»,"%i", &«leer.variable.get(1).generate(null)»);'''
					} else {
						descripcionLeer = descripcionLeer + "\n";
						descripcionLeer = '''fscanf(«variableArchivo»,"%i", &«leer.variable.get(1).generate(null)»);'''
					}
				}
				else if(tipo.equals(readerMessages.getBundle().getString("TIPO_CARACTER"))) {
					if(descripcionLeer.isEmpty) {
						descripcionLeer = '''fscanf(«variableArchivo»,"%c", &«leer.variable.get(1).generate(null)»);'''
					} else {
						descripcionLeer = descripcionLeer + "\n";
						descripcionLeer = '''fscanf(«variableArchivo»,"%c", &«leer.variable.get(1).generate(null)»);'''
					}
				}
				else if(tipo.equals(readerMessages.getBundle().getString("TIPO_CADENA"))) {
					if(descripcionLeer.isEmpty) {
						descripcionLeer = '''fscanf(«variableArchivo»,"%s", &«leer.variable.get(1).generate(null)»);'''
					} else {
						descripcionLeer = descripcionLeer + "\n";
						descripcionLeer = '''fscanf(«variableArchivo»,"%s", &«leer.variable.get(1).generate(null)»);'''
					}
				}
				else if(tipo.equals(readerMessages.getBundle().getString("TIPO_REAL"))) {
					if(descripcionLeer.isEmpty) {
						descripcionLeer = '''fscanf(«variableArchivo»,"%f", &«leer.variable.get(1).generate(null)»);'''
					} else {
						descripcionLeer = descripcionLeer + "\n";
						descripcionLeer = '''fscanf(«variableArchivo»,"%f", &«leer.variable.get(1).generate(null)»);'''
					}
		 		}
		 		else if(vectoresMatrices.containsKey(tipo)) {
					var tipoAux = vectoresMatrices.get(tipo);
					if(tipoAux.equals(readerMessages.getBundle().getString("TIPO_ENTERO"))) {
						if(descripcionLeer.isEmpty) {			
							descripcionLeer = '''fscanf(«variableArchivo»,"%i", &«leer.variable.get(1).generate(null)»);'''
						} else {
							descripcionLeer = descripcionLeer + "\n";
							descripcionLeer = '''fscanf(«variableArchivo»,"%i", &«leer.variable.get(1).generate(null)»);'''
						}
					}
					else if(tipoAux.equals(readerMessages.getBundle().getString("TIPO_CADENA")) || tipoAux.equals(readerMessages.getBundle().getString("TIPO_CARACTER"))) {
						if(descripcionLeer.isEmpty) {
							descripcionLeer = '''fscanf(«variableArchivo»,"%s", &«leer.variable.get(1).generate(null)»);'''
						} else {
							descripcionLeer = descripcionLeer + "\n";
							descripcionLeer = '''fscanf(«variableArchivo»,"%s", &«leer.variable.get(1).generate(null)»);'''
						}
					}
					else if(tipoAux.equals(readerMessages.getBundle().getString("TIPO_REAL"))) {
						if(descripcionLeer.isEmpty) {
							descripcionLeer = '''fscanf(«variableArchivo»,"%f", &«leer.variable.get(1).generate(null)»);'''
						}
						else {
							descripcionLeer = descripcionLeer + "\n";
							descripcionLeer = '''fscanf(«variableArchivo»,"%f", &«leer.variable.get(1).generate(null)»);'''
						}
					}
				}
				return descripcionLeer;
			} else {
				for(operador: leer.variable) {
					descripcionLeer = descripcionLeer + "cin >> " + operador.generate(null) + ";" + "\n"
				}
				return descripcionLeer;	
			}
	 	} else {
	 		for(Subproceso subproceso: subprocesos) {
	 			tipo = leer.variable.get(0).getTipoOperador(inicio, subproceso.nombre);
		 		if(archivos.contains(tipo)) {
		 			var variableArchivo = leer.variable.get(0).generate(null).toString;
		 			tipo = leer.variable.get(1).getTipoOperador(inicio, subproceso.nombre);
					if(tipo.equals(readerMessages.getBundle().getString("TIPO_ENTERO"))) {
						if(descripcionLeer.isEmpty) {
							descripcionLeer = '''fscanf(«variableArchivo»,"%i", &«leer.variable.get(1).generate(null)»);'''
						} else {
							descripcionLeer = descripcionLeer + "\n";
							descripcionLeer = '''fscanf(«variableArchivo»,"%i", &«leer.variable.get(1).generate(null)»);'''
						}
					}
					else if(tipo.equals(readerMessages.getBundle().getString("TIPO_CARACTER"))) {
						if(descripcionLeer.isEmpty) {
							descripcionLeer = '''fscanf(«variableArchivo»,"%c", &«leer.variable.get(1).generate(null)»);'''
						} else {
							descripcionLeer = descripcionLeer + "\n";
							descripcionLeer = '''fscanf(«variableArchivo»,"%c", &«leer.variable.get(1).generate(null)»);'''
						}
					}
					else if(tipo.equals(readerMessages.getBundle().getString("TIPO_CADENA"))) {
						if(descripcionLeer.isEmpty) {
							descripcionLeer = '''fscanf(«variableArchivo»,"%s", &«leer.variable.get(1).generate(null)»);'''
						} else {
							descripcionLeer = descripcionLeer + "\n";
							descripcionLeer = '''fscanf(«variableArchivo»,"%s", &«leer.variable.get(1).generate(null)»);'''
						}
					}
					else if(tipo.equals(readerMessages.getBundle().getString("TIPO_REAL"))) {
						if(descripcionLeer.isEmpty) {
							descripcionLeer = '''fscanf(«variableArchivo»,"%f", &«leer.variable.get(1).generate(null)»);'''
						} else {
							descripcionLeer = descripcionLeer + "\n";
							descripcionLeer = '''fscanf(«variableArchivo»,"%f", &«leer.variable.get(1).generate(null)»);'''
						}
			 		}
			 		else if(vectoresMatrices.containsKey(tipo)) {
						var tipoAux = vectoresMatrices.get(tipo);
						if(tipoAux.equals(readerMessages.getBundle().getString("TIPO_ENTERO"))) {
							if(descripcionLeer.isEmpty) {			
								descripcionLeer = '''fscanf(«variableArchivo»,"%i", &«leer.variable.get(1).generate(null)»);'''
							} else {
								descripcionLeer = descripcionLeer + "\n";
								descripcionLeer = '''fscanf(«variableArchivo»,"%i", &«leer.variable.get(1).generate(null)»);'''
							}
						}
						else if(tipoAux.equals(readerMessages.getBundle().getString("TIPO_CADENA")) || tipoAux.equals(readerMessages.getBundle().getString("TIPO_CARACTER"))) {
							if(descripcionLeer.isEmpty) {
								descripcionLeer = '''fscanf(«variableArchivo»,"%s", &«leer.variable.get(1).generate(null)»);'''
							} else {
								descripcionLeer = descripcionLeer + "\n";
								descripcionLeer = '''fscanf(«variableArchivo»,"%s", &«leer.variable.get(1).generate(null)»);'''
							}
						}
						else if(tipoAux.equals(readerMessages.getBundle().getString("TIPO_REAL"))) {
							if(descripcionLeer.isEmpty) {
								descripcionLeer = '''fscanf(«variableArchivo»,"%f", &«leer.variable.get(1).generate(null)»);'''
							}
							else {
								descripcionLeer = descripcionLeer + "\n";
								descripcionLeer = '''fscanf(«variableArchivo»,"%f", &«leer.variable.get(1).generate(null)»);'''
							}
						}
					}
					return descripcionLeer;
				} else {
					for(operador: leer.variable) {
						descripcionLeer = descripcionLeer + "cin >> " + operador.generate(null) + ";" + "\n"
					}
					return descripcionLeer;	
				}
	 		}
	 	}
	}
}
