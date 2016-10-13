/**
 */
package diagramapseudocodigo.util;

import diagramapseudocodigo.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see diagramapseudocodigo.DiagramapseudocodigoPackage
 * @generated
 */
public class DiagramapseudocodigoAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DiagramapseudocodigoPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiagramapseudocodigoAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = DiagramapseudocodigoPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiagramapseudocodigoSwitch<Adapter> modelSwitch =
		new DiagramapseudocodigoSwitch<Adapter>() {
			@Override
			public Adapter caseAlgoritmo(Algoritmo object) {
				return createAlgoritmoAdapter();
			}
			@Override
			public Adapter caseInicio(Inicio object) {
				return createInicioAdapter();
			}
			@Override
			public Adapter caseSentencia(Sentencia object) {
				return createSentenciaAdapter();
			}
			@Override
			public Adapter caseDeclaracionBasica(DeclaracionBasica object) {
				return createDeclaracionBasicaAdapter();
			}
			@Override
			public Adapter caseLlamadaFuncion(LlamadaFuncion object) {
				return createLlamadaFuncionAdapter();
			}
			@Override
			public Adapter caseVariableID(VariableID object) {
				return createVariableIDAdapter();
			}
			@Override
			public Adapter casecadena(cadena object) {
				return createcadenaAdapter();
			}
			@Override
			public Adapter caseCadenaCaracteres(CadenaCaracteres object) {
				return createCadenaCaracteresAdapter();
			}
			@Override
			public Adapter caseVariable(Variable object) {
				return createVariableAdapter();
			}
			@Override
			public Adapter caseOperador(Operador object) {
				return createOperadorAdapter();
			}
			@Override
			public Adapter caseEntero(Entero object) {
				return createEnteroAdapter();
			}
			@Override
			public Adapter caseAsignacion(Asignacion object) {
				return createAsignacionAdapter();
			}
			@Override
			public Adapter caseEscribir(Escribir object) {
				return createEscribirAdapter();
			}
			@Override
			public Adapter caseFuncion(Funcion object) {
				return createFuncionAdapter();
			}
			@Override
			public Adapter caseParametro(Parametro object) {
				return createParametroAdapter();
			}
			@Override
			public Adapter caseLeer(Leer object) {
				return createLeerAdapter();
			}
			@Override
			public Adapter caseReal(Real object) {
				return createRealAdapter();
			}
			@Override
			public Adapter caseValor(Valor object) {
				return createValorAdapter();
			}
			@Override
			public Adapter caseOperacion(Operacion object) {
				return createOperacionAdapter();
			}
			@Override
			public Adapter caseLogico(Logico object) {
				return createLogicoAdapter();
			}
			@Override
			public Adapter caseSi(Si object) {
				return createSiAdapter();
			}
			@Override
			public Adapter caseSino(Sino object) {
				return createSinoAdapter();
			}
			@Override
			public Adapter caseBloque(Bloque object) {
				return createBloqueAdapter();
			}
			@Override
			public Adapter caseMientras(Mientras object) {
				return createMientrasAdapter();
			}
			@Override
			public Adapter caseRepetir(Repetir object) {
				return createRepetirAdapter();
			}
			@Override
			public Adapter caseDesde(Desde object) {
				return createDesdeAdapter();
			}
			@Override
			public Adapter caseSubproceso(Subproceso object) {
				return createSubprocesoAdapter();
			}
			@Override
			public Adapter caseProcedimiento(Procedimiento object) {
				return createProcedimientoAdapter();
			}
			@Override
			public Adapter caseCaracter(Caracter object) {
				return createCaracterAdapter();
			}
			@Override
			public Adapter caseFuncionInterna(FuncionInterna object) {
				return createFuncionInternaAdapter();
			}
			@Override
			public Adapter caseSegun(Segun object) {
				return createSegunAdapter();
			}
			@Override
			public Adapter caseDevolver(Devolver object) {
				return createDevolverAdapter();
			}
			@Override
			public Adapter caseCaso(Caso object) {
				return createCasoAdapter();
			}
			@Override
			public Adapter caseConstante(Constante object) {
				return createConstanteAdapter();
			}
			@Override
			public Adapter caseVector(Vector object) {
				return createVectorAdapter();
			}
			@Override
			public Adapter caseDeclaracionDefinida(DeclaracionDefinida object) {
				return createDeclaracionDefinidaAdapter();
			}
			@Override
			public Adapter caseDeclaracion(Declaracion object) {
				return createDeclaracionAdapter();
			}
			@Override
			public Adapter caseMatriz(Matriz object) {
				return createMatrizAdapter();
			}
			@Override
			public Adapter caseTipoComplejo(TipoComplejo object) {
				return createTipoComplejoAdapter();
			}
			@Override
			public Adapter caseRegistro(Registro object) {
				return createRegistroAdapter();
			}
			@Override
			public Adapter caseTipo(Tipo object) {
				return createTipoAdapter();
			}
			@Override
			public Adapter caseTipoDefinido(TipoDefinido object) {
				return createTipoDefinidoAdapter();
			}
			@Override
			public Adapter caseTipoBasico(TipoBasico object) {
				return createTipoBasicoAdapter();
			}
			@Override
			public Adapter caseArchivo(Archivo object) {
				return createArchivoAdapter();
			}
			@Override
			public Adapter caseEnumerado(Enumerado object) {
				return createEnumeradoAdapter();
			}
			@Override
			public Adapter caseSubrango(Subrango object) {
				return createSubrangoAdapter();
			}
			@Override
			public Adapter caseValorComplejo(ValorComplejo object) {
				return createValorComplejoAdapter();
			}
			@Override
			public Adapter caseValorRegistro(ValorRegistro object) {
				return createValorRegistroAdapter();
			}
			@Override
			public Adapter caseCampoRegistro(CampoRegistro object) {
				return createCampoRegistroAdapter();
			}
			@Override
			public Adapter caseValorVector(ValorVector object) {
				return createValorVectorAdapter();
			}
			@Override
			public Adapter caseValorMatriz(ValorMatriz object) {
				return createValorMatrizAdapter();
			}
			@Override
			public Adapter caseComentario(Comentario object) {
				return createComentarioAdapter();
			}
			@Override
			public Adapter caseFuncionFicheroAbrir(FuncionFicheroAbrir object) {
				return createFuncionFicheroAbrirAdapter();
			}
			@Override
			public Adapter caseFuncionFicheroCerrar(FuncionFicheroCerrar object) {
				return createFuncionFicheroCerrarAdapter();
			}
			@Override
			public Adapter caseSuma(Suma object) {
				return createSumaAdapter();
			}
			@Override
			public Adapter caseResta(Resta object) {
				return createRestaAdapter();
			}
			@Override
			public Adapter caseMultiplicacion(Multiplicacion object) {
				return createMultiplicacionAdapter();
			}
			@Override
			public Adapter caseDivisionEntera(DivisionEntera object) {
				return createDivisionEnteraAdapter();
			}
			@Override
			public Adapter caseOr(Or object) {
				return createOrAdapter();
			}
			@Override
			public Adapter caseAnd(And object) {
				return createAndAdapter();
			}
			@Override
			public Adapter caseComparacion(Comparacion object) {
				return createComparacionAdapter();
			}
			@Override
			public Adapter caseIgualdad(Igualdad object) {
				return createIgualdadAdapter();
			}
			@Override
			public Adapter caseSubrangoNumerico(SubrangoNumerico object) {
				return createSubrangoNumericoAdapter();
			}
			@Override
			public Adapter caseSubrangoEnumerado(SubrangoEnumerado object) {
				return createSubrangoEnumeradoAdapter();
			}
			@Override
			public Adapter caseAsignacionNormal(AsignacionNormal object) {
				return createAsignacionNormalAdapter();
			}
			@Override
			public Adapter caseAsignacionCompleja(AsignacionCompleja object) {
				return createAsignacionComplejaAdapter();
			}
			@Override
			public Adapter caseCodigo(Codigo object) {
				return createCodigoAdapter();
			}
			@Override
			public Adapter caseModulo(Modulo object) {
				return createModuloAdapter();
			}
			@Override
			public Adapter caseCabeceraSubproceso(CabeceraSubproceso object) {
				return createCabeceraSubprocesoAdapter();
			}
			@Override
			public Adapter caseImplementacion(Implementacion object) {
				return createImplementacionAdapter();
			}
			@Override
			public Adapter caseCabeceraProcedimiento(CabeceraProcedimiento object) {
				return createCabeceraProcedimientoAdapter();
			}
			@Override
			public Adapter caseCabeceraFuncion(CabeceraFuncion object) {
				return createCabeceraFuncionAdapter();
			}
			@Override
			public Adapter caseMod(Mod object) {
				return createModAdapter();
			}
			@Override
			public Adapter caseDivisionReal(DivisionReal object) {
				return createDivisionRealAdapter();
			}
			@Override
			public Adapter caseOperacionParentesis(OperacionParentesis object) {
				return createOperacionParentesisAdapter();
			}
			@Override
			public Adapter caseOperacionCompleta(OperacionCompleta object) {
				return createOperacionCompletaAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link diagramapseudocodigo.Algoritmo <em>Algoritmo</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see diagramapseudocodigo.Algoritmo
	 * @generated
	 */
	public Adapter createAlgoritmoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link diagramapseudocodigo.Inicio <em>Inicio</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see diagramapseudocodigo.Inicio
	 * @generated
	 */
	public Adapter createInicioAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link diagramapseudocodigo.Sentencia <em>Sentencia</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see diagramapseudocodigo.Sentencia
	 * @generated
	 */
	public Adapter createSentenciaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link diagramapseudocodigo.DeclaracionBasica <em>Declaracion Basica</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see diagramapseudocodigo.DeclaracionBasica
	 * @generated
	 */
	public Adapter createDeclaracionBasicaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link diagramapseudocodigo.LlamadaFuncion <em>Llamada Funcion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see diagramapseudocodigo.LlamadaFuncion
	 * @generated
	 */
	public Adapter createLlamadaFuncionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link diagramapseudocodigo.VariableID <em>Variable ID</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see diagramapseudocodigo.VariableID
	 * @generated
	 */
	public Adapter createVariableIDAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link diagramapseudocodigo.cadena <em>cadena</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see diagramapseudocodigo.cadena
	 * @generated
	 */
	public Adapter createcadenaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link diagramapseudocodigo.CadenaCaracteres <em>Cadena Caracteres</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see diagramapseudocodigo.CadenaCaracteres
	 * @generated
	 */
	public Adapter createCadenaCaracteresAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link diagramapseudocodigo.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see diagramapseudocodigo.Variable
	 * @generated
	 */
	public Adapter createVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link diagramapseudocodigo.Operador <em>Operador</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see diagramapseudocodigo.Operador
	 * @generated
	 */
	public Adapter createOperadorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link diagramapseudocodigo.Entero <em>Entero</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see diagramapseudocodigo.Entero
	 * @generated
	 */
	public Adapter createEnteroAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link diagramapseudocodigo.Asignacion <em>Asignacion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see diagramapseudocodigo.Asignacion
	 * @generated
	 */
	public Adapter createAsignacionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link diagramapseudocodigo.Escribir <em>Escribir</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see diagramapseudocodigo.Escribir
	 * @generated
	 */
	public Adapter createEscribirAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link diagramapseudocodigo.Funcion <em>Funcion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see diagramapseudocodigo.Funcion
	 * @generated
	 */
	public Adapter createFuncionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link diagramapseudocodigo.Parametro <em>Parametro</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see diagramapseudocodigo.Parametro
	 * @generated
	 */
	public Adapter createParametroAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link diagramapseudocodigo.Leer <em>Leer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see diagramapseudocodigo.Leer
	 * @generated
	 */
	public Adapter createLeerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link diagramapseudocodigo.Real <em>Real</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see diagramapseudocodigo.Real
	 * @generated
	 */
	public Adapter createRealAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link diagramapseudocodigo.Valor <em>Valor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see diagramapseudocodigo.Valor
	 * @generated
	 */
	public Adapter createValorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link diagramapseudocodigo.Operacion <em>Operacion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see diagramapseudocodigo.Operacion
	 * @generated
	 */
	public Adapter createOperacionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link diagramapseudocodigo.Logico <em>Logico</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see diagramapseudocodigo.Logico
	 * @generated
	 */
	public Adapter createLogicoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link diagramapseudocodigo.Si <em>Si</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see diagramapseudocodigo.Si
	 * @generated
	 */
	public Adapter createSiAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link diagramapseudocodigo.Sino <em>Sino</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see diagramapseudocodigo.Sino
	 * @generated
	 */
	public Adapter createSinoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link diagramapseudocodigo.Bloque <em>Bloque</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see diagramapseudocodigo.Bloque
	 * @generated
	 */
	public Adapter createBloqueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link diagramapseudocodigo.Mientras <em>Mientras</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see diagramapseudocodigo.Mientras
	 * @generated
	 */
	public Adapter createMientrasAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link diagramapseudocodigo.Repetir <em>Repetir</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see diagramapseudocodigo.Repetir
	 * @generated
	 */
	public Adapter createRepetirAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link diagramapseudocodigo.Desde <em>Desde</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see diagramapseudocodigo.Desde
	 * @generated
	 */
	public Adapter createDesdeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link diagramapseudocodigo.Subproceso <em>Subproceso</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see diagramapseudocodigo.Subproceso
	 * @generated
	 */
	public Adapter createSubprocesoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link diagramapseudocodigo.Procedimiento <em>Procedimiento</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see diagramapseudocodigo.Procedimiento
	 * @generated
	 */
	public Adapter createProcedimientoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link diagramapseudocodigo.Caracter <em>Caracter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see diagramapseudocodigo.Caracter
	 * @generated
	 */
	public Adapter createCaracterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link diagramapseudocodigo.FuncionInterna <em>Funcion Interna</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see diagramapseudocodigo.FuncionInterna
	 * @generated
	 */
	public Adapter createFuncionInternaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link diagramapseudocodigo.Segun <em>Segun</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see diagramapseudocodigo.Segun
	 * @generated
	 */
	public Adapter createSegunAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link diagramapseudocodigo.Devolver <em>Devolver</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see diagramapseudocodigo.Devolver
	 * @generated
	 */
	public Adapter createDevolverAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link diagramapseudocodigo.Caso <em>Caso</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see diagramapseudocodigo.Caso
	 * @generated
	 */
	public Adapter createCasoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link diagramapseudocodigo.Constante <em>Constante</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see diagramapseudocodigo.Constante
	 * @generated
	 */
	public Adapter createConstanteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link diagramapseudocodigo.Vector <em>Vector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see diagramapseudocodigo.Vector
	 * @generated
	 */
	public Adapter createVectorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link diagramapseudocodigo.DeclaracionDefinida <em>Declaracion Definida</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see diagramapseudocodigo.DeclaracionDefinida
	 * @generated
	 */
	public Adapter createDeclaracionDefinidaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link diagramapseudocodigo.Declaracion <em>Declaracion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see diagramapseudocodigo.Declaracion
	 * @generated
	 */
	public Adapter createDeclaracionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link diagramapseudocodigo.Matriz <em>Matriz</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see diagramapseudocodigo.Matriz
	 * @generated
	 */
	public Adapter createMatrizAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link diagramapseudocodigo.TipoComplejo <em>Tipo Complejo</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see diagramapseudocodigo.TipoComplejo
	 * @generated
	 */
	public Adapter createTipoComplejoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link diagramapseudocodigo.Registro <em>Registro</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see diagramapseudocodigo.Registro
	 * @generated
	 */
	public Adapter createRegistroAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link diagramapseudocodigo.Tipo <em>Tipo</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see diagramapseudocodigo.Tipo
	 * @generated
	 */
	public Adapter createTipoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link diagramapseudocodigo.TipoDefinido <em>Tipo Definido</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see diagramapseudocodigo.TipoDefinido
	 * @generated
	 */
	public Adapter createTipoDefinidoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link diagramapseudocodigo.TipoBasico <em>Tipo Basico</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see diagramapseudocodigo.TipoBasico
	 * @generated
	 */
	public Adapter createTipoBasicoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link diagramapseudocodigo.Archivo <em>Archivo</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see diagramapseudocodigo.Archivo
	 * @generated
	 */
	public Adapter createArchivoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link diagramapseudocodigo.Enumerado <em>Enumerado</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see diagramapseudocodigo.Enumerado
	 * @generated
	 */
	public Adapter createEnumeradoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link diagramapseudocodigo.Subrango <em>Subrango</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see diagramapseudocodigo.Subrango
	 * @generated
	 */
	public Adapter createSubrangoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link diagramapseudocodigo.ValorComplejo <em>Valor Complejo</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see diagramapseudocodigo.ValorComplejo
	 * @generated
	 */
	public Adapter createValorComplejoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link diagramapseudocodigo.ValorRegistro <em>Valor Registro</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see diagramapseudocodigo.ValorRegistro
	 * @generated
	 */
	public Adapter createValorRegistroAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link diagramapseudocodigo.CampoRegistro <em>Campo Registro</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see diagramapseudocodigo.CampoRegistro
	 * @generated
	 */
	public Adapter createCampoRegistroAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link diagramapseudocodigo.ValorVector <em>Valor Vector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see diagramapseudocodigo.ValorVector
	 * @generated
	 */
	public Adapter createValorVectorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link diagramapseudocodigo.ValorMatriz <em>Valor Matriz</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see diagramapseudocodigo.ValorMatriz
	 * @generated
	 */
	public Adapter createValorMatrizAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link diagramapseudocodigo.Comentario <em>Comentario</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see diagramapseudocodigo.Comentario
	 * @generated
	 */
	public Adapter createComentarioAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link diagramapseudocodigo.FuncionFicheroAbrir <em>Funcion Fichero Abrir</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see diagramapseudocodigo.FuncionFicheroAbrir
	 * @generated
	 */
	public Adapter createFuncionFicheroAbrirAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link diagramapseudocodigo.FuncionFicheroCerrar <em>Funcion Fichero Cerrar</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see diagramapseudocodigo.FuncionFicheroCerrar
	 * @generated
	 */
	public Adapter createFuncionFicheroCerrarAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link diagramapseudocodigo.Suma <em>Suma</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see diagramapseudocodigo.Suma
	 * @generated
	 */
	public Adapter createSumaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link diagramapseudocodigo.Resta <em>Resta</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see diagramapseudocodigo.Resta
	 * @generated
	 */
	public Adapter createRestaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link diagramapseudocodigo.Multiplicacion <em>Multiplicacion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see diagramapseudocodigo.Multiplicacion
	 * @generated
	 */
	public Adapter createMultiplicacionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link diagramapseudocodigo.DivisionEntera <em>Division Entera</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see diagramapseudocodigo.DivisionEntera
	 * @generated
	 */
	public Adapter createDivisionEnteraAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link diagramapseudocodigo.Or <em>Or</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see diagramapseudocodigo.Or
	 * @generated
	 */
	public Adapter createOrAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link diagramapseudocodigo.And <em>And</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see diagramapseudocodigo.And
	 * @generated
	 */
	public Adapter createAndAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link diagramapseudocodigo.Comparacion <em>Comparacion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see diagramapseudocodigo.Comparacion
	 * @generated
	 */
	public Adapter createComparacionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link diagramapseudocodigo.Igualdad <em>Igualdad</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see diagramapseudocodigo.Igualdad
	 * @generated
	 */
	public Adapter createIgualdadAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link diagramapseudocodigo.SubrangoNumerico <em>Subrango Numerico</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see diagramapseudocodigo.SubrangoNumerico
	 * @generated
	 */
	public Adapter createSubrangoNumericoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link diagramapseudocodigo.SubrangoEnumerado <em>Subrango Enumerado</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see diagramapseudocodigo.SubrangoEnumerado
	 * @generated
	 */
	public Adapter createSubrangoEnumeradoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link diagramapseudocodigo.AsignacionNormal <em>Asignacion Normal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see diagramapseudocodigo.AsignacionNormal
	 * @generated
	 */
	public Adapter createAsignacionNormalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link diagramapseudocodigo.AsignacionCompleja <em>Asignacion Compleja</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see diagramapseudocodigo.AsignacionCompleja
	 * @generated
	 */
	public Adapter createAsignacionComplejaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link diagramapseudocodigo.Codigo <em>Codigo</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see diagramapseudocodigo.Codigo
	 * @generated
	 */
	public Adapter createCodigoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link diagramapseudocodigo.Modulo <em>Modulo</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see diagramapseudocodigo.Modulo
	 * @generated
	 */
	public Adapter createModuloAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link diagramapseudocodigo.CabeceraSubproceso <em>Cabecera Subproceso</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see diagramapseudocodigo.CabeceraSubproceso
	 * @generated
	 */
	public Adapter createCabeceraSubprocesoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link diagramapseudocodigo.Implementacion <em>Implementacion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see diagramapseudocodigo.Implementacion
	 * @generated
	 */
	public Adapter createImplementacionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link diagramapseudocodigo.CabeceraProcedimiento <em>Cabecera Procedimiento</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see diagramapseudocodigo.CabeceraProcedimiento
	 * @generated
	 */
	public Adapter createCabeceraProcedimientoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link diagramapseudocodigo.CabeceraFuncion <em>Cabecera Funcion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see diagramapseudocodigo.CabeceraFuncion
	 * @generated
	 */
	public Adapter createCabeceraFuncionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link diagramapseudocodigo.Mod <em>Mod</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see diagramapseudocodigo.Mod
	 * @generated
	 */
	public Adapter createModAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link diagramapseudocodigo.DivisionReal <em>Division Real</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see diagramapseudocodigo.DivisionReal
	 * @generated
	 */
	public Adapter createDivisionRealAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link diagramapseudocodigo.OperacionParentesis <em>Operacion Parentesis</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see diagramapseudocodigo.OperacionParentesis
	 * @generated
	 */
	public Adapter createOperacionParentesisAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link diagramapseudocodigo.OperacionCompleta <em>Operacion Completa</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see diagramapseudocodigo.OperacionCompleta
	 * @generated
	 */
	public Adapter createOperacionCompletaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //DiagramapseudocodigoAdapterFactory
