package vary.pseudocodigo.dsl.c.generator.c

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.generator.IFileSystemAccess
import diagramapseudocodigo.Codigo
import diagramapseudocodigo.Subproceso
import diagramapseudocodigo.Funcion
import diagramapseudocodigo.Procedimiento
import org.eclipse.emf.common.util.EList
import diagramapseudocodigo.Sentencia
import diagramapseudocodigo.LlamadaFuncion
import diagramapseudocodigo.Leer
import diagramapseudocodigo.Escribir
import diagramapseudocodigo.CadenaCaracteres
import diagramapseudocodigo.Operacion
import diagramapseudocodigo.FuncionInterna
import vary.pseudocodigo.dsl.c.generator.util.ReadFileProperties
import vary.pseudocodigo.dsl.c.generator.util.ProjectLocationFolder
import java.io.IOException
import java.util.List
import diagramapseudocodigo.Algoritmo
import diagramapseudocodigo.Modulo
import vary.pseudocodigo.dsl.c.validation.messages.ReadMessagesValidatorInterface
import vary.pseudocodigo.dsl.c.generator.VaryGrammarAbstractGeneratorCCPP

/**
 * Generates code from your model files on save.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#TutorialCodeGeneration
 */
class VaryGrammarGeneratorC extends VaryGrammarAbstractGeneratorCCPP implements IGenerator {
	
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
				}	else {
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
					sourceFile.generateFile(elemento.getNombre + ".c", elemento.generate)	
				} else {
					sourceFile.generateFile(elemento.getNombre +".c", elemento.generate)
					sourceFile.generateFile(elemento.getNombre + ".h", elemento.generateCabeceras)
				}
			} else {
				cabeceras = true;
				sourceFile.generateFile(elemento.getNombre +".c", elemento.generate)
				sourceFile.generateFile(elemento.getNombre + ".h", elemento.generateCabeceras)
			}
		}
	}
	
	/*
	 * Función auxiliar de doGenerate para generar los respectivos ficheros de cabecera (.h) - Modulo.
	 */
	override generateCabeceras(Modulo modulo) '''
	
		#ifndef «modulo.nombre.toUpperCase»_H
		#define «modulo.nombre.toUpperCase»_H
		
		«FOR moduloRef:modulo.importaciones»
			#include "«moduloRef.nombre».h"
		«ENDFOR»
		
		«FOR constante:modulo.implementacion.constantes»
			«IF modulo.exporta_constantes.contains(constante.variable.nombre)»
				«constante.generate»
			«ENDIF»
		«ENDFOR»
		
		«FOR complejo:modulo.implementacion.complejos»
			«complejo.generate»
		«ENDFOR»
		
		«FOR cabecera:modulo.exporta_subprocesos»
			«FOR subproceso:modulo.implementacion.subprocesos»
				«IF subproceso.eClass.name.equals("Procedimiento")»
					«var procedimiento = subproceso as Procedimiento»
					«IF (!modulo.exporta_subprocesos.contains(procedimiento.nombre)) && procedimiento.parametros.size == cabecera.parametros.size»
						«procedimiento.generateCabeceras»
					«ENDIF»
				«ENDIF»
				«IF subproceso.eClass.name.equals("Funcion")»
					«var funcion = subproceso as Funcion»
					«IF (!modulo.exporta_subprocesos.contains(funcion.nombre)) && funcion.parametros.size == cabecera.parametros.size»
						«funcion.generateCabeceras»
					«ENDIF»
				«ENDIF»
			«ENDFOR»
		«ENDFOR»
		
		#endif /* «modulo.nombre.toUpperCase»_H */
	'''
	
	/*
	 * Función auxiliar de doGenerate para generar los respectivos ficheros de cabecera (.h) - Algoritmo.
	 */
	override generateCabeceras(Algoritmo algoritmo) '''
		
		#ifndef «algoritmo.nombre.toUpperCase»_H
		#define «algoritmo.nombre.toUpperCase»_H
		
		«FOR moduloRef:algoritmo.importaciones»
		#include "«moduloRef.nombre».h"
		«ENDFOR»
		
		«FOR constante:algoritmo.constantes»
			«constante.generate»
		«ENDFOR»
		typedef char cadena[100];
		«FOR complejo:algoritmo.complejos»
			«complejo.generate»
		«ENDFOR»
		«FOR funcion:algoritmo.subprocesos»
			«funcion.generateCabeceras»
		«ENDFOR»
		
		#endif /* «algoritmo.nombre.toUpperCase»_H */
	'''
	
	/* 3) /* -------------------------------------------------------------------------------------------------------------------- */
	/**
	 * Función encargada de generar la entidad Algoritmo.
	 * @param algoritmo
	 */
	 override generate(Algoritmo algoritmo) {
	
		algoritmoActual = algoritmo;
		registrarInformacion(algoritmo.complejos, algoritmo.subprocesos, algoritmo.inicio.declaraciones);
	
	'''
		#include <stdio.h>
		#include <stdlib.h>
		#include <string.h>
		«IF cabeceras»
		#include "«algoritmo.nombre».h"
		«ENDIF»
		
		«IF !cabeceras»
		«FOR moduloRef:algoritmo.importaciones»
		#include "«moduloRef.nombre».h"
		«ENDFOR»
		«ENDIF»

		«IF !cabeceras»
		typedef char cadena[100];
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
		
		'''
		#include <stdio.h>
		#include <stdlib.h>
		#include <string.h>
		#include "«modulo.nombre».h"
		
		«FOR constante:modulo.implementacion.constantes»
			«IF !modulo.exporta_constantes.contains(constante.variable.nombre)»
		«constante.generate»
			«ENDIF»
		«ENDFOR»
		
		«FOR variable:modulo.implementacion.globales»
		«variable.generate»
		«ENDFOR»
		
		«FOR complejo:modulo.implementacion.complejos»
		«complejo.generate»
		«ENDFOR»
		
		«FOR subproceso:modulo.implementacion.subprocesos»
		«subproceso.generate»
		«ENDFOR»
		
		'''
	}
	
	/*
	 * Función auxiliar de generate(TipoExistente) que se encarga de obtener los tipos de datos correspondientes en C.
	 */	
	override getTipoVariable(String tipo) {
		if(tipo.equals(readerMessages.getBundle().getString("TIPO_ENTERO"))) return "int";
		if(tipo.equals(readerMessages.getBundle().getString("TIPO_CARACTER"))) return "char";
		if(tipo.equals(readerMessages.getBundle().getString("TIPO_REAL"))) return "float";
		if(tipo.equals(readerMessages.getBundle().getString("TIPO_LOGICO"))) return "int";
		if(tipo.equals(readerMessages.getBundle().getString("TIPO_CADENA"))) return "cadena";
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
			'''strcat(«interna.parametros.get(0).generate(punteros)»,«interna.parametros.get(1).generate(punteros)»)«IF sentencia»;«ENDIF»'''
		} else if (interna.nombre.equals(readerMessages.getBundle().getString("INTERNAS_COPIAR") + '(')) {
			'''strcpy(«interna.parametros.get(0).generate(punteros)»,«interna.parametros.get(1).generate(punteros)»)«IF sentencia»;«ENDIF»'''
		} else if (interna.nombre.equals(readerMessages.getBundle().getString("INTERNAS_LONGITUD") + '(')) {
			'''strlen(«interna.parametros.get(0).generate(punteros)»)«IF sentencia»;«ENDIF»'''
		}
	}
	
	
	/* 25) /* -------------------------------------------------------------------------------------------------------------------- */
	/**
	 * Función encargada de generar la entidad LlamadaFuncion.
	 * @param llamadaFuncion, sentencia
	 */
	override generate(LlamadaFuncion llamadaFuncion, boolean sentencia, List<String> punteros) '''«llamadaFuncion.nombre»«llamadaFuncion.parametros.getParametros(llamadaFuncion.nombre, punteros)»)«IF sentencia»;«ENDIF»'''
	
	/* 28) /* -------------------------------------------------------------------------------------------------------------------- */
	/**
	 * Función encargada de generar la entidad Escribir.
	 * @param escribir, punteros
	 */
	override generate(Escribir escribir, List<String> punteros, List<Sentencia> sentencias, List<Subproceso> subprocesos, boolean inicio) {
		var archivo = false;
		var saltarPrimero = false;
		if(inicio) {
			if(escribir.operador.size() > 0) {
				var descripcionEscribir = new String();
				if(escribir.operador.get(0).eClass.name.equals("CadenaCaracteres")) {
					var primero = escribir.operador.get(0) as CadenaCaracteres;
					descripcionEscribir = primero.valor;
					descripcionEscribir = descripcionEscribir.substring(0, descripcionEscribir.length()-1);
					saltarPrimero = true;
				}
				
				if(archivos.contains(escribir.operador.get(0).getTipoOperador(inicio, ""))) {
					archivo = true;
					saltarPrimero = true;
					descripcionEscribir = descripcionEscribir + escribir.operador.get(0).generate(punteros) + ", ";
				}
				
				if(!escribir.operador.get(0).eClass.name.equals("CadenaCaracteres")) {
					descripcionEscribir = descripcionEscribir + "\"";
				}
			
				if(escribir.operador.size() == 1 && escribir.operador.get(0).eClass.name.equals("CadenaCaracteres")) {
					descripcionEscribir = descripcionEscribir + " \\n\"";
				}
			
				for(operador: escribir.operador) {
					if(escribir.operador.indexOf(operador) == 0 && !operador.eClass.name.equals("CadenaCaracteres") && !archivos.contains(escribir.operador.get(0).getTipoOperador(inicio, "")) || escribir.operador.indexOf(operador) != 0) {
						var tipo = operador.getTipoOperador(inicio, "");
						if(tipo.equals(readerMessages.getBundle().getString("TIPO_ENTERO")) || operador.eClass.name.equals("Entero")) {
							if(escribir.operador.indexOf(operador) == escribir.operador.size - 1) {
								descripcionEscribir = descripcionEscribir + " %i \\n \"";
							} else {
								descripcionEscribir = descripcionEscribir + " %i";
							}
						} else if(tipo.equals(readerMessages.getBundle().getString("TIPO_CARACTER")) || operador.eClass.name.equals("Caracter")) {
							if(escribir.operador.indexOf(operador) == escribir.operador.size - 1) {
								descripcionEscribir = descripcionEscribir + " %c \\n \"";
							} else {
								descripcionEscribir = descripcionEscribir + " %c";
							}
						} else if(tipo.equals(readerMessages.getBundle().getString("TIPO_CADENA"))) {
							if(escribir.operador.indexOf(operador) == escribir.operador.size - 1) {
								descripcionEscribir = descripcionEscribir + " %s \\n \"";
							}
							else {
								descripcionEscribir = descripcionEscribir + " %s";
							}
						} else if(tipo.equals(readerMessages.getBundle().getString("TIPO_REAL")) || operador.eClass.name.equals("Real")) {
							if(escribir.operador.indexOf(operador) == escribir.operador.size - 1) {
								descripcionEscribir = descripcionEscribir + " %f \\n \"";
							}
							else {
								descripcionEscribir = descripcionEscribir + " %f";
							}
						} else if(vectoresMatrices.containsKey(tipo)) {
							var tipoAux = vectoresMatrices.get(tipo);
							if(tipoAux.equals(readerMessages.getBundle().getString("TIPO_ENTERO")) || operador.eClass.name.equals("Entero")) {
								if(escribir.operador.indexOf(operador) == escribir.operador.size - 1) {
									descripcionEscribir = descripcionEscribir + " %i \\n \"";
								}
								else {
									descripcionEscribir = descripcionEscribir + " %i";
								}
							}
							else if(tipoAux.equals(readerMessages.getBundle().getString("TIPO_CADENA")) || tipoAux.equals(readerMessages.getBundle().getString("TIPO_CARACTER"))) {
								if(operador.generate(punteros).toString.endsWith("]")) { //Se requiere un caracter de la cadena (un elemento del vector)
									if(escribir.operador.indexOf(operador) == escribir.operador.size - 1) {
										descripcionEscribir = descripcionEscribir + " %c \\n \"";
									}
									else {
										descripcionEscribir = descripcionEscribir + " %c";
									}
								} else {
									if(escribir.operador.indexOf(operador) == escribir.operador.size - 1) {
										descripcionEscribir = descripcionEscribir + " %s \\n \"";
									}
									else {
										descripcionEscribir = descripcionEscribir + " %s";
									}
								}
							}
							else if(tipoAux.equals(readerMessages.getBundle().getString("TIPO_REAL"))) {
								if(escribir.operador.indexOf(operador) == escribir.operador.size - 1) {
									descripcionEscribir = descripcionEscribir + " %f \\n \"";
								}	
								else {
									descripcionEscribir = descripcionEscribir + " %f";
								}
							}
						}
					}
				}
				if(escribir.operador.size > 1 || (escribir.operador.size == 1 && !escribir.operador.get(0).eClass.name.equals("CadenaCaracteres"))) {
					descripcionEscribir = descripcionEscribir + ", " + escribir.operador.getOperadores(saltarPrimero, punteros);
					if(archivo) {
						return '''fprintf(«descripcionEscribir»);'''
					} else {
						return '''printf(«descripcionEscribir»);'''
					}	
				} else {
					if(archivo) {
						return '''fprintf(«descripcionEscribir»);'''
					} else {
						return '''printf(«descripcionEscribir»);'''
					}	
				}
			  }	
			}
			for(Subproceso subproceso: subprocesos) {
				if(escribir.operador.size() > 0) {
					var descripcionEscribir = new String();
					if(escribir.operador.get(0).eClass.name.equals("CadenaCaracteres")) {
						var primero = escribir.operador.get(0) as CadenaCaracteres;
						descripcionEscribir = primero.valor;
						descripcionEscribir = descripcionEscribir.substring(0, descripcionEscribir.length()-1);
						saltarPrimero = true;
					}
					
					if(archivos.contains(escribir.operador.get(0).getTipoOperador(inicio, subproceso.nombre))) {
						archivo = true;
						saltarPrimero = true;
						descripcionEscribir = descripcionEscribir + escribir.operador.get(0).generate(punteros) + ", \"";
					}
					
					if(!escribir.operador.get(0).eClass.name.equals("CadenaCaracteres")) {
						descripcionEscribir = descripcionEscribir + "\"";
					}
				
					if(escribir.operador.size() == 1 && escribir.operador.get(0).eClass.name.equals("CadenaCaracteres")) {
						descripcionEscribir = descripcionEscribir + " \\n\"";
					}
					
					for(operador: escribir.operador) {
					//Si es el primer elemento y es distinto a una cadena si, sino se lo salta
					if(escribir.operador.indexOf(operador) == 0 && !operador.eClass.name.equals("CadenaCaracteres") || escribir.operador.indexOf(operador) != 0) {
						var tipo = operador.getTipoOperador(inicio, subproceso.nombre);
						
						if(tipo.equals(readerMessages.getBundle().getString("TIPO_ENTERO")) || operador.eClass.name.equals("Entero")) {
							if(escribir.operador.indexOf(operador) == escribir.operador.size - 1) {
								descripcionEscribir = descripcionEscribir + " %i \\n \"";
							} else {
								descripcionEscribir = descripcionEscribir + " %i";
							}
						} else if(tipo.equals(readerMessages.getBundle().getString("TIPO_CARACTER"))) {
							if(escribir.operador.indexOf(operador) == escribir.operador.size - 1) {
								descripcionEscribir = descripcionEscribir + " %c \\n \"";
							} else {
								descripcionEscribir = descripcionEscribir + " %c";
							}
						} else if(tipo.equals(readerMessages.getBundle().getString("TIPO_CADENA"))) {
							if(escribir.operador.indexOf(operador) == escribir.operador.size - 1) {
								descripcionEscribir = descripcionEscribir + " %s \\n \"";
							} else {
								descripcionEscribir = descripcionEscribir + " %s";
							}
						} else if(tipo.equals(readerMessages.getBundle().getString("TIPO_REAL"))) {
							if(escribir.operador.indexOf(operador) == escribir.operador.size - 1) {
								descripcionEscribir = descripcionEscribir + " %f \\n \"";
							} else {
								descripcionEscribir = descripcionEscribir + " %f";
							}
						} else if(vectoresMatrices.containsKey(tipo)) {
							var tipoAux = vectoresMatrices.get(tipo);
							if(tipoAux.equals(readerMessages.getBundle().getString("TIPO_ENTERO")) || operador.eClass.name.equals("Entero")) {
								if(escribir.operador.indexOf(operador) == escribir.operador.size - 1) {
									descripcionEscribir = descripcionEscribir + " %i \\n \"";
								} else {
									descripcionEscribir = descripcionEscribir + " %i";
								}
							}
							else if(tipoAux.equals(readerMessages.getBundle().getString("TIPO_CADENA")) || tipoAux.equals(readerMessages.getBundle().getString("TIPO_CARACTER"))) {
								if(operador.generate(punteros).toString.endsWith("]")) { 
									if(escribir.operador.indexOf(operador) == escribir.operador.size - 1) {
										descripcionEscribir = descripcionEscribir + " %c \\n \"";
									} else {
										descripcionEscribir = descripcionEscribir + " %c";
									}
								} else {
									if(escribir.operador.indexOf(operador) == escribir.operador.size - 1) {
										descripcionEscribir = descripcionEscribir + " %s \\n \"";
									} else {
										descripcionEscribir = descripcionEscribir + " %s";
									}
								}
							}
							else if(tipoAux.equals(readerMessages.getBundle().getString("TIPO_REAL"))) {
								if(escribir.operador.indexOf(operador) == escribir.operador.size - 1) {
									descripcionEscribir = descripcionEscribir + " %f \\n \"";
								} else {
									descripcionEscribir = descripcionEscribir + " %f";
								}
							}
						}
					}
				}
				if(escribir.operador.size > 1 || (escribir.operador.size == 1 && !escribir.operador.get(0).eClass.name.equals("CadenaCaracteres"))) {
					descripcionEscribir = descripcionEscribir + ", " + escribir.operador.getOperadores(saltarPrimero, punteros);
					if(archivo) {
						return '''fprintf(«descripcionEscribir»);'''
					} else {
						return '''printf(«descripcionEscribir»);'''
					}	
				} else {
					if(archivo) {
						return '''fprintf(«descripcionEscribir»);'''
					} else {
						return '''printf(«descripcionEscribir»);'''
					}	
				}
			}	
		}
	}
	
	/*
	 * Función auxiliar de generate(Escribir) que se encarga de generar los operadores utilizados en la función Escribir.
	 */
	def getOperadores(EList<Operacion> operaciones, boolean saltarPrimero, List<String> punteros) {
		var descripcionOperadores = "";
		for (operacion : operaciones) {
			if((operaciones.indexOf(operacion) < operaciones.size - 1 && !saltarPrimero) || 
				(operaciones.indexOf(operacion) < operaciones.size - 1 && saltarPrimero && operaciones.indexOf(operacion) != 0)) {
				descripcionOperadores = descripcionOperadores + operacion.generate(punteros) + " , ";
			} else if(operaciones.indexOf(operacion) != 0 || (operaciones.size == 1 && !saltarPrimero)) {
				descripcionOperadores = descripcionOperadores + operacion.generate(punteros);
			}
		}
		return descripcionOperadores;
	}
	
	
	/* 29) /* -------------------------------------------------------------------------------------------------------------------- */
	/**
	 * Función encargada de generar la entidad Leer.
	 * @param leer, sentencias, subprocesos, algoritmo
	 */
	override generate(Leer leer, List<Sentencia> sentencias, List<Subproceso> subprocesos, boolean inicio) {
		if(inicio) {
			var tipo = "";
			var descripcionLeer = "";
			var archivo = false;
			var variableArchivo = "";
			for(Operacion operacion: leer.variable) {
				tipo = operacion.getTipoOperador(inicio, "")
		
				if(archivos.contains(tipo)) {
					archivo = true;
					variableArchivo = operacion.generate(null).toString;
				} else if(tipo.equals(readerMessages.getBundle().getString("TIPO_ENTERO"))) {
					if(descripcionLeer.isEmpty) {
						if(archivo) {
							descripcionLeer = '''fscanf(«variableArchivo»,"%i", &«operacion.generate(null)»);'''
						} else {
							descripcionLeer = '''scanf("%i", &«operacion.generate(null)»);'''
						}
					} else {
						descripcionLeer = descripcionLeer + "\n";
						if(archivo) {
							descripcionLeer = '''fscanf(«variableArchivo»,"%i", &«operacion.generate(null)»);'''
						} else {
							descripcionLeer = '''scanf("%i", &«operacion.generate(null)»);'''
						}
					}
				} else if(tipo.equals(readerMessages.getBundle().getString("TIPO_CARACTER"))) {
					if(descripcionLeer.isEmpty) {
						if(archivo) {
							descripcionLeer = '''fscanf(«variableArchivo»,"%c", &«operacion.generate(null)»);'''
						} else {
							descripcionLeer = '''scanf("%c", &«operacion.generate(null)»);'''
						}
					} else {
						descripcionLeer = descripcionLeer + "\n";
						if(archivo) {
							descripcionLeer = '''fscanf(«variableArchivo»,"%c", &«operacion.generate(null)»);'''
						} else {
							descripcionLeer = '''scanf("%c", &«operacion.generate(null)»);'''
						}
					}
				} else if(tipo.equals(readerMessages.getBundle().getString("TIPO_CADENA"))) {
					if(descripcionLeer.isEmpty) {
						if(archivo) {
							descripcionLeer = '''fscanf(«variableArchivo»,"%s", &«operacion.generate(null)»);'''
						} else {
							descripcionLeer = '''scanf("%s", «operacion.generate(null)»);'''
						}
					} else {
						descripcionLeer = descripcionLeer + "\n";
						if(archivo) {
							descripcionLeer = '''fscanf(«variableArchivo»,"%s", &«operacion.generate(null)»);'''
						} else {
							descripcionLeer = '''scanf("%s", &«operacion.generate(null)»);'''
						}
					}
				} else if(tipo.equals(readerMessages.getBundle().getString("TIPO_REAL"))) {
					if(descripcionLeer.isEmpty) {
						if(archivo) {
							descripcionLeer = '''fscanf(«variableArchivo»,"%f", &«operacion.generate(null)»);'''
						} else {
							descripcionLeer = '''scanf("%f", &«operacion.generate(null)»);'''
						}
					} else {
						descripcionLeer = descripcionLeer + "\n";
						if(archivo) {
							descripcionLeer = '''fscanf(«variableArchivo»,"%f", &«operacion.generate(null)»);'''
						} else {
							descripcionLeer = '''scanf("%f", &«operacion.generate(null)»);'''
						}
					}
	 			} else if(vectoresMatrices.containsKey(tipo)) {
					var tipoAux = vectoresMatrices.get(tipo);
					if(tipoAux.equals(readerMessages.getBundle().getString("TIPO_ENTERO"))) {
						if(descripcionLeer.isEmpty) {
							if(archivo) {
								descripcionLeer = '''fscanf(«variableArchivo»,"%i", &«operacion.generate(null)»);'''
							} else {
								descripcionLeer = '''scanf("%i", &«operacion.generate(null)»);'''
							}
						} else {
							descripcionLeer = descripcionLeer + "\n";
							if(archivo) {
								descripcionLeer = '''fscanf(«variableArchivo»,"%i", &«operacion.generate(null)»);'''
							} else {
								descripcionLeer = '''scanf("%i", &«operacion.generate(null)»);'''
							}
						}
					} else if(tipoAux.equals(readerMessages.getBundle().getString("TIPO_CADENA")) || tipoAux.equals(readerMessages.getBundle().getString("TIPO_CARACTER"))) {
						if(descripcionLeer.isEmpty) {
							if(archivo) {
								descripcionLeer = '''fscanf(«variableArchivo»,"%s", &«operacion.generate(null)»);'''
							} else {
								descripcionLeer = '''scanf("%s", «operacion.generate(null)»);'''
							}
						} else {
							descripcionLeer = descripcionLeer + "\n";
							if(archivo) {
								descripcionLeer = '''fscanf(«variableArchivo»,"%s", &«operacion.generate(null)»);'''
							} else {
								descripcionLeer = '''scanf("%s", «operacion.generate(null)»);'''
							}
						}
					} else if(tipoAux.equals(readerMessages.getBundle().getString("TIPO_REAL"))) {
						if(descripcionLeer.isEmpty) {
							if(archivo) {
								descripcionLeer = '''fscanf(«variableArchivo»,"%f", &«operacion.generate(null)»);'''
							} else {
								descripcionLeer = '''scanf("%f", &«operacion.generate(null)»);'''
							}
						} else {
							descripcionLeer = descripcionLeer + "\n";
							if(archivo) {
								descripcionLeer = '''fscanf(«variableArchivo»,"%f", &«operacion.generate(null)»);'''
							} else {
								descripcionLeer = '''scanf("%f", &«operacion.generate(null)»);'''
							}
						}
					}
				}
			}
			return descripcionLeer;
		}
		
		for(Subproceso subproceso: subprocesos) {
 			var tipo = "";
 			var resultado = "";
 			var archivo = false;
			var variableArchivo = "";
 			for(Operacion operacion: leer.variable) {
 				tipo = operacion.getTipoOperador(inicio, subproceso.nombre)
			
				if(archivos.contains(tipo)) {
					archivo = true;
					variableArchivo = operacion.generate(null).toString;
				}
				if(tipo.equals(readerMessages.getBundle().getString("TIPO_ENTERO"))) {
					if(resultado == "") {
						if(archivo) {
							resultado = '''fscanf(«variableArchivo»,"%i", &«operacion.generate(null)»);'''
						} else {
							resultado = '''scanf("%i", &«operacion.generate(null)»);'''
						}
					} else {
						resultado = resultado + "\n";
						if(archivo) {
							resultado = '''fscanf(«variableArchivo»,"%i", &«operacion.generate(null)»);'''
						} else {
							resultado = '''scanf("%i", &«operacion.generate(null)»);'''
						}
						resultado = resultado + '''scanf("%i", &«operacion.generate(null)»);'''
					}
				} else if(tipo.equals(readerMessages.getBundle().getString("TIPO_CARACTER"))) {
					if(resultado == "") {
						if(archivo) {
							resultado = '''fscanf(«variableArchivo»,"%c", &«operacion.generate(null)»);'''
						} else {
							resultado = '''scanf("%c", &«operacion.generate(null)»);'''
						}
					} else {
						resultado = resultado + "\n";
						if(archivo) {
							resultado = '''fscanf(«variableArchivo»,"%c", &«operacion.generate(null)»);'''
						} else {
							resultado = '''scanf("%c", &«operacion.generate(null)»);'''
						}
					}
				} else if(tipo.equals(readerMessages.getBundle().getString("TIPO_CADENA"))) {
					if(resultado == "") {
						if(archivo) {
							resultado = '''fscanf(«variableArchivo»,"%s", &«operacion.generate(null)»);'''
						} else {
							resultado = '''scanf("%s", «operacion.generate(null)»);'''
						}
					} else {
						resultado = resultado + "\n";
						if(archivo) {
							resultado = '''fscanf(«variableArchivo»,"%s", &«operacion.generate(null)»);'''
						} else {
							resultado = '''scanf("%s", &«operacion.generate(null)»);'''
						}
					}
				} else if(tipo.equals(readerMessages.getBundle().getString("TIPO_REAL"))) {
					if(resultado == "") {
						if(archivo) {
							resultado = '''fscanf(«variableArchivo»,"%f", &«operacion.generate(null)»);'''
						} else {
							resultado = '''scanf("%f", &«operacion.generate(null)»);'''
						}
					} else {
						resultado = resultado + "\n";
						if(archivo) {
							resultado = '''fscanf(«variableArchivo»,"%f", &«operacion.generate(null)»);'''
						} else {
							resultado = '''scanf("%f", &«operacion.generate(null)»);'''
						}
					}
 				} else if(vectoresMatrices.containsKey(tipo)) {
					var tipoAux = vectoresMatrices.get(tipo);
					if(tipoAux.equals(readerMessages.getBundle().getString("TIPO_ENTERO"))) {
						if(resultado == "") {
							if(archivo) {
								resultado = '''fscanf(«variableArchivo»,"%i", &«operacion.generate(null)»);'''
							} else {
								resultado = '''scanf("%i", &«operacion.generate(null)»);'''
							}
						} else {
							resultado = resultado + "\n";
							if(archivo) {
								resultado = '''fscanf(«variableArchivo»,"%i", &«operacion.generate(null)»);'''
							} else {
								resultado = '''scanf("%i", &«operacion.generate(null)»);'''
							}
						}
					} else if(tipoAux.equals(readerMessages.getBundle().getString("TIPO_CADENA")) || tipoAux.equals(readerMessages.getBundle().getString("TIPO_CARACTER"))) {
						if(resultado == "") {
							if(archivo) {
								resultado = '''fscanf(«variableArchivo»,"%s", &«operacion.generate(null)»);'''
							} else {
								resultado = '''scanf("%s", «operacion.generate(null)»);'''
							}
						} else {
							resultado = resultado + "\n";
							if(archivo) {
								resultado = '''fscanf(«variableArchivo»,"%s", &«operacion.generate(null)»);'''
							} else {
								resultado = '''scanf("%s", «operacion.generate(null)»);'''
							}
						}
					} else if(tipoAux.equals(readerMessages.getBundle().getString("TIPO_REAL"))) {
						if(resultado == "") {
							if(archivo) {
								resultado = '''fscanf(«variableArchivo»,"%f", &«operacion.generate(null)»);'''
							} else {
								resultado = '''scanf("%f", &«operacion.generate(null)»);'''
							}
						} else {
							resultado = resultado + "\n";
							if(archivo) {
								resultado = '''fscanf(«variableArchivo»,"%f", &«operacion.generate(null)»);'''
							} else {
								resultado = '''scanf("%f", &«operacion.generate(null)»);'''
							}
						}
					}
				}
			}
			return resultado;
		}
	}
}
