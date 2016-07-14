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
import diagramapseudocodigo.CampoRegistro;
import diagramapseudocodigo.Caracter;
import diagramapseudocodigo.Caso;
import diagramapseudocodigo.Codigo;
import diagramapseudocodigo.Comentario;
import diagramapseudocodigo.Comparacion;
import diagramapseudocodigo.ConstCadena;
import diagramapseudocodigo.Constantes;
import diagramapseudocodigo.Declaracion;
import diagramapseudocodigo.DeclaracionPropia;
import diagramapseudocodigo.DeclaracionVariable;
import diagramapseudocodigo.Devolver;
import diagramapseudocodigo.DiagramapseudocodigoFactory;
import diagramapseudocodigo.DiagramapseudocodigoPackage;
import diagramapseudocodigo.Div;
import diagramapseudocodigo.Division;
import diagramapseudocodigo.Enumerado;
import diagramapseudocodigo.Escribir;
import diagramapseudocodigo.Funcion;
import diagramapseudocodigo.FuncionFicheroAbrir;
import diagramapseudocodigo.FuncionFicheroCerrar;
import diagramapseudocodigo.Igualdad;
import diagramapseudocodigo.Implementacion;
import diagramapseudocodigo.Inicio;
import diagramapseudocodigo.Internas;
import diagramapseudocodigo.Leer;
import diagramapseudocodigo.LlamadaFuncion;
import diagramapseudocodigo.Matriz;
import diagramapseudocodigo.Mod;
import diagramapseudocodigo.ModoApertura;
import diagramapseudocodigo.Modulo;
import diagramapseudocodigo.Multiplicacion;
import diagramapseudocodigo.NombreInterna;
import diagramapseudocodigo.NumeroDecimal;
import diagramapseudocodigo.NumeroEntero;
import diagramapseudocodigo.OperacionCompleta;
import diagramapseudocodigo.OperacionParentesis;
import diagramapseudocodigo.Operador;
import diagramapseudocodigo.Or;
import diagramapseudocodigo.ParametroFuncion;
import diagramapseudocodigo.Procedimiento;
import diagramapseudocodigo.Registro;
import diagramapseudocodigo.Resta;
import diagramapseudocodigo.Sentencias;
import diagramapseudocodigo.Si;
import diagramapseudocodigo.Sino;
import diagramapseudocodigo.Subproceso;
import diagramapseudocodigo.Subrango;
import diagramapseudocodigo.SubrangoEnumerado;
import diagramapseudocodigo.SubrangoNumerico;
import diagramapseudocodigo.Suma;
import diagramapseudocodigo.Tipo;
import diagramapseudocodigo.TipoComplejo;
import diagramapseudocodigo.TipoDefinido;
import diagramapseudocodigo.TipoExistente;
import diagramapseudocodigo.Unaria;
import diagramapseudocodigo.ValorBooleano;
import diagramapseudocodigo.ValorComplejo;
import diagramapseudocodigo.ValorMatriz;
import diagramapseudocodigo.ValorRegistro;
import diagramapseudocodigo.ValorVector;
import diagramapseudocodigo.Variable;
import diagramapseudocodigo.VariableID;
import diagramapseudocodigo.Vector;
import diagramapseudocodigo.cadena;
import diagramapseudocodigo.desde;
import diagramapseudocodigo.mientras;
import diagramapseudocodigo.operacion;
import diagramapseudocodigo.repetir;
import diagramapseudocodigo.segun;
import diagramapseudocodigo.signo;
import diagramapseudocodigo.valor;
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
	private EClass divEClass = null;

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
	private EClass inicioEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sentenciasEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass declaracionVariableEClass = null;

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
	private EClass constCadenaEClass = null;

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
	private EClass numeroEnteroEClass = null;

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
	private EClass parametroFuncionEClass = null;

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
	private EClass numeroDecimalEClass = null;

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
	private EClass valorBooleanoEClass = null;

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
	private EClass internasEClass = null;

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
	private EClass constantesEClass = null;

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
	private EClass declaracionPropiaEClass = null;

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
	private EClass tipoExistenteEClass = null;

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
	private EClass divisionEClass = null;

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
	private EEnum signoEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum nombreInternaEEnum = null;

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
	public EReference getAlgoritmo_Tiene() {
		return (EReference)algoritmoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAlgoritmo_Funcion() {
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
	public EReference getAlgoritmo_Tipocomplejo() {
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
	public EReference getAlgoritmo_Global() {
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
	public EReference getModulo_Importaciones() {
		return (EReference)moduloEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModulo_Exporta_global() {
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
	public EReference getModulo_Exporta_funciones() {
		return (EReference)moduloEClass.getEStructuralFeatures().get(6);
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
	public EReference getCabeceraSubproceso_Parametrofuncion() {
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
	public EReference getImplementacion_Funcion() {
		return (EReference)implementacionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImplementacion_Global() {
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
	public EReference getImplementacion_Tipocomplejo() {
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
	public EClass getDiv() {
		return divEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiv_Signo_op() {
		return (EAttribute)divEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiv_Left() {
		return (EReference)divEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiv_Right() {
		return (EReference)divEClass.getEStructuralFeatures().get(2);
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
	public EClass getInicio() {
		return inicioEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInicio_Tiene() {
		return (EReference)inicioEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInicio_Declaracion() {
		return (EReference)inicioEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSentencias() {
		return sentenciasEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeclaracionVariable() {
		return declaracionVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeclaracionVariable_Tipo() {
		return (EAttribute)declaracionVariableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeclaracionVariable_Variable() {
		return (EReference)declaracionVariableEClass.getEStructuralFeatures().get(1);
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
	public EClass getConstCadena() {
		return constCadenaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConstCadena_Contenido() {
		return (EAttribute)constCadenaEClass.getEStructuralFeatures().get(0);
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
	public EClass getNumeroEntero() {
		return numeroEnteroEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNumeroEntero_Valor() {
		return (EAttribute)numeroEnteroEClass.getEStructuralFeatures().get(0);
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
	public EClass getParametroFuncion() {
		return parametroFuncionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParametroFuncion_Tipo() {
		return (EReference)parametroFuncionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParametroFuncion_Variable() {
		return (EReference)parametroFuncionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParametroFuncion_Paso() {
		return (EAttribute)parametroFuncionEClass.getEStructuralFeatures().get(1);
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
	public EClass getNumeroDecimal() {
		return numeroDecimalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNumeroDecimal_Valor() {
		return (EAttribute)numeroDecimalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getvalor() {
		return valorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getoperacion() {
		return operacionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getoperacion_EAttribute0rence0() {
		return (EReference)operacionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getoperacion_NegacionesFinales() {
		return (EAttribute)operacionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getoperacion_NegacionesIniciales() {
		return (EAttribute)operacionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValorBooleano() {
		return valorBooleanoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValorBooleano_Valor() {
		return (EAttribute)valorBooleanoEClass.getEStructuralFeatures().get(0);
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
	public EClass getmientras() {
		return mientrasEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getrepetir() {
		return repetirEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getdesde() {
		return desdeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getdesde_Asignacion() {
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
	public EReference getSubproceso_Parametrofuncion() {
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
	public EReference getSubproceso_Declaracion() {
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
	public EAttribute getCaracter_Contenido() {
		return (EAttribute)caracterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInternas() {
		return internasEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInternas_Nombre() {
		return (EAttribute)internasEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInternas_Operadores() {
		return (EReference)internasEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getsegun() {
		return segunEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getsegun_Caso() {
		return (EReference)segunEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getsegun_Devuelve() {
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
	public EClass getConstantes() {
		return constantesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstantes_Variable() {
		return (EReference)constantesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstantes_Valor() {
		return (EReference)constantesEClass.getEStructuralFeatures().get(1);
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
	public EClass getDeclaracionPropia() {
		return declaracionPropiaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeclaracionPropia_Tipo() {
		return (EAttribute)declaracionPropiaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeclaracionPropia_Variable() {
		return (EReference)declaracionPropiaEClass.getEStructuralFeatures().get(1);
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
	public EClass getTipoExistente() {
		return tipoExistenteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTipoExistente_Tipo() {
		return (EAttribute)tipoExistenteEClass.getEStructuralFeatures().get(0);
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
	public EReference getValorRegistro_Campo() {
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
	public EReference getValorVector_Campo() {
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
	public EReference getValorMatriz_Campo() {
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
	public EClass getDivision() {
		return divisionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDivision_Left() {
		return (EReference)divisionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDivision_Right() {
		return (EReference)divisionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDivision_Signo_op() {
		return (EAttribute)divisionEClass.getEStructuralFeatures().get(2);
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
	public EAttribute getVector_Nombre() {
		return (EAttribute)vectorEClass.getEStructuralFeatures().get(2);
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
	public EEnum getsigno() {
		return signoEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getNombreInterna() {
		return nombreInternaEEnum;
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
		createEReference(algoritmoEClass, ALGORITMO__TIENE);
		createEReference(algoritmoEClass, ALGORITMO__FUNCION);
		createEAttribute(algoritmoEClass, ALGORITMO__NOMBRE);
		createEReference(algoritmoEClass, ALGORITMO__CONSTANTES);
		createEReference(algoritmoEClass, ALGORITMO__TIPOCOMPLEJO);
		createEReference(algoritmoEClass, ALGORITMO__COMENTARIOS);
		createEReference(algoritmoEClass, ALGORITMO__GLOBAL);
		createEReference(algoritmoEClass, ALGORITMO__IMPORTACIONES);

		inicioEClass = createEClass(INICIO);
		createEReference(inicioEClass, INICIO__TIENE);
		createEReference(inicioEClass, INICIO__DECLARACION);

		sentenciasEClass = createEClass(SENTENCIAS);

		declaracionVariableEClass = createEClass(DECLARACION_VARIABLE);
		createEAttribute(declaracionVariableEClass, DECLARACION_VARIABLE__TIPO);
		createEReference(declaracionVariableEClass, DECLARACION_VARIABLE__VARIABLE);

		llamadaFuncionEClass = createEClass(LLAMADA_FUNCION);
		createEAttribute(llamadaFuncionEClass, LLAMADA_FUNCION__NOMBRE);
		createEReference(llamadaFuncionEClass, LLAMADA_FUNCION__OPERADORES);

		variableIDEClass = createEClass(VARIABLE_ID);
		createEAttribute(variableIDEClass, VARIABLE_ID__MAT);
		createEAttribute(variableIDEClass, VARIABLE_ID__NOMBRE);

		cadenaEClass = createEClass(CADENA);

		constCadenaEClass = createEClass(CONST_CADENA);
		createEAttribute(constCadenaEClass, CONST_CADENA__CONTENIDO);

		variableEClass = createEClass(VARIABLE);
		createEAttribute(variableEClass, VARIABLE__NOMBRE);
		createEAttribute(variableEClass, VARIABLE__MAT);

		operadorEClass = createEClass(OPERADOR);

		numeroEnteroEClass = createEClass(NUMERO_ENTERO);
		createEAttribute(numeroEnteroEClass, NUMERO_ENTERO__VALOR);

		asignacionEClass = createEClass(ASIGNACION);

		escribirEClass = createEClass(ESCRIBIR);
		createEReference(escribirEClass, ESCRIBIR__OPERADOR);

		funcionEClass = createEClass(FUNCION);
		createEAttribute(funcionEClass, FUNCION__TIPO);
		createEReference(funcionEClass, FUNCION__DEVUELVE);

		parametroFuncionEClass = createEClass(PARAMETRO_FUNCION);
		createEReference(parametroFuncionEClass, PARAMETRO_FUNCION__VARIABLE);
		createEAttribute(parametroFuncionEClass, PARAMETRO_FUNCION__PASO);
		createEReference(parametroFuncionEClass, PARAMETRO_FUNCION__TIPO);

		leerEClass = createEClass(LEER);
		createEReference(leerEClass, LEER__VARIABLE);

		numeroDecimalEClass = createEClass(NUMERO_DECIMAL);
		createEAttribute(numeroDecimalEClass, NUMERO_DECIMAL__VALOR);

		valorEClass = createEClass(VALOR);

		operacionEClass = createEClass(OPERACION);
		createEReference(operacionEClass, OPERACION__EATTRIBUTE0RENCE0);
		createEAttribute(operacionEClass, OPERACION__NEGACIONES_FINALES);
		createEAttribute(operacionEClass, OPERACION__NEGACIONES_INICIALES);

		valorBooleanoEClass = createEClass(VALOR_BOOLEANO);
		createEAttribute(valorBooleanoEClass, VALOR_BOOLEANO__VALOR);

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
		createEReference(subprocesoEClass, SUBPROCESO__PARAMETROFUNCION);
		createEReference(subprocesoEClass, SUBPROCESO__SENTENCIAS);
		createEAttribute(subprocesoEClass, SUBPROCESO__NOMBRE);
		createEReference(subprocesoEClass, SUBPROCESO__DECLARACION);

		procedimientoEClass = createEClass(PROCEDIMIENTO);

		caracterEClass = createEClass(CARACTER);
		createEAttribute(caracterEClass, CARACTER__CONTENIDO);

		internasEClass = createEClass(INTERNAS);
		createEAttribute(internasEClass, INTERNAS__NOMBRE);
		createEReference(internasEClass, INTERNAS__OPERADORES);

		segunEClass = createEClass(SEGUN);
		createEReference(segunEClass, SEGUN__CASO);
		createEReference(segunEClass, SEGUN__DEVUELVE);

		devolverEClass = createEClass(DEVOLVER);
		createEReference(devolverEClass, DEVOLVER__EREFERENCE0);
		createEReference(devolverEClass, DEVOLVER__DEVUELVE);

		casoEClass = createEClass(CASO);
		createEReference(casoEClass, CASO__DEVUELVE);
		createEReference(casoEClass, CASO__SENTENCIAS);
		createEReference(casoEClass, CASO__OPERADOR);

		constantesEClass = createEClass(CONSTANTES);
		createEReference(constantesEClass, CONSTANTES__VARIABLE);
		createEReference(constantesEClass, CONSTANTES__VALOR);

		vectorEClass = createEClass(VECTOR);
		createEReference(vectorEClass, VECTOR__VALOR);
		createEReference(vectorEClass, VECTOR__TIPO);
		createEAttribute(vectorEClass, VECTOR__NOMBRE);

		declaracionPropiaEClass = createEClass(DECLARACION_PROPIA);
		createEAttribute(declaracionPropiaEClass, DECLARACION_PROPIA__TIPO);
		createEReference(declaracionPropiaEClass, DECLARACION_PROPIA__VARIABLE);

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

		tipoExistenteEClass = createEClass(TIPO_EXISTENTE);
		createEAttribute(tipoExistenteEClass, TIPO_EXISTENTE__TIPO);

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
		createEReference(valorRegistroEClass, VALOR_REGISTRO__CAMPO);

		campoRegistroEClass = createEClass(CAMPO_REGISTRO);
		createEAttribute(campoRegistroEClass, CAMPO_REGISTRO__NOMBRE_CAMPO);

		valorVectorEClass = createEClass(VALOR_VECTOR);
		createEAttribute(valorVectorEClass, VALOR_VECTOR__NOMBRE_VECTOR);
		createEReference(valorVectorEClass, VALOR_VECTOR__CAMPO);
		createEReference(valorVectorEClass, VALOR_VECTOR__INDICE);

		valorMatrizEClass = createEClass(VALOR_MATRIZ);
		createEAttribute(valorMatrizEClass, VALOR_MATRIZ__NOMBRE_MATRIZ);
		createEReference(valorMatrizEClass, VALOR_MATRIZ__CAMPO);
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

		divisionEClass = createEClass(DIVISION);
		createEReference(divisionEClass, DIVISION__LEFT);
		createEReference(divisionEClass, DIVISION__RIGHT);
		createEAttribute(divisionEClass, DIVISION__SIGNO_OP);

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
		createEReference(moduloEClass, MODULO__EXPORTA_GLOBAL);
		createEAttribute(moduloEClass, MODULO__EXPORTA_TIPOS);
		createEAttribute(moduloEClass, MODULO__EXPORTA_CONSTANTES);
		createEReference(moduloEClass, MODULO__EXPORTA_FUNCIONES);

		cabeceraSubprocesoEClass = createEClass(CABECERA_SUBPROCESO);
		createEAttribute(cabeceraSubprocesoEClass, CABECERA_SUBPROCESO__NOMBRE);
		createEReference(cabeceraSubprocesoEClass, CABECERA_SUBPROCESO__PARAMETROFUNCION);

		implementacionEClass = createEClass(IMPLEMENTACION);
		createEReference(implementacionEClass, IMPLEMENTACION__FUNCION);
		createEReference(implementacionEClass, IMPLEMENTACION__GLOBAL);
		createEReference(implementacionEClass, IMPLEMENTACION__CONSTANTES);
		createEReference(implementacionEClass, IMPLEMENTACION__TIPOCOMPLEJO);

		cabeceraProcedimientoEClass = createEClass(CABECERA_PROCEDIMIENTO);

		cabeceraFuncionEClass = createEClass(CABECERA_FUNCION);
		createEAttribute(cabeceraFuncionEClass, CABECERA_FUNCION__TIPO);

		modEClass = createEClass(MOD);
		createEAttribute(modEClass, MOD__SIGNO_OP);
		createEReference(modEClass, MOD__RIGHT);
		createEReference(modEClass, MOD__LEFT);

		divEClass = createEClass(DIV);
		createEAttribute(divEClass, DIV__SIGNO_OP);
		createEReference(divEClass, DIV__LEFT);
		createEReference(divEClass, DIV__RIGHT);

		operacionParentesisEClass = createEClass(OPERACION_PARENTESIS);
		createEReference(operacionParentesisEClass, OPERACION_PARENTESIS__VALOR_OPERACION);

		unariaEClass = createEClass(UNARIA);
		createEReference(unariaEClass, UNARIA__RIGHT);
		createEAttribute(unariaEClass, UNARIA__SIGNO_OP);

		operacionCompletaEClass = createEClass(OPERACION_COMPLETA);
		createEReference(operacionCompletaEClass, OPERACION_COMPLETA__VALOR_OPERACION);

		// Create enums
		signoEEnum = createEEnum(SIGNO);
		nombreInternaEEnum = createEEnum(NOMBRE_INTERNA);
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
		declaracionVariableEClass.getESuperTypes().add(this.getDeclaracion());
		llamadaFuncionEClass.getESuperTypes().add(this.getvalor());
		llamadaFuncionEClass.getESuperTypes().add(this.getoperacion());
		variableIDEClass.getESuperTypes().add(this.getOperador());
		variableIDEClass.getESuperTypes().add(this.getoperacion());
		constCadenaEClass.getESuperTypes().add(this.getOperador());
		constCadenaEClass.getESuperTypes().add(this.getoperacion());
		operadorEClass.getESuperTypes().add(this.getvalor());
		numeroEnteroEClass.getESuperTypes().add(this.getOperador());
		numeroEnteroEClass.getESuperTypes().add(this.getoperacion());
		asignacionEClass.getESuperTypes().add(this.getSentencias());
		escribirEClass.getESuperTypes().add(this.getSentencias());
		funcionEClass.getESuperTypes().add(this.getSubproceso());
		leerEClass.getESuperTypes().add(this.getSentencias());
		numeroDecimalEClass.getESuperTypes().add(this.getOperador());
		numeroDecimalEClass.getESuperTypes().add(this.getoperacion());
		operacionEClass.getESuperTypes().add(this.getvalor());
		operacionEClass.getESuperTypes().add(this.getSentencias());
		valorBooleanoEClass.getESuperTypes().add(this.getOperador());
		valorBooleanoEClass.getESuperTypes().add(this.getoperacion());
		siEClass.getESuperTypes().add(this.getBloque());
		bloqueEClass.getESuperTypes().add(this.getSentencias());
		mientrasEClass.getESuperTypes().add(this.getBloque());
		repetirEClass.getESuperTypes().add(this.getBloque());
		desdeEClass.getESuperTypes().add(this.getBloque());
		procedimientoEClass.getESuperTypes().add(this.getSubproceso());
		caracterEClass.getESuperTypes().add(this.getOperador());
		caracterEClass.getESuperTypes().add(this.getoperacion());
		internasEClass.getESuperTypes().add(this.getvalor());
		internasEClass.getESuperTypes().add(this.getoperacion());
		segunEClass.getESuperTypes().add(this.getBloque());
		vectorEClass.getESuperTypes().add(this.getTipoComplejo());
		declaracionPropiaEClass.getESuperTypes().add(this.getDeclaracion());
		matrizEClass.getESuperTypes().add(this.getTipoComplejo());
		registroEClass.getESuperTypes().add(this.getTipoComplejo());
		tipoDefinidoEClass.getESuperTypes().add(this.getTipo());
		tipoExistenteEClass.getESuperTypes().add(this.getTipo());
		archivoEClass.getESuperTypes().add(this.getTipoComplejo());
		enumeradoEClass.getESuperTypes().add(this.getTipoComplejo());
		subrangoEClass.getESuperTypes().add(this.getTipoComplejo());
		valorComplejoEClass.getESuperTypes().add(this.getOperador());
		valorComplejoEClass.getESuperTypes().add(this.getSentencias());
		valorComplejoEClass.getESuperTypes().add(this.getoperacion());
		valorRegistroEClass.getESuperTypes().add(this.getValorComplejo());
		valorVectorEClass.getESuperTypes().add(this.getValorComplejo());
		valorMatrizEClass.getESuperTypes().add(this.getValorComplejo());
		funcionFicheroAbrirEClass.getESuperTypes().add(this.getSentencias());
		funcionFicheroCerrarEClass.getESuperTypes().add(this.getSentencias());
		sumaEClass.getESuperTypes().add(this.getoperacion());
		restaEClass.getESuperTypes().add(this.getoperacion());
		multiplicacionEClass.getESuperTypes().add(this.getoperacion());
		divisionEClass.getESuperTypes().add(this.getoperacion());
		orEClass.getESuperTypes().add(this.getoperacion());
		andEClass.getESuperTypes().add(this.getoperacion());
		comparacionEClass.getESuperTypes().add(this.getoperacion());
		igualdadEClass.getESuperTypes().add(this.getoperacion());
		subrangoNumericoEClass.getESuperTypes().add(this.getSubrango());
		subrangoEnumeradoEClass.getESuperTypes().add(this.getSubrango());
		asignacionNormalEClass.getESuperTypes().add(this.getAsignacion());
		asignacionComplejaEClass.getESuperTypes().add(this.getAsignacion());
		moduloEClass.getESuperTypes().add(this.getCodigo());
		cabeceraProcedimientoEClass.getESuperTypes().add(this.getCabeceraSubproceso());
		cabeceraFuncionEClass.getESuperTypes().add(this.getCabeceraSubproceso());
		modEClass.getESuperTypes().add(this.getoperacion());
		divEClass.getESuperTypes().add(this.getoperacion());
		operacionParentesisEClass.getESuperTypes().add(this.getoperacion());
		unariaEClass.getESuperTypes().add(this.getoperacion());
		operacionCompletaEClass.getESuperTypes().add(this.getoperacion());

		// Initialize classes, features, and operations; add parameters
		initEClass(algoritmoEClass, Algoritmo.class, "Algoritmo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAlgoritmo_Tiene(), this.getInicio(), null, "tiene", null, 1, 1, Algoritmo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAlgoritmo_Funcion(), this.getSubproceso(), null, "funcion", null, 0, -1, Algoritmo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAlgoritmo_Nombre(), ecorePackage.getEString(), "nombre", null, 0, 1, Algoritmo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAlgoritmo_Constantes(), this.getConstantes(), null, "constantes", null, 0, -1, Algoritmo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAlgoritmo_Tipocomplejo(), this.getTipoComplejo(), null, "tipocomplejo", null, 0, -1, Algoritmo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAlgoritmo_Comentarios(), this.getComentario(), null, "comentarios", null, 0, -1, Algoritmo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAlgoritmo_Global(), this.getDeclaracion(), null, "global", null, 0, -1, Algoritmo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAlgoritmo_Importaciones(), this.getModulo(), null, "importaciones", null, 0, -1, Algoritmo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inicioEClass, Inicio.class, "Inicio", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInicio_Tiene(), this.getSentencias(), null, "tiene", null, 0, -1, Inicio.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInicio_Declaracion(), this.getDeclaracion(), null, "declaracion", null, 0, -1, Inicio.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sentenciasEClass, Sentencias.class, "Sentencias", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(declaracionVariableEClass, DeclaracionVariable.class, "DeclaracionVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDeclaracionVariable_Tipo(), ecorePackage.getEString(), "tipo", null, 1, 1, DeclaracionVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeclaracionVariable_Variable(), this.getVariable(), null, "variable", null, 0, -1, DeclaracionVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(llamadaFuncionEClass, LlamadaFuncion.class, "LlamadaFuncion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLlamadaFuncion_Nombre(), ecorePackage.getEString(), "nombre", null, 1, 1, LlamadaFuncion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLlamadaFuncion_Operadores(), this.getoperacion(), null, "operadores", null, 0, -1, LlamadaFuncion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(variableIDEClass, VariableID.class, "VariableID", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVariableID_Mat(), ecorePackage.getEString(), "Mat", null, 0, -1, VariableID.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVariableID_Nombre(), ecorePackage.getEString(), "nombre", null, 0, 1, VariableID.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cadenaEClass, cadena.class, "cadena", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(constCadenaEClass, ConstCadena.class, "ConstCadena", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConstCadena_Contenido(), ecorePackage.getEString(), "contenido", null, 1, 1, ConstCadena.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(variableEClass, Variable.class, "Variable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVariable_Nombre(), ecorePackage.getEString(), "nombre", null, 1, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVariable_Mat(), ecorePackage.getEString(), "Mat", null, 0, -1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(operadorEClass, Operador.class, "Operador", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(numeroEnteroEClass, NumeroEntero.class, "NumeroEntero", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNumeroEntero_Valor(), ecorePackage.getEInt(), "valor", null, 1, 1, NumeroEntero.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(asignacionEClass, Asignacion.class, "Asignacion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(escribirEClass, Escribir.class, "Escribir", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEscribir_Operador(), this.getoperacion(), null, "operador", null, 1, -1, Escribir.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(funcionEClass, Funcion.class, "Funcion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFuncion_Tipo(), ecorePackage.getEString(), "tipo", null, 0, 1, Funcion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFuncion_Devuelve(), this.getDevolver(), null, "devuelve", null, 0, 1, Funcion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parametroFuncionEClass, ParametroFuncion.class, "ParametroFuncion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getParametroFuncion_Variable(), this.getVariable(), null, "variable", null, 1, 1, ParametroFuncion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParametroFuncion_Paso(), ecorePackage.getEString(), "paso", null, 1, 1, ParametroFuncion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParametroFuncion_Tipo(), this.getTipo(), null, "tipo", null, 1, 1, ParametroFuncion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(leerEClass, Leer.class, "Leer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLeer_Variable(), this.getoperacion(), null, "variable", null, 1, -1, Leer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(numeroDecimalEClass, NumeroDecimal.class, "NumeroDecimal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNumeroDecimal_Valor(), ecorePackage.getEFloat(), "valor", null, 1, 1, NumeroDecimal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(valorEClass, valor.class, "valor", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(operacionEClass, operacion.class, "operacion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getoperacion_EAttribute0rence0(), this.getoperacion(), null, "EAttribute0rence0", null, 0, 1, operacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getoperacion_NegacionesFinales(), ecorePackage.getEString(), "negacionesFinales", null, 0, -1, operacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getoperacion_NegacionesIniciales(), ecorePackage.getEString(), "negacionesIniciales", null, 0, -1, operacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(valorBooleanoEClass, ValorBooleano.class, "ValorBooleano", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getValorBooleano_Valor(), ecorePackage.getEString(), "valor", null, 1, 1, ValorBooleano.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(siEClass, Si.class, "Si", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSi_Sino(), this.getSino(), null, "sino", null, 0, 1, Si.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSi_Devuelve(), this.getDevolver(), null, "devuelve", null, 0, 1, Si.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sinoEClass, Sino.class, "Sino", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSino_Sentencias(), this.getSentencias(), null, "sentencias", null, 0, -1, Sino.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSino_Devuelve(), this.getDevolver(), null, "devuelve", null, 0, 1, Sino.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bloqueEClass, Bloque.class, "Bloque", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBloque_Valor(), this.getoperacion(), null, "valor", null, 1, 1, Bloque.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBloque_Sentencias(), this.getSentencias(), null, "sentencias", null, 0, -1, Bloque.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mientrasEClass, mientras.class, "mientras", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(repetirEClass, repetir.class, "repetir", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(desdeEClass, desde.class, "desde", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getdesde_Asignacion(), this.getAsignacionNormal(), null, "asignacion", null, 1, 1, desde.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(subprocesoEClass, Subproceso.class, "Subproceso", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSubproceso_Parametrofuncion(), this.getParametroFuncion(), null, "parametrofuncion", null, 0, -1, Subproceso.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubproceso_Sentencias(), this.getSentencias(), null, "sentencias", null, 0, -1, Subproceso.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSubproceso_Nombre(), ecorePackage.getEString(), "nombre", null, 1, 1, Subproceso.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubproceso_Declaracion(), this.getDeclaracion(), null, "declaracion", null, 0, -1, Subproceso.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(procedimientoEClass, Procedimiento.class, "Procedimiento", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(caracterEClass, Caracter.class, "Caracter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCaracter_Contenido(), ecorePackage.getEString(), "contenido", null, 1, 1, Caracter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(internasEClass, Internas.class, "Internas", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInternas_Nombre(), this.getNombreInterna(), "nombre", null, 0, 1, Internas.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInternas_Operadores(), this.getoperacion(), null, "operadores", null, 0, -1, Internas.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(segunEClass, segun.class, "segun", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getsegun_Caso(), this.getCaso(), null, "caso", null, 0, -1, segun.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getsegun_Devuelve(), this.getDevolver(), null, "devuelve", null, 0, 1, segun.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(devolverEClass, Devolver.class, "Devolver", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDevolver_EReference0(), this.getDevolver(), null, "EReference0", null, 0, 1, Devolver.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDevolver_Devuelve(), this.getoperacion(), null, "devuelve", null, 1, 1, Devolver.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(casoEClass, Caso.class, "Caso", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCaso_Devuelve(), this.getDevolver(), null, "devuelve", null, 0, 1, Caso.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCaso_Sentencias(), this.getSentencias(), null, "sentencias", null, 0, -1, Caso.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCaso_Operador(), this.getoperacion(), null, "operador", null, 1, 1, Caso.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(constantesEClass, Constantes.class, "Constantes", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConstantes_Variable(), this.getVariable(), null, "variable", null, 1, 1, Constantes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConstantes_Valor(), this.getoperacion(), null, "valor", null, 1, 1, Constantes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vectorEClass, Vector.class, "Vector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVector_Valor(), this.getoperacion(), null, "valor", null, 0, 1, Vector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVector_Tipo(), this.getTipo(), null, "tipo", null, 1, 1, Vector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVector_Nombre(), ecorePackage.getEString(), "nombre", null, 1, 1, Vector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(declaracionPropiaEClass, DeclaracionPropia.class, "DeclaracionPropia", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDeclaracionPropia_Tipo(), ecorePackage.getEString(), "tipo", null, 1, 1, DeclaracionPropia.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeclaracionPropia_Variable(), this.getVariable(), null, "variable", null, 0, -1, DeclaracionPropia.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(declaracionEClass, Declaracion.class, "Declaracion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(matrizEClass, Matriz.class, "Matriz", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMatriz_Nombre(), ecorePackage.getEString(), "nombre", null, 1, 1, Matriz.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMatriz_Valor(), this.getoperacion(), null, "valor", null, 0, 2, Matriz.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMatriz_Tipo(), this.getTipo(), null, "tipo", null, 1, 1, Matriz.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tipoComplejoEClass, TipoComplejo.class, "TipoComplejo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(registroEClass, Registro.class, "Registro", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRegistro_Variable(), this.getDeclaracion(), null, "variable", null, 1, -1, Registro.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRegistro_Nombre(), ecorePackage.getEString(), "nombre", null, 1, 1, Registro.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tipoEClass, Tipo.class, "Tipo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tipoDefinidoEClass, TipoDefinido.class, "TipoDefinido", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTipoDefinido_Tipo(), ecorePackage.getEString(), "tipo", null, 1, 1, TipoDefinido.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tipoExistenteEClass, TipoExistente.class, "TipoExistente", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTipoExistente_Tipo(), ecorePackage.getEString(), "tipo", null, 1, 1, TipoExistente.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(archivoEClass, Archivo.class, "Archivo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getArchivo_Nombre(), ecorePackage.getEString(), "nombre", null, 1, 1, Archivo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArchivo_Tipo(), this.getTipo(), null, "tipo", null, 1, 1, Archivo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(enumeradoEClass, Enumerado.class, "Enumerado", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEnumerado_Nombre(), ecorePackage.getEString(), "nombre", null, 1, 1, Enumerado.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEnumerado_Valor(), this.getoperacion(), null, "valor", null, 1, -1, Enumerado.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(subrangoEClass, Subrango.class, "Subrango", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSubrango_Nombre(), ecorePackage.getEString(), "nombre", null, 1, 1, Subrango.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(valorComplejoEClass, ValorComplejo.class, "ValorComplejo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(valorRegistroEClass, ValorRegistro.class, "ValorRegistro", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getValorRegistro_Nombre_registro(), ecorePackage.getEString(), "nombre_registro", null, 1, 1, ValorRegistro.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getValorRegistro_Campo(), this.getCampoRegistro(), null, "campo", null, 1, -1, ValorRegistro.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(campoRegistroEClass, CampoRegistro.class, "CampoRegistro", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCampoRegistro_Nombre_campo(), ecorePackage.getEString(), "nombre_campo", null, 1, 1, CampoRegistro.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(valorVectorEClass, ValorVector.class, "ValorVector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getValorVector_Nombre_vector(), ecorePackage.getEString(), "nombre_vector", null, 1, 1, ValorVector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getValorVector_Campo(), this.getCampoRegistro(), null, "campo", null, 0, -1, ValorVector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getValorVector_Indice(), this.getoperacion(), null, "indice", null, 1, 1, ValorVector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(valorMatrizEClass, ValorMatriz.class, "ValorMatriz", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getValorMatriz_Nombre_matriz(), ecorePackage.getEString(), "nombre_matriz", null, 1, 1, ValorMatriz.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getValorMatriz_Campo(), this.getCampoRegistro(), null, "campo", null, 0, -1, ValorMatriz.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getValorMatriz_PrimerIndice(), this.getoperacion(), null, "primerIndice", null, 1, 1, ValorMatriz.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getValorMatriz_SegundoIndice(), this.getoperacion(), null, "segundoIndice", null, 1, 1, ValorMatriz.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(comentarioEClass, Comentario.class, "Comentario", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComentario_Mensaje(), ecorePackage.getEString(), "mensaje", null, 1, 1, Comentario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(funcionFicheroAbrirEClass, FuncionFicheroAbrir.class, "FuncionFicheroAbrir", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFuncionFicheroAbrir_Modo(), this.getModoApertura(), "modo", null, 1, 1, FuncionFicheroAbrir.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFuncionFicheroAbrir_Variable(), this.getoperacion(), null, "variable", null, 2, 2, FuncionFicheroAbrir.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(funcionFicheroCerrarEClass, FuncionFicheroCerrar.class, "FuncionFicheroCerrar", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFuncionFicheroCerrar_Variable(), this.getoperacion(), null, "variable", null, 1, 1, FuncionFicheroCerrar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sumaEClass, Suma.class, "Suma", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSuma_Left(), this.getoperacion(), null, "left", null, 0, 1, Suma.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSuma_Right(), this.getoperacion(), null, "right", null, 0, 1, Suma.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSuma_Signo_op(), this.getsigno(), "signo_op", null, 0, 1, Suma.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(restaEClass, Resta.class, "Resta", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResta_Left(), this.getoperacion(), null, "left", null, 0, 1, Resta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResta_Right(), this.getoperacion(), null, "right", null, 0, 1, Resta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResta_Signo_op(), this.getsigno(), "signo_op", null, 0, 1, Resta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(multiplicacionEClass, Multiplicacion.class, "Multiplicacion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMultiplicacion_Left(), this.getoperacion(), null, "left", null, 0, 1, Multiplicacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMultiplicacion_Right(), this.getoperacion(), null, "right", null, 0, 1, Multiplicacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMultiplicacion_Signo_op(), this.getsigno(), "signo_op", null, 0, 1, Multiplicacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(divisionEClass, Division.class, "Division", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDivision_Left(), this.getoperacion(), null, "left", null, 0, 1, Division.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDivision_Right(), this.getoperacion(), null, "right", null, 0, 1, Division.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDivision_Signo_op(), this.getsigno(), "signo_op", null, 0, 1, Division.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(orEClass, Or.class, "Or", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOr_Left(), this.getoperacion(), null, "left", null, 0, 1, Or.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOr_Right(), this.getoperacion(), null, "right", null, 0, 1, Or.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOr_Signo_op(), this.getsigno(), "signo_op", null, 0, 1, Or.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(andEClass, And.class, "And", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAnd_Left(), this.getoperacion(), null, "left", null, 0, 1, And.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAnd_Right(), this.getoperacion(), null, "right", null, 0, 1, And.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnd_Signo_op(), this.getsigno(), "signo_op", null, 0, 1, And.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(comparacionEClass, Comparacion.class, "Comparacion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComparacion_Left(), this.getoperacion(), null, "left", null, 0, 1, Comparacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComparacion_Right(), this.getoperacion(), null, "right", null, 0, 1, Comparacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComparacion_Signo_op(), this.getsigno(), "signo_op", null, 0, 1, Comparacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(igualdadEClass, Igualdad.class, "Igualdad", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIgualdad_Left(), this.getoperacion(), null, "left", null, 0, 1, Igualdad.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIgualdad_Right(), this.getoperacion(), null, "right", null, 0, 1, Igualdad.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
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
		initEReference(getAsignacionNormal_Operador(), this.getoperacion(), null, "operador", null, 1, 1, AsignacionNormal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(asignacionComplejaEClass, AsignacionCompleja.class, "AsignacionCompleja", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAsignacionCompleja_Operador(), this.getoperacion(), null, "operador", null, 1, 1, AsignacionCompleja.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAsignacionCompleja_Valor_asignacion(), this.getoperacion(), null, "valor_asignacion", null, 1, 1, AsignacionCompleja.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(codigoEClass, Codigo.class, "Codigo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(moduloEClass, Modulo.class, "Modulo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getModulo_Nombre(), ecorePackage.getEString(), "nombre", "", 1, 1, Modulo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModulo_Implementacion(), this.getImplementacion(), null, "implementacion", null, 1, 1, Modulo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModulo_Importaciones(), this.getModulo(), null, "importaciones", null, 0, -1, Modulo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModulo_Exporta_global(), this.getDeclaracion(), null, "exporta_global", null, 0, -1, Modulo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModulo_Exporta_tipos(), ecorePackage.getEString(), "exporta_tipos", null, 0, -1, Modulo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModulo_Exporta_constantes(), ecorePackage.getEString(), "exporta_constantes", null, 0, -1, Modulo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModulo_Exporta_funciones(), this.getCabeceraSubproceso(), null, "exporta_funciones", null, 0, -1, Modulo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cabeceraSubprocesoEClass, CabeceraSubproceso.class, "CabeceraSubproceso", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCabeceraSubproceso_Nombre(), ecorePackage.getEString(), "nombre", null, 1, 1, CabeceraSubproceso.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCabeceraSubproceso_Parametrofuncion(), this.getParametroFuncion(), null, "parametrofuncion", null, 0, -1, CabeceraSubproceso.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(implementacionEClass, Implementacion.class, "Implementacion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getImplementacion_Funcion(), this.getSubproceso(), null, "funcion", null, 0, -1, Implementacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getImplementacion_Global(), this.getDeclaracion(), null, "global", null, 0, -1, Implementacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getImplementacion_Constantes(), this.getConstantes(), null, "constantes", null, 0, -1, Implementacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getImplementacion_Tipocomplejo(), this.getTipoComplejo(), null, "tipocomplejo", null, 0, -1, Implementacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cabeceraProcedimientoEClass, CabeceraProcedimiento.class, "CabeceraProcedimiento", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(cabeceraFuncionEClass, CabeceraFuncion.class, "CabeceraFuncion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCabeceraFuncion_Tipo(), ecorePackage.getEString(), "tipo", null, 1, 1, CabeceraFuncion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modEClass, Mod.class, "Mod", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMod_Signo_op(), this.getsigno(), "signo_op", null, 0, 1, Mod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMod_Right(), this.getoperacion(), null, "right", null, 0, 1, Mod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMod_Left(), this.getoperacion(), null, "left", null, 0, 1, Mod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(divEClass, Div.class, "Div", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiv_Signo_op(), this.getsigno(), "signo_op", null, 0, 1, Div.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDiv_Left(), this.getoperacion(), null, "left", null, 0, 1, Div.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDiv_Right(), this.getoperacion(), null, "right", null, 0, 1, Div.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(operacionParentesisEClass, OperacionParentesis.class, "OperacionParentesis", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOperacionParentesis_Valor_operacion(), this.getoperacion(), null, "valor_operacion", null, 0, 1, OperacionParentesis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(unariaEClass, Unaria.class, "Unaria", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUnaria_Right(), this.getoperacion(), null, "right", null, 0, 1, Unaria.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUnaria_Signo_op(), this.getsigno(), "signo_op", null, 0, 1, Unaria.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(operacionCompletaEClass, OperacionCompleta.class, "OperacionCompleta", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOperacionCompleta_Valor_operacion(), this.getoperacion(), null, "valor_operacion", null, 0, 1, OperacionCompleta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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

		initEEnum(nombreInternaEEnum, NombreInterna.class, "NombreInterna");
		addEEnumLiteral(nombreInternaEEnum, NombreInterna.COS);
		addEEnumLiteral(nombreInternaEEnum, NombreInterna.CUADRADO);
		addEEnumLiteral(nombreInternaEEnum, NombreInterna.EXP);
		addEEnumLiteral(nombreInternaEEnum, NombreInterna.LN);
		addEEnumLiteral(nombreInternaEEnum, NombreInterna.LOG);
		addEEnumLiteral(nombreInternaEEnum, NombreInterna.SEN);
		addEEnumLiteral(nombreInternaEEnum, NombreInterna.SQRT);
		addEEnumLiteral(nombreInternaEEnum, NombreInterna.LONGITUD);
		addEEnumLiteral(nombreInternaEEnum, NombreInterna.CONCATENA);

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
