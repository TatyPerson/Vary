/**
 */
package diagramapseudocodigo.impl;

import diagramapseudocodigo.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DiagramapseudocodigoFactoryImpl extends EFactoryImpl implements DiagramapseudocodigoFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DiagramapseudocodigoFactory init() {
		try {
			DiagramapseudocodigoFactory theDiagramapseudocodigoFactory = (DiagramapseudocodigoFactory)EPackage.Registry.INSTANCE.getEFactory(DiagramapseudocodigoPackage.eNS_URI);
			if (theDiagramapseudocodigoFactory != null) {
				return theDiagramapseudocodigoFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DiagramapseudocodigoFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiagramapseudocodigoFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case DiagramapseudocodigoPackage.ALGORITMO: return createAlgoritmo();
			case DiagramapseudocodigoPackage.INICIO: return createInicio();
			case DiagramapseudocodigoPackage.DECLARACION_BASICA: return createDeclaracionBasica();
			case DiagramapseudocodigoPackage.LLAMADA_FUNCION: return createLlamadaFuncion();
			case DiagramapseudocodigoPackage.VARIABLE_ID: return createVariableID();
			case DiagramapseudocodigoPackage.CADENA: return createcadena();
			case DiagramapseudocodigoPackage.CADENA_CARACTERES: return createCadenaCaracteres();
			case DiagramapseudocodigoPackage.VARIABLE: return createVariable();
			case DiagramapseudocodigoPackage.ENTERO: return createEntero();
			case DiagramapseudocodigoPackage.ASIGNACION: return createAsignacion();
			case DiagramapseudocodigoPackage.ESCRIBIR: return createEscribir();
			case DiagramapseudocodigoPackage.FUNCION: return createFuncion();
			case DiagramapseudocodigoPackage.PARAMETRO: return createParametro();
			case DiagramapseudocodigoPackage.LEER: return createLeer();
			case DiagramapseudocodigoPackage.REAL: return createReal();
			case DiagramapseudocodigoPackage.OPERACION: return createOperacion();
			case DiagramapseudocodigoPackage.LOGICO: return createLogico();
			case DiagramapseudocodigoPackage.SI: return createSi();
			case DiagramapseudocodigoPackage.SINO: return createSino();
			case DiagramapseudocodigoPackage.MIENTRAS: return createMientras();
			case DiagramapseudocodigoPackage.REPETIR: return createRepetir();
			case DiagramapseudocodigoPackage.DESDE: return createDesde();
			case DiagramapseudocodigoPackage.PROCEDIMIENTO: return createProcedimiento();
			case DiagramapseudocodigoPackage.CARACTER: return createCaracter();
			case DiagramapseudocodigoPackage.FUNCION_INTERNA: return createFuncionInterna();
			case DiagramapseudocodigoPackage.SEGUN: return createSegun();
			case DiagramapseudocodigoPackage.DEVOLVER: return createDevolver();
			case DiagramapseudocodigoPackage.CASO: return createCaso();
			case DiagramapseudocodigoPackage.CONSTANTE: return createConstante();
			case DiagramapseudocodigoPackage.VECTOR: return createVector();
			case DiagramapseudocodigoPackage.DECLARACION_DEFINIDA: return createDeclaracionDefinida();
			case DiagramapseudocodigoPackage.DECLARACION: return createDeclaracion();
			case DiagramapseudocodigoPackage.MATRIZ: return createMatriz();
			case DiagramapseudocodigoPackage.TIPO_COMPLEJO: return createTipoComplejo();
			case DiagramapseudocodigoPackage.REGISTRO: return createRegistro();
			case DiagramapseudocodigoPackage.TIPO: return createTipo();
			case DiagramapseudocodigoPackage.TIPO_DEFINIDO: return createTipoDefinido();
			case DiagramapseudocodigoPackage.TIPO_BASICO: return createTipoBasico();
			case DiagramapseudocodigoPackage.ARCHIVO: return createArchivo();
			case DiagramapseudocodigoPackage.ENUMERADO: return createEnumerado();
			case DiagramapseudocodigoPackage.SUBRANGO: return createSubrango();
			case DiagramapseudocodigoPackage.VALOR_COMPLEJO: return createValorComplejo();
			case DiagramapseudocodigoPackage.VALOR_REGISTRO: return createValorRegistro();
			case DiagramapseudocodigoPackage.CAMPO_REGISTRO: return createCampoRegistro();
			case DiagramapseudocodigoPackage.VALOR_VECTOR: return createValorVector();
			case DiagramapseudocodigoPackage.VALOR_MATRIZ: return createValorMatriz();
			case DiagramapseudocodigoPackage.COMENTARIO: return createComentario();
			case DiagramapseudocodigoPackage.FUNCION_FICHERO_ABRIR: return createFuncionFicheroAbrir();
			case DiagramapseudocodigoPackage.FUNCION_FICHERO_CERRAR: return createFuncionFicheroCerrar();
			case DiagramapseudocodigoPackage.SUMA: return createSuma();
			case DiagramapseudocodigoPackage.RESTA: return createResta();
			case DiagramapseudocodigoPackage.MULTIPLICACION: return createMultiplicacion();
			case DiagramapseudocodigoPackage.DIVISION_ENTERA: return createDivisionEntera();
			case DiagramapseudocodigoPackage.OR: return createOr();
			case DiagramapseudocodigoPackage.AND: return createAnd();
			case DiagramapseudocodigoPackage.COMPARACION: return createComparacion();
			case DiagramapseudocodigoPackage.IGUALDAD: return createIgualdad();
			case DiagramapseudocodigoPackage.SUBRANGO_NUMERICO: return createSubrangoNumerico();
			case DiagramapseudocodigoPackage.SUBRANGO_ENUMERADO: return createSubrangoEnumerado();
			case DiagramapseudocodigoPackage.ASIGNACION_NORMAL: return createAsignacionNormal();
			case DiagramapseudocodigoPackage.ASIGNACION_COMPLEJA: return createAsignacionCompleja();
			case DiagramapseudocodigoPackage.CODIGO: return createCodigo();
			case DiagramapseudocodigoPackage.MODULO: return createModulo();
			case DiagramapseudocodigoPackage.CABECERA_SUBPROCESO: return createCabeceraSubproceso();
			case DiagramapseudocodigoPackage.IMPLEMENTACION: return createImplementacion();
			case DiagramapseudocodigoPackage.CABECERA_PROCEDIMIENTO: return createCabeceraProcedimiento();
			case DiagramapseudocodigoPackage.CABECERA_FUNCION: return createCabeceraFuncion();
			case DiagramapseudocodigoPackage.MOD: return createMod();
			case DiagramapseudocodigoPackage.DIVISION_REAL: return createDivisionReal();
			case DiagramapseudocodigoPackage.OPERACION_PARENTESIS: return createOperacionParentesis();
			case DiagramapseudocodigoPackage.OPERACION_COMPLETA: return createOperacionCompleta();
			case DiagramapseudocodigoPackage.TIPO_SUBPROCESO: return createTipoSubproceso();
			case DiagramapseudocodigoPackage.TIPO_FUNCION: return createTipoFuncion();
			case DiagramapseudocodigoPackage.TIPO_PROCEDIMIENTO: return createTipoProcedimiento();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case DiagramapseudocodigoPackage.SIGNO:
				return createsignoFromString(eDataType, initialValue);
			case DiagramapseudocodigoPackage.MODO_APERTURA:
				return createModoAperturaFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case DiagramapseudocodigoPackage.SIGNO:
				return convertsignoToString(eDataType, instanceValue);
			case DiagramapseudocodigoPackage.MODO_APERTURA:
				return convertModoAperturaToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Algoritmo createAlgoritmo() {
		AlgoritmoImpl algoritmo = new AlgoritmoImpl();
		return algoritmo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Inicio createInicio() {
		InicioImpl inicio = new InicioImpl();
		return inicio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeclaracionBasica createDeclaracionBasica() {
		DeclaracionBasicaImpl declaracionBasica = new DeclaracionBasicaImpl();
		return declaracionBasica;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LlamadaFuncion createLlamadaFuncion() {
		LlamadaFuncionImpl llamadaFuncion = new LlamadaFuncionImpl();
		return llamadaFuncion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableID createVariableID() {
		VariableIDImpl variableID = new VariableIDImpl();
		return variableID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public cadena createcadena() {
		cadenaImpl cadena = new cadenaImpl();
		return cadena;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CadenaCaracteres createCadenaCaracteres() {
		CadenaCaracteresImpl cadenaCaracteres = new CadenaCaracteresImpl();
		return cadenaCaracteres;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable createVariable() {
		VariableImpl variable = new VariableImpl();
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entero createEntero() {
		EnteroImpl entero = new EnteroImpl();
		return entero;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Asignacion createAsignacion() {
		AsignacionImpl asignacion = new AsignacionImpl();
		return asignacion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Escribir createEscribir() {
		EscribirImpl escribir = new EscribirImpl();
		return escribir;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Funcion createFuncion() {
		FuncionImpl funcion = new FuncionImpl();
		return funcion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parametro createParametro() {
		ParametroImpl parametro = new ParametroImpl();
		return parametro;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Leer createLeer() {
		LeerImpl leer = new LeerImpl();
		return leer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Real createReal() {
		RealImpl real = new RealImpl();
		return real;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operacion createOperacion() {
		OperacionImpl operacion = new OperacionImpl();
		return operacion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Logico createLogico() {
		LogicoImpl logico = new LogicoImpl();
		return logico;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Si createSi() {
		SiImpl si = new SiImpl();
		return si;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sino createSino() {
		SinoImpl sino = new SinoImpl();
		return sino;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mientras createMientras() {
		MientrasImpl mientras = new MientrasImpl();
		return mientras;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Repetir createRepetir() {
		RepetirImpl repetir = new RepetirImpl();
		return repetir;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Desde createDesde() {
		DesdeImpl desde = new DesdeImpl();
		return desde;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Procedimiento createProcedimiento() {
		ProcedimientoImpl procedimiento = new ProcedimientoImpl();
		return procedimiento;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Caracter createCaracter() {
		CaracterImpl caracter = new CaracterImpl();
		return caracter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FuncionInterna createFuncionInterna() {
		FuncionInternaImpl funcionInterna = new FuncionInternaImpl();
		return funcionInterna;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Segun createSegun() {
		SegunImpl segun = new SegunImpl();
		return segun;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Devolver createDevolver() {
		DevolverImpl devolver = new DevolverImpl();
		return devolver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Caso createCaso() {
		CasoImpl caso = new CasoImpl();
		return caso;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constante createConstante() {
		ConstanteImpl constante = new ConstanteImpl();
		return constante;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vector createVector() {
		VectorImpl vector = new VectorImpl();
		return vector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeclaracionDefinida createDeclaracionDefinida() {
		DeclaracionDefinidaImpl declaracionDefinida = new DeclaracionDefinidaImpl();
		return declaracionDefinida;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Declaracion createDeclaracion() {
		DeclaracionImpl declaracion = new DeclaracionImpl();
		return declaracion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Matriz createMatriz() {
		MatrizImpl matriz = new MatrizImpl();
		return matriz;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TipoComplejo createTipoComplejo() {
		TipoComplejoImpl tipoComplejo = new TipoComplejoImpl();
		return tipoComplejo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Registro createRegistro() {
		RegistroImpl registro = new RegistroImpl();
		return registro;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tipo createTipo() {
		TipoImpl tipo = new TipoImpl();
		return tipo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TipoDefinido createTipoDefinido() {
		TipoDefinidoImpl tipoDefinido = new TipoDefinidoImpl();
		return tipoDefinido;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TipoBasico createTipoBasico() {
		TipoBasicoImpl tipoBasico = new TipoBasicoImpl();
		return tipoBasico;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Archivo createArchivo() {
		ArchivoImpl archivo = new ArchivoImpl();
		return archivo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Enumerado createEnumerado() {
		EnumeradoImpl enumerado = new EnumeradoImpl();
		return enumerado;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Subrango createSubrango() {
		SubrangoImpl subrango = new SubrangoImpl();
		return subrango;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValorComplejo createValorComplejo() {
		ValorComplejoImpl valorComplejo = new ValorComplejoImpl();
		return valorComplejo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValorRegistro createValorRegistro() {
		ValorRegistroImpl valorRegistro = new ValorRegistroImpl();
		return valorRegistro;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CampoRegistro createCampoRegistro() {
		CampoRegistroImpl campoRegistro = new CampoRegistroImpl();
		return campoRegistro;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValorVector createValorVector() {
		ValorVectorImpl valorVector = new ValorVectorImpl();
		return valorVector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValorMatriz createValorMatriz() {
		ValorMatrizImpl valorMatriz = new ValorMatrizImpl();
		return valorMatriz;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Comentario createComentario() {
		ComentarioImpl comentario = new ComentarioImpl();
		return comentario;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FuncionFicheroAbrir createFuncionFicheroAbrir() {
		FuncionFicheroAbrirImpl funcionFicheroAbrir = new FuncionFicheroAbrirImpl();
		return funcionFicheroAbrir;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FuncionFicheroCerrar createFuncionFicheroCerrar() {
		FuncionFicheroCerrarImpl funcionFicheroCerrar = new FuncionFicheroCerrarImpl();
		return funcionFicheroCerrar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Suma createSuma() {
		SumaImpl suma = new SumaImpl();
		return suma;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resta createResta() {
		RestaImpl resta = new RestaImpl();
		return resta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Multiplicacion createMultiplicacion() {
		MultiplicacionImpl multiplicacion = new MultiplicacionImpl();
		return multiplicacion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DivisionEntera createDivisionEntera() {
		DivisionEnteraImpl divisionEntera = new DivisionEnteraImpl();
		return divisionEntera;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Or createOr() {
		OrImpl or = new OrImpl();
		return or;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public And createAnd() {
		AndImpl and = new AndImpl();
		return and;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Comparacion createComparacion() {
		ComparacionImpl comparacion = new ComparacionImpl();
		return comparacion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Igualdad createIgualdad() {
		IgualdadImpl igualdad = new IgualdadImpl();
		return igualdad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubrangoNumerico createSubrangoNumerico() {
		SubrangoNumericoImpl subrangoNumerico = new SubrangoNumericoImpl();
		return subrangoNumerico;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubrangoEnumerado createSubrangoEnumerado() {
		SubrangoEnumeradoImpl subrangoEnumerado = new SubrangoEnumeradoImpl();
		return subrangoEnumerado;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AsignacionNormal createAsignacionNormal() {
		AsignacionNormalImpl asignacionNormal = new AsignacionNormalImpl();
		return asignacionNormal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AsignacionCompleja createAsignacionCompleja() {
		AsignacionComplejaImpl asignacionCompleja = new AsignacionComplejaImpl();
		return asignacionCompleja;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Codigo createCodigo() {
		CodigoImpl codigo = new CodigoImpl();
		return codigo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Modulo createModulo() {
		ModuloImpl modulo = new ModuloImpl();
		return modulo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CabeceraSubproceso createCabeceraSubproceso() {
		CabeceraSubprocesoImpl cabeceraSubproceso = new CabeceraSubprocesoImpl();
		return cabeceraSubproceso;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Implementacion createImplementacion() {
		ImplementacionImpl implementacion = new ImplementacionImpl();
		return implementacion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CabeceraProcedimiento createCabeceraProcedimiento() {
		CabeceraProcedimientoImpl cabeceraProcedimiento = new CabeceraProcedimientoImpl();
		return cabeceraProcedimiento;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CabeceraFuncion createCabeceraFuncion() {
		CabeceraFuncionImpl cabeceraFuncion = new CabeceraFuncionImpl();
		return cabeceraFuncion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mod createMod() {
		ModImpl mod = new ModImpl();
		return mod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DivisionReal createDivisionReal() {
		DivisionRealImpl divisionReal = new DivisionRealImpl();
		return divisionReal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperacionParentesis createOperacionParentesis() {
		OperacionParentesisImpl operacionParentesis = new OperacionParentesisImpl();
		return operacionParentesis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperacionCompleta createOperacionCompleta() {
		OperacionCompletaImpl operacionCompleta = new OperacionCompletaImpl();
		return operacionCompleta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TipoSubproceso createTipoSubproceso() {
		TipoSubprocesoImpl tipoSubproceso = new TipoSubprocesoImpl();
		return tipoSubproceso;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TipoFuncion createTipoFuncion() {
		TipoFuncionImpl tipoFuncion = new TipoFuncionImpl();
		return tipoFuncion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TipoProcedimiento createTipoProcedimiento() {
		TipoProcedimientoImpl tipoProcedimiento = new TipoProcedimientoImpl();
		return tipoProcedimiento;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public signo createsignoFromString(EDataType eDataType, String initialValue) {
		signo result = signo.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertsignoToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModoApertura createModoAperturaFromString(EDataType eDataType, String initialValue) {
		ModoApertura result = ModoApertura.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertModoAperturaToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiagramapseudocodigoPackage getDiagramapseudocodigoPackage() {
		return (DiagramapseudocodigoPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DiagramapseudocodigoPackage getPackage() {
		return DiagramapseudocodigoPackage.eINSTANCE;
	}

} //DiagramapseudocodigoFactoryImpl
