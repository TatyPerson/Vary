package vary.pseudocodigo.dsl.c.validation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.IContainer;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.IResourceDescription;
import org.eclipse.xtext.resource.IResourceDescriptions;
import org.eclipse.xtext.resource.impl.ResourceDescriptionsProvider;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.validation.CheckType;

import com.google.inject.Inject;

import vary.pseudocodigo.dsl.c.resources.VaryGrammarIndex;
import vary.pseudocodigo.dsl.c.validation.messages.ReadMessagesValidator;
import vary.pseudocodigo.dsl.c.validation.messages.ReadMessagesValidatorInterface;
import diagramapseudocodigo.Algoritmo;
import diagramapseudocodigo.And;
import diagramapseudocodigo.Archivo;
import diagramapseudocodigo.Asignacion;
import diagramapseudocodigo.AsignacionCompleja;
import diagramapseudocodigo.AsignacionNormal;
import diagramapseudocodigo.Bloque;
import diagramapseudocodigo.CabeceraFuncion;
import diagramapseudocodigo.CabeceraProcedimiento;
import diagramapseudocodigo.CabeceraSubproceso;
import diagramapseudocodigo.CampoRegistro;
import diagramapseudocodigo.Caracter;
import diagramapseudocodigo.Caso;
import diagramapseudocodigo.Comparacion;
import diagramapseudocodigo.ConstCadena;
import diagramapseudocodigo.Constantes;
import diagramapseudocodigo.Declaracion;
import diagramapseudocodigo.DeclaracionPropia;
import diagramapseudocodigo.DeclaracionVariable;
import diagramapseudocodigo.Devolver;
import diagramapseudocodigo.DiagramapseudocodigoPackage;
import diagramapseudocodigo.Division;
import diagramapseudocodigo.Enumerado;
import diagramapseudocodigo.Escribir;
import diagramapseudocodigo.Funcion;
import diagramapseudocodigo.FuncionFicheroAbrir;
import diagramapseudocodigo.FuncionFicheroCerrar;
import diagramapseudocodigo.Igualdad;
import diagramapseudocodigo.Implementacion;
import diagramapseudocodigo.Inicio;
import diagramapseudocodigo.Leer;
import diagramapseudocodigo.LlamadaFuncion;
import diagramapseudocodigo.Matriz;
import diagramapseudocodigo.Modulo;
import diagramapseudocodigo.Multiplicacion;
import diagramapseudocodigo.Negacion;
import diagramapseudocodigo.Negativa;
import diagramapseudocodigo.NumeroDecimal;
import diagramapseudocodigo.NumeroEntero;
import diagramapseudocodigo.Operador;
import diagramapseudocodigo.Or;
import diagramapseudocodigo.ParametroFuncion;
import diagramapseudocodigo.Procedimiento;
import diagramapseudocodigo.Registro;
import diagramapseudocodigo.Resta;
import diagramapseudocodigo.Sentencias;
import diagramapseudocodigo.Si;
import diagramapseudocodigo.Subproceso;
import diagramapseudocodigo.Subrango;
import diagramapseudocodigo.SubrangoEnumerado;
import diagramapseudocodigo.SubrangoNumerico;
import diagramapseudocodigo.Suma;
import diagramapseudocodigo.TipoComplejo;
import diagramapseudocodigo.TipoDefinido;
import diagramapseudocodigo.ValorBooleano;
import diagramapseudocodigo.ValorMatriz;
import diagramapseudocodigo.ValorRegistro;
import diagramapseudocodigo.ValorVector;
import diagramapseudocodigo.Variable;
import diagramapseudocodigo.VariableID;
import diagramapseudocodigo.Vector;
import diagramapseudocodigo.desde;
import diagramapseudocodigo.mientras;
import diagramapseudocodigo.operacion;
import diagramapseudocodigo.repetir;
import diagramapseudocodigo.segun;
import diagramapseudocodigo.unaria;
import diagramapseudocodigo.valor;

public class VaryGrammarValidator extends AbstractVaryGrammarValidator {
	public static final String INVALID_VAR_NAME = "xtext.workshop.advanced.quickfix.InvalidTypeName";
	public static final String CONSTANTE_NO_DEFINIDA = "vary.pseudocodigo.dsl.c.VaryGrammar.ConstanteNoDefinida";
	public static final String DUPLICATE_MODULE = "vary.pseudocodigo.dsl.c.VaryGrammar.DuplicateModule";
	public static final String VARIABLE_NO_DEFINIDA = "vary.pseudocodigo.dsl.c.VaryGrammar.VariableNoDefinida";
	public static final String NOMBRE_MODULO_REPETIDO = "vary.pseudocodigo.dsl.c.VaryGrammar.NombreModuloRepetido";
	protected final ReadMessagesValidatorInterface readerMessages;

	@Inject
	ResourceDescriptionsProvider resourceDescriptionsProvider;
	@Inject VaryGrammarIndex index;
	@Inject IQualifiedNameProvider nameProvider;

	@Inject
	IContainer.Manager containerManager;
	
	private static VaryGrammarValidatorAux funciones = new VaryGrammarValidatorAux();
	
	@Inject
	IResourceDescriptions resDescriptions;
	
	@Inject
	public VaryGrammarValidator() {
		readerMessages = new ReadMessagesValidator();
	}
	
	public VaryGrammarValidator(String url) {
		readerMessages = new vary.pseudocodigo.dsl.c.validation.english.messages.ReadMessagesValidator();
	}
	

	@Check(CheckType.NORMAL)
	public void checkNameModuleDuplicate(Modulo modulo) {
		Set<QualifiedName> names = new HashSet<QualifiedName>();
		IResourceDescriptions resourceDescriptions = resourceDescriptionsProvider.getResourceDescriptions(modulo.eResource());
		IResourceDescription resourceDescription = resourceDescriptions.getResourceDescription(modulo.eResource().getURI());
		for (IContainer c : containerManager.getVisibleContainers(resourceDescription, resourceDescriptions)) {
			for (IEObjectDescription od : c.getExportedObjectsByType(DiagramapseudocodigoPackage.Literals.MODULO)) {
				if (!names.add(od.getQualifiedName())) {
					error(readerMessages.getString("MODULO_NOMBRE_REPETIDO", modulo.getNombre()), DiagramapseudocodigoPackage.Literals.MODULO__NOMBRE, NOMBRE_MODULO_REPETIDO);
				}
			}
		}
	}
	
	@Check(CheckType.NORMAL)
	public void checkEsUnico(Algoritmo algoritmo) {
		Set<QualifiedName> names = new HashSet<QualifiedName>();
		IResourceDescriptions resourceDescriptions = resourceDescriptionsProvider.getResourceDescriptions(algoritmo.eResource());
		IResourceDescription resourceDescription = resourceDescriptions.getResourceDescription(algoritmo.eResource().getURI());
		for (IContainer c : containerManager.getVisibleContainers(resourceDescription, resourceDescriptions)) {
			for (IEObjectDescription od : c.getExportedObjectsByType(DiagramapseudocodigoPackage.Literals.ALGORITMO)) {
				if (!names.add(od.getQualifiedName()) || names.size() > 1) {
					error(readerMessages.getBundle().getString("ALGORITMO_REPETIDO"), DiagramapseudocodigoPackage.Literals.ALGORITMO__NOMBRE);
				}
			}
		}
	}
	
	protected void checkUsoParametroSAux(operacion op, List<String> parametrosTipoS) {
		if(op instanceof Suma) {
			Suma suma = (Suma) op;
			if(suma.getRight() instanceof VariableID) {
				VariableID variable = (VariableID) suma.getRight();
				if(parametrosTipoS.contains(variable.getNombre())) {
					error(readerMessages.getString("USO_VARIABLE_TIPO_S", variable.getNombre()), variable, DiagramapseudocodigoPackage.Literals.VARIABLE_ID__NOMBRE);
				}
			}
			else if(suma.getLeft() instanceof VariableID) {
				VariableID variable = (VariableID) suma.getLeft();
				if(parametrosTipoS.contains(variable.getNombre())) {
					error(readerMessages.getString("USO_VARIABLE_TIPO_S", variable.getNombre()), variable, DiagramapseudocodigoPackage.Literals.VARIABLE_ID__NOMBRE);
				}
			}
		}
		else if(op instanceof Resta) {
			Resta resta = (Resta) op;
			if(resta.getRight() instanceof VariableID) {
				VariableID variable = (VariableID) resta.getRight();
				if(parametrosTipoS.contains(variable.getNombre())) {
					error(readerMessages.getString("USO_VARIABLE_TIPO_S", variable.getNombre()), variable, DiagramapseudocodigoPackage.Literals.VARIABLE_ID__NOMBRE);
				}
			}
			else if(resta.getLeft() instanceof VariableID) {
				VariableID variable = (VariableID) resta.getLeft();
				if(parametrosTipoS.contains(variable.getNombre())) {
					error(readerMessages.getString("USO_VARIABLE_TIPO_S", variable.getNombre()), variable, DiagramapseudocodigoPackage.Literals.VARIABLE_ID__NOMBRE);
				}
			}
		}
		else if(op instanceof Multiplicacion) {
			Multiplicacion multiplicacion = (Multiplicacion) op;
			if(multiplicacion.getRight() instanceof VariableID) {
				VariableID variable = (VariableID) multiplicacion.getRight();
				if(parametrosTipoS.contains(variable.getNombre())) {
					error(readerMessages.getString("USO_VARIABLE_TIPO_S", variable.getNombre()), variable, DiagramapseudocodigoPackage.Literals.VARIABLE_ID__NOMBRE);
				}
			}
			else if(multiplicacion.getLeft() instanceof VariableID) {
				VariableID variable = (VariableID) multiplicacion.getLeft();
				if(parametrosTipoS.contains(variable.getNombre())) {
					error(readerMessages.getString("USO_VARIABLE_TIPO_S", variable.getNombre()), variable, DiagramapseudocodigoPackage.Literals.VARIABLE_ID__NOMBRE);
				}
			}
		}
		else if(op instanceof Division) {
			Division division = (Division) op;
			if(division.getRight() instanceof VariableID) {
				VariableID variable = (VariableID) division.getRight();
				if(parametrosTipoS.contains(variable.getNombre())) {
					error(readerMessages.getString("USO_VARIABLE_TIPO_S", variable.getNombre()), variable, DiagramapseudocodigoPackage.Literals.VARIABLE_ID__NOMBRE);
				}
			}
			else if(division.getLeft() instanceof VariableID) {
				VariableID variable = (VariableID) division.getLeft();
				if(parametrosTipoS.contains(variable.getNombre())) {
					error(readerMessages.getString("USO_VARIABLE_TIPO_S", variable.getNombre()), variable, DiagramapseudocodigoPackage.Literals.VARIABLE_ID__NOMBRE);
				}
			}
		}
		else if(op instanceof Igualdad) {
			Igualdad igualdad = (Igualdad) op;
			if(igualdad.getRight() instanceof VariableID) {
				VariableID variable = (VariableID) igualdad.getRight();
				if(parametrosTipoS.contains(variable.getNombre())) {
					error(readerMessages.getString("USO_VARIABLE_TIPO_S", variable.getNombre()), variable, DiagramapseudocodigoPackage.Literals.VARIABLE_ID__NOMBRE);
				}
			}
			else if(igualdad.getLeft() instanceof VariableID) {
				VariableID variable = (VariableID) igualdad.getLeft();
				if(parametrosTipoS.contains(variable.getNombre())) {
					error(readerMessages.getString("USO_VARIABLE_TIPO_S", variable.getNombre()), variable, DiagramapseudocodigoPackage.Literals.VARIABLE_ID__NOMBRE);
				}
			}
		}
		else if(op instanceof Comparacion) {
			Comparacion comparacion = (Comparacion) op;
			if(comparacion.getRight() instanceof VariableID) {
				VariableID variable = (VariableID) comparacion.getRight();
				if(parametrosTipoS.contains(variable.getNombre())) {
					error(readerMessages.getString("USO_VARIABLE_TIPO_S", variable.getNombre()), variable, DiagramapseudocodigoPackage.Literals.VARIABLE_ID__NOMBRE);
				}
			}
			else if(comparacion.getLeft() instanceof VariableID) {
				VariableID variable = (VariableID) comparacion.getLeft();
				if(parametrosTipoS.contains(variable.getNombre())) {
					error(readerMessages.getString("USO_VARIABLE_TIPO_S", variable.getNombre()), variable, DiagramapseudocodigoPackage.Literals.VARIABLE_ID__NOMBRE);
				}
			}
		}
		else if(op instanceof And) {
			And and = (And) op;
			if(and.getRight() instanceof VariableID) {
				VariableID variable = (VariableID) and.getRight();
				if(parametrosTipoS.contains(variable.getNombre())) {
					error(readerMessages.getString("USO_VARIABLE_TIPO_S", variable.getNombre()), variable, DiagramapseudocodigoPackage.Literals.VARIABLE_ID__NOMBRE);
				}
			}
			else if(and.getLeft() instanceof VariableID) {
				VariableID variable = (VariableID) and.getLeft();
				if(parametrosTipoS.contains(variable.getNombre())) {
					error(readerMessages.getString("USO_VARIABLE_TIPO_S", variable.getNombre()), variable, DiagramapseudocodigoPackage.Literals.VARIABLE_ID__NOMBRE);
				}
			}
		}
		else if(op instanceof Or) {
			Or or = (Or) op;
			if(or.getRight() instanceof VariableID) {
				VariableID variable = (VariableID) or.getRight();
				if(parametrosTipoS.contains(variable.getNombre())) {
					error(readerMessages.getString("USO_VARIABLE_TIPO_S", variable.getNombre()), variable, DiagramapseudocodigoPackage.Literals.VARIABLE_ID__NOMBRE);
				}
			}
			else if(or.getLeft() instanceof VariableID) {
				VariableID variable = (VariableID) or.getLeft();
				if(parametrosTipoS.contains(variable.getNombre())) {
					error(readerMessages.getString("USO_VARIABLE_TIPO_S", variable.getNombre()), variable, DiagramapseudocodigoPackage.Literals.VARIABLE_ID__NOMBRE);
				}
			}
		}
		else if(op instanceof VariableID) {
			VariableID variable = (VariableID) op;
			if(parametrosTipoS.contains(variable.getNombre())) {
				error(readerMessages.getString("USO_VARIABLE_TIPO_S", variable.getNombre()), variable, DiagramapseudocodigoPackage.Literals.VARIABLE_ID__NOMBRE);
			}
		}
	}
	
	protected void checkUsoParametroSRec(List<Sentencias> sentencias, List<String> parametrosTipoS) {
		for(Sentencias sen: sentencias) {
			if(sen instanceof AsignacionNormal) {
				AsignacionNormal asignacion = (AsignacionNormal) sen;
				if(asignacion.getOperador() instanceof operacion) {
					operacion op = (operacion) asignacion.getOperador();
					checkUsoParametroSAux(op, parametrosTipoS);
				}
			}
			else if(sen instanceof AsignacionCompleja) {
				AsignacionCompleja asignacion = (AsignacionCompleja) sen;
				if(asignacion.getOperador() instanceof operacion) {
					operacion op = (operacion) asignacion.getOperador();
					checkUsoParametroSAux(op, parametrosTipoS);
				}
			}
			else if(sen instanceof LlamadaFuncion) {
				LlamadaFuncion llamadaFuncion = (LlamadaFuncion) sen;
				for(operacion op: llamadaFuncion.getOperadores()) {
					checkUsoParametroSAux(op, parametrosTipoS);
				}
			}
			else if(sen instanceof Bloque) {
				Bloque bloque = (Bloque) sen;
				if(bloque instanceof Si) {
					Si si = (Si) bloque;
					checkUsoParametroSRec(si.getSentencias(), parametrosTipoS);
					checkUsoParametroSAux(si.getDevuelve().getDevuelve(), parametrosTipoS);
					checkUsoParametroSAux(si.getValor(), parametrosTipoS);
					checkUsoParametroSRec(si.getSino().getSentencias(), parametrosTipoS);
					checkUsoParametroSAux(si.getSino().getDevuelve().getDevuelve(), parametrosTipoS);
				}
				else if(bloque instanceof segun) {
					segun seg = (segun) bloque;
					for(Caso caso: seg.getCaso()) {
						checkUsoParametroSRec(caso.getSentencias(), parametrosTipoS);
						checkUsoParametroSAux(caso.getDevuelve().getDevuelve(), parametrosTipoS);
					}
					checkUsoParametroSRec(seg.getSentencias(), parametrosTipoS);
					checkUsoParametroSAux(seg.getDevuelve().getDevuelve(), parametrosTipoS);
				}
				else if(bloque instanceof mientras) {
					mientras m = (mientras) bloque;
					checkUsoParametroSRec(m.getSentencias(), parametrosTipoS);
					checkUsoParametroSAux(m.getValor(), parametrosTipoS);
				}
				else if(bloque instanceof repetir) {
					repetir r = (repetir) bloque;
					checkUsoParametroSRec(r.getSentencias(), parametrosTipoS);
					checkUsoParametroSAux(r.getValor(), parametrosTipoS);
				}
				else if(bloque instanceof desde) {
					desde d = (desde) bloque;
					checkUsoParametroSRec(d.getSentencias(), parametrosTipoS);
					checkUsoParametroSAux(d.getValor(), parametrosTipoS);
					checkUsoParametroSAux(d.getAsignacion().getOperador(), parametrosTipoS);
				}
			}
			else if(sen instanceof Devolver) {
				Devolver devolver = (Devolver) sen;
				checkUsoParametroSAux(devolver.getDevuelve(), parametrosTipoS);
			}
			else if(sen instanceof Escribir) {
				Escribir escribir = (Escribir) sen;
				for(operacion opAux: escribir.getOperador()) {
					checkUsoParametroSAux(opAux, parametrosTipoS);
				}
			}
		}
	}
	
	@Check
	//Función que comproba que dentro de un subproceso no se use un parámetro S de forma incorrecta
	protected void checkUsoParametroS(Subproceso s) {
		//Primero registramos todos los parametros de tipo S (si los hay)
		List<String> parametrosTipoS = new ArrayList<String>();
		for(ParametroFuncion p: s.getParametrofuncion()) {
			if(p.getPaso().equals(readerMessages.getBundle().getString("TIPO_PASO_SALIDA"))) {
				parametrosTipoS.add(p.getVariable().getNombre());
			}
		}
		
		//Posteriormente comprobamos el valor de esos parámetros no sea usado
		checkUsoParametroSRec(s.getSentencias(), parametrosTipoS);
	}
	
	@Check
	//Función que se encarga de que no existan funciones repetidas definidas en los módulos que importa
	protected void checkFuncionesModulosImportados(Algoritmo a) {
		//Primero se comprueba las que están definidas en el algoritmo con las que estan definidas en los módulos que importa
		for(Modulo m: a.getImportaciones()) {
			for(Subproceso s: a.getFuncion()) {
				for(CabeceraSubproceso cabecera: m.getExporta_funciones()) {
					if(cabecera instanceof CabeceraFuncion) {
						CabeceraFuncion cabeceraFuncion = (CabeceraFuncion) cabecera;
						if(cabeceraFuncion.getNombre().equals(s.getNombre()) && cabeceraFuncion.getParametrofuncion().size() == s.getParametrofuncion().size()) {
							error(readerMessages.getString("FUNCION_REPETIDA", s.getNombre(), m.getNombre()), s, DiagramapseudocodigoPackage.Literals.SUBPROCESO__NOMBRE);
						}
					}
					else if(cabecera instanceof CabeceraSubproceso) {
						CabeceraProcedimiento cabeceraProcedimiento = (CabeceraProcedimiento) cabecera;
						if(cabeceraProcedimiento.getNombre().equals(s.getNombre()) && cabeceraProcedimiento.getParametrofuncion().size() == s.getParametrofuncion().size()) {
							error(readerMessages.getString("PROCEDIMIENTO_REPETIDO", s.getNombre(), m.getNombre()), s, DiagramapseudocodigoPackage.Literals.SUBPROCESO__NOMBRE);
						}
					}
				}
			}
		}
		
		//Después la de los módulos que se importan entre sí
		
		for(Modulo m: a.getImportaciones()) {
			for(Modulo m2: a.getImportaciones()) {
				if(!m.getNombre().equals(m2.getNombre())) { //Nos saltamos a él mismo
					for(CabeceraSubproceso cabecera: m.getExporta_funciones()) {
						for(CabeceraSubproceso cabecera2: m2.getExporta_funciones()) {
							if(cabecera.getNombre().equals(cabecera2.getNombre()) && cabecera.getParametrofuncion().size() == cabecera2.getParametrofuncion().size()) {
								if(cabecera instanceof CabeceraFuncion) {
									error(readerMessages.getString("FUNCION_REPETIDA_IMPORTADA", cabecera.getNombre(), m.getNombre(), m2.getNombre()), a, DiagramapseudocodigoPackage.Literals.ALGORITMO__IMPORTACIONES, a.getImportaciones().indexOf(m));
								}
								else {
									error(readerMessages.getString("PROCEDIMIENTO_REPETIDO_IMPORTADO", cabecera.getNombre(), m.getNombre(), m2.getNombre()), a, DiagramapseudocodigoPackage.Literals.ALGORITMO__IMPORTACIONES, a.getImportaciones().indexOf(m));
								}
							}
						}
					}
				}
			}
		}
	}
	
	
	@Check
	protected void checkCiclosImportacion(Algoritmo a) {
		for(Modulo m: a.getImportaciones()) {
			for(Modulo m2: m.getImportaciones()) {
				if(a.getImportaciones().contains(m2)) {
					error(readerMessages.getString("CICLO_IMPORTACION", m.getNombre(), m2.getNombre()), a, DiagramapseudocodigoPackage.Literals.ALGORITMO__IMPORTACIONES, a.getImportaciones().indexOf(m));
				}
			}
		}
	}
	
	@Check
	protected void checkCiclosImportacion(Modulo modulo) {
		for(Modulo m: modulo.getImportaciones()) {
			for(Modulo m2: m.getImportaciones()) {
				if(modulo.getImportaciones().contains(m2)) {
					error(readerMessages.getString("CICLO_IMPORTACION", m.getNombre(), m2.getNombre()), modulo, DiagramapseudocodigoPackage.Literals.ALGORITMO__IMPORTACIONES, modulo.getImportaciones().indexOf(m));
				}
			}
		}
	}
	
	@Check
	protected void checkCabeceraSubprocesoExistente(Modulo m) {
		boolean funcionDefinida = false;
		for(CabeceraSubproceso cabecera: m.getExporta_funciones()) {
			for(Subproceso s: m.getImplementacion().getFuncion()) {
				if(cabecera.getNombre().equals(s.getNombre()) && cabecera.getParametrofuncion().size() == s.getParametrofuncion().size()) {
					funcionDefinida = true;
				}
			}
			if(!funcionDefinida) {
				if(cabecera instanceof CabeceraFuncion) {
					error(readerMessages.getString("CABECERA_FUNCION_NO_DEFINIDA", cabecera.getNombre()), cabecera, DiagramapseudocodigoPackage.Literals.CABECERA_SUBPROCESO__NOMBRE);
				}
				else {
					error(readerMessages.getString("CABECERA_PROCEDIMIENTO_NO_DEFINIDO", cabecera.getNombre()), cabecera, DiagramapseudocodigoPackage.Literals.CABECERA_SUBPROCESO__NOMBRE);
				}
			}
			funcionDefinida = false;
		}
	}
	
	@Check
	protected void checkCabecerasRepetidas(Modulo m) {
		int repeticiones = 0;
		for(CabeceraSubproceso cabecera1: m.getExporta_funciones()) {
			for(CabeceraSubproceso cabecera2: m.getExporta_funciones()) {
				if(cabecera1.getNombre().equals(cabecera2.getNombre()) && cabecera1.getParametrofuncion().size() == cabecera2.getParametrofuncion().size()) {
					repeticiones++;
				}
			}
			if(repeticiones > 1) {
				if(cabecera1 instanceof CabeceraFuncion) {
					error(readerMessages.getString("CABECERA_REPETIDA_FUNCION", cabecera1.getNombre()), cabecera1, DiagramapseudocodigoPackage.Literals.CABECERA_SUBPROCESO__NOMBRE);
				} else {
					error(readerMessages.getString("CABECERA_REPETIDA_PROCEDIMIENTO", cabecera1.getNombre()), cabecera1, DiagramapseudocodigoPackage.Literals.CABECERA_SUBPROCESO__NOMBRE);
				}
			}
			repeticiones = 0;
		}
	}
	
	@Check
	protected void checkConstantesNoDeclaradasExportadas(Modulo m) {
		boolean constanteDefinida = false;
		for(String nombreConstante: m.getExporta_constantes()) {
			for(Constantes constante: m.getImplementacion().getConstantes()) {
				if(nombreConstante.equals(constante.getVariable().getNombre())) {
					constanteDefinida = true;
				}
			}
			if(!constanteDefinida) {
				error(readerMessages.getString("CONSTANTE_NO_DECLARADA", nombreConstante), m, DiagramapseudocodigoPackage.Literals.MODULO__EXPORTA_CONSTANTES, m.getExporta_constantes().indexOf(nombreConstante));
			}
			constanteDefinida = false;
		}
	}
	
	@Check
	protected void checkTiposExportadosNoDefinidos(Modulo m) {
		boolean tipoDefinido = false;
		for(String nombreTipo: m.getExporta_tipos()) {
			for(TipoComplejo complejo: m.getImplementacion().getTipocomplejo()) {
				if(complejo instanceof Vector) {
					Vector v = (Vector) complejo;
					if(v.getNombre().equals(nombreTipo)) {
						tipoDefinido = true;
					}
				} else if(complejo instanceof Matriz) {
					Matriz matriz = (Matriz) complejo;
					if(matriz.getNombre().equals(nombreTipo)) {
						tipoDefinido = true;
					}
				} else if(complejo instanceof Registro) {
					Registro r = (Registro) complejo;
					if(r.getNombre().equals(nombreTipo)) {
						tipoDefinido = true;
					}
				} else if(complejo instanceof Enumerado) {
					Enumerado e = (Enumerado) complejo;
					if(e.getNombre().equals(nombreTipo)) {
						tipoDefinido = true;
					}
				} else if(complejo instanceof Subrango) {
					Subrango s = (Subrango) complejo;
					if(s.getNombre().equals(nombreTipo)) {
						tipoDefinido = true;
					}
				} else if(complejo instanceof Archivo) {
					Archivo a = (Archivo) complejo;
					if(a.getNombre().equals(nombreTipo)) {
						tipoDefinido = true;
					}
				}
			}
			if(!tipoDefinido) {
				error(readerMessages.getString("TIPO_NO_DEFINIDO", nombreTipo), m, DiagramapseudocodigoPackage.Literals.MODULO__EXPORTA_TIPOS, m.getExporta_tipos().indexOf(nombreTipo));
			}
			tipoDefinido = false;
		}
	}
	
	@Check
	protected void checkVariablesExportadas(Modulo m) {
		Map<String,String> variablesTipadas = funciones.registrarVariablesTipadas(m.getImplementacion().getGlobal());
		for(Declaracion declaracion: m.getExporta_global()) {
			if(declaracion instanceof DeclaracionVariable) {
				DeclaracionVariable declaracionVariable = (DeclaracionVariable) declaracion;
				for(Variable v: declaracionVariable.getVariable()) {
					if(variablesTipadas.containsKey(v.getNombre())) {
						if(!variablesTipadas.get(v.getNombre()).equals(declaracionVariable.getTipo())) {
							error(readerMessages.getString("EXPORTA_VARIABLE_TIPO_INCORRECTO", v.getNombre(), variablesTipadas.get(v.getNombre())), m, DiagramapseudocodigoPackage.Literals.MODULO__EXPORTA_GLOBAL, m.getExporta_global().indexOf(declaracionVariable));
						}
					}
					else {
						error(readerMessages.getString("VARIABLE_NO_DECLARADA", v.getNombre()), m, DiagramapseudocodigoPackage.Literals.MODULO__EXPORTA_GLOBAL, m.getExporta_global().indexOf(declaracionVariable));
						
					}
				}
			} else {
				DeclaracionPropia declaracionPropia = (DeclaracionPropia) declaracion;
				for(Variable v: declaracionPropia.getVariable()) {
					if(variablesTipadas.containsKey(v.getNombre())) {
						if(!variablesTipadas.get(v.getNombre()).equals(declaracionPropia.getTipo())) {
							error(readerMessages.getString("EXPORTA_VARIABLE_TIPO_INCORRECTO", v.getNombre(), variablesTipadas.get(v.getNombre())), m, DiagramapseudocodigoPackage.Literals.MODULO__EXPORTA_GLOBAL, m.getExporta_global().indexOf(declaracionPropia));
						}
					}
					else {
						error(readerMessages.getString("VARIABLE_NO_DECLARADA", v.getNombre()), m, DiagramapseudocodigoPackage.Literals.MODULO__EXPORTA_GLOBAL, m.getExporta_global().indexOf(declaracionPropia));
					}
				}
			}
		}
		
	}
	
	@Check
	protected void checkFuncionesModulosImportados(Modulo m) {
		for(Modulo mAux: m.getImportaciones()) {
			for(Subproceso s: m.getImplementacion().getFuncion()) {
				for(CabeceraSubproceso cabecera: mAux.getExporta_funciones()) {
					if(cabecera instanceof CabeceraFuncion) {
						CabeceraFuncion cabeceraFuncion = (CabeceraFuncion) cabecera;
						if(cabeceraFuncion.getNombre().equals(s.getNombre()) && cabeceraFuncion.getParametrofuncion().size() == s.getParametrofuncion().size()) {
							error(readerMessages.getString("FUNCION_REPETIDA", s.getNombre(), mAux.getNombre()), s, DiagramapseudocodigoPackage.Literals.SUBPROCESO__NOMBRE);
						}
					}
					else if(cabecera instanceof CabeceraSubproceso) {
						CabeceraProcedimiento cabeceraProcedimiento = (CabeceraProcedimiento) cabecera;
						if(cabeceraProcedimiento.getNombre().equals(s.getNombre()) && cabeceraProcedimiento.getParametrofuncion().size() == s.getParametrofuncion().size()) {
							error(readerMessages.getString("PROCEDIMIENTO_REPETIDO", s.getNombre(), mAux.getNombre()), s, DiagramapseudocodigoPackage.Literals.SUBPROCESO__NOMBRE);
						}
					}
				}
			}
		}
		
		//Después la de los módulos que se importan entre sí
		
		for(Modulo mAux: m.getImportaciones()) {
			for(Modulo mAux2: m.getImportaciones()) {
				if(!mAux.getNombre().equals(mAux2.getNombre())) { //Nos saltamos a él mismo
					for(CabeceraSubproceso cabecera: mAux.getExporta_funciones()) {
						for(CabeceraSubproceso cabecera2: mAux2.getExporta_funciones()) {
							if(cabecera.getNombre().equals(cabecera2.getNombre()) && cabecera.getParametrofuncion().size() == cabecera2.getParametrofuncion().size()) {
								if(cabecera instanceof CabeceraFuncion) {
									error(readerMessages.getString("FUNCION_REPETIDA_IMPORTADA", cabecera.getNombre(), mAux.getNombre(), mAux2.getNombre()), m, DiagramapseudocodigoPackage.Literals.MODULO__IMPORTACIONES, m.getImportaciones().indexOf(mAux));
								}
								else {
									error(readerMessages.getString("PROCEDIMIENTO_REPETIDO_IMPORTADO", cabecera.getNombre(), mAux.getNombre(), mAux2.getNombre()), m, DiagramapseudocodigoPackage.Literals.MODULO__IMPORTACIONES, m.getImportaciones().indexOf(mAux));
								}
							}
						}
					}
				}
			}
		}
	}
	
	@Check
	//Función que se encarga de comprobar si los módulos importados exportan variables con el mismo nombre que las globales
	protected void checkAlgortimoGlobalesExportadas(Algoritmo a) {
		Map<String,String> variablesGlobalesAlgoritmo = funciones.registrarVariablesTipadas(a.getGlobal());
		List<String> nombresVariablesModulos = new ArrayList<String>();
		
		for(Modulo m: a.getImportaciones()) {
			nombresVariablesModulos = funciones.registrarVariables(m.getExporta_global());
			for(String nombreVariable: nombresVariablesModulos) {
				if(variablesGlobalesAlgoritmo.containsKey(nombreVariable)) {
					error(readerMessages.getString("VARIABLE_REPETIDA_MODULO", nombreVariable, m.getNombre()), DiagramapseudocodigoPackage.Literals.ALGORITMO__GLOBAL, a.getGlobal().indexOf(variablesGlobalesAlgoritmo.get(nombreVariable)));
				}
			}
			
		}
	}
	
	@Check
	//Función que se encarga de comprobar si los módulos importados exportan variables con el mismo nombre que las globales del módulo principal
	protected void checkModuloGlobalesExportadas(Modulo m) {
		Map<String, String> variablesGlobalesModuloPrincipal = funciones.registrarVariablesTipadas(m.getImplementacion().getGlobal());
		List<String> nombresVariablesModulos = new ArrayList<String>();
		
		for(Modulo mAux: m.getImportaciones()) {
			nombresVariablesModulos = funciones.registrarVariables(mAux.getExporta_global());
			for(String nombreVariable: nombresVariablesModulos) {
				if(variablesGlobalesModuloPrincipal.containsKey(nombreVariable)) {
					error(readerMessages.getString("VARIABLE_REPETIDA_MODULO", nombreVariable, m.getNombre()), m.getImplementacion(), DiagramapseudocodigoPackage.Literals.IMPLEMENTACION__GLOBAL, m.getImplementacion().getGlobal().indexOf(variablesGlobalesModuloPrincipal.get(nombreVariable)));
				}
			}
		}
	}
	
	@Check
	//Función que se encarga de comprobar de que los módulos importados no contengan variables exportadas con el mismo nombre
	protected void checkVariablesExportadasModulos(Algoritmo a) {
		List<String> variablesModulo1 = new ArrayList<String>();
		List<String> variablesModulo2 = new ArrayList<String>();
		for(Modulo m: a.getImportaciones()) {
			for(Modulo m2: a.getImportaciones()) {
				if(!m.getNombre().equals(m2.getNombre())) {
					variablesModulo1 = funciones.registrarVariables(m.getExporta_global());
					variablesModulo2 = funciones.registrarVariables(m2.getExporta_global());
					for(String nombreVariable: variablesModulo1) {
						if(variablesModulo2.contains(nombreVariable)) {
							error(readerMessages.getString("VARIABLE_REPETIDA_MODULO_IMPORTADA", nombreVariable, m.getNombre(), m2.getNombre()), DiagramapseudocodigoPackage.Literals.ALGORITMO__IMPORTACIONES, a.getImportaciones().indexOf(m));
						}
					}
				}
			}
		}
	}
	
	@Check
	//Función que se encarga de comprobar de que los módulos importados no contengan variables exportadas con el mismo nombre
	protected void checkVariablesExportadasModulos(Modulo m) {
		List<String> variablesModulo1 = new ArrayList<String>();
		List<String> variablesModulo2 = new ArrayList<String>();
		for(Modulo mAux: m.getImportaciones()) {
			for(Modulo mAux2: m.getImportaciones()) {
				if(!mAux.getNombre().equals(mAux2.getNombre())) {
					variablesModulo1 = funciones.registrarVariables(mAux.getExporta_global());
					variablesModulo2 = funciones.registrarVariables(mAux2.getExporta_global());
					for(String nombreVariable: variablesModulo1) {
						if(variablesModulo2.contains(nombreVariable)) {
							error(readerMessages.getString("VARIABLE_REPETIDA_MODULO_IMPORTADA", nombreVariable, mAux.getNombre(), mAux2.getNombre()), DiagramapseudocodigoPackage.Literals.MODULO__IMPORTACIONES, m.getImportaciones().indexOf(mAux));
						}
					}
				}
			}
		}
	}
	
	@Check
	//Función que se encarga de comprobar que el módulo importado no exporte un tipo con el mismo nombre que uno de los del algoritmo
	protected void checkTiposExportadosModulo(Algoritmo a) {
		List<String> nombreTiposAlgoritmo = funciones.registrarTipos(a.getTipocomplejo());
		
		for(Modulo m: a.getImportaciones()) {
			for(String nombreTipo: m.getExporta_tipos()) {
				if(nombreTiposAlgoritmo.contains(nombreTipo)) {
					error(readerMessages.getString("TIPO_REPETIDO_MODULO", nombreTipo, m.getNombre()), DiagramapseudocodigoPackage.Literals.ALGORITMO__TIPOCOMPLEJO, nombreTiposAlgoritmo.indexOf(nombreTipo));
				}
			}
		}
		
	}
	
	@Check
	//Función que se encarga de comprobar que el módulo importado no exporte un tipo con el mismo nombre que uno de los del módulo principal
	protected void checkTiposExportadosModulo(Modulo m) {
		List<String> nombreTiposAlgoritmo = funciones.registrarTipos(m.getImplementacion().getTipocomplejo());
		
		for(Modulo mAux: m.getImportaciones()) {
			for(String nombreTipo: m.getExporta_tipos()) {
				if(nombreTiposAlgoritmo.contains(nombreTipo)) {
					error(readerMessages.getString("TIPO_REPETIDO_MODULO", nombreTipo, mAux.getNombre()), m.getImplementacion(), DiagramapseudocodigoPackage.Literals.IMPLEMENTACION__TIPOCOMPLEJO, nombreTiposAlgoritmo.indexOf(nombreTipo));
				}
			}
		}
	}
	
	@Check
	//Función que se encarga de comprobar que los módulos importados no contengan tipos exportados repetidos entre sí
	protected void checkTiposExportadosModulosImportados(Algoritmo a) {		
		for(Modulo m: a.getImportaciones()) {
			for(Modulo m2: a.getImportaciones()) {
				if(!m.getNombre().equals(m2.getNombre())) {
					for(String nombreTipo: m.getExporta_tipos()) {
						if(m2.getExporta_tipos().contains(nombreTipo)) {
							error(readerMessages.getString("TIPO_REPETIDO_MODULO_IMPORTADO", nombreTipo, m.getNombre(), m2.getNombre()), DiagramapseudocodigoPackage.Literals.ALGORITMO__IMPORTACIONES, a.getImportaciones().indexOf(m));
						}
					}
				}
			}
		}
	}
	
	@Check
	//Función que se encarga de comprobar que los módulos importados no contengan tipos exportados repetidos entre sí
	protected void checkTiposExportadosModulosImportados(Modulo m) {
		for(Modulo mAux: m.getImportaciones()) {
			for(Modulo mAux2: m.getImportaciones()) {
				if(!mAux.getNombre().equals(mAux2.getNombre())) {
					for(String nombreTipo: mAux.getExporta_tipos()) {
						if(mAux2.getExporta_tipos().contains(nombreTipo)) {
							error(readerMessages.getString("TIPO_REPETIDO_MODULO_IMPORTADO", nombreTipo, mAux.getNombre(), mAux2.getNombre()), DiagramapseudocodigoPackage.Literals.MODULO__IMPORTACIONES, m.getImportaciones().indexOf(mAux));
						}
					}
				}
			}
		}
	}
	
	@Check
	//Función que se encarga de comprobar que los módulos importados no definan constantes repetidas
	protected void checkConstanteExportadaModulo(Algoritmo a) {
		List<String> nombreConstantesAlgoritmo = funciones.registrarConstantes(a.getConstantes());
		
		for(Modulo m: a.getImportaciones()) {
			for(String nombreConstante: m.getExporta_constantes()) {
				if(nombreConstantesAlgoritmo.contains(nombreConstante)) {
					error(readerMessages.getString("CONSTANTE_REPETIDA_MODULO", nombreConstante, m.getNombre()), DiagramapseudocodigoPackage.Literals.ALGORITMO__CONSTANTES, nombreConstantesAlgoritmo.indexOf(nombreConstante));
				}
			}
		}
	}
	
	@Check
	//Función que se encarga de comprobar que los módulos importados no definan constantes repetidas
	protected void checkConstanteExportadaModulo(Modulo m) {
		List<String> nombreConstantesModulo = funciones.registrarConstantes(m.getImplementacion().getConstantes());
		
		for(Modulo mAux: m.getImportaciones()) {
			for(String nombreConstante: mAux.getExporta_constantes()) {
				if(nombreConstantesModulo.contains(nombreConstante)) {
					error(readerMessages.getString("CONSTANTE_REPETIDA_MODULO", nombreConstante, mAux.getNombre()), m.getImplementacion(), DiagramapseudocodigoPackage.Literals.IMPLEMENTACION__CONSTANTES, nombreConstantesModulo.indexOf(nombreConstante));
				}
			}
		}
	}
	
	@Check
	//Función que se encarga de comprobar que los módulos importados no definan constantes repetidas entre sí
	protected void checkConstanteExportadaModuloImportado(Algoritmo a) {
		for(Modulo m: a.getImportaciones()) {
			for(Modulo m2: a.getImportaciones()) {
				if(!m.getNombre().equals(m2.getNombre())) {
					for(String nombreConstante: m.getExporta_constantes()) {
						if(m2.getExporta_constantes().contains(nombreConstante)) {
							error(readerMessages.getString("CONSTANTE_REPETIDA_MODULO_IMPORTADA", nombreConstante, m.getNombre(), m2.getNombre()), DiagramapseudocodigoPackage.Literals.ALGORITMO__IMPORTACIONES, a.getImportaciones().indexOf(m));
						}
					}
				}
			}
		}
	}
	
	
	@Check
	//Función que se encarga de comprobar que los módulos importados no definan constantes repetidas entre sí
	protected void checkConstanteExportadaModuloImportado(Modulo m) {
		for(Modulo mAux: m.getImportaciones()) {
			for(Modulo mAux2: m.getImportaciones()) {
				if(!mAux.getNombre().equals(mAux2.getNombre())) {
					for(String nombreConstante: mAux.getExporta_constantes()) {
						if(mAux2.getExporta_constantes().contains(nombreConstante)) {
							error(readerMessages.getString("CONSTANTE_REPETIDA_MODULO_IMPORTADA", nombreConstante, mAux.getNombre(), mAux2.getNombre()), DiagramapseudocodigoPackage.Literals.MODULO__IMPORTACIONES, m.getImportaciones().indexOf(mAux));
						}
					}
				}
			}
		}
	}
	
	
	@Check
	//Función que se encarga de comprobar si el limite inferior de un subrango es siempre inferior al superior.
	protected void checkSubrango(Subrango s) {
		if(s instanceof SubrangoNumerico) {
			SubrangoNumerico sn = (SubrangoNumerico) s;
			if(sn.getLimite_inf() > sn.getLimite_sup()) {
				error(readerMessages.getBundle().getString("SUBRANGO_LIMITES"),DiagramapseudocodigoPackage.Literals.SUBRANGO__NOMBRE);
			}
		}
	}
	
	@Check
	//Función que se encarga de validar si la variable utilizada en un bucle desde ha sido previamente declarada
	protected void checkDesde(Modulo modulo) {
		boolean ok = false;
		for(Subproceso sub: modulo.getImplementacion().getFuncion()) {
			for(Sentencias s: sub.getSentencias()) {
				if(s instanceof desde) {
					desde desdeAux = (desde) s;
					for(Declaracion d: sub.getDeclaracion()) {
						if(d instanceof DeclaracionVariable) {
							DeclaracionVariable dec = (DeclaracionVariable) d;
							for(Variable v: dec.getVariable()) {
								if(v.getNombre().equals(desdeAux.getAsignacion().getValor_asignacion()) && dec.getTipo().equals(readerMessages.getBundle().getString("TIPO_ENTERO"))) {
									ok = true;
								}
								else if(v.getNombre().equals(desdeAux.getAsignacion().getValor_asignacion()) && !dec.getTipo().equals(readerMessages.getBundle().getString("TIPO_ENTERO"))) {
									ok = true;
									error(readerMessages.getString("VARIABLE_DESDE_ENTERO", v.getNombre()), desdeAux, DiagramapseudocodigoPackage.Literals.DESDE__ASIGNACION);
								}
							}
						}
					}
					if(!ok) {
						error(readerMessages.getString("VARIABLE_NO_DECLARADA", desdeAux.getAsignacion().getValor_asignacion()), desdeAux, DiagramapseudocodigoPackage.Literals.DESDE__ASIGNACION, VARIABLE_NO_DEFINIDA);
					}
					ok = false;
				}
			}
		}
	}
	
	@Check
	//Función que se encarga de validar si la variable utilizada en un bucle desde ha sido previamente declarada
	protected void checkDesde(Algoritmo algoritmo) {
		boolean ok = false;
		for(Sentencias s: algoritmo.getTiene().getTiene()) {
			if(s instanceof desde) {
				desde desdeAux = (desde) s;
				for(Declaracion d: algoritmo.getTiene().getDeclaracion()) {
					if(d instanceof DeclaracionVariable) {
						DeclaracionVariable dec = (DeclaracionVariable) d;
						for(Variable v: dec.getVariable()) {
							if(v.getNombre().equals(desdeAux.getAsignacion().getValor_asignacion()) && dec.getTipo().equals(readerMessages.getBundle().getString("TIPO_ENTERO"))) {
								ok = true;
							}
							else if(v.getNombre().equals(desdeAux.getAsignacion().getValor_asignacion()) && !dec.getTipo().equals(readerMessages.getBundle().getString("TIPO_ENTERO"))) {
								ok = true;
								error(readerMessages.getString("VARIABLE_DESDE_ENTERO", v.getNombre()), desdeAux, DiagramapseudocodigoPackage.Literals.DESDE__ASIGNACION);
							}
						}
					}
				}
				if(!ok) {
					error(readerMessages.getString("VARIABLE_NO_DECLARADA", desdeAux.getAsignacion().getValor_asignacion()), desdeAux, DiagramapseudocodigoPackage.Literals.DESDE__ASIGNACION, VARIABLE_NO_DEFINIDA);
				}
				ok = false;
			}
		}
		for(Subproceso sub: algoritmo.getFuncion()) {
			for(Sentencias s: sub.getSentencias()) {
				if(s instanceof desde) {
					desde desdeAux = (desde) s;
					for(Declaracion d: sub.getDeclaracion()) {
						if(d instanceof DeclaracionVariable) {
							DeclaracionVariable dec = (DeclaracionVariable) d;
							for(Variable v: dec.getVariable()) {
								if(v.getNombre().equals(desdeAux.getAsignacion().getValor_asignacion()) && dec.getTipo().equals(readerMessages.getBundle().getString("TIPO_ENTERO"))) {
									ok = true;
								}
								else if(v.getNombre().equals(desdeAux.getAsignacion().getValor_asignacion()) && !dec.getTipo().equals(readerMessages.getBundle().getString("TIPO_ENTERO"))) {
									ok = true;
									error(readerMessages.getString("VARIABLE_DESDE_ENTERO", v.getNombre()), desdeAux, DiagramapseudocodigoPackage.Literals.DESDE__ASIGNACION);
								}
							}
						}
					}
					if(!ok) {
						error(readerMessages.getString("VARIABLE_NO_DECLARADA", desdeAux.getAsignacion().getValor_asignacion()), desdeAux, DiagramapseudocodigoPackage.Literals.DESDE__ASIGNACION, VARIABLE_NO_DEFINIDA);
					}
					ok = false;
				}
			}
		}
	}
	
	@Check
	protected void checkDesdeTope(Modulo modulo) {
		boolean ok = false;
		Map<String,String> constantesTipadas = funciones.registrarConstantesTipadas(modulo.getImplementacion().getConstantes(), readerMessages);
		
		for(Subproceso sub: modulo.getImplementacion().getFuncion()) {
			Map<String,String> globalesTipadas = funciones.registrarGlobalesTipadas(modulo.getImplementacion().getGlobal(), sub.getDeclaracion());
			Map<String,String> variablesTipadas = funciones.registrarVariablesTipadas(sub.getDeclaracion());
			Map<String,String> parametrosTipados = funciones.registrarParametrosTipados(sub.getParametrofuncion());
			variablesTipadas.putAll(parametrosTipados);
			for(Sentencias s: sub.getSentencias()) {
				if(s instanceof desde) {
					desde desdeAux = (desde) s;
					if(desdeAux.getValor() instanceof VariableID){
						VariableID variable = (VariableID) desdeAux.getValor();
						if((variablesTipadas.containsKey(variable.getNombre()) && variablesTipadas.get(variable.getNombre()).equals(readerMessages.getBundle().getString("TIPO_ENTERO")) 
								|| (constantesTipadas.containsKey(variable.getNombre()) && constantesTipadas.get(variable.getNombre()).equals(readerMessages.getBundle().getString("TIPO_ENTERO"))) 
								|| (globalesTipadas.containsKey(variable.getNombre()) && globalesTipadas.get(variable.getNombre()).equals(readerMessages.getBundle().getString("TIPO_ENTERO"))))) {
							ok = true;
						}
						else if((variablesTipadas.containsKey(variable.getNombre()) && !variablesTipadas.get(variable.getNombre()).equals(readerMessages.getBundle().getString("TIPO_ENTERO")) 
								|| (constantesTipadas.containsKey(variable.getNombre()) && !constantesTipadas.get(variable.getNombre()).equals(readerMessages.getBundle().getString("TIPO_ENTERO"))) 
								|| (globalesTipadas.containsKey(variable.getNombre()) && !globalesTipadas.get(variable.getNombre()).equals(readerMessages.getBundle().getString("TIPO_ENTERO"))))) {
							ok = true;
							error(readerMessages.getString("VARIABLE_DESDE_ENTERO", variable.getNombre()), variable, DiagramapseudocodigoPackage.Literals.VARIABLE_ID__NOMBRE);
						}
						if(!ok) {
							error(readerMessages.getString("VARIABLE_NO_DECLARADA", variable.getNombre()), variable, DiagramapseudocodigoPackage.Literals.VARIABLE_ID__NOMBRE, VARIABLE_NO_DEFINIDA);
						}
					}
					else if(desdeAux.getValor() instanceof operacion) {
						operacion op = (operacion) desdeAux.getValor();
						VariableID variable = null;
						if(op instanceof Suma) {
							Suma suma = (Suma) op;
							if(suma.getRight() instanceof VariableID) {
								variable = (VariableID) suma.getRight();
							}
							else if(suma.getLeft() instanceof VariableID) {
								variable = (VariableID) suma.getLeft();
							}
						}
						else if(op instanceof Resta) {
							Resta resta = (Resta) op;
							if(resta.getRight() instanceof VariableID) {
								variable = (VariableID) resta.getRight();
							}
							else if(resta.getLeft() instanceof VariableID) {
								variable = (VariableID) resta.getLeft();
							}
						}
						if((variablesTipadas.containsKey(variable.getNombre()) && variablesTipadas.get(variable.getNombre()).equals(readerMessages.getBundle().getString("TIPO_ENTERO")) 
								|| (constantesTipadas.containsKey(variable.getNombre()) && constantesTipadas.get(variable.getNombre()).equals(readerMessages.getBundle().getString("TIPO_ENTERO"))) 
								|| (globalesTipadas.containsKey(variable.getNombre()) && globalesTipadas.get(variable.getNombre()).equals(readerMessages.getBundle().getString("TIPO_ENTERO"))))) {
							ok = true;
						}
						else if((variablesTipadas.containsKey(variable.getNombre()) && !variablesTipadas.get(variable.getNombre()).equals(readerMessages.getBundle().getString("TIPO_ENTERO")) 
								|| (constantesTipadas.containsKey(variable.getNombre()) && !constantesTipadas.get(variable.getNombre()).equals(readerMessages.getBundle().getString("TIPO_ENTERO"))) 
								|| (globalesTipadas.containsKey(variable.getNombre()) && !globalesTipadas.get(variable.getNombre()).equals(readerMessages.getBundle().getString("TIPO_ENTERO"))))) {
							ok = true;
							error(readerMessages.getString("VARIABLE_DESDE_ENTERO", variable.getNombre()), variable, DiagramapseudocodigoPackage.Literals.VARIABLE_ID__NOMBRE);
						}
						if(!ok) {
							error(readerMessages.getString("VARIABLE_NO_DECLARADA", variable.getNombre()), variable, DiagramapseudocodigoPackage.Literals.VARIABLE_ID__NOMBRE, VARIABLE_NO_DEFINIDA);
						}
					}
					ok = false;
				}
			}
		}
	}
	
	@Check
	//Función que se encarga de validar si la variable utilizada como limite en un bucle desde ha sido previamente declarada
	protected void checkDesdeTope(Algoritmo algoritmo) {
		boolean ok = false;
		Map<String,String> variablesTipadas = funciones.registrarVariablesTipadas(algoritmo.getTiene().getDeclaracion());
		Map<String,String> constantesTipadas = funciones.registrarConstantesTipadas(algoritmo.getConstantes(), readerMessages);
		Map<String,String> globalesTipadas = funciones.registrarGlobalesTipadas(algoritmo.getGlobal(), algoritmo.getTiene().getDeclaracion());
		
		for(Sentencias s: algoritmo.getTiene().getTiene()) {
			if(s instanceof desde) {
				desde desdeAux = (desde) s;
				if(desdeAux.getValor() instanceof VariableID){
					VariableID variable = (VariableID) desdeAux.getValor();
					if((variablesTipadas.containsKey(variable.getNombre()) && variablesTipadas.get(variable.getNombre()).equals(readerMessages.getBundle().getString("TIPO_ENTERO")) 
							|| (constantesTipadas.containsKey(variable.getNombre()) && constantesTipadas.get(variable.getNombre()).equals(readerMessages.getBundle().getString("TIPO_ENTERO"))) 
							|| (globalesTipadas.containsKey(variable.getNombre()) && globalesTipadas.get(variable.getNombre()).equals(readerMessages.getBundle().getString("TIPO_ENTERO"))))) {
						ok = true;
					}
					else if((variablesTipadas.containsKey(variable.getNombre()) && !variablesTipadas.get(variable.getNombre()).equals(readerMessages.getBundle().getString("TIPO_ENTERO")) 
							|| (constantesTipadas.containsKey(variable.getNombre()) && !constantesTipadas.get(variable.getNombre()).equals(readerMessages.getBundle().getString("TIPO_ENTERO"))) 
							|| (globalesTipadas.containsKey(variable.getNombre()) && !globalesTipadas.get(variable.getNombre()).equals(readerMessages.getBundle().getString("TIPO_ENTERO"))))) {
						ok = true;
						error(readerMessages.getString("VARIABLE_DESDE_ENTERO", variable.getNombre()), variable, DiagramapseudocodigoPackage.Literals.VARIABLE_ID__NOMBRE);
					}
					if(!ok) {
						error(readerMessages.getString("VARIABLE_NO_DECLARADA", variable.getNombre()), variable, DiagramapseudocodigoPackage.Literals.VARIABLE_ID__NOMBRE, VARIABLE_NO_DEFINIDA);
					}
				}
				else if(desdeAux.getValor() instanceof operacion) {
					operacion op = (operacion) desdeAux.getValor();
					VariableID variable = null;
					if(op instanceof Suma) {
						Suma suma = (Suma) op;
						if(suma.getRight() instanceof VariableID) {
							variable = (VariableID) suma.getRight();
						}
						else if(suma.getLeft() instanceof VariableID) {
							variable = (VariableID) suma.getLeft();
						}
					}
					else if(op instanceof Resta) {
						Resta resta = (Resta) op;
						if(resta.getRight() instanceof VariableID) {
							variable = (VariableID) resta.getRight();
						}
						else if(resta.getLeft() instanceof VariableID) {
							variable = (VariableID) resta.getLeft();
						}
					}
					if((variablesTipadas.containsKey(variable.getNombre()) && variablesTipadas.get(variable.getNombre()).equals(readerMessages.getBundle().getString("TIPO_ENTERO")) 
							|| (constantesTipadas.containsKey(variable.getNombre()) && constantesTipadas.get(variable.getNombre()).equals(readerMessages.getBundle().getString("TIPO_ENTERO"))) 
							|| (globalesTipadas.containsKey(variable.getNombre()) && globalesTipadas.get(variable.getNombre()).equals(readerMessages.getBundle().getString("TIPO_ENTERO"))))) {
						ok = true;
					}
					else if((variablesTipadas.containsKey(variable.getNombre()) && !variablesTipadas.get(variable.getNombre()).equals(readerMessages.getBundle().getString("TIPO_ENTERO")) 
							|| (constantesTipadas.containsKey(variable.getNombre()) && !constantesTipadas.get(variable.getNombre()).equals(readerMessages.getBundle().getString("TIPO_ENTERO"))) 
							|| (globalesTipadas.containsKey(variable.getNombre()) && !globalesTipadas.get(variable.getNombre()).equals(readerMessages.getBundle().getString("TIPO_ENTERO"))))) {
						ok = true;
						error(readerMessages.getString("VARIABLE_DESDE_ENTERO", variable.getNombre()), variable, DiagramapseudocodigoPackage.Literals.VARIABLE_ID__NOMBRE);
					}
					if(!ok) {
						error(readerMessages.getString("VARIABLE_NO_DECLARADA", variable.getNombre()), variable, DiagramapseudocodigoPackage.Literals.VARIABLE_ID__NOMBRE, VARIABLE_NO_DEFINIDA);
					}
					
				}
				
				ok = false;
			}
		}
		for(Subproceso sub: algoritmo.getFuncion()) {
			variablesTipadas = funciones.registrarVariablesTipadas(sub.getDeclaracion());
			Map<String,String> parametrosTipados = funciones.registrarParametrosTipados(sub.getParametrofuncion());
			variablesTipadas.putAll(parametrosTipados);
			for(Sentencias s: sub.getSentencias()) {
				if(s instanceof desde) {
					desde desdeAux = (desde) s;
					if(desdeAux.getValor() instanceof VariableID){
						VariableID variable = (VariableID) desdeAux.getValor();
						if((variablesTipadas.containsKey(variable.getNombre()) && variablesTipadas.get(variable.getNombre()).equals(readerMessages.getBundle().getString("TIPO_ENTERO")) 
								|| (constantesTipadas.containsKey(variable.getNombre()) && constantesTipadas.get(variable.getNombre()).equals(readerMessages.getBundle().getString("TIPO_ENTERO"))) 
								|| (globalesTipadas.containsKey(variable.getNombre()) && globalesTipadas.get(variable.getNombre()).equals(readerMessages.getBundle().getString("TIPO_ENTERO"))))) {
							ok = true;
						}
						else if((variablesTipadas.containsKey(variable.getNombre()) && !variablesTipadas.get(variable.getNombre()).equals(readerMessages.getBundle().getString("TIPO_ENTERO")) 
								|| (constantesTipadas.containsKey(variable.getNombre()) && !constantesTipadas.get(variable.getNombre()).equals(readerMessages.getBundle().getString("TIPO_ENTERO"))) 
								|| (globalesTipadas.containsKey(variable.getNombre()) && !globalesTipadas.get(variable.getNombre()).equals(readerMessages.getBundle().getString("TIPO_ENTERO"))))) {
							ok = true;
							error(readerMessages.getString("VARIABLE_DESDE_ENTERO", variable.getNombre()), variable, DiagramapseudocodigoPackage.Literals.VARIABLE_ID__NOMBRE);
						}
						if(!ok) {
							error(readerMessages.getString("VARIABLE_NO_DECLARADA", variable.getNombre()), variable, DiagramapseudocodigoPackage.Literals.VARIABLE_ID__NOMBRE, VARIABLE_NO_DEFINIDA);
						}
					}
					else if(desdeAux.getValor() instanceof operacion) {
						operacion op = (operacion) desdeAux.getValor();
						VariableID variable = null;
						if(op instanceof Suma) {
							Suma suma = (Suma) op;
							if(suma.getRight() instanceof VariableID) {
								variable = (VariableID) suma.getRight();
							}
							else if(suma.getLeft() instanceof VariableID) {
								variable = (VariableID) suma.getLeft();
							}
						}
						else if(op instanceof Resta) {
							Resta resta = (Resta) op;
							if(resta.getRight() instanceof VariableID) {
								variable = (VariableID) resta.getRight();
							}
							else if(resta.getLeft() instanceof VariableID) {
								variable = (VariableID) resta.getLeft();
							}
						}
						if((variablesTipadas.containsKey(variable.getNombre()) && variablesTipadas.get(variable.getNombre()).equals(readerMessages.getBundle().getString("TIPO_ENTERO")) 
								|| (constantesTipadas.containsKey(variable.getNombre()) && constantesTipadas.get(variable.getNombre()).equals(readerMessages.getBundle().getString("TIPO_ENTERO"))) 
								|| (globalesTipadas.containsKey(variable.getNombre()) && globalesTipadas.get(variable.getNombre()).equals(readerMessages.getBundle().getString("TIPO_ENTERO"))))) {
							ok = true;
						}
						else if((variablesTipadas.containsKey(variable.getNombre()) && !variablesTipadas.get(variable.getNombre()).equals(readerMessages.getBundle().getString("TIPO_ENTERO")) 
								|| (constantesTipadas.containsKey(variable.getNombre()) && !constantesTipadas.get(variable.getNombre()).equals(readerMessages.getBundle().getString("TIPO_ENTERO"))) 
								|| (globalesTipadas.containsKey(variable.getNombre()) && !globalesTipadas.get(variable.getNombre()).equals(readerMessages.getBundle().getString("TIPO_ENTERO"))))) {
							ok = true;
							error(readerMessages.getString("VARIABLE_DESDE_ENTERO", variable.getNombre()), variable, DiagramapseudocodigoPackage.Literals.VARIABLE_ID__NOMBRE);
						}
						if(!ok) {
							error(readerMessages.getString("VARIABLE_NO_DECLARADA", variable.getNombre()), variable, DiagramapseudocodigoPackage.Literals.VARIABLE_ID__NOMBRE, VARIABLE_NO_DEFINIDA);
						}
					}
					ok = false;
				}
			}
		}
	}
	
	protected void checkSubrangoEnumeradoAux(List<TipoComplejo> complejos) {
		ArrayList<String> enumerados = new ArrayList<String>();
		Map<String, ArrayList<String>> variablesEnumerados = new HashMap<String, ArrayList<String>>();
		
		for(TipoComplejo t: complejos) {
			if(t instanceof Enumerado) {
				Enumerado enumerado = (Enumerado) t;
				enumerados.add(enumerado.getNombre());
				variablesEnumerados.put(enumerado.getNombre(), new ArrayList<String>());
				for(valor v: enumerado.getValor()) {
					if(v instanceof Operador) {
						Operador op = (Operador) v;
						if(op instanceof VariableID) {
							VariableID var = (VariableID) op;
							variablesEnumerados.get(enumerado.getNombre()).add(var.getNombre());
						}
					}
				}
			}
		}
		
		for(TipoComplejo t: complejos) {
			if(t instanceof SubrangoEnumerado) {
				SubrangoEnumerado subrango = (SubrangoEnumerado) t;
				String limite_inf = subrango.getLimite_inf();
				String limite_sup = subrango.getLimite_sup();
				boolean loTiene = false;
				
				for(String nombreEnumerado: enumerados) {
					if(variablesEnumerados.get(nombreEnumerado).contains(limite_inf) && variablesEnumerados.get(nombreEnumerado).contains(limite_sup)) {
						loTiene = true;
						if(variablesEnumerados.get(nombreEnumerado).indexOf(limite_inf) > variablesEnumerados.get(nombreEnumerado).indexOf(limite_sup)) {
							error(readerMessages.getBundle().getString("SUBRANGO_LIMITES_ENUMERADO"), subrango, DiagramapseudocodigoPackage.Literals.SUBRANGO__NOMBRE);
						}
					}
				}
				if(loTiene == false) {
					error(readerMessages.getBundle().getString("SUBRANGO_ENUMERADO_NO_DEFINIDO"), subrango, DiagramapseudocodigoPackage.Literals.SUBRANGO__NOMBRE);
				}
			}
		}
		
	}
	
	@Check
	protected void checkSubrangoEnumerado(Modulo modulo) {
		checkSubrangoEnumeradoAux(modulo.getImplementacion().getTipocomplejo());
	}
	
	@Check
	//Función que se encarga de comprobar si el limite inferior y superior de un SubrangoEnumerado estan ordenados
	protected void checkSubrangoEnumerado(Algoritmo algoritmo) {
		checkSubrangoEnumeradoAux(algoritmo.getTipocomplejo());
	}

	@Check
	//Función que se encarga de comprobar que no existen casos repetidos en la estructura segun_sea
	protected void checkCasos(segun s) {
		List<Integer> numeros = new ArrayList<Integer>();
		for(Caso c: s.getCaso()) {
			operacion op = c.getOperador();
			if(op instanceof NumeroEntero) {
				NumeroEntero e = (NumeroEntero) op;
				if(!numeros.contains(e.getValor())) {
					//Si no esta repetido lo registramos
					numeros.add(e.getValor());
				}
				else {
					//Si esta repetido lanzamos el error
					error(readerMessages.getString("CASO_REPETIDO", e.getValor()), DiagramapseudocodigoPackage.Literals.SEGUN__CASO, s.getCaso().indexOf(c));
				}
			}
		}
	}
	
	
	@Check
	//Función que se encarga de comprobar que no existan dos parámetros en un subproceso con el mismo nombre
	protected void checkParametros(Subproceso s) {
		List<String> parametros = new ArrayList<String>();
		for(ParametroFuncion p: s.getParametrofuncion()) {
			if(!parametros.contains(p.getVariable().getNombre())) {
				//Si no esta repetida la registramos
				parametros.add(p.getVariable().getNombre());
			}
			else {
				//Si esta repetida lanzamos el error
				error(readerMessages.getString("PARAMETRO_REPETIDO",p.getVariable().getNombre(), s.getNombre()), DiagramapseudocodigoPackage.Literals.SUBPROCESO__NOMBRE);
			}
		}
	}
	
	@Check
	//Función que se encarga de comprobar si la operación de la condición de la estructura "Si" es de tipo lógico
	protected void checkCondicionesSi(Si si) {
		if(si.getValor() instanceof  Suma) {
			Suma suma = (Suma) si.getValor();
			error(readerMessages.getBundle().getString("EXPRESION_TIPO_LOGICO"), suma, DiagramapseudocodigoPackage.Literals.SUMA__SIGNO_OP);
		}
		else if(si.getValor() instanceof Resta) {
			Resta resta = (Resta) si.getValor();
			error(readerMessages.getBundle().getString("EXPRESION_TIPO_LOGICO"), resta, DiagramapseudocodigoPackage.Literals.RESTA__SIGNO_OP);
		}
		else if(si.getValor() instanceof Multiplicacion) {
			Multiplicacion multiplicacion = (Multiplicacion) si.getValor();
			error(readerMessages.getBundle().getString("EXPRESION_TIPO_LOGICO"), multiplicacion, DiagramapseudocodigoPackage.Literals.MULTIPLICACION__SIGNO_OP);
		}
		else if(si.getValor() instanceof Division) {
			Division division = (Division) si.getValor();
			error(readerMessages.getBundle().getString("EXPRESION_TIPO_LOGICO"), division, DiagramapseudocodigoPackage.Literals.DIVISION__SIGNO_OP);
		}
		else if(si.getValor() instanceof Negativa) {
			Negativa negativa = (Negativa) si.getValor();
			error(readerMessages.getBundle().getString("EXPRESION_TIPO_LOGICO"), negativa, DiagramapseudocodigoPackage.Literals.NEGATIVA__VALOR_OPERACION);
		}
		else if(si.getValor() instanceof Or) {
			Or or = (Or) si.getValor();
			if(!(funciones.checkOperacionLogica(or.getLeft())) || !(funciones.checkOperacionLogica(or.getRight()))) {
				error(readerMessages.getBundle().getString("EXPRESION_TIPO_LOGICO"), or, DiagramapseudocodigoPackage.Literals.OR__SIGNO_OP);
			}
		}
		else if(si.getValor() instanceof And) {
			And and = (And) si.getValor();
			if(!(funciones.checkOperacionLogica(and.getLeft())) || !(funciones.checkOperacionLogica(and.getRight()))) {
				error(readerMessages.getBundle().getString("EXPRESION_TIPO_LOGICO"), and, DiagramapseudocodigoPackage.Literals.AND__SIGNO_OP);
			}
		}
		else if(si.getValor() instanceof Comparacion) {
			Comparacion comp = (Comparacion) si.getValor();
			if(!(funciones.checkOperacionLogica(comp.getLeft())) || !(funciones.checkOperacionLogica(comp.getRight()))) {
				error(readerMessages.getBundle().getString("EXPRESION_TIPO_LOGICO"), comp, DiagramapseudocodigoPackage.Literals.COMPARACION__SIGNO_OP);
			}
		}
		else if(si.getValor() instanceof Igualdad) {
			Igualdad igualdad = (Igualdad) si.getValor();
			if(!(funciones.checkOperacionLogica(igualdad.getLeft())) || !(funciones.checkOperacionLogica(igualdad.getRight()))) {
				error(readerMessages.getBundle().getString("EXPRESION_TIPO_LOGICO"), igualdad, DiagramapseudocodigoPackage.Literals.IGUALDAD__SIGNO_OP);
			}
		}
	}

	@Check
	//Función que se encarga de comprobar si la operación de la condición de la estructura "Mientras" es de tipo lógico
	protected void checkCondicionesMientras(mientras miMientras) {
		if(miMientras.getValor() instanceof  Suma) {
			Suma suma = (Suma) miMientras.getValor();
			error(readerMessages.getBundle().getString("EXPRESION_TIPO_LOGICO"), suma, DiagramapseudocodigoPackage.Literals.SUMA__SIGNO_OP);
		}
		else if(miMientras.getValor() instanceof Resta) {
			Resta resta = (Resta) miMientras.getValor();
			error(readerMessages.getBundle().getString("EXPRESION_TIPO_LOGICO"), resta, DiagramapseudocodigoPackage.Literals.RESTA__SIGNO_OP);
		}
		else if(miMientras.getValor() instanceof Multiplicacion) {
			Multiplicacion multiplicacion = (Multiplicacion) miMientras.getValor();
			error(readerMessages.getBundle().getString("EXPRESION_TIPO_LOGICO"), multiplicacion, DiagramapseudocodigoPackage.Literals.MULTIPLICACION__SIGNO_OP);
		}
		else if(miMientras.getValor() instanceof Division) {
			Division division = (Division) miMientras.getValor();
			error(readerMessages.getBundle().getString("EXPRESION_TIPO_LOGICO"), division, DiagramapseudocodigoPackage.Literals.DIVISION__SIGNO_OP);
		}
		else if(miMientras.getValor() instanceof Negativa) {
			Negativa negativa = (Negativa) miMientras.getValor();
			error(readerMessages.getBundle().getString("EXPRESION_TIPO_LOGICO"), negativa, DiagramapseudocodigoPackage.Literals.NEGATIVA__VALOR_OPERACION);
		}
		else if(miMientras.getValor() instanceof Or) {
			Or or = (Or) miMientras.getValor();
			if(!(funciones.checkOperacionLogica(or.getLeft())) || !(funciones.checkOperacionLogica(or.getRight()))) {
				error(readerMessages.getBundle().getString("EXPRESION_TIPO_LOGICO"), or, DiagramapseudocodigoPackage.Literals.OR__SIGNO_OP);
			}
		}
		else if(miMientras.getValor() instanceof And) {
			And and = (And) miMientras.getValor();
			if(!(funciones.checkOperacionLogica(and.getLeft())) || !(funciones.checkOperacionLogica(and.getRight()))) {
				error(readerMessages.getBundle().getString("EXPRESION_TIPO_LOGICO"), and, DiagramapseudocodigoPackage.Literals.AND__SIGNO_OP);
			}
		}
		else if(miMientras.getValor() instanceof Comparacion) {
			Comparacion comp = (Comparacion) miMientras.getValor();
			if(!(funciones.checkOperacionLogica(comp.getLeft())) || !(funciones.checkOperacionLogica(comp.getRight()))) {
				error(readerMessages.getBundle().getString("EXPRESION_TIPO_LOGICO"), comp, DiagramapseudocodigoPackage.Literals.COMPARACION__SIGNO_OP);
			}
		}
		else if(miMientras.getValor() instanceof Igualdad) {
			Igualdad igualdad = (Igualdad) miMientras.getValor();
			if(!(funciones.checkOperacionLogica(igualdad.getLeft())) || !(funciones.checkOperacionLogica(igualdad.getRight()))) {
				error(readerMessages.getBundle().getString("EXPRESION_TIPO_LOGICO"), igualdad, DiagramapseudocodigoPackage.Literals.IGUALDAD__SIGNO_OP);
			}
		}
	}
	
	
	@Check
	//Función que se encarga de comprobar si la operación de la condición de la estructura "Repetir" es de tipo lógico
	protected void checkCondicionesRepetir(repetir miRepetir) {
		if(miRepetir.getValor() instanceof  Suma) {
			Suma suma = (Suma) miRepetir.getValor();
			error(readerMessages.getBundle().getString("EXPRESION_TIPO_LOGICO"), suma, DiagramapseudocodigoPackage.Literals.SUMA__SIGNO_OP);
		}
		else if(miRepetir.getValor() instanceof Resta) {
			Resta resta = (Resta) miRepetir.getValor();
			error(readerMessages.getBundle().getString("EXPRESION_TIPO_LOGICO"), resta, DiagramapseudocodigoPackage.Literals.RESTA__SIGNO_OP);
		}
		else if(miRepetir.getValor() instanceof Multiplicacion) {
			Multiplicacion multiplicacion = (Multiplicacion) miRepetir.getValor();
			error(readerMessages.getBundle().getString("EXPRESION_TIPO_LOGICO"), multiplicacion, DiagramapseudocodigoPackage.Literals.MULTIPLICACION__SIGNO_OP);
		}
		else if(miRepetir.getValor() instanceof Division) {
			Division division = (Division) miRepetir.getValor();
			error(readerMessages.getBundle().getString("EXPRESION_TIPO_LOGICO"), division, DiagramapseudocodigoPackage.Literals.DIVISION__SIGNO_OP);
		}
		else if(miRepetir.getValor() instanceof Negativa) {
			Negativa negativa = (Negativa) miRepetir.getValor();
			error(readerMessages.getBundle().getString("EXPRESION_TIPO_LOGICO"), negativa, DiagramapseudocodigoPackage.Literals.NEGATIVA__VALOR_OPERACION);
		}
		else if(miRepetir.getValor() instanceof Or) {
			Or or = (Or) miRepetir.getValor();
			if(!(funciones.checkOperacionLogica(or.getLeft())) || !(funciones.checkOperacionLogica(or.getRight()))) {
				error(readerMessages.getBundle().getString("EXPRESION_TIPO_LOGICO"), or, DiagramapseudocodigoPackage.Literals.OR__SIGNO_OP);
			}
		}
		else if(miRepetir.getValor() instanceof And) {
			And and = (And) miRepetir.getValor();
			if(!(funciones.checkOperacionLogica(and.getLeft())) || !(funciones.checkOperacionLogica(and.getRight()))) {
				error(readerMessages.getBundle().getString("EXPRESION_TIPO_LOGICO"), and, DiagramapseudocodigoPackage.Literals.AND__SIGNO_OP);
			}
		}
		else if(miRepetir.getValor() instanceof Comparacion) {
			Comparacion comp = (Comparacion) miRepetir.getValor();
			if(!(funciones.checkOperacionLogica(comp.getLeft())) || !(funciones.checkOperacionLogica(comp.getRight()))) {
				error(readerMessages.getBundle().getString("EXPRESION_TIPO_LOGICO"), comp, DiagramapseudocodigoPackage.Literals.COMPARACION__SIGNO_OP);
			}
		}
		else if(miRepetir.getValor() instanceof Igualdad) {
			Igualdad igualdad = (Igualdad) miRepetir.getValor();
			if(!(funciones.checkOperacionLogica(igualdad.getLeft())) || !(funciones.checkOperacionLogica(igualdad.getRight()))) {
				error(readerMessages.getBundle().getString("EXPRESION_TIPO_LOGICO"), igualdad, DiagramapseudocodigoPackage.Literals.IGUALDAD__SIGNO_OP);
			}
		}
	}
	
	
	@Check
	//Función que se encarga de comprobar que no existan dos variables declaradas en un registro con el mismo nombre
	protected void checkRegistro(Registro r) {
		List<String> variables = new ArrayList<String>();
		for(Declaracion d: r.getVariable()) {
			if(d instanceof DeclaracionPropia) {
				DeclaracionPropia dec = (DeclaracionPropia) d;
				for(Variable v: dec.getVariable()) {
					//Si no esta repetida la registramos
					if(!variables.contains(v.getNombre())) {
						variables.add(v.getNombre());
					}
					//Si esta repetida lanzamos el error
					else {
						error(readerMessages.getString("VARIABLE_REPETIDA_REGISTRO", v.getNombre(), r.getNombre()), DiagramapseudocodigoPackage.Literals.REGISTRO__VARIABLE, r.getVariable().indexOf(d));
					}
				}
			}
			else {
				DeclaracionVariable dec = (DeclaracionVariable) d;
				for(Variable v: dec.getVariable()) {
					//Si no esta repetida la registramos
					if(!variables.contains(v.getNombre())) {
						variables.add(v.getNombre());
					}
					//Si esta repetida lanzamos el error
					else {
						error(readerMessages.getString("VARIABLE_REPETIDA_REGISTRO", v.getNombre(), r.getNombre()), DiagramapseudocodigoPackage.Literals.REGISTRO__VARIABLE, r.getVariable().indexOf(d));
					}
				}
			}
		}
	}
	
	
	private void checkFuncionesAbrirCerrarFicheroAux(List<Sentencias> sentencias, List<String> nombresFicheros, Map<String,String> variablesDeclaradas) {
		for(Sentencias s: sentencias) {
			if(s instanceof FuncionFicheroAbrir) {
				FuncionFicheroAbrir f = (FuncionFicheroAbrir) s;
				if(f.getVariable().get(0) instanceof VariableID) {
					VariableID v = (VariableID) f.getVariable().get(0);
					if(!nombresFicheros.contains(variablesDeclaradas.get(v.getNombre()))) {
						error(readerMessages.getString("VARIABLE_TIPO_ARCHIVO", v.getNombre()), f, DiagramapseudocodigoPackage.Literals.FUNCION_FICHERO_ABRIR__VARIABLE, 0);
					}
				}
			}
			else if(s instanceof FuncionFicheroCerrar) {
				FuncionFicheroCerrar f = (FuncionFicheroCerrar) s;
				if(f.getVariable() instanceof VariableID) {
					VariableID v = (VariableID) f.getVariable();
					if(!nombresFicheros.contains(variablesDeclaradas.get(v.getNombre()))) {
						error(readerMessages.getString("VARIABLE_TIPO_ARCHIVO", v.getNombre()), f, DiagramapseudocodigoPackage.Literals.FUNCION_FICHERO_CERRAR__VARIABLE);
					}
				}
			}
		}
	}
	
	@Check
	protected void checkFuncionesAbrirCerrarFichero(Modulo modulo) {
		List<String> nombresFicheros = new ArrayList<String>();
		for(TipoComplejo t: modulo.getImplementacion().getTipocomplejo()) {
			if(t instanceof Archivo) {
				Archivo a = (Archivo) t;
				nombresFicheros.add(a.getNombre());
			}
		}
		
		for(Subproceso sub: modulo.getImplementacion().getFuncion()) {
			Map<String,String> variablesDeclaradas = funciones.registrarVariablesTipadas(sub.getDeclaracion());
			checkFuncionesAbrirCerrarFicheroAux(sub.getSentencias(), nombresFicheros, variablesDeclaradas);
			
			for(Sentencias s: sub.getSentencias()) {
				if(s instanceof Bloque) {
					Bloque bloque = (Bloque) s;
					if(bloque instanceof segun) {
						segun seg = (segun) bloque;
						for(Caso caso: seg.getCaso()) {
							checkFuncionesAbrirCerrarFicheroAux(caso.getSentencias(), nombresFicheros, variablesDeclaradas);

							
							for(Sentencias sentencias: caso.getSentencias()) {
								if(sentencias instanceof Bloque) {
									Bloque bloqueAux = (Bloque) sentencias;
									checkFuncionesAbrirCerrarFicheroAux(bloqueAux.getSentencias(), nombresFicheros, variablesDeclaradas);

								}
							}
						}
					}
					else {
						checkFuncionesAbrirCerrarFicheroAux(bloque.getSentencias(), nombresFicheros, variablesDeclaradas);

						
						for(Sentencias sentencias: bloque.getSentencias()) {
							if(sentencias instanceof Bloque) {
								Bloque bloqueAux = (Bloque) sentencias;
								checkFuncionesAbrirCerrarFicheroAux(bloqueAux.getSentencias(), nombresFicheros, variablesDeclaradas);

							}
						}
					}
				}
			}
			
		}
	}
	
	
	@Check
	//Función que se encarga de comprobar si la variable que se le pasa a las funciones "abrir" y "cerrar" es de tipo fichero
	protected void checkFuncionesAbrirCerrarFichero(Algoritmo algoritmo) {
		List<String> nombresFicheros = new ArrayList<String>();
		for(TipoComplejo t: algoritmo.getTipocomplejo()) {
			if(t instanceof Archivo) {
				Archivo a = (Archivo) t;
				nombresFicheros.add(a.getNombre());
			}
		}
		
		Map<String,String> variablesDeclaradas = funciones.registrarVariablesTipadas(algoritmo.getTiene().getDeclaracion());
		
		//Para el programa de inicio
		checkFuncionesAbrirCerrarFicheroAux(algoritmo.getTiene().getTiene(), nombresFicheros, variablesDeclaradas);
		
		for(Sentencias s: algoritmo.getTiene().getTiene()) {
			if(s instanceof Bloque) {
				Bloque bloque = (Bloque) s;
				if(bloque instanceof segun) {
					segun seg = (segun) bloque;
					for(Caso caso: seg.getCaso()) {
						checkFuncionesAbrirCerrarFicheroAux(caso.getSentencias(), nombresFicheros, variablesDeclaradas);

						
						for(Sentencias sentencias: caso.getSentencias()) {
							if(sentencias instanceof Bloque) {
								Bloque bloqueAux = (Bloque) sentencias;
								checkFuncionesAbrirCerrarFicheroAux(bloqueAux.getSentencias(), nombresFicheros, variablesDeclaradas);

							}
						}
					}
				}
				else {
					checkFuncionesAbrirCerrarFicheroAux(bloque.getSentencias(), nombresFicheros, variablesDeclaradas);

					
					for(Sentencias sentencias: bloque.getSentencias()) {
						if(sentencias instanceof Bloque) {
							Bloque bloqueAux = (Bloque) sentencias;
							checkFuncionesAbrirCerrarFicheroAux(bloqueAux.getSentencias(), nombresFicheros, variablesDeclaradas);

						}
					}
				}
			}
		}
		
		//Para los subprocesos
		for(Subproceso sub: algoritmo.getFuncion()) {
			variablesDeclaradas = funciones.registrarVariablesTipadas(sub.getDeclaracion());
			checkFuncionesAbrirCerrarFicheroAux(sub.getSentencias(), nombresFicheros, variablesDeclaradas);
			
			for(Sentencias s: sub.getSentencias()) {
				if(s instanceof Bloque) {
					Bloque bloque = (Bloque) s;
					if(bloque instanceof segun) {
						segun seg = (segun) bloque;
						for(Caso caso: seg.getCaso()) {
							checkFuncionesAbrirCerrarFicheroAux(caso.getSentencias(), nombresFicheros, variablesDeclaradas);

							
							for(Sentencias sentencias: caso.getSentencias()) {
								if(sentencias instanceof Bloque) {
									Bloque bloqueAux = (Bloque) sentencias;
									checkFuncionesAbrirCerrarFicheroAux(bloqueAux.getSentencias(), nombresFicheros, variablesDeclaradas);

								}
							}
						}
					}
					else {
						checkFuncionesAbrirCerrarFicheroAux(bloque.getSentencias(), nombresFicheros, variablesDeclaradas);

						
						for(Sentencias sentencias: bloque.getSentencias()) {
							if(sentencias instanceof Bloque) {
								Bloque bloqueAux = (Bloque) sentencias;
								checkFuncionesAbrirCerrarFicheroAux(bloqueAux.getSentencias(), nombresFicheros, variablesDeclaradas);

							}
						}
					}
				}
			}
			
		}
	}
	
	
	private void checkFuncionAbrirAux(List<Sentencias> sentencias, Map<String,String> variablesDeclaradas) {
		for(Sentencias s: sentencias) {
			if(s instanceof FuncionFicheroAbrir) {
				FuncionFicheroAbrir f = (FuncionFicheroAbrir) s;
				if(f.getVariable().size() == 2 && f.getVariable().get(1) instanceof VariableID) {
					VariableID v = (VariableID) f.getVariable().get(1);
					if(variablesDeclaradas.get(v.getNombre()) != readerMessages.getBundle().getString("TIPO_CADENA") && variablesDeclaradas.get(v.getNombre()) != readerMessages.getBundle().getString("TIPO_CARACTER")) {
						error(readerMessages.getString("VARIABLE_TIPO_CADENA", v.getNombre()), f, DiagramapseudocodigoPackage.Literals.FUNCION_FICHERO_ABRIR__VARIABLE, 1);
					}
				}
				else if(!(f.getVariable().get(1) instanceof ConstCadena) && !(f.getVariable().get(1) instanceof Caracter)) {
					error(readerMessages.getBundle().getString("ENTRADA_TIPO_CADENA"), f, DiagramapseudocodigoPackage.Literals.FUNCION_FICHERO_ABRIR__VARIABLE, 1);
				}
			}
		}
	}
	
	@Check
	protected void checkFuncionAbrir(Modulo modulo) {
		for(Subproceso s: modulo.getImplementacion().getFuncion()) {
			Map<String,String> variablesDeclaradas = funciones.registrarVariablesTipadas(s.getDeclaracion());
			checkFuncionAbrirAux(s.getSentencias(), variablesDeclaradas);
		}
	}
	
	@Check
	//Función que se encarga de comprobar si la segunda variable es de tipo cadena o caracter en la función "abrir"
	protected void checkFuncionAbrir(Algoritmo algoritmo) {
		Map<String,String> variablesDeclaradas = funciones.registrarVariablesTipadas(algoritmo.getTiene().getDeclaracion());
		
		//En el programa principal
		checkFuncionAbrirAux(algoritmo.getTiene().getTiene(), variablesDeclaradas);
		
		for(Subproceso s: algoritmo.getFuncion()) {
			variablesDeclaradas = funciones.registrarVariablesTipadas(s.getDeclaracion());
			checkFuncionAbrirAux(s.getSentencias(), variablesDeclaradas);
		}
	}
	
	protected void checkDeclaracionesRegistroTiposComplejosAux(List<TipoComplejo> complejos) {
		//Registramos los nombres de todos los tipos complejos suponiendo que no estan repetidos ya que hay otra función que lo comprueba
		List<String >tipos = funciones.registrarTipos(complejos);
				
		//Comprobamos que todas las declaraciones de variables complejas en todos los registros son de tipos existentes
				
		for(TipoComplejo t: complejos) {
			if(t instanceof Registro) {
				Registro r = (Registro) t;
				for(Declaracion d: r.getVariable()) {
					if(d instanceof DeclaracionPropia) {
					//Solo nos interesa validar los tipos definidos por el usuario
						DeclaracionPropia dec = (DeclaracionPropia) d;
						if(!tipos.contains(dec.getTipo())) {
							error(readerMessages.getString("TIPO_NO_DEFINIDO", dec.getTipo()), dec, DiagramapseudocodigoPackage.Literals.DECLARACION_PROPIA__VARIABLE);
						}
					}
				}
			}
		}
	}
	
	@Check
	protected void checkDeclaracionesRegistroTiposComplejos(Modulo modulo) {
		checkDeclaracionesRegistroTiposComplejosAux(modulo.getImplementacion().getTipocomplejo());
	}
	
	@Check
	//Función que se encarga de comprobar que los tipos introducidos en los registros han sido definidos anteriormente
	protected void checkDeclaracionesRegistroTiposComplejos(Algoritmo algoritmo) {
		checkDeclaracionesRegistroTiposComplejosAux(algoritmo.getTipocomplejo());
	}
	
	protected void checkTipoDefinidoVectorMatrizAux(List<TipoComplejo> complejos) {
		//Registramos todos los nombres de los tipos complejos hasta ahora:
		List<String> tipos = funciones.registrarTipos(complejos);
				
		//Comprobamos que todos los tipos asignados a los vectores o a las matrices en su declaración sean tipos existentes
				
		for(TipoComplejo t: complejos) {
			if(t instanceof Vector) {
				Vector v = (Vector) t;
				if(v.getTipo() instanceof TipoDefinido) {
					TipoDefinido tipo = (TipoDefinido) v.getTipo();
					if(!tipos.contains(tipo.getTipo())) {
						error(readerMessages.getString("TIPO_NO_DEFINIDO", tipo.getTipo()), v, DiagramapseudocodigoPackage.Literals.VECTOR__TIPO);
					}
				}
			}
			else if(t instanceof Matriz) {
				Matriz m = (Matriz) t;
				if(m.getTipo() instanceof TipoDefinido) {
					TipoDefinido tipo = (TipoDefinido) m.getTipo();
					if(!tipos.contains(tipo.getTipo())) {
						error(readerMessages.getString("TIPO_NO_DEFINIDO", tipo.getTipo()), m, DiagramapseudocodigoPackage.Literals.MATRIZ__TIPO);
					}
				}
			}
		}
	}
	
	@Check
	protected void checkTipoDefinidoVectorMatriz(Modulo modulo) {
		checkTipoDefinidoVectorMatrizAux(modulo.getImplementacion().getTipocomplejo());
	}
	
	@Check
	//Función que se encarga de comprobar si el tipo complejo asignado a un vector o a una matriz ha sido previamente definido
	protected void checkTipoDefinidoVectorMatriz(Algoritmo algoritmo) {
		checkTipoDefinidoVectorMatrizAux(algoritmo.getTipocomplejo());
	}
	
	
	@Check
	//Función que se encarga de comprobar que no existan dos variables con el mismo nombre dentro de un subproceso
	protected void checkDeclaraciones(Subproceso s) {
		List<String> variables = new ArrayList<String>();
		//Registramos los parámetros que ya son válidados por otra función y se presuponen correctos sin repeticiones
		for(ParametroFuncion p: s.getParametrofuncion()) {
			variables.add(p.getVariable().getNombre());
		}
		for(Declaracion d: s.getDeclaracion()) {
			//Si la actual se ha instanciado como una subclase de tipo DeclaracionVariable
			if(d instanceof DeclaracionVariable) {
				DeclaracionVariable dec = (DeclaracionVariable) d;
				for(Variable v: dec.getVariable()) {
					if(!variables.contains(v.getNombre())) {
						//Si no esta repetida la registramos
						variables.add(v.getNombre());
					}
					else {
						//Si esta repetida lanzamos el error
						error(readerMessages.getString("VARIABLE_REPETIDA", v.getNombre(), s.getNombre()), v,  DiagramapseudocodigoPackage.Literals.VARIABLE__NOMBRE);
					}
				}
			}
			else {
				//Si la actual se ha instanciado como una subclase de tipo DeclaracionPropia
				DeclaracionPropia dec = (DeclaracionPropia) d;
				for(Variable v: dec.getVariable()) {
					if(!variables.contains(v.getNombre())) {
						//Si no esta repetida la registramos
						variables.add(v.getNombre());
					}
					else {
						//Si esta repetida lanzamos el error
						error(readerMessages.getString("VARIABLE_REPETIDA", v.getNombre(), s.getNombre()), v, DiagramapseudocodigoPackage.Literals.VARIABLE__NOMBRE);	
					}
				}
			}
		}
	}
	
	
	@Check
	//Función que se encarga de comprobar que no existan dos variables con el mismo nombre dentro de un programa principal
	protected void checkDeclaraciones(Inicio i) {
		List<String> variables = new ArrayList<String>();
		for(Declaracion d: i.getDeclaracion()) {
			if(d instanceof DeclaracionVariable) {
				//Si la actual se ha instanciado como una subclase de tipo DeclaracionVariable
				DeclaracionVariable dec = (DeclaracionVariable) d;
				for(Variable v: dec.getVariable()) {
					if(!variables.contains(v.getNombre())) {
						//Si no esta repetida la registramos
						variables.add(v.getNombre());
					}
					else {
						//Si esta repetida lanzamos el error
						error(readerMessages.getString("VARIABLE_REPETIDA_PRINCIPAL", v.getNombre()), v, DiagramapseudocodigoPackage.Literals.VARIABLE__NOMBRE);
					}
				}
			}
			else {
				//Si la actual se ha instanciado como una subclase del tipo DeclaracionPropia
				DeclaracionPropia dec = (DeclaracionPropia) d;
				for(Variable v: dec.getVariable()) {
					if(!variables.contains(v.getNombre())) {
						//Si no esta repetida la registramos
						variables.add(v.getNombre());
					}
					else {
						//Si esta repetida lanzamos el error
						error(readerMessages.getString("VARIABLE_REPETIDA_PRINCIPAL", v.getNombre()), v,  DiagramapseudocodigoPackage.Literals.VARIABLE__NOMBRE);
					}
				}
			}
		}
	}
	
	
	@Check
	//Función que comprueba en el programa principal que la variable utilizada en el segun_sea haya sido declarada con anterioridad
	protected void checkSegun(Inicio i) {
		//Registramos todas las variables declaradas dando por hecho que son correctas ya que hay otra función encargada de comprobarlo
		List<String> variables = funciones.registrarVariables(i.getDeclaracion());
		//Despues de tener todas las variables declaradas comprobamos si la que se usa en el según esta entre ellas
		for(Sentencias s: i.getTiene()) {
			if(s instanceof segun) {
				segun se = (segun) s;
				if(se.getValor() instanceof Operador) {
					Operador op = (Operador) se.getValor();
					if(op instanceof VariableID) {
						VariableID v = (VariableID) op; //Siempre es una variable
						
						if(!variables.contains(v.getNombre())) {
							error(readerMessages.getString("VARIABLE_NO_DECLARADA", v.getNombre()), v, DiagramapseudocodigoPackage.Literals.VARIABLE_ID__NOMBRE, VARIABLE_NO_DEFINIDA);
						}
					}
				}
			}
		}
	}
	
	@Check
	//Función que comprueba en las funciones que la variable utilizada en el segun_sea haya sido declarada con anterioridad
	protected void checkSegun(Funcion f) {
		//Registramos todas las variables declaradas dando por hecho que son correctas ya que hay otra función encargada de comprobarlo
		List<String> variables = funciones.registrarVariables(f.getDeclaracion());
		//También hay que registrar los parámetros declarados en la función
		List<String> parametros = funciones.registrarParametros(f.getParametrofuncion());
		//Despues de tener todas las variables declaradas comprobamos si la que se usa en el según esta entre ellas
		for(Sentencias s: f.getSentencias()) {
			if(s instanceof segun) {
				segun se = (segun) s;
				VariableID v = (VariableID) se.getValor(); //Siempre es una variable
				if(!variables.contains(v.getNombre()) && !parametros.contains(v.getNombre())) {
					error(readerMessages.getString("VARIABLE_NO_DECLARADA", v.getNombre()), v, DiagramapseudocodigoPackage.Literals.VARIABLE_ID__NOMBRE, VARIABLE_NO_DEFINIDA);
				}
			}
		}
	}
	
	@Check
	//Función que comprueba en los procedimientos que la variable utilizada en el segun_sea haya sido declarada con anterioridad
	protected void checkSegun(Procedimiento p) {
		//Registramos todas las variables declaradas dando por hecho que son correctas ya que hay otra función encargada de comprobarlo
		List<String> variables = funciones.registrarVariables(p.getDeclaracion());
		//También hay que registrar los parámetros declarados en la función
		List<String> parametros = funciones.registrarParametros(p.getParametrofuncion());
		//Despues de tener todas las variables declaradas comprobamos si la que se usa en el según esta entre ellas
		for(Sentencias s: p.getSentencias()) {
			if(s instanceof segun) {
				segun se = (segun) s;
				VariableID v = (VariableID) se.getValor(); //Siempre es una variable
				if(!variables.contains(v.getNombre()) && !parametros.contains(v.getNombre())) {
					error(readerMessages.getString("VARIABLE_NO_DECLARADA", v.getNombre()), v, DiagramapseudocodigoPackage.Literals.VARIABLE_ID__NOMBRE, VARIABLE_NO_DEFINIDA);
				}
			}
		}
	}
	
	@Check
	protected void checkTipoSegun(Inicio i) {
		//Primero Ahora buscamos la variable y averiguamos su tipo
		segun se = null;
		for(Sentencias s: i.getTiene()) {
			if(s instanceof segun) {
				se = (segun) s;
			}
		}
		String nombre = null;
		if(se != null) {
			//Siempre es una variable
			VariableID v = (VariableID) se.getValor();
			nombre = v.getNombre();
			
			//Después seleccionamos el tipo de la variable de entrada del segun_sea (damos por hecho que esta declarada porque hay otra función que lo comprueba)
			
			DeclaracionVariable parametro = null;
			
			for(Declaracion d: i.getDeclaracion()) {
				if(d instanceof DeclaracionVariable) {
					DeclaracionVariable dec = (DeclaracionVariable) d;
					for(Variable var: dec.getVariable()) {
						if(var.getNombre() == nombre) {
							parametro = dec;
						}
					}
				}
			}
			int cont = 0;
			boolean valido = true;
			
			if(parametro.getTipo().equals(readerMessages.getBundle().getString("TIPO_ENTERO"))) {
				//Comprobamos que las variables de los casos sean todas del mismo tipo
				for(Caso c: se.getCaso()) {
					if(!(c.getOperador() instanceof NumeroEntero)) {
						valido = false;
					}
					cont++;
				}
			}
			
			if(!valido) {
				warning(readerMessages.getBundle().getString("PARAMETROS_SEGUN"), DiagramapseudocodigoPackage.Literals.SEGUN__CASO,cont);
			}
		}
		
	}
	
	protected void checkConstantesAux(List<String> nombresConstantes, List<TipoComplejo> complejos) {
		for(TipoComplejo t: complejos) {
			if(t instanceof Vector) {
				Vector v = (Vector) t;
				if(v.getValor() instanceof VariableID) {
					VariableID var = (VariableID) v.getValor();
					if(!nombresConstantes.contains(var.getNombre())) {
						error(readerMessages.getString("CONSTANTE_NO_DECLARADA",  var.getNombre()), v, DiagramapseudocodigoPackage.Literals.VECTOR__VALOR, CONSTANTE_NO_DEFINIDA);
					}
				}
			}
			if(t instanceof Matriz) {
				Matriz m = (Matriz) t;
				if(m.getValor().get(0) instanceof VariableID) {
					VariableID var = (VariableID) m.getValor().get(0);
					if(!nombresConstantes.contains(var.getNombre())) {
						error(readerMessages.getString("CONSTANTE_NO_DECLARADA",  var.getNombre()), m, DiagramapseudocodigoPackage.Literals.MATRIZ__VALOR, 0, CONSTANTE_NO_DEFINIDA);
					}
				}
				if(m.getValor().size() > 1 && m.getValor().get(1) instanceof VariableID) {
					VariableID var = (VariableID) m.getValor().get(1);
					if(!nombresConstantes.contains(var.getNombre())) {
						error(readerMessages.getString("CONSTANTE_NO_DECLARADA",  var.getNombre()), m, DiagramapseudocodigoPackage.Literals.MATRIZ__VALOR, 1, CONSTANTE_NO_DEFINIDA);
					}
				}
			}
		}	
	}
	
	@Check
	protected void checkConstantes(Modulo modulo) {
		//Se añaden las constantes de los módulos importados:
		Implementacion implementacion = modulo.getImplementacion();
		List<String> nombresConstantes = new ArrayList<String>();
		
		for(Constantes cons: implementacion.getConstantes()) {
			nombresConstantes.add(cons.getVariable().getNombre());
		}
		
		for(Modulo m: modulo.getImportaciones()) {
			nombresConstantes.addAll(m.getExporta_constantes());
		}
		
		checkConstantesAux(nombresConstantes, implementacion.getTipocomplejo());
	}
	
	@Check
	//Función que compueba que las constantes utilizadas para definir los tamaños de los vectores y matrices han sido declaradas con anterioridad
	protected void checkConstantes(Algoritmo algoritmo) {
		List<String> nombresConstantes = new ArrayList<String>();
		
		for(Constantes cons: algoritmo.getConstantes()) {
			nombresConstantes.add(cons.getVariable().getNombre());
		}
		
		for(Modulo m: algoritmo.getImportaciones()) {
			nombresConstantes.addAll(m.getExporta_constantes());
		}
		
		checkConstantesAux(nombresConstantes, algoritmo.getTipocomplejo());
	}
	
	protected void checkConstantesRepetidasAux(List<Constantes> constantes, int tipo) {
		List<String> nombresConstantes = new ArrayList<String>();
		for(Constantes cons: constantes) {
			if(nombresConstantes.contains(cons.getVariable().getNombre())) {
				//Si ya ha sido registrada lanzamos el error
				if(tipo == 1) {
					error(readerMessages.getString("CONSTANTE_REPETIDA",  cons.getVariable().getNombre()), DiagramapseudocodigoPackage.Literals.ALGORITMO__CONSTANTES, constantes.indexOf(cons));
				} else if(tipo == 2) {
					error(readerMessages.getString("CONSTANTE_REPETIDA",  cons.getVariable().getNombre()), DiagramapseudocodigoPackage.Literals.IMPLEMENTACION__CONSTANTES, constantes.indexOf(cons));
				}
			}
			else {
				//Si no ha sido registrada la registramos
				nombresConstantes.add(cons.getVariable().getNombre());
			}
		}	
	}
	
	@Check
	//Función que comprueba que no existen dos constantes con el mismo nombre
	protected void checkConstantesRepetidas(Algoritmo algoritmo) {
		List<String> nombresConstantes = new ArrayList<String>();
		for(Constantes cons: algoritmo.getConstantes()) {
			if(nombresConstantes.contains(cons.getVariable().getNombre())) {
				//Si ya ha sido registrada lanzamos el error
				error(readerMessages.getString("CONSTANTE_REPETIDA",  cons.getVariable().getNombre()), DiagramapseudocodigoPackage.Literals.ALGORITMO__CONSTANTES, algoritmo.getConstantes().indexOf(cons));
			}
			else {
				//Si no ha sido registrada la registramos
				nombresConstantes.add(cons.getVariable().getNombre());
			}
		}
	}
	
	@Check
	//Función que comprueba que no existen dos constantes con el mismo nombre
	protected void checkConstantesRepetidas(Modulo modulo) {
		List<String> nombresConstantes = new ArrayList<String>();
		for(Constantes cons: modulo.getImplementacion().getConstantes()) {
			if(nombresConstantes.contains(cons.getVariable().getNombre())) {
				//Si ya ha sido registrada lanzamos el error
				error(readerMessages.getString("CONSTANTE_REPETIDA",  cons.getVariable().getNombre()), modulo.getImplementacion(), DiagramapseudocodigoPackage.Literals.IMPLEMENTACION__CONSTANTES, modulo.getImplementacion().getConstantes().indexOf(cons));
			}
			else {
				//Si no ha sido registrada la registramos
				nombresConstantes.add(cons.getVariable().getNombre());
			}
		}
	}
	
	@Check
	//Función que comprueba que no se exporte dos veces la misma constante
	protected void checkConstanteExportadaRepetida(Modulo modulo) {
		List<String> nombresConstantes = new ArrayList<String>();
		for(String constante: modulo.getExporta_constantes()) {
			if(nombresConstantes.contains(constante)) {
				error(readerMessages.getString("CONSTANTE_EXPORTADA_REPETIDA",  constante), DiagramapseudocodigoPackage.Literals.MODULO__EXPORTA_CONSTANTES, modulo.getExporta_constantes().indexOf(constante));
			}
			else {
				nombresConstantes.add(constante);
			}
		}
	}
	
	@Check
	//Función que comprueba que no se exporte dos veces el mismo tipo
	protected void checkTipoExportadoRepetido(Modulo modulo) {
		List<String> nombresTipos = new ArrayList<String>();
		for(String tipo: modulo.getExporta_tipos()) {
			if(nombresTipos.contains(tipo)) {
				error(readerMessages.getString("TIPO_EXPORTADO_REPETIDO",  tipo), DiagramapseudocodigoPackage.Literals.MODULO__EXPORTA_TIPOS, modulo.getExporta_tipos().indexOf(tipo));
			}
			else {
				nombresTipos.add(tipo);
			}
		}
	}
	
	@Check
	//Función que comprueba que no se exporte dos veces la misma variable global
	protected void checkGlobalExportadaRepetida(Modulo modulo) {
		List<String> nombresGlobales = new ArrayList<String>();
		List<String> variablesExportadas = funciones.registrarVariables(modulo.getExporta_global());
		
		for(String nombre: variablesExportadas) {
			if(nombresGlobales.contains(nombre)) {
				error(readerMessages.getString("VARIABLE_EXPORTADA_REPETIDA",  nombre), DiagramapseudocodigoPackage.Literals.MODULO__EXPORTA_GLOBAL, variablesExportadas.indexOf(nombre));
			}
			else {
				nombresGlobales.add(nombre);
			}
		}
	}
	
	@Check
	protected void checkDeclaracionesTiposComplejos(Modulo modulo) {
		//Registramos los nombres de todos los tipos complejos suponiendo que no estan repetidos ya que hay otra funci�n que lo comprueba
		List<String >tipos = funciones.registrarTipos(modulo.getImplementacion().getTipocomplejo());
		
		//Añadimos también las importaciones:
		for(Modulo m: modulo.getImportaciones()) {
			tipos.addAll(m.getExporta_tipos());
		}
		
		for(Subproceso s: modulo.getImplementacion().getFuncion()) {
			for(Declaracion d: s.getDeclaracion()) {
				if(d instanceof DeclaracionPropia) {
					DeclaracionPropia dec = (DeclaracionPropia) d;
					if(!tipos.contains(dec.getTipo())) {
						//Si el tipo no existe entonces lanzamos el error
						error(readerMessages.getString("TIPO_NO_DEFINIDO", dec.getTipo()), s, DiagramapseudocodigoPackage.Literals.SUBPROCESO__DECLARACION, s.getDeclaracion().indexOf(d));
					}
				}
			}
		}
		
		//Comprobamos lo mismo también para las variables globales
		
		for(Declaracion d: modulo.getImplementacion().getGlobal()) {
			if(d instanceof DeclaracionPropia) {
				DeclaracionPropia dec = (DeclaracionPropia) d;
				if(!tipos.contains(dec.getTipo())) {
					error(readerMessages.getString("TIPO_NO_DEFINIDO", dec.getTipo()), modulo, DiagramapseudocodigoPackage.Literals.IMPLEMENTACION__GLOBAL, modulo.getImplementacion().getGlobal().indexOf(d));
				}
			}
		}
	}
	
	@Check
	//Función que comprueba que el tipo de una variable ha sido definido con anterioridad
	protected void checkDeclaracionesTiposComplejos(Algoritmo algoritmo) {
		//Registramos los nombres de todos los tipos complejos suponiendo que no estan repetidos ya que hay otra funci�n que lo comprueba
		List<String> tipos = funciones.registrarTipos(algoritmo.getTipocomplejo());
		
		//Añadimos también los tipos de las importaciones:
		for(Modulo m: algoritmo.getImportaciones()) {
			tipos.addAll(m.getExporta_tipos());
		}
		
		//Comprobamos que todas las declaraciones de variables complejas en el programa principal y en los subprocesos son de tipos existentes
		
		for(Declaracion d: algoritmo.getTiene().getDeclaracion()) {
			if(d instanceof DeclaracionPropia) {
				DeclaracionPropia dec = (DeclaracionPropia) d;
				if(!tipos.contains(dec.getTipo())) {
					//Si el tipo no existe entonces lanzamos el error
					error(readerMessages.getString("TIPO_NO_DEFINIDO", dec.getTipo()), algoritmo.getTiene(), DiagramapseudocodigoPackage.Literals.INICIO__DECLARACION, algoritmo.getTiene().getDeclaracion().indexOf(d));
				}
			}
		}
		
		for(Subproceso s: algoritmo.getFuncion()) {
			for(Declaracion d: s.getDeclaracion()) {
				if(d instanceof DeclaracionPropia) {
					DeclaracionPropia dec = (DeclaracionPropia) d;
					if(!tipos.contains(dec.getTipo())) {
						//Si el tipo no existe entonces lanzamos el error
						error(readerMessages.getString("TIPO_NO_DEFINIDO", dec.getTipo()), s, DiagramapseudocodigoPackage.Literals.SUBPROCESO__DECLARACION, s.getDeclaracion().indexOf(d));
					}
				}
			}
		}
		
		//Comprobamos lo mismo también para las variables globales
		
		for(Declaracion d: algoritmo.getGlobal()) {
			if(d instanceof DeclaracionPropia) {
				DeclaracionPropia dec = (DeclaracionPropia) d;
				if(!tipos.contains(dec.getTipo())) {
					error(readerMessages.getString("TIPO_NO_DEFINIDO", dec.getTipo()), algoritmo, DiagramapseudocodigoPackage.Literals.ALGORITMO__GLOBAL, algoritmo.getGlobal().indexOf(d));
				}
			}
		}
	}
	
	@Check
	protected void checkTipos(Modulo modulo) {
		
		List<String> tipos = new ArrayList<String>();
		
		for(TipoComplejo com: modulo.getImplementacion().getTipocomplejo()) {
			if(com instanceof Vector) {
				Vector v = (Vector) com;
				if(!tipos.contains(v.getNombre())) {
					//Si no existe lo registramos
					tipos.add(v.getNombre());
				}
				else {
					//Si existe lanzamos el error
					error(readerMessages.getString("TIPO_REPETIDO", v.getNombre()), modulo.getImplementacion(), DiagramapseudocodigoPackage.Literals.IMPLEMENTACION__TIPOCOMPLEJO, modulo.getImplementacion().getTipocomplejo().indexOf(com));
				}
			}
			else if(com instanceof Matriz) {
				Matriz m = (Matriz) com;
				if(!tipos.contains(m.getNombre())) {
					//Si no existe lo registramos
					tipos.add(m.getNombre());
				}
				else {
					//Si existe lanzamos el error
					error(readerMessages.getString("TIPO_REPETIDO", m.getNombre()), modulo.getImplementacion(), DiagramapseudocodigoPackage.Literals.IMPLEMENTACION__TIPOCOMPLEJO, modulo.getImplementacion().getTipocomplejo().indexOf(com));
				}
			}
			else if(com instanceof Registro) {
				Registro r = (Registro) com;
				if(!tipos.contains(r.getNombre())) {
					//Si no existe lo registramos
					tipos.add(r.getNombre());
				}
				else {
					//Si existe lanzamos el error
					error(readerMessages.getString("TIPO_REPETIDO", r.getNombre()), modulo.getImplementacion(), DiagramapseudocodigoPackage.Literals.IMPLEMENTACION__TIPOCOMPLEJO, modulo.getImplementacion().getTipocomplejo().indexOf(com));
				}
			}
			else if(com instanceof Enumerado) {
				Enumerado e = (Enumerado) com;
				if(!tipos.contains(e.getNombre())) {
					//Si no existe lo registramos
					tipos.add(e.getNombre());
				}
				else {
					//Si existe lanzamos el error
					error(readerMessages.getString("TIPO_REPETIDO", e.getNombre()), modulo.getImplementacion(), DiagramapseudocodigoPackage.Literals.IMPLEMENTACION__TIPOCOMPLEJO, modulo.getImplementacion().getTipocomplejo().indexOf(com));
				}
			}
			else if(com instanceof Archivo) {
				Archivo a = (Archivo) com;
				if(!tipos.contains(a.getNombre())) {
					//Si no existe lo registramos
					tipos.add(a.getNombre());
				}
				else {
					//Si existe lanzamos el error
					error(readerMessages.getString("TIPO_REPETIDO", a.getNombre()), modulo.getImplementacion(), DiagramapseudocodigoPackage.Literals.IMPLEMENTACION__TIPOCOMPLEJO, modulo.getImplementacion().getTipocomplejo().indexOf(com));
				}
			}
			else {
				Subrango s = (Subrango) com;
				if(!tipos.contains(s.getNombre())) {
					//Si no existe lo registramos
					tipos.add(s.getNombre());
				}
				else {
					//Si existe lanzamos el error
					error(readerMessages.getString("TIPO_REPETIDO", s.getNombre()), modulo.getImplementacion(), DiagramapseudocodigoPackage.Literals.IMPLEMENTACION__TIPOCOMPLEJO, modulo.getImplementacion().getTipocomplejo().indexOf(com));
				}
			}
		}
	}
	
	@Check
	//Función que comprueba que no hay dos tipos complejos diferentes con el mismo nombre
	protected void checkTipos(Algoritmo algoritmo) {
		
		List<String> tipos = new ArrayList<String>();
		
		for(TipoComplejo com: algoritmo.getTipocomplejo()) {
			if(com instanceof Vector) {
				Vector v = (Vector) com;
				if(!tipos.contains(v.getNombre())) {
					//Si no existe lo registramos
					tipos.add(v.getNombre());
				}
				else {
					//Si existe lanzamos el error
					error(readerMessages.getString("TIPO_REPETIDO", v.getNombre()), DiagramapseudocodigoPackage.Literals.ALGORITMO__TIPOCOMPLEJO, algoritmo.getTipocomplejo().indexOf(com));
				}
			}
			else if(com instanceof Matriz) {
				Matriz m = (Matriz) com;
				if(!tipos.contains(m.getNombre())) {
					//Si no existe lo registramos
					tipos.add(m.getNombre());
				}
				else {
					//Si existe lanzamos el error
					error(readerMessages.getString("TIPO_REPETIDO", m.getNombre()), DiagramapseudocodigoPackage.Literals.ALGORITMO__TIPOCOMPLEJO, algoritmo.getTipocomplejo().indexOf(com));
				}
			}
			else if(com instanceof Registro) {
				Registro r = (Registro) com;
				if(!tipos.contains(r.getNombre())) {
					//Si no existe lo registramos
					tipos.add(r.getNombre());
				}
				else {
					//Si existe lanzamos el error
					error(readerMessages.getString("TIPO_REPETIDO", r.getNombre()), DiagramapseudocodigoPackage.Literals.ALGORITMO__TIPOCOMPLEJO, algoritmo.getTipocomplejo().indexOf(com));
				}
			}
			else if(com instanceof Enumerado) {
				Enumerado e = (Enumerado) com;
				if(!tipos.contains(e.getNombre())) {
					//Si no existe lo registramos
					tipos.add(e.getNombre());
				}
				else {
					//Si existe lanzamos el error
					error(readerMessages.getString("TIPO_REPETIDO", e.getNombre()), DiagramapseudocodigoPackage.Literals.ALGORITMO__TIPOCOMPLEJO, algoritmo.getTipocomplejo().indexOf(com));
				}
			}
			else if(com instanceof Archivo) {
				Archivo a = (Archivo) com;
				if(!tipos.contains(a.getNombre())) {
					//Si no existe lo registramos
					tipos.add(a.getNombre());
				}
				else {
					//Si existe lanzamos el error
					error(readerMessages.getString("TIPO_REPETIDO", a.getNombre()), DiagramapseudocodigoPackage.Literals.ALGORITMO__TIPOCOMPLEJO, algoritmo.getTipocomplejo().indexOf(com));
				}
			}
			else {
				Subrango s = (Subrango) com;
				if(!tipos.contains(s.getNombre())) {
					//Si no existe lo registramos
					tipos.add(s.getNombre());
				}
				else {
					//Si existe lanzamos el error
					error(readerMessages.getString("TIPO_REPETIDO", s.getNombre()), DiagramapseudocodigoPackage.Literals.ALGORITMO__TIPOCOMPLEJO, algoritmo.getTipocomplejo().indexOf(com));
				}
			}
		}
	}
	
	protected void checkFuncionesAux(List<Subproceso> subprocesos) {
		List<String> nombres = new ArrayList<String>();
		List<ArrayList<Integer>> parametros = new ArrayList<ArrayList<Integer>>();
		for(Subproceso s: subprocesos) {
			//Comprobamos que no haya otro subproceso con el mismo nombre y el mismo número de parámetros
			if(!nombres.contains(s.getNombre())) {
				//Si todavia no hay ninguna que se llame así, la registramos
				nombres.add(s.getNombre());
				parametros.add(new ArrayList<Integer>());
				parametros.get(nombres.indexOf(s.getNombre())).add(s.getParametrofuncion().size());
			}
			else if(nombres.contains(s.getNombre()) && !parametros.get(nombres.indexOf(s.getNombre())).contains(s.getParametrofuncion().size())) {
				//Si el nombre existe y no tiene el mismo número de parámetros lo registramos
				parametros.get(nombres.indexOf(s.getNombre())).add(s.getParametrofuncion().size());
				
			}
			else {
				error(readerMessages.getString("SUBPROCESO_REPETIDO", s.getNombre()), s, DiagramapseudocodigoPackage.Literals.SUBPROCESO__NOMBRE, subprocesos.indexOf(s));
			}
		}
	}
	
	@Check
	protected void checkFunciones(Modulo modulo) {
		checkFuncionesAux(modulo.getImplementacion().getFuncion());
	}
	
	@Check
	//Función que comprueba que no haya declaradas dos funciones con el mismo nombre y mismo número de parámetros
	protected void checkFunciones(Algoritmo algoritmo) {
		checkFuncionesAux(algoritmo.getFuncion());
	}
	
	protected void checkVariablesGlobalesAux(List<Declaracion> globales) {
		List<String> variables = new ArrayList<String>();
		for(Declaracion d: globales) {
			if(d instanceof DeclaracionVariable) {
				//Si la actual se ha instanciado como una subclase de tipo DeclaracionVariable
				DeclaracionVariable dec = (DeclaracionVariable) d;
				for(Variable v: dec.getVariable()) {
					if(!variables.contains(v.getNombre())) {
						//Si no esta repetida la registramos
						variables.add(v.getNombre());
					}
					else {
						//Si esta repetida lanzamos el error
						error(readerMessages.getString("GLOBAL_REPETIDA", v.getNombre()), v, DiagramapseudocodigoPackage.Literals.VARIABLE__NOMBRE);
					}
				}
			}
			else {
				//Si la actual se ha instanciado como una subclase del tipo DeclaracionPropia
				DeclaracionPropia dec = (DeclaracionPropia) d;
				for(Variable v: dec.getVariable()) {
					if(!variables.contains(v.getNombre())) {
						//Si no esta repetida la registramos
						variables.add(v.getNombre());
					}
					else {
						//Si esta repetida lanzamos el error
						error(readerMessages.getString("GLOBAL_REPETIDA", v.getNombre()), v,  DiagramapseudocodigoPackage.Literals.VARIABLE__NOMBRE);
					}
				}
			}
		}
	}
	
	@Check
	protected void checkVariablesGlobales(Modulo modulo) {
		checkVariablesGlobalesAux(modulo.getImplementacion().getGlobal());
	}
	
	//Función que se asegura de que no existan dos variables globales con el mismo nombre
	@Check
	protected void checkVariablesGlobales(Algoritmo algoritmo) {
		checkVariablesGlobalesAux(algoritmo.getGlobal());
	}
	
	
	private void checkVariablesUsadasAux(List<Sentencias> sentencias, List<String> variables) {
		for(Sentencias sen: sentencias) {
			if(sen instanceof LlamadaFuncion) {
				LlamadaFuncion f = (LlamadaFuncion) sen;
				for(valor val: f.getOperadores()) {
					if(val instanceof Operador) {
						Operador o = (Operador) val;
						if(o instanceof VariableID) {
							VariableID v = (VariableID) o;
							if(!variables.contains(v.getNombre())) {
								error(readerMessages.getString("VARIABLE_NO_DECLARADA", v.getNombre()), v, DiagramapseudocodigoPackage.Literals.VARIABLE_ID__NOMBRE, VARIABLE_NO_DEFINIDA);
							}
						}
					}
				}
			}
			else if(sen instanceof Leer) {
				Leer l = (Leer) sen;
				if(l.getVariable() instanceof VariableID) {
					VariableID v = (VariableID) l.getVariable();
					if(!variables.contains(v.getNombre())) {
						error(readerMessages.getString("VARIABLE_NO_DECLARADA", v.getNombre()), v, DiagramapseudocodigoPackage.Literals.VARIABLE_ID__NOMBRE, VARIABLE_NO_DEFINIDA);
					}
				}
			}
			
			else if(sen instanceof Escribir) {
				Escribir e = (Escribir) sen;
				for(operacion o: e.getOperador()) {
					if(o instanceof VariableID) {
						VariableID v = (VariableID) o;
						if(!variables.contains(v.getNombre())) {
							error(readerMessages.getString("VARIABLE_NO_DECLARADA", v.getNombre()), v, DiagramapseudocodigoPackage.Literals.VARIABLE_ID__NOMBRE, VARIABLE_NO_DEFINIDA);
						}
					}
				}
			}
			
			else if(sen instanceof Negacion) {
				Negacion neg = (Negacion) sen;
				if(!variables.contains(neg.getValor_operacion())){
					error(readerMessages.getString("VARIABLE_NO_DECLARADA", neg.getValor_operacion()), neg, DiagramapseudocodigoPackage.Literals.NEGACION__VALOR_OPERACION, VARIABLE_NO_DEFINIDA);
				}
			}
			
			else if(sen instanceof Asignacion) {
				Asignacion a = (Asignacion) sen;
				if(a instanceof AsignacionNormal) {
					AsignacionNormal as = (AsignacionNormal) a;
					
					if(!variables.contains(as.getValor_asignacion())) {
						error(readerMessages.getString("VARIABLE_NO_DECLARADA", as.getValor_asignacion()), as, DiagramapseudocodigoPackage.Literals.ASIGNACION_NORMAL__VALOR_ASIGNACION, VARIABLE_NO_DEFINIDA);
					}
					if(as.getOperador() instanceof VariableID) {
						VariableID v = (VariableID) as.getOperador();
						if(!variables.contains(v.getNombre())){
							error(readerMessages.getString("VARIABLE_NO_DECLARADA", v.getNombre()), v, DiagramapseudocodigoPackage.Literals.VARIABLE_ID__NOMBRE, VARIABLE_NO_DEFINIDA);
						}
					}
					else if(as.getOperador() instanceof unaria) {
						unaria u = (unaria) as.getOperador();
						if(u.getVariable() instanceof VariableID) {
							VariableID v = (VariableID) u.getVariable();
							if(!variables.contains(v.getNombre())) {
								error(readerMessages.getString("VARIABLE_NO_DECLARADA", v.getNombre()), v, DiagramapseudocodigoPackage.Literals.VARIABLE_ID__NOMBRE, VARIABLE_NO_DEFINIDA);
							}
						}
					}
					else if(as.getOperador() instanceof operacion) {
						operacion o = (operacion) as.getOperador();
						ArrayList<valor> valores = new ArrayList<valor>();
						valores = funciones.registrarValoresOperacion(o, valores);
						
						List<ValorRegistro> variablesRegistroNoDeclaradas = funciones.variablesRegistroDeclaradas(valores, variables);
						if(variablesRegistroNoDeclaradas.size() != 0) {
							for(ValorRegistro vr: variablesRegistroNoDeclaradas) {
								error(readerMessages.getString("VARIABLE_NO_DECLARADA", vr.getNombre_registro()), vr, DiagramapseudocodigoPackage.Literals.VALOR_REGISTRO__NOMBRE_REGISTRO);
							}
						}
						List<VariableID> variablesNoDeclaradas = funciones.variablesDeclaradas(valores, variables);
						if(variablesNoDeclaradas.size() != 0) {
							for(VariableID v: variablesNoDeclaradas) {
								error(readerMessages.getString("VARIABLE_NO_DECLARADA", v.getNombre()), v, DiagramapseudocodigoPackage.Literals.VARIABLE_ID__NOMBRE, VARIABLE_NO_DEFINIDA);
							}
						}
						List<ValorVector> variablesVectorNoDeclaradas = funciones.variablesVectorDeclaradas(valores, variables);
						if(variablesVectorNoDeclaradas.size() != 0) {
							for(ValorVector v: variablesVectorNoDeclaradas) {
								error(readerMessages.getString("VARIABLE_NO_DECLARADA", v.getNombre_vector()), v, DiagramapseudocodigoPackage.Literals.VALOR_VECTOR__NOMBRE_VECTOR);
							}
						}
						List<ValorMatriz> variablesMatrizNoDeclaradas = funciones.variablesMatrizDeclaradas(valores, variables);
						if(variablesMatrizNoDeclaradas.size() != 0) {
							for(ValorMatriz m: variablesMatrizNoDeclaradas) {
								error(readerMessages.getString("VARIABLE_NO_DECLARADA", m.getNombre_matriz()), m, DiagramapseudocodigoPackage.Literals.VALOR_MATRIZ__NOMBRE_MATRIZ);
							}
						}
						
						for(valor v: valores) {
							if(v instanceof ValorVector) {
								ValorVector vector = (ValorVector) v;
								if(vector.getIndice() instanceof VariableID) {
									VariableID var = (VariableID) vector.getIndice();
									if(!variables.contains(var.getNombre())){
										error(readerMessages.getString("VARIABLE_NO_DECLARADA", var.getNombre()), var, DiagramapseudocodigoPackage.Literals.VARIABLE_ID__NOMBRE, VARIABLE_NO_DEFINIDA);
									}
								}
							}
							else if(v instanceof ValorMatriz) {
								ValorMatriz m = (ValorMatriz) v;
								ArrayList<operacion> indicesMatriz = new ArrayList<operacion>();
								indicesMatriz.add(m.getPrimerIndice());
								indicesMatriz.add(m.getSegundoIndice());
								for(operacion op: indicesMatriz) {
									if(op instanceof VariableID) {
										VariableID var = (VariableID) op;
										if(!variables.contains(var.getNombre())) {
											error(readerMessages.getString("VARIABLE_NO_DECLARADA", var.getNombre()), var, DiagramapseudocodigoPackage.Literals.VARIABLE_ID__NOMBRE, VARIABLE_NO_DEFINIDA);
										}
									}
								}
							}
							else if(v instanceof LlamadaFuncion) {
								LlamadaFuncion f = (LlamadaFuncion) v;
								for(valor val: f.getOperadores()) {
									if(val instanceof Operador) {
										Operador op = (Operador) val;
										if(op instanceof VariableID) {
											VariableID var = (VariableID) op;
											if(!variables.contains(var.getNombre())) {
												error(readerMessages.getString("VARIABLE_NO_DECLARADA", var.getNombre()), var, DiagramapseudocodigoPackage.Literals.VARIABLE_ID__NOMBRE, VARIABLE_NO_DEFINIDA);
											}
										}
										else if(op instanceof ValorVector) {
											ValorVector vector = (ValorVector) op;
											if(vector.getIndice() instanceof VariableID) {
												VariableID var = (VariableID) vector.getIndice();
												if(!variables.contains(var.getNombre())) {
													error(readerMessages.getString("VARIABLE_NO_DECLARADA", var.getNombre()), var, DiagramapseudocodigoPackage.Literals.VARIABLE_ID__NOMBRE, VARIABLE_NO_DEFINIDA);
												}
											}
										}
										else if(op instanceof ValorMatriz) {
											ValorMatriz m = (ValorMatriz) op;
											ArrayList<operacion> indicesMatriz = new ArrayList<operacion>();
											indicesMatriz.add(m.getPrimerIndice());
											indicesMatriz.add(m.getSegundoIndice());
											for(operacion operacionAux: indicesMatriz) {
												if(operacionAux instanceof VariableID) {
													VariableID var = (VariableID) operacionAux;
													if(!variables.contains(var.getNombre())){
														error(readerMessages.getString("VARIABLE_NO_DECLARADA", var.getNombre()), var, DiagramapseudocodigoPackage.Literals.VARIABLE_ID__NOMBRE, VARIABLE_NO_DEFINIDA);
													}
												}
											}
										}
									}	
								}
							}
						}
					}
					else if(as.getOperador() instanceof LlamadaFuncion) {
						LlamadaFuncion f = (LlamadaFuncion) as.getOperador();
						for(valor v: f.getOperadores()) {
							if(v instanceof Operador) {
								Operador o = (Operador) v;
								if(o instanceof VariableID) {
									VariableID var = (VariableID) o;
									if(!variables.contains(var.getNombre())) {
										error(readerMessages.getString("VARIABLE_NO_DECLARADA", var.getNombre()), var, DiagramapseudocodigoPackage.Literals.VARIABLE_ID__NOMBRE, VARIABLE_NO_DEFINIDA);
									}
								}
								else if(o instanceof ValorVector) {
									ValorVector vector = (ValorVector) o;
									if(vector.getIndice() instanceof VariableID) {
										VariableID var = (VariableID) vector.getIndice();
										if(!variables.contains(var.getNombre())) {
											error(readerMessages.getString("VARIABLE_NO_DECLARADA", var.getNombre()), var, DiagramapseudocodigoPackage.Literals.VARIABLE_ID__NOMBRE, VARIABLE_NO_DEFINIDA);
										}
									}
								}
								else if(o instanceof ValorMatriz) {
									ValorMatriz m = (ValorMatriz) o;
									ArrayList<operacion> indicesMatriz = new ArrayList<operacion>();
									indicesMatriz.add(m.getPrimerIndice());
									indicesMatriz.add(m.getSegundoIndice());
									for(operacion op: indicesMatriz) {
										if(op instanceof VariableID) {
											VariableID var = (VariableID) op;
											if(!variables.contains(var.getNombre())){
												error(readerMessages.getString("VARIABLE_NO_DECLARADA", var.getNombre()), var, DiagramapseudocodigoPackage.Literals.VARIABLE_ID__NOMBRE, VARIABLE_NO_DEFINIDA);
											}
										}
									}
								}
							}
						}
					}
					else if(as.getOperador() instanceof ValorVector) {
						ValorVector v = (ValorVector) as.getOperador();
						if(v.getIndice() instanceof VariableID) {
							VariableID var = (VariableID) v.getIndice();
							if(!variables.contains(var.getNombre())) {
								error(readerMessages.getString("VARIABLE_NO_DECLARADA", var.getNombre()), var, DiagramapseudocodigoPackage.Literals.VARIABLE_ID__NOMBRE, VARIABLE_NO_DEFINIDA);
							}
						}
					}
					else if(as.getOperador() instanceof ValorMatriz) {
						ValorMatriz m = (ValorMatriz) as.getOperador();
						ArrayList<operacion> indicesMatriz = new ArrayList<operacion>();
						indicesMatriz.add(m.getPrimerIndice());
						indicesMatriz.add(m.getSegundoIndice());
						for(operacion op: indicesMatriz) {
							if(op instanceof VariableID) {
								VariableID var = (VariableID) op;
								if(!variables.contains(var.getNombre())) {
									error(readerMessages.getString("VARIABLE_NO_DECLARADA", var.getNombre()), var, DiagramapseudocodigoPackage.Literals.VARIABLE_ID__NOMBRE, VARIABLE_NO_DEFINIDA);
								}
							}
						}
					}
				}
				else if(a instanceof AsignacionCompleja) {
					AsignacionCompleja ac = (AsignacionCompleja) a;
					if(ac.getValor_asignacion() instanceof ValorRegistro) {
						ValorRegistro r = (ValorRegistro) ac.getValor_asignacion();
						if(!variables.contains(r.getNombre_registro())) {
							error(readerMessages.getString("VARIABLE_NO_DECLARADA", r.getNombre_registro()), r, DiagramapseudocodigoPackage.Literals.VALOR_REGISTRO__NOMBRE_REGISTRO);
						}
					}
					else if(ac.getValor_asignacion() instanceof ValorVector) {
						ValorVector v = (ValorVector) ac.getValor_asignacion();
						if(v.getIndice() instanceof VariableID) {
							VariableID var = (VariableID) v.getIndice();
							if(!variables.contains(var.getNombre())) {
								error(readerMessages.getString("VARIABLE_NO_DECLARADA", var.getNombre()), var, DiagramapseudocodigoPackage.Literals.VARIABLE_ID__NOMBRE, VARIABLE_NO_DEFINIDA);
							}
						}
					}
					else if(ac.getOperador() instanceof ValorMatriz) {
						ValorMatriz m = (ValorMatriz) ac.getOperador();
						ArrayList<operacion> indicesMatriz = new ArrayList<operacion>();
						indicesMatriz.add(m.getPrimerIndice());
						indicesMatriz.add(m.getSegundoIndice());
						for(operacion op: indicesMatriz) {
							if(op instanceof VariableID) {
								VariableID var = (VariableID) op;
								if(!variables.contains(var.getNombre())) {
									error(readerMessages.getString("VARIABLE_NO_DECLARADA", var.getNombre()), var, DiagramapseudocodigoPackage.Literals.VARIABLE_ID__NOMBRE, VARIABLE_NO_DEFINIDA);
								}
							}
						}
					}
					if(ac.getOperador() instanceof VariableID) {
						VariableID v = (VariableID) ac.getOperador();
						if(!variables.contains(v.getNombre())) {
							error(readerMessages.getString("VARIABLE_NO_DECLARADA", v.getNombre()), v, DiagramapseudocodigoPackage.Literals.VARIABLE_ID__NOMBRE, VARIABLE_NO_DEFINIDA);
						}
					}
					else if(ac.getOperador() instanceof unaria) {
						unaria u = (unaria) ac.getOperador();
						if(u.getVariable() instanceof VariableID) {
							VariableID v = (VariableID) u.getVariable();
							if(!variables.contains(v.getNombre())) {
								error(readerMessages.getString("VARIABLE_NO_DECLARADA", v.getNombre()), v, DiagramapseudocodigoPackage.Literals.VARIABLE_ID__NOMBRE, VARIABLE_NO_DEFINIDA);
							}
						}
					}
					else if(ac.getOperador() instanceof operacion) {
						operacion o = (operacion) ac.getOperador();
						ArrayList<valor> valores = new ArrayList<valor>();
						valores = funciones.registrarValoresOperacion(o, valores);
						
						List<ValorRegistro> variablesRegistroNoDeclaradas = funciones.variablesRegistroDeclaradas(valores, variables);
						if(variablesRegistroNoDeclaradas.size() != 0) {
							for(ValorRegistro vr: variablesRegistroNoDeclaradas) {
								error(readerMessages.getString("VARIABLE_NO_DECLARADA", vr.getNombre_registro()), vr, DiagramapseudocodigoPackage.Literals.VALOR_REGISTRO__NOMBRE_REGISTRO);
							}
						}
						List<VariableID> variablesNoDeclaradas = funciones.variablesDeclaradas(valores, variables);
						if(variablesNoDeclaradas.size() != 0) {
							for(VariableID v: variablesNoDeclaradas) {
								error(readerMessages.getString("VARIABLE_NO_DECLARADA", v.getNombre()), v, DiagramapseudocodigoPackage.Literals.VARIABLE_ID__NOMBRE, VARIABLE_NO_DEFINIDA);
							}
						}
						List<ValorVector> variablesVectorNoDeclaradas = funciones.variablesVectorDeclaradas(valores, variables);
						if(variablesVectorNoDeclaradas.size() != 0) {
							for(ValorVector v: variablesVectorNoDeclaradas) {
								error(readerMessages.getString("VARIABLE_NO_DECLARADA", v.getNombre_vector()), v, DiagramapseudocodigoPackage.Literals.VALOR_VECTOR__NOMBRE_VECTOR);
							}
						}
						List<ValorMatriz> variablesMatrizNoDeclaradas = funciones.variablesMatrizDeclaradas(valores, variables);
						if(variablesMatrizNoDeclaradas.size() != 0) {
							for(ValorMatriz m: variablesMatrizNoDeclaradas) {
								error(readerMessages.getString("VARIABLE_NO_DECLARADA", m.getNombre_matriz()), m, DiagramapseudocodigoPackage.Literals.VALOR_MATRIZ__NOMBRE_MATRIZ);
							}
						}
						
						for(valor v: valores) {
							if(v instanceof ValorVector) {
								ValorVector vector = (ValorVector) v;
								if(vector.getIndice() instanceof VariableID) {
									VariableID var = (VariableID) vector.getIndice();
									if(!variables.contains(var.getNombre())) {
										error(readerMessages.getString("VARIABLE_NO_DECLARADA", var.getNombre()), var, DiagramapseudocodigoPackage.Literals.VARIABLE_ID__NOMBRE, VARIABLE_NO_DEFINIDA);
									}
								}
							}
							else if(v instanceof ValorMatriz) {
								ValorMatriz m = (ValorMatriz) v;
								ArrayList<operacion> indicesMatriz = new ArrayList<operacion>();
								indicesMatriz.add(m.getPrimerIndice());
								indicesMatriz.add(m.getSegundoIndice());
								for(operacion op: indicesMatriz) {
									if(op instanceof VariableID) {
										VariableID var = (VariableID) op;
										if(!variables.contains(var.getNombre())) {
											error(readerMessages.getString("VARIABLE_NO_DECLARADA", var.getNombre()), var, DiagramapseudocodigoPackage.Literals.VARIABLE_ID__NOMBRE, VARIABLE_NO_DEFINIDA);
										}
									}
								}
							}
							else if(v instanceof LlamadaFuncion) {
								LlamadaFuncion f = (LlamadaFuncion) v;
								for(valor val: f.getOperadores()) {
									if(val instanceof Operador) {
										Operador op = (Operador) val;
										if(op instanceof VariableID) {
											VariableID var = (VariableID) op;
											if(!variables.contains(var.getNombre())) {
												error(readerMessages.getString("VARIABLE_NO_DECLARADA", var.getNombre()), var, DiagramapseudocodigoPackage.Literals.VARIABLE_ID__NOMBRE, VARIABLE_NO_DEFINIDA);
											}
										}
										else if(op instanceof ValorVector) {
											ValorVector vector = (ValorVector) op;
											if(vector.getIndice() instanceof VariableID) {
												VariableID var = (VariableID) vector.getIndice();
												if(!variables.contains(var.getNombre())) {
													error(readerMessages.getString("VARIABLE_NO_DECLARADA", var.getNombre()), var, DiagramapseudocodigoPackage.Literals.VARIABLE_ID__NOMBRE, VARIABLE_NO_DEFINIDA);
												}
											}
										}
										else if(op instanceof ValorMatriz) {
											ValorMatriz m = (ValorMatriz) op;
											ArrayList<operacion> indicesMatriz = new ArrayList<operacion>();
											indicesMatriz.add(m.getPrimerIndice());
											indicesMatriz.add(m.getSegundoIndice());
											for(operacion operacionAux: indicesMatriz) {
												if(operacionAux instanceof VariableID) {
													VariableID var = (VariableID) operacionAux;
													if(!variables.contains(var.getNombre())) {
														error(readerMessages.getString("VARIABLE_NO_DECLARADA", var.getNombre()), var, DiagramapseudocodigoPackage.Literals.VARIABLE_ID__NOMBRE, VARIABLE_NO_DEFINIDA);
													}
												}
											}
										}
									}	
								}
							}
						}
					}
					else if(ac.getOperador() instanceof LlamadaFuncion) {
						LlamadaFuncion f = (LlamadaFuncion) ac.getOperador();
						for(valor v: f.getOperadores()) {
							if(v instanceof Operador) {
								Operador o = (Operador) v;
								if(o instanceof VariableID) {
									VariableID var = (VariableID) o;
									if(!variables.contains(var.getNombre())) {
										error(readerMessages.getString("VARIABLE_NO_DECLARADA", var.getNombre()), var, DiagramapseudocodigoPackage.Literals.VARIABLE_ID__NOMBRE, VARIABLE_NO_DEFINIDA);
									}
								}
								else if(o instanceof ValorVector) {
									ValorVector vector = (ValorVector) o;
									if(vector.getIndice() instanceof VariableID) {
										VariableID var = (VariableID) vector.getIndice();
										if(!variables.contains(var.getNombre())) {
											error(readerMessages.getString("VARIABLE_NO_DECLARADA", var.getNombre()), var, DiagramapseudocodigoPackage.Literals.VARIABLE_ID__NOMBRE, VARIABLE_NO_DEFINIDA);
										}
									}
								}
								else if(o instanceof ValorMatriz) {
									ValorMatriz m = (ValorMatriz) o;
									ArrayList<operacion> indicesMatriz = new ArrayList<operacion>();
									indicesMatriz.add(m.getPrimerIndice());
									indicesMatriz.add(m.getSegundoIndice());
									for(operacion op: indicesMatriz) {
										if(op instanceof VariableID) {
											VariableID var = (VariableID) op;
											if(!variables.contains(var.getNombre())) {
												error(readerMessages.getString("VARIABLE_NO_DECLARADA", var.getNombre()), var, DiagramapseudocodigoPackage.Literals.VARIABLE_ID__NOMBRE, VARIABLE_NO_DEFINIDA);
											}
										}
									}
								}
							}	
						}
					}
					else if(ac.getOperador() instanceof ValorVector) {
						ValorVector v = (ValorVector) ac.getOperador();
						if(v.getIndice() instanceof VariableID) {
							VariableID var = (VariableID) v.getIndice();
							if(!variables.contains(var.getNombre())) {
								error(readerMessages.getString("VARIABLE_NO_DECLARADA", var.getNombre()), var, DiagramapseudocodigoPackage.Literals.VARIABLE_ID__NOMBRE, VARIABLE_NO_DEFINIDA);
							}
						}
					}
					else if(ac.getOperador() instanceof ValorMatriz) {
						ValorMatriz m = (ValorMatriz) ac.getOperador();
						ArrayList<operacion> indicesMatriz = new ArrayList<operacion>();
						indicesMatriz.add(m.getPrimerIndice());
						indicesMatriz.add(m.getSegundoIndice());
						for(operacion op: indicesMatriz) {
							if(op instanceof VariableID) {
								VariableID var = (VariableID) op;
								if(!variables.contains(var.getNombre())) {
									error(readerMessages.getString("VARIABLE_NO_DECLARADA", var.getNombre()), var, DiagramapseudocodigoPackage.Literals.VARIABLE_ID__NOMBRE, VARIABLE_NO_DEFINIDA);
								}
							}
						}
					}
				}
			}
		}
	}
	
	@Check
	protected void checkVariablesUsadas(Modulo modulo) {
		
		List<String> variablesGlobales = funciones.registrarVariables(modulo.getImplementacion().getGlobal());
		List<String> constantes = funciones.registrarConstantes(modulo.getImplementacion().getConstantes());
		List<String> importadas = new ArrayList<String>();
		
		for(Modulo m: modulo.getImportaciones()) {
			importadas.addAll(funciones.registrarVariables(m.getExporta_global()));
		}
		
		for(Subproceso s: modulo.getImplementacion().getFuncion()) {
			checkVariablesUsadas(s, variablesGlobales, constantes, importadas);
		}
	}
	
	@Check
	//Función que comprueba que una variable deba estar definida antes de usarse
	protected void checkVariablesUsadas(Algoritmo algoritmo) {
		Inicio i = algoritmo.getTiene();
		List<String> variables = funciones.registrarVariables(i.getDeclaracion());
		List<String> variablesGlobales = funciones.registrarVariables(algoritmo.getGlobal());
		List<String> constantes = funciones.registrarConstantes(algoritmo.getConstantes());
		List<String> importadas = new ArrayList<String>();
		for(Modulo m: algoritmo.getImportaciones()) {
			importadas.addAll(funciones.registrarVariables(m.getExporta_global()));
			constantes.addAll(m.getExporta_constantes());
		}
		
		List<String> totalVariables = variables;
		totalVariables.addAll(variablesGlobales);
		totalVariables.addAll(constantes);
		totalVariables.addAll(importadas);
		
		for(Subproceso s: algoritmo.getFuncion()) {
			checkVariablesUsadas(s, variablesGlobales, constantes, importadas);
		}
		
		checkVariablesUsadasAux(i.getTiene(), totalVariables);
		
		//Ahora vamos a comprobar las sentencias que están en los bloques
		
		for(Sentencias s: i.getTiene()) {
			if(s instanceof Bloque) {
				Bloque bloque = (Bloque) s;
				if(bloque instanceof segun) {
					segun seg = (segun) bloque;
					for(Caso c: seg.getCaso()) {
						checkVariablesUsadasAux(c.getSentencias(), totalVariables);
						
						for(Sentencias sentencias: c.getSentencias()) {
							if(sentencias instanceof Bloque) {
								Bloque bloqueAux = (Bloque) sentencias;
								checkVariablesUsadasAux(bloqueAux.getSentencias(), totalVariables);
							}
						}
					}
				}
				else {
					checkVariablesUsadasAux(bloque.getSentencias(), totalVariables);
					
					for(Sentencias sentencias: bloque.getSentencias()) {
						if(sentencias instanceof Bloque) {
							Bloque bloqueAux = (Bloque) sentencias;
							checkVariablesUsadasAux(bloqueAux.getSentencias(), totalVariables);
						}
					}
				}
			}
		}
	}
	
	
	//Función que comprueba que una variable deba estar definida antes de usarse
	private void checkVariablesUsadas(Subproceso s, List<String> variablesGlobales, List<String> constantes, List<String> importadas) {
		List<String> variables = funciones.registrarVariables(s.getDeclaracion());
		
		List<String> totalVariables = variables;
		totalVariables.addAll(variablesGlobales);
		totalVariables.addAll(constantes);
		totalVariables.addAll(importadas);
		
		//Como son subprocesos también se añaden a la lista los parámetros
		for(ParametroFuncion p: s.getParametrofuncion()) {
			variables.add(p.getVariable().getNombre());
		}
		
		checkVariablesUsadasAux(s.getSentencias(), totalVariables);
		
		//Ahora vamos a comprobar las sentencias que están en los bloques
		
		for(Sentencias sentencias: s.getSentencias()) {
			if(s instanceof Bloque) {
				Bloque bloque = (Bloque) sentencias;
				if(bloque instanceof segun) {
					segun seg = (segun) bloque;
					for(Caso c: seg.getCaso()) {
						checkVariablesUsadasAux(c.getSentencias(), totalVariables);
						
						for(Sentencias sen: c.getSentencias()) {
							if(sen instanceof Bloque) {
								Bloque bloqueAux = (Bloque) sen;
								checkVariablesUsadasAux(bloqueAux.getSentencias(), totalVariables);
							}
						}
					}
				}
				else {
					checkVariablesUsadasAux(bloque.getSentencias(), totalVariables);
					
					for(Sentencias sen: bloque.getSentencias()) {
						if(sen instanceof Bloque) {
							Bloque bloqueAux = (Bloque) sen;
							checkVariablesUsadasAux(bloqueAux.getSentencias(), totalVariables);
						}
					}
				}
			}
		}
	}
	
	
	private void checkLlamadaFuncionAux(List<Sentencias> sentencias, List<String> funciones, List<ArrayList<Integer>> parametros) {
		for(Sentencias s: sentencias) {
			if(s instanceof LlamadaFuncion) {
				LlamadaFuncion l = (LlamadaFuncion) s;
				if(!funciones.contains(l.getNombre())) {
					error(readerMessages.getString("FUNCION_NO_DECLARADA", l.getNombre()), l, DiagramapseudocodigoPackage.Literals.LLAMADA_FUNCION__NOMBRE);
				}
				else if(!parametros.get(funciones.indexOf(l.getNombre())).contains(l.getOperadores().size())) {
					error(readerMessages.getString("FUNCION_NUMERO_PARAMETROS", parametros.get(funciones.indexOf(l.getNombre()))), l, DiagramapseudocodigoPackage.Literals.LLAMADA_FUNCION__NOMBRE);
				}
			}
			else if(s instanceof Asignacion) {
				Asignacion a = (Asignacion) s;
				if(a instanceof AsignacionNormal) {
					AsignacionNormal an = (AsignacionNormal) a;
					if(an.getOperador() instanceof LlamadaFuncion) {
						LlamadaFuncion f = (LlamadaFuncion) an.getOperador();
						if(!funciones.contains(f.getNombre())) {
							error(readerMessages.getString("FUNCION_NO_DECLARADA", f.getNombre()), f, DiagramapseudocodigoPackage.Literals.LLAMADA_FUNCION__NOMBRE);
						}
						else if(!parametros.get(funciones.indexOf(f.getNombre())).contains(f.getOperadores().size())) {
							error(readerMessages.getString("FUNCION_NUMERO_PARAMETROS", parametros.get(funciones.indexOf(f.getNombre()))), f, DiagramapseudocodigoPackage.Literals.LLAMADA_FUNCION__NOMBRE);
						}
					}
				}
			}
		}
	}
	
	@Check
	protected void checkLlamadaFuncion(Modulo modulo) {
		List<String> funciones = new ArrayList<String>();
		List<ArrayList<Integer>> parametros = new ArrayList<ArrayList<Integer>>();
		for(Subproceso s: modulo.getImplementacion().getFuncion()) {
			//Se presupone que no hay ninguna repetida porque ya existe una función que se encarga de ello
			if(!funciones.contains(s.getNombre())) {
				//Si todavia no hay ninguna que se llame así, la registramos
				funciones.add(s.getNombre());
				parametros.add(new ArrayList<Integer>());
				parametros.get(funciones.indexOf(s.getNombre())).add(s.getParametrofuncion().size());
			}
			else {
				//Si el nombre existe y no tiene el mismo número de parámetros lo registramos
				parametros.get(funciones.indexOf(s.getNombre())).add(s.getParametrofuncion().size());
			}
		}
		
		for(Modulo m: modulo.getImportaciones()) {
			for(CabeceraSubproceso cabecera: m.getExporta_funciones()) {
				if(!funciones.contains(cabecera.getNombre())) {
					funciones.add(cabecera.getNombre());
					parametros.add(new ArrayList<Integer>());
					parametros.get(funciones.indexOf(cabecera.getNombre())).add(cabecera.getParametrofuncion().size());
				}
				else {
					parametros.get(funciones.indexOf(cabecera.getNombre())).add(cabecera.getParametrofuncion().size());
				}
			}
		}
		
		for(Subproceso s: modulo.getImplementacion().getFuncion()) {
			funciones.add(s.getNombre());
		}
		
		for(Subproceso sub: modulo.getImplementacion().getFuncion()) {
			checkLlamadaFuncionAux(sub.getSentencias(), funciones, parametros);
			
			for(Sentencias s: sub.getSentencias()) {
				if(s instanceof Bloque) {
					Bloque bloque = (Bloque) s;
					if(bloque instanceof segun) {
						segun seg = (segun) bloque;
						for(Caso caso: seg.getCaso()) {
							checkLlamadaFuncionAux(caso.getSentencias(), funciones, parametros);
							
							for(Sentencias sentencias: caso.getSentencias()) {
								if(sentencias instanceof Bloque) {
									Bloque bloqueAux = (Bloque) sentencias;
									checkLlamadaFuncionAux(bloqueAux.getSentencias(), funciones, parametros);
								}
							}
						}
					}
					else {
						checkLlamadaFuncionAux(bloque.getSentencias(), funciones, parametros);
						
						for(Sentencias sentencias: bloque.getSentencias()) {
							if(sentencias instanceof Bloque) {
								Bloque bloqueAux = (Bloque) sentencias;
								checkLlamadaFuncionAux(bloqueAux.getSentencias(), funciones, parametros);
							}
						}
					}
				}
			}
			
		}
	}
	
	@Check
	//Función que comprueba que las funciones que se llamen hayan sido declaradas previamente y se les pase el número de parámetros oportuno
	protected void checkLlamadaFuncion(Algoritmo algoritmo) {
		List<String> funciones = new ArrayList<String>();
		List<ArrayList<Integer>> parametros = new ArrayList<ArrayList<Integer>>();
		for(Subproceso s: algoritmo.getFuncion()) {
			//Se presupone que no hay ninguna repetida porque ya existe una función que se encarga de ello
			if(!funciones.contains(s.getNombre())) {
				//Si todavia no hay ninguna que se llame así, la registramos
				funciones.add(s.getNombre());
				parametros.add(new ArrayList<Integer>());
				parametros.get(funciones.indexOf(s.getNombre())).add(s.getParametrofuncion().size());
			}
			else {
				//Si el nombre existe y no tiene el mismo número de parámetros lo registramos
				parametros.get(funciones.indexOf(s.getNombre())).add(s.getParametrofuncion().size());
			}
		}
		for(Modulo m: algoritmo.getImportaciones()) {
			for(CabeceraSubproceso cabecera: m.getExporta_funciones()) {
				if(!funciones.contains(cabecera.getNombre())) {
					funciones.add(cabecera.getNombre());
					parametros.add(new ArrayList<Integer>());
					parametros.get(funciones.indexOf(cabecera.getNombre())).add(cabecera.getParametrofuncion().size());
				}
				else {
					parametros.get(funciones.indexOf(cabecera.getNombre())).add(cabecera.getParametrofuncion().size());
				}
			}
		}
		//Añadimos las funciones publicas de los modulos importados
		for(Modulo m: algoritmo.getImportaciones()) {
			for(CabeceraSubproceso cabecera: m.getExporta_funciones()) {
				if(!funciones.contains(cabecera.getNombre())) {
					funciones.add(cabecera.getNombre());
					parametros.add(new ArrayList<Integer>());
					parametros.get(funciones.indexOf(cabecera.getNombre())).add(cabecera.getParametrofuncion().size());
				}
				else {
					parametros.get(funciones.indexOf(cabecera.getNombre())).add(cabecera.getParametrofuncion().size());
				}
			}
		}
		
		//for(Subproceso s: algoritmo.getFuncion()) {
		//	funciones.add(s.getNombre());
		//}
		
		checkLlamadaFuncionAux(algoritmo.getTiene().getTiene(), funciones, parametros);
		
		for(Sentencias s: algoritmo.getTiene().getTiene()) {
			if(s instanceof Bloque) {
				Bloque bloque = (Bloque) s;
				if(bloque instanceof segun) {
					segun seg = (segun) bloque;
					for(Caso caso: seg.getCaso()) {
						checkLlamadaFuncionAux(caso.getSentencias(), funciones, parametros);
						
						for(Sentencias sentencias: caso.getSentencias()) {
							if(sentencias instanceof Bloque) {
								Bloque bloqueAux = (Bloque) sentencias;
								checkLlamadaFuncionAux(bloqueAux.getSentencias(), funciones, parametros);
							}
						}
					}
				}
				else {
					checkLlamadaFuncionAux(bloque.getSentencias(), funciones, parametros);
					
					for(Sentencias sentencias: bloque.getSentencias()) {
						if(sentencias instanceof Bloque) {
							Bloque bloqueAux = (Bloque) sentencias;
							checkLlamadaFuncionAux(bloqueAux.getSentencias(), funciones, parametros);
						}
					}
				}
			}
		}
		
		for(Subproceso sub: algoritmo.getFuncion()) {
			checkLlamadaFuncionAux(sub.getSentencias(), funciones, parametros);
			
			for(Sentencias s: sub.getSentencias()) {
				if(s instanceof Bloque) {
					Bloque bloque = (Bloque) s;
					if(bloque instanceof segun) {
						segun seg = (segun) bloque;
						for(Caso caso: seg.getCaso()) {
							checkLlamadaFuncionAux(caso.getSentencias(), funciones, parametros);
							
							for(Sentencias sentencias: caso.getSentencias()) {
								if(sentencias instanceof Bloque) {
									Bloque bloqueAux = (Bloque) sentencias;
									checkLlamadaFuncionAux(bloqueAux.getSentencias(), funciones, parametros);
								}
							}
						}
					}
					else {
						checkLlamadaFuncionAux(bloque.getSentencias(), funciones, parametros);
						
						for(Sentencias sentencias: bloque.getSentencias()) {
							if(sentencias instanceof Bloque) {
								Bloque bloqueAux = (Bloque) sentencias;
								checkLlamadaFuncionAux(bloqueAux.getSentencias(), funciones, parametros);
							}
						}
					}
				}
			}
			
		}
	}
	
	//Función auxiliar para cumplir el principio DRY
	private void checkParametrosLlamadaAux(List<Sentencias> sentencias, List<String> tipos, String nombre, int parametros, Map<String,String> variablesDeclaradas, Map<String,String> tiposVectoresMatrices, Map<String,HashMap<String,String>> tiposRegistros) {
		for(Sentencias sen: sentencias) {
			if(sen instanceof LlamadaFuncion) {
				LlamadaFuncion f = (LlamadaFuncion) sen;
				if(f.getNombre().equals(nombre) && f.getOperadores().size() == parametros) {
					List<String> nombresVariables = new ArrayList<String>();
					Map<String,String> nombresVariablesCampos = new HashMap<String,String>();
					List<String> tiposNativos = new ArrayList<String>();
					List<String> nombresValoresComplejos = new ArrayList<String>();
					funciones.registrarParametros(f.getOperadores(), nombresVariables, nombresVariablesCampos, tiposNativos, variablesDeclaradas, tiposVectoresMatrices, tiposRegistros, nombresValoresComplejos, readerMessages);
					String salidaBuena = "";
					String salidaMala = "";
					if(tipos.size() > 0) {
						salidaBuena = funciones.getCadenaTiposCorrectos(tipos);
						salidaMala = funciones.getCadenaTiposIncorrectos(nombresVariables, variablesDeclaradas, tiposVectoresMatrices, tiposRegistros, nombresVariablesCampos, tiposNativos, nombresValoresComplejos);
					}
					//!funciones.comprobarCorreccionTiposLlamada(nombresVariables, variablesDeclaradas, tipos)
					if(!salidaBuena.equals(salidaMala)) {
						error(readerMessages.getString("TIPOS_LLAMADA", nombre, salidaMala, salidaBuena), f, DiagramapseudocodigoPackage.Literals.LLAMADA_FUNCION__NOMBRE);
					}
				}
			}
			else if(sen instanceof Asignacion) {
				Asignacion a = (Asignacion) sen;
				if(a instanceof AsignacionNormal) {
					AsignacionNormal an = (AsignacionNormal) a;
					if(an.getOperador() instanceof LlamadaFuncion) {
						LlamadaFuncion f = (LlamadaFuncion) an.getOperador();
						if(f.getNombre().equals(nombre) && f.getOperadores().size() == parametros) {
							List<String> nombresVariables = new ArrayList<String>();
							Map<String,String> nombresVariablesCampos = new HashMap<String,String>();
							List<String> tiposNativos = new ArrayList<String>();
							List<String> nombresValoresComplejos = new ArrayList<String>();
							funciones.registrarParametros(f.getOperadores(), nombresVariables, nombresVariablesCampos, tiposNativos, variablesDeclaradas, tiposVectoresMatrices, tiposRegistros, nombresValoresComplejos, readerMessages);
							String salidaBuena = "";
							String salidaMala = "";
							if(tipos.size() > 0) {
								salidaBuena = funciones.getCadenaTiposCorrectos(tipos);
								salidaMala = funciones.getCadenaTiposIncorrectos(nombresVariables, variablesDeclaradas, tiposVectoresMatrices, tiposRegistros, nombresVariablesCampos, tiposNativos, nombresValoresComplejos);
							}
							if(!salidaBuena.equals(salidaMala)) {
								error(readerMessages.getString("TIPOS_LLAMADA", nombre, salidaMala, salidaBuena), f, DiagramapseudocodigoPackage.Literals.LLAMADA_FUNCION__NOMBRE);
							}
						}
					}
					else if(funciones.esOperacion(an.getOperador())) {
						operacion o = (operacion) an.getOperador();
						ArrayList<valor> valores = new ArrayList<valor>();
						valores = funciones.registrarValoresOperacion(o, valores);
						for(valor v: valores) {
							if(v instanceof LlamadaFuncion) {
								LlamadaFuncion f = (LlamadaFuncion) v;
								if(f.getNombre().equals(nombre) && f.getOperadores().size() == parametros) {
									List<String> nombresVariables = new ArrayList<String>();
									Map<String,String> nombresVariablesCampos = new HashMap<String,String>();
									List<String> tiposNativos = new ArrayList<String>();
									List<String> nombresValoresComplejos = new ArrayList<String>();
									funciones.registrarParametros(f.getOperadores(), nombresVariables, nombresVariablesCampos, tiposNativos, variablesDeclaradas, tiposVectoresMatrices, tiposRegistros, nombresValoresComplejos, readerMessages);
									String salidaBuena = "";
									String salidaMala = "";
									if(tipos.size() > 0) {
										salidaBuena = funciones.getCadenaTiposCorrectos(tipos);
										salidaMala = funciones.getCadenaTiposIncorrectos(nombresVariables, variablesDeclaradas, tiposVectoresMatrices, tiposRegistros, nombresVariablesCampos, tiposNativos, nombresValoresComplejos);
									}
									if(!salidaBuena.equals(salidaMala)) {
										error(readerMessages.getString("TIPOS_LLAMADA", nombre, salidaMala, salidaBuena), f, DiagramapseudocodigoPackage.Literals.LLAMADA_FUNCION__NOMBRE);
									}
								}
							}
						}
					}
				}
				else if(a instanceof AsignacionCompleja) {
					AsignacionCompleja ac = (AsignacionCompleja) a;
					if(ac.getOperador() instanceof LlamadaFuncion) {
						LlamadaFuncion f = (LlamadaFuncion) ac.getOperador();
						if(f.getNombre().equals(nombre) && f.getOperadores().size() == parametros) {
							List<String> nombresVariables = new ArrayList<String>();
							Map<String,String> nombresVariablesCampos = new HashMap<String,String>();
							List<String> tiposNativos = new ArrayList<String>();
							List<String> nombresValoresComplejos = new ArrayList<String>();
							funciones.registrarParametros(f.getOperadores(), nombresVariables, nombresVariablesCampos, tiposNativos, variablesDeclaradas, tiposVectoresMatrices, tiposRegistros, nombresValoresComplejos, readerMessages);
							String salidaBuena = "";
							String salidaMala = "";
							if(tipos.size() > 0) {
								salidaBuena = funciones.getCadenaTiposCorrectos(tipos);
								salidaMala = funciones.getCadenaTiposIncorrectos(nombresVariables, variablesDeclaradas, tiposVectoresMatrices, tiposRegistros, nombresVariablesCampos, tiposNativos, nombresValoresComplejos);
							}
							if(!salidaBuena.equals(salidaMala)) {
								error(readerMessages.getString("TIPOS_LLAMADA", nombre, salidaMala, salidaBuena), f, DiagramapseudocodigoPackage.Literals.LLAMADA_FUNCION__NOMBRE);
							}
						}
					}
					else if(ac.getOperador() instanceof operacion) {
						operacion o = (operacion) ac.getOperador();
						ArrayList<valor> valores = new ArrayList<valor>();
						valores = funciones.registrarValoresOperacion(o, valores);
						for(valor v: valores) {
							if(v instanceof LlamadaFuncion) {
								LlamadaFuncion f = (LlamadaFuncion) v;
								if(f.getNombre().equals(nombre) && f.getOperadores().size() == parametros) {
									List<String> nombresVariables = new ArrayList<String>();
									Map<String,String> nombresVariablesCampos = new HashMap<String,String>();
									List<String> tiposNativos = new ArrayList<String>();
									List<String> nombresValoresComplejos = new ArrayList<String>();
									funciones.registrarParametros(f.getOperadores(), nombresVariables, nombresVariablesCampos, tiposNativos, variablesDeclaradas, tiposVectoresMatrices, tiposRegistros, nombresValoresComplejos, readerMessages);
									String salidaBuena = "";
									String salidaMala = "";
									if(tipos.size() > 0) {
										salidaBuena = funciones.getCadenaTiposCorrectos(tipos);
										salidaMala = funciones.getCadenaTiposIncorrectos(nombresVariables, variablesDeclaradas, tiposVectoresMatrices, tiposRegistros, nombresVariablesCampos, tiposNativos, nombresValoresComplejos);
									}
									if(!salidaBuena.equals(salidaMala)) {
										error(readerMessages.getString("TIPOS_LLAMADA", nombre, salidaMala, salidaBuena), f, DiagramapseudocodigoPackage.Literals.LLAMADA_FUNCION__NOMBRE);
									}
								}
							}
						}
					}
				}
			}
		}
	}
	
	@Check
	//Función que comprueba que las funciones que se llaman dentro del programa principal se llamen con parámetros del tipo adecuado
	protected void checkParametrosLlamadaInicio(Algoritmo algoritmo) {
		//Recogemos los tipos nativos de los tipos complejos
		Map<String,String> tiposVectoresMatrices = funciones.registrarTiposNativosdeComplejos(algoritmo.getTipocomplejo());
		//Recogemos los tipos nativos de los registros	
		Map<String,HashMap<String,String>> tiposRegistros = funciones.registrarTiposNativosRegistros(algoritmo.getTipocomplejo());
		//Registramos todas las variables que hay declaradas con sus respectivos tipos para buscar luego las necesarias (no hay repetidas)
		Map<String,String> variablesDeclaradas = funciones.registrarVariablesTipadas(algoritmo.getTiene().getDeclaracion());
		//Registramos las variables globales y las constantes también
		Map<String,String> variablesGlobales = funciones.registrarGlobalesTipadas(algoritmo.getGlobal(), algoritmo.getTiene().getDeclaracion());
		Map<String,String> constantes = funciones.registrarConstantesTipadas(algoritmo.getConstantes(), readerMessages);
		
		//Añadimos las variables de los módulos importados:
		List<Constantes> constantesModulos = new ArrayList<Constantes>();
		Map<String, String> declaracionesModulos = new HashMap<String,String>();
		
		for(Modulo m: algoritmo.getImportaciones()) {
			for(Declaracion dec: m.getImplementacion().getGlobal()) {
				if(dec instanceof DeclaracionPropia) {
					DeclaracionPropia decAux = (DeclaracionPropia) dec;
					for(Variable v: decAux.getVariable()) {
						if(m.getExporta_global().contains(v.getNombre())) {
							declaracionesModulos.put(v.getNombre(), decAux.getTipo());
						}
					}
				}
				else {
					DeclaracionVariable decAux = (DeclaracionVariable) dec;
					for(Variable v: decAux.getVariable()) {
						if(m.getExporta_global().contains(v.getNombre())) {
							declaracionesModulos.put(v.getNombre(), decAux.getTipo());
						}
					}
				}
			}
		}
		
		for(Modulo m: algoritmo.getImportaciones()) {
			for(Constantes c: m.getImplementacion().getConstantes()) {
				if(m.getExporta_constantes().contains(c.getVariable().getNombre())) {
					constantesModulos.add(c);
				}
			}
		}
		
		//Unimos todas en el Map que se utilizará
		constantes.putAll(funciones.registrarConstantesTipadas(constantesModulos, readerMessages));
		variablesDeclaradas.putAll(declaracionesModulos);
		variablesDeclaradas.putAll(variablesGlobales);
		variablesDeclaradas.putAll(constantes);
		
		for(Subproceso sub: algoritmo.getFuncion()) {
			List<String> tipos = funciones.getTiposCabecera(sub.getParametrofuncion());
			String nombre = sub.getNombre();
			int parametros = sub.getParametrofuncion().size();
			checkParametrosLlamadaAux(algoritmo.getTiene().getTiene(),tipos,nombre,parametros,variablesDeclaradas, tiposVectoresMatrices, tiposRegistros);
			
			for(Sentencias s: algoritmo.getTiene().getTiene()) {
				if(s instanceof Bloque) {
					Bloque bloque = (Bloque) s;
					if(bloque instanceof segun) {
						segun seg = (segun) bloque;
						for(Caso caso: seg.getCaso()) {
							checkParametrosLlamadaAux(caso.getSentencias(),tipos,nombre,parametros,variablesDeclaradas, tiposVectoresMatrices, tiposRegistros);

							
							for(Sentencias sentencias: caso.getSentencias()) {
								if(sentencias instanceof Bloque) {
									Bloque bloqueAux = (Bloque) sentencias;
									checkParametrosLlamadaAux(bloqueAux.getSentencias(),tipos,nombre,parametros,variablesDeclaradas, tiposVectoresMatrices, tiposRegistros);

								}
							}
						}
					}
					else {
						checkParametrosLlamadaAux(bloque.getSentencias(),tipos,nombre,parametros,variablesDeclaradas, tiposVectoresMatrices, tiposRegistros);
						
						for(Sentencias sentencias: bloque.getSentencias()) {
							if(sentencias instanceof Bloque) {
								Bloque bloqueAux = (Bloque) sentencias;
								checkParametrosLlamadaAux(bloqueAux.getSentencias(),tipos,nombre,parametros,variablesDeclaradas, tiposVectoresMatrices, tiposRegistros);

							}
						}
					}
				}
			}
		}
	}
	
	@Check
	protected void checkParametrosLLamadaSubproceso(Modulo modulo) {
		//Recogemos los tipos nativos de los tipos complejos
		Map<String,String> tiposVectoresMatrices = funciones.registrarTiposNativosdeComplejos(modulo.getImplementacion().getTipocomplejo());
		//Recogemos los tipos nativos de los registros	
		Map<String,HashMap<String,String>> tiposRegistros = funciones.registrarTiposNativosRegistros(modulo.getImplementacion().getTipocomplejo());
		Map<String,String> constantes = funciones.registrarConstantesTipadas(modulo.getImplementacion().getConstantes(), readerMessages);
		
		List<Constantes> constantesModulos = new ArrayList<Constantes>();
		
		for(Modulo m: modulo.getImportaciones()) {
			for(Constantes c: m.getImplementacion().getConstantes()) {
				if(m.getExporta_constantes().contains(c.getVariable().getNombre())) {
					constantesModulos.add(c);
				}
			}
		}
		
		constantes.putAll(funciones.registrarConstantesTipadas(constantesModulos, readerMessages));
				
		//Registramos los tipos de parámetros necesarios para todos los subprocesos
		for(Subproceso sub: modulo.getImplementacion().getFuncion()) {
			List<String> tipos = funciones.getTiposCabecera(sub.getParametrofuncion());
			String nombre = sub.getNombre();
			int parametros = sub.getParametrofuncion().size();
					
			for(Subproceso sub2: modulo.getImplementacion().getFuncion()) {
				//Registramos todas las variables que hay declaradas con sus respectivos tipos para buscar luego las necesarias (no hay repetidas)
				Map<String,String> variablesDeclaradas = funciones.registrarVariablesTipadas(sub2.getDeclaracion());
				Map<String,String> variablesGlobales = funciones.registrarGlobalesTipadas(modulo.getImplementacion().getGlobal(), sub2.getDeclaracion());
				
				List<Declaracion> declaracionesModulos = new ArrayList<Declaracion>();
				
				for(Modulo m: modulo.getImportaciones()) {
					for(Declaracion dec: m.getImplementacion().getGlobal()) {
						if(dec instanceof DeclaracionPropia) {
							DeclaracionPropia decAux = (DeclaracionPropia) dec;
							for(Variable v: decAux.getVariable()) {
								if(m.getExporta_global().contains(v.getNombre())) {
									declaracionesModulos.add(dec);
								}
							}
						}
						else {
							DeclaracionVariable decAux = (DeclaracionVariable) dec;
							for(Variable v: decAux.getVariable()) {
								if(m.getExporta_global().contains(v.getNombre())) {
									declaracionesModulos.add(dec);
								}
							}
						}
					}
				}
				
				variablesGlobales.putAll(funciones.registrarGlobalesTipadas(declaracionesModulos, sub2.getDeclaracion()));
				
				//Como estamos en el caso de los subprocesos debemos registrar los parámetros también
				funciones.getTiposCabecera(sub2.getParametrofuncion(), variablesDeclaradas);
				//Añadimos las constrantes y las variables globales
				variablesDeclaradas.putAll(variablesGlobales);
				variablesDeclaradas.putAll(constantes);
						
				checkParametrosLlamadaAux(sub2.getSentencias(),tipos,nombre,parametros,variablesDeclaradas, tiposVectoresMatrices, tiposRegistros);
						
				for(Sentencias s: sub2.getSentencias()) {
					if(s instanceof Bloque) {
						Bloque bloque = (Bloque) s;
						if(bloque instanceof segun) {
							segun seg = (segun) bloque;
							for(Caso caso: seg.getCaso()) {
								checkParametrosLlamadaAux(caso.getSentencias(),tipos,nombre,parametros,variablesDeclaradas, tiposVectoresMatrices, tiposRegistros);

										
								for(Sentencias sentencias: caso.getSentencias()) {
									if(sentencias instanceof Bloque) {
										Bloque bloqueAux = (Bloque) sentencias;
											checkParametrosLlamadaAux(bloqueAux.getSentencias(),tipos,nombre,parametros,variablesDeclaradas, tiposVectoresMatrices, tiposRegistros);

									}
								}
							}
						}
						else {
							checkParametrosLlamadaAux(bloque.getSentencias(),tipos,nombre,parametros,variablesDeclaradas, tiposVectoresMatrices, tiposRegistros);
									
							for(Sentencias sentencias: bloque.getSentencias()) {
								if(sentencias instanceof Bloque) {
									Bloque bloqueAux = (Bloque) sentencias;
									checkParametrosLlamadaAux(bloqueAux.getSentencias(),tipos,nombre,parametros,variablesDeclaradas, tiposVectoresMatrices, tiposRegistros);

								}
							}
						}
				}
			}
						
		}
		}	
	}
	
	
	@Check
	//Función que comprueba que las funciones que se llaman dentro de los subprocesos se llamen con parámetros del tipo adecuado
	protected void checkParametrosLlamadaSubproceso(Algoritmo algoritmo) {
		//Recogemos los tipos nativos de los tipos complejos
		Map<String,String> tiposVectoresMatrices = funciones.registrarTiposNativosdeComplejos(algoritmo.getTipocomplejo());
		//Recogemos los tipos nativos de los registros	
		Map<String,HashMap<String,String>> tiposRegistros = funciones.registrarTiposNativosRegistros(algoritmo.getTipocomplejo());
		Map<String,String> constantes = funciones.registrarConstantesTipadas(algoritmo.getConstantes(), readerMessages);
		
		List<Constantes> constantesModulos = new ArrayList<Constantes>();
		
		for(Modulo m: algoritmo.getImportaciones()) {
			for(Constantes c: m.getImplementacion().getConstantes()) {
				if(m.getExporta_constantes().contains(c.getVariable().getNombre())) {
					constantesModulos.add(c);
				}
			}
		}
		
		constantes.putAll(funciones.registrarConstantesTipadas(constantesModulos, readerMessages));
		
		//Registramos los tipos de parámetros necesarios para todos los subprocesos
		for(Subproceso sub: algoritmo.getFuncion()) {
			List<String> tipos = funciones.getTiposCabecera(sub.getParametrofuncion());
			String nombre = sub.getNombre();
			int parametros = sub.getParametrofuncion().size();
			
			for(Subproceso sub2: algoritmo.getFuncion()) {
				//Registramos todas las variables que hay declaradas con sus respectivos tipos para buscar luego las necesarias (no hay repetidas)
				Map<String,String> variablesDeclaradas = funciones.registrarVariablesTipadas(sub2.getDeclaracion());
				Map<String,String> variablesGlobales = funciones.registrarGlobalesTipadas(algoritmo.getGlobal(), sub2.getDeclaracion());
				//Como estamos en el caso de los subprocesos debemos registrar los parámetros también
				funciones.getTiposCabecera(sub2.getParametrofuncion(), variablesDeclaradas);
				
				List<Declaracion> declaracionesModulos = new ArrayList<Declaracion>();
				
				for(Modulo m: algoritmo.getImportaciones()) {
					for(Declaracion dec: m.getImplementacion().getGlobal()) {
						if(dec instanceof DeclaracionPropia) {
							DeclaracionPropia decAux = (DeclaracionPropia) dec;
							for(Variable v: decAux.getVariable()) {
								if(m.getExporta_global().contains(v.getNombre())) {
									declaracionesModulos.add(dec);
								}
							}
						}
						else {
							DeclaracionVariable decAux = (DeclaracionVariable) dec;
							for(Variable v: decAux.getVariable()) {
								if(m.getExporta_global().contains(v.getNombre())) {
									declaracionesModulos.add(dec);
								}
							}
						}
					}
				}
				
				variablesGlobales.putAll(funciones.registrarGlobalesTipadas(declaracionesModulos, sub2.getDeclaracion()));
				
				//Añadimos las constrantes y las variables globales
				variablesDeclaradas.putAll(variablesGlobales);
				variablesDeclaradas.putAll(constantes);
				
				checkParametrosLlamadaAux(sub2.getSentencias(),tipos,nombre,parametros,variablesDeclaradas, tiposVectoresMatrices, tiposRegistros);
				
				for(Sentencias s: sub2.getSentencias()) {
					if(s instanceof Bloque) {
						Bloque bloque = (Bloque) s;
						if(bloque instanceof segun) {
							segun seg = (segun) bloque;
							for(Caso caso: seg.getCaso()) {
								checkParametrosLlamadaAux(caso.getSentencias(),tipos,nombre,parametros,variablesDeclaradas, tiposVectoresMatrices, tiposRegistros);

								
								for(Sentencias sentencias: caso.getSentencias()) {
									if(sentencias instanceof Bloque) {
										Bloque bloqueAux = (Bloque) sentencias;
										checkParametrosLlamadaAux(bloqueAux.getSentencias(),tipos,nombre,parametros,variablesDeclaradas, tiposVectoresMatrices, tiposRegistros);

									}
								}
							}
						}
						else {
							checkParametrosLlamadaAux(bloque.getSentencias(),tipos,nombre,parametros,variablesDeclaradas, tiposVectoresMatrices, tiposRegistros);
							
							for(Sentencias sentencias: bloque.getSentencias()) {
								if(sentencias instanceof Bloque) {
									Bloque bloqueAux = (Bloque) sentencias;
									checkParametrosLlamadaAux(bloqueAux.getSentencias(),tipos,nombre,parametros,variablesDeclaradas, tiposVectoresMatrices, tiposRegistros);

								}
							}
						}
					}
				}
				
			}
		}
	}
	
	
	@Check
	//Función que comprueba que el tipo de devolución de una función sea compatible o igual al tipo realmente devuelto
	protected void checkTipoDevolucionFuncion(Subproceso s) {
		if(s instanceof Funcion) {
			Funcion f = (Funcion) s;
			String tipoDevuelve = f.getTipo();
			if(f.getDevuelve().getDevuelve() instanceof VariableID) {
				VariableID v = (VariableID) f.getDevuelve().getDevuelve();
				String nombreVar = v.getNombre();
				//Buscamos las variables en las declaraciones y en los parametros para averiguar de que tipo es
				Map<String,String> variables = funciones.registrarVariablesTipadas(f.getDeclaracion());
				//Registramos los parámetros
				funciones.getTiposCabecera(f.getParametrofuncion(), variables);
				
				//Comprobamos que la variable que se quiere devolver este definida y sea del tipo correcto.
				if(!variables.containsKey(nombreVar)) {
					error(readerMessages.getString("VARIABLE_NO_DECLARADA", v.getNombre()), v, DiagramapseudocodigoPackage.Literals.VARIABLE_ID__NOMBRE, VARIABLE_NO_DEFINIDA);
				}
				else if(!variables.get(nombreVar).equals(tipoDevuelve)) {
					if(variables.get(nombreVar).equals(readerMessages.getBundle().getString("TIPO_REAL")) && tipoDevuelve.equals(readerMessages.getBundle().getString("TIPO_ENTERO"))) {
						warning(readerMessages.getBundle().getString("PERDIDA_PRECISION"), v, DiagramapseudocodigoPackage.Literals.VARIABLE_ID__NOMBRE);
					}
					else if(!(variables.get(nombreVar).equals(readerMessages.getBundle().getString("TIPO_ENTERO")))  || !(tipoDevuelve.equals(readerMessages.getBundle().getString("TIPO_REAL")))) {
						error(readerMessages.getBundle().getString("TIPOS_INCOMPATIBLES"), v, DiagramapseudocodigoPackage.Literals.VARIABLE_ID__NOMBRE);
					}
				}
			}
		}
	}
	
	@Check
	//Función que comprueba que un campo utilizado de un registro pertenezca realmente a ese tipo de registro
	protected void checkVariablesRegistroInicio(Algoritmo algoritmo) {
		//Preparamos todos los campos clasificados por el nombre del registro (utilizado como identificador)
		Map<String,List<String>> registros = new HashMap<String,List<String>>();
		for(TipoComplejo t: algoritmo.getTipocomplejo()) {
			if(t instanceof Registro) {
				Registro r = (Registro) t;
				registros.put(r.getNombre(), funciones.registrarCamposRegistroSinTipo(r.getVariable()));
			}
		}
		
		Map<String,String> variablesTipadas = funciones.registrarVariablesTipadas(algoritmo.getTiene().getDeclaracion());
		
		for(Sentencias s: algoritmo.getTiene().getTiene()) {
			if(s instanceof AsignacionCompleja) {
				AsignacionCompleja a = (AsignacionCompleja) s;
				if(a.getValor_asignacion() instanceof ValorRegistro) {
					ValorRegistro r = (ValorRegistro) a.getValor_asignacion();
					for(CampoRegistro campo: r.getCampo()) {
						if(!registros.get(variablesTipadas.get(r.getNombre_registro())).contains(campo.getNombre_campo())) {
							error(readerMessages.getString("CAMPO_REGISTRO_NO_VALIDO", campo.getNombre_campo(), variablesTipadas.get(r.getNombre_registro())), campo, DiagramapseudocodigoPackage.Literals.CAMPO_REGISTRO__NOMBRE_CAMPO);
						}	
					}
				}
				if(a.getOperador() instanceof ValorRegistro) {
					ValorRegistro r = (ValorRegistro) a.getOperador();
					for(CampoRegistro campo: r.getCampo()) {
						if(!registros.get(variablesTipadas.get(r.getNombre_registro())).contains(campo.getNombre_campo())) {
							error(readerMessages.getString("CAMPO_REGISTRO_NO_VALIDO", campo.getNombre_campo(), variablesTipadas.get(r.getNombre_registro())), campo, DiagramapseudocodigoPackage.Literals.CAMPO_REGISTRO__NOMBRE_CAMPO);
						}	
					}
				}
			}
			else if(s instanceof AsignacionNormal) {
				AsignacionNormal a = (AsignacionNormal) s;
				if(a.getOperador() instanceof LlamadaFuncion) {
					LlamadaFuncion f = (LlamadaFuncion) a.getOperador();
					for(valor v: f.getOperadores()) {
						if(v instanceof Operador) {
							Operador o = (Operador) v;
							if(o instanceof ValorRegistro) {
								ValorRegistro r = (ValorRegistro) o;
								for(CampoRegistro campo: r.getCampo()) {
									if(!registros.get(variablesTipadas.get(r.getNombre_registro())).contains(campo.getNombre_campo())) {
										error(readerMessages.getString("CAMPO_REGISTRO_NO_VALIDO", campo.getNombre_campo(), variablesTipadas.get(r.getNombre_registro())), campo, DiagramapseudocodigoPackage.Literals.CAMPO_REGISTRO__NOMBRE_CAMPO);
									}	
								}
							}
						}
					}
				}
				if(a.getOperador() instanceof ValorRegistro) {
					ValorRegistro r = (ValorRegistro) a.getOperador();
					for(CampoRegistro campo: r.getCampo()) {
						if(!registros.get(variablesTipadas.get(r.getNombre_registro())).contains(campo.getNombre_campo())) {
							error(readerMessages.getString("CAMPO_REGISTRO_NO_VALIDO", campo.getNombre_campo(), variablesTipadas.get(r.getNombre_registro())), campo, DiagramapseudocodigoPackage.Literals.CAMPO_REGISTRO__NOMBRE_CAMPO);
						}	
					}
				}
			}
		}
	}
	
	@Check
	protected void checkVariablesRegistroSubproceso(Modulo modulo) {
		//Preparamos todos los campos clasificados por el nombre del registro (utilizado como identificador)
		Map<String,List<String>> registros = new HashMap<String,List<String>>();
		for(TipoComplejo t: modulo.getImplementacion().getTipocomplejo()) {
			if(t instanceof Registro) {
				Registro r = (Registro) t;
				registros.put(r.getNombre(), funciones.registrarCamposRegistroSinTipo(r.getVariable()));
			}
		}
					
		for(Subproceso sub: modulo.getImplementacion().getFuncion()) {
			Map<String,String> variablesTipadas = funciones.registrarVariablesTipadas(sub.getDeclaracion());
						
			for(Sentencias s: sub.getSentencias()) {
				if(s instanceof AsignacionCompleja) {
					AsignacionCompleja a = (AsignacionCompleja) s;
					if(a.getValor_asignacion() instanceof ValorRegistro) {
						ValorRegistro r = (ValorRegistro) a.getValor_asignacion();
						for(CampoRegistro campo: r.getCampo()) {
							if(!registros.get(variablesTipadas.get(r.getNombre_registro())).contains(campo.getNombre_campo())) {
								error(readerMessages.getString("CAMPO_REGISTRO_NO_VALIDO", campo.getNombre_campo(), variablesTipadas.get(r.getNombre_registro())), campo, DiagramapseudocodigoPackage.Literals.CAMPO_REGISTRO__NOMBRE_CAMPO);
							}	
						}
					}
					if(a.getOperador() instanceof ValorRegistro) {
						ValorRegistro r = (ValorRegistro) a.getOperador();
						for(CampoRegistro campo: r.getCampo()) {
							if(!registros.get(variablesTipadas.get(r.getNombre_registro())).contains(campo.getNombre_campo())) {
								error(readerMessages.getString("CAMPO_REGISTRO_NO_VALIDO", campo.getNombre_campo(), variablesTipadas.get(r.getNombre_registro())), campo, DiagramapseudocodigoPackage.Literals.CAMPO_REGISTRO__NOMBRE_CAMPO);
							}	
						}
					}
				}
				else if(s instanceof AsignacionNormal) {
					AsignacionNormal a = (AsignacionNormal) s;
					if(a.getOperador() instanceof LlamadaFuncion) {
						LlamadaFuncion f = (LlamadaFuncion) a.getOperador();
						for(valor v: f.getOperadores()) {
							if(v instanceof Operador) {
								Operador o = (Operador) v;
									if(o instanceof ValorRegistro) {
										ValorRegistro r = (ValorRegistro) o;
										for(CampoRegistro campo: r.getCampo()) {
											if(!registros.get(variablesTipadas.get(r.getNombre_registro())).contains(campo.getNombre_campo())) {
												error(readerMessages.getString("CAMPO_REGISTRO_NO_VALIDO", campo.getNombre_campo(), variablesTipadas.get(r.getNombre_registro())), campo, DiagramapseudocodigoPackage.Literals.CAMPO_REGISTRO__NOMBRE_CAMPO);
											}	
										}
									}
							}
						}
					}
					if(a.getOperador() instanceof ValorRegistro) {
						ValorRegistro r = (ValorRegistro) a.getOperador();
						for(CampoRegistro campo: r.getCampo()) {
							if(!registros.get(variablesTipadas.get(r.getNombre_registro())).contains(campo.getNombre_campo())) {
								error(readerMessages.getString("CAMPO_REGISTRO_NO_VALIDO", campo.getNombre_campo(), variablesTipadas.get(r.getNombre_registro())), campo, DiagramapseudocodigoPackage.Literals.CAMPO_REGISTRO__NOMBRE_CAMPO);
							}	
						}
					}
				}
			}
		
		}
							
	}
	
	
	@Check
	//Función que comprueba que un campo utilizado de un registro pertenezca realmente a ese tipo de registro
	protected void checkVariablesRegistroSubproceso(Algoritmo algoritmo) {
		//Preparamos todos los campos clasificados por el nombre del registro (utilizado como identificador)
		Map<String,List<String>> registros = new HashMap<String,List<String>>();
			for(TipoComplejo t: algoritmo.getTipocomplejo()) {
				if(t instanceof Registro) {
					Registro r = (Registro) t;
					registros.put(r.getNombre(), funciones.registrarCamposRegistroSinTipo(r.getVariable()));
				}
			}
			
			for(Subproceso sub: algoritmo.getFuncion()) {
				Map<String,String> variablesTipadas = funciones.registrarVariablesTipadas(sub.getDeclaracion());
				
				for(Sentencias s: sub.getSentencias()) {
					if(s instanceof AsignacionCompleja) {
						AsignacionCompleja a = (AsignacionCompleja) s;
						if(a.getValor_asignacion() instanceof ValorRegistro) {
							ValorRegistro r = (ValorRegistro) a.getValor_asignacion();
							for(CampoRegistro campo: r.getCampo()) {
								if(!registros.get(variablesTipadas.get(r.getNombre_registro())).contains(campo.getNombre_campo())) {
									error(readerMessages.getString("CAMPO_REGISTRO_NO_VALIDO", campo.getNombre_campo(), variablesTipadas.get(r.getNombre_registro())), campo, DiagramapseudocodigoPackage.Literals.CAMPO_REGISTRO__NOMBRE_CAMPO);
								}	
							}
						}
						if(a.getOperador() instanceof ValorRegistro) {
							ValorRegistro r = (ValorRegistro) a.getOperador();
							for(CampoRegistro campo: r.getCampo()) {
								if(!registros.get(variablesTipadas.get(r.getNombre_registro())).contains(campo.getNombre_campo())) {
									error(readerMessages.getString("CAMPO_REGISTRO_NO_VALIDO", campo.getNombre_campo(), variablesTipadas.get(r.getNombre_registro())), campo, DiagramapseudocodigoPackage.Literals.CAMPO_REGISTRO__NOMBRE_CAMPO);
								}	
							}
						}
					}
					else if(s instanceof AsignacionNormal) {
						AsignacionNormal a = (AsignacionNormal) s;
						if(a.getOperador() instanceof LlamadaFuncion) {
							LlamadaFuncion f = (LlamadaFuncion) a.getOperador();
							for(valor v: f.getOperadores()) {
								if(v instanceof Operador) {
									Operador o = (Operador) v;
									if(o instanceof ValorRegistro) {
										ValorRegistro r = (ValorRegistro) o;
										for(CampoRegistro campo: r.getCampo()) {
											if(!registros.get(variablesTipadas.get(r.getNombre_registro())).contains(campo.getNombre_campo())) {
												error(readerMessages.getString("CAMPO_REGISTRO_NO_VALIDO", campo.getNombre_campo(), variablesTipadas.get(r.getNombre_registro())), campo, DiagramapseudocodigoPackage.Literals.CAMPO_REGISTRO__NOMBRE_CAMPO);
											}	
										}
									}
								}
							}
						}
						if(a.getOperador() instanceof ValorRegistro) {
							ValorRegistro r = (ValorRegistro) a.getOperador();
							for(CampoRegistro campo: r.getCampo()) {
								if(!registros.get(variablesTipadas.get(r.getNombre_registro())).contains(campo.getNombre_campo())) {
									error(readerMessages.getString("CAMPO_REGISTRO_NO_VALIDO", campo.getNombre_campo(), variablesTipadas.get(r.getNombre_registro())), campo, DiagramapseudocodigoPackage.Literals.CAMPO_REGISTRO__NOMBRE_CAMPO);
								}	
							}
						}
					}
				}
			}
	}
	
	
	private void errorAsignacion(Asignacion a, String mensaje, boolean error) {
		if(a instanceof AsignacionNormal) {
			AsignacionNormal an = (AsignacionNormal) a;
			if(error) {
				error(mensaje, an, DiagramapseudocodigoPackage.Literals.ASIGNACION_NORMAL__VALOR_ASIGNACION);
			}
			else {
				warning(mensaje, an, DiagramapseudocodigoPackage.Literals.ASIGNACION_NORMAL__VALOR_ASIGNACION);
			}
		}
		else {
			AsignacionCompleja ac = (AsignacionCompleja) a;
			if(error) {
				error(mensaje, ac, DiagramapseudocodigoPackage.Literals.ASIGNACION_COMPLEJA__VALOR_ASIGNACION);
			}
			else {
				warning(mensaje, ac, DiagramapseudocodigoPackage.Literals.ASIGNACION_COMPLEJA__VALOR_ASIGNACION);
			}
		}
	}
	
	//Función auxiliar para evitar la repetición de código (DRY)
	private void checkAsignacionesAux(Asignacion a, String tipo, operacion op, Map<String,String> variables, Map<String,HashMap<String,String>> registros, List<String> nombresRegistros, Map<String,HashMap<Integer,String>> funcionesTipadas, Map<String,String> vectores, Map<String,String> matrices, Map<String,Map<String,String>> registrosCamposTipados) {
					if(tipo.equals(readerMessages.getBundle().getString("TIPO_ENTERO")) && !(op instanceof NumeroEntero)) {
						if(op instanceof NumeroDecimal) {
							errorAsignacion(a, readerMessages.getBundle().getString("PERDIDA_PRECISION_REAL_ENTERO"), false);
						}
						else if(funciones.esOperacion(op)) {
							ArrayList<valor> valores = new ArrayList<valor>();
							valores = funciones.registrarValoresOperacion(op, valores);
							//Primero buscamos las dificultades en la operación
							List<valor> valoresProblem = funciones.buscarProblemasOperacion(readerMessages.getBundle().getString("TIPO_ENTERO"), valores, readerMessages);
							//Preparamos los tipos validos
							ArrayList<String> tiposValidos = new ArrayList<String>();
							tiposValidos.add(0, readerMessages.getBundle().getString("TIPO_ENTERO")); 
							tiposValidos.add(1, readerMessages.getBundle().getString("TIPO_REAL"));
							if(funciones.asignacionOperacionVariable(valoresProblem, variables, tiposValidos, readerMessages) == 3 || funciones.asignacionOperacionFuncion(valoresProblem, variables, tiposValidos, funcionesTipadas, readerMessages) == 3 || funciones.asignacionOperacionRegistro(valoresProblem, variables, tiposValidos, registros, nombresRegistros, readerMessages) == 3 || funciones.asignacionOperacionVector(valoresProblem, variables, tiposValidos, vectores, readerMessages) == 3 || funciones.asignacionOperacionMatriz(valoresProblem, variables, tiposValidos, matrices, readerMessages) == 3) {
								errorAsignacion(a, readerMessages.getBundle().getString("ASIGNACION_INCOMPATIBLE"), true);
							}
							else if(funciones.asignacionOperacionVariable(valoresProblem, variables, tiposValidos, readerMessages) == 2 || funciones.asignacionOperacionFuncion(valoresProblem, variables, tiposValidos, funcionesTipadas, readerMessages) == 2 || funciones.asignacionOperacionRegistro(valoresProblem, variables, tiposValidos, registros, nombresRegistros, readerMessages) == 2 || funciones.asignacionOperacionVector(valoresProblem, variables, tiposValidos, vectores, readerMessages) == 2 || funciones.asignacionOperacionMatriz(valoresProblem, variables, tiposValidos, matrices, readerMessages) == 2) {
								errorAsignacion(a, readerMessages.getBundle().getString("PERDIDA_PRECISION_REAL_ENTERO"), false);
							}
						}
						else if(op instanceof LlamadaFuncion) {
							LlamadaFuncion f = (LlamadaFuncion) op;
							if(!(funcionesTipadas.get(f.getNombre()).get(f.getOperadores().size()).equals(readerMessages.getBundle().getString("TIPO_ENTERO"))) && !(funcionesTipadas.get(f.getNombre()).get(f.getOperadores().size()).equals(readerMessages.getBundle().getString("TIPO_REAL"))) && funcionesTipadas.containsKey(f.getNombre()) && funcionesTipadas.get(f.getNombre()).containsKey(f.getOperadores().size())) {
								errorAsignacion(a, readerMessages.getBundle().getString("ASIGNACION_INCOMPATIBLE"), true);
							}
							else if(funcionesTipadas.get(f.getNombre()).get(f.getOperadores().size()).equals(readerMessages.getBundle().getString("TIPO_REAL")) && funcionesTipadas.containsKey(f.getNombre()) && funcionesTipadas.get(f.getNombre()).containsKey(f.getOperadores().size())) {
								errorAsignacion(a, readerMessages.getBundle().getString("PERDIDA_PRECISION_REAL_ENTERO"), false);
							}
						}
						else if(op instanceof VariableID) {
							VariableID v = (VariableID) op;
							if(!(variables.get(v.getNombre()).equals(readerMessages.getBundle().getString("TIPO_ENTERO"))) && !(variables.get(v.getNombre()).equals(readerMessages.getBundle().getString("TIPO_REAL"))) && variables.containsKey(v.getNombre())) {
								errorAsignacion(a, readerMessages.getBundle().getString("ASIGNACION_INCOMPATIBLE"), true);
								
							}
							else if(variables.get(v.getNombre()).equals(readerMessages.getBundle().getString("TIPO_REAL")) && variables.containsKey(v.getNombre())) {
								errorAsignacion(a, readerMessages.getBundle().getString("PERDIDA_PRECISION_REAL_ENTERO"), false);
							}
						}
						else if(op instanceof ValorRegistro) {
							ValorRegistro vr = (ValorRegistro) op;
							//Buscamos el registro del que proviene esa variable
							for(String nombre: nombresRegistros) {
								if(nombre.equals(variables.get(vr.getNombre_registro()))) {
									if(!(registros.get(nombre).get(vr.getCampo().get(0).getNombre_campo()).equals(readerMessages.getBundle().getString("TIPO_ENTERO"))) && !(registros.get(nombre).get(vr.getCampo().get(0).getNombre_campo()).equals(readerMessages.getBundle().getString("TIPO_REAL")))) {
										errorAsignacion(a, readerMessages.getBundle().getString("ASIGNACION_INCOMPATIBLE"), true);
									}
									else if(registros.get(nombre).get(vr.getCampo().get(0).getNombre_campo()).equals(readerMessages.getBundle().getString("TIPO_REAL"))) {
										errorAsignacion(a, readerMessages.getBundle().getString("PERDIDA_PRECISION_REAL_ENTERO"), false);
									}
								}
							}
						}
						else if(op instanceof ValorVector) {
							ValorVector v = (ValorVector) op;
							if(!(vectores.get(variables.get(v.getNombre_vector())).equals(readerMessages.getBundle().getString("TIPO_ENTERO"))) && !(vectores.get(variables.get(v.getNombre_vector())).equals(readerMessages.getBundle().getString("TIPO_REAL")))) {
								errorAsignacion(a, readerMessages.getBundle().getString("ASIGNACION_INCOMPATIBLE"), true);
							}
							else if(vectores.get(variables.get(v.getNombre_vector())).equals(readerMessages.getBundle().getString("TIPO_REAL"))) {
								errorAsignacion(a, readerMessages.getBundle().getString("PERDIDA_PRECISION_REAL_ENTERO"), false);
							}
						}
						else if(op instanceof ValorMatriz) {
							ValorMatriz m = (ValorMatriz) op;
							if(!(matrices.get(variables.get(m.getNombre_matriz())).equals(readerMessages.getBundle().getString("TIPO_ENTERO"))) && !(matrices.get(variables.get(m.getNombre_matriz())).equals(readerMessages.getBundle().getString("TIPO_REAL")))) {
								errorAsignacion(a, readerMessages.getBundle().getString("ASIGNACION_INCOMPATIBLE"), true);
							}
							else {
								errorAsignacion(a, readerMessages.getBundle().getString("PERDIDA_PRECISION_REAL_ENTERO"), false);
							}
						}
						
						else {
							errorAsignacion(a, readerMessages.getBundle().getString("ASIGNACION_INCOMPATIBLE"), true);
						}
					}
					else if(tipo.equals(readerMessages.getBundle().getString("TIPO_LOGICO")) && !(op instanceof ValorBooleano)) {
						if(funciones.esOperacion(op)) {
							ArrayList<valor> valores = new ArrayList<valor>();
							valores = funciones.registrarValoresOperacion(op, valores);
							//Primero buscamos las dificultades en la operación
							List<valor> valoresProblem = funciones.buscarProblemasOperacion(readerMessages.getBundle().getString("TIPO_LOGICO"), valores, readerMessages);
							//Preparamos los tipos validos
							ArrayList<String> tiposValidos = new ArrayList<String>();
							tiposValidos.add(0, readerMessages.getBundle().getString("TIPO_LOGICO")); 
							if(funciones.asignacionOperacionVariable(valoresProblem, variables, tiposValidos, readerMessages) == 3 || funciones.asignacionOperacionFuncion(valoresProblem, variables, tiposValidos, funcionesTipadas, readerMessages) == 3 || funciones.asignacionOperacionRegistro(valoresProblem, variables, tiposValidos, registros, nombresRegistros, readerMessages) == 3 || funciones.asignacionOperacionVector(valoresProblem, variables, tiposValidos, vectores, readerMessages) == 3 || funciones.asignacionOperacionMatriz(valoresProblem, variables, tiposValidos, matrices, readerMessages) == 3) {
								errorAsignacion(a, readerMessages.getBundle().getString("ASIGNACION_INCOMPATIBLE"), true);
							}
						}
						else if(op instanceof LlamadaFuncion) {
							LlamadaFuncion f = (LlamadaFuncion) op;
							if(!(funcionesTipadas.get(f.getNombre()).get(f.getOperadores().size()).equals(readerMessages.getBundle().getString("TIPO_LOGICO"))) && funcionesTipadas.containsKey(f.getNombre()) && funcionesTipadas.get(f.getNombre()).containsKey(f.getOperadores().size())) {
								errorAsignacion(a, readerMessages.getBundle().getString("ASIGNACION_INCOMPATIBLE"), true);
							}
						}
						else if(op instanceof unaria) {
							unaria u = (unaria) op;
							if(!(u.getVariable() instanceof ValorBooleano) && (!(u.getVariable() instanceof VariableID))) {
								errorAsignacion(a, readerMessages.getBundle().getString("ASIGNACION_INCOMPATIBLE"), true);
							}
							else if(u.getVariable() instanceof VariableID) {
								VariableID var = (VariableID) u.getVariable();
								if(!(variables.get(var.getNombre()).equals(readerMessages.getBundle().getString("TIPO_LOGICO"))) && variables.containsKey(var.getNombre())) {
									errorAsignacion(a, readerMessages.getBundle().getString("ASIGNACION_INCOMPATIBLE"), true);
								}
							}
						}
						else if(op instanceof VariableID) {
							VariableID v = (VariableID) op;
							if(!(variables.get(v.getNombre()).equals(readerMessages.getBundle().getString("TIPO_LOGICO"))) && variables.containsKey(v.getNombre())) {
								errorAsignacion(a, readerMessages.getBundle().getString("ASIGNACION_INCOMPATIBLE"), true);
							}
						}
						else if(op instanceof ValorRegistro) {
							ValorRegistro vr = (ValorRegistro) op;
							//Buscamos el registro del que proviene esa variable
							for(String nombre: nombresRegistros) {
								if(nombre.equals(variables.get(vr.getNombre_registro()))) {
									if(!(registros.get(nombre).get(vr.getCampo().get(0).getNombre_campo()).equals(readerMessages.getBundle().getString("TIPO_LOGICO")))) {
										errorAsignacion(a, readerMessages.getBundle().getString("ASIGNACION_INCOMPATIBLE"), true);
									}
								}
							}
						}
						else if(op instanceof ValorVector) {
							ValorVector v = (ValorVector) op;
							if(!(vectores.get(variables.get(v.getNombre_vector())).equals(readerMessages.getBundle().getString("TIPO_LOGICO")))) {
								errorAsignacion(a, readerMessages.getBundle().getString("ASIGNACION_INCOMPATIBLE"), true);
							}
						}
						else if(op instanceof ValorMatriz) {
							ValorMatriz m = (ValorMatriz) op;
							if(!(matrices.get(variables.get(m.getNombre_matriz())).equals(readerMessages.getBundle().getString("TIPO_LOGICO")))) {
								errorAsignacion(a, readerMessages.getBundle().getString("ASIGNACION_INCOMPATIBLE"), true);
							}
						}
						else {
							errorAsignacion(a, readerMessages.getBundle().getString("ASIGNACION_INCOMPATIBLE"), true);
						}
					}
					else if(tipo.equals(readerMessages.getBundle().getString("TIPO_REAL")) && !(op instanceof NumeroEntero) && !(op instanceof NumeroDecimal)) {
						if(funciones.esOperacion(op)) {
							ArrayList<valor> valores = new ArrayList<valor>();
							valores = funciones.registrarValoresOperacion(op, valores);
							//Primero buscamos las dificultades en la operación
							List<valor> valoresProblem = funciones.buscarProblemasOperacion(readerMessages.getBundle().getString("TIPO_REAL"), valores, readerMessages);
							//Preparamos los tipos validos
							ArrayList<String> tiposValidos = new ArrayList<String>();
							tiposValidos.add(0, readerMessages.getBundle().getString("TIPO_REAL")); 
							tiposValidos.add(1, readerMessages.getBundle().getString("TIPO_ENTERO"));
							if(funciones.asignacionOperacionVariable(valoresProblem, variables, tiposValidos, readerMessages) == 3 || funciones.asignacionOperacionFuncion(valoresProblem, variables, tiposValidos, funcionesTipadas, readerMessages) == 3 || funciones.asignacionOperacionRegistro(valoresProblem, variables, tiposValidos, registros, nombresRegistros, readerMessages) == 3 || funciones.asignacionOperacionVector(valoresProblem, variables, tiposValidos, vectores, readerMessages) == 3 || funciones.asignacionOperacionMatriz(valoresProblem, variables, tiposValidos, matrices, readerMessages) == 3) {
								errorAsignacion(a, readerMessages.getBundle().getString("ASIGNACION_INCOMPATIBLE"), true);
							}
						}
						else if(op instanceof LlamadaFuncion) {
							LlamadaFuncion f = (LlamadaFuncion) op;
							if(!(funcionesTipadas.get(f.getNombre()).get(f.getOperadores().size()).equals(readerMessages.getBundle().getString("TIPO_REAL"))) && !(funcionesTipadas.get(f.getNombre()).get(f.getOperadores().size()).equals(readerMessages.getBundle().getString("TIPO_ENTERO"))) && funcionesTipadas.containsKey(f.getNombre()) && funcionesTipadas.get(f.getNombre()).containsKey(f.getOperadores().size())) {
								errorAsignacion(a, readerMessages.getBundle().getString("ASIGNACION_INCOMPATIBLE"), true);
							}
						}
						else if(op instanceof VariableID) {
							VariableID v = (VariableID) op;
							if(!(variables.get(v.getNombre()).equals(readerMessages.getBundle().getString("TIPO_REAL"))) && !(variables.get(v.getNombre()).equals(readerMessages.getBundle().getString("TIPO_ENTERO"))) && variables.containsKey(v.getNombre())) {
								errorAsignacion(a, readerMessages.getBundle().getString("ASIGNACION_INCOMPATIBLE"), true);
							}
						}
						else if(op instanceof ValorRegistro) {
							ValorRegistro vr = (ValorRegistro) op;
							//Buscamos el registro del que proviene esa variable
							for(String nombre: nombresRegistros) {
								if(nombre.equals(variables.get(vr.getNombre_registro()))) {
									if(!(registros.get(nombre).get(vr.getCampo().get(0).getNombre_campo()).equals(readerMessages.getBundle().getString("TIPO_ENTERO"))) && !(registros.get(nombre).get(vr.getCampo().get(0).getNombre_campo()).equals(readerMessages.getBundle().getString("TIPO_REAL")))) {
										errorAsignacion(a, readerMessages.getBundle().getString("ASIGNACION_INCOMPATIBLE"), true);
									}
								}
							}
						}
						else if(op instanceof ValorVector) {
							ValorVector v = (ValorVector) op;
							if(!(vectores.get(variables.get(v.getNombre_vector())).equals(readerMessages.getBundle().getString("TIPO_ENTERO"))) && !(vectores.get(variables.get(v.getNombre_vector())).equals(readerMessages.getBundle().getString("TIPO_REAL")))) {
								errorAsignacion(a, readerMessages.getBundle().getString("ASIGNACION_INCOMPATIBLE"), true);
							}
						}
						else if(op instanceof ValorMatriz) {
							ValorMatriz m = (ValorMatriz) op;
							if(!(matrices.get(variables.get(m.getNombre_matriz())).equals(readerMessages.getBundle().getString("TIPO_ENTERO"))) && !(matrices.get(variables.get(m.getNombre_matriz())).equals(readerMessages.getBundle().getString("TIPO_REAL")))) {
								errorAsignacion(a, readerMessages.getBundle().getString("ASIGNACION_INCOMPATIBLE"), true);
							}
						}
						else {
							errorAsignacion(a, readerMessages.getBundle().getString("ASIGNACION_INCOMPATIBLE"), true);
						}
					}
					else if(tipo.equals(readerMessages.getBundle().getString("TIPO_CADENA")) && !(op instanceof ConstCadena)) {
						if(funciones.esOperacion(op)) {
							ArrayList<valor> valores = new ArrayList<valor>();
							valores = funciones.registrarValoresOperacion(op, valores);
							//Primero buscamos las dificultades en la operación
							List<valor> valoresProblem = funciones.buscarProblemasOperacion(readerMessages.getBundle().getString("TIPO_CADENA"), valores, readerMessages);
							//Preparamos los tipos validos
							ArrayList<String> tiposValidos = new ArrayList<String>();
							tiposValidos.add(0, readerMessages.getBundle().getString("TIPO_CADENA")); 
							if(funciones.asignacionOperacionVariable(valoresProblem, variables, tiposValidos, readerMessages) == 3 || funciones.asignacionOperacionFuncion(valoresProblem, variables, tiposValidos, funcionesTipadas, readerMessages) == 3 || funciones.asignacionOperacionRegistro(valoresProblem, variables, tiposValidos, registros, nombresRegistros, readerMessages) == 3 || funciones.asignacionOperacionVector(valoresProblem, variables, tiposValidos, vectores, readerMessages) == 3 || funciones.asignacionOperacionMatriz(valoresProblem, variables, tiposValidos, matrices, readerMessages) == 3) {
								errorAsignacion(a, readerMessages.getBundle().getString("ASIGNACION_INCOMPATIBLE"), true);
							}
						}
						else if(op instanceof LlamadaFuncion) {
							LlamadaFuncion f = (LlamadaFuncion) op;
							if(!(funcionesTipadas.get(f.getNombre()).get(f.getOperadores().size()).equals(readerMessages.getBundle().getString("TIPO_CADENA"))) && funcionesTipadas.containsKey(f.getNombre()) && funcionesTipadas.get(f.getNombre()).containsKey(f.getOperadores().size())) {
								errorAsignacion(a, readerMessages.getBundle().getString("ASIGNACION_INCOMPATIBLE"), true);
							}
						}
						else if(op instanceof VariableID) {
							VariableID v = (VariableID) op;
							if(!(variables.get(v.getNombre()).equals(readerMessages.getBundle().getString("TIPO_CADENA"))) && variables.containsKey(v.getNombre())) {
								errorAsignacion(a, readerMessages.getBundle().getString("ASIGNACION_INCOMPATIBLE"), true);
							}
						}
						else if(op instanceof ValorRegistro) {
							ValorRegistro vr = (ValorRegistro) op;
							//Buscamos el registro del que proviene esa variable
							for(String nombre: nombresRegistros) {
								if(nombre.equals(variables.get(vr.getNombre_registro()))) {
									if(!(registros.get(nombre).get(vr.getCampo().get(0).getNombre_campo()).equals(readerMessages.getBundle().getString("TIPO_CADENA")))) {
										errorAsignacion(a, readerMessages.getBundle().getString("ASIGNACION_INCOMPATIBLE"), true);
									}
								}
							}
						}
						else if(op instanceof ValorVector) {
							ValorVector v = (ValorVector) op;
							if(!(vectores.get(variables.get(v.getNombre_vector())).equals(readerMessages.getBundle().getString("TIPO_CADENA")))) {
								errorAsignacion(a, readerMessages.getBundle().getString("ASIGNACION_INCOMPATIBLE"), true);
							}
						}
						else if(op instanceof ValorMatriz) {
							ValorMatriz m = (ValorMatriz) op;
							if(!(matrices.get(variables.get(m.getNombre_matriz())).equals(readerMessages.getBundle().getString("TIPO_CADENA")))) {
								errorAsignacion(a, readerMessages.getBundle().getString("ASIGNACION_INCOMPATIBLE"), true);
							}
						}
						else {
							errorAsignacion(a,readerMessages.getBundle().getString("ASIGNACION_INCOMPATIBLE"), true);
						}
					}
					else if(tipo.equals(readerMessages.getBundle().getString("TIPO_CARACTER")) && !(op instanceof Caracter)) {
						if(funciones.esOperacion(op)) {
							ArrayList<valor> valores = new ArrayList<valor>();
							valores = funciones.registrarValoresOperacion(op, valores);
							//Primero buscamos las dificultades en la operación
							List<valor> valoresProblem = funciones.buscarProblemasOperacion(readerMessages.getBundle().getString("TIPO_CARACTER"), valores, readerMessages);
							//Preparamos los tipos validos
							ArrayList<String> tiposValidos = new ArrayList<String>();
							tiposValidos.add(0, readerMessages.getBundle().getString("TIPO_CARACTER")); 
							if(funciones.asignacionOperacionVariable(valoresProblem, variables, tiposValidos, readerMessages) == 3 || funciones.asignacionOperacionFuncion(valoresProblem, variables, tiposValidos, funcionesTipadas, readerMessages) == 3 || funciones.asignacionOperacionRegistro(valoresProblem, variables, tiposValidos, registros, nombresRegistros, readerMessages) == 3 || funciones.asignacionOperacionVector(valoresProblem, variables, tiposValidos, vectores, readerMessages) == 3 || funciones.asignacionOperacionMatriz(valoresProblem, variables, tiposValidos, matrices, readerMessages) == 3) {
								errorAsignacion(a, readerMessages.getBundle().getString("ASIGNACION_INCOMPATIBLE"), true);
							}
						}
						else if(op instanceof LlamadaFuncion) {
							LlamadaFuncion f = (LlamadaFuncion) op;
							if(!(funcionesTipadas.get(f.getNombre()).get(f.getOperadores().size()).equals(readerMessages.getBundle().getString("TIPO_CARACTER"))) && funcionesTipadas.containsKey(f.getNombre()) && funcionesTipadas.get(f.getNombre()).containsKey(f.getOperadores().size())) {
								errorAsignacion(a, readerMessages.getBundle().getString("ASIGNACION_INCOMPATIBLE"), true);
							}
						}
						else if(op instanceof VariableID) {
							VariableID v = (VariableID) op;
							if(!(variables.get(v.getNombre()).equals(readerMessages.getBundle().getString("TIPO_CARACTER"))) && variables.containsKey(v.getNombre())) {
								errorAsignacion(a, readerMessages.getBundle().getString("ASIGNACION_INCOMPATIBLE"), true);
							}
						}
						else if(op instanceof ValorRegistro) {
							ValorRegistro vr = (ValorRegistro) op;
							//Buscamos el registro del que proviene esa variable
							for(String nombre: nombresRegistros) {
								if(nombre.equals(variables.get(vr.getNombre_registro()))) {
									if(!(registros.get(nombre).get(vr.getCampo().get(0).getNombre_campo()).equals(readerMessages.getBundle().getString("TIPO_CARACTER")))) {
										errorAsignacion(a, readerMessages.getBundle().getString("ASIGNACION_INCOMPATIBLE"), true);
									}
								}
							}
						}
						else if(op instanceof ValorVector) {
							ValorVector v = (ValorVector) op;
							if(!(vectores.get(variables.get(v.getNombre_vector())).equals(readerMessages.getBundle().getString("TIPO_CARACTER")))) {
								errorAsignacion(a, readerMessages.getBundle().getString("ASIGNACION_INCOMPATIBLE"), true);
							}
						}
						else if(op instanceof ValorMatriz) {
							ValorMatriz m = (ValorMatriz) op;
							if(!(matrices.get(variables.get(m.getNombre_matriz())).equals(readerMessages.getBundle().getString("TIPO_CARACTER")))) {
								errorAsignacion(a, readerMessages.getBundle().getString("ASIGNACION_INCOMPATIBLE"), true);
							}
						}
						else {
							errorAsignacion(a, readerMessages.getBundle().getString("ASIGNACION_INCOMPATIBLE"), true);
						}
				}
	}
	
	private void checkSentenciasAsignaciones(List<Sentencias> sentencias, Map<String,String> variablesTipadas, Map<String,HashMap<String,String>> registros, List<String> nombresRegistros, Map<String,HashMap<Integer,String>> funcionesTipadas, Map<String,String> vectores, Map<String,String> matrices, Map<String, Map<String,String>> registrosCamposTipados) {
		for(Sentencias s: sentencias) {
			if(s instanceof Asignacion) {
				Asignacion a = (Asignacion) s;
				if(a instanceof AsignacionNormal) {
					AsignacionNormal an = (AsignacionNormal) a;
					String tipo = variablesTipadas.get(an.getValor_asignacion());
					checkAsignacionesAux(a, tipo, an.getOperador(), variablesTipadas, registros, nombresRegistros,funcionesTipadas, vectores, matrices, registrosCamposTipados);
				}
				else if(a instanceof AsignacionCompleja) {
					AsignacionCompleja ac = (AsignacionCompleja) a;
					if(ac.getValor_asignacion() instanceof ValorRegistro) {
						ValorRegistro r = (ValorRegistro) ac.getValor_asignacion();
						for(CampoRegistro campo: r.getCampo()) {
							String tipo = registros.get(variablesTipadas.get(r.getNombre_registro())).get(campo.getNombre_campo());
							checkAsignacionesAux(a, tipo, ac.getOperador(), variablesTipadas, registros, nombresRegistros, funcionesTipadas, vectores, matrices, registrosCamposTipados);
						}
					}
					else if(ac.getValor_asignacion() instanceof ValorVector) {
						ValorVector v = (ValorVector) ac.getValor_asignacion();
						if(v.getCampo().size() == 0) {
							String tipo = vectores.get(variablesTipadas.get(v.getNombre_vector()));
							checkAsignacionesAux(a, tipo, ac.getOperador(), variablesTipadas, registros, nombresRegistros, funcionesTipadas, vectores, matrices, registrosCamposTipados);
						}
						else {
							//Cogemos el último campo:
							String campo = v.getCampo().get(v.getCampo().size()-1).getNombre_campo();
							String tipo = registrosCamposTipados.get(vectores.get(variablesTipadas.get(v.getNombre_vector()))).get(campo);
							checkAsignacionesAux(a, tipo, ac.getOperador(), variablesTipadas, registros, nombresRegistros, funcionesTipadas, vectores, matrices, registrosCamposTipados);
						}
					}
					else if(ac.getValor_asignacion() instanceof ValorMatriz) {
						ValorMatriz m = (ValorMatriz) ac.getValor_asignacion();
						if(m.getCampo().size() == 0) {
							String tipo = matrices.get(variablesTipadas.get(m.getNombre_matriz()));
							checkAsignacionesAux(a, tipo, ac.getOperador(), variablesTipadas, registros, nombresRegistros, funcionesTipadas, vectores, matrices, registrosCamposTipados);
						}
						else {
							//Cogemos el último campo:
							String campo = m.getCampo().get(m.getCampo().size()-1).getNombre_campo();
							String tipo = registrosCamposTipados.get(matrices.get(variablesTipadas.get(m.getNombre_matriz()))).get(campo);
							checkAsignacionesAux(a, tipo, ac.getOperador(), variablesTipadas, registros, nombresRegistros, funcionesTipadas, vectores, matrices, registrosCamposTipados);
						}
					}
				}
			}
		}
	}
	
	@Check
	//Función que valida que el tipo de dato que se quiere asignar sea compatible con el tipo de la variable (asignación normal)
	protected void checkAsignacionesInicio(Algoritmo algoritmo) {
		//Preparamos las variables de tipo registro para permitir asignación
		Map<String,HashMap<String,String>> registros = new HashMap<String,HashMap<String,String>>();
		Map<String,String> vectores = new HashMap<String,String>();
		List<String> nombresRegistros = new ArrayList<String>();
		Map<String,String> matrices = new HashMap<String,String>();
		
		funciones.prepararColeccionesTiposComplejos(algoritmo.getTipocomplejo(), registros, nombresRegistros, vectores, matrices);
		
		//Registramos todas las variables declaradas con sus respectivos tipos
		Map<String,String> variablesTipadas = funciones.registrarVariablesTipadas(algoritmo.getTiene().getDeclaracion());
		Map<String,String> variablesTipadasGlobales = funciones.registrarVariablesTipadas(algoritmo.getGlobal());
		
		//Añadimos las variables globales si no hay una variable local que se llame igual
		
		List<String> nombresGlobales = new ArrayList<String>();
		
		for(Declaracion d: algoritmo.getGlobal()) {
			if(d instanceof DeclaracionPropia) {
				DeclaracionPropia dp = (DeclaracionPropia) d;
				for(Variable v: dp.getVariable()) {
					nombresGlobales.add(v.getNombre());
				}
			}
			else {
				DeclaracionVariable dv = (DeclaracionVariable) d;
				for(Variable v: dv.getVariable()) {
					nombresGlobales.add(v.getNombre());
				}
			}
		}
		
		for(String nombre: nombresGlobales) {
			if(!variablesTipadas.containsKey(nombre)) {
				variablesTipadas.put(nombre, variablesTipadasGlobales.get(nombre));
			}
		}
		
		//Registramos todas las funciones que están definidas
		Map<String,HashMap<Integer,String>> funcionesTipadas = new HashMap<String,HashMap<Integer,String>>();
		
		//Registramos todos los campos tipados de cada registro
		Map<String, Map<String,String>> registrosCamposTipados = new HashMap<String,Map<String,String>>();
		
		for(TipoComplejo t: algoritmo.getTipocomplejo()) {
			if(t instanceof Registro) {
				Registro r = (Registro) t;
				registrosCamposTipados.put(r.getNombre(), funciones.registrarCamposRegistro(r.getVariable()));
			}
		}
		
		funciones.prepararColeccionFunciones(algoritmo.getFuncion(), funcionesTipadas);
		checkSentenciasAsignaciones(algoritmo.getTiene().getTiene(), variablesTipadas, registros, nombresRegistros, funcionesTipadas, vectores, matrices, registrosCamposTipados);
		
		for(Sentencias s: algoritmo.getTiene().getTiene()) {
			if(s instanceof Bloque) {
				Bloque bloque = (Bloque) s;
				if(bloque instanceof segun) {
					segun seg = (segun) bloque;
					for(Caso caso: seg.getCaso()) {
						checkSentenciasAsignaciones(caso.getSentencias(), variablesTipadas, registros, nombresRegistros, funcionesTipadas, vectores, matrices, registrosCamposTipados);

						
						for(Sentencias sentencias: caso.getSentencias()) {
							if(sentencias instanceof Bloque) {
								Bloque bloqueAux = (Bloque) sentencias;
								checkSentenciasAsignaciones(bloqueAux.getSentencias(), variablesTipadas, registros, nombresRegistros, funcionesTipadas, vectores, matrices, registrosCamposTipados);

							}
						}
					}
				}
				else {
					checkSentenciasAsignaciones(bloque.getSentencias(), variablesTipadas, registros, nombresRegistros, funcionesTipadas, vectores, matrices, registrosCamposTipados);

					
					for(Sentencias sentencias: bloque.getSentencias()) {
						if(sentencias instanceof Bloque) {
							Bloque bloqueAux = (Bloque) sentencias;
							checkSentenciasAsignaciones(bloqueAux.getSentencias(), variablesTipadas, registros, nombresRegistros, funcionesTipadas, vectores, matrices, registrosCamposTipados);

						}
					}
				}
			}
		}
	}
	
	@Check
	protected void checkAsignacionesSubproceso(Modulo modulo) {
		//Preparamos las variables de tipo registro para permitir asignación
		Map<String,HashMap<String,String>> registros = new HashMap<String,HashMap<String,String>>();
		Map<String,String> vectores = new HashMap<String,String>();
		List<String> nombresRegistros = new ArrayList<String>();
		Map<String,String> matrices = new HashMap<String,String>();
				
		funciones.prepararColeccionesTiposComplejos(modulo.getImplementacion().getTipocomplejo(), registros, nombresRegistros, vectores, matrices);
				
		//Registramos todas las funciones que están definidas
		Map<String,HashMap<Integer,String>> funcionesTipadas = new HashMap<String,HashMap<Integer,String>>();
				
		funciones.prepararColeccionFunciones(modulo.getImplementacion().getFuncion(), funcionesTipadas);
				
		//Registramos todos los campos tipados de cada registro
		Map<String, Map<String,String>> registrosCamposTipados = new HashMap<String,Map<String,String>>();
						
		for(TipoComplejo t: modulo.getImplementacion().getTipocomplejo()) {
			if(t instanceof Registro) {
				Registro r = (Registro) t;
				registrosCamposTipados.put(r.getNombre(), funciones.registrarCamposRegistro(r.getVariable()));
			}
		}
				
		Map<String,String> variablesTipadasGlobales = funciones.registrarVariablesTipadas(modulo.getImplementacion().getGlobal());
				
		for(Subproceso sub: modulo.getImplementacion().getFuncion()) {
		//Registramos todas las variables declaradas con sus respectivos tipos
			Map<String,String> variablesTipadas = funciones.registrarVariablesTipadas(sub.getDeclaracion());
					
			//Añadimos las variables globales si no hay una variable local que se llame igual
					
			List<String> nombresGlobales = new ArrayList<String>();
					
			for(Declaracion d: modulo.getImplementacion().getGlobal()) {
				if(d instanceof DeclaracionPropia) {
					DeclaracionPropia dp = (DeclaracionPropia) d;
					for(Variable v: dp.getVariable()) {
						nombresGlobales.add(v.getNombre());
					}
				}
				else {
					DeclaracionVariable dv = (DeclaracionVariable) d;
					for(Variable v: dv.getVariable()) {
						nombresGlobales.add(v.getNombre());
					}
				}
			}
					
			for(String nombre: nombresGlobales) {
				if(!variablesTipadas.containsKey(nombre)) {
					variablesTipadas.put(nombre, variablesTipadasGlobales.get(nombre));
				}
			}
					
			//Como es una función también debemos registrar los parámetros
					
			funciones.getTiposCabecera(sub.getParametrofuncion(), variablesTipadas);
			checkSentenciasAsignaciones(sub.getSentencias(), variablesTipadas, registros, nombresRegistros, funcionesTipadas, vectores, matrices, registrosCamposTipados);
					
			for(Sentencias s: sub.getSentencias()) {
				if(s instanceof Bloque) {
					Bloque bloque = (Bloque) s;
					if(bloque instanceof segun) {
						segun seg = (segun) bloque;
						for(Caso caso: seg.getCaso()) {
							checkSentenciasAsignaciones(caso.getSentencias(), variablesTipadas, registros, nombresRegistros, funcionesTipadas, vectores, matrices, registrosCamposTipados);

									
							for(Sentencias sentencias: caso.getSentencias()) {
								if(sentencias instanceof Bloque) {
									Bloque bloqueAux = (Bloque) sentencias;
									checkSentenciasAsignaciones(bloqueAux.getSentencias(), variablesTipadas, registros, nombresRegistros, funcionesTipadas, vectores, matrices, registrosCamposTipados);

								}
							}
						}
					}
					else {
						checkSentenciasAsignaciones(bloque.getSentencias(), variablesTipadas, registros, nombresRegistros, funcionesTipadas, vectores, matrices, registrosCamposTipados);

								
						for(Sentencias sentencias: bloque.getSentencias()) {
							if(sentencias instanceof Bloque) {
								Bloque bloqueAux = (Bloque) sentencias;
								checkSentenciasAsignaciones(bloqueAux.getSentencias(), variablesTipadas, registros, nombresRegistros, funcionesTipadas, vectores, matrices, registrosCamposTipados);

							}
						}
					}
				}
			}
		}		
	}
	
	@Check
	//Función que valida que el tipo de dato que se quiere asignar sea compatible con el tipo de la variable (asignación normal)
	protected void checkAsignacionesSubproceso(Algoritmo algoritmo) {
		//Preparamos las variables de tipo registro para permitir asignación
		Map<String,HashMap<String,String>> registros = new HashMap<String,HashMap<String,String>>();
		Map<String,String> vectores = new HashMap<String,String>();
		List<String> nombresRegistros = new ArrayList<String>();
		Map<String,String> matrices = new HashMap<String,String>();
		
		funciones.prepararColeccionesTiposComplejos(algoritmo.getTipocomplejo(), registros, nombresRegistros, vectores, matrices);
		
		//Registramos todas las funciones que están definidas
		Map<String,HashMap<Integer,String>> funcionesTipadas = new HashMap<String,HashMap<Integer,String>>();
		
		funciones.prepararColeccionFunciones(algoritmo.getFuncion(), funcionesTipadas);
		
		//Registramos todos los campos tipados de cada registro
		Map<String, Map<String,String>> registrosCamposTipados = new HashMap<String,Map<String,String>>();
				
		for(TipoComplejo t: algoritmo.getTipocomplejo()) {
			if(t instanceof Registro) {
				Registro r = (Registro) t;
				registrosCamposTipados.put(r.getNombre(), funciones.registrarCamposRegistro(r.getVariable()));
			}
		}
		
		Map<String,String> variablesTipadasGlobales = funciones.registrarVariablesTipadas(algoritmo.getGlobal());
		
		for(Subproceso sub: algoritmo.getFuncion()) {
			//Registramos todas las variables declaradas con sus respectivos tipos
			Map<String,String> variablesTipadas = funciones.registrarVariablesTipadas(sub.getDeclaracion());
			
			//Añadimos las variables globales si no hay una variable local que se llame igual
			
			List<String> nombresGlobales = new ArrayList<String>();
			
			for(Declaracion d: algoritmo.getGlobal()) {
				if(d instanceof DeclaracionPropia) {
					DeclaracionPropia dp = (DeclaracionPropia) d;
					for(Variable v: dp.getVariable()) {
						nombresGlobales.add(v.getNombre());
					}
				}
				else {
					DeclaracionVariable dv = (DeclaracionVariable) d;
					for(Variable v: dv.getVariable()) {
						nombresGlobales.add(v.getNombre());
					}
				}
			}
			
			for(String nombre: nombresGlobales) {
				if(!variablesTipadas.containsKey(nombre)) {
					variablesTipadas.put(nombre, variablesTipadasGlobales.get(nombre));
				}
			}
			
			//Como es una función también debemos registrar los parámetros
			
			funciones.getTiposCabecera(sub.getParametrofuncion(), variablesTipadas);
			checkSentenciasAsignaciones(sub.getSentencias(), variablesTipadas, registros, nombresRegistros, funcionesTipadas, vectores, matrices, registrosCamposTipados);
			
			for(Sentencias s: sub.getSentencias()) {
				if(s instanceof Bloque) {
					Bloque bloque = (Bloque) s;
					if(bloque instanceof segun) {
						segun seg = (segun) bloque;
						for(Caso caso: seg.getCaso()) {
							checkSentenciasAsignaciones(caso.getSentencias(), variablesTipadas, registros, nombresRegistros, funcionesTipadas, vectores, matrices, registrosCamposTipados);

							
							for(Sentencias sentencias: caso.getSentencias()) {
								if(sentencias instanceof Bloque) {
									Bloque bloqueAux = (Bloque) sentencias;
									checkSentenciasAsignaciones(bloqueAux.getSentencias(), variablesTipadas, registros, nombresRegistros, funcionesTipadas, vectores, matrices, registrosCamposTipados);

								}
							}
						}
					}
					else {
						checkSentenciasAsignaciones(bloque.getSentencias(), variablesTipadas, registros, nombresRegistros, funcionesTipadas, vectores, matrices, registrosCamposTipados);

						
						for(Sentencias sentencias: bloque.getSentencias()) {
							if(sentencias instanceof Bloque) {
								Bloque bloqueAux = (Bloque) sentencias;
								checkSentenciasAsignaciones(bloqueAux.getSentencias(), variablesTipadas, registros, nombresRegistros, funcionesTipadas, vectores, matrices, registrosCamposTipados);

							}
						}
					}
				}
			}
		}
			
	}
	
	private void comprobarParametrosTipoComplejoLlamada(List<operacion> operaciones, List<String> nombresRegistros, List<String> nombresVectores, List<String> nombresMatrices, Map<String,String> variables) {
		for(operacion opAux: operaciones) {
			if(opAux instanceof Operador) {
				Operador op = (Operador) opAux;
				if(op instanceof ValorVector) {
					ValorVector vector = (ValorVector) op;
					if(!nombresVectores.contains(variables.get(vector.getNombre_vector()))) {
						error(readerMessages.getString("NO_TIPO_VECTOR", vector.getNombre_vector()), vector, DiagramapseudocodigoPackage.Literals.VALOR_VECTOR__NOMBRE_VECTOR);
					}
				}
				else if(op instanceof ValorMatriz) {
					ValorMatriz matriz = (ValorMatriz) op;
					if(!nombresMatrices.contains(variables.get(matriz.getNombre_matriz()))) {
						error(readerMessages.getString("NO_TIPO_MATRIZ", matriz.getNombre_matriz()), matriz, DiagramapseudocodigoPackage.Literals.VALOR_MATRIZ__NOMBRE_MATRIZ);
					}
				}
				else if(op instanceof ValorRegistro) {
					ValorRegistro registro = (ValorRegistro) op;
					if(!nombresRegistros.contains(variables.get(registro.getNombre_registro()))) {
						//Si no lo contiene es que el tipo de la variable no era un registro
						error(readerMessages.getString("NO_TIPO_REGISTRO", registro.getNombre_registro()), registro, DiagramapseudocodigoPackage.Literals.VALOR_REGISTRO__NOMBRE_REGISTRO);
					}
				}
			}
		}		
	}
	
	private void checkVariblesUsadasTiposComplejosAux(List<Sentencias> sentencias, Map<String,String> variables, List<String> nombresRegistros, List<String> nombresVectores, List<String> nombresMatrices) {
		
		for(Sentencias s: sentencias) {
			if(s instanceof AsignacionNormal) {
				AsignacionNormal a = (AsignacionNormal) s;
				if(a.getOperador() instanceof ValorRegistro) {
					ValorRegistro r = (ValorRegistro) a.getOperador();
					if(!nombresRegistros.contains(variables.get(r.getNombre_registro()))) {
						//Si no lo contiene es que el tipo de la variable no era un registro
						error(readerMessages.getString("NO_TIPO_REGISTRO", r.getNombre_registro()), r, DiagramapseudocodigoPackage.Literals.VALOR_REGISTRO__NOMBRE_REGISTRO);
					}
				}
				else if(a.getOperador() instanceof ValorVector) {
					ValorVector v = (ValorVector) a.getOperador();
					if(!nombresVectores.contains(variables.get(v.getNombre_vector()))) {
						error(readerMessages.getString("NO_TIPO_VECTOR", v.getNombre_vector()), v, DiagramapseudocodigoPackage.Literals.VALOR_VECTOR__NOMBRE_VECTOR);
					}
				}
				else if(a.getOperador() instanceof ValorMatriz) {
					ValorMatriz m = (ValorMatriz) a.getOperador();
					if(!nombresMatrices.contains(variables.get(m.getNombre_matriz()))) {
						error(readerMessages.getString("NO_TIPO_MATRIZ", m.getNombre_matriz()), m, DiagramapseudocodigoPackage.Literals.VALOR_MATRIZ__NOMBRE_MATRIZ);
					}
				}
				else if(a.getOperador() instanceof LlamadaFuncion) {
					LlamadaFuncion l = (LlamadaFuncion) a.getOperador();
					comprobarParametrosTipoComplejoLlamada(l.getOperadores(), nombresRegistros, nombresVectores, nombresMatrices, variables);	
				}
				
				else if(funciones.esOperacion(a.getOperador())) {
					//Si es una operación debemos comprobar la lista de operadores completa
					ArrayList<valor> valores = new ArrayList<valor>();
					valores = funciones.registrarValoresOperacion(a.getOperador(), valores);
					List<ValorRegistro> valoresRegistro = funciones.variablesRegistroExistentes(valores, variables, nombresRegistros);
					for(ValorRegistro vr: valoresRegistro) {
						error(readerMessages.getString("NO_TIPO_REGISTRO", vr.getNombre_registro()), vr, DiagramapseudocodigoPackage.Literals.VALOR_REGISTRO__NOMBRE_REGISTRO);
					}
					List<ValorVector> valoresVector = funciones.variablesVectorExistentes(valores, variables, nombresVectores);
					for(ValorVector vv: valoresVector) {
						error(readerMessages.getString("NO_TIPO_VECTOR", vv.getNombre_vector()), vv, DiagramapseudocodigoPackage.Literals.VALOR_VECTOR__NOMBRE_VECTOR);
					}
					List<ValorMatriz> valoresMatriz = funciones.variablesMatrizExistentes(valores, variables, nombresMatrices);
					for(ValorMatriz vm: valoresMatriz) {
						error(readerMessages.getString("NO_TIPO_MATRIZ", vm.getNombre_matriz()), vm, DiagramapseudocodigoPackage.Literals.VALOR_MATRIZ__NOMBRE_MATRIZ);
					}
					//Comprobamos los parámetros de las funciones
					
					for(valor v: valores) {
						if(v instanceof LlamadaFuncion) {
							LlamadaFuncion l = (LlamadaFuncion) v;
							comprobarParametrosTipoComplejoLlamada(l.getOperadores(), nombresRegistros, nombresVectores, nombresMatrices, variables);
						}
					}
					
				}
			}
			else if(s instanceof AsignacionCompleja) {
				AsignacionCompleja a = (AsignacionCompleja) s;
				if(a.getValor_asignacion() instanceof ValorRegistro) {
					ValorRegistro r = (ValorRegistro) a.getValor_asignacion();
					if(!nombresRegistros.contains(variables.get(r.getNombre_registro()))) {
						//Si no lo contiene es que el tipo de la variable no era un registro
						error(readerMessages.getString("NO_TIPO_REGISTRO", r.getNombre_registro()), r, DiagramapseudocodigoPackage.Literals.VALOR_REGISTRO__NOMBRE_REGISTRO);
					}
				}
				else if(a.getValor_asignacion() instanceof ValorVector) {
					ValorVector v = (ValorVector) a.getValor_asignacion();
					if(!nombresVectores.contains(variables.get(v.getNombre_vector()))) {
						error(readerMessages.getString("NO_TIPO_VECTOR", v.getNombre_vector()), v, DiagramapseudocodigoPackage.Literals.VALOR_VECTOR__NOMBRE_VECTOR);
					}
				}
				else if(a.getValor_asignacion() instanceof ValorMatriz) {
					ValorMatriz m = (ValorMatriz) a.getValor_asignacion();
					if(!nombresMatrices.contains(variables.get(m.getNombre_matriz()))) {
						error(readerMessages.getString("NO_TIPO_MATRIZ", m.getNombre_matriz()), m, DiagramapseudocodigoPackage.Literals.VALOR_MATRIZ__NOMBRE_MATRIZ);
					}
				}
				if(a.getOperador() instanceof ValorRegistro) {
					ValorRegistro r = (ValorRegistro) a.getOperador();
					if(!nombresRegistros.contains(variables.get(r.getNombre_registro()))) {
						//Si no lo contiene es que el tipo de la variable no era un registro
						error(readerMessages.getString("NO_TIPO_REGISTRO", r.getNombre_registro()), r, DiagramapseudocodigoPackage.Literals.VALOR_REGISTRO__NOMBRE_REGISTRO);
					}
				}
				else if(a.getOperador() instanceof ValorVector) {
					ValorVector v = (ValorVector) a.getOperador();
					if(!nombresVectores.contains(variables.get(v.getNombre_vector()))) {
						error(readerMessages.getString("NO_TIPO_VECTOR", v.getNombre_vector()), v, DiagramapseudocodigoPackage.Literals.VALOR_VECTOR__NOMBRE_VECTOR);
					}
				}
				else if(a.getOperador() instanceof ValorMatriz) {
					ValorMatriz m = (ValorMatriz) a.getOperador();
					if(!nombresMatrices.contains(variables.get(m.getNombre_matriz()))) {
						error(readerMessages.getString("NO_TIPO_MATRIZ", m.getNombre_matriz()), m, DiagramapseudocodigoPackage.Literals.VALOR_MATRIZ__NOMBRE_MATRIZ);
					}
				}
				else if(a.getOperador() instanceof LlamadaFuncion) {
					LlamadaFuncion l = (LlamadaFuncion) a.getOperador();
					comprobarParametrosTipoComplejoLlamada(l.getOperadores(), nombresRegistros, nombresVectores, nombresMatrices, variables);	
				}
				else if(funciones.esOperacion(a.getOperador())) {
					//Si es una operación debemos comprobar la lista de operadores completa
					ArrayList<valor> valores = new ArrayList<valor>();
					valores = funciones.registrarValoresOperacion(a.getOperador(), valores);
					List<ValorRegistro> valoresRegistro = funciones.variablesRegistroExistentes(valores, variables, nombresRegistros);
					for(ValorRegistro vr: valoresRegistro) {
						error(readerMessages.getString("NO_TIPO_REGISTRO", vr.getNombre_registro()), vr, DiagramapseudocodigoPackage.Literals.VALOR_REGISTRO__NOMBRE_REGISTRO);
					}
					List<ValorVector> valoresVector = funciones.variablesVectorExistentes(valores, variables, nombresVectores);
					for(ValorVector vv: valoresVector) {
						error(readerMessages.getString("NO_TIPO_VECTOR", vv.getNombre_vector()), vv, DiagramapseudocodigoPackage.Literals.VALOR_VECTOR__NOMBRE_VECTOR);
					}
					List<ValorMatriz> valoresMatriz = funciones.variablesMatrizExistentes(valores, variables, nombresMatrices);
					for(ValorMatriz vm: valoresMatriz) {
						error(readerMessages.getString("NO_TIPO_MATRIZ", vm.getNombre_matriz()), vm, DiagramapseudocodigoPackage.Literals.VALOR_MATRIZ__NOMBRE_MATRIZ);
					}
					
					//Comprobamos los parámetros de las funciones:
					
					for(valor v: valores) {
						if(v instanceof LlamadaFuncion) {
							LlamadaFuncion l = (LlamadaFuncion) v;
							comprobarParametrosTipoComplejoLlamada(l.getOperadores(), nombresRegistros, nombresVectores, nombresMatrices, variables);
						}
					}
				}
			}
		}
	}
	
	@Check
	protected void checkVariableUsadaTipoComplejo(Modulo modulo) {	
		//Recogemos todos los registros, con los nombres nos vale porque ya tenemos una función que se encarga de
		//validar si un campo es o no de un determinado registro
		List<String> nombresRegistros = new ArrayList<String>();
		List<String> nombresVectores = new ArrayList<String>();
		List<String> nombresMatrices = new ArrayList<String>();
		for(TipoComplejo t: modulo.getImplementacion().getTipocomplejo()) {
			if(t instanceof Registro) {
				Registro r = (Registro) t;
				nombresRegistros.add(r.getNombre());
			}
			else if(t instanceof Vector) {
				Vector v = (Vector) t;
				nombresVectores.add(v.getNombre());
			}
			else if(t instanceof Matriz) {
				Matriz m = (Matriz) t;
				nombresMatrices.add(m.getNombre());
			}
		}
		
		for(Subproceso sub: modulo.getImplementacion().getFuncion()) {
			Map<String,String> variables = funciones.registrarVariablesTipadas(sub.getDeclaracion());
			
			//Como son subprocesos también debemos registrar sus parámetros
			
			funciones.getTiposCabecera(sub.getParametrofuncion(), variables);
			
			checkVariblesUsadasTiposComplejosAux(sub.getSentencias(), variables, nombresRegistros, nombresVectores, nombresMatrices);
			
			for(Sentencias s: sub.getSentencias()) {
				if(s instanceof Bloque) {
					Bloque bloque = (Bloque) s;
					if(bloque instanceof segun) {
						segun seg = (segun) bloque;
						for(Caso caso: seg.getCaso()) {
							checkVariblesUsadasTiposComplejosAux(caso.getSentencias(), variables, nombresRegistros, nombresVectores, nombresMatrices);

							
							for(Sentencias sentencias: caso.getSentencias()) {
								if(sentencias instanceof Bloque) {
									Bloque bloqueAux = (Bloque) sentencias;
									checkVariblesUsadasTiposComplejosAux(bloqueAux.getSentencias(), variables, nombresRegistros, nombresVectores, nombresMatrices);

								}
							}
						}
					}
					else {
						checkVariblesUsadasTiposComplejosAux(bloque.getSentencias(), variables, nombresRegistros, nombresVectores, nombresMatrices);

						
						for(Sentencias sentencias: bloque.getSentencias()) {
							if(sentencias instanceof Bloque) {
								Bloque bloqueAux = (Bloque) sentencias;
								checkVariblesUsadasTiposComplejosAux(bloqueAux.getSentencias(), variables, nombresRegistros, nombresVectores, nombresMatrices);

							}
						}
					}
				}
			}
		}
	}	
	
	@Check
	protected void checkVariableUsadaTipoComplejo(Algoritmo algoritmo) {
		//Recogemos todos los registros, con los nombres nos vale porque ya tenemos una función que se encarga de
		//validar si un campo es o no de un determinado registro
		List<String> nombresRegistros = new ArrayList<String>();
		List<String> nombresVectores = new ArrayList<String>();
		List<String> nombresMatrices = new ArrayList<String>();
		for(TipoComplejo t: algoritmo.getTipocomplejo()) {
			if(t instanceof Registro) {
				Registro r = (Registro) t;
				nombresRegistros.add(r.getNombre());
			}
			else if(t instanceof Vector) {
				Vector v = (Vector) t;
				nombresVectores.add(v.getNombre());
			}
			else if(t instanceof Matriz) {
				Matriz m = (Matriz) t;
				nombresMatrices.add(m.getNombre());
			}
		}
		
		//Ahora comprobamos que ni en el programa principal ni en los subprocesos se utilice una variable declarada
		//como si fuese un registro sin serlo.
		
		//1) En el programa principal:
		
		Map<String,String> variables = funciones.registrarVariablesTipadas(algoritmo.getTiene().getDeclaracion());
		
		checkVariblesUsadasTiposComplejosAux(algoritmo.getTiene().getTiene(), variables, nombresRegistros, nombresVectores, nombresMatrices);
		
		for(Sentencias s: algoritmo.getTiene().getTiene()) {
			if(s instanceof Bloque) {
				Bloque bloque = (Bloque) s;
				if(bloque instanceof segun) {
					segun seg = (segun) bloque;
					for(Caso caso: seg.getCaso()) {
						checkVariblesUsadasTiposComplejosAux(caso.getSentencias(), variables, nombresRegistros, nombresVectores, nombresMatrices);

						
						for(Sentencias sentencias: caso.getSentencias()) {
							if(sentencias instanceof Bloque) {
								Bloque bloqueAux = (Bloque) sentencias;
								checkVariblesUsadasTiposComplejosAux(bloqueAux.getSentencias(), variables, nombresRegistros, nombresVectores, nombresMatrices);

							}
						}
					}
				}
				else {
					checkVariblesUsadasTiposComplejosAux(bloque.getSentencias(), variables, nombresRegistros, nombresVectores, nombresMatrices);

					
					for(Sentencias sentencias: bloque.getSentencias()) {
						if(sentencias instanceof Bloque) {
							Bloque bloqueAux = (Bloque) sentencias;
							checkVariblesUsadasTiposComplejosAux(bloqueAux.getSentencias(), variables, nombresRegistros, nombresVectores, nombresMatrices);

						}
					}
				}
			}
		}
		
		//2) En los subprocesos:
		
		for(Subproceso sub: algoritmo.getFuncion()) {
			variables = funciones.registrarVariablesTipadas(sub.getDeclaracion());
			
			//Como son subprocesos también debemos registrar sus parámetros
			
			funciones.getTiposCabecera(sub.getParametrofuncion(), variables);
			
			checkVariblesUsadasTiposComplejosAux(sub.getSentencias(), variables, nombresRegistros, nombresVectores, nombresMatrices);
			
			for(Sentencias s: sub.getSentencias()) {
				if(s instanceof Bloque) {
					Bloque bloque = (Bloque) s;
					if(bloque instanceof segun) {
						segun seg = (segun) bloque;
						for(Caso caso: seg.getCaso()) {
							checkVariblesUsadasTiposComplejosAux(caso.getSentencias(), variables, nombresRegistros, nombresVectores, nombresMatrices);

							
							for(Sentencias sentencias: caso.getSentencias()) {
								if(sentencias instanceof Bloque) {
									Bloque bloqueAux = (Bloque) sentencias;
									checkVariblesUsadasTiposComplejosAux(bloqueAux.getSentencias(), variables, nombresRegistros, nombresVectores, nombresMatrices);

								}
							}
						}
					}
					else {
						checkVariblesUsadasTiposComplejosAux(bloque.getSentencias(), variables, nombresRegistros, nombresVectores, nombresMatrices);

						
						for(Sentencias sentencias: bloque.getSentencias()) {
							if(sentencias instanceof Bloque) {
								Bloque bloqueAux = (Bloque) sentencias;
								checkVariblesUsadasTiposComplejosAux(bloqueAux.getSentencias(), variables, nombresRegistros, nombresVectores, nombresMatrices);

							}
						}
					}
				}
			}
		}
		
	}
}
