/**
 */
package diagramapseudocodigo.impl;

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
import diagramapseudocodigo.CadenaCaracteres;
import diagramapseudocodigo.CampoRegistro;
import diagramapseudocodigo.Caracter;
import diagramapseudocodigo.Caso;
import diagramapseudocodigo.Codigo;
import diagramapseudocodigo.Comentario;
import diagramapseudocodigo.Comparacion;
import diagramapseudocodigo.Constante;
import diagramapseudocodigo.Declaracion;
import diagramapseudocodigo.DeclaracionBasica;
import diagramapseudocodigo.DeclaracionDefinida;
import diagramapseudocodigo.Desde;
import diagramapseudocodigo.Devolver;
import diagramapseudocodigo.DiagramapseudocodigoFactory;
import diagramapseudocodigo.DiagramapseudocodigoPackage;
import diagramapseudocodigo.DivisionEntera;
import diagramapseudocodigo.DivisionReal;
import diagramapseudocodigo.Entero;
import diagramapseudocodigo.Enumerado;
import diagramapseudocodigo.Escribir;
import diagramapseudocodigo.Funcion;
import diagramapseudocodigo.FuncionFicheroAbrir;
import diagramapseudocodigo.FuncionFicheroCerrar;
import diagramapseudocodigo.FuncionInterna;
import diagramapseudocodigo.Igualdad;
import diagramapseudocodigo.Implementacion;
import diagramapseudocodigo.Inicio;
import diagramapseudocodigo.Leer;
import diagramapseudocodigo.LlamadaFuncion;
import diagramapseudocodigo.Logico;
import diagramapseudocodigo.Matriz;
import diagramapseudocodigo.Mientras;
import diagramapseudocodigo.Mod;
import diagramapseudocodigo.ModoApertura;
import diagramapseudocodigo.Modulo;
import diagramapseudocodigo.Multiplicacion;
import diagramapseudocodigo.Operacion;
import diagramapseudocodigo.OperacionCompleta;
import diagramapseudocodigo.OperacionParentesis;
import diagramapseudocodigo.Operador;
import diagramapseudocodigo.Or;
import diagramapseudocodigo.Parametro;
import diagramapseudocodigo.Procedimiento;
import diagramapseudocodigo.Real;
import diagramapseudocodigo.Registro;
import diagramapseudocodigo.Repetir;
import diagramapseudocodigo.Resta;
import diagramapseudocodigo.Segun;
import diagramapseudocodigo.Sentencia;
import diagramapseudocodigo.Si;
import diagramapseudocodigo.Sino;
import diagramapseudocodigo.Subproceso;
import diagramapseudocodigo.Subrango;
import diagramapseudocodigo.SubrangoEnumerado;
import diagramapseudocodigo.SubrangoNumerico;
import diagramapseudocodigo.Suma;
import diagramapseudocodigo.Tipo;
import diagramapseudocodigo.TipoBasico;
import diagramapseudocodigo.TipoComplejo;
import diagramapseudocodigo.TipoDefinido;
import diagramapseudocodigo.Unaria;
import diagramapseudocodigo.Valor;
import diagramapseudocodigo.ValorComplejo;
import diagramapseudocodigo.ValorMatriz;
import diagramapseudocodigo.ValorRegistro;
import diagramapseudocodigo.ValorVector;
import diagramapseudocodigo.Variable;
import diagramapseudocodigo.VariableID;
import diagramapseudocodigo.Vector;
import diagramapseudocodigo.cadena;
import diagramapseudocodigo.signo;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DiagramapseudocodigoPackageImpl extends EPackageImpl implements DiagramapseudocodigoPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass algoritmoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inicioEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sentenciaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass declaracionBasicaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass llamadaFuncionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableIDEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cadenaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cadenaCaracteresEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operadorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enteroEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass asignacionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass escribirEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass funcionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parametroEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass leerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass realEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operacionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass logicoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass siEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sinoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bloqueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mientrasEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass repetirEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass desdeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subprocesoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass procedimientoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass caracterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass funcionInternaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass segunEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass devolverEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass casoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constanteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass declaracionDefinidaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass declaracionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass matrizEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tipoComplejoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass registroEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tipoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tipoDefinidoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tipoBasicoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass archivoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumeradoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subrangoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valorComplejoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valorRegistroEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass campoRegistroEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valorVectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valorMatrizEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass comentarioEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass funcionFicheroAbrirEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass funcionFicheroCerrarEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sumaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass restaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multiplicacionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass divisionEnteraEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass andEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass comparacionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass igualdadEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subrangoNumericoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subrangoEnumeradoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass asignacionNormalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass asignacionComplejaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass codigoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass moduloEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cabeceraSubprocesoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass implementacionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cabeceraProcedimientoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cabeceraFuncionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass divisionRealEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operacionParentesisEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unariaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operacionCompletaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum signoEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum modoAperturaEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see diagramapseudocodigo.DiagramapseudocodigoPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DiagramapseudocodigoPackageImpl() {
		super(eNS_URI, DiagramapseudocodigoFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link DiagramapseudocodigoPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DiagramapseudocodigoPackage init() {
		if (isInited) return (DiagramapseudocodigoPackage)EPackage.Registry.INSTANCE.getEPackage(DiagramapseudocodigoPackage.eNS_URI);

		// Obtain or create and register package
		DiagramapseudocodigoPackageImpl theDiagramapseudocodigoPackage = (DiagramapseudocodigoPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DiagramapseudocodigoPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DiagramapseudocodigoPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theDiagramapseudocodigoPackage.createPackageContents();

		// Initialize created meta-data
		theDiagramapseudocodigoPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDiagramapseudocodigoPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DiagramapseudocodigoPackage.eNS_URI, theDiagramapseudocodigoPackage);
		return theDiagramapseudocodigoPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAlgoritmo() {
		return algoritmoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAlgoritmo_Inicio() {
		return (EReference)algoritmoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAlgoritmo_Subprocesos() {
		return (EReference)algoritmoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAlgoritmo_Nombre() {
		return (EAttribute)algoritmoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAlgoritmo_Constantes() {
		return (EReference)algoritmoEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAlgoritmo_Complejos() {
		return (EReference)algoritmoEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAlgoritmo_Comentarios() {
		return (EReference)algoritmoEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAlgoritmo_Globales() {
		return (EReference)algoritmoEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAlgoritmo_Importaciones() {
		return (EReference)algoritmoEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInicio() {
		return inicioEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInicio_Sentencias() {
		return (EReference)inicioEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInicio_Declaraciones() {
		return (EReference)inicioEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSentencia() {
		return sentenciaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeclaracionBasica() {
		return declaracionBasicaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeclaracionBasica_Tipo() {
		return (EAttribute)declaracionBasicaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeclaracionBasica_Variables() {
		return (EReference)declaracionBasicaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLlamadaFuncion() {
		return llamadaFuncionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLlamadaFuncion_Nombre() {
		return (EAttribute)llamadaFuncionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLlamadaFuncion_Operadores() {
		return (EReference)llamadaFuncionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariableID() {
		return variableIDEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariableID_Mat() {
		return (EAttribute)variableIDEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariableID_Nombre() {
		return (EAttribute)variableIDEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getcadena() {
		return cadenaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCadenaCaracteres() {
		return cadenaCaracteresEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCadenaCaracteres_Valor() {
		return (EAttribute)cadenaCaracteresEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariable() {
		return variableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariable_Nombre() {
		return (EAttribute)variableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariable_Mat() {
		return (EAttribute)variableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperador() {
		return operadorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntero() {
		return enteroEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntero_Valor() {
		return (EAttribute)enteroEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAsignacion() {
		return asignacionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEscribir() {
		return escribirEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEscribir_Operador() {
		return (EReference)escribirEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFuncion() {
		return funcionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFuncion_Tipo() {
		return (EAttribute)funcionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFuncion_Devuelve() {
		return (EReference)funcionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParametro() {
		return parametroEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParametro_Variable() {
		return (EReference)parametroEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParametro_Paso() {
		return (EAttribute)parametroEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParametro_Tipo() {
		return (EReference)parametroEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLeer() {
		return leerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLeer_Variable() {
		return (EReference)leerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReal() {
		return realEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReal_Valor() {
		return (EAttribute)realEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValor() {
		return valorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperacion() {
		return operacionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperacion_EAttribute0rence0() {
		return (EReference)operacionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperacion_NegacionesFinales() {
		return (EAttribute)operacionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperacion_NegacionesIniciales() {
		return (EAttribute)operacionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLogico() {
		return logicoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLogico_Valor() {
		return (EAttribute)logicoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSi() {
		return siEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSi_Sino() {
		return (EReference)siEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSi_Devuelve() {
		return (EReference)siEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSino() {
		return sinoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSino_Sentencias() {
		return (EReference)sinoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSino_Devuelve() {
		return (EReference)sinoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBloque() {
		return bloqueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBloque_Valor() {
		return (EReference)bloqueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBloque_Sentencias() {
		return (EReference)bloqueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMientras() {
		return mientrasEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRepetir() {
		return repetirEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDesde() {
		return desdeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDesde_Asignacion() {
		return (EReference)desdeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubproceso() {
		return subprocesoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubproceso_Parametros() {
		return (EReference)subprocesoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubproceso_Sentencias() {
		return (EReference)subprocesoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubproceso_Nombre() {
		return (EAttribute)subprocesoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubproceso_Declaraciones() {
		return (EReference)subprocesoEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcedimiento() {
		return procedimientoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCaracter() {
		return caracterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCaracter_Valor() {
		return (EAttribute)caracterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFuncionInterna() {
		return funcionInternaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFuncionInterna_Nombre() {
		return (EAttribute)funcionInternaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFuncionInterna_Operadores() {
		return (EReference)funcionInternaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSegun() {
		return segunEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSegun_Casos() {
		return (EReference)segunEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSegun_Devuelve() {
		return (EReference)segunEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDevolver() {
		return devolverEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDevolver_EReference0() {
		return (EReference)devolverEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDevolver_Devuelve() {
		return (EReference)devolverEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCaso() {
		return casoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCaso_Devuelve() {
		return (EReference)casoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCaso_Sentencias() {
		return (EReference)casoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCaso_Operador() {
		return (EReference)casoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstante() {
		return constanteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstante_Variable() {
		return (EReference)constanteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstante_Valor() {
		return (EReference)constanteEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVector() {
		return vectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVector_Valor() {
		return (EReference)vectorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVector_Tipo() {
		return (EReference)vectorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVector_Nombre() {
		return (EAttribute)vectorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeclaracionDefinida() {
		return declaracionDefinidaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeclaracionDefinida_Tipo() {
		return (EAttribute)declaracionDefinidaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeclaracionDefinida_Variables() {
		return (EReference)declaracionDefinidaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeclaracion() {
		return declaracionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMatriz() {
		return matrizEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMatriz_Nombre() {
		return (EAttribute)matrizEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMatriz_Valor() {
		return (EReference)matrizEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMatriz_Tipo() {
		return (EReference)matrizEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTipoComplejo() {
		return tipoComplejoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRegistro() {
		return registroEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegistro_Variable() {
		return (EReference)registroEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegistro_Nombre() {
		return (EAttribute)registroEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTipo() {
		return tipoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTipoDefinido() {
		return tipoDefinidoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTipoDefinido_Tipo() {
		return (EAttribute)tipoDefinidoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTipoBasico() {
		return tipoBasicoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTipoBasico_Tipo() {
		return (EAttribute)tipoBasicoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArchivo() {
		return archivoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArchivo_Nombre() {
		return (EAttribute)archivoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArchivo_Tipo() {
		return (EReference)archivoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnumerado() {
		return enumeradoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnumerado_Nombre() {
		return (EAttribute)enumeradoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnumerado_Valor() {
		return (EReference)enumeradoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubrango() {
		return subrangoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubrango_Nombre() {
		return (EAttribute)subrangoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValorComplejo() {
		return valorComplejoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValorRegistro() {
		return valorRegistroEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValorRegistro_Nombre_registro() {
		return (EAttribute)valorRegistroEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValorRegistro_Campos() {
		return (EReference)valorRegistroEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCampoRegistro() {
		return campoRegistroEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCampoRegistro_Nombre_campo() {
		return (EAttribute)campoRegistroEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCampoRegistro_EReference0() {
		return (EReference)campoRegistroEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCampoRegistro_PrimerIndice() {
		return (EReference)campoRegistroEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCampoRegistro_SegundoIndice() {
		return (EReference)campoRegistroEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValorVector() {
		return valorVectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValorVector_Nombre_vector() {
		return (EAttribute)valorVectorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValorVector_Campos() {
		return (EReference)valorVectorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValorVector_Indice() {
		return (EReference)valorVectorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValorMatriz() {
		return valorMatrizEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValorMatriz_Nombre_matriz() {
		return (EAttribute)valorMatrizEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValorMatriz_Campos() {
		return (EReference)valorMatrizEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValorMatriz_PrimerIndice() {
		return (EReference)valorMatrizEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValorMatriz_SegundoIndice() {
		return (EReference)valorMatrizEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComentario() {
		return comentarioEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComentario_Mensaje() {
		return (EAttribute)comentarioEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFuncionFicheroAbrir() {
		return funcionFicheroAbrirEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFuncionFicheroAbrir_Modo() {
		return (EAttribute)funcionFicheroAbrirEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFuncionFicheroAbrir_Variable() {
		return (EReference)funcionFicheroAbrirEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFuncionFicheroCerrar() {
		return funcionFicheroCerrarEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFuncionFicheroCerrar_Variable() {
		return (EReference)funcionFicheroCerrarEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSuma() {
		return sumaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSuma_Left() {
		return (EReference)sumaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSuma_Right() {
		return (EReference)sumaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSuma_Signo_op() {
		return (EAttribute)sumaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResta() {
		return restaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResta_Left() {
		return (EReference)restaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResta_Right() {
		return (EReference)restaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResta_Signo_op() {
		return (EAttribute)restaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMultiplicacion() {
		return multiplicacionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMultiplicacion_Left() {
		return (EReference)multiplicacionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMultiplicacion_Right() {
		return (EReference)multiplicacionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMultiplicacion_Signo_op() {
		return (EAttribute)multiplicacionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDivisionEntera() {
		return divisionEnteraEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDivisionEntera_Left() {
		return (EReference)divisionEnteraEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDivisionEntera_Right() {
		return (EReference)divisionEnteraEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDivisionEntera_Signo_op() {
		return (EAttribute)divisionEnteraEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOr() {
		return orEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOr_Left() {
		return (EReference)orEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOr_Right() {
		return (EReference)orEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOr_Signo_op() {
		return (EAttribute)orEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnd() {
		return andEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnd_Left() {
		return (EReference)andEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnd_Right() {
		return (EReference)andEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnd_Signo_op() {
		return (EAttribute)andEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComparacion() {
		return comparacionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComparacion_Left() {
		return (EReference)comparacionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComparacion_Right() {
		return (EReference)comparacionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComparacion_Signo_op() {
		return (EAttribute)comparacionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIgualdad() {
		return igualdadEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIgualdad_Left() {
		return (EReference)igualdadEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIgualdad_Right() {
		return (EReference)igualdadEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIgualdad_Signo_op() {
		return (EAttribute)igualdadEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubrangoNumerico() {
		return subrangoNumericoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubrangoNumerico_Limite_inf() {
		return (EAttribute)subrangoNumericoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubrangoNumerico_Limite_sup() {
		return (EAttribute)subrangoNumericoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubrangoEnumerado() {
		return subrangoEnumeradoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubrangoEnumerado_Limite_inf() {
		return (EAttribute)subrangoEnumeradoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubrangoEnumerado_Limite_sup() {
		return (EAttribute)subrangoEnumeradoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAsignacionNormal() {
		return asignacionNormalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAsignacionNormal_Mat() {
		return (EAttribute)asignacionNormalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAsignacionNormal_Valor_asignacion() {
		return (EAttribute)asignacionNormalEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAsignacionNormal_Operador() {
		return (EReference)asignacionNormalEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAsignacionCompleja() {
		return asignacionComplejaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAsignacionCompleja_Operador() {
		return (EReference)asignacionComplejaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAsignacionCompleja_Valor_asignacion() {
		return (EReference)asignacionComplejaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCodigo() {
		return codigoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModulo() {
		return moduloEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModulo_Nombre() {
		return (EAttribute)moduloEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModulo_Implementacion() {
		return (EReference)moduloEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModulo_Importaciones() {
		return (EReference)moduloEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModulo_Exporta_globales() {
		return (EReference)moduloEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModulo_Exporta_tipos() {
		return (EAttribute)moduloEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModulo_Exporta_constantes() {
		return (EAttribute)moduloEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModulo_Exporta_subprocesos() {
		return (EReference)moduloEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCabeceraSubproceso() {
		return cabeceraSubprocesoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCabeceraSubproceso_Nombre() {
		return (EAttribute)cabeceraSubprocesoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCabeceraSubproceso_Parametros() {
		return (EReference)cabeceraSubprocesoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImplementacion() {
		return implementacionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImplementacion_Subprocesos() {
		return (EReference)implementacionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImplementacion_Globales() {
		return (EReference)implementacionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImplementacion_Constantes() {
		return (EReference)implementacionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImplementacion_Complejos() {
		return (EReference)implementacionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCabeceraProcedimiento() {
		return cabeceraProcedimientoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCabeceraFuncion() {
		return cabeceraFuncionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCabeceraFuncion_Tipo() {
		return (EAttribute)cabeceraFuncionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMod() {
		return modEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMod_Signo_op() {
		return (EAttribute)modEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMod_Right() {
		return (EReference)modEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMod_Left() {
		return (EReference)modEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDivisionReal() {
		return divisionRealEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDivisionReal_Signo_op() {
		return (EAttribute)divisionRealEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDivisionReal_Left() {
		return (EReference)divisionRealEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDivisionReal_Right() {
		return (EReference)divisionRealEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperacionParentesis() {
		return operacionParentesisEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperacionParentesis_Valor_operacion() {
		return (EReference)operacionParentesisEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnaria() {
		return unariaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnaria_Right() {
		return (EReference)unariaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnaria_Signo_op() {
		return (EAttribute)unariaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperacionCompleta() {
		return operacionCompletaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperacionCompleta_Valor_operacion() {
		return (EReference)operacionCompletaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getsigno() {
		return signoEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getModoApertura() {
		return modoAperturaEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiagramapseudocodigoFactory getDiagramapseudocodigoFactory() {
		return (DiagramapseudocodigoFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		algoritmoEClass = createEClass(ALGORITMO);
		createEReference(algoritmoEClass, ALGORITMO__INICIO);
		createEReference(algoritmoEClass, ALGORITMO__SUBPROCESOS);
		createEAttribute(algoritmoEClass, ALGORITMO__NOMBRE);
		createEReference(algoritmoEClass, ALGORITMO__CONSTANTES);
		createEReference(algoritmoEClass, ALGORITMO__COMPLEJOS);
		createEReference(algoritmoEClass, ALGORITMO__COMENTARIOS);
		createEReference(algoritmoEClass, ALGORITMO__GLOBALES);
		createEReference(algoritmoEClass, ALGORITMO__IMPORTACIONES);

		inicioEClass = createEClass(INICIO);
		createEReference(inicioEClass, INICIO__SENTENCIAS);
		createEReference(inicioEClass, INICIO__DECLARACIONES);

		sentenciaEClass = createEClass(SENTENCIA);

		declaracionBasicaEClass = createEClass(DECLARACION_BASICA);
		createEAttribute(declaracionBasicaEClass, DECLARACION_BASICA__TIPO);
		createEReference(declaracionBasicaEClass, DECLARACION_BASICA__VARIABLES);

		llamadaFuncionEClass = createEClass(LLAMADA_FUNCION);
		createEAttribute(llamadaFuncionEClass, LLAMADA_FUNCION__NOMBRE);
		createEReference(llamadaFuncionEClass, LLAMADA_FUNCION__OPERADORES);

		variableIDEClass = createEClass(VARIABLE_ID);
		createEAttribute(variableIDEClass, VARIABLE_ID__MAT);
		createEAttribute(variableIDEClass, VARIABLE_ID__NOMBRE);

		cadenaEClass = createEClass(CADENA);

		cadenaCaracteresEClass = createEClass(CADENA_CARACTERES);
		createEAttribute(cadenaCaracteresEClass, CADENA_CARACTERES__VALOR);

		variableEClass = createEClass(VARIABLE);
		createEAttribute(variableEClass, VARIABLE__NOMBRE);
		createEAttribute(variableEClass, VARIABLE__MAT);

		operadorEClass = createEClass(OPERADOR);

		enteroEClass = createEClass(ENTERO);
		createEAttribute(enteroEClass, ENTERO__VALOR);

		asignacionEClass = createEClass(ASIGNACION);

		escribirEClass = createEClass(ESCRIBIR);
		createEReference(escribirEClass, ESCRIBIR__OPERADOR);

		funcionEClass = createEClass(FUNCION);
		createEAttribute(funcionEClass, FUNCION__TIPO);
		createEReference(funcionEClass, FUNCION__DEVUELVE);

		parametroEClass = createEClass(PARAMETRO);
		createEReference(parametroEClass, PARAMETRO__VARIABLE);
		createEAttribute(parametroEClass, PARAMETRO__PASO);
		createEReference(parametroEClass, PARAMETRO__TIPO);

		leerEClass = createEClass(LEER);
		createEReference(leerEClass, LEER__VARIABLE);

		realEClass = createEClass(REAL);
		createEAttribute(realEClass, REAL__VALOR);

		valorEClass = createEClass(VALOR);

		operacionEClass = createEClass(OPERACION);
		createEReference(operacionEClass, OPERACION__EATTRIBUTE0RENCE0);
		createEAttribute(operacionEClass, OPERACION__NEGACIONES_FINALES);
		createEAttribute(operacionEClass, OPERACION__NEGACIONES_INICIALES);

		logicoEClass = createEClass(LOGICO);
		createEAttribute(logicoEClass, LOGICO__VALOR);

		siEClass = createEClass(SI);
		createEReference(siEClass, SI__SINO);
		createEReference(siEClass, SI__DEVUELVE);

		sinoEClass = createEClass(SINO);
		createEReference(sinoEClass, SINO__SENTENCIAS);
		createEReference(sinoEClass, SINO__DEVUELVE);

		bloqueEClass = createEClass(BLOQUE);
		createEReference(bloqueEClass, BLOQUE__VALOR);
		createEReference(bloqueEClass, BLOQUE__SENTENCIAS);

		mientrasEClass = createEClass(MIENTRAS);

		repetirEClass = createEClass(REPETIR);

		desdeEClass = createEClass(DESDE);
		createEReference(desdeEClass, DESDE__ASIGNACION);

		subprocesoEClass = createEClass(SUBPROCESO);
		createEReference(subprocesoEClass, SUBPROCESO__PARAMETROS);
		createEReference(subprocesoEClass, SUBPROCESO__SENTENCIAS);
		createEAttribute(subprocesoEClass, SUBPROCESO__NOMBRE);
		createEReference(subprocesoEClass, SUBPROCESO__DECLARACIONES);

		procedimientoEClass = createEClass(PROCEDIMIENTO);

		caracterEClass = createEClass(CARACTER);
		createEAttribute(caracterEClass, CARACTER__VALOR);

		funcionInternaEClass = createEClass(FUNCION_INTERNA);
		createEAttribute(funcionInternaEClass, FUNCION_INTERNA__NOMBRE);
		createEReference(funcionInternaEClass, FUNCION_INTERNA__OPERADORES);

		segunEClass = createEClass(SEGUN);
		createEReference(segunEClass, SEGUN__CASOS);
		createEReference(segunEClass, SEGUN__DEVUELVE);

		devolverEClass = createEClass(DEVOLVER);
		createEReference(devolverEClass, DEVOLVER__EREFERENCE0);
		createEReference(devolverEClass, DEVOLVER__DEVUELVE);

		casoEClass = createEClass(CASO);
		createEReference(casoEClass, CASO__DEVUELVE);
		createEReference(casoEClass, CASO__SENTENCIAS);
		createEReference(casoEClass, CASO__OPERADOR);

		constanteEClass = createEClass(CONSTANTE);
		createEReference(constanteEClass, CONSTANTE__VARIABLE);
		createEReference(constanteEClass, CONSTANTE__VALOR);

		vectorEClass = createEClass(VECTOR);
		createEReference(vectorEClass, VECTOR__VALOR);
		createEReference(vectorEClass, VECTOR__TIPO);
		createEAttribute(vectorEClass, VECTOR__NOMBRE);

		declaracionDefinidaEClass = createEClass(DECLARACION_DEFINIDA);
		createEAttribute(declaracionDefinidaEClass, DECLARACION_DEFINIDA__TIPO);
		createEReference(declaracionDefinidaEClass, DECLARACION_DEFINIDA__VARIABLES);

		declaracionEClass = createEClass(DECLARACION);

		matrizEClass = createEClass(MATRIZ);
		createEAttribute(matrizEClass, MATRIZ__NOMBRE);
		createEReference(matrizEClass, MATRIZ__VALOR);
		createEReference(matrizEClass, MATRIZ__TIPO);

		tipoComplejoEClass = createEClass(TIPO_COMPLEJO);

		registroEClass = createEClass(REGISTRO);
		createEReference(registroEClass, REGISTRO__VARIABLE);
		createEAttribute(registroEClass, REGISTRO__NOMBRE);

		tipoEClass = createEClass(TIPO);

		tipoDefinidoEClass = createEClass(TIPO_DEFINIDO);
		createEAttribute(tipoDefinidoEClass, TIPO_DEFINIDO__TIPO);

		tipoBasicoEClass = createEClass(TIPO_BASICO);
		createEAttribute(tipoBasicoEClass, TIPO_BASICO__TIPO);

		archivoEClass = createEClass(ARCHIVO);
		createEAttribute(archivoEClass, ARCHIVO__NOMBRE);
		createEReference(archivoEClass, ARCHIVO__TIPO);

		enumeradoEClass = createEClass(ENUMERADO);
		createEAttribute(enumeradoEClass, ENUMERADO__NOMBRE);
		createEReference(enumeradoEClass, ENUMERADO__VALOR);

		subrangoEClass = createEClass(SUBRANGO);
		createEAttribute(subrangoEClass, SUBRANGO__NOMBRE);

		valorComplejoEClass = createEClass(VALOR_COMPLEJO);

		valorRegistroEClass = createEClass(VALOR_REGISTRO);
		createEAttribute(valorRegistroEClass, VALOR_REGISTRO__NOMBRE_REGISTRO);
		createEReference(valorRegistroEClass, VALOR_REGISTRO__CAMPOS);

		campoRegistroEClass = createEClass(CAMPO_REGISTRO);
		createEAttribute(campoRegistroEClass, CAMPO_REGISTRO__NOMBRE_CAMPO);
		createEReference(campoRegistroEClass, CAMPO_REGISTRO__EREFERENCE0);
		createEReference(campoRegistroEClass, CAMPO_REGISTRO__PRIMER_INDICE);
		createEReference(campoRegistroEClass, CAMPO_REGISTRO__SEGUNDO_INDICE);

		valorVectorEClass = createEClass(VALOR_VECTOR);
		createEAttribute(valorVectorEClass, VALOR_VECTOR__NOMBRE_VECTOR);
		createEReference(valorVectorEClass, VALOR_VECTOR__CAMPOS);
		createEReference(valorVectorEClass, VALOR_VECTOR__INDICE);

		valorMatrizEClass = createEClass(VALOR_MATRIZ);
		createEAttribute(valorMatrizEClass, VALOR_MATRIZ__NOMBRE_MATRIZ);
		createEReference(valorMatrizEClass, VALOR_MATRIZ__CAMPOS);
		createEReference(valorMatrizEClass, VALOR_MATRIZ__PRIMER_INDICE);
		createEReference(valorMatrizEClass, VALOR_MATRIZ__SEGUNDO_INDICE);

		comentarioEClass = createEClass(COMENTARIO);
		createEAttribute(comentarioEClass, COMENTARIO__MENSAJE);

		funcionFicheroAbrirEClass = createEClass(FUNCION_FICHERO_ABRIR);
		createEAttribute(funcionFicheroAbrirEClass, FUNCION_FICHERO_ABRIR__MODO);
		createEReference(funcionFicheroAbrirEClass, FUNCION_FICHERO_ABRIR__VARIABLE);

		funcionFicheroCerrarEClass = createEClass(FUNCION_FICHERO_CERRAR);
		createEReference(funcionFicheroCerrarEClass, FUNCION_FICHERO_CERRAR__VARIABLE);

		sumaEClass = createEClass(SUMA);
		createEReference(sumaEClass, SUMA__LEFT);
		createEReference(sumaEClass, SUMA__RIGHT);
		createEAttribute(sumaEClass, SUMA__SIGNO_OP);

		restaEClass = createEClass(RESTA);
		createEReference(restaEClass, RESTA__LEFT);
		createEReference(restaEClass, RESTA__RIGHT);
		createEAttribute(restaEClass, RESTA__SIGNO_OP);

		multiplicacionEClass = createEClass(MULTIPLICACION);
		createEReference(multiplicacionEClass, MULTIPLICACION__LEFT);
		createEReference(multiplicacionEClass, MULTIPLICACION__RIGHT);
		createEAttribute(multiplicacionEClass, MULTIPLICACION__SIGNO_OP);

		divisionEnteraEClass = createEClass(DIVISION_ENTERA);
		createEReference(divisionEnteraEClass, DIVISION_ENTERA__LEFT);
		createEReference(divisionEnteraEClass, DIVISION_ENTERA__RIGHT);
		createEAttribute(divisionEnteraEClass, DIVISION_ENTERA__SIGNO_OP);

		orEClass = createEClass(OR);
		createEReference(orEClass, OR__LEFT);
		createEReference(orEClass, OR__RIGHT);
		createEAttribute(orEClass, OR__SIGNO_OP);

		andEClass = createEClass(AND);
		createEReference(andEClass, AND__LEFT);
		createEReference(andEClass, AND__RIGHT);
		createEAttribute(andEClass, AND__SIGNO_OP);

		comparacionEClass = createEClass(COMPARACION);
		createEReference(comparacionEClass, COMPARACION__LEFT);
		createEReference(comparacionEClass, COMPARACION__RIGHT);
		createEAttribute(comparacionEClass, COMPARACION__SIGNO_OP);

		igualdadEClass = createEClass(IGUALDAD);
		createEReference(igualdadEClass, IGUALDAD__LEFT);
		createEReference(igualdadEClass, IGUALDAD__RIGHT);
		createEAttribute(igualdadEClass, IGUALDAD__SIGNO_OP);

		subrangoNumericoEClass = createEClass(SUBRANGO_NUMERICO);
		createEAttribute(subrangoNumericoEClass, SUBRANGO_NUMERICO__LIMITE_INF);
		createEAttribute(subrangoNumericoEClass, SUBRANGO_NUMERICO__LIMITE_SUP);

		subrangoEnumeradoEClass = createEClass(SUBRANGO_ENUMERADO);
		createEAttribute(subrangoEnumeradoEClass, SUBRANGO_ENUMERADO__LIMITE_INF);
		createEAttribute(subrangoEnumeradoEClass, SUBRANGO_ENUMERADO__LIMITE_SUP);

		asignacionNormalEClass = createEClass(ASIGNACION_NORMAL);
		createEAttribute(asignacionNormalEClass, ASIGNACION_NORMAL__MAT);
		createEAttribute(asignacionNormalEClass, ASIGNACION_NORMAL__VALOR_ASIGNACION);
		createEReference(asignacionNormalEClass, ASIGNACION_NORMAL__OPERADOR);

		asignacionComplejaEClass = createEClass(ASIGNACION_COMPLEJA);
		createEReference(asignacionComplejaEClass, ASIGNACION_COMPLEJA__OPERADOR);
		createEReference(asignacionComplejaEClass, ASIGNACION_COMPLEJA__VALOR_ASIGNACION);

		codigoEClass = createEClass(CODIGO);

		moduloEClass = createEClass(MODULO);
		createEAttribute(moduloEClass, MODULO__NOMBRE);
		createEReference(moduloEClass, MODULO__IMPLEMENTACION);
		createEReference(moduloEClass, MODULO__IMPORTACIONES);
		createEReference(moduloEClass, MODULO__EXPORTA_GLOBALES);
		createEAttribute(moduloEClass, MODULO__EXPORTA_TIPOS);
		createEAttribute(moduloEClass, MODULO__EXPORTA_CONSTANTES);
		createEReference(moduloEClass, MODULO__EXPORTA_SUBPROCESOS);

		cabeceraSubprocesoEClass = createEClass(CABECERA_SUBPROCESO);
		createEAttribute(cabeceraSubprocesoEClass, CABECERA_SUBPROCESO__NOMBRE);
		createEReference(cabeceraSubprocesoEClass, CABECERA_SUBPROCESO__PARAMETROS);

		implementacionEClass = createEClass(IMPLEMENTACION);
		createEReference(implementacionEClass, IMPLEMENTACION__SUBPROCESOS);
		createEReference(implementacionEClass, IMPLEMENTACION__GLOBALES);
		createEReference(implementacionEClass, IMPLEMENTACION__CONSTANTES);
		createEReference(implementacionEClass, IMPLEMENTACION__COMPLEJOS);

		cabeceraProcedimientoEClass = createEClass(CABECERA_PROCEDIMIENTO);

		cabeceraFuncionEClass = createEClass(CABECERA_FUNCION);
		createEAttribute(cabeceraFuncionEClass, CABECERA_FUNCION__TIPO);

		modEClass = createEClass(MOD);
		createEAttribute(modEClass, MOD__SIGNO_OP);
		createEReference(modEClass, MOD__RIGHT);
		createEReference(modEClass, MOD__LEFT);

		divisionRealEClass = createEClass(DIVISION_REAL);
		createEAttribute(divisionRealEClass, DIVISION_REAL__SIGNO_OP);
		createEReference(divisionRealEClass, DIVISION_REAL__LEFT);
		createEReference(divisionRealEClass, DIVISION_REAL__RIGHT);

		operacionParentesisEClass = createEClass(OPERACION_PARENTESIS);
		createEReference(operacionParentesisEClass, OPERACION_PARENTESIS__VALOR_OPERACION);

		unariaEClass = createEClass(UNARIA);
		createEReference(unariaEClass, UNARIA__RIGHT);
		createEAttribute(unariaEClass, UNARIA__SIGNO_OP);

		operacionCompletaEClass = createEClass(OPERACION_COMPLETA);
		createEReference(operacionCompletaEClass, OPERACION_COMPLETA__VALOR_OPERACION);

		// Create enums
		signoEEnum = createEEnum(SIGNO);
		modoAperturaEEnum = createEEnum(MODO_APERTURA);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		algoritmoEClass.getESuperTypes().add(this.getCodigo());
		declaracionBasicaEClass.getESuperTypes().add(this.getDeclaracion());
		llamadaFuncionEClass.getESuperTypes().add(this.getValor());
		llamadaFuncionEClass.getESuperTypes().add(this.getOperacion());
		variableIDEClass.getESuperTypes().add(this.getOperador());
		variableIDEClass.getESuperTypes().add(this.getOperacion());
		cadenaCaracteresEClass.getESuperTypes().add(this.getOperador());
		cadenaCaracteresEClass.getESuperTypes().add(this.getOperacion());
		operadorEClass.getESuperTypes().add(this.getValor());
		enteroEClass.getESuperTypes().add(this.getOperador());
		enteroEClass.getESuperTypes().add(this.getOperacion());
		asignacionEClass.getESuperTypes().add(this.getSentencia());
		escribirEClass.getESuperTypes().add(this.getSentencia());
		funcionEClass.getESuperTypes().add(this.getSubproceso());
		leerEClass.getESuperTypes().add(this.getSentencia());
		realEClass.getESuperTypes().add(this.getOperador());
		realEClass.getESuperTypes().add(this.getOperacion());
		operacionEClass.getESuperTypes().add(this.getValor());
		operacionEClass.getESuperTypes().add(this.getSentencia());
		logicoEClass.getESuperTypes().add(this.getOperador());
		logicoEClass.getESuperTypes().add(this.getOperacion());
		siEClass.getESuperTypes().add(this.getBloque());
		bloqueEClass.getESuperTypes().add(this.getSentencia());
		mientrasEClass.getESuperTypes().add(this.getBloque());
		repetirEClass.getESuperTypes().add(this.getBloque());
		desdeEClass.getESuperTypes().add(this.getBloque());
		procedimientoEClass.getESuperTypes().add(this.getSubproceso());
		caracterEClass.getESuperTypes().add(this.getOperador());
		caracterEClass.getESuperTypes().add(this.getOperacion());
		funcionInternaEClass.getESuperTypes().add(this.getValor());
		funcionInternaEClass.getESuperTypes().add(this.getOperacion());
		segunEClass.getESuperTypes().add(this.getBloque());
		vectorEClass.getESuperTypes().add(this.getTipoComplejo());
		declaracionDefinidaEClass.getESuperTypes().add(this.getDeclaracion());
		matrizEClass.getESuperTypes().add(this.getTipoComplejo());
		registroEClass.getESuperTypes().add(this.getTipoComplejo());
		tipoDefinidoEClass.getESuperTypes().add(this.getTipo());
		tipoBasicoEClass.getESuperTypes().add(this.getTipo());
		archivoEClass.getESuperTypes().add(this.getTipoComplejo());
		enumeradoEClass.getESuperTypes().add(this.getTipoComplejo());
		subrangoEClass.getESuperTypes().add(this.getTipoComplejo());
		valorComplejoEClass.getESuperTypes().add(this.getOperador());
		valorComplejoEClass.getESuperTypes().add(this.getSentencia());
		valorComplejoEClass.getESuperTypes().add(this.getOperacion());
		valorRegistroEClass.getESuperTypes().add(this.getValorComplejo());
		valorVectorEClass.getESuperTypes().add(this.getValorComplejo());
		valorMatrizEClass.getESuperTypes().add(this.getValorComplejo());
		funcionFicheroAbrirEClass.getESuperTypes().add(this.getSentencia());
		funcionFicheroCerrarEClass.getESuperTypes().add(this.getSentencia());
		sumaEClass.getESuperTypes().add(this.getOperacion());
		restaEClass.getESuperTypes().add(this.getOperacion());
		multiplicacionEClass.getESuperTypes().add(this.getOperacion());
		divisionEnteraEClass.getESuperTypes().add(this.getOperacion());
		orEClass.getESuperTypes().add(this.getOperacion());
		andEClass.getESuperTypes().add(this.getOperacion());
		comparacionEClass.getESuperTypes().add(this.getOperacion());
		igualdadEClass.getESuperTypes().add(this.getOperacion());
		subrangoNumericoEClass.getESuperTypes().add(this.getSubrango());
		subrangoEnumeradoEClass.getESuperTypes().add(this.getSubrango());
		asignacionNormalEClass.getESuperTypes().add(this.getAsignacion());
		asignacionComplejaEClass.getESuperTypes().add(this.getAsignacion());
		moduloEClass.getESuperTypes().add(this.getCodigo());
		cabeceraProcedimientoEClass.getESuperTypes().add(this.getCabeceraSubproceso());
		cabeceraFuncionEClass.getESuperTypes().add(this.getCabeceraSubproceso());
		modEClass.getESuperTypes().add(this.getOperacion());
		divisionRealEClass.getESuperTypes().add(this.getOperacion());
		operacionParentesisEClass.getESuperTypes().add(this.getOperacion());
		unariaEClass.getESuperTypes().add(this.getOperacion());
		operacionCompletaEClass.getESuperTypes().add(this.getOperacion());

		// Initialize classes, features, and operations; add parameters
		initEClass(algoritmoEClass, Algoritmo.class, "Algoritmo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAlgoritmo_Inicio(), this.getInicio(), null, "inicio", null, 1, 1, Algoritmo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAlgoritmo_Subprocesos(), this.getSubproceso(), null, "subprocesos", null, 0, -1, Algoritmo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAlgoritmo_Nombre(), ecorePackage.getEString(), "nombre", null, 0, 1, Algoritmo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAlgoritmo_Constantes(), this.getConstante(), null, "constantes", null, 0, -1, Algoritmo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAlgoritmo_Complejos(), this.getTipoComplejo(), null, "complejos", null, 0, -1, Algoritmo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAlgoritmo_Comentarios(), this.getComentario(), null, "comentarios", null, 0, -1, Algoritmo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAlgoritmo_Globales(), this.getDeclaracion(), null, "globales", null, 0, -1, Algoritmo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAlgoritmo_Importaciones(), this.getModulo(), null, "importaciones", null, 0, -1, Algoritmo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inicioEClass, Inicio.class, "Inicio", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInicio_Sentencias(), this.getSentencia(), null, "sentencias", null, 0, -1, Inicio.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInicio_Declaraciones(), this.getDeclaracion(), null, "declaraciones", null, 0, -1, Inicio.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sentenciaEClass, Sentencia.class, "Sentencia", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(declaracionBasicaEClass, DeclaracionBasica.class, "DeclaracionBasica", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDeclaracionBasica_Tipo(), ecorePackage.getEString(), "tipo", null, 1, 1, DeclaracionBasica.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeclaracionBasica_Variables(), this.getVariable(), null, "variables", null, 0, -1, DeclaracionBasica.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(llamadaFuncionEClass, LlamadaFuncion.class, "LlamadaFuncion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLlamadaFuncion_Nombre(), ecorePackage.getEString(), "nombre", null, 1, 1, LlamadaFuncion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLlamadaFuncion_Operadores(), this.getOperacion(), null, "operadores", null, 0, -1, LlamadaFuncion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(variableIDEClass, VariableID.class, "VariableID", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVariableID_Mat(), ecorePackage.getEString(), "Mat", null, 0, -1, VariableID.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVariableID_Nombre(), ecorePackage.getEString(), "nombre", null, 0, 1, VariableID.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cadenaEClass, cadena.class, "cadena", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(cadenaCaracteresEClass, CadenaCaracteres.class, "CadenaCaracteres", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCadenaCaracteres_Valor(), ecorePackage.getEString(), "valor", null, 1, 1, CadenaCaracteres.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(variableEClass, Variable.class, "Variable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVariable_Nombre(), ecorePackage.getEString(), "nombre", null, 1, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVariable_Mat(), ecorePackage.getEString(), "Mat", null, 0, -1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(operadorEClass, Operador.class, "Operador", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(enteroEClass, Entero.class, "Entero", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEntero_Valor(), ecorePackage.getEInt(), "valor", null, 1, 1, Entero.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(asignacionEClass, Asignacion.class, "Asignacion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(escribirEClass, Escribir.class, "Escribir", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEscribir_Operador(), this.getOperacion(), null, "operador", null, 1, -1, Escribir.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(funcionEClass, Funcion.class, "Funcion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFuncion_Tipo(), ecorePackage.getEString(), "tipo", null, 0, 1, Funcion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFuncion_Devuelve(), this.getDevolver(), null, "devuelve", null, 0, 1, Funcion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parametroEClass, Parametro.class, "Parametro", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getParametro_Variable(), this.getVariable(), null, "variable", null, 1, 1, Parametro.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParametro_Paso(), ecorePackage.getEString(), "paso", null, 1, 1, Parametro.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParametro_Tipo(), this.getTipo(), null, "tipo", null, 1, 1, Parametro.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(leerEClass, Leer.class, "Leer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLeer_Variable(), this.getOperacion(), null, "variable", null, 1, -1, Leer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(realEClass, Real.class, "Real", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getReal_Valor(), ecorePackage.getEFloat(), "valor", null, 1, 1, Real.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(valorEClass, Valor.class, "Valor", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(operacionEClass, Operacion.class, "Operacion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOperacion_EAttribute0rence0(), this.getOperacion(), null, "EAttribute0rence0", null, 0, 1, Operacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOperacion_NegacionesFinales(), ecorePackage.getEString(), "negacionesFinales", null, 0, -1, Operacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOperacion_NegacionesIniciales(), ecorePackage.getEString(), "negacionesIniciales", null, 0, -1, Operacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(logicoEClass, Logico.class, "Logico", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLogico_Valor(), ecorePackage.getEString(), "valor", null, 1, 1, Logico.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(siEClass, Si.class, "Si", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSi_Sino(), this.getSino(), null, "sino", null, 0, 1, Si.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSi_Devuelve(), this.getDevolver(), null, "devuelve", null, 0, 1, Si.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sinoEClass, Sino.class, "Sino", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSino_Sentencias(), this.getSentencia(), null, "sentencias", null, 0, -1, Sino.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSino_Devuelve(), this.getDevolver(), null, "devuelve", null, 0, 1, Sino.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bloqueEClass, Bloque.class, "Bloque", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBloque_Valor(), this.getOperacion(), null, "valor", null, 1, 1, Bloque.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBloque_Sentencias(), this.getSentencia(), null, "sentencias", null, 0, -1, Bloque.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mientrasEClass, Mientras.class, "Mientras", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(repetirEClass, Repetir.class, "Repetir", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(desdeEClass, Desde.class, "Desde", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDesde_Asignacion(), this.getAsignacionNormal(), null, "asignacion", null, 1, 1, Desde.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(subprocesoEClass, Subproceso.class, "Subproceso", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSubproceso_Parametros(), this.getParametro(), null, "parametros", null, 0, -1, Subproceso.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubproceso_Sentencias(), this.getSentencia(), null, "sentencias", null, 0, -1, Subproceso.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSubproceso_Nombre(), ecorePackage.getEString(), "nombre", null, 1, 1, Subproceso.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubproceso_Declaraciones(), this.getDeclaracion(), null, "declaraciones", null, 0, -1, Subproceso.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(procedimientoEClass, Procedimiento.class, "Procedimiento", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(caracterEClass, Caracter.class, "Caracter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCaracter_Valor(), ecorePackage.getEString(), "valor", null, 1, 1, Caracter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(funcionInternaEClass, FuncionInterna.class, "FuncionInterna", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFuncionInterna_Nombre(), ecorePackage.getEString(), "nombre", null, 0, 1, FuncionInterna.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFuncionInterna_Operadores(), this.getOperacion(), null, "operadores", null, 0, -1, FuncionInterna.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(segunEClass, Segun.class, "Segun", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSegun_Casos(), this.getCaso(), null, "casos", null, 0, -1, Segun.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSegun_Devuelve(), this.getDevolver(), null, "devuelve", null, 0, 1, Segun.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(devolverEClass, Devolver.class, "Devolver", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDevolver_EReference0(), this.getDevolver(), null, "EReference0", null, 0, 1, Devolver.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDevolver_Devuelve(), this.getOperacion(), null, "devuelve", null, 1, 1, Devolver.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(casoEClass, Caso.class, "Caso", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCaso_Devuelve(), this.getDevolver(), null, "devuelve", null, 0, 1, Caso.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCaso_Sentencias(), this.getSentencia(), null, "sentencias", null, 0, -1, Caso.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCaso_Operador(), this.getOperacion(), null, "operador", null, 1, 1, Caso.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(constanteEClass, Constante.class, "Constante", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConstante_Variable(), this.getVariable(), null, "variable", null, 1, 1, Constante.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConstante_Valor(), this.getOperacion(), null, "valor", null, 1, 1, Constante.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vectorEClass, Vector.class, "Vector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVector_Valor(), this.getOperacion(), null, "valor", null, 0, 1, Vector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVector_Tipo(), this.getTipo(), null, "tipo", null, 1, 1, Vector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVector_Nombre(), ecorePackage.getEString(), "nombre", null, 1, 1, Vector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(declaracionDefinidaEClass, DeclaracionDefinida.class, "DeclaracionDefinida", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDeclaracionDefinida_Tipo(), ecorePackage.getEString(), "tipo", null, 1, 1, DeclaracionDefinida.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeclaracionDefinida_Variables(), this.getVariable(), null, "variables", null, 0, -1, DeclaracionDefinida.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(declaracionEClass, Declaracion.class, "Declaracion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(matrizEClass, Matriz.class, "Matriz", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMatriz_Nombre(), ecorePackage.getEString(), "nombre", null, 1, 1, Matriz.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMatriz_Valor(), this.getOperacion(), null, "valor", null, 0, 2, Matriz.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMatriz_Tipo(), this.getTipo(), null, "tipo", null, 1, 1, Matriz.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tipoComplejoEClass, TipoComplejo.class, "TipoComplejo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(registroEClass, Registro.class, "Registro", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRegistro_Variable(), this.getDeclaracion(), null, "variable", null, 1, -1, Registro.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRegistro_Nombre(), ecorePackage.getEString(), "nombre", null, 1, 1, Registro.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tipoEClass, Tipo.class, "Tipo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tipoDefinidoEClass, TipoDefinido.class, "TipoDefinido", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTipoDefinido_Tipo(), ecorePackage.getEString(), "tipo", null, 1, 1, TipoDefinido.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tipoBasicoEClass, TipoBasico.class, "TipoBasico", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTipoBasico_Tipo(), ecorePackage.getEString(), "tipo", null, 1, 1, TipoBasico.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(archivoEClass, Archivo.class, "Archivo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getArchivo_Nombre(), ecorePackage.getEString(), "nombre", null, 1, 1, Archivo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArchivo_Tipo(), this.getTipo(), null, "tipo", null, 1, 1, Archivo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(enumeradoEClass, Enumerado.class, "Enumerado", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEnumerado_Nombre(), ecorePackage.getEString(), "nombre", null, 1, 1, Enumerado.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEnumerado_Valor(), this.getOperacion(), null, "valor", null, 1, -1, Enumerado.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(subrangoEClass, Subrango.class, "Subrango", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSubrango_Nombre(), ecorePackage.getEString(), "nombre", null, 1, 1, Subrango.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(valorComplejoEClass, ValorComplejo.class, "ValorComplejo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(valorRegistroEClass, ValorRegistro.class, "ValorRegistro", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getValorRegistro_Nombre_registro(), ecorePackage.getEString(), "nombre_registro", null, 1, 1, ValorRegistro.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getValorRegistro_Campos(), this.getCampoRegistro(), null, "campos", null, 1, -1, ValorRegistro.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(campoRegistroEClass, CampoRegistro.class, "CampoRegistro", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCampoRegistro_Nombre_campo(), ecorePackage.getEString(), "nombre_campo", null, 1, 1, CampoRegistro.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCampoRegistro_EReference0(), this.getCampoRegistro(), null, "EReference0", null, 0, 1, CampoRegistro.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCampoRegistro_PrimerIndice(), this.getOperacion(), null, "primerIndice", null, 0, 1, CampoRegistro.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCampoRegistro_SegundoIndice(), this.getOperacion(), null, "segundoIndice", null, 0, 1, CampoRegistro.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(valorVectorEClass, ValorVector.class, "ValorVector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getValorVector_Nombre_vector(), ecorePackage.getEString(), "nombre_vector", null, 1, 1, ValorVector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getValorVector_Campos(), this.getCampoRegistro(), null, "campos", null, 0, -1, ValorVector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getValorVector_Indice(), this.getOperacion(), null, "indice", null, 1, 1, ValorVector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(valorMatrizEClass, ValorMatriz.class, "ValorMatriz", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getValorMatriz_Nombre_matriz(), ecorePackage.getEString(), "nombre_matriz", null, 1, 1, ValorMatriz.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getValorMatriz_Campos(), this.getCampoRegistro(), null, "campos", null, 0, -1, ValorMatriz.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getValorMatriz_PrimerIndice(), this.getOperacion(), null, "primerIndice", null, 1, 1, ValorMatriz.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getValorMatriz_SegundoIndice(), this.getOperacion(), null, "segundoIndice", null, 1, 1, ValorMatriz.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(comentarioEClass, Comentario.class, "Comentario", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComentario_Mensaje(), ecorePackage.getEString(), "mensaje", null, 1, 1, Comentario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(funcionFicheroAbrirEClass, FuncionFicheroAbrir.class, "FuncionFicheroAbrir", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFuncionFicheroAbrir_Modo(), this.getModoApertura(), "modo", null, 1, 1, FuncionFicheroAbrir.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFuncionFicheroAbrir_Variable(), this.getOperacion(), null, "variable", null, 2, 2, FuncionFicheroAbrir.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(funcionFicheroCerrarEClass, FuncionFicheroCerrar.class, "FuncionFicheroCerrar", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFuncionFicheroCerrar_Variable(), this.getOperacion(), null, "variable", null, 1, 1, FuncionFicheroCerrar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sumaEClass, Suma.class, "Suma", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSuma_Left(), this.getOperacion(), null, "left", null, 0, 1, Suma.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSuma_Right(), this.getOperacion(), null, "right", null, 0, 1, Suma.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSuma_Signo_op(), this.getsigno(), "signo_op", null, 0, 1, Suma.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(restaEClass, Resta.class, "Resta", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResta_Left(), this.getOperacion(), null, "left", null, 0, 1, Resta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResta_Right(), this.getOperacion(), null, "right", null, 0, 1, Resta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResta_Signo_op(), this.getsigno(), "signo_op", null, 0, 1, Resta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(multiplicacionEClass, Multiplicacion.class, "Multiplicacion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMultiplicacion_Left(), this.getOperacion(), null, "left", null, 0, 1, Multiplicacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMultiplicacion_Right(), this.getOperacion(), null, "right", null, 0, 1, Multiplicacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMultiplicacion_Signo_op(), this.getsigno(), "signo_op", null, 0, 1, Multiplicacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(divisionEnteraEClass, DivisionEntera.class, "DivisionEntera", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDivisionEntera_Left(), this.getOperacion(), null, "left", null, 0, 1, DivisionEntera.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDivisionEntera_Right(), this.getOperacion(), null, "right", null, 0, 1, DivisionEntera.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDivisionEntera_Signo_op(), this.getsigno(), "signo_op", null, 0, 1, DivisionEntera.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(orEClass, Or.class, "Or", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOr_Left(), this.getOperacion(), null, "left", null, 0, 1, Or.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOr_Right(), this.getOperacion(), null, "right", null, 0, 1, Or.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOr_Signo_op(), this.getsigno(), "signo_op", null, 0, 1, Or.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(andEClass, And.class, "And", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAnd_Left(), this.getOperacion(), null, "left", null, 0, 1, And.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAnd_Right(), this.getOperacion(), null, "right", null, 0, 1, And.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnd_Signo_op(), this.getsigno(), "signo_op", null, 0, 1, And.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(comparacionEClass, Comparacion.class, "Comparacion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComparacion_Left(), this.getOperacion(), null, "left", null, 0, 1, Comparacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComparacion_Right(), this.getOperacion(), null, "right", null, 0, 1, Comparacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComparacion_Signo_op(), this.getsigno(), "signo_op", null, 0, 1, Comparacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(igualdadEClass, Igualdad.class, "Igualdad", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIgualdad_Left(), this.getOperacion(), null, "left", null, 0, 1, Igualdad.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIgualdad_Right(), this.getOperacion(), null, "right", null, 0, 1, Igualdad.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIgualdad_Signo_op(), this.getsigno(), "signo_op", null, 0, 1, Igualdad.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(subrangoNumericoEClass, SubrangoNumerico.class, "SubrangoNumerico", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSubrangoNumerico_Limite_inf(), ecorePackage.getEInt(), "limite_inf", null, 1, 1, SubrangoNumerico.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSubrangoNumerico_Limite_sup(), ecorePackage.getEInt(), "limite_sup", null, 1, 1, SubrangoNumerico.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(subrangoEnumeradoEClass, SubrangoEnumerado.class, "SubrangoEnumerado", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSubrangoEnumerado_Limite_inf(), ecorePackage.getEString(), "limite_inf", null, 1, 1, SubrangoEnumerado.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSubrangoEnumerado_Limite_sup(), ecorePackage.getEString(), "limite_sup", null, 1, 1, SubrangoEnumerado.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(asignacionNormalEClass, AsignacionNormal.class, "AsignacionNormal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAsignacionNormal_Mat(), ecorePackage.getEString(), "Mat", null, 0, -1, AsignacionNormal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAsignacionNormal_Valor_asignacion(), ecorePackage.getEString(), "valor_asignacion", null, 1, 1, AsignacionNormal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAsignacionNormal_Operador(), this.getOperacion(), null, "operador", null, 1, 1, AsignacionNormal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(asignacionComplejaEClass, AsignacionCompleja.class, "AsignacionCompleja", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAsignacionCompleja_Operador(), this.getOperacion(), null, "operador", null, 1, 1, AsignacionCompleja.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAsignacionCompleja_Valor_asignacion(), this.getOperacion(), null, "valor_asignacion", null, 1, 1, AsignacionCompleja.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(codigoEClass, Codigo.class, "Codigo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(moduloEClass, Modulo.class, "Modulo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getModulo_Nombre(), ecorePackage.getEString(), "nombre", "", 1, 1, Modulo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModulo_Implementacion(), this.getImplementacion(), null, "implementacion", null, 1, 1, Modulo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModulo_Importaciones(), this.getModulo(), null, "importaciones", null, 0, -1, Modulo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModulo_Exporta_globales(), this.getDeclaracion(), null, "exporta_globales", null, 0, -1, Modulo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModulo_Exporta_tipos(), ecorePackage.getEString(), "exporta_tipos", null, 0, -1, Modulo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModulo_Exporta_constantes(), ecorePackage.getEString(), "exporta_constantes", null, 0, -1, Modulo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModulo_Exporta_subprocesos(), this.getCabeceraSubproceso(), null, "exporta_subprocesos", null, 0, -1, Modulo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cabeceraSubprocesoEClass, CabeceraSubproceso.class, "CabeceraSubproceso", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCabeceraSubproceso_Nombre(), ecorePackage.getEString(), "nombre", null, 1, 1, CabeceraSubproceso.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCabeceraSubproceso_Parametros(), this.getParametro(), null, "parametros", null, 0, -1, CabeceraSubproceso.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(implementacionEClass, Implementacion.class, "Implementacion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getImplementacion_Subprocesos(), this.getSubproceso(), null, "subprocesos", null, 0, -1, Implementacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getImplementacion_Globales(), this.getDeclaracion(), null, "globales", null, 0, -1, Implementacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getImplementacion_Constantes(), this.getConstante(), null, "constantes", null, 0, -1, Implementacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getImplementacion_Complejos(), this.getTipoComplejo(), null, "complejos", null, 0, -1, Implementacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cabeceraProcedimientoEClass, CabeceraProcedimiento.class, "CabeceraProcedimiento", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(cabeceraFuncionEClass, CabeceraFuncion.class, "CabeceraFuncion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCabeceraFuncion_Tipo(), ecorePackage.getEString(), "tipo", null, 1, 1, CabeceraFuncion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modEClass, Mod.class, "Mod", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMod_Signo_op(), this.getsigno(), "signo_op", null, 0, 1, Mod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMod_Right(), this.getOperacion(), null, "right", null, 0, 1, Mod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMod_Left(), this.getOperacion(), null, "left", null, 0, 1, Mod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(divisionRealEClass, DivisionReal.class, "DivisionReal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDivisionReal_Signo_op(), this.getsigno(), "signo_op", null, 0, 1, DivisionReal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDivisionReal_Left(), this.getOperacion(), null, "left", null, 0, 1, DivisionReal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDivisionReal_Right(), this.getOperacion(), null, "right", null, 0, 1, DivisionReal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(operacionParentesisEClass, OperacionParentesis.class, "OperacionParentesis", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOperacionParentesis_Valor_operacion(), this.getOperacion(), null, "valor_operacion", null, 0, 1, OperacionParentesis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(unariaEClass, Unaria.class, "Unaria", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUnaria_Right(), this.getOperacion(), null, "right", null, 0, 1, Unaria.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUnaria_Signo_op(), this.getsigno(), "signo_op", null, 0, 1, Unaria.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(operacionCompletaEClass, OperacionCompleta.class, "OperacionCompleta", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOperacionCompleta_Valor_operacion(), this.getOperacion(), null, "valor_operacion", null, 0, 1, OperacionCompleta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(signoEEnum, signo.class, "signo");
		addEEnumLiteral(signoEEnum, signo.SUM);
		addEEnumLiteral(signoEEnum, signo.RES);
		addEEnumLiteral(signoEEnum, signo.MULT);
		addEEnumLiteral(signoEEnum, signo.DIV);
		addEEnumLiteral(signoEEnum, signo.MAYOR);
		addEEnumLiteral(signoEEnum, signo.MENOR);
		addEEnumLiteral(signoEEnum, signo.MAYORIGUAL);
		addEEnumLiteral(signoEEnum, signo.MENORIGUAL);
		addEEnumLiteral(signoEEnum, signo.Y);
		addEEnumLiteral(signoEEnum, signo.O);
		addEEnumLiteral(signoEEnum, signo.IGUALIGUAL);
		addEEnumLiteral(signoEEnum, signo.DISTINTO);
		addEEnumLiteral(signoEEnum, signo.AND);
		addEEnumLiteral(signoEEnum, signo.OR);
		addEEnumLiteral(signoEEnum, signo.MOD);
		addEEnumLiteral(signoEEnum, signo.DIV_REAL);

		initEEnum(modoAperturaEEnum, ModoApertura.class, "ModoApertura");
		addEEnumLiteral(modoAperturaEEnum, ModoApertura.ESCRITURA);
		addEEnumLiteral(modoAperturaEEnum, ModoApertura.LECTURA);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";	
		addAnnotation
		  (igualdadEClass, 
		   source, 
		   new String[] {
		   });
	}

} //DiagramapseudocodigoPackageImpl
