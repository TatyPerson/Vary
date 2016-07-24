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
			case DiagramapseudocodigoPackage.DECLARACION_VARIABLE: return createDeclaracionVariable();
			case DiagramapseudocodigoPackage.LLAMADA_FUNCION: return createLlamadaFuncion();
			case DiagramapseudocodigoPackage.VARIABLE_ID: return createVariableID();
			case DiagramapseudocodigoPackage.CADENA: return createcadena();
			case DiagramapseudocodigoPackage.CONST_CADENA: return createConstCadena();
			case DiagramapseudocodigoPackage.VARIABLE: return createVariable();
			case DiagramapseudocodigoPackage.NUMERO_ENTERO: return createNumeroEntero();
			case DiagramapseudocodigoPackage.ASIGNACION: return createAsignacion();
			case DiagramapseudocodigoPackage.ESCRIBIR: return createEscribir();
			case DiagramapseudocodigoPackage.FUNCION: return createFuncion();
			case DiagramapseudocodigoPackage.PARAMETRO_FUNCION: return createParametroFuncion();
			case DiagramapseudocodigoPackage.LEER: return createLeer();
			case DiagramapseudocodigoPackage.NUMERO_DECIMAL: return createNumeroDecimal();
			case DiagramapseudocodigoPackage.OPERACION: return createoperacion();
			case DiagramapseudocodigoPackage.VALOR_BOOLEANO: return createValorBooleano();
			case DiagramapseudocodigoPackage.SI: return createSi();
			case DiagramapseudocodigoPackage.SINO: return createSino();
			case DiagramapseudocodigoPackage.MIENTRAS: return createmientras();
			case DiagramapseudocodigoPackage.REPETIR: return createrepetir();
			case DiagramapseudocodigoPackage.DESDE: return createdesde();
			case DiagramapseudocodigoPackage.PROCEDIMIENTO: return createProcedimiento();
			case DiagramapseudocodigoPackage.CARACTER: return createCaracter();
			case DiagramapseudocodigoPackage.INTERNAS: return createInternas();
			case DiagramapseudocodigoPackage.SEGUN: return createsegun();
			case DiagramapseudocodigoPackage.DEVOLVER: return createDevolver();
			case DiagramapseudocodigoPackage.CASO: return createCaso();
			case DiagramapseudocodigoPackage.CONSTANTES: return createConstantes();
			case DiagramapseudocodigoPackage.VECTOR: return createVector();
			case DiagramapseudocodigoPackage.DECLARACION_PROPIA: return createDeclaracionPropia();
			case DiagramapseudocodigoPackage.DECLARACION: return createDeclaracion();
			case DiagramapseudocodigoPackage.MATRIZ: return createMatriz();
			case DiagramapseudocodigoPackage.TIPO_COMPLEJO: return createTipoComplejo();
			case DiagramapseudocodigoPackage.REGISTRO: return createRegistro();
			case DiagramapseudocodigoPackage.TIPO: return createTipo();
			case DiagramapseudocodigoPackage.TIPO_DEFINIDO: return createTipoDefinido();
			case DiagramapseudocodigoPackage.TIPO_EXISTENTE: return createTipoExistente();
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
			case DiagramapseudocodigoPackage.DIVISION: return createDivision();
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
			case DiagramapseudocodigoPackage.DIV: return createDiv();
			case DiagramapseudocodigoPackage.OPERACION_PARENTESIS: return createOperacionParentesis();
			case DiagramapseudocodigoPackage.UNARIA: return createUnaria();
			case DiagramapseudocodigoPackage.OPERACION_COMPLETA: return createOperacionCompleta();
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
	public Div createDiv() {
		DivImpl div = new DivImpl();
		return div;
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
	public Unaria createUnaria() {
		UnariaImpl unaria = new UnariaImpl();
		return unaria;
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
	public Inicio createInicio() {
		InicioImpl inicio = new InicioImpl();
		return inicio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeclaracionVariable createDeclaracionVariable() {
		DeclaracionVariableImpl declaracionVariable = new DeclaracionVariableImpl();
		return declaracionVariable;
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
	public ConstCadena createConstCadena() {
		ConstCadenaImpl constCadena = new ConstCadenaImpl();
		return constCadena;
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
	public NumeroEntero createNumeroEntero() {
		NumeroEnteroImpl numeroEntero = new NumeroEnteroImpl();
		return numeroEntero;
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
	public ParametroFuncion createParametroFuncion() {
		ParametroFuncionImpl parametroFuncion = new ParametroFuncionImpl();
		return parametroFuncion;
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
	public NumeroDecimal createNumeroDecimal() {
		NumeroDecimalImpl numeroDecimal = new NumeroDecimalImpl();
		return numeroDecimal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public operacion createoperacion() {
		operacionImpl operacion = new operacionImpl();
		return operacion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValorBooleano createValorBooleano() {
		ValorBooleanoImpl valorBooleano = new ValorBooleanoImpl();
		return valorBooleano;
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
	public mientras createmientras() {
		mientrasImpl mientras = new mientrasImpl();
		return mientras;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public repetir createrepetir() {
		repetirImpl repetir = new repetirImpl();
		return repetir;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public desde createdesde() {
		desdeImpl desde = new desdeImpl();
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
	public Internas createInternas() {
		InternasImpl internas = new InternasImpl();
		return internas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public segun createsegun() {
		segunImpl segun = new segunImpl();
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
	public Constantes createConstantes() {
		ConstantesImpl constantes = new ConstantesImpl();
		return constantes;
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
	public DeclaracionPropia createDeclaracionPropia() {
		DeclaracionPropiaImpl declaracionPropia = new DeclaracionPropiaImpl();
		return declaracionPropia;
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
	public TipoExistente createTipoExistente() {
		TipoExistenteImpl tipoExistente = new TipoExistenteImpl();
		return tipoExistente;
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
	public Division createDivision() {
		DivisionImpl division = new DivisionImpl();
		return division;
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
