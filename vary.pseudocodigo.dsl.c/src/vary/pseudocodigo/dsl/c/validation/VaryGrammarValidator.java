package vary.pseudocodigo.dsl.c.validation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.xtext.EcoreUtil2;
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
import diagramapseudocodigo.Codigo;
import diagramapseudocodigo.Comparacion;
import diagramapseudocodigo.CadenaCaracteres;
import diagramapseudocodigo.Constante;
import diagramapseudocodigo.Declaracion;
import diagramapseudocodigo.DeclaracionDefinida;
import diagramapseudocodigo.DeclaracionBasica;
import diagramapseudocodigo.Devolver;
import diagramapseudocodigo.DiagramapseudocodigoPackage;
import diagramapseudocodigo.DivisionReal;
import diagramapseudocodigo.DivisionEntera;
import diagramapseudocodigo.Enumerado;
import diagramapseudocodigo.Funcion;
import diagramapseudocodigo.FuncionFicheroAbrir;
import diagramapseudocodigo.FuncionFicheroCerrar;
import diagramapseudocodigo.Igualdad;
import diagramapseudocodigo.FuncionInterna;
import diagramapseudocodigo.LlamadaFuncion;
import diagramapseudocodigo.Matriz;
import diagramapseudocodigo.Mod;
import diagramapseudocodigo.Modulo;
import diagramapseudocodigo.Multiplicacion;
import diagramapseudocodigo.Real;
import diagramapseudocodigo.Entero;
import diagramapseudocodigo.OperacionCompleta;
import diagramapseudocodigo.OperacionParentesis;
import diagramapseudocodigo.Operador;
import diagramapseudocodigo.Or;
import diagramapseudocodigo.Parametro;
import diagramapseudocodigo.Registro;
import diagramapseudocodigo.Resta;
import diagramapseudocodigo.Subproceso;
import diagramapseudocodigo.Subrango;
import diagramapseudocodigo.SubrangoEnumerado;
import diagramapseudocodigo.SubrangoNumerico;
import diagramapseudocodigo.Suma;
import diagramapseudocodigo.TipoComplejo;
import diagramapseudocodigo.TipoDefinido;
import diagramapseudocodigo.Logico;
import diagramapseudocodigo.ValorComplejo;
import diagramapseudocodigo.ValorMatriz;
import diagramapseudocodigo.ValorRegistro;
import diagramapseudocodigo.ValorVector;
import diagramapseudocodigo.Variable;
import diagramapseudocodigo.VariableID;
import diagramapseudocodigo.Vector;
import diagramapseudocodigo.Desde;
import diagramapseudocodigo.Operacion;
import diagramapseudocodigo.Segun;
import diagramapseudocodigo.Valor;

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
	
	/* 1) */ @Check /* -------------------------------------------------------------------------------------------------------------- */
	/**
	 * Función que comprueba que un campo utilizado de un registro pertenezca realmente a ese tipo de registro
	 * @param valorRegistro
	 */
	protected void check(ValorRegistro valorRegistro) {
		Algoritmo algoritmo = EcoreUtil2.getContainerOfType(valorRegistro, Algoritmo.class);
		Modulo modulo = EcoreUtil2.getContainerOfType(valorRegistro, Modulo.class);
		Subproceso subproceso =  EcoreUtil2.getContainerOfType(valorRegistro, Subproceso.class);
		
		if(algoritmo != null && subproceso == null) {
			Map<String,HashMap<String, String>> registros = funciones.getRegistrosTipados(algoritmo.getComplejos(), algoritmo.getImportaciones());
			Map<String, String> variablesTipadas = funciones.getVariablesDefinidasTipadas(algoritmo.getInicio().getDeclaraciones(), null, algoritmo.getGlobales(), algoritmo.getImportaciones());
			Map<String, String> vectores = funciones.getVectoresTipados(algoritmo.getComplejos(), algoritmo.getImportaciones());
			Map<String, String> matrices = funciones.getMatricesTipadas(algoritmo.getComplejos(), algoritmo.getImportaciones());
			checkAux(valorRegistro, registros, variablesTipadas, vectores, matrices);
		} else if(algoritmo != null && subproceso != null) {
			Map<String,HashMap<String, String>> registros = funciones.getRegistrosTipados(algoritmo.getComplejos(), algoritmo.getImportaciones());
			Map<String, String> variablesTipadas = funciones.getVariablesDefinidasTipadas(subproceso.getDeclaraciones(), subproceso.getParametros(), algoritmo.getGlobales(), algoritmo.getImportaciones());
			Map<String, String> vectores = funciones.getVectoresTipados(algoritmo.getComplejos(), algoritmo.getImportaciones());
			Map<String, String> matrices = funciones.getMatricesTipadas(algoritmo.getComplejos(), algoritmo.getImportaciones());
			checkAux(valorRegistro, registros, variablesTipadas, vectores, matrices);
		} else {
			Map<String,HashMap<String, String>> registros = funciones.getRegistrosTipados(modulo.getImplementacion().getComplejos(), modulo.getImportaciones());
			Map<String, String> variablesTipadas = funciones.getVariablesDefinidasTipadas(subproceso.getDeclaraciones(), subproceso.getParametros(), modulo.getImplementacion().getGlobales(), modulo.getImportaciones());
			Map<String, String> vectores = funciones.getVectoresTipados(modulo.getImplementacion().getComplejos(), modulo.getImportaciones());
			Map<String, String> matrices = funciones.getMatricesTipadas(modulo.getImplementacion().getComplejos(), modulo.getImportaciones());
			checkAux(valorRegistro, registros, variablesTipadas, vectores, matrices);
		}
	}
	
	/*
	 * Función auxiliar de check(ValorRegistro) // Principio DRY.
	 */
	private void checkAux(ValorRegistro r, Map<String,HashMap<String, String>> registros, Map<String,String> variablesTipadas, Map<String, String> vectores, Map<String, String> matrices) {	
		String campoAnterior = "";
		String registroReferenciado = "";
		
		for(CampoRegistro campo: r.getCampos()) {
			if(r.getCampos().indexOf(campo) == 0) { //El primer campo no tiene anterior
				if(!registros.get(variablesTipadas.get(r.getNombre_registro())).containsKey(campo.getNombre_campo())) {
					error(readerMessages.getString("CAMPO_REGISTRO_NO_VALIDO", campo.getNombre_campo(), variablesTipadas.get(r.getNombre_registro())), campo, DiagramapseudocodigoPackage.Literals.CAMPO_REGISTRO__NOMBRE_CAMPO);
				}
				else if(campo.getPrimerIndice() != null && campo.getSegundoIndice() != null && !matrices.containsKey(registros.get(variablesTipadas.get(r.getNombre_registro())).get(campo.getNombre_campo()))) { //Se usa como una matriz pero no es del tipo matriz
					error(readerMessages.getString("CAMPO_REGISTRO_NOMATRIZ", campo.getNombre_campo()), campo, DiagramapseudocodigoPackage.Literals.CAMPO_REGISTRO__NOMBRE_CAMPO);
				} else if(campo.getPrimerIndice() != null && campo.getSegundoIndice() == null && !vectores.containsKey(registros.get(variablesTipadas.get(r.getNombre_registro())).get(campo.getNombre_campo()))) { //Se usa como un vector pero no es del tipo vector
					error(readerMessages.getString("CAMPO_REGISTRO_NOVECTOR", campo.getNombre_campo()), campo, DiagramapseudocodigoPackage.Literals.CAMPO_REGISTRO__NOMBRE_CAMPO);
				}
			} else {
				String registroReferenciadoAux = "";
				
				if(registroReferenciado != "") {
					registroReferenciadoAux = registros.get(registroReferenciado).get(campoAnterior);
				} else {
					registroReferenciadoAux = registros.get(variablesTipadas.get(r.getNombre_registro())).get(campoAnterior);
				}
				
				if(registroReferenciadoAux != null && !registroReferenciadoAux.equals(readerMessages.getBundle().getString("TIPO_ENTERO")) && !registroReferenciadoAux.equals(readerMessages.getBundle().getString("TIPO_REAL")) 
						&& !registroReferenciadoAux.equals(readerMessages.getBundle().getString("TIPO_CADENA")) && !registroReferenciadoAux.equals(readerMessages.getBundle().getString("TIPO_CARACTER")) &&
						!registroReferenciadoAux.equals(readerMessages.getBundle().getString("TIPO_LOGICO"))) {
					registroReferenciado = registroReferenciadoAux;
				}
				
				if(registroReferenciadoAux != registroReferenciado) { //Un campo de tipo nativo no puede contener otros campos (tipoNativo.unCampo)
					error(readerMessages.getString("CAMPO_REGISTRO_NOREGISTRO", campoAnterior, registroReferenciado), campo, DiagramapseudocodigoPackage.Literals.CAMPO_REGISTRO__NOMBRE_CAMPO);
				} else if(!registros.get(registroReferenciado).containsKey(campo.getNombre_campo())) {
					error(readerMessages.getString("CAMPO_REGISTRO_NO_VALIDO", campo.getNombre_campo(), registroReferenciado), campo, DiagramapseudocodigoPackage.Literals.CAMPO_REGISTRO__NOMBRE_CAMPO);
				} else if(campo.getPrimerIndice() != null && campo.getSegundoIndice() != null && !matrices.containsKey(registros.get(registroReferenciado).get(campo.getNombre_campo()))
						&& !matrices.containsKey(registros.get(registroReferenciado).get(campo.getNombre_campo()))) { //Se usa como una matriz pero no es del tipo matriz
					error(readerMessages.getString("CAMPO_REGISTRO_NOMATRIZ", campo.getNombre_campo()), campo, DiagramapseudocodigoPackage.Literals.CAMPO_REGISTRO__NOMBRE_CAMPO);
				} else if(campo.getPrimerIndice() != null && campo.getSegundoIndice() == null && !vectores.containsKey(registros.get(registroReferenciado).get(campo.getNombre_campo()))
						&& !vectores.containsKey(registros.get(registroReferenciado).get(campo.getNombre_campo()))) { //Se usa como un vector pero no es del tipo vector
					error(readerMessages.getString("CAMPO_REGISTRO_NOVECTOR", campo.getNombre_campo()), campo, DiagramapseudocodigoPackage.Literals.CAMPO_REGISTRO__NOMBRE_CAMPO);
				}
			}
			campoAnterior = campo.getNombre_campo();
		}
	}
	
	/* 2) */ @Check /* -------------------------------------------------------------------------------------------------------------- */
	/**
	 * Función que se encarga de validar si la variable utilizada en un bucle desde ha sido previamente declarada y es de tipo entero
	 * @param desde
	 */
	protected void check(Desde desde) {
		Algoritmo algoritmo = EcoreUtil2.getContainerOfType(desde, Algoritmo.class);
		Modulo modulo = EcoreUtil2.getContainerOfType(desde, Modulo.class);
		Subproceso subproceso =  EcoreUtil2.getContainerOfType(desde, Subproceso.class);
		
		if(algoritmo != null && subproceso == null) {
			Map<String, String> variablesDefinidas = funciones.getVariablesDefinidasTipadas(algoritmo.getInicio().getDeclaraciones(), null, algoritmo.getGlobales(), algoritmo.getImportaciones());
			Map<String, String> constantesTipadas = funciones.getConstantesTipadas(algoritmo.getConstantes(), algoritmo.getImportaciones(), readerMessages);
			checkAux(desde, variablesDefinidas, constantesTipadas);
		} else if(algoritmo != null && subproceso != null) {
			Map<String, String> variablesDefinidas = funciones.getVariablesDefinidasTipadas(subproceso.getDeclaraciones(), subproceso.getParametros(), algoritmo.getGlobales(), algoritmo.getImportaciones());
			Map<String, String> constantesTipadas = funciones.getConstantesTipadas(algoritmo.getConstantes(), algoritmo.getImportaciones(), readerMessages);
			checkAux(desde, variablesDefinidas, constantesTipadas);
		} else {
			Map<String, String> variablesDefinidas = funciones.getVariablesDefinidasTipadas(subproceso.getDeclaraciones(), subproceso.getParametros(), modulo.getImplementacion().getGlobales(), modulo.getImportaciones());
			Map<String, String> constantesTipadas = funciones.getConstantesTipadas(modulo.getImplementacion().getConstantes(), modulo.getImportaciones(), readerMessages);
			checkAux(desde, variablesDefinidas, constantesTipadas);
		} 
	}
	
	/*
	 * Función auxiliar de check(Desde) // Principio DRY.
	 */
	private void checkAux(Desde desde, Map<String,String> variablesDefinidas, Map<String,String> constantesTipadas) {
		if(variablesDefinidas.containsKey(desde.getAsignacion().getValor_asignacion()) && !variablesDefinidas.get(desde.getAsignacion().getValor_asignacion()).equals(readerMessages.getBundle().getString("TIPO_ENTERO"))) {
			error(readerMessages.getString("VARIABLE_DESDE_ENTERO", desde.getAsignacion().getValor_asignacion()), desde, DiagramapseudocodigoPackage.Literals.DESDE__ASIGNACION);
		} else if(!variablesDefinidas.containsKey(desde.getAsignacion().getValor_asignacion())) {
			error(readerMessages.getString("VARIABLE_NO_DECLARADA", desde.getAsignacion().getValor_asignacion()), desde, DiagramapseudocodigoPackage.Literals.DESDE__ASIGNACION, VARIABLE_NO_DEFINIDA);
		}
	}
	
	/* 3) */ @Check /* -------------------------------------------------------------------------------------------------------------- */
	/**
	 * Funcion que se encarga de comprobar que todas las variables utilizadas en una Operacion hayan sido declaradas con anterioridad
	 * @param operacion
	 */
	protected void check(Operacion operacion) {
		Algoritmo algoritmo = EcoreUtil2.getContainerOfType(operacion, Algoritmo.class);
		Modulo modulo = EcoreUtil2.getContainerOfType(operacion, Modulo.class);
		Subproceso subproceso =  EcoreUtil2.getContainerOfType(operacion, Subproceso.class);
		Enumerado enumerado = EcoreUtil2.getContainerOfType(operacion, Enumerado.class);
		
		if(algoritmo != null && subproceso == null && enumerado == null) { //Los posibles valores de los enumerados no son variables no declaradas.
			Map<String, String> variablesDefinidas = funciones.getVariablesDefinidasTipadas(algoritmo.getInicio().getDeclaraciones(), null, algoritmo.getGlobales(), algoritmo.getImportaciones());
			variablesDefinidas.putAll(funciones.getConstantesTipadas(algoritmo.getConstantes(), algoritmo.getImportaciones(), readerMessages));
			variablesDefinidas.putAll(funciones.getValoresEnumeradoTipados(algoritmo.getComplejos(), algoritmo.getImportaciones()));
			variablesDefinidas.putAll(funciones.getTiposSubprocesosTipados(algoritmo.getComplejos(), algoritmo.getImportaciones()));
			if(operacion instanceof OperacionCompleta) {
				OperacionCompleta operacionCompleta = (OperacionCompleta) operacion;
				checkAux(operacionCompleta.getValor_operacion(), variablesDefinidas);
			} else if(operacion instanceof OperacionParentesis) {
				OperacionParentesis operacionParentesis = (OperacionParentesis) operacion;
				checkAux(operacionParentesis.getValor_operacion(), variablesDefinidas);
			} else {
				checkAux(operacion, variablesDefinidas);
			}
		} else if(algoritmo != null && subproceso != null && enumerado == null) {
			Map<String, String> variablesDefinidas = funciones.getVariablesDefinidasTipadas(subproceso.getDeclaraciones(), subproceso.getParametros(), algoritmo.getGlobales(), algoritmo.getImportaciones());
			variablesDefinidas.putAll(funciones.getConstantesTipadas(algoritmo.getConstantes(), algoritmo.getImportaciones(), readerMessages));
			variablesDefinidas.putAll(funciones.getValoresEnumeradoTipados(algoritmo.getComplejos(), algoritmo.getImportaciones()));
			variablesDefinidas.putAll(funciones.getTiposSubprocesosTipados(algoritmo.getComplejos(), algoritmo.getImportaciones()));
			if(operacion instanceof OperacionCompleta) {
				OperacionCompleta operacionCompleta = (OperacionCompleta) operacion;
				checkAux(operacionCompleta.getValor_operacion(), variablesDefinidas);
			} else if(operacion instanceof OperacionParentesis) {
				OperacionParentesis operacionParentesis = (OperacionParentesis) operacion;
				checkAux(operacionParentesis.getValor_operacion(), variablesDefinidas);
			} else {
				checkAux(operacion, variablesDefinidas);
			}
		} else if(enumerado == null) {
			Map<String, String> variablesDefinidas = funciones.getVariablesDefinidasTipadas(subproceso.getDeclaraciones(), subproceso.getParametros(), modulo.getImplementacion().getGlobales(), modulo.getImportaciones());
			variablesDefinidas.putAll(funciones.getConstantesTipadas(modulo.getImplementacion().getConstantes(), modulo.getImportaciones(), readerMessages));
			variablesDefinidas.putAll(funciones.getValoresEnumeradoTipados(modulo.getImplementacion().getComplejos(), modulo.getImportaciones()));
			variablesDefinidas.putAll(funciones.getTiposSubprocesosTipados(modulo.getImplementacion().getComplejos(), modulo.getImportaciones()));
			if(operacion instanceof OperacionCompleta) {
				OperacionCompleta operacionCompleta = (OperacionCompleta) operacion;
				checkAux(operacionCompleta.getValor_operacion(), variablesDefinidas);
			} else if(operacion instanceof OperacionParentesis) {
				OperacionParentesis operacionParentesis = (OperacionParentesis) operacion;
				checkAux(operacionParentesis.getValor_operacion(), variablesDefinidas);
			} else {
				checkAux(operacion, variablesDefinidas);
			}
		} 
	}
	
	/*
	 * Función auxiliar de check(OperacionCompleta) // Principio DRY.
	 */
	private void checkAux(Operacion operacion, Map<String, String> variablesDefinidas) {
		ArrayList<Valor> valores = funciones.getValoresOperacion(operacion);
		for(Valor valor: valores) {
			if(valor instanceof VariableID) {
				VariableID variableID = (VariableID) valor;
				if(!variablesDefinidas.containsKey(variableID.getNombre()) && !variableID.getNombre().equals(readerMessages.getBundle().getString("INTERNAS_CONCATENA")) &&
						!variableID.getNombre().equals(readerMessages.getBundle().getString("INTERNAS_COPIAR")) && !variableID.getNombre().equals(readerMessages.getBundle().getString("INTERNAS_LONGITUD")) &&
						!variableID.getNombre().equals(readerMessages.getBundle().getString("INTERNAS_SQRT")) && !variableID.getNombre().equals(readerMessages.getBundle().getString("INTERNAS_SEN")) &&
						!variableID.getNombre().equals(readerMessages.getBundle().getString("INTERNAS_LOG")) && !variableID.getNombre().equals(readerMessages.getBundle().getString("INTERNAS_LN")) &&
						!variableID.getNombre().equals(readerMessages.getBundle().getString("INTERNAS_EXP")) && !variableID.getNombre().equals(readerMessages.getBundle().getString("INTERNAS_CUADRADO")) &&
						!variableID.getNombre().equals(readerMessages.getBundle().getString("INTERNAS_COS"))) {
					error(readerMessages.getString("VARIABLE_NO_DECLARADA", variableID.getNombre()), variableID, DiagramapseudocodigoPackage.Literals.VARIABLE_ID__NOMBRE, VARIABLE_NO_DEFINIDA);
				}
			}
			else if(valor instanceof ValorRegistro) {
				ValorRegistro valorRegistro = (ValorRegistro) valor;
				if(!variablesDefinidas.containsKey(valorRegistro.getNombre_registro())) {
					error(readerMessages.getString("VARIABLE_NO_DECLARADA", valorRegistro.getNombre_registro()), valorRegistro, DiagramapseudocodigoPackage.Literals.VALOR_REGISTRO__NOMBRE_REGISTRO);
				}
			}
			else if(valor instanceof ValorVector) {
				ValorVector valorVector = (ValorVector) valor;
				if(!variablesDefinidas.containsKey(valorVector.getNombre_vector())) {
					error(readerMessages.getString("VARIABLE_NO_DECLARADA", valorVector.getNombre_vector()), valorVector, DiagramapseudocodigoPackage.Literals.VALOR_VECTOR__NOMBRE_VECTOR);
				}
				if(valorVector.getIndice() instanceof VariableID) {
					VariableID variableID = (VariableID) valorVector.getIndice();
					if(!variablesDefinidas.containsKey(variableID.getNombre())){
						error(readerMessages.getString("VARIABLE_NO_DECLARADA", variableID.getNombre()), variableID, DiagramapseudocodigoPackage.Literals.VARIABLE_ID__NOMBRE, VARIABLE_NO_DEFINIDA);
					}
				}
			}
			else if(valor instanceof ValorMatriz) {
				ValorMatriz valorMatriz = (ValorMatriz) valor;
				if(!variablesDefinidas.containsKey(valorMatriz.getNombre_matriz())) {
					error(readerMessages.getString("VARIABLE_NO_DECLARADA", valorMatriz.getNombre_matriz()), valorMatriz, DiagramapseudocodigoPackage.Literals.VALOR_MATRIZ__NOMBRE_MATRIZ);
				}
				ArrayList<Operacion> indicesMatriz = new ArrayList<Operacion>();
				indicesMatriz.add(valorMatriz.getPrimerIndice());
				indicesMatriz.add(valorMatriz.getSegundoIndice());
				for(Operacion op: indicesMatriz) {
					if(op instanceof VariableID) {
						VariableID variableID = (VariableID) op;
						if(!variablesDefinidas.containsKey(variableID.getNombre())) {
							error(readerMessages.getString("VARIABLE_NO_DECLARADA", variableID.getNombre()), variableID, DiagramapseudocodigoPackage.Literals.VARIABLE_ID__NOMBRE, VARIABLE_NO_DEFINIDA);
						}
					}
				}
			}
			else if(valor instanceof LlamadaFuncion) {
				LlamadaFuncion f = (LlamadaFuncion) valor;
				for(Valor valorAux: f.getParametros()) {
					if(valorAux instanceof OperacionCompleta) {
						OperacionCompleta operacionCompleta = (OperacionCompleta) valorAux;
						checkAux(operacionCompleta, variablesDefinidas);
					}	
				}
			}
		}
	}
	
	/* 4) */ @Check /* -------------------------------------------------------------------------------------------------------------- */
	/**
	 * Función que se encarga de comprobar si las condiciones utilizadas en los bloques son de tipo lógico.
	 * Además comprueba que el valor utilizado como tope en el bucle "desde" sea de tipo entero.
	 * @param bloque
	 */
	protected void check(Bloque bloque) {
		if(!(bloque instanceof Segun)) {  //El bloque segun puede aceptar otros valores que no sean de tipo lógico.
			Algoritmo algoritmo = EcoreUtil2.getContainerOfType(bloque, Algoritmo.class);
			Modulo modulo = EcoreUtil2.getContainerOfType(bloque, Modulo.class);
			Subproceso subproceso =  EcoreUtil2.getContainerOfType(bloque, Subproceso.class);
			
			if(algoritmo != null && subproceso == null) {
				Map<String,String> variablesDefinidas = funciones.getVariablesDefinidasTipadas(algoritmo.getInicio().getDeclaraciones(), null, algoritmo.getGlobales(), algoritmo.getImportaciones());
				Map<String,HashMap<Integer,String>> funcionesTipadas = funciones.getFuncionesTipadas(algoritmo.getSubprocesos(), algoritmo.getImportaciones());
				Map<String,HashMap<String,String>> registros = funciones.getRegistrosTipados(algoritmo.getComplejos(), algoritmo.getImportaciones());
				Map<String,String> vectores = funciones.getVectoresTipados(algoritmo.getComplejos(), algoritmo.getImportaciones());
				List<String> nombresRegistros = new ArrayList<String>(registros.keySet());
				Map<String,String> matrices = funciones.getMatricesTipadas(algoritmo.getComplejos(), algoritmo.getImportaciones());
				if(bloque instanceof Desde) {
					checkAux_valorEntero((Desde) bloque, bloque.getCondicion(), variablesDefinidas, funcionesTipadas, registros, nombresRegistros, vectores, matrices);
				} else {
					checkAux_valorLogico(bloque.getCondicion(), variablesDefinidas, funcionesTipadas, registros, nombresRegistros, vectores, matrices);
				}
			} else if(algoritmo != null && subproceso != null) {
				Map<String,String> variablesDefinidas = funciones.getVariablesDefinidasTipadas(subproceso.getDeclaraciones(), subproceso.getParametros(), algoritmo.getGlobales(), algoritmo.getImportaciones());
				Map<String,HashMap<Integer,String>> funcionesTipadas = funciones.getFuncionesTipadas(algoritmo.getSubprocesos(), algoritmo.getImportaciones());
				Map<String,HashMap<String,String>> registros = funciones.getRegistrosTipados(algoritmo.getComplejos(), algoritmo.getImportaciones());
				Map<String,String> vectores = funciones.getVectoresTipados(algoritmo.getComplejos(), algoritmo.getImportaciones());
				List<String> nombresRegistros = new ArrayList<String>(registros.keySet());
				Map<String,String> matrices = funciones.getMatricesTipadas(algoritmo.getComplejos(), algoritmo.getImportaciones());
				if(bloque instanceof Desde) {
					checkAux_valorEntero((Desde) bloque, bloque.getCondicion(), variablesDefinidas, funcionesTipadas, registros, nombresRegistros, vectores, matrices);
				} else {
					checkAux_valorLogico(bloque.getCondicion(), variablesDefinidas, funcionesTipadas, registros, nombresRegistros, vectores, matrices);
				}
			} else {
				Map<String,String> variablesDefinidas = funciones.getVariablesDefinidasTipadas(subproceso.getDeclaraciones(), subproceso.getParametros(), modulo.getImplementacion().getGlobales(), modulo.getImportaciones());
				Map<String,HashMap<Integer,String>> funcionesTipadas = funciones.getFuncionesTipadas(modulo.getImplementacion().getSubprocesos(), modulo.getImportaciones());
				Map<String,HashMap<String,String>> registros = funciones.getRegistrosTipados(modulo.getImplementacion().getComplejos(), modulo.getImportaciones());
				Map<String,String> vectores = funciones.getVectoresTipados(modulo.getImplementacion().getComplejos(),  modulo.getImportaciones());
				List<String> nombresRegistros = new ArrayList<String>(registros.keySet());
				Map<String,String> matrices = funciones.getMatricesTipadas(modulo.getImplementacion().getComplejos(),  modulo.getImportaciones());
				if(bloque instanceof Desde) {
					checkAux_valorEntero((Desde) bloque, bloque.getCondicion(), variablesDefinidas, funcionesTipadas, registros, nombresRegistros, vectores, matrices);
				} else {
					checkAux_valorLogico(bloque.getCondicion(), variablesDefinidas, funcionesTipadas, registros, nombresRegistros, vectores, matrices);
				}
			} 
		}
	}
	
	/*
	 * Función auxiliar de check(Bloque) // Principio DRY.
	 */
	private void checkAux_valorLogico(Operacion operacion, Map<String, String> variables, Map<String,HashMap<Integer,String>> funcionesTipadas, Map<String,HashMap<String,String>> registros, List<String> nombresRegistros, Map<String, String> vectores, Map<String, String> matrices) {
		if(operacion instanceof OperacionCompleta) {
			OperacionCompleta operacionCompleta = (OperacionCompleta) operacion;
			if(operacionCompleta.getValor_operacion() instanceof  Suma) {
				Suma suma = (Suma) operacionCompleta.getValor_operacion();
				if(!(funciones.checkOperacionLogica(suma))) {
					error(readerMessages.getBundle().getString("EXPRESION_TIPO_LOGICO"), suma, DiagramapseudocodigoPackage.Literals.SUMA__SIGNO_OP);
				}
			}
			else if(operacionCompleta.getValor_operacion() instanceof Resta) {
				Resta resta = (Resta) operacionCompleta.getValor_operacion();
				if(!(funciones.checkOperacionLogica(resta))) {
					error(readerMessages.getBundle().getString("EXPRESION_TIPO_LOGICO"), resta, DiagramapseudocodigoPackage.Literals.RESTA__SIGNO_OP);
				}
			}
			else if(operacionCompleta.getValor_operacion() instanceof Multiplicacion) {
				Multiplicacion multiplicacion = (Multiplicacion) operacionCompleta.getValor_operacion();
				if(!(funciones.checkOperacionLogica(multiplicacion))) {
					error(readerMessages.getBundle().getString("EXPRESION_TIPO_LOGICO"), multiplicacion, DiagramapseudocodigoPackage.Literals.MULTIPLICACION__SIGNO_OP);
				}
			}
			else if(operacionCompleta.getValor_operacion() instanceof DivisionEntera) {
				DivisionEntera division = (DivisionEntera) operacionCompleta.getValor_operacion();
				if(!(funciones.checkOperacionLogica(division))) {
					error(readerMessages.getBundle().getString("EXPRESION_TIPO_LOGICO"), division, DiagramapseudocodigoPackage.Literals.DIVISION_ENTERA__SIGNO_OP);
				}
			}
			else if(operacionCompleta.getValor_operacion() instanceof DivisionReal) {
				DivisionReal division = (DivisionReal) operacionCompleta.getValor_operacion();
				if(!(funciones.checkOperacionLogica(division))) {
					error(readerMessages.getBundle().getString("EXPRESION_TIPO_LOGICO"), division, DiagramapseudocodigoPackage.Literals.DIVISION_REAL__SIGNO_OP);
				}
			}
			else if(operacionCompleta.getValor_operacion() instanceof Or) {
				Or or = (Or) operacionCompleta.getValor_operacion();
				if(!(funciones.checkOperacionLogica(or))) {
					error(readerMessages.getBundle().getString("EXPRESION_TIPO_LOGICO"), or, DiagramapseudocodigoPackage.Literals.OR__SIGNO_OP);
				}
			}
			else if(operacionCompleta.getValor_operacion() instanceof And) {
				And and = (And) operacionCompleta.getValor_operacion();
				if(!(funciones.checkOperacionLogica(and))) {
					error(readerMessages.getBundle().getString("EXPRESION_TIPO_LOGICO"), and, DiagramapseudocodigoPackage.Literals.AND__SIGNO_OP);
				}
			}
			else if(operacionCompleta.getValor_operacion() instanceof Comparacion) {
				Comparacion comp = (Comparacion) operacionCompleta.getValor_operacion();
				if(!(funciones.checkOperacionLogica(comp))) {
					error(readerMessages.getBundle().getString("EXPRESION_TIPO_LOGICO"), comp, DiagramapseudocodigoPackage.Literals.COMPARACION__SIGNO_OP);
				}
			}
			else if(operacionCompleta.getValor_operacion() instanceof Igualdad) {
				Igualdad igualdad = (Igualdad) operacionCompleta.getValor_operacion();
				if(!(funciones.checkOperacionLogica(igualdad))) {
					error(readerMessages.getBundle().getString("EXPRESION_TIPO_LOGICO"), igualdad, DiagramapseudocodigoPackage.Literals.IGUALDAD__SIGNO_OP);
				}
			} else if(operacionCompleta.getValor_operacion() instanceof Entero) {
				Entero entero = (Entero) operacionCompleta.getValor_operacion();
				error(readerMessages.getBundle().getString("EXPRESION_TIPO_LOGICO"), entero, DiagramapseudocodigoPackage.Literals.ENTERO__VALOR);
			} else if(operacionCompleta.getValor_operacion() instanceof Real) {
				Real real = (Real) operacionCompleta.getValor_operacion();
				error(readerMessages.getBundle().getString("EXPRESION_TIPO_LOGICO"), real, DiagramapseudocodigoPackage.Literals.REAL__VALOR);
			} else if(operacionCompleta.getValor_operacion() instanceof CadenaCaracteres) {
				CadenaCaracteres cadena = (CadenaCaracteres) operacionCompleta.getValor_operacion();
				error(readerMessages.getBundle().getString("EXPRESION_TIPO_LOGICO"), cadena, DiagramapseudocodigoPackage.Literals.CADENA_CARACTERES__VALOR);
			} else if(operacionCompleta.getValor_operacion() instanceof Caracter) {
				Caracter caracter = (Caracter) operacionCompleta.getValor_operacion();
				error(readerMessages.getBundle().getString("EXPRESION_TIPO_LOGICO"), caracter, DiagramapseudocodigoPackage.Literals.CARACTER__VALOR);
			} else if(operacionCompleta.getValor_operacion() instanceof VariableID) {
				VariableID variable = (VariableID) operacionCompleta.getValor_operacion();
				if(variables.containsKey(variable.getNombre())) {
					if(!variables.get(variable.getNombre()).equals(readerMessages.getBundle().getString("TIPO_LOGICO"))) {
						error(readerMessages.getBundle().getString("EXPRESION_TIPO_LOGICO"), variable, DiagramapseudocodigoPackage.Literals.VARIABLE_ID__NOMBRE);
					}
				}
			} else if(operacionCompleta.getValor_operacion() instanceof LlamadaFuncion) {
				LlamadaFuncion llamada = (LlamadaFuncion) operacionCompleta.getValor_operacion();
				if(funcionesTipadas.containsKey(llamada.getNombre()) && funcionesTipadas.get(llamada.getNombre()).containsKey(llamada.getParametros().size())) {
					if(!funcionesTipadas.get(llamada.getNombre()).get(llamada.getParametros().size()).equals(readerMessages.getBundle().getString("TIPO_LOGICO"))) {
						error(readerMessages.getBundle().getString("EXPRESION_TIPO_LOGICO"), llamada, DiagramapseudocodigoPackage.Literals.LLAMADA_FUNCION__NOMBRE);
					}
				}
			} else if(operacionCompleta.getValor_operacion() instanceof ValorRegistro) {
				ValorRegistro vr = (ValorRegistro) operacionCompleta.getValor_operacion();
				for(String nombre: nombresRegistros) {
					if(nombre.equals(variables.get(vr.getNombre_registro()))) {
						if(!(registros.get(nombre).get(vr.getCampos().get(0).getNombre_campo()).equals(readerMessages.getBundle().getString("TIPO_LOGICO")))) {
							error(readerMessages.getBundle().getString("EXPRESION_TIPO_LOGICO"), vr, DiagramapseudocodigoPackage.Literals.VALOR_REGISTRO__NOMBRE_REGISTRO);
						}
					}
				}
			} else if(operacionCompleta.getValor_operacion() instanceof ValorVector) {
				ValorVector v = (ValorVector) operacionCompleta.getValor_operacion();
				if(!(vectores.get(variables.get(v.getNombre_vector())).equals(readerMessages.getBundle().getString("TIPO_LOGICO")))) {
					error(readerMessages.getBundle().getString("EXPRESION_TIPO_LOGICO"), v, DiagramapseudocodigoPackage.Literals.VALOR_VECTOR__NOMBRE_VECTOR);
				}
			} else if(operacionCompleta.getValor_operacion() instanceof ValorMatriz) {
				ValorMatriz m = (ValorMatriz) operacionCompleta.getValor_operacion();
				if(!(matrices.get(variables.get(m.getNombre_matriz())).equals(readerMessages.getBundle().getString("TIPO_LOGICO")))) {
					error(readerMessages.getBundle().getString("EXPRESION_TIPO_LOGICO"), m, DiagramapseudocodigoPackage.Literals.VALOR_MATRIZ__NOMBRE_MATRIZ);
				}
			} else if(operacionCompleta.getValor_operacion() instanceof FuncionInterna) {
				FuncionInterna interna = (FuncionInterna) operacionCompleta.getValor_operacion();
				error(readerMessages.getBundle().getString("EXPRESION_TIPO_LOGICO"), interna, DiagramapseudocodigoPackage.Literals.FUNCION_INTERNA__NOMBRE);
			}
		}
	}
	
	/*
	 * Función auxiliar de check(Bloque) // Principio DRY (2).
	 */
	private void checkAux_valorEntero(Desde desde, Operacion operacion, Map<String, String> variables, Map<String,HashMap<Integer,String>> funcionesTipadas, Map<String,HashMap<String,String>> registros, List<String> nombresRegistros, Map<String, String> vectores, Map<String, String> matrices) {
		final int ERROR = 3;
		int check = funciones.checkValoresAsignacion(readerMessages.getBundle().getString("TIPO_ENTERO"), operacion, variables, registros, nombresRegistros, funcionesTipadas, vectores, matrices, readerMessages);
		
		if(check == ERROR) {
			error(readerMessages.getBundle().getString("TOPE_DESDE_ENTERO"), desde, DiagramapseudocodigoPackage.Literals.BLOQUE__CONDICION);
		}
	}
	
	/* 5) */ @Check /* -------------------------------------------------------------------------------------------------------------- */
	/**
	 * Función que se encarga de comprobar que las funciones se llamen con parámetros del tipo adecuado y número, y además hayan sido definidas con anterioridad.
	 * @param llamadaFuncion
	 */
	protected void check(LlamadaFuncion llamadaFuncion) {
		Algoritmo algoritmo = EcoreUtil2.getContainerOfType(llamadaFuncion, Algoritmo.class);
		Modulo modulo = EcoreUtil2.getContainerOfType(llamadaFuncion, Modulo.class);
		Subproceso subproceso =  EcoreUtil2.getContainerOfType(llamadaFuncion, Subproceso.class);
		
		if(algoritmo != null && subproceso == null) {
			Map<String,String> tiposVectoresMatrices = funciones.getVectoresTipados(algoritmo.getComplejos(), algoritmo.getImportaciones());
			tiposVectoresMatrices.putAll(funciones.getMatricesTipadas(algoritmo.getComplejos(), algoritmo.getImportaciones()));
			Map<String,HashMap<String,String>> tiposRegistros = funciones.getRegistrosTipados(algoritmo.getComplejos(), algoritmo.getImportaciones());
			Map<String,String> variablesDefinidas = funciones.getVariablesDefinidasTipadas(algoritmo.getInicio().getDeclaraciones(), null, algoritmo.getGlobales(), algoritmo.getImportaciones());
			variablesDefinidas.putAll(funciones.getConstantesTipadas(algoritmo.getConstantes(), algoritmo.getImportaciones(), readerMessages));
			List<Subproceso> subprocesosTotales = funciones.getSubprocesosExportados(algoritmo.getImportaciones());
			subprocesosTotales.addAll(algoritmo.getSubprocesos());
			Map<String, ArrayList<Integer>> subprocesosParametros = funciones.getSubprocesosNumeroParametros(algoritmo.getSubprocesos(), algoritmo.getImportaciones());
			checkAux(llamadaFuncion, subprocesosTotales, variablesDefinidas, tiposVectoresMatrices, tiposRegistros, subprocesosParametros);
		} else if(algoritmo != null && subproceso != null) {
			Map<String,String> tiposVectoresMatrices = funciones.getVectoresTipados(algoritmo.getComplejos(), algoritmo.getImportaciones());
			tiposVectoresMatrices.putAll(funciones.getMatricesTipadas(algoritmo.getComplejos(), algoritmo.getImportaciones()));
			Map<String,HashMap<String,String>> tiposRegistros = funciones.getRegistrosTipados(algoritmo.getComplejos(), algoritmo.getImportaciones());
			Map<String,String> variablesDefinidas = funciones.getVariablesDefinidasTipadas(subproceso.getDeclaraciones(), subproceso.getParametros(), algoritmo.getGlobales(), algoritmo.getImportaciones());
			variablesDefinidas.putAll(funciones.getConstantesTipadas(algoritmo.getConstantes(), algoritmo.getImportaciones(), readerMessages));
			List<Subproceso> subprocesosTotales = funciones.getSubprocesosExportados(algoritmo.getImportaciones());
			subprocesosTotales.addAll(algoritmo.getSubprocesos());
			Map<String, ArrayList<Integer>> subprocesosParametros = funciones.getSubprocesosNumeroParametros(algoritmo.getSubprocesos(), algoritmo.getImportaciones());
			checkAux(llamadaFuncion, subprocesosTotales, variablesDefinidas, tiposVectoresMatrices, tiposRegistros, subprocesosParametros);
		} else {
			Map<String,String> tiposVectoresMatrices = funciones.getVectoresTipados(modulo.getImplementacion().getComplejos(), modulo.getImportaciones());
			tiposVectoresMatrices.putAll(funciones.getMatricesTipadas(modulo.getImplementacion().getComplejos(), modulo.getImportaciones()));
			Map<String,HashMap<String,String>> tiposRegistros = funciones.getRegistrosTipados(modulo.getImplementacion().getComplejos(), modulo.getImportaciones());
			Map<String,String> variablesDefinidas = funciones.getVariablesDefinidasTipadas(subproceso.getDeclaraciones(), subproceso.getParametros(), modulo.getImplementacion().getGlobales(), modulo.getImportaciones());
			variablesDefinidas.putAll(funciones.getConstantesTipadas(modulo.getImplementacion().getConstantes(), modulo.getImportaciones(), readerMessages));
			List<Subproceso> subprocesosTotales = funciones.getSubprocesosExportados(modulo.getImportaciones());
			subprocesosTotales.addAll(modulo.getImplementacion().getSubprocesos());
			Map<String, ArrayList<Integer>> subprocesosParametros = funciones.getSubprocesosNumeroParametros(modulo.getImplementacion().getSubprocesos(), modulo.getImportaciones());
			checkAux(llamadaFuncion, subprocesosTotales, variablesDefinidas, tiposVectoresMatrices, tiposRegistros, subprocesosParametros);
		} 
	}
	
	/*
	 * Función auxiliar de check(LlamadaFuncion) // Principio DRY.
	 */
	private void checkAux(LlamadaFuncion llamadaFuncion, List<Subproceso> subprocesos, Map<String,String> variables, Map<String,String> tiposVectoresMatrices, Map<String,HashMap<String,String>> tiposRegistros, Map<String, ArrayList<Integer>> subprocesosParametros) {
		for(Subproceso s: subprocesos) {
			List<String> tiposCabecera = funciones.getTiposCabeceraSubproceso(s.getParametros());
			String nombre = s.getNombre();
			int parametros = s.getParametros().size();
			if(llamadaFuncion.getNombre().equals(nombre) && llamadaFuncion.getParametros().size() == parametros) {
				List<String> nombresVariables = new ArrayList<String>();
				Map<String,String> nombresVariablesCampos = new HashMap<String,String>();
				List<String> tiposNativos = new ArrayList<String>();
				List<String> nombresValoresComplejos = new ArrayList<String>();
				funciones.getParametrosOperacion(llamadaFuncion.getParametros(), nombresVariables, nombresVariablesCampos, tiposNativos, variables, tiposVectoresMatrices, tiposRegistros, nombresValoresComplejos, readerMessages);
				String salidaBuena = "";
				String salidaMala = "";
				if(tiposCabecera.size() > 0) {
					salidaBuena = funciones.getSalidaTiposCorrectos(tiposCabecera);
					salidaMala = funciones.getSalidaTiposReales(nombresVariables, variables, tiposVectoresMatrices, tiposRegistros, nombresVariablesCampos, tiposNativos, nombresValoresComplejos);
				}
				if(!salidaBuena.equals(salidaMala)) {
					error(readerMessages.getString("TIPOS_LLAMADA", nombre, salidaMala, salidaBuena), llamadaFuncion, DiagramapseudocodigoPackage.Literals.LLAMADA_FUNCION__NOMBRE);
				} 
			} else if(!subprocesosParametros.containsKey(llamadaFuncion.getNombre()) && !variables.containsKey(llamadaFuncion.getNombre().replace("(", ""))) {
				error(readerMessages.getString("FUNCION_NO_DECLARADA", llamadaFuncion.getNombre().replace("(", "")), llamadaFuncion, DiagramapseudocodigoPackage.Literals.LLAMADA_FUNCION__NOMBRE);
			} else if(!subprocesosParametros.get(llamadaFuncion.getNombre()).contains(llamadaFuncion.getParametros().size())) { //Mostramos el primero por defecto.
				error(readerMessages.getString("FUNCION_NUMERO_PARAMETROS", subprocesosParametros.get(llamadaFuncion.getNombre()).get(0)), llamadaFuncion, DiagramapseudocodigoPackage.Literals.LLAMADA_FUNCION__NOMBRE);
			}
		}
		/*if(subprocesos.isEmpty()) {
			error(readerMessages.getString("FUNCION_NO_DECLARADA", llamadaFuncion.getNombre().replace("(", "")), llamadaFuncion, DiagramapseudocodigoPackage.Literals.LLAMADA_FUNCION__NOMBRE);
		}*/
	}
	
	/* 6) */ @Check /* -------------------------------------------------------------------------------------------------------------- */
	/**
	 * Función que se encarga de comprobar que al menos uno de los dos operadores utilizados en la división real sea de tipo real.
	 * @param divisionReal
	 */
	protected void check(DivisionReal divisionReal) {
		Algoritmo algoritmo = EcoreUtil2.getContainerOfType(divisionReal, Algoritmo.class);
		Modulo modulo = EcoreUtil2.getContainerOfType(divisionReal, Modulo.class);
		Subproceso subproceso =  EcoreUtil2.getContainerOfType(divisionReal, Subproceso.class);
		
		if(algoritmo != null && subproceso == null) {
			Map<String, String> variablesDefinidas = funciones.getVariablesDefinidasTipadas(algoritmo.getInicio().getDeclaraciones(), null, algoritmo.getGlobales(), algoritmo.getImportaciones());
			variablesDefinidas.putAll(funciones.getConstantesTipadas(algoritmo.getConstantes(), algoritmo.getImportaciones(), readerMessages));
			checkAux(divisionReal, variablesDefinidas);
		} else if(algoritmo != null && subproceso != null) {
			Map<String, String> variablesDefinidas = funciones.getVariablesDefinidasTipadas(subproceso.getDeclaraciones(), subproceso.getParametros(), algoritmo.getGlobales(), algoritmo.getImportaciones());
			variablesDefinidas.putAll(funciones.getConstantesTipadas(algoritmo.getConstantes(), algoritmo.getImportaciones(), readerMessages));
			checkAux(divisionReal, variablesDefinidas);
		} else {
			Map<String, String> variablesDefinidas = funciones.getVariablesDefinidasTipadas(subproceso.getDeclaraciones(), subproceso.getParametros(), modulo.getImplementacion().getGlobales(), modulo.getImportaciones());
			variablesDefinidas.putAll(funciones.getConstantesTipadas(modulo.getImplementacion().getConstantes(), modulo.getImportaciones(), readerMessages));
			checkAux(divisionReal, variablesDefinidas);
		} 
	}
	
	/*
	 * Función auxiliar de check(DivisionReal) // Principio DRY.
	 */
	private void checkAux(DivisionReal divisionReal, Map<String, String> variables) {
		if(divisionReal.getLeft() instanceof Entero && divisionReal.getRight() instanceof Entero) {
			error(readerMessages.getString("DIV_REAL"), divisionReal, DiagramapseudocodigoPackage.Literals.DIVISION_REAL__SIGNO_OP);
		}
		else if(divisionReal.getLeft() instanceof VariableID && divisionReal.getRight() instanceof VariableID) {
			VariableID left = (VariableID) divisionReal.getLeft();
			VariableID right = (VariableID) divisionReal.getRight();
			if(variables.get(left.getNombre()).equals(readerMessages.getString("TIPO_ENTERO")) && variables.get(right.getNombre()).equals(readerMessages.getString("TIPO_ENTERO"))) {
				error(readerMessages.getString("DIV_REAL"), divisionReal, DiagramapseudocodigoPackage.Literals.DIVISION_REAL__SIGNO_OP);
			}
		}
		else if(divisionReal.getLeft() instanceof VariableID && divisionReal.getRight() instanceof Entero) {
			VariableID left = (VariableID) divisionReal.getLeft();
			if(variables.get(left.getNombre()).equals(readerMessages.getString("TIPO_ENTERO"))) {
				error(readerMessages.getString("DIV_REAL"), divisionReal, DiagramapseudocodigoPackage.Literals.DIVISION_REAL__SIGNO_OP);
			}
		}
		else if(divisionReal.getLeft() instanceof Entero && divisionReal.getRight() instanceof VariableID) {
			VariableID right = (VariableID) divisionReal.getRight();
			if(variables.get(right.getNombre()).equals(readerMessages.getString("TIPO_ENTERO"))) {
				error(readerMessages.getString("DIV_REAL"), divisionReal, DiagramapseudocodigoPackage.Literals.DIVISION_REAL__SIGNO_OP);
			}
		}
		else if(divisionReal.getLeft() instanceof Suma || divisionReal.getLeft() instanceof Resta || divisionReal.getLeft() instanceof Multiplicacion ||
				divisionReal.getLeft() instanceof DivisionEntera || divisionReal.getLeft() instanceof DivisionReal || divisionReal.getLeft() instanceof OperacionParentesis) {
			ArrayList<Valor> valoresOperacion = funciones.getValoresOperacion(divisionReal.getLeft());
			int cuentaReales = 0;
			
			for(Valor v: valoresOperacion) {
				if(v instanceof Real) {
					cuentaReales += 1;
				}
				else if(v instanceof VariableID) {
					VariableID var = (VariableID) v;
					if(variables.get(var.getNombre()).equals(readerMessages.getString("TIPO_REAL"))) {
						cuentaReales += 1;
					}
				}
			}	
			if(cuentaReales == 0) {
				error(readerMessages.getString("DIV_REAL"), divisionReal, DiagramapseudocodigoPackage.Literals.DIVISION_REAL__SIGNO_OP);
			}
		}
		else if(divisionReal.getRight() instanceof Suma || divisionReal.getRight() instanceof Resta || divisionReal.getRight() instanceof Multiplicacion || 
				divisionReal.getRight() instanceof DivisionEntera || divisionReal.getRight() instanceof DivisionReal || divisionReal.getRight() instanceof OperacionParentesis) {
			ArrayList<Valor> valoresOperacion = funciones.getValoresOperacion(divisionReal.getRight());
			int cuentaReales = 0;
			
			for(Valor v: valoresOperacion) {
				if(v instanceof Real) {
					cuentaReales += 1;
				}
				else if(v instanceof VariableID) {
					VariableID var = (VariableID) v;
					if(variables.get(var.getNombre()).equals(readerMessages.getString("TIPO_REAL"))) {
						cuentaReales += 1;
					}
				}
			}	
			if(cuentaReales == 0) {
				error(readerMessages.getString("DIV_REAL"), divisionReal, DiagramapseudocodigoPackage.Literals.DIVISION_REAL__SIGNO_OP);
			}
		}
	}
	
	/* 7) */ @Check /* -------------------------------------------------------------------------------------------------------------- */
	/**
	 * Función que se encarga de comprobar que todos los operadores utilizados en la división entera sean de tipo entero.
	 * @param divisionEntera
	 */
	protected void check(DivisionEntera divisionEntera) {
		Algoritmo algoritmo = EcoreUtil2.getContainerOfType(divisionEntera, Algoritmo.class);
		Modulo modulo = EcoreUtil2.getContainerOfType(divisionEntera, Modulo.class);
		Subproceso subproceso =  EcoreUtil2.getContainerOfType(divisionEntera, Subproceso.class);
		
		if(algoritmo != null && subproceso == null) {
			Map<String,String> variablesDefinidas = funciones.getVariablesDefinidasTipadas(algoritmo.getInicio().getDeclaraciones(), null, algoritmo.getGlobales(), algoritmo.getImportaciones());
			variablesDefinidas.putAll(funciones.getConstantesTipadas(algoritmo.getConstantes(), algoritmo.getImportaciones(), readerMessages));
			checkAux(divisionEntera, variablesDefinidas);
		} else if(algoritmo != null && subproceso != null) {
			Map<String,String> variablesDefinidas = funciones.getVariablesDefinidasTipadas(subproceso.getDeclaraciones(), subproceso.getParametros(), algoritmo.getGlobales(), algoritmo.getImportaciones());
			variablesDefinidas.putAll(funciones.getConstantesTipadas(algoritmo.getConstantes(), algoritmo.getImportaciones(), readerMessages));
			checkAux(divisionEntera, variablesDefinidas);
		} else {
			Map<String,String> variablesDefinidas = funciones.getVariablesDefinidasTipadas(subproceso.getDeclaraciones(), subproceso.getParametros(), modulo.getImplementacion().getGlobales(), modulo.getImportaciones());
			variablesDefinidas.putAll(funciones.getConstantesTipadas(modulo.getImplementacion().getConstantes(), modulo.getImportaciones(), readerMessages));
			checkAux(divisionEntera, variablesDefinidas);
		}
	}
	
	/*
	 * Función auxiliar de check(DivisionEntera) // Principio DRY.
	 */
	private void checkAux(DivisionEntera divisionEntera, Map<String, String> variables) {
		if((!(divisionEntera.getLeft() instanceof Entero) || !(divisionEntera.getRight() instanceof Entero)) && (!(divisionEntera.getLeft() instanceof VariableID) && !(divisionEntera.getRight() instanceof VariableID))
				&& (!(divisionEntera.getLeft() instanceof OperacionParentesis) && !(divisionEntera.getRight() instanceof OperacionParentesis))) {
			error(readerMessages.getString("DIV_ENTERA"), divisionEntera, DiagramapseudocodigoPackage.Literals.DIVISION_ENTERA__SIGNO_OP);
		}
		else if(divisionEntera.getLeft() instanceof Real || divisionEntera.getRight() instanceof Real) {
			error(readerMessages.getString("DIV_ENTERA"), divisionEntera, DiagramapseudocodigoPackage.Literals.DIVISION_ENTERA__SIGNO_OP);
		}
		else if(divisionEntera.getLeft() instanceof VariableID && divisionEntera.getRight() instanceof VariableID) {
			VariableID left = (VariableID) divisionEntera.getLeft();
			VariableID right = (VariableID) divisionEntera.getRight();
			if(!(variables.get(left.getNombre()).equals(readerMessages.getString("TIPO_ENTERO"))) || !(variables.get(right.getNombre()).equals(readerMessages.getString("TIPO_ENTERO")))) {
				error(readerMessages.getString("DIV_ENTERA"), divisionEntera, DiagramapseudocodigoPackage.Literals.DIVISION_ENTERA__SIGNO_OP);
			}
		}
		else if(divisionEntera.getLeft() instanceof VariableID && divisionEntera.getRight() instanceof Entero) {
			VariableID left = (VariableID) divisionEntera.getLeft();
			if(!variables.get(left.getNombre()).equals(readerMessages.getString("TIPO_ENTERO"))) {
				error(readerMessages.getString("DIV_ENTERA"), divisionEntera, DiagramapseudocodigoPackage.Literals.DIVISION_ENTERA__SIGNO_OP);
			}
		}
		else if(divisionEntera.getLeft() instanceof Entero && divisionEntera.getRight() instanceof VariableID) {
			VariableID right = (VariableID) divisionEntera.getRight();
			if(!variables.get(right.getNombre()).equals(readerMessages.getString("TIPO_ENTERO"))) {
				error(readerMessages.getString("DIV_ENTERA"), divisionEntera, DiagramapseudocodigoPackage.Literals.DIVISION_ENTERA__SIGNO_OP);
			}
		}
		else if(divisionEntera.getLeft() instanceof Suma || divisionEntera.getLeft() instanceof Resta || divisionEntera.getLeft() instanceof Multiplicacion ||
				divisionEntera.getLeft() instanceof DivisionEntera || divisionEntera.getLeft() instanceof DivisionReal || divisionEntera.getLeft() instanceof OperacionParentesis) {
			ArrayList<Valor> valoresOperacion = funciones.getValoresOperacion(divisionEntera.getLeft());
			int cuentaReales = 0;
			
			for(Valor v: valoresOperacion) {
				if(v instanceof Real) {
					cuentaReales += 1;
				}
				else if(v instanceof VariableID) {
					VariableID var = (VariableID) v;
					if(variables.get(var.getNombre()).equals(readerMessages.getString("TIPO_REAL"))) {
						cuentaReales += 1;
					}
				}
			}	
			if(cuentaReales > 0) {
				error(readerMessages.getString("DIV_ENTERA"), divisionEntera, DiagramapseudocodigoPackage.Literals.DIVISION_ENTERA__SIGNO_OP);
			}
		}
		else if(divisionEntera.getRight() instanceof Suma || divisionEntera.getRight() instanceof Resta || divisionEntera.getRight() instanceof Multiplicacion || 
				divisionEntera.getRight() instanceof DivisionEntera || divisionEntera.getRight() instanceof DivisionReal || divisionEntera.getRight() instanceof OperacionParentesis) {
			ArrayList<Valor> valoresOperacion = funciones.getValoresOperacion(divisionEntera.getRight());
			int cuentaReales = 0;
			
			for(Valor v: valoresOperacion) {
				if(v instanceof Real) {
					cuentaReales += 1;
				}
				else if(v instanceof VariableID) {
					VariableID var = (VariableID) v;
					if(variables.get(var.getNombre()).equals(readerMessages.getString("TIPO_REAL"))) {
						cuentaReales += 1;
					}
				}
			}	
			if(cuentaReales > 0) {
				error(readerMessages.getString("DIV_ENTERA"), divisionEntera, DiagramapseudocodigoPackage.Literals.DIVISION_ENTERA__SIGNO_OP);
			}
		}
	}
	
	/* 8) */ @Check /* -------------------------------------------------------------------------------------------------------------- */
	/**
	 * Función encargada de comprobar que todos los operadores utilizados en la operación modulo sean de tipo entero.
	 * @param moduloOp
	 */
	protected void check(Mod moduloOp) {
		Algoritmo algoritmo = EcoreUtil2.getContainerOfType(moduloOp, Algoritmo.class);
		Modulo modulo = EcoreUtil2.getContainerOfType(moduloOp, Modulo.class);
		Subproceso subproceso =  EcoreUtil2.getContainerOfType(moduloOp, Subproceso.class);
		
		if(algoritmo != null && subproceso == null) {
			Map<String,String> variablesDefinidas = funciones.getVariablesDefinidasTipadas(algoritmo.getInicio().getDeclaraciones(), null, algoritmo.getGlobales(), algoritmo.getImportaciones());
			variablesDefinidas.putAll(funciones.getConstantesTipadas(algoritmo.getConstantes(), algoritmo.getImportaciones(), readerMessages));
			checkAux(moduloOp, variablesDefinidas);
		} else if(algoritmo != null && subproceso != null) {
			Map<String,String> variablesDefinidas = funciones.getVariablesDefinidasTipadas(subproceso.getDeclaraciones(), subproceso.getParametros(), algoritmo.getGlobales(), algoritmo.getImportaciones());
			variablesDefinidas.putAll(funciones.getConstantesTipadas(algoritmo.getConstantes(), algoritmo.getImportaciones(), readerMessages));
			checkAux(moduloOp, variablesDefinidas);
		} else {
			Map<String,String> variablesDefinidas = funciones.getVariablesDefinidasTipadas(subproceso.getDeclaraciones(), subproceso.getParametros(), modulo.getImplementacion().getGlobales(), modulo.getImportaciones());
			variablesDefinidas.putAll(funciones.getConstantesTipadas(modulo.getImplementacion().getConstantes(), modulo.getImportaciones(), readerMessages));
			checkAux(moduloOp, variablesDefinidas);
		}
	}
	
	/*
	 * Función auxiliar de check(ModuloOp) // Principio DRY.
	 */
	private void checkAux(Mod moduloOp, Map<String, String> variables) {
		if((!(moduloOp.getLeft() instanceof Entero) || !(moduloOp.getRight() instanceof Entero)) && (!(moduloOp.getLeft() instanceof VariableID) && !(moduloOp.getRight() instanceof VariableID))
				&& (!(moduloOp.getLeft() instanceof OperacionParentesis) && !(moduloOp.getRight() instanceof OperacionParentesis))) {
			error(readerMessages.getString("MOD"), moduloOp, DiagramapseudocodigoPackage.Literals.MOD__SIGNO_OP);
		}
		else if(moduloOp.getLeft() instanceof Real || moduloOp.getRight() instanceof Real) {
			error(readerMessages.getString("MOD"), moduloOp, DiagramapseudocodigoPackage.Literals.MOD__SIGNO_OP);
		}
		else if(moduloOp.getLeft() instanceof VariableID && moduloOp.getRight() instanceof VariableID) {
			VariableID left = (VariableID) moduloOp.getLeft();
			VariableID right = (VariableID) moduloOp.getRight();
			if(!(variables.get(left.getNombre()).equals(readerMessages.getString("TIPO_ENTERO"))) || !(variables.get(right.getNombre()).equals(readerMessages.getString("TIPO_ENTERO")))) {
				error(readerMessages.getString("MOD"), moduloOp, DiagramapseudocodigoPackage.Literals.MOD__SIGNO_OP);
			}
		}
		else if(moduloOp.getLeft() instanceof VariableID && moduloOp.getRight() instanceof Entero) {
			VariableID left = (VariableID) moduloOp.getLeft();
			if(!variables.get(left.getNombre()).equals(readerMessages.getString("TIPO_ENTERO"))) {
				error(readerMessages.getString("MOD"), moduloOp, DiagramapseudocodigoPackage.Literals.MOD__SIGNO_OP);
			}
		}
		else if(moduloOp.getLeft() instanceof Entero && moduloOp.getRight() instanceof VariableID) {
			VariableID right = (VariableID) moduloOp.getRight();
			if(!variables.get(right.getNombre()).equals(readerMessages.getString("TIPO_ENTERO"))) {
				error(readerMessages.getString("MOD"), moduloOp, DiagramapseudocodigoPackage.Literals.MOD__SIGNO_OP);
			}
		}
		else if(moduloOp.getLeft() instanceof Suma || moduloOp.getLeft() instanceof Resta || moduloOp.getLeft() instanceof Multiplicacion || 
				moduloOp.getLeft() instanceof DivisionEntera || moduloOp.getLeft() instanceof DivisionReal || moduloOp.getLeft() instanceof OperacionParentesis) {
			ArrayList<Valor> valoresOperacion = funciones.getValoresOperacion(moduloOp.getLeft());
			int cuentaReales = 0;
			
			for(Valor v: valoresOperacion) {
				if(v instanceof Real) {
					cuentaReales += 1;
				}
				else if(v instanceof VariableID) {
					VariableID var = (VariableID) v;
					if(variables.get(var.getNombre()).equals(readerMessages.getString("TIPO_REAL"))) {
						cuentaReales += 1;
					}
				}
			}	
			if(cuentaReales > 0) {
				error(readerMessages.getString("MOD"), moduloOp, DiagramapseudocodigoPackage.Literals.MOD__SIGNO_OP);
			}
		}
		else if(moduloOp.getRight() instanceof Suma || moduloOp.getRight() instanceof Resta || moduloOp.getRight() instanceof Multiplicacion || 
				moduloOp.getRight() instanceof DivisionEntera || moduloOp.getRight() instanceof DivisionReal || moduloOp.getRight() instanceof OperacionParentesis) {
			ArrayList<Valor> valoresOperacion = funciones.getValoresOperacion(moduloOp.getRight());
			int cuentaReales = 0;
			
			for(Valor v: valoresOperacion) {
				if(v instanceof Real) {
					cuentaReales += 1;
				}
				else if(v instanceof VariableID) {
					VariableID var = (VariableID) v;
					if(variables.get(var.getNombre()).equals(readerMessages.getString("TIPO_REAL"))) {
						cuentaReales += 1;
					}
				}
			}	
			if(cuentaReales > 0) {
				error(readerMessages.getString("MOD"), moduloOp, DiagramapseudocodigoPackage.Literals.MOD__SIGNO_OP);
			}
		}
	}
	
	/* 9) */ @Check /* -------------------------------------------------------------------------------------------------------------- */
	/**
	 * Función que se encarga de comprobar que la variable utilizada en la funcion abrir sea de tipo fichero.
	 * @param funcionFicheroAbrir
	 */
	protected void check(FuncionFicheroAbrir funcionFicheroAbrir) {
		Algoritmo algoritmo = EcoreUtil2.getContainerOfType(funcionFicheroAbrir, Algoritmo.class);
		Modulo modulo = EcoreUtil2.getContainerOfType(funcionFicheroAbrir, Modulo.class);
		Subproceso subproceso =  EcoreUtil2.getContainerOfType(funcionFicheroAbrir, Subproceso.class);
		
		if(algoritmo != null && subproceso == null) {
			List<String> nombresFicheros = funciones.getNombresFicherosDefinidos(algoritmo.getComplejos(), algoritmo.getImportaciones());
			Map<String,String> variablesDefinidas = funciones.getVariablesDefinidasTipadas(algoritmo.getInicio().getDeclaraciones(), null, algoritmo.getGlobales(), algoritmo.getImportaciones());
			variablesDefinidas.putAll(funciones.getConstantesTipadas(algoritmo.getConstantes(), algoritmo.getImportaciones(), readerMessages));
			checkAux(funcionFicheroAbrir, nombresFicheros, variablesDefinidas);
		} else if(algoritmo != null && subproceso != null) {
			List<String> nombresFicheros = funciones.getNombresFicherosDefinidos(algoritmo.getComplejos(), algoritmo.getImportaciones());
			Map<String,String> variablesDefinidas = funciones.getVariablesDefinidasTipadas(subproceso.getDeclaraciones(), subproceso.getParametros(), algoritmo.getGlobales(), algoritmo.getImportaciones());
			variablesDefinidas.putAll(funciones.getConstantesTipadas(algoritmo.getConstantes(), algoritmo.getImportaciones(), readerMessages));
			checkAux(funcionFicheroAbrir, nombresFicheros, variablesDefinidas);
		} else {
			List<String> nombresFicheros = funciones.getNombresFicherosDefinidos(modulo.getImplementacion().getComplejos(), modulo.getImportaciones());
			Map<String,String> variablesDefinidas = funciones.getVariablesDefinidasTipadas(subproceso.getDeclaraciones(), subproceso.getParametros(), modulo.getImplementacion().getGlobales(), modulo.getImportaciones());
			variablesDefinidas.putAll(funciones.getConstantesTipadas(modulo.getImplementacion().getConstantes(), modulo.getImportaciones(), readerMessages));
			checkAux(funcionFicheroAbrir, nombresFicheros, variablesDefinidas);
		}
	}
	
	/*
	 * Función auxiliar de check(FuncionFicheroAbrir) // Principio DRY.
	 */
	private void checkAux(FuncionFicheroAbrir funcionFicheroAbrir, List<String> nombresFicheros, Map<String,String> variables) {
		if(funcionFicheroAbrir.getVariable().get(0) instanceof VariableID) {
			VariableID v = (VariableID) funcionFicheroAbrir.getVariable().get(0);
			//Check variable usada de tipo fichero
			if(!nombresFicheros.contains(variables.get(v.getNombre()))) {
				System.out.println("El tipo que busca es: " + variables.get(v.getNombre()));
				error(readerMessages.getString("VARIABLE_TIPO_ARCHIVO", v.getNombre()), funcionFicheroAbrir, DiagramapseudocodigoPackage.Literals.FUNCION_FICHERO_ABRIR__VARIABLE, 0);
			}
			//Check segundo parámetro de tipo cadena
			if(funcionFicheroAbrir.getVariable().size() == 2 && funcionFicheroAbrir.getVariable().get(1) instanceof VariableID) {
				v = (VariableID) funcionFicheroAbrir.getVariable().get(1);
				if(variables.get(v.getNombre()) != readerMessages.getBundle().getString("TIPO_CADENA") && variables.get(v.getNombre()) != readerMessages.getBundle().getString("TIPO_CARACTER")) {
					error(readerMessages.getString("VARIABLE_TIPO_CADENA", v.getNombre()), funcionFicheroAbrir, DiagramapseudocodigoPackage.Literals.FUNCION_FICHERO_ABRIR__VARIABLE, 1);
				}
			}
			else if(!(funcionFicheroAbrir.getVariable().get(1) instanceof CadenaCaracteres) && !(funcionFicheroAbrir.getVariable().get(1) instanceof Caracter)) {
				error(readerMessages.getBundle().getString("ENTRADA_TIPO_CADENA"), funcionFicheroAbrir, DiagramapseudocodigoPackage.Literals.FUNCION_FICHERO_ABRIR__VARIABLE, 1);
			}
		} 
	}
	
	/* 10) */ @Check /* -------------------------------------------------------------------------------------------------------------- */
	/**
	 * Función que se encarga de comprobar que la variable utilizada en la funcion cerrar sea de tipo fichero.
	 * @param funcionFicheroAbrir
	 */
	protected void check(FuncionFicheroCerrar funcionFicheroCerrar) {
		Algoritmo algoritmo = EcoreUtil2.getContainerOfType(funcionFicheroCerrar, Algoritmo.class);
		Modulo modulo = EcoreUtil2.getContainerOfType(funcionFicheroCerrar, Modulo.class);
		Subproceso subproceso =  EcoreUtil2.getContainerOfType(funcionFicheroCerrar, Subproceso.class);
		
		if(algoritmo != null && subproceso == null) {
			List<String> nombresFicheros = funciones.getNombresFicherosDefinidos(algoritmo.getComplejos(), algoritmo.getImportaciones());
			Map<String,String> variablesDefinidas = funciones.getVariablesDefinidasTipadas(algoritmo.getInicio().getDeclaraciones(), null, algoritmo.getGlobales(), algoritmo.getImportaciones());
			variablesDefinidas.putAll(funciones.getConstantesTipadas(algoritmo.getConstantes(), algoritmo.getImportaciones(), readerMessages));
			checkAux(funcionFicheroCerrar, nombresFicheros, variablesDefinidas);
		} else if(algoritmo != null && subproceso != null) {
			List<String> nombresFicheros = funciones.getNombresFicherosDefinidos(algoritmo.getComplejos(), algoritmo.getImportaciones());
			Map<String,String> variablesDefinidas = funciones.getVariablesDefinidasTipadas(subproceso.getDeclaraciones(), subproceso.getParametros(), algoritmo.getGlobales(), algoritmo.getImportaciones());
			variablesDefinidas.putAll(funciones.getConstantesTipadas(algoritmo.getConstantes(), algoritmo.getImportaciones(), readerMessages));
			checkAux(funcionFicheroCerrar, nombresFicheros, variablesDefinidas);
		} else {
			List<String> nombresFicheros = funciones.getNombresFicherosDefinidos(modulo.getImplementacion().getComplejos(), modulo.getImportaciones());
			Map<String,String> variablesDefinidas = funciones.getVariablesDefinidasTipadas(subproceso.getDeclaraciones(), subproceso.getParametros(), modulo.getImplementacion().getGlobales(), modulo.getImportaciones());
			variablesDefinidas.putAll(funciones.getConstantesTipadas(modulo.getImplementacion().getConstantes(), modulo.getImportaciones(), readerMessages));
			checkAux(funcionFicheroCerrar, nombresFicheros, variablesDefinidas);
		}
	}
	
	/*
	 * Función auxiliar de check(FuncionFicheroCerrar) // Principio DRY.
	 */
	private void checkAux(FuncionFicheroCerrar funcionFicheroCerrar, List<String> nombresFicheros, Map<String,String> variables) {
		if(funcionFicheroCerrar.getVariable() instanceof VariableID) {
			VariableID v = (VariableID) funcionFicheroCerrar.getVariable();
			if(!nombresFicheros.contains(variables.get(v.getNombre()))) {
				error(readerMessages.getString("VARIABLE_TIPO_ARCHIVO", v.getNombre()), funcionFicheroCerrar, DiagramapseudocodigoPackage.Literals.FUNCION_FICHERO_CERRAR__VARIABLE);
			}
		}
	}
	
	
	/* 11) */ @Check /* -------------------------------------------------------------------------------------------------------------- */
	/**
	 * Función que se encarga de validar que el tipo de la variable que se quiere asignar sea compatible con el tipo de la variable asignada.
	 * @param asignacion
	 */
	protected void check(Asignacion asignacion) {
		Algoritmo algoritmo = EcoreUtil2.getContainerOfType(asignacion, Algoritmo.class);
		Modulo modulo = EcoreUtil2.getContainerOfType(asignacion, Modulo.class);
		Subproceso subproceso =  EcoreUtil2.getContainerOfType(asignacion, Subproceso.class);
		
		if(algoritmo != null && subproceso == null) {
			Map<String,HashMap<String,String>> registros = funciones.getRegistrosTipados(algoritmo.getComplejos(), algoritmo.getImportaciones());
			Map<String,String> vectores = funciones.getVectoresTipados(algoritmo.getComplejos(), algoritmo.getImportaciones());
			List<String> nombresRegistros = new ArrayList<String>(registros.keySet());
			Map<String,String> matrices = funciones.getMatricesTipadas(algoritmo.getComplejos(), algoritmo.getImportaciones());
			Map<String,String> variablesDefinidas = funciones.getVariablesDefinidasTipadas(algoritmo.getInicio().getDeclaraciones(), null, algoritmo.getGlobales(), algoritmo.getImportaciones());
			variablesDefinidas.putAll(funciones.getConstantesTipadas(algoritmo.getConstantes(), algoritmo.getImportaciones(), readerMessages));
			variablesDefinidas.putAll(funciones.getValoresEnumeradoTipados(algoritmo.getComplejos(), algoritmo.getImportaciones()));
			Map<String,HashMap<Integer,String>> funcionesTipadas = funciones.getFuncionesTipadas(algoritmo.getSubprocesos(), algoritmo.getImportaciones());
			checkAux(asignacion, variablesDefinidas, registros, nombresRegistros, funcionesTipadas, vectores, matrices);
		} else if(algoritmo != null && subproceso != null) {
			Map<String,HashMap<String,String>> registros = funciones.getRegistrosTipados(algoritmo.getComplejos(), algoritmo.getImportaciones());
			Map<String,String> vectores = funciones.getVectoresTipados(algoritmo.getComplejos(), algoritmo.getImportaciones());
			List<String> nombresRegistros = new ArrayList<String>(registros.keySet());
			Map<String,String> matrices = funciones.getMatricesTipadas(algoritmo.getComplejos(), algoritmo.getImportaciones());
			Map<String,String> variablesDefinidas = funciones.getVariablesDefinidasTipadas(subproceso.getDeclaraciones(), subproceso.getParametros(), algoritmo.getGlobales(), algoritmo.getImportaciones());
			variablesDefinidas.putAll(funciones.getConstantesTipadas(algoritmo.getConstantes(), algoritmo.getImportaciones(), readerMessages));
			variablesDefinidas.putAll(funciones.getValoresEnumeradoTipados(algoritmo.getComplejos(), algoritmo.getImportaciones()));
			Map<String,HashMap<Integer,String>> funcionesTipadas = funciones.getFuncionesTipadas(algoritmo.getSubprocesos(), algoritmo.getImportaciones());
			checkAux(asignacion, variablesDefinidas, registros, nombresRegistros, funcionesTipadas, vectores, matrices);
		} else {
			Map<String,HashMap<String,String>> registros = funciones.getRegistrosTipados(modulo.getImplementacion().getComplejos(), modulo.getImportaciones());
			Map<String,String> vectores = funciones.getVectoresTipados(modulo.getImplementacion().getComplejos(), modulo.getImportaciones());
			List<String> nombresRegistros = new ArrayList<String>(registros.keySet());
			Map<String,String> matrices = funciones.getMatricesTipadas(modulo.getImplementacion().getComplejos(), modulo.getImportaciones());
			Map<String,String> variablesDefinidas = funciones.getVariablesDefinidasTipadas(subproceso.getDeclaraciones(), subproceso.getParametros(), modulo.getImplementacion().getGlobales(), modulo.getImportaciones());
			variablesDefinidas.putAll(funciones.getConstantesTipadas(modulo.getImplementacion().getConstantes(), modulo.getImportaciones(), readerMessages));
			variablesDefinidas.putAll(funciones.getValoresEnumeradoTipados(modulo.getImplementacion().getComplejos(), modulo.getImportaciones()));
			Map<String,HashMap<Integer,String>> funcionesTipadas = funciones.getFuncionesTipadas(modulo.getImplementacion().getSubprocesos(), modulo.getImportaciones());
			checkAux(asignacion, variablesDefinidas, registros, nombresRegistros, funcionesTipadas, vectores, matrices);
		}
	}
	
	/*
	 * Función auxiliar de check(Asignacion) // Principio DRY. (1)
	 */
	private void checkAux(Asignacion asignacion, Map<String, String> variables, Map<String,HashMap<String,String>> registros, List<String> nombresRegistros,
			Map<String,HashMap<Integer,String>> funcionesTipadas, Map<String,String> vectores, Map<String,String> matrices) {
		if(asignacion instanceof AsignacionNormal) {
			AsignacionNormal an = (AsignacionNormal) asignacion;
			String tipo = variables.get(an.getValor_asignacion());
			if(an.getOperador() instanceof OperacionCompleta) {
				OperacionCompleta operacionCompleta = (OperacionCompleta) an.getOperador();
				checkAux(asignacion, null, tipo, operacionCompleta.getValor_operacion(), variables, registros, nombresRegistros,funcionesTipadas, vectores, matrices);
			} else {
				checkAux(asignacion, null, tipo, an.getOperador(), variables, registros, nombresRegistros,funcionesTipadas, vectores, matrices);
			}
		}
		else if(asignacion instanceof AsignacionCompleja) {
			AsignacionCompleja ac = (AsignacionCompleja) asignacion;
			if(ac.getValor_asignacion() instanceof ValorRegistro) {
				ValorRegistro r = (ValorRegistro) ac.getValor_asignacion();
				for(CampoRegistro campo: r.getCampos()) {
					String tipo = registros.get(variables.get(r.getNombre_registro())).get(campo.getNombre_campo());
					checkAux(asignacion, null, tipo, ac.getOperador(), variables, registros, nombresRegistros, funcionesTipadas, vectores, matrices);
				}
			}
			else if(ac.getValor_asignacion() instanceof ValorVector) {
				ValorVector v = (ValorVector) ac.getValor_asignacion();
				if(v.getCampos().size() == 0) {
					String tipo = vectores.get(variables.get(v.getNombre_vector()));
					checkAux(asignacion, null, tipo, ac.getOperador(), variables, registros, nombresRegistros, funcionesTipadas, vectores, matrices);
				}
				else {
					//Cogemos el último campo:
					String campo = v.getCampos().get(v.getCampos().size()-1).getNombre_campo();
					String tipo = registros.get(vectores.get(variables.get(v.getNombre_vector()))).get(campo);
					checkAux(asignacion, null, tipo, ac.getOperador(), variables, registros, nombresRegistros, funcionesTipadas, vectores, matrices);
				}
			}
			else if(ac.getValor_asignacion() instanceof ValorMatriz) {
				ValorMatriz m = (ValorMatriz) ac.getValor_asignacion();
				if(m.getCampos().size() == 0) {
					String tipo = matrices.get(variables.get(m.getNombre_matriz()));
					checkAux(asignacion, null, tipo, ac.getOperador(), variables, registros, nombresRegistros, funcionesTipadas, vectores, matrices);
				}
				else {
					//Cogemos el último campo:
					String campo = m.getCampos().get(m.getCampos().size()-1).getNombre_campo();
					String tipo = registros.get(matrices.get(variables.get(m.getNombre_matriz()))).get(campo);
					checkAux(asignacion, null, tipo, ac.getOperador(), variables, registros, nombresRegistros, funcionesTipadas, vectores, matrices);
				}
			}
		}
	}
	
	/*
	 * Función auxiliar de check(Asignacion) // Principio DRY. (2)
	 */
	private void checkAux(Asignacion asignacion, Devolver devolver, String tipo, Operacion operacion, Map<String,String> variables, Map<String,HashMap<String,String>> registros, List<String> nombresRegistros, Map<String,HashMap<Integer,String>> funcionesTipadas, Map<String,String> vectores, Map<String,String> matrices) {
		final int PERDIDA_PRECISION = 2; final int ERROR = 3; 
		int check = funciones.checkValoresAsignacion(tipo, operacion, variables, registros, nombresRegistros, funcionesTipadas, vectores, matrices, readerMessages);
		if(tipo.equals(readerMessages.getBundle().getString("TIPO_ENTERO"))) {	
			if(check == PERDIDA_PRECISION) {
				errorAux(asignacion, devolver, readerMessages.getBundle().getString("PERDIDA_PRECISION_REAL_ENTERO"), false);
			} else if(check == ERROR) {
				errorAux(asignacion, devolver, readerMessages.getBundle().getString("ASIGNACION_INCOMPATIBLE"), true);
			}
		} else if(tipo.equals(readerMessages.getBundle().getString("TIPO_LOGICO")) || tipo.equals(readerMessages.getBundle().getString("TIPO_REAL")) || tipo.equals(readerMessages.getBundle().getString("TIPO_CARACTER"))) {
			if(check == ERROR) {
				errorAux(asignacion, devolver, readerMessages.getBundle().getString("ASIGNACION_INCOMPATIBLE"), true);
			}
		} else if(tipo.equals(readerMessages.getBundle().getString("TIPO_CADENA"))) {
			if(asignacion != null) {
				errorAux(asignacion, devolver, readerMessages.getBundle().getString("NO_ASIGNACION_CADENA"), true);
			} else if(check == ERROR) {
				errorAux(asignacion, devolver, readerMessages.getBundle().getString("ASIGNACION_INCOMPATIBLE"), true);
			}
		} else {
			if(check == ERROR) {
				errorAux(asignacion, devolver, readerMessages.getBundle().getString("ASIGNACION_INCOMPATIBLE"), true);
			}
		}
	}
	
	/*
	 * Función auxiliar de check(Asignacion) // Principio DRY. (3)
	 */
	private void errorAux(Asignacion a, Devolver d, String mensaje, boolean error) {
		if(a != null) { //check(Asignacion)
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
		} else { //check(Devolver)
			if(error) {
				error(readerMessages.getBundle().getString("TIPOS_INCOMPATIBLES"), d, DiagramapseudocodigoPackage.Literals.DEVOLVER__DEVUELVE);
			} else {
				warning(readerMessages.getBundle().getString("PERDIDA_PRECISION"), d, DiagramapseudocodigoPackage.Literals.DEVOLVER__DEVUELVE);
			}
		}
	}
	
	/* 12) */ @Check /* -------------------------------------------------------------------------------------------------------------- */
	/**
	 * Función que se encarga de comprobar que las variables utilizadas como tipos complejos realmente hayan sido definidas anteriormente como uno de ellos.
	 * Además se encarga de comprobar que los índices utilizados en los vectores y matrices sean de tipo entero.
	 * @param valorComplejo
	 */
	protected void check(ValorComplejo valorComplejo) {
		Algoritmo algoritmo = EcoreUtil2.getContainerOfType(valorComplejo, Algoritmo.class);
		Modulo modulo = EcoreUtil2.getContainerOfType(valorComplejo, Modulo.class);
		Subproceso subproceso =  EcoreUtil2.getContainerOfType(valorComplejo, Subproceso.class);
		
		if(algoritmo != null && subproceso == null) {
			List<String> nombresRegistros = new ArrayList<String>(funciones.getRegistrosTipados(algoritmo.getComplejos(), algoritmo.getImportaciones()).keySet());
			List<String> nombresVectores = new ArrayList<String>(funciones.getVectoresTipados(algoritmo.getComplejos(), algoritmo.getImportaciones()).keySet());
			List<String> nombresMatrices = new ArrayList<String>(funciones.getMatricesTipadas(algoritmo.getComplejos(), algoritmo.getImportaciones()).keySet());
			Map<String,String> variablesDefinidas = funciones.getVariablesDefinidasTipadas(algoritmo.getInicio().getDeclaraciones(), null, algoritmo.getGlobales(), algoritmo.getImportaciones());
			variablesDefinidas.putAll(funciones.getConstantesTipadas(algoritmo.getConstantes(), algoritmo.getImportaciones(), readerMessages));
			checkAux(valorComplejo, variablesDefinidas, nombresRegistros, nombresVectores, nombresMatrices);
			
			if(valorComplejo instanceof ValorVector || valorComplejo instanceof ValorMatriz) {
				Map<String,HashMap<Integer,String>> funcionesTipadas = funciones.getFuncionesTipadas(algoritmo.getSubprocesos(), algoritmo.getImportaciones());
				Map<String,HashMap<String,String>> registros = funciones.getRegistrosTipados(algoritmo.getComplejos(), algoritmo.getImportaciones());
				Map<String,String> vectores = funciones.getVectoresTipados(algoritmo.getComplejos(), algoritmo.getImportaciones());
				Map<String,String> matrices = funciones.getMatricesTipadas(algoritmo.getComplejos(), algoritmo.getImportaciones());
				checkAux_indices(valorComplejo, variablesDefinidas, funcionesTipadas, registros, nombresRegistros, vectores, matrices);
			}
		} else if(algoritmo != null && subproceso != null) {
			List<String> nombresRegistros = new ArrayList<String>(funciones.getRegistrosTipados(algoritmo.getComplejos(), algoritmo.getImportaciones()).keySet());
			List<String> nombresVectores = new ArrayList<String>(funciones.getVectoresTipados(algoritmo.getComplejos(), algoritmo.getImportaciones()).keySet());
			List<String> nombresMatrices = new ArrayList<String>(funciones.getMatricesTipadas(algoritmo.getComplejos(), algoritmo.getImportaciones()).keySet());
			Map<String,String> variablesDefinidas = funciones.getVariablesDefinidasTipadas(subproceso.getDeclaraciones(), subproceso.getParametros(), algoritmo.getGlobales(), algoritmo.getImportaciones());
			variablesDefinidas.putAll(funciones.getConstantesTipadas(algoritmo.getConstantes(), algoritmo.getImportaciones(), readerMessages));
			checkAux(valorComplejo, variablesDefinidas, nombresRegistros, nombresVectores, nombresMatrices);
			
			if(valorComplejo instanceof ValorVector || valorComplejo instanceof ValorMatriz) {
				Map<String,HashMap<Integer,String>> funcionesTipadas = funciones.getFuncionesTipadas(algoritmo.getSubprocesos(), algoritmo.getImportaciones());
				Map<String,HashMap<String,String>> registros = funciones.getRegistrosTipados(algoritmo.getComplejos(), algoritmo.getImportaciones());
				Map<String,String> vectores = funciones.getVectoresTipados(algoritmo.getComplejos(), algoritmo.getImportaciones());
				Map<String,String> matrices = funciones.getMatricesTipadas(algoritmo.getComplejos(), algoritmo.getImportaciones());
				checkAux_indices(valorComplejo, variablesDefinidas, funcionesTipadas, registros, nombresRegistros, vectores, matrices);
			}
		} else {
			List<String> nombresRegistros = new ArrayList<String>(funciones.getRegistrosTipados(modulo.getImplementacion().getComplejos(), modulo.getImportaciones()).keySet());
			List<String> nombresVectores = new ArrayList<String>(funciones.getVectoresTipados(modulo.getImplementacion().getComplejos(), modulo.getImportaciones()).keySet());
			List<String> nombresMatrices = new ArrayList<String>(funciones.getMatricesTipadas(modulo.getImplementacion().getComplejos(), modulo.getImportaciones()).keySet());
			Map<String,String> variablesDefinidas = funciones.getVariablesDefinidasTipadas(subproceso.getDeclaraciones(), subproceso.getParametros(), modulo.getImplementacion().getGlobales(), modulo.getImportaciones());
			variablesDefinidas.putAll(funciones.getConstantesTipadas(modulo.getImplementacion().getConstantes(), modulo.getImportaciones(), readerMessages));
			checkAux(valorComplejo, variablesDefinidas, nombresRegistros, nombresVectores, nombresMatrices);
			
			if(valorComplejo instanceof ValorVector || valorComplejo instanceof ValorMatriz) {
				Map<String,HashMap<Integer,String>> funcionesTipadas = funciones.getFuncionesTipadas(modulo.getImplementacion().getSubprocesos(), modulo.getImportaciones());
				Map<String,HashMap<String,String>> registros = funciones.getRegistrosTipados(modulo.getImplementacion().getComplejos(), modulo.getImportaciones());
				Map<String,String> vectores = funciones.getVectoresTipados(modulo.getImplementacion().getComplejos(), modulo.getImportaciones());
				Map<String,String> matrices = funciones.getMatricesTipadas(modulo.getImplementacion().getComplejos(), modulo.getImportaciones());
				checkAux_indices(valorComplejo, variablesDefinidas, funcionesTipadas, registros, nombresRegistros, vectores, matrices);
			}
		}
	}
	
	/*
	 * Función auxiliar de check(ValorComplejo) // Principio DRY.
	 */
	private void checkAux(ValorComplejo valorComplejo, Map<String, String> variables, List<String> nombresRegistros, List<String> nombresVectores, List<String> nombresMatrices) {
		if(valorComplejo instanceof ValorRegistro) {
			ValorRegistro r = (ValorRegistro) valorComplejo;
			if(!nombresRegistros.contains(variables.get(r.getNombre_registro()))) {
				error(readerMessages.getString("NO_TIPO_REGISTRO", r.getNombre_registro()), r, DiagramapseudocodigoPackage.Literals.VALOR_REGISTRO__NOMBRE_REGISTRO);
			}
		} else if(valorComplejo instanceof ValorVector) {
			ValorVector v = (ValorVector) valorComplejo;
			if(!nombresVectores.contains(variables.get(v.getNombre_vector()))) {
				error(readerMessages.getString("NO_TIPO_VECTOR", v.getNombre_vector()), v, DiagramapseudocodigoPackage.Literals.VALOR_VECTOR__NOMBRE_VECTOR);
			}
		} else if(valorComplejo instanceof ValorMatriz) {
			ValorMatriz m = (ValorMatriz) valorComplejo;
			if(!nombresMatrices.contains(variables.get(m.getNombre_matriz()))) {
				error(readerMessages.getString("NO_TIPO_MATRIZ", m.getNombre_matriz()), m, DiagramapseudocodigoPackage.Literals.VALOR_MATRIZ__NOMBRE_MATRIZ);
			}
		}
	}
	
	/*
	 * Función auxiliar de check(ValorComplejo) // Principio DRY (2).
	 */
	private void checkAux_indices(ValorComplejo valorComplejo, Map<String, String> variables, Map<String,HashMap<Integer,String>> funcionesTipadas, Map<String,HashMap<String,String>> registros, List<String> nombresRegistros, Map<String, String> vectores, Map<String, String> matrices) {
		final int ERROR = 3;
		
		if(valorComplejo instanceof ValorVector) {
			ValorVector valorVector = (ValorVector) valorComplejo;
			
			int check = funciones.checkValoresAsignacion(readerMessages.getBundle().getString("TIPO_ENTERO"), valorVector.getIndice(), variables, registros, nombresRegistros, funcionesTipadas, vectores, matrices, readerMessages);
			
			if(check == ERROR) {
				error(readerMessages.getBundle().getString("INDICE_ENTERO"), valorVector, DiagramapseudocodigoPackage.Literals.VALOR_VECTOR__INDICE);
			}
		} else {
			ValorMatriz valorMatriz = (ValorMatriz) valorComplejo;
			
			int check1 = funciones.checkValoresAsignacion(readerMessages.getBundle().getString("TIPO_ENTERO"), valorMatriz.getPrimerIndice(), variables, registros, nombresRegistros, funcionesTipadas, vectores, matrices, readerMessages);
			int check2 = funciones.checkValoresAsignacion(readerMessages.getBundle().getString("TIPO_ENTERO"), valorMatriz.getSegundoIndice(), variables, registros, nombresRegistros, funcionesTipadas, vectores, matrices, readerMessages);
			
			if(check1 == ERROR) {
				error(readerMessages.getBundle().getString("INDICE_ENTERO"), valorMatriz, DiagramapseudocodigoPackage.Literals.VALOR_MATRIZ__PRIMER_INDICE);
			}
			
			if(check2 == ERROR) {
				error(readerMessages.getBundle().getString("INDICE_ENTERO"), valorMatriz, DiagramapseudocodigoPackage.Literals.VALOR_MATRIZ__SEGUNDO_INDICE);
			}
		}
	}
	
	/* 13) */ @Check /* -------------------------------------------------------------------------------------------------------------- */
	/**
	 * Función encargada de comprobar si existen variables globales repetidas (checkAux), funciones repetidas (checkAux2), 
	 * tipos complejos repetidos (checkAux3), constantes repetidas (checkAux4) o comprobar si las constantes usadas 
	 * para crear los Vectores o Matrices han sido definidas con anterioridad (checkAux).
	 * @param codigo
	 */
	protected void check(Codigo codigo) {
		if(codigo instanceof Algoritmo) {
			Algoritmo algoritmo = (Algoritmo) codigo;
			checkAux_globalesRepetidas(algoritmo.getGlobales());
			checkAux_subprocesosRepetidos(algoritmo.getSubprocesos());
			checkAux_tiposRepetidos(algoritmo.getComplejos());
			checkAux_constantesRepetidas(algoritmo.getConstantes());
			checkAux_constantesNoDeclaradas(funciones.getConstantesTipadas(algoritmo.getConstantes(), algoritmo.getImportaciones(), readerMessages), algoritmo.getComplejos());
			checkAux_variablesRepetidas(algoritmo.getInicio().getDeclaraciones(), new HashMap<String, String>());
			checkAux_tiposNoDeclarados(funciones.getNombresTiposComplejos(algoritmo.getComplejos(), algoritmo.getImportaciones()), algoritmo.getInicio().getDeclaraciones());
			checkAux_tiposNoDeclarados(funciones.getNombresTiposComplejos(algoritmo.getComplejos(), algoritmo.getImportaciones()), algoritmo.getGlobales());
			checkAux_variablesExportadasRepetidas(algoritmo.getGlobales(), algoritmo.getImportaciones(), true);
			checkAux_subprocesosRepetidos(algoritmo.getImportaciones(), algoritmo.getSubprocesos());
			checkAux_tiposExportadosRepetidos(algoritmo.getComplejos(), algoritmo.getImportaciones(), true);
			checkAux_constantesExportadasRepetidas(algoritmo.getConstantes(), algoritmo.getImportaciones(), true);
			checkAux_variablesExportadasRepetidas(algoritmo.getImportaciones(), true);
			checkAux_tiposExportadosRepetidos(algoritmo.getImportaciones(), true);
			checkAux_constantesExportadasRepetidas(algoritmo.getImportaciones(), true);
			
			for(Subproceso s: algoritmo.getSubprocesos()) {
				checkAux_variablesRepetidas(s.getDeclaraciones(), funciones.getParametrosTipados(s.getParametros()));
				checkAux_tiposNoDeclarados(funciones.getNombresTiposComplejos(algoritmo.getComplejos(), algoritmo.getImportaciones()), s.getDeclaraciones());
			}
		} else if(codigo instanceof Modulo) {
			Modulo modulo = (Modulo) codigo;
			checkAux_globalesRepetidas(modulo.getImplementacion().getGlobales());
			checkAux_subprocesosRepetidos(modulo.getImplementacion().getSubprocesos());
			checkAux_tiposRepetidos(modulo.getImplementacion().getComplejos());
			checkAux_constantesRepetidas(modulo.getImplementacion().getConstantes());
			checkAux_constantesNoDeclaradas(funciones.getConstantesTipadas(modulo.getImplementacion().getConstantes(), modulo.getImportaciones(), readerMessages), modulo.getImplementacion().getComplejos());
			checkAux_tiposNoDeclarados(funciones.getNombresTiposComplejos(modulo.getImplementacion().getComplejos(), modulo.getImportaciones()), modulo.getImplementacion().getGlobales());
			checkAux_variablesExportadasRepetidas(funciones.getNombresVariables(modulo.getExporta_globales()));
			checkAux_constantesExportadasNoDeclaradas(funciones.getConstantesTipadas(modulo.getImplementacion().getConstantes(), modulo.getImportaciones(), readerMessages), modulo.getExporta_constantes());
			checkAux_tiposExportadosNoDeclarados(funciones.getNombresTiposComplejos(modulo.getImplementacion().getComplejos(), null), modulo.getExporta_tipos());
			checkAux_tiposExportadosRepetidos(modulo.getExporta_tipos());
			checkAux_constantesExportadasRepetidas(modulo.getExporta_constantes());
			checkAux_cabecerasNoDeclaradas(modulo.getImplementacion().getSubprocesos(), modulo.getExporta_subprocesos());
			checkAux_cabecerasRepetidas(modulo.getExporta_subprocesos());
			checkAux_variablesExportadasRepetidas(modulo.getImplementacion().getGlobales(), modulo.getImportaciones(), false);
			checkAux_subprocesosRepetidos(modulo.getImportaciones(), modulo.getImplementacion().getSubprocesos());
			checkAux_tiposExportadosRepetidos(modulo.getImplementacion().getComplejos(), modulo.getImportaciones(), false);
			checkAux_constantesExportadasRepetidas(modulo.getImplementacion().getConstantes(), modulo.getImportaciones(), false);
			checkAux_variablesExportadasRepetidas(modulo.getImportaciones(), false);
			checkAux_tiposExportadosRepetidos(modulo.getImportaciones(), false);
			checkAux_constantesExportadasRepetidas(modulo.getImportaciones(), false);
			checkAux_variablesExportadasNoDeclaradas(modulo.getExporta_globales(), modulo.getImplementacion().getGlobales());
			
			for(Subproceso s: modulo.getImplementacion().getSubprocesos()) {
				checkAux_variablesRepetidas(s.getDeclaraciones(), funciones.getParametrosTipados(s.getParametros()));
				checkAux_tiposNoDeclarados(funciones.getNombresTiposComplejos(modulo.getImplementacion().getComplejos(), modulo.getImportaciones()), s.getDeclaraciones());
			}
		}
	}
	
	/*
	 * Función auxiliar de check(Codigo) // Principio DRY. (1)
	 */
	private void checkAux_globalesRepetidas(List<Declaracion> globales) {
		List<String> variables = new ArrayList<String>();
		for(Declaracion d: globales) {
			if(d instanceof DeclaracionBasica) {
				DeclaracionBasica dec = (DeclaracionBasica) d;
				for(Variable v: dec.getVariables()) {
					if(!variables.contains(v.getNombre())) {
						variables.add(v.getNombre());
					}
					else {
						error(readerMessages.getString("GLOBAL_REPETIDA", v.getNombre()), v, DiagramapseudocodigoPackage.Literals.VARIABLE__NOMBRE);
					}
				}
			}
			else {
				DeclaracionDefinida dec = (DeclaracionDefinida) d;
				for(Variable v: dec.getVariables()) {
					if(!variables.contains(v.getNombre())) {
						variables.add(v.getNombre());
					}
					else {
						error(readerMessages.getString("GLOBAL_REPETIDA", v.getNombre()), v,  DiagramapseudocodigoPackage.Literals.VARIABLE__NOMBRE);
					}
				}
			}
		}
	}
	
	/*
	 * Función auxiliar de check(Codigo) // Principio DRY. (2)
	 */
	private void checkAux_subprocesosRepetidos(List<Subproceso> subprocesos) {
		List<String> nombres = new ArrayList<String>();
		List<ArrayList<Integer>> parametros = new ArrayList<ArrayList<Integer>>();
		for(Subproceso s: subprocesos) {
			//Comprobamos que no haya otro subproceso con el mismo nombre y el mismo número de parámetros
			if(!nombres.contains(s.getNombre())) {
				//Si todavia no hay ninguna que se llame así, la registramos
				nombres.add(s.getNombre());
				parametros.add(new ArrayList<Integer>());
				parametros.get(nombres.indexOf(s.getNombre())).add(s.getParametros().size());
			}
			else if(nombres.contains(s.getNombre()) && !parametros.get(nombres.indexOf(s.getNombre())).contains(s.getParametros().size())) {
				//Si el nombre existe y no tiene el mismo número de parámetros lo registramos
				parametros.get(nombres.indexOf(s.getNombre())).add(s.getParametros().size());
				
			}
			else {
				error(readerMessages.getString("SUBPROCESO_REPETIDO", s.getNombre().replace("(", "")), s, DiagramapseudocodigoPackage.Literals.SUBPROCESO__NOMBRE, subprocesos.indexOf(s));
			}
		}
	}
	
	/*
	 * Función auxiliar de check(Codigo) // Principio DRY. (3)
	 */
	private void checkAux_tiposRepetidos(List<TipoComplejo> complejos) {
		List<String> tipos = new ArrayList<String>();
		
		for(TipoComplejo complejo: complejos) {
			if(!tipos.contains(complejo.getNombre())) {
				//Si no existe lo registramos
				tipos.add(complejo.getNombre());
			}
			else {
				//Si existe lanzamos el error
				error(readerMessages.getString("TIPO_REPETIDO", complejo.getNombre()), complejo, DiagramapseudocodigoPackage.Literals.TIPO_COMPLEJO__NOMBRE);
			}
		}
	}
	
	/*
	 * Función auxiliar de check(Codigo) // Principio DRY. (4)
	 */
	private void checkAux_constantesRepetidas(List<Constante> constantes) {
		List<String> nombresConstantes = new ArrayList<String>();
		for(Constante constante: constantes) {
			if(nombresConstantes.contains(constante.getVariable().getNombre())) {
				error(readerMessages.getString("CONSTANTE_REPETIDA",  constante.getVariable().getNombre()), constante.getVariable(), DiagramapseudocodigoPackage.Literals.VARIABLE__NOMBRE);
			}
			else {
				nombresConstantes.add(constante.getVariable().getNombre());
			}
		}
	}
	
	/*
	 * Función auxiliar de check(Codigo) // Principio DRY. (5)
	 */
	private void checkAux_constantesNoDeclaradas(Map<String, String> nombresConstantes, List<TipoComplejo> complejos) {
		for(TipoComplejo t: complejos) {
			if(t instanceof Vector) {
				Vector v = (Vector) t;
				if(v.getValor() instanceof VariableID) {
					VariableID var = (VariableID) v.getValor();
					if(!nombresConstantes.containsKey(var.getNombre())) {
						error(readerMessages.getString("CONSTANTE_NO_DECLARADA",  var.getNombre()), v, DiagramapseudocodigoPackage.Literals.VECTOR__VALOR, CONSTANTE_NO_DEFINIDA);
					}
				}
			}
			if(t instanceof Matriz) {
				Matriz m = (Matriz) t;
				if(m.getValor().get(0) instanceof VariableID) {
					VariableID var = (VariableID) m.getValor().get(0);
					if(!nombresConstantes.containsKey(var.getNombre())) {
						error(readerMessages.getString("CONSTANTE_NO_DECLARADA",  var.getNombre()), m, DiagramapseudocodigoPackage.Literals.MATRIZ__VALOR, 0, CONSTANTE_NO_DEFINIDA);
					}
				}
				if(m.getValor().size() > 1 && m.getValor().get(1) instanceof VariableID) {
					VariableID var = (VariableID) m.getValor().get(1);
					if(!nombresConstantes.containsKey(var.getNombre())) {
						error(readerMessages.getString("CONSTANTE_NO_DECLARADA",  var.getNombre()), m, DiagramapseudocodigoPackage.Literals.MATRIZ__VALOR, 1, CONSTANTE_NO_DEFINIDA);
					}
				}
			}
		}
	}
	
	/*
	 * Función auxiliar de check(Codigo) // Principio DRY. (6)
	 */
	private void checkAux_variablesRepetidas(List<Declaracion> declaraciones, Map<String, String> variablesDefinidas) {
		for(Declaracion declaracion: declaraciones) {
			if(declaracion instanceof DeclaracionBasica) {
				DeclaracionBasica declaracionBasica = (DeclaracionBasica) declaracion;
				for(Variable v: declaracionBasica.getVariables()) {
					if(!variablesDefinidas.containsKey(v.getNombre())) {
						variablesDefinidas.put(v.getNombre(), declaracionBasica.getTipo());
					}
					else {
						error(readerMessages.getString("VARIABLE_REPETIDA", v.getNombre()), v, DiagramapseudocodigoPackage.Literals.VARIABLE__NOMBRE);
					}
				}
			}
			else {
				DeclaracionDefinida declaracionDefinida = (DeclaracionDefinida) declaracion;
				for(Variable v: declaracionDefinida.getVariables()) {
					if(!variablesDefinidas.containsKey(v.getNombre())) {
						variablesDefinidas.put(v.getNombre(), declaracionDefinida.getTipo());
					}
					else {
						error(readerMessages.getString("VARIABLE_REPETIDA", v.getNombre()), v,  DiagramapseudocodigoPackage.Literals.VARIABLE__NOMBRE);
					}
				}
			}
		}
	}
	
	/*
	 * Función auxiliar de check(Codigo) // Principio DRY. (7)
	 */
	private void checkAux_tiposNoDeclarados(List<String> tiposDefinidos, List<Declaracion> declaraciones) {
		for(Declaracion d: declaraciones) {
			if(d instanceof DeclaracionDefinida) {
				DeclaracionDefinida dec = (DeclaracionDefinida) d;
				if(!tiposDefinidos.contains(dec.getTipo())) {
					//Si el tipo no existe entonces lanzamos el error
					error(readerMessages.getString("TIPO_NO_DEFINIDO", dec.getTipo()), dec, DiagramapseudocodigoPackage.Literals.DECLARACION__TIPO);
				}
			}
		}
	}
	
	/*
	 * Función auxiliar de check(Codigo) // Principio DRY. (8)
	 */
	private void checkAux_variablesExportadasRepetidas(List<String> variablesExportadas) {
		List<String> nombresGlobales = new ArrayList<String>();		
		for(String nombre: variablesExportadas) {
			if(nombresGlobales.contains(nombre)) {
				error(readerMessages.getString("VARIABLE_EXPORTADA_REPETIDA",  nombre), DiagramapseudocodigoPackage.Literals.MODULO__EXPORTA_GLOBALES, variablesExportadas.indexOf(nombre));
			}
			else {
				nombresGlobales.add(nombre);
			}
		}
	}
	
	/*
	 * Función auxiliar de check(Codigo) // Principio DRY. (9)
	 */
	private void checkAux_constantesExportadasNoDeclaradas(Map<String, String> constantesDefinidas, List<String> constantesExportadas) {
		for(String constanteExportada: constantesExportadas) {
			if(!constantesDefinidas.containsKey(constanteExportada)) {
				error(readerMessages.getString("CONSTANTE_NO_DECLARADA", constanteExportada), DiagramapseudocodigoPackage.Literals.MODULO__EXPORTA_CONSTANTES, constantesExportadas.indexOf(constanteExportada));
			}
		}
	}
	
	/*
	 * Función auxiliar de check(Codigo) // Principio DRY. (10)
	 */
	private void checkAux_tiposExportadosNoDeclarados(List<String> tiposDefinidos, List<String> tiposExportados) {
		for(String tipoExportado: tiposExportados) {
			if(!tiposDefinidos.contains(tipoExportado)) {
				error(readerMessages.getString("TIPO_NO_DEFINIDO", tipoExportado), DiagramapseudocodigoPackage.Literals.MODULO__EXPORTA_TIPOS, tiposExportados.indexOf(tipoExportado));
			}
		}
	}
	
	/*
	 * Función auxiliar de check(Codigo) // Principio DRY. (11)
	 */
	private void checkAux_tiposExportadosRepetidos(List<String> tiposExportados) {
		List<String> tipos = new ArrayList<String>();		
		for(String nombre: tiposExportados) {
			if(tipos.contains(nombre)) {
				error(readerMessages.getString("TIPO_EXPORTADO_REPETIDO", nombre), DiagramapseudocodigoPackage.Literals.MODULO__EXPORTA_TIPOS, tiposExportados.indexOf(nombre));
			}
			else {
				tipos.add(nombre);
			}
		}
	}
	
	/*
	 * Función auxiliar de check(Codigo) // Principio DRY. (12)
	 */
	private void checkAux_constantesExportadasRepetidas(List<String> constantesExportadas) {
		List<String> nombresConstantes = new ArrayList<String>();
		for(String constante: constantesExportadas) {
			if(nombresConstantes.contains(constante)) {
				error(readerMessages.getString("CONSTANTE_EXPORTADA_REPETIDA",  constante), DiagramapseudocodigoPackage.Literals.MODULO__EXPORTA_CONSTANTES, constantesExportadas.indexOf(constante));
			}
			else {
				nombresConstantes.add(constante);
			}
		}
	}
	
	/*
	 * Función auxiliar de check(Codigo) // Principio DRY. (13)
	 */
	private void checkAux_cabecerasNoDeclaradas(List<Subproceso> subprocesosDefinidos, List<CabeceraSubproceso> funcionesExportadas) {
		boolean funcionDefinida = false;
		for(CabeceraSubproceso cabecera: funcionesExportadas) {
			for(Subproceso s: subprocesosDefinidos) {
				if(cabecera.getNombre().equals(s.getNombre()) && cabecera.getParametros().size() == s.getParametros().size()) {
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
	
	/*
	 * Función auxiliar de check(Codigo) // Principio DRY. (14)
	 */
	private void checkAux_cabecerasRepetidas(List<CabeceraSubproceso> funcionesExportadas) {
		int repeticiones = 0;
		for(CabeceraSubproceso cabecera1: funcionesExportadas) {
			for(CabeceraSubproceso cabecera2: funcionesExportadas) {
				if(cabecera1.getNombre().equals(cabecera2.getNombre()) && cabecera1.getParametros().size() == cabecera2.getParametros().size()) {
					repeticiones++;
				}
			}
			if(repeticiones > 1) {
				if(cabecera1 instanceof CabeceraFuncion) {
					error(readerMessages.getString("CABECERA_REPETIDA_FUNCION", cabecera1.getNombre().replace("(", "")), cabecera1, DiagramapseudocodigoPackage.Literals.CABECERA_SUBPROCESO__NOMBRE);
				} else {
					error(readerMessages.getString("CABECERA_REPETIDA_PROCEDIMIENTO", cabecera1.getNombre().replace("(", "")), cabecera1, DiagramapseudocodigoPackage.Literals.CABECERA_SUBPROCESO__NOMBRE);
				}
			}
			repeticiones = 0;
		}
	}
	
	/*
	 * Función auxiliar de check(Codigo) // Principio DRY. (15)
	 * Función que se encarga de comprobar que el módulo importado no exporte una variable global con el mismo nombre que una de las globales definidas.
	 */
	private void checkAux_variablesExportadasRepetidas(List<Declaracion> globales, List<Modulo> importaciones, boolean algoritmo) {
		List<String> variablesGlobales = funciones.getNombresVariables(globales);
		List<String> nombresVariablesModulos = new ArrayList<String>();
		
		for(Modulo m: importaciones) {
			nombresVariablesModulos = funciones.getNombresVariables(m.getExporta_globales());
			for(String nombreVariable: nombresVariablesModulos) {
				if(variablesGlobales.contains(nombreVariable)) {
					error(readerMessages.getString("VARIABLE_REPETIDA_MODULO", nombreVariable, m.getNombre()), DiagramapseudocodigoPackage.Literals.ALGORITMO__GLOBALES, globales.indexOf(nombreVariable));
				}
			}
			
		}
	}
	
	/*
	 * Función auxiliar de check(Codigo) // Principio DRY. (16)
	 */
	private void checkAux_subprocesosRepetidos(List<Modulo> importaciones, List<Subproceso> subprocesos) {
		for(Modulo m: importaciones) {
			for(Subproceso s: subprocesos) {
				for(CabeceraSubproceso cabecera: m.getExporta_subprocesos()) {
					if(cabecera instanceof CabeceraFuncion) {
						CabeceraFuncion cabeceraFuncion = (CabeceraFuncion) cabecera;
						if(cabeceraFuncion.getNombre().equals(s.getNombre()) && cabeceraFuncion.getParametros().size() == s.getParametros().size()) {
							error(readerMessages.getString("FUNCION_REPETIDA", s.getNombre(), m.getNombre()), s, DiagramapseudocodigoPackage.Literals.SUBPROCESO__NOMBRE);
						}
					}
					else if(cabecera instanceof CabeceraSubproceso) {
						CabeceraProcedimiento cabeceraProcedimiento = (CabeceraProcedimiento) cabecera;
						if(cabeceraProcedimiento.getNombre().equals(s.getNombre()) && cabeceraProcedimiento.getParametros().size() == s.getParametros().size()) {
							error(readerMessages.getString("PROCEDIMIENTO_REPETIDO", s.getNombre(), m.getNombre()), s, DiagramapseudocodigoPackage.Literals.SUBPROCESO__NOMBRE);
						}
					}
				}
			}
		}
	}
	
	/*
	 * Función auxiliar de check(Codigo) // Principio DRY. (17)
	 * Función que se encarga de comprobar que el módulo importado no exporte un tipo con el mismo nombre que uno de los tipos definidos.
	 */
	private void checkAux_tiposExportadosRepetidos(List<TipoComplejo> complejos, List<Modulo> importaciones, boolean algoritmo) {
		List<String> nombreTipos = funciones.getNombresTiposComplejos(complejos, null);
		
		for(Modulo m: importaciones) {
			for(String nombreTipo: m.getExporta_tipos()) {
				if(nombreTipos.contains(nombreTipo)) {
					if(algoritmo) {
						error(readerMessages.getString("TIPO_REPETIDO_MODULO", nombreTipo, m.getNombre()), DiagramapseudocodigoPackage.Literals.ALGORITMO__COMPLEJOS, nombreTipos.indexOf(nombreTipo));
					} else {
						error(readerMessages.getString("TIPO_REPETIDO_MODULO", nombreTipo, m.getNombre()), m.getImplementacion(), DiagramapseudocodigoPackage.Literals.IMPLEMENTACION__COMPLEJOS, nombreTipos.indexOf(nombreTipo));
					}
				}
			}
		}
	}
	
	/*
	 * Función auxiliar de check(Codigo) // Principio DRY. (18)
	 * Función que se encarga de comprobar que el módulo importado no exporte una constante con el mismo nombre que una de las definidas.
	 */
	private void checkAux_constantesExportadasRepetidas(List<Constante> constantes, List<Modulo> importaciones, boolean algoritmo) {
		List<String> nombresConstantes = funciones.getNombresConstantes(constantes);
		
		for(Modulo m: importaciones) {
			for(String nombreConstante: m.getExporta_constantes()) {
				if(nombresConstantes.contains(nombreConstante)) {
					if(algoritmo) {
						error(readerMessages.getString("CONSTANTE_REPETIDA_MODULO", nombreConstante, m.getNombre()), DiagramapseudocodigoPackage.Literals.ALGORITMO__CONSTANTES, nombresConstantes.indexOf(nombreConstante));
					} else {
						error(readerMessages.getString("CONSTANTE_REPETIDA_MODULO", nombreConstante, m.getNombre()), m.getImplementacion(), DiagramapseudocodigoPackage.Literals.IMPLEMENTACION__CONSTANTES, nombresConstantes.indexOf(nombreConstante));
					}
				}
			}
		}
	}
	
	/*
	 * Función auxiliar de check(Codigo) // Principio DRY. (19)
	 * Función que se encarga de comprobar que los módulos importados no contengan variables globales exportadas con el mismo nombre.
	 */
	private void checkAux_variablesExportadasRepetidas(List<Modulo> importaciones, boolean algoritmo) {
		List<String> variablesModulo1 = new ArrayList<String>();
		List<String> variablesModulo2 = new ArrayList<String>();
		for(Modulo m: importaciones) {
			for(Modulo m2: importaciones) {
				if(!m.getNombre().equals(m2.getNombre())) {
					variablesModulo1 = funciones.getNombresVariables(m.getExporta_globales());
					variablesModulo2 = funciones.getNombresVariables(m2.getExporta_globales());
					for(String nombreVariable: variablesModulo1) {
						if(variablesModulo2.contains(nombreVariable)) {
							if(algoritmo) {
								error(readerMessages.getString("VARIABLE_REPETIDA_MODULO_IMPORTADA", nombreVariable, m.getNombre(), m2.getNombre()), DiagramapseudocodigoPackage.Literals.ALGORITMO__IMPORTACIONES, importaciones.indexOf(m));
							} else {
								error(readerMessages.getString("VARIABLE_REPETIDA_MODULO_IMPORTADA", nombreVariable, m.getNombre(), m2.getNombre()), DiagramapseudocodigoPackage.Literals.MODULO__IMPORTACIONES, importaciones.indexOf(m));
							}
						}
					}
				}
			}
		}
	}
	
	/*
	 * Función auxiliar de check(Codigo) // Principio DRY. (20)
	 * Función que se encarga de comprobar que los módulos importados no contengan tipos exportados con el mismo nombre.
	 */
	private void checkAux_tiposExportadosRepetidos(List<Modulo> importaciones, boolean algoritmo) {		
		for(Modulo m: importaciones) {
			for(Modulo m2: importaciones) {
				if(!m.getNombre().equals(m2.getNombre())) {
					for(String nombreTipo: m.getExporta_tipos()) {
						if(m2.getExporta_tipos().contains(nombreTipo)) {
							if(algoritmo) {
								error(readerMessages.getString("TIPO_REPETIDO_MODULO_IMPORTADO", nombreTipo, m.getNombre(), m2.getNombre()), DiagramapseudocodigoPackage.Literals.ALGORITMO__IMPORTACIONES, importaciones.indexOf(m));
							} else {
								error(readerMessages.getString("TIPO_REPETIDO_MODULO_IMPORTADO", nombreTipo, m.getNombre(), m2.getNombre()), DiagramapseudocodigoPackage.Literals.MODULO__IMPORTACIONES, importaciones.indexOf(m));
							}
						}
					}
				}
			}
		}
	}
	
	/*
	 * Función auxiliar de check(Codigo) // Principio DRY. (21)
	 * Función que se encarga de comprobar que los módulos importados no contengan constantes exportadas con el mismo nombre.
	 */
	private void checkAux_constantesExportadasRepetidas(List<Modulo> importaciones, boolean algoritmo) {
		for(Modulo m: importaciones) {
			for(Modulo m2: importaciones) {
				if(!m.getNombre().equals(m2.getNombre())) {
					for(String nombreConstante: m.getExporta_constantes()) {
						if(m2.getExporta_constantes().contains(nombreConstante)) {
							if(algoritmo) {
								error(readerMessages.getString("CONSTANTE_REPETIDA_MODULO_IMPORTADA", nombreConstante, m.getNombre(), m2.getNombre()), DiagramapseudocodigoPackage.Literals.ALGORITMO__IMPORTACIONES, importaciones.indexOf(m));
							} else {
								error(readerMessages.getString("CONSTANTE_REPETIDA_MODULO_IMPORTADA", nombreConstante, m.getNombre(), m2.getNombre()), DiagramapseudocodigoPackage.Literals.MODULO__IMPORTACIONES, m.getImportaciones().indexOf(m));
							}
						}
					}
				}
			}
		}
	}
	
	/*
	 * Función auxiliar de check(Codigo) // Principio DRY. (22)
	 * Función que se encarga de comprobar que las variables exportadas en un módulo hayan sido previamente declaradas
	 */
	private void checkAux_variablesExportadasNoDeclaradas(List<Declaracion> variablesExportadas, List<Declaracion> variablesDefinidas) {
		List<String> nombresExportadas = funciones.getNombresVariables(variablesExportadas);
		List<String> nombresDefinidas = funciones.getNombresVariables(variablesDefinidas);
		
		for(String nombreExportada: nombresExportadas) {
			if(!nombresDefinidas.contains(nombreExportada)) {
				error(readerMessages.getString("VARIABLE_NO_DECLARADA", nombreExportada), DiagramapseudocodigoPackage.Literals.MODULO__EXPORTA_GLOBALES, nombresExportadas.indexOf(nombreExportada));
			}
		}
	}
	
	/* 14) */ @Check /* -------------------------------------------------------------------------------------------------------------- */
	/**
	 * Función encargada de comprobar que el tipo con el que se ha definido un vector haya sido previamente declarado.
	 * @param vector
	 */
	protected void check(Vector vector) {
		Algoritmo algoritmo = EcoreUtil2.getContainerOfType(vector, Algoritmo.class);
		Modulo modulo = EcoreUtil2.getContainerOfType(vector, Modulo.class);
		List<String> tiposDefinidos = new ArrayList<String>();
		
		if(algoritmo != null) {
			tiposDefinidos = funciones.getNombresTiposComplejos(algoritmo.getComplejos(), algoritmo.getImportaciones());
		} else {
			tiposDefinidos = funciones.getNombresTiposComplejos(modulo.getImplementacion().getComplejos(), modulo.getImportaciones());
		}
		
		if(vector.getTipo() instanceof TipoDefinido) {
			TipoDefinido tipo = (TipoDefinido) vector.getTipo();
			if(!tiposDefinidos.contains(tipo.getNombre())) {
				error(readerMessages.getString("TIPO_NO_DEFINIDO", tipo.getNombre()), vector, DiagramapseudocodigoPackage.Literals.VECTOR__TIPO);
			}
		}
	}
	
	/* 15) */ @Check /* -------------------------------------------------------------------------------------------------------------- */
	/**
	 * Función encargada de comprobar que el tipo con el que se ha definido una matriz haya sido previamente declarado.
	 * @param matriz
	 */
	protected void check(Matriz matriz) {
		Algoritmo algoritmo = EcoreUtil2.getContainerOfType(matriz, Algoritmo.class);
		Modulo modulo = EcoreUtil2.getContainerOfType(matriz, Modulo.class);
		List<String> tiposDefinidos = new ArrayList<String>();
		
		if(algoritmo != null) {
			tiposDefinidos = funciones.getNombresTiposComplejos(algoritmo.getComplejos(), algoritmo.getImportaciones());
		} else {
			tiposDefinidos = funciones.getNombresTiposComplejos(modulo.getImplementacion().getComplejos(), modulo.getImportaciones());
		}
		
		if(matriz.getTipo() instanceof TipoDefinido) {
			TipoDefinido tipo = (TipoDefinido) matriz.getTipo();
			if(!tiposDefinidos.contains(tipo.getNombre())) {
				error(readerMessages.getString("TIPO_NO_DEFINIDO", tipo.getNombre()), matriz, DiagramapseudocodigoPackage.Literals.MATRIZ__TIPO);
			}
		}
	}
	
	/* 16) */ @Check /* -------------------------------------------------------------------------------------------------------------- */
	/**
	 * Función que se encarga de comprobar que no existan campos repetidos en los registros y que los tipos de los campos hayan sido definido previamente.
	 * @param registro
	 */
	protected void check(Registro registro) {
		List<String> variables = new ArrayList<String>();
		Algoritmo algoritmo = EcoreUtil2.getContainerOfType(registro, Algoritmo.class);
		Modulo modulo = EcoreUtil2.getContainerOfType(registro, Modulo.class);
		List<String> tiposDefinidos = new ArrayList<String>();
		
		for(Declaracion d: registro.getCampos()) {
			if(d instanceof DeclaracionDefinida) {
				DeclaracionDefinida dec = (DeclaracionDefinida) d;
				for(Variable v: dec.getVariables()) {
					if(!variables.contains(v.getNombre())) {
						variables.add(v.getNombre());
					}
					else {
						error(readerMessages.getString("VARIABLE_REPETIDA_REGISTRO", v.getNombre(), registro.getNombre()), v, DiagramapseudocodigoPackage.Literals.VARIABLE__NOMBRE);
					}
				}
			}
			else {
				DeclaracionBasica dec = (DeclaracionBasica) d;
				for(Variable v: dec.getVariables()) {
					if(!variables.contains(v.getNombre())) {
						variables.add(v.getNombre());
					}
					else {
						error(readerMessages.getString("VARIABLE_REPETIDA_REGISTRO", v.getNombre(), registro.getNombre()), v, DiagramapseudocodigoPackage.Literals.VARIABLE__NOMBRE);
					}
				}
			}
		}
		
		if(algoritmo != null) {
			tiposDefinidos = funciones.getNombresTiposComplejos(algoritmo.getComplejos(), algoritmo.getImportaciones());
		} else {
			tiposDefinidos = funciones.getNombresTiposComplejos(modulo.getImplementacion().getComplejos(), modulo.getImportaciones());
		}
		
		checkAux_tiposNoDeclarados(tiposDefinidos, registro.getCampos());
	}
	
	/* 17) */ @Check /* -------------------------------------------------------------------------------------------------------------- */
	/**
	 * Función encargada de comprobar que dentro de un subproceso no se use el valor de un parámetro de tipo S.
	 * @param variableID
	 */
	protected void check(VariableID variableID) {
		Subproceso subproceso =  EcoreUtil2.getContainerOfType(variableID, Subproceso.class);
		LlamadaFuncion llamadaFuncion = EcoreUtil2.getContainerOfType(variableID, LlamadaFuncion.class);
		
		if(subproceso != null) {
			List<String> parametrosTipoS = new ArrayList<String>();
			for(Parametro p: subproceso.getParametros()) {
				if(p.getPaso().equals(readerMessages.getBundle().getString("TIPO_PASO_SALIDA"))) {
					parametrosTipoS.add(p.getVariable().getNombre());
				}
			}
			
			if(parametrosTipoS.contains(variableID.getNombre()) && llamadaFuncion == null) {
				error(readerMessages.getString("USO_VARIABLE_TIPO_S", variableID.getNombre()), variableID, DiagramapseudocodigoPackage.Literals.VARIABLE_ID__NOMBRE);
			}
		}
	}
	
	/* 18) */ @Check(CheckType.NORMAL) /* -------------------------------------------------------------------------------------------------------------- */
	/**
	 * Función que se encarga de comprobar que no exista un módulo creado con anterioridad con el mismo nombre y que no existan ciclos en las importaciones.
	 * @param modulo
	 */
	public void check(Modulo modulo) {
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
		
		for(Modulo m: modulo.getImportaciones()) {
			for(Modulo m2: m.getImportaciones()) {
				if(modulo.getImportaciones().contains(m2)) {
					error(readerMessages.getString("CICLO_IMPORTACION", m.getNombre(), m2.getNombre()), modulo, DiagramapseudocodigoPackage.Literals.ALGORITMO__IMPORTACIONES, modulo.getImportaciones().indexOf(m));
				}
			}
		}
	}
	
	/* 19) */ @Check(CheckType.NORMAL) /* -------------------------------------------------------------------------------------------------------------- */
	/**
	 * Función que se encarga de comprobar que no exista definido más de un algoritmo principal y que no existan ciclos en las importaciones.
	 * @param algoritmo
	 */
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
		
		for(Modulo m: algoritmo.getImportaciones()) {
			for(Modulo m2: m.getImportaciones()) {
				if(algoritmo.getImportaciones().contains(m2)) {
					error(readerMessages.getString("CICLO_IMPORTACION", m.getNombre(), m2.getNombre()), algoritmo, DiagramapseudocodigoPackage.Literals.ALGORITMO__IMPORTACIONES, algoritmo.getImportaciones().indexOf(m));
				}
			}
		}
	}
	
	/* 20) */ @Check /* -------------------------------------------------------------------------------------------------------------- */
	/**
	 * Función que se encarga de comprobar que no existen casos repetidos en la estructura segun_sea y los tipos usados en los casos sean adecuados.
	 * @param segun
	 */
	protected void check(Segun segun) {
		List<String> casos = new ArrayList<String>();
		Algoritmo algoritmo = EcoreUtil2.getContainerOfType(segun, Algoritmo.class);
		Modulo modulo = EcoreUtil2.getContainerOfType(segun, Modulo.class);
		Subproceso subproceso =  EcoreUtil2.getContainerOfType(segun, Subproceso.class);
		int enteros = 0, reales = 0, cadenas = 0, caracteres = 0, logicos = 0, otros = 0;
		Map<String,String> variablesDefinidas = new HashMap<String, String>();
		
		if(algoritmo != null && subproceso == null) {
			variablesDefinidas = funciones.getVariablesDefinidasTipadas(algoritmo.getInicio().getDeclaraciones(), null, algoritmo.getGlobales(), algoritmo.getImportaciones());
			variablesDefinidas.putAll(funciones.getConstantesTipadas(algoritmo.getConstantes(), algoritmo.getImportaciones(), readerMessages));
			variablesDefinidas.putAll(funciones.getValoresEnumeradoTipados(algoritmo.getComplejos(), algoritmo.getImportaciones()));
		} else if(algoritmo != null && subproceso != null) {
			variablesDefinidas = funciones.getVariablesDefinidasTipadas(subproceso.getDeclaraciones(), subproceso.getParametros(), algoritmo.getGlobales(), algoritmo.getImportaciones());
			variablesDefinidas.putAll(funciones.getConstantesTipadas(algoritmo.getConstantes(), algoritmo.getImportaciones(), readerMessages));
			variablesDefinidas.putAll(funciones.getValoresEnumeradoTipados(algoritmo.getComplejos(), algoritmo.getImportaciones()));
		} else {
			variablesDefinidas = funciones.getVariablesDefinidasTipadas(subproceso.getDeclaraciones(), subproceso.getParametros(), modulo.getImplementacion().getGlobales(), modulo.getImportaciones());
			variablesDefinidas.putAll(funciones.getConstantesTipadas(modulo.getImplementacion().getConstantes(), modulo.getImportaciones(), readerMessages));
			variablesDefinidas.putAll(funciones.getValoresEnumeradoTipados(modulo.getImplementacion().getComplejos(), modulo.getImportaciones()));
		}
		
		for(Caso caso: segun.getCasos()) {
			if(caso.getOperador() instanceof Entero) {
				Entero numero = (Entero) caso.getOperador();
				if(!casos.contains(Integer.toString(numero.getValor()))) {
					casos.add(Integer.toString(numero.getValor()));
				} else {
					error(readerMessages.getString("CASO_REPETIDO", numero.getValor()), numero, DiagramapseudocodigoPackage.Literals.ENTERO__VALOR);
				}
				enteros += 1;
			} else if(caso.getOperador() instanceof Real) {
				Real numero = (Real) caso.getOperador();
				if(!casos.contains(Double.toString(numero.getValor()))) {
					casos.add(Double.toString(numero.getValor()));
				} else {
					error(readerMessages.getString("CASO_REPETIDO", numero.getValor()), numero, DiagramapseudocodigoPackage.Literals.REAL__VALOR);
				}
				reales += 1;
			} else if(caso.getOperador() instanceof CadenaCaracteres) {
				CadenaCaracteres cadena = (CadenaCaracteres) caso.getOperador();
				if(!casos.contains(cadena.getValor())) {
					casos.add(cadena.getValor());
				} else {
					error(readerMessages.getString("CASO_REPETIDO", cadena.getValor()), cadena, DiagramapseudocodigoPackage.Literals.CADENA_CARACTERES__VALOR);
				}
				cadenas += 1;
			} else if(caso.getOperador() instanceof Caracter) {
				Caracter caracter = (Caracter) caso.getOperador();
				if(!casos.contains(caracter.getValor())) {
					casos.add(caracter.getValor());
				} else {
					error(readerMessages.getString("CASO_REPETIDO", caracter.getValor()), caracter, DiagramapseudocodigoPackage.Literals.CARACTER__VALOR);
				}
				caracteres += 1;
			} else if(caso.getOperador() instanceof Logico) {
				Logico logico = (Logico) caso.getOperador();
				if(!casos.contains(logico.getValor())) {
					casos.add(logico.getValor());
				} else {
					error(readerMessages.getString("CASO_REPETIDO", logico.getValor()), logico, DiagramapseudocodigoPackage.Literals.LOGICO__VALOR);
				}
				logicos += 1;
			} else if(caso.getOperador() instanceof VariableID) {
				VariableID variable = (VariableID) caso.getOperador();
				if(!casos.contains(variable.getNombre())) {
					casos.add(variable.getNombre());
				} else {
					error(readerMessages.getString("CASO_REPETIDO", variable.getNombre()), variable, DiagramapseudocodigoPackage.Literals.VARIABLE_ID__NOMBRE);
				}
				OperacionCompleta opCompleta = (OperacionCompleta) segun.getCondicion();
				VariableID variableSegun = (VariableID) opCompleta.getValor_operacion();
				if(variablesDefinidas.get(variableSegun.getNombre()).equals(variablesDefinidas.get(variable.getNombre()))) {
					otros += 1;
				}
			}
		}
		
		OperacionCompleta opCompleta = (OperacionCompleta) segun.getCondicion();
		if(opCompleta.getValor_operacion() instanceof VariableID) {
			VariableID variableID = (VariableID) opCompleta.getValor_operacion();
			checkAux(variablesDefinidas.get(variableID.getNombre()), variableID, enteros, reales, cadenas, caracteres, logicos, otros, segun.getCasos().size());
		}
	}
	
	/*
	 * Función auxiliar de check(Segun) // Principio DRY.
	 */
	private void checkAux(String tipo, VariableID variableSegun, int enteros, int reales, int cadenas, int caracteres, int logicos, int otros, int casosTotales) {
		if(tipo.equals(readerMessages.getBundle().getString("TIPO_ENTERO"))) {
			if(enteros != casosTotales) {
				error(readerMessages.getString("PARAMETROS_SEGUN", tipo), variableSegun, DiagramapseudocodigoPackage.Literals.VARIABLE_ID__NOMBRE);
			}
		} else if(tipo.equals(readerMessages.getBundle().getString("TIPO_REAL"))) {
			if(reales != casosTotales) {
				error(readerMessages.getString("PARAMETROS_SEGUN", tipo), variableSegun, DiagramapseudocodigoPackage.Literals.VARIABLE_ID__NOMBRE);
			}
		} else if(tipo.equals(readerMessages.getBundle().getString("TIPO_CADENA"))) {
			if(cadenas != casosTotales) {
				error(readerMessages.getString("PARAMETROS_SEGUN", tipo), variableSegun, DiagramapseudocodigoPackage.Literals.VARIABLE_ID__NOMBRE);
			}
		} else if(tipo.equals(readerMessages.getBundle().getString("TIPO_CARACTER"))) {
			if(caracteres != casosTotales) {
				error(readerMessages.getString("PARAMETROS_SEGUN", tipo), variableSegun, DiagramapseudocodigoPackage.Literals.VARIABLE_ID__NOMBRE);
			}
		} else if(tipo.equals(readerMessages.getBundle().getString("TIPO_LOGICO"))) {
			if(logicos != casosTotales) {
				error(readerMessages.getString("PARAMETROS_SEGUN", tipo), variableSegun, DiagramapseudocodigoPackage.Literals.VARIABLE_ID__NOMBRE);
			}
		} else {
			if(otros != casosTotales) {
				error(readerMessages.getString("PARAMETROS_SEGUN", tipo), variableSegun, DiagramapseudocodigoPackage.Literals.VARIABLE_ID__NOMBRE);
			}
		}
	}
	
	/* 21) */ @Check /* -------------------------------------------------------------------------------------------------------------- */
	/**
	 * Función encargada de comprobar que el tipo devuelto por las funciones sea el adecuado.
	 * @param devolver
	 */
	protected void check(Devolver devolver) {
		Algoritmo algoritmo = EcoreUtil2.getContainerOfType(devolver, Algoritmo.class);
		Modulo modulo = EcoreUtil2.getContainerOfType(devolver, Modulo.class);
		Funcion funcion =  EcoreUtil2.getContainerOfType(devolver, Funcion.class);
		
		if(algoritmo != null) {
			Map<String,HashMap<String,String>> registros = funciones.getRegistrosTipados(algoritmo.getComplejos(), algoritmo.getImportaciones());
			Map<String,String> vectores = funciones.getVectoresTipados(algoritmo.getComplejos(), algoritmo.getImportaciones());
			List<String> nombresRegistros = new ArrayList<String>(registros.keySet());
			Map<String,String> matrices = funciones.getMatricesTipadas(algoritmo.getComplejos(), algoritmo.getImportaciones());
			Map<String,String> variablesDefinidas = funciones.getVariablesDefinidasTipadas(funcion.getDeclaraciones(), funcion.getParametros(), algoritmo.getGlobales(), algoritmo.getImportaciones());
			variablesDefinidas.putAll(funciones.getConstantesTipadas(algoritmo.getConstantes(), algoritmo.getImportaciones(), readerMessages));
			Map<String,HashMap<Integer,String>> funcionesTipadas = funciones.getFuncionesTipadas(algoritmo.getSubprocesos(), algoritmo.getImportaciones());
			OperacionCompleta opCompleta = (OperacionCompleta) devolver.getDevuelve();
			checkAux(null, devolver, funcion.getTipo(), opCompleta.getValor_operacion(), variablesDefinidas, registros, nombresRegistros, funcionesTipadas, vectores, matrices);
		} else {
			Map<String,HashMap<String,String>> registros = funciones.getRegistrosTipados(modulo.getImplementacion().getComplejos(), modulo.getImportaciones());
			Map<String,String> vectores = funciones.getVectoresTipados(modulo.getImplementacion().getComplejos(), modulo.getImportaciones());
			List<String> nombresRegistros = new ArrayList<String>(registros.keySet());
			Map<String,String> matrices = funciones.getMatricesTipadas(modulo.getImplementacion().getComplejos(), modulo.getImportaciones());
			Map<String,String> variablesDefinidas = funciones.getVariablesDefinidasTipadas(funcion.getDeclaraciones(), funcion.getParametros(), modulo.getImplementacion().getGlobales(), modulo.getImportaciones());
			variablesDefinidas.putAll(funciones.getConstantesTipadas(modulo.getImplementacion().getConstantes(), modulo.getImportaciones(), readerMessages));
			Map<String,HashMap<Integer,String>> funcionesTipadas = funciones.getFuncionesTipadas(modulo.getImplementacion().getSubprocesos(), modulo.getImportaciones());
			OperacionCompleta opCompleta = (OperacionCompleta) devolver.getDevuelve();
			checkAux(null, devolver, funcion.getTipo(), opCompleta.getValor_operacion(), variablesDefinidas, registros, nombresRegistros, funcionesTipadas, vectores, matrices);
		}
	}
	
	/* 22) */ @Check /* -------------------------------------------------------------------------------------------------------------- */
	/**
	 * Función que se encarga de comprobar de que no existan parámetros con el mismo nombre.
	 * @param subproceso
	 */
	protected void check(Subproceso subproceso) {
		List<String> parametros = new ArrayList<String>();
		for(Parametro p: subproceso.getParametros()) {
			if(!parametros.contains(p.getVariable().getNombre())) {
				parametros.add(p.getVariable().getNombre());
			}
			else {
				error(readerMessages.getString("PARAMETRO_REPETIDO",p.getVariable().getNombre(), subproceso.getNombre().replace("(", "")), p.getVariable(), DiagramapseudocodigoPackage.Literals.VARIABLE__NOMBRE);
			}
		}
	}
	
	/* 23) */ @Check /* -------------------------------------------------------------------------------------------------------------- */
	/**
	 * Función que se encarga de comprobar si el limite inferior de un subrango es siempre inferior al superior.
	 * @param subrango
	 */
	protected void check(Subrango subrango) {
		if(subrango instanceof SubrangoNumerico) {
			SubrangoNumerico sn = (SubrangoNumerico) subrango;
			if(sn.getLimite_inf() > sn.getLimite_sup()) {
				error(readerMessages.getBundle().getString("SUBRANGO_LIMITES"),DiagramapseudocodigoPackage.Literals.TIPO_COMPLEJO__NOMBRE);
			}
		}
	}
	
	
	/* 24) */ @Check /* -------------------------------------------------------------------------------------------------------------- */
	/**
	 * Función que se encarga de comprobar que los limites inferior y superior de un SubrangoEnumerado estén ordenados.
	 * @param subrango
	 */
	protected void check(SubrangoEnumerado subrango) {
		Algoritmo algoritmo = EcoreUtil2.getContainerOfType(subrango, Algoritmo.class);
		Modulo modulo = EcoreUtil2.getContainerOfType(subrango, Modulo.class);
		List<TipoComplejo> complejos;
		ArrayList<String> enumerados = new ArrayList<String>();
		Map<String, ArrayList<String>> variablesEnumerados = new HashMap<String, ArrayList<String>>();
		
		if(algoritmo != null) {
			complejos = algoritmo.getComplejos();
		} else {
			complejos = modulo.getImplementacion().getComplejos();
		}
		
		for(TipoComplejo t: complejos) {
			if(t instanceof Enumerado) {
				Enumerado enumerado = (Enumerado) t;
				enumerados.add(enumerado.getNombre());
				variablesEnumerados.put(enumerado.getNombre(), new ArrayList<String>());
				for(Valor v: enumerado.getPosiblesValores()) {
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
		
		String limite_inf = subrango.getLimite_inf();
		String limite_sup = subrango.getLimite_sup();
		boolean contieneLimites = false;
		
		for(String nombreEnumerado: enumerados) {
			if(variablesEnumerados.get(nombreEnumerado).contains(limite_inf) && variablesEnumerados.get(nombreEnumerado).contains(limite_sup)) {
				contieneLimites = true;
				if(variablesEnumerados.get(nombreEnumerado).indexOf(limite_inf) > variablesEnumerados.get(nombreEnumerado).indexOf(limite_sup)) {
					error(readerMessages.getBundle().getString("SUBRANGO_LIMITES_ENUMERADO"), subrango, DiagramapseudocodigoPackage.Literals.TIPO_COMPLEJO__NOMBRE);
				}
			}
		}
		if(!contieneLimites) {
			error(readerMessages.getBundle().getString("SUBRANGO_ENUMERADO_NO_DEFINIDO"), subrango, DiagramapseudocodigoPackage.Literals.TIPO_COMPLEJO__NOMBRE);
		}
	}
	
	/* 25) */ @Check /* -------------------------------------------------------------------------------------------------------------- */
	/**
	 * Función encargada de comprobar que la variable utilizada para almacenar el valor en una AsignacionNormal haya sido previamente declarada.
	 * @param asignacion
	 */
	protected void check(AsignacionNormal asignacion) {
		Algoritmo algoritmo = EcoreUtil2.getContainerOfType(asignacion, Algoritmo.class);
		Modulo modulo = EcoreUtil2.getContainerOfType(asignacion, Modulo.class);
		Subproceso subproceso =  EcoreUtil2.getContainerOfType(asignacion, Subproceso.class);
		Map<String, String> variablesDefinidas;
		
		if(algoritmo != null && subproceso == null) {
			variablesDefinidas = funciones.getVariablesDefinidasTipadas(algoritmo.getInicio().getDeclaraciones(), null, algoritmo.getGlobales(), algoritmo.getImportaciones());
			variablesDefinidas.putAll(funciones.getConstantesTipadas(algoritmo.getConstantes(), algoritmo.getImportaciones(), readerMessages));
		} else if(algoritmo != null && subproceso != null) {
			variablesDefinidas = funciones.getVariablesDefinidasTipadas(subproceso.getDeclaraciones(), subproceso.getParametros(), algoritmo.getGlobales(), algoritmo.getImportaciones());
			variablesDefinidas.putAll(funciones.getConstantesTipadas(algoritmo.getConstantes(), algoritmo.getImportaciones(), readerMessages));
		} else {
			variablesDefinidas = funciones.getVariablesDefinidasTipadas(subproceso.getDeclaraciones(), subproceso.getParametros(), modulo.getImplementacion().getGlobales(), modulo.getImportaciones());
			variablesDefinidas.putAll(funciones.getConstantesTipadas(modulo.getImplementacion().getConstantes(), modulo.getImportaciones(), readerMessages));
		}
		
		if(!variablesDefinidas.containsKey(asignacion.getValor_asignacion())) {
			error(readerMessages.getString("VARIABLE_NO_DECLARADA", asignacion.getValor_asignacion()), asignacion, DiagramapseudocodigoPackage.Literals.ASIGNACION_NORMAL__VALOR_ASIGNACION, VARIABLE_NO_DEFINIDA);
		}
	}
}
