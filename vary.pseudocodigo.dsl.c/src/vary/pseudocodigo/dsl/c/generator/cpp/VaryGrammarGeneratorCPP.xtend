package vary.pseudocodigo.dsl.c.generator.cpp

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
import diagramapseudocodigo.Sentencias
import diagramapseudocodigo.AsignacionNormal
import diagramapseudocodigo.impl.AsignacionNormalImpl
import diagramapseudocodigo.AsignacionCompleja
import diagramapseudocodigo.impl.AsignacionComplejaImpl
import diagramapseudocodigo.LlamadaFuncion
import diagramapseudocodigo.impl.LlamadaFuncionImpl
import diagramapseudocodigo.impl.SiImpl
import diagramapseudocodigo.Si
import diagramapseudocodigo.segun
import diagramapseudocodigo.Caso
import diagramapseudocodigo.impl.CasoImpl
import diagramapseudocodigo.impl.segunImpl
import diagramapseudocodigo.mientras
import diagramapseudocodigo.impl.mientrasImpl
import diagramapseudocodigo.repetir
import diagramapseudocodigo.impl.repetirImpl
import diagramapseudocodigo.desde
import diagramapseudocodigo.impl.desdeImpl
import diagramapseudocodigo.Negacion
import diagramapseudocodigo.impl.NegacionImpl
import diagramapseudocodigo.Leer
import diagramapseudocodigo.impl.LeerImpl
import diagramapseudocodigo.Escribir
import diagramapseudocodigo.impl.EscribirImpl
import diagramapseudocodigo.impl.FuncionFicheroAbrirImpl
import diagramapseudocodigo.impl.FuncionFicheroCerrarImpl
import diagramapseudocodigo.Funcion
import diagramapseudocodigo.impl.FuncionImpl
import diagramapseudocodigo.Procedimiento
import diagramapseudocodigo.impl.ProcedimientoImpl
import diagramapseudocodigo.TipoVariable
import org.eclipse.emf.common.util.EList
import diagramapseudocodigo.TipoPaso
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
import diagramapseudocodigo.unaria
import diagramapseudocodigo.impl.unariaImpl
import diagramapseudocodigo.booleano
import diagramapseudocodigo.NombreInterna
import diagramapseudocodigo.Suma
import diagramapseudocodigo.impl.SumaImpl
import diagramapseudocodigo.Resta
import diagramapseudocodigo.impl.RestaImpl
import diagramapseudocodigo.Multiplicacion
import diagramapseudocodigo.impl.MultiplicacionImpl
import diagramapseudocodigo.Division
import diagramapseudocodigo.impl.DivisionImpl
import diagramapseudocodigo.Or
import diagramapseudocodigo.impl.OrImpl
import diagramapseudocodigo.And
import diagramapseudocodigo.impl.AndImpl
import diagramapseudocodigo.Comparacion
import diagramapseudocodigo.impl.ComparacionImpl
import diagramapseudocodigo.Igualdad
import diagramapseudocodigo.impl.IgualdadImpl
import diagramapseudocodigo.Negativa
import diagramapseudocodigo.impl.NegativaImpl
import diagramapseudocodigo.Devolver
import diagramapseudocodigo.Sino
import java.io.IOException
import java.util.List
import vary.pseudocodigo.dsl.c.generator.util.ReadFileProperties
import vary.pseudocodigo.dsl.c.generator.util.ProjectLocationFolder
import diagramapseudocodigo.Algoritmo
import diagramapseudocodigo.Modulo
import diagramapseudocodigo.impl.ModuloImpl
import diagramapseudocodigo.impl.AlgoritmoImpl
import diagramapseudocodigo.Subrango
import diagramapseudocodigo.CabeceraProcedimiento
import diagramapseudocodigo.CabeceraFuncion
import diagramapseudocodigo.CabeceraSubproceso
import vary.pseudocodigo.dsl.c.generator.VaryGeneratorInterface
import vary.pseudocodigo.dsl.c.validation.messages.ReadMessagesValidatorInterface
import diagramapseudocodigo.impl.CabeceraFuncionImpl
import diagramapseudocodigo.impl.CabeceraProcedimientoImpl

/**
 * Generates code from your model files on save.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#TutorialCodeGeneration
 */
class VaryGrammarGeneratorCPP implements IGenerator, VaryGeneratorInterface {
	static Map<String, String> variablesInicio = new HashMap<String,String>();
	static Map<String, Map<String,String>>variablesSubprocesos = new HashMap<String,Map<String,String>>();
	static Map<String,String> vectoresMatrices = new HashMap<String,String>();
	static Map<String, Map<String,String>> registros = new HashMap<String, Map<String,String>>();
	static Map<String, ArrayList<String>> variablesEnumerados = new HashMap<String, ArrayList<String>>();
	static ArrayList<String> enumerados = new ArrayList<String>();
	Algoritmo algoritmo;
	Modulo modulo;
	static boolean cabeceras;
	static Map<String, String> funciones = new HashMap<String,String>();
	static ReadFileProperties readerFileProperties = new ReadFileProperties();
	static Map<String,ArrayList<Integer>> subprocesosConPunteros = new HashMap<String,ArrayList<Integer>>();
	static ReadMessagesValidatorInterface readerMessages;
	
	new(ReadMessagesValidatorInterface readerMessages) {
		VaryGrammarGeneratorCPP.readerMessages = readerMessages;
	}

	override void doGenerate(Resource resource, IFileSystemAccess myCFile) {
		for (myPseudo : resource.allContents.toIterable.filter(typeof(Codigo))) {
			
			algoritmo = null
			modulo = null
		
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
			
				
			ProjectLocationFolder.getLogger().error("El contenido del fichero es:");
			ProjectLocationFolder.getLogger().error(contenidoFichero);
			
			//Recogemos el tipo de proyecto de la cadena
			
			var tipoProyecto = contenidoFichero.replaceAll("ficheroCabeceras=","");
			
			if(tipoProyecto == "false") {
				cabeceras = false;
				if(myPseudo instanceof Algoritmo) {
					myCFile.generateFile(myPseudo.obtenerNombre + ".cpp", myPseudo.generate)	
				} else {
					myCFile.generateFile(myPseudo.obtenerNombre +".cpp", myPseudo.generate)
					myCFile.generateFile(myPseudo.obtenerNombre + ".h", myPseudo.generarCabeceras)
				}
			}
			else {
				cabeceras = true;
				myCFile.generateFile(myPseudo.obtenerNombre +".cpp", myPseudo.generate)
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
	
	def void addProcedimiento(Procedimiento procedimiento, List<Procedimiento> procedimientos) {
		procedimientos.add(procedimiento)
	}
	
	def void addFuncion(Funcion funcion, List<Funcion> funciones) {
		funciones.add(funcion)
	}
	
	def void addVariable(List<String> variablesPublicas, Declaracion declaracion) {
		if(declaracion instanceof DeclaracionVariable) {
			var decVar = declaracion as DeclaracionVariable
			for(myVariable: decVar.variable) {
				variablesPublicas.add(myVariable.nombre)
			}
			
		}
		else {
			var decPropia = declaracion as DeclaracionPropia
			for(myVariable: decPropia.variable) {
				variablesPublicas.add(myVariable.nombre)
			}
		}
	}
	
	def generate(CabeceraProcedimiento myCabecera) {
		
	}
	
	def generate(CabeceraFuncion myFuncion) {
		
	}
	
	def generarCabeceras(Modulo myModulo) {
		var procedimientosUsados = new ArrayList<Procedimiento>();
		var funcionesUsadas = new ArrayList<Funcion>();
	
	'''
		#ifndef «myModulo.nombre.toUpperCase»_H
		#define «myModulo.nombre.toUpperCase»_H
		
		using namespace std;
		
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
		«var variablesPublicas = new ArrayList<String>()»
		class  «myModulo.nombre» {
			
			public:
				//Variables a exportar
				«FOR myDeclaracion:modulo.exporta_global»
					«variablesPublicas.addVariable(myDeclaracion)»
					«myDeclaracion.generate»
				«ENDFOR»
				
				//Métodos (funciones) a exportar
				«FOR exportaCabecera:myModulo.exporta_funciones»
					«IF exportaCabecera.eClass.name.equals("CabeceraProcedimiento")»
						«var cabecera = exportaCabecera as CabeceraProcedimiento»
						«FOR mySubproceso:myModulo.implementacion.funcion»
							«IF mySubproceso.eClass.name.equals("Procedimiento")»
								«var procedimiento = mySubproceso as Procedimiento»
								«IF	cabecera.nombre.equals(procedimiento.nombre) && procedimiento.parametrofuncion.size == cabecera.parametrofuncion.size»
									«mySubproceso.cabecerasFuncion»
									«procedimiento.addProcedimiento(procedimientosUsados)»
								«ENDIF»
							«ENDIF»
						«ENDFOR»
					«ENDIF»
					«IF exportaCabecera.eClass.name.equals("CabeceraFuncion")»
						«var cabecera = exportaCabecera as CabeceraFuncion»
						«FOR mySubproceso:myModulo.implementacion.funcion»
							«IF mySubproceso.eClass.name.equals("Funcion")»
								«var funcion = mySubproceso as Funcion»
								«IF	cabecera.nombre.equals(funcion.nombre) && funcion.parametrofuncion.size == cabecera.parametrofuncion.size»
									«mySubproceso.cabecerasFuncion»
									«funcion.addFuncion(funcionesUsadas)»
								«ENDIF»
							«ENDIF»
						«ENDFOR»
					«ENDIF»
				«ENDFOR»
				
			private:
				//Variables privadas
				«FOR myVariable:modulo.implementacion.global»
					«myVariable.generate»
				«ENDFOR»
				
				
				//Métodos (funciones) privadas de la clase
				«FOR mySubproceso:myModulo.implementacion.funcion»
					«IF mySubproceso.eClass.name.equals("Procedimiento")»
						«var procedimiento = mySubproceso as Procedimiento»
						«FOR myProcedimiento:procedimientosUsados»
							«IF myProcedimiento.nombre.equals(procedimiento) && myProcedimiento.parametrofuncion.size == procedimiento.parametrofuncion.size»
								«mySubproceso.cabecerasFuncionStatic»
							«ENDIF»
						«ENDFOR»
					«ENDIF»
					«IF mySubproceso.eClass.name.equals("Funcion")»
						«var funcion = mySubproceso as Funcion»
						«FOR myFuncion:funcionesUsadas»
							«IF myFuncion.nombre.equals(funcion) && myFuncion.parametrofuncion.size == funcion.parametrofuncion.size»
								«mySubproceso.cabecerasFuncionStatic»
							«ENDIF»
						«ENDFOR»
					«ENDIF»
				«ENDFOR»
		};
		
		#endif /* «myModulo.nombre.toUpperCase»_H */
	'''
	}
	
	def generarCabeceras(Algoritmo myAlgoritmo) '''
		
		#ifndef CABECERAS_H
		#define CABECERAS_H
		
		«FOR myConstante:myAlgoritmo.constantes»
			«myConstante.generate»
		«ENDFOR»
		«FOR myComplejo:myAlgoritmo.tipocomplejo»
			«myComplejo.generate»
		«ENDFOR»
		«FOR funcion:myAlgoritmo.funcion»
			«funcion.cabecerasFuncion»
		«ENDFOR»
		
		#endif /* CABECERAS_H */
	'''
	
	def cabecerasFuncion(Subproceso s) {
		if (s.eClass.name.equals("Funcion")) {
			var Funcion funcion = new FuncionImpl
			funcion = s as Funcion
			var cabecera = funcion.tipo.tipoVariableCpp + " " + funcion.nombre + "(";
			return variablesCabecerasSubproceso(funcion.parametrofuncion, cabecera);
			
		} else if (s.eClass.name.equals("Procedimiento")) {
			var Procedimiento procedimiento = new ProcedimientoImpl
			procedimiento = s as Procedimiento
			var cabecera = "void" + " " + procedimiento.nombre + "(";
			return variablesCabecerasSubproceso(procedimiento.parametrofuncion, cabecera);
		}
	}
	
	def cabecerasFuncionStatic(Subproceso s) {
		if (s.eClass.name.equals("Funcion")) {
			var Funcion funcion = new FuncionImpl
			funcion = s as Funcion
			var cabecera = "static " + funcion.tipo.tipoVariableCpp + " " + funcion.nombre + "(";
			return variablesCabecerasSubproceso(funcion.parametrofuncion, cabecera);
			
		} else if (s.eClass.name.equals("Procedimiento")) {
			var Procedimiento procedimiento = new ProcedimientoImpl
			procedimiento = s as Procedimiento
			var cabecera = "static void" + " " + procedimiento.nombre + "(";
			return variablesCabecerasSubproceso(procedimiento.parametrofuncion, cabecera);
		}
	}
	
	def variablesCabecerasSubproceso(EList<ParametroFuncion> parametros, String cabecera) {
		var total = cabecera;
		var actual = 1;
		for (p : parametros) {
			if (actual != 1)
				total = total + ", "
			if (p.paso == TipoPaso::ENTRADA) {
				total = total + "const " + p.tipo.generate;
			} else if (p.paso == TipoPaso::ENTRADA_SALIDA) {
				total = total + p.tipo.generate;
			} else {
				total = total + p.tipo.generate;
			}
			actual = actual + 1;
		}
		total = total + ");"
		//cabeceraAux = cabeceraAux.replaceAll("\\,\\)",")");
		//cabeceraAux = cabeceraAux + ";"
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
				if(parametro.paso == TipoPaso::SALIDA) {
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
				if(parametro.paso == TipoPaso::SALIDA) {
					subprocesosConPunteros.get(procedimiento.nombre).add(numParametro)
				}
				numParametro = numParametro + 1;
			}
		}
	}
	
	for(Modulo m: modulo.importaciones) {
		for(CabeceraSubproceso cabecera: m.exporta_funciones) {
			if(cabecera.eClass.name.equals("CabeceraFuncion")) {
				var CabeceraFuncion cabeceraFuncion = new CabeceraFuncionImpl
				cabeceraFuncion = cabecera as CabeceraFuncion
				funciones.put(cabeceraFuncion.nombre, cabeceraFuncion.tipo)
				subprocesosConPunteros.put(cabeceraFuncion.nombre, new ArrayList<Integer>());
				var numParametro = 1;
				for(ParametroFuncion parametro: cabeceraFuncion.parametrofuncion) {
					if(parametro.paso == TipoPaso::SALIDA) {
						subprocesosConPunteros.get(cabeceraFuncion.nombre).add(numParametro)
					}
					numParametro = numParametro + 1;
				}
			}
			
			else if(cabecera.eClass.name.equals("CabeceraProcedimiento")) {
				var CabeceraProcedimiento cabeceraProcedimiento = new CabeceraProcedimientoImpl
				cabeceraProcedimiento = cabecera as CabeceraProcedimiento
				funciones.put(cabeceraProcedimiento.nombre, "void")
				subprocesosConPunteros.put(cabeceraProcedimiento.nombre, new ArrayList<Integer>());
				var numParametro = 1;
				for(ParametroFuncion parametro: cabeceraProcedimiento.parametrofuncion) {
					if(parametro.paso == TipoPaso::SALIDA) {
						subprocesosConPunteros.get(cabeceraProcedimiento.nombre).add(numParametro)
					}
					numParametro = numParametro + 1;
				}
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
	
	var procedimientosUsados = new ArrayList<Procedimiento>();
	var funcionesUsadas = new ArrayList<Funcion>();
		
		'''
		#include <iostream>
		#include <string>
		#include <cmath>
		#include "«myModulo.nombre».h"
		«FOR myRefModulo:myModulo.importaciones»
			#include "«myRefModulo.nombre».h"
		«ENDFOR»
		using namespace std;
		
		//Instanciamos los modulos que vamos a usar
		«FOR myRefModulo:myModulo.importaciones»
			«myRefModulo.nombre» ref«myRefModulo.nombre» = «myRefModulo.nombre»();
		«ENDFOR»
		
		«FOR myConstante:myModulo.implementacion.constantes»
			«IF !myModulo.exporta_constantes.contains(myConstante.variable.nombre)»
				«myConstante.generate»
			«ENDIF»
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
		
		//Metodos publicos
		
		«FOR exportaCabecera:myModulo.exporta_funciones»
			«FOR mySubproceso:myModulo.implementacion.funcion»
				«IF mySubproceso.eClass.name.equals("Procedimiento")»
					«var procedimiento = mySubproceso as Procedimiento»
					«IF (!myModulo.exporta_funciones.contains(procedimiento.nombre)) && procedimiento.parametrofuncion.size == exportaCabecera.parametrofuncion.size»
						«procedimiento.generate(modulo.nombre)»
						«procedimiento.addProcedimiento(procedimientosUsados)»
					«ENDIF»
				«ENDIF»
				«IF mySubproceso.eClass.name.equals("Funcion")»
					«var funcion = mySubproceso as Funcion»
					«IF (!myModulo.exporta_funciones.contains(funcion.nombre)) && funcion.parametrofuncion.size == exportaCabecera.parametrofuncion.size»
						«funcion.generate(modulo.nombre)»
						«funcion.addFuncion(funcionesUsadas)»
					«ENDIF»
				«ENDIF»
			«ENDFOR»
		«ENDFOR»
		
		//Metodos privados
		
		«FOR mySubproceso:myModulo.implementacion.funcion»
			«IF mySubproceso.eClass.name.equals("Procedimiento")»
				«var procedimiento = mySubproceso as Procedimiento»
				«IF !procedimientosUsados.contains(procedimiento)»
					«procedimiento.generateStatic(modulo.nombre)»
				«ENDIF»
			«ENDIF»
			«IF mySubproceso.eClass.name.equals("Funcion")»
				«var funcion = mySubproceso as Funcion»
				«IF !funcionesUsadas.contains(funcion)»
					«funcion.generateStatic(modulo.nombre)»
				«ENDIF»
			«ENDIF»
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
				if(parametro.paso == TipoPaso::SALIDA) {
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
				if(parametro.paso == TipoPaso::SALIDA) {
					subprocesosConPunteros.get(procedimiento.nombre).add(numParametro)
				}
				numParametro = numParametro + 1;
			}
		}
	}
	
	for(Modulo m: algoritmo.importaciones) {
		for(CabeceraSubproceso cabecera: m.exporta_funciones) {
			if(cabecera.eClass.name.equals("CabeceraFuncion")) {
				var CabeceraFuncion cabeceraFuncion = new CabeceraFuncionImpl
				cabeceraFuncion = cabecera as CabeceraFuncion
				funciones.put(cabeceraFuncion.nombre, cabeceraFuncion.tipo)
				subprocesosConPunteros.put(cabeceraFuncion.nombre, new ArrayList<Integer>());
				var numParametro = 1;
				for(ParametroFuncion parametro: cabeceraFuncion.parametrofuncion) {
					if(parametro.paso == TipoPaso::SALIDA) {
						subprocesosConPunteros.get(cabeceraFuncion.nombre).add(numParametro)
					}
					numParametro = numParametro + 1;
				}
			}
			else if(cabecera.eClass.name.equals("CabeceraProcedimiento")) {
				var CabeceraProcedimiento cabeceraProcedimiento = new CabeceraProcedimientoImpl
				cabeceraProcedimiento = cabecera as CabeceraProcedimiento
				funciones.put(cabeceraProcedimiento.nombre, "void")
				subprocesosConPunteros.put(cabeceraProcedimiento.nombre, new ArrayList<Integer>());
				var numParametro = 1;
				for(ParametroFuncion parametro: cabeceraProcedimiento.parametrofuncion) {
					if(parametro.paso == TipoPaso::SALIDA) {
						subprocesosConPunteros.get(cabeceraProcedimiento.nombre).add(numParametro)
					}
					numParametro = numParametro + 1;
				}
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
		#include <iostream>
		#include <string>
		#include <cmath>
		«IF cabeceras»
		#include "«algoritmo.nombre».h"
		«ENDIF»
		«FOR myRefModulo:algoritmo.importaciones»
		#include "«myRefModulo.nombre».h"
		«ENDFOR»
		
		using namespace std;
		
		//Instanciamos los modulos que vamos a usar
		«FOR myRefModulo:algoritmo.importaciones»
			«myRefModulo.nombre» ref«myRefModulo.nombre» = «myRefModulo.nombre»();
		«ENDFOR»
		
		«FOR myComentario:myAlgoritmo.comentarios»
			«myComentario.generate»
		«ENDFOR»
		«IF !cabeceras»
			«FOR myConstante:myAlgoritmo.constantes»
				«myConstante.generate»
			«ENDFOR»
			«FOR myComplejo:myAlgoritmo.tipocomplejo»
				«myComplejo.generate»
			«ENDFOR»
		«ENDIF»
		«FOR myVariable:myAlgoritmo.global»
			«myVariable.generate»
		«ENDFOR»
		
		«FOR funcion:myAlgoritmo.funcion»
			«funcion.generate»
			
		«ENDFOR»
		«myAlgoritmo.tiene.generate»
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
		return tipoVariableCpp(myTipo.tipo)
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

	def tipoVariableCpp(String tipo) {
		if(tipo.equals(readerMessages.getBundle().getString("TIPO_ENTERO"))) return "int";
		if(tipo.equals(readerMessages.getBundle().getString("TIPO_CARACTER"))) return "char";
		if(tipo.equals(readerMessages.getBundle().getString("TIPO_REAL"))) return "float";
		if(tipo.equals(readerMessages.getBundle().getString("TIPO_LOGICO"))) return "bool";
		if(tipo.equals(readerMessages.getBundle().getString("TIPO_CADENA"))) return "string";
	}

	override generate(EList<ParametroFuncion> parametros) {
		var total = "";
		var actual = 1;
		for (p : parametros) {
			if (actual != 1)
				total = total + ", "
			if (p.paso == TipoPaso::ENTRADA) {
				total = total + "const " + p.tipo.generate + " " + p.variable.nombre;
			} else if (p.paso == TipoPaso::ENTRADA_SALIDA) {
				total = total + p.tipo.generate + " " + p.variable.nombre;
			} else {
				total = total + p.tipo.generate + " " + p.variable.nombre;
			}
			actual = actual + 1;
		}
		return total;
	}

	override generate(Funcion myFun) {
		var funcionDeclarada = myFun.tipo.tipoVariableCpp + " " + myFun.nombre + "(" + myFun.parametrofuncion.generate + "){" + "\n";
		var punteros = new ArrayList<String>();
		for(parametroFuncion: myFun.parametrofuncion) {
			if(parametroFuncion.paso == TipoPaso::SALIDA) {
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
		}
		else {
			for(mySentencia:myFun.sentencias) {
				funcionDeclarada = funcionDeclarada + "\t" + mySentencia.generatePunteros(punteros) + "\n";
			}
		}
		if(myFun.devuelve != null) {
			funcionDeclarada = funcionDeclarada + "\t" + myFun.devuelve.generate + "\n";
		}
		funcionDeclarada = funcionDeclarada + "\n" + "}";
		return funcionDeclarada;
	}
	
	def generate(Funcion myFun, String nombreModulo) {
		var funcionDeclarada = myFun.tipo.tipoVariableCpp + " " + nombreModulo + "::" + myFun.nombre + "(" + myFun.parametrofuncion.generate + "){" + "\n";
		var punteros = new ArrayList<String>();
		for(parametroFuncion: myFun.parametrofuncion) {
			if(parametroFuncion.paso == TipoPaso::SALIDA) {
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
		}
		else {
			for(mySentencia:myFun.sentencias) {
				funcionDeclarada = funcionDeclarada + "\t" + mySentencia.generatePunteros(punteros) + "\n";
			}
		}
		if(myFun.devuelve != null) {
			funcionDeclarada = funcionDeclarada + "\t" + myFun.devuelve.generate + "\n";
		}
		funcionDeclarada = funcionDeclarada + "\n" + "}";
		return funcionDeclarada;
	}
	
	def generateStatic(Funcion myFun, String nombreModulo) {
		var funcionDeclarada = myFun.tipo.tipoVariableCpp + " " + nombreModulo + "::" + myFun.nombre + "(" + myFun.parametrofuncion.generate + "){" + "\n";
		var punteros = new ArrayList<String>();
		for(parametroFuncion: myFun.parametrofuncion) {
			if(parametroFuncion.paso == TipoPaso::SALIDA) {
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
		}
		else {
			for(mySentencia:myFun.sentencias) {
				funcionDeclarada = funcionDeclarada + "\t" + mySentencia.generatePunteros(punteros) + "\n";
			}
		}
		if(myFun.devuelve != null) {
			funcionDeclarada = funcionDeclarada + "\t" + myFun.devuelve.generate + "\n";
		}
		funcionDeclarada = funcionDeclarada + "\n" + "}";
		return funcionDeclarada;
	}
	
	override generate(Procedimiento myProc) {
		var procedimientoDeclarado = "void " + myProc.nombre + "(" + myProc.parametrofuncion.generate + "){" + "\n";
		var punteros = new ArrayList<String>();
		for(parametroFuncion: myProc.parametrofuncion) {
			if(parametroFuncion.paso == TipoPaso::SALIDA) {
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
	
	def generate(Procedimiento myProc, String nombreModulo) {
		var procedimientoDeclarado = "void " + nombreModulo + "::" + myProc.nombre + "(" + myProc.parametrofuncion.generate + "){" + "\n";
		var punteros = new ArrayList<String>();
		for(parametroFuncion: myProc.parametrofuncion) {
			if(parametroFuncion.paso == TipoPaso::SALIDA) {
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
	
	def generateStatic(Procedimiento myProc, String nombreModulo) {
		var procedimientoDeclarado = "void " + nombreModulo + "::" + myProc.nombre + "(" + myProc.parametrofuncion.generate + "){" + "\n";
		var punteros = new ArrayList<String>();
		for(parametroFuncion: myProc.parametrofuncion) {
			if(parametroFuncion.paso == TipoPaso::SALIDA) {
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
		} else if (mySent.eClass.name.equals("negacion")) {
			var Negacion prueba = new NegacionImpl
			prueba = mySent as Negacion
			prueba.generate
		} else if (mySent.eClass.name.equals("Leer")) {
			var Leer prueba = new LeerImpl
			prueba = mySent as Leer
			prueba.generateLeerPunteros(punteros)
		} else if (mySent.eClass.name.equals("Escribir")) {
			var Escribir prueba = new EscribirImpl
			prueba = mySent as Escribir
			prueba.generate
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
	
	override generate(Sentencias mySent) {
		if (mySent.eClass.name.equals("AsignacionNormal")) {
			var AsignacionNormal prueba = new AsignacionNormalImpl
			prueba = mySent as AsignacionNormal
			prueba.generate
		} else if (mySent.eClass.name.equals("AsignacionCompleja")) {
			var AsignacionCompleja prueba = new AsignacionComplejaImpl
			prueba = mySent as AsignacionCompleja
			prueba.generate
		}else if (mySent.eClass.name.equals("LlamadaFuncion")) {
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
		} else if (mySent.eClass.name.equals("Negacion")) {
			var Negacion prueba = new NegacionImpl
			prueba = mySent as Negacion
			prueba.generate
		} else if (mySent.eClass.name.equals("Leer")) {
			var Leer prueba = new LeerImpl
			prueba = mySent as Leer
			prueba.generate
		} else if (mySent.eClass.name.equals("Escribir")) {
			var Escribir prueba = new EscribirImpl
			prueba = mySent as Escribir
			prueba.generate
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

	// «myDec.tieneIDs.get(0).nombre»«FOR id:myDec.tieneIDs»«IF id.nombre != myDec.tieneIDs.get(0).nombre», «id.nombre»«ENDIF»«ENDFOR»;
	
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
	
	override generate(DeclaracionPropia myDec) '''
		«myDec.tipo» «pintarVariables(myDec.variable)»
	'''
	
	override generate(DeclaracionVariable myDec) '''
		«myDec.tipo.tipoVariableCpp» «pintarVariables(myDec.variable)»
	'''
	
	def generateAsignacionPunteros(AsignacionNormal asig, List<String> punteros) {
		var asignacion = new String();
		if(punteros.contains(asig.valor_asignacion)) {
			asignacion = "*(" + asig.valor_asignacion + ")";
		}
		else {
			asignacion = asig.valor_asignacion;
		}
		for(matri:asig.mat) {
			asignacion = asignacion + matri.toString;
		}
		asignacion = asignacion + " = " + asig.operador.generate + ";";
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
			concat = concat + myVariable.generate.toString;
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
			var unaria prueba = new unariaImpl
			prueba = myVal as unaria
			prueba.generate
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
		if (valBool.valor == booleano::VERDADERO)
			return "true"
		else
			return "false"
	}

	override generate(ConstCadena cadena) {
		print(cadena.contenido)
	}

	override generate(Caracter caract) {
		print(caract.contenido)
	}

	override generate(VariableID variable) '''
	«variable.nombre»«FOR matri:variable.mat»«matri.toString»«ENDFOR»'''

	//def toC(negacion neg) '''
	//	«neg.nombre»«neg.ssigno»;
	//'''

	override generate(unaria myUnaria) {
		return "!" + myUnaria.variable.generate;
	}
	
	def generateLeerPunteros(Leer l, List<String> punteros) {
		var leer = new String();
		leer = "cin >> ";
		if (l.variable.eClass.name.equals("VariableID")) {
			var VariableID prueba = new VariableIDImpl
			prueba = l.variable as VariableID
			if(punteros.contains(prueba.nombre)) {
				leer = leer + "*(" + prueba.generate + ");"
			}
		}
		else if (l.variable.eClass.name.equals("ValorVector")) {
			var ValorVector prueba = new ValorVectorImpl
			prueba = l.variable as ValorVector
			if(punteros.contains(prueba.nombre_vector)) {
				leer = leer + "*(" + prueba.generate + ");"
			}
		}
		else if (l.variable.eClass.name.equals("ValorMatriz")) {
			var ValorMatriz prueba = new ValorMatrizImpl
			prueba = l.variable as ValorMatriz
			if(punteros.contains(prueba.nombre_matriz)) {
				leer = leer + "*(" + prueba.generate + ");"
			}
		}
		else {
			leer = leer + l.variable.generate + ";";
		}
		return leer;
	}

	override generate(Leer l) '''
		cin >> «l.variable.generate»;
	'''
	
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

	def coutOperadores(EList<operacion> operaciones) {
		var resultado = "";
		for (op : operaciones) {
			resultado = resultado + " << " + op.generate;
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

	override generate(Escribir a) '''
		cout«a.operador.coutOperadores» << endl;
	'''

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
					total = total + op.generate;
					actual = actual + 1;
			}
			else {
				total = total + op.generate;
				actual = actual + 1;
			}
		}
		return total;
	}

	override generate(LlamadaFuncion fun, boolean a) {
		
		var nombreModulo = new String()
		nombreModulo = ""
		
		if(algoritmo != null) {
			for(Modulo m: algoritmo.importaciones) {
				for(CabeceraSubproceso cabecera: m.exporta_funciones) {
					if(cabecera instanceof CabeceraProcedimiento) {
						var cabeceraProc = cabecera as CabeceraProcedimiento
						if(fun.nombre.equals(cabeceraProc.nombre) && fun.operadores.size == cabeceraProc.parametrofuncion.size) {
							nombreModulo = m.nombre
						}
					}
					else if(cabecera instanceof CabeceraFuncion) {
						var cabeceraFun = cabecera as CabeceraFuncion
						if(fun.nombre.equals(cabeceraFun.nombre) && fun.operadores.size == cabeceraFun.parametrofuncion.size) {
							nombreModulo = m.nombre
						}
					}
				}	
			}			
		}
		else if(modulo != null) {
			for(Modulo m: modulo.importaciones) {
				for(CabeceraSubproceso cabecera: m.exporta_funciones) {
					if(cabecera instanceof CabeceraProcedimiento) {
						var cabeceraProc = cabecera as CabeceraProcedimiento
						if(fun.nombre.equals(cabeceraProc.nombre) && fun.operadores.size == cabeceraProc.parametrofuncion.size) {
							nombreModulo = m.nombre
						}
					}
					else if(cabecera instanceof CabeceraFuncion) {
						var cabeceraFun = cabecera as CabeceraFuncion
						if(fun.nombre.equals(cabeceraFun.nombre) && fun.operadores.size == cabeceraFun.parametrofuncion.size) {
							nombreModulo = m.nombre
						}
					}
				}	
			}
		}
		
		'''«IF !nombreModulo.equals("")»
		ref«nombreModulo».«fun.nombre»(«IF subprocesosConPunteros.get(fun.nombre).size() == 0»«fun.operadores.generaParametros»«ELSE»«fun.operadores.generaParametrosPunteros(fun.nombre)»«ENDIF»)«IF a»;«ENDIF»
		«ELSE»
		«fun.nombre»(«IF subprocesosConPunteros.get(fun.nombre).size() == 0»«fun.operadores.generaParametros»«ELSE»«fun.operadores.generaParametrosPunteros(fun.nombre)»«ENDIF»)«IF a»;«ENDIF»«ENDIF»'''
	}
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
		else if (op.eClass.name.equals("Negativa")) {
			var Negativa prueba = new NegativaImpl
			prueba = op as Negativa
			prueba.generate
		}
		else if (op.eClass.name.equals("Negacion")) {
			var Negacion prueba = new NegacionImpl
			prueba = op as Negacion
			prueba.generate
		}
	}
	
	override generate(Suma mySuma) {
		return mySuma.left.generate + " " + mySuma.signo_op + " " + mySuma.right.generate;
	}
	
	override generate(Resta myResta) {
		return myResta.left.generate + " " + myResta.signo_op + " " + myResta.right.generate;
	}
	
	override generate(Multiplicacion myMulti) {
		return myMulti.left.generate + " " + myMulti.signo_op + " " + myMulti.right.generate;
	}
	
	override generate(Division myDivi) {
		return myDivi.left.generate + " " + myDivi.signo_op + " " + myDivi.right.generate;
	}
	
	override generate(Or myOr) {
		return myOr.left.generate + " " + "||" + " " + myOr.right.generate;
	}
	
	override generate(And myAnd) {
		return myAnd.left.generate + " " + "&&" + " " + myAnd.right.generate;
	}
	
	override generate(Comparacion myComparacion) {
		return myComparacion.left.generate + " " + myComparacion.signo_op + " " + myComparacion.right.generate;
	}
	
	override generate(Igualdad myIgualdad) {
		return myIgualdad.left.generate + " " + myIgualdad.signo_op + " " + myIgualdad.right.generate;
	}
	
	override generate(Negativa myNegativa) {
		return "( - " + myNegativa.valor_operacion.generate + ")";
	}
	
	override generate(Negacion myNegacion) {
		return "!" + myNegacion.valor_operacion.generate;
	}
	
	def generateSiPunteros(Si mySi, List<String> punteros) '''
		if(«mySi.valor.generate»){
			«FOR sent:mySi.sentencias»
				«sent.generatePunteros(punteros)»
			«ENDFOR»
			«IF mySi.devuelve != null» 
				«mySi.devuelve.generate»
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
				«myCaso.devuelve.generate»
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
			«FOR cas:mySegun.caso»
				«cas.generate» 
			«ENDFOR»
			default:
				«FOR sent:mySegun.sentencias»
					«sent.generatePunteros(punteros)»
				«ENDFOR»
				«IF mySegun.devuelve != null» 
				«mySegun.devuelve.generate»
				«ENDIF»
			break;
		}
	'''
	
	override generate(segun mySegun) '''
		switch(«mySegun.valor.generate»){
			«FOR cas:mySegun.caso»
				«cas.generate» 
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
	
	def generateSinoPunteros(Sino mySino, List<String> punteros) '''
		else{
			«FOR sent:mySino.sentencias»	
				«sent.generatePunteros(punteros)»
			«ENDFOR»
			«IF mySino.devuelve != null» 
			«mySino.devuelve.generate»
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
	def generateRepetirPunteros(repetir m, List<String> punteros) '''
		do{
			«FOR sent:m.sentencias»
				«sent.generatePunteros(punteros)»
			«ENDFOR»
		}while(«m.valor.generate»);
	'''

	override generate(repetir m) '''
		do{
			«FOR sent:m.sentencias»
				«sent.generate»
			«ENDFOR»
		}while(«m.valor.generate»);
	'''

}