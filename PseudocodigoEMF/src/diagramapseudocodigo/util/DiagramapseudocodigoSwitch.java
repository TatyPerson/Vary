/**
 */
package diagramapseudocodigo.util;

import diagramapseudocodigo.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see diagramapseudocodigo.DiagramapseudocodigoPackage
 * @generated
 */
public class DiagramapseudocodigoSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DiagramapseudocodigoPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiagramapseudocodigoSwitch() {
		if (modelPackage == null) {
			modelPackage = DiagramapseudocodigoPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case DiagramapseudocodigoPackage.ALGORITMO: {
				Algoritmo algoritmo = (Algoritmo)theEObject;
				T result = caseAlgoritmo(algoritmo);
				if (result == null) result = caseCodigo(algoritmo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DiagramapseudocodigoPackage.INICIO: {
				Inicio inicio = (Inicio)theEObject;
				T result = caseInicio(inicio);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DiagramapseudocodigoPackage.SENTENCIA: {
				Sentencia sentencia = (Sentencia)theEObject;
				T result = caseSentencia(sentencia);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DiagramapseudocodigoPackage.DECLARACION_BASICA: {
				DeclaracionBasica declaracionBasica = (DeclaracionBasica)theEObject;
				T result = caseDeclaracionBasica(declaracionBasica);
				if (result == null) result = caseDeclaracion(declaracionBasica);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DiagramapseudocodigoPackage.LLAMADA_FUNCION: {
				LlamadaFuncion llamadaFuncion = (LlamadaFuncion)theEObject;
				T result = caseLlamadaFuncion(llamadaFuncion);
				if (result == null) result = caseOperacion(llamadaFuncion);
				if (result == null) result = caseValor(llamadaFuncion);
				if (result == null) result = caseSentencia(llamadaFuncion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DiagramapseudocodigoPackage.VARIABLE_ID: {
				VariableID variableID = (VariableID)theEObject;
				T result = caseVariableID(variableID);
				if (result == null) result = caseOperador(variableID);
				if (result == null) result = caseOperacion(variableID);
				if (result == null) result = caseValor(variableID);
				if (result == null) result = caseSentencia(variableID);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DiagramapseudocodigoPackage.CADENA: {
				cadena cadena = (cadena)theEObject;
				T result = casecadena(cadena);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DiagramapseudocodigoPackage.CADENA_CARACTERES: {
				CadenaCaracteres cadenaCaracteres = (CadenaCaracteres)theEObject;
				T result = caseCadenaCaracteres(cadenaCaracteres);
				if (result == null) result = caseOperador(cadenaCaracteres);
				if (result == null) result = caseOperacion(cadenaCaracteres);
				if (result == null) result = caseValor(cadenaCaracteres);
				if (result == null) result = caseSentencia(cadenaCaracteres);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DiagramapseudocodigoPackage.VARIABLE: {
				Variable variable = (Variable)theEObject;
				T result = caseVariable(variable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DiagramapseudocodigoPackage.OPERADOR: {
				Operador operador = (Operador)theEObject;
				T result = caseOperador(operador);
				if (result == null) result = caseValor(operador);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DiagramapseudocodigoPackage.ENTERO: {
				Entero entero = (Entero)theEObject;
				T result = caseEntero(entero);
				if (result == null) result = caseOperador(entero);
				if (result == null) result = caseOperacion(entero);
				if (result == null) result = caseValor(entero);
				if (result == null) result = caseSentencia(entero);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DiagramapseudocodigoPackage.ASIGNACION: {
				Asignacion asignacion = (Asignacion)theEObject;
				T result = caseAsignacion(asignacion);
				if (result == null) result = caseSentencia(asignacion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DiagramapseudocodigoPackage.ESCRIBIR: {
				Escribir escribir = (Escribir)theEObject;
				T result = caseEscribir(escribir);
				if (result == null) result = caseSentencia(escribir);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DiagramapseudocodigoPackage.FUNCION: {
				Funcion funcion = (Funcion)theEObject;
				T result = caseFuncion(funcion);
				if (result == null) result = caseSubproceso(funcion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DiagramapseudocodigoPackage.PARAMETRO: {
				Parametro parametro = (Parametro)theEObject;
				T result = caseParametro(parametro);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DiagramapseudocodigoPackage.LEER: {
				Leer leer = (Leer)theEObject;
				T result = caseLeer(leer);
				if (result == null) result = caseSentencia(leer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DiagramapseudocodigoPackage.REAL: {
				Real real = (Real)theEObject;
				T result = caseReal(real);
				if (result == null) result = caseOperador(real);
				if (result == null) result = caseOperacion(real);
				if (result == null) result = caseValor(real);
				if (result == null) result = caseSentencia(real);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DiagramapseudocodigoPackage.VALOR: {
				Valor valor = (Valor)theEObject;
				T result = caseValor(valor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DiagramapseudocodigoPackage.OPERACION: {
				Operacion operacion = (Operacion)theEObject;
				T result = caseOperacion(operacion);
				if (result == null) result = caseValor(operacion);
				if (result == null) result = caseSentencia(operacion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DiagramapseudocodigoPackage.LOGICO: {
				Logico logico = (Logico)theEObject;
				T result = caseLogico(logico);
				if (result == null) result = caseOperador(logico);
				if (result == null) result = caseOperacion(logico);
				if (result == null) result = caseValor(logico);
				if (result == null) result = caseSentencia(logico);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DiagramapseudocodigoPackage.SI: {
				Si si = (Si)theEObject;
				T result = caseSi(si);
				if (result == null) result = caseBloque(si);
				if (result == null) result = caseSentencia(si);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DiagramapseudocodigoPackage.SINO: {
				Sino sino = (Sino)theEObject;
				T result = caseSino(sino);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DiagramapseudocodigoPackage.BLOQUE: {
				Bloque bloque = (Bloque)theEObject;
				T result = caseBloque(bloque);
				if (result == null) result = caseSentencia(bloque);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DiagramapseudocodigoPackage.MIENTRAS: {
				Mientras mientras = (Mientras)theEObject;
				T result = caseMientras(mientras);
				if (result == null) result = caseBloque(mientras);
				if (result == null) result = caseSentencia(mientras);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DiagramapseudocodigoPackage.REPETIR: {
				Repetir repetir = (Repetir)theEObject;
				T result = caseRepetir(repetir);
				if (result == null) result = caseBloque(repetir);
				if (result == null) result = caseSentencia(repetir);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DiagramapseudocodigoPackage.DESDE: {
				Desde desde = (Desde)theEObject;
				T result = caseDesde(desde);
				if (result == null) result = caseBloque(desde);
				if (result == null) result = caseSentencia(desde);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DiagramapseudocodigoPackage.SUBPROCESO: {
				Subproceso subproceso = (Subproceso)theEObject;
				T result = caseSubproceso(subproceso);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DiagramapseudocodigoPackage.PROCEDIMIENTO: {
				Procedimiento procedimiento = (Procedimiento)theEObject;
				T result = caseProcedimiento(procedimiento);
				if (result == null) result = caseSubproceso(procedimiento);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DiagramapseudocodigoPackage.CARACTER: {
				Caracter caracter = (Caracter)theEObject;
				T result = caseCaracter(caracter);
				if (result == null) result = caseOperador(caracter);
				if (result == null) result = caseOperacion(caracter);
				if (result == null) result = caseValor(caracter);
				if (result == null) result = caseSentencia(caracter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DiagramapseudocodigoPackage.FUNCION_INTERNA: {
				FuncionInterna funcionInterna = (FuncionInterna)theEObject;
				T result = caseFuncionInterna(funcionInterna);
				if (result == null) result = caseOperacion(funcionInterna);
				if (result == null) result = caseValor(funcionInterna);
				if (result == null) result = caseSentencia(funcionInterna);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DiagramapseudocodigoPackage.SEGUN: {
				Segun segun = (Segun)theEObject;
				T result = caseSegun(segun);
				if (result == null) result = caseBloque(segun);
				if (result == null) result = caseSentencia(segun);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DiagramapseudocodigoPackage.DEVOLVER: {
				Devolver devolver = (Devolver)theEObject;
				T result = caseDevolver(devolver);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DiagramapseudocodigoPackage.CASO: {
				Caso caso = (Caso)theEObject;
				T result = caseCaso(caso);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DiagramapseudocodigoPackage.CONSTANTE: {
				Constante constante = (Constante)theEObject;
				T result = caseConstante(constante);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DiagramapseudocodigoPackage.VECTOR: {
				Vector vector = (Vector)theEObject;
				T result = caseVector(vector);
				if (result == null) result = caseTipoComplejo(vector);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DiagramapseudocodigoPackage.DECLARACION_DEFINIDA: {
				DeclaracionDefinida declaracionDefinida = (DeclaracionDefinida)theEObject;
				T result = caseDeclaracionDefinida(declaracionDefinida);
				if (result == null) result = caseDeclaracion(declaracionDefinida);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DiagramapseudocodigoPackage.DECLARACION: {
				Declaracion declaracion = (Declaracion)theEObject;
				T result = caseDeclaracion(declaracion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DiagramapseudocodigoPackage.MATRIZ: {
				Matriz matriz = (Matriz)theEObject;
				T result = caseMatriz(matriz);
				if (result == null) result = caseTipoComplejo(matriz);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DiagramapseudocodigoPackage.TIPO_COMPLEJO: {
				TipoComplejo tipoComplejo = (TipoComplejo)theEObject;
				T result = caseTipoComplejo(tipoComplejo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DiagramapseudocodigoPackage.REGISTRO: {
				Registro registro = (Registro)theEObject;
				T result = caseRegistro(registro);
				if (result == null) result = caseTipoComplejo(registro);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DiagramapseudocodigoPackage.TIPO: {
				Tipo tipo = (Tipo)theEObject;
				T result = caseTipo(tipo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DiagramapseudocodigoPackage.TIPO_DEFINIDO: {
				TipoDefinido tipoDefinido = (TipoDefinido)theEObject;
				T result = caseTipoDefinido(tipoDefinido);
				if (result == null) result = caseTipo(tipoDefinido);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DiagramapseudocodigoPackage.TIPO_BASICO: {
				TipoBasico tipoBasico = (TipoBasico)theEObject;
				T result = caseTipoBasico(tipoBasico);
				if (result == null) result = caseTipo(tipoBasico);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DiagramapseudocodigoPackage.ARCHIVO: {
				Archivo archivo = (Archivo)theEObject;
				T result = caseArchivo(archivo);
				if (result == null) result = caseTipoComplejo(archivo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DiagramapseudocodigoPackage.ENUMERADO: {
				Enumerado enumerado = (Enumerado)theEObject;
				T result = caseEnumerado(enumerado);
				if (result == null) result = caseTipoComplejo(enumerado);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DiagramapseudocodigoPackage.SUBRANGO: {
				Subrango subrango = (Subrango)theEObject;
				T result = caseSubrango(subrango);
				if (result == null) result = caseTipoComplejo(subrango);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DiagramapseudocodigoPackage.VALOR_COMPLEJO: {
				ValorComplejo valorComplejo = (ValorComplejo)theEObject;
				T result = caseValorComplejo(valorComplejo);
				if (result == null) result = caseOperador(valorComplejo);
				if (result == null) result = caseOperacion(valorComplejo);
				if (result == null) result = caseValor(valorComplejo);
				if (result == null) result = caseSentencia(valorComplejo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DiagramapseudocodigoPackage.VALOR_REGISTRO: {
				ValorRegistro valorRegistro = (ValorRegistro)theEObject;
				T result = caseValorRegistro(valorRegistro);
				if (result == null) result = caseValorComplejo(valorRegistro);
				if (result == null) result = caseOperador(valorRegistro);
				if (result == null) result = caseOperacion(valorRegistro);
				if (result == null) result = caseValor(valorRegistro);
				if (result == null) result = caseSentencia(valorRegistro);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DiagramapseudocodigoPackage.CAMPO_REGISTRO: {
				CampoRegistro campoRegistro = (CampoRegistro)theEObject;
				T result = caseCampoRegistro(campoRegistro);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DiagramapseudocodigoPackage.VALOR_VECTOR: {
				ValorVector valorVector = (ValorVector)theEObject;
				T result = caseValorVector(valorVector);
				if (result == null) result = caseValorComplejo(valorVector);
				if (result == null) result = caseOperador(valorVector);
				if (result == null) result = caseOperacion(valorVector);
				if (result == null) result = caseValor(valorVector);
				if (result == null) result = caseSentencia(valorVector);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DiagramapseudocodigoPackage.VALOR_MATRIZ: {
				ValorMatriz valorMatriz = (ValorMatriz)theEObject;
				T result = caseValorMatriz(valorMatriz);
				if (result == null) result = caseValorComplejo(valorMatriz);
				if (result == null) result = caseOperador(valorMatriz);
				if (result == null) result = caseOperacion(valorMatriz);
				if (result == null) result = caseValor(valorMatriz);
				if (result == null) result = caseSentencia(valorMatriz);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DiagramapseudocodigoPackage.COMENTARIO: {
				Comentario comentario = (Comentario)theEObject;
				T result = caseComentario(comentario);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DiagramapseudocodigoPackage.FUNCION_FICHERO_ABRIR: {
				FuncionFicheroAbrir funcionFicheroAbrir = (FuncionFicheroAbrir)theEObject;
				T result = caseFuncionFicheroAbrir(funcionFicheroAbrir);
				if (result == null) result = caseSentencia(funcionFicheroAbrir);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DiagramapseudocodigoPackage.FUNCION_FICHERO_CERRAR: {
				FuncionFicheroCerrar funcionFicheroCerrar = (FuncionFicheroCerrar)theEObject;
				T result = caseFuncionFicheroCerrar(funcionFicheroCerrar);
				if (result == null) result = caseSentencia(funcionFicheroCerrar);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DiagramapseudocodigoPackage.SUMA: {
				Suma suma = (Suma)theEObject;
				T result = caseSuma(suma);
				if (result == null) result = caseOperacion(suma);
				if (result == null) result = caseValor(suma);
				if (result == null) result = caseSentencia(suma);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DiagramapseudocodigoPackage.RESTA: {
				Resta resta = (Resta)theEObject;
				T result = caseResta(resta);
				if (result == null) result = caseOperacion(resta);
				if (result == null) result = caseValor(resta);
				if (result == null) result = caseSentencia(resta);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DiagramapseudocodigoPackage.MULTIPLICACION: {
				Multiplicacion multiplicacion = (Multiplicacion)theEObject;
				T result = caseMultiplicacion(multiplicacion);
				if (result == null) result = caseOperacion(multiplicacion);
				if (result == null) result = caseValor(multiplicacion);
				if (result == null) result = caseSentencia(multiplicacion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DiagramapseudocodigoPackage.DIVISION_ENTERA: {
				DivisionEntera divisionEntera = (DivisionEntera)theEObject;
				T result = caseDivisionEntera(divisionEntera);
				if (result == null) result = caseOperacion(divisionEntera);
				if (result == null) result = caseValor(divisionEntera);
				if (result == null) result = caseSentencia(divisionEntera);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DiagramapseudocodigoPackage.OR: {
				Or or = (Or)theEObject;
				T result = caseOr(or);
				if (result == null) result = caseOperacion(or);
				if (result == null) result = caseValor(or);
				if (result == null) result = caseSentencia(or);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DiagramapseudocodigoPackage.AND: {
				And and = (And)theEObject;
				T result = caseAnd(and);
				if (result == null) result = caseOperacion(and);
				if (result == null) result = caseValor(and);
				if (result == null) result = caseSentencia(and);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DiagramapseudocodigoPackage.COMPARACION: {
				Comparacion comparacion = (Comparacion)theEObject;
				T result = caseComparacion(comparacion);
				if (result == null) result = caseOperacion(comparacion);
				if (result == null) result = caseValor(comparacion);
				if (result == null) result = caseSentencia(comparacion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DiagramapseudocodigoPackage.IGUALDAD: {
				Igualdad igualdad = (Igualdad)theEObject;
				T result = caseIgualdad(igualdad);
				if (result == null) result = caseOperacion(igualdad);
				if (result == null) result = caseValor(igualdad);
				if (result == null) result = caseSentencia(igualdad);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DiagramapseudocodigoPackage.SUBRANGO_NUMERICO: {
				SubrangoNumerico subrangoNumerico = (SubrangoNumerico)theEObject;
				T result = caseSubrangoNumerico(subrangoNumerico);
				if (result == null) result = caseSubrango(subrangoNumerico);
				if (result == null) result = caseTipoComplejo(subrangoNumerico);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DiagramapseudocodigoPackage.SUBRANGO_ENUMERADO: {
				SubrangoEnumerado subrangoEnumerado = (SubrangoEnumerado)theEObject;
				T result = caseSubrangoEnumerado(subrangoEnumerado);
				if (result == null) result = caseSubrango(subrangoEnumerado);
				if (result == null) result = caseTipoComplejo(subrangoEnumerado);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DiagramapseudocodigoPackage.ASIGNACION_NORMAL: {
				AsignacionNormal asignacionNormal = (AsignacionNormal)theEObject;
				T result = caseAsignacionNormal(asignacionNormal);
				if (result == null) result = caseAsignacion(asignacionNormal);
				if (result == null) result = caseSentencia(asignacionNormal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DiagramapseudocodigoPackage.ASIGNACION_COMPLEJA: {
				AsignacionCompleja asignacionCompleja = (AsignacionCompleja)theEObject;
				T result = caseAsignacionCompleja(asignacionCompleja);
				if (result == null) result = caseAsignacion(asignacionCompleja);
				if (result == null) result = caseSentencia(asignacionCompleja);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DiagramapseudocodigoPackage.CODIGO: {
				Codigo codigo = (Codigo)theEObject;
				T result = caseCodigo(codigo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DiagramapseudocodigoPackage.MODULO: {
				Modulo modulo = (Modulo)theEObject;
				T result = caseModulo(modulo);
				if (result == null) result = caseCodigo(modulo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DiagramapseudocodigoPackage.CABECERA_SUBPROCESO: {
				CabeceraSubproceso cabeceraSubproceso = (CabeceraSubproceso)theEObject;
				T result = caseCabeceraSubproceso(cabeceraSubproceso);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DiagramapseudocodigoPackage.IMPLEMENTACION: {
				Implementacion implementacion = (Implementacion)theEObject;
				T result = caseImplementacion(implementacion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DiagramapseudocodigoPackage.CABECERA_PROCEDIMIENTO: {
				CabeceraProcedimiento cabeceraProcedimiento = (CabeceraProcedimiento)theEObject;
				T result = caseCabeceraProcedimiento(cabeceraProcedimiento);
				if (result == null) result = caseCabeceraSubproceso(cabeceraProcedimiento);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DiagramapseudocodigoPackage.CABECERA_FUNCION: {
				CabeceraFuncion cabeceraFuncion = (CabeceraFuncion)theEObject;
				T result = caseCabeceraFuncion(cabeceraFuncion);
				if (result == null) result = caseCabeceraSubproceso(cabeceraFuncion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DiagramapseudocodigoPackage.MOD: {
				Mod mod = (Mod)theEObject;
				T result = caseMod(mod);
				if (result == null) result = caseOperacion(mod);
				if (result == null) result = caseValor(mod);
				if (result == null) result = caseSentencia(mod);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DiagramapseudocodigoPackage.DIVISION_REAL: {
				DivisionReal divisionReal = (DivisionReal)theEObject;
				T result = caseDivisionReal(divisionReal);
				if (result == null) result = caseOperacion(divisionReal);
				if (result == null) result = caseValor(divisionReal);
				if (result == null) result = caseSentencia(divisionReal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DiagramapseudocodigoPackage.OPERACION_PARENTESIS: {
				OperacionParentesis operacionParentesis = (OperacionParentesis)theEObject;
				T result = caseOperacionParentesis(operacionParentesis);
				if (result == null) result = caseOperacion(operacionParentesis);
				if (result == null) result = caseValor(operacionParentesis);
				if (result == null) result = caseSentencia(operacionParentesis);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DiagramapseudocodigoPackage.UNARIA: {
				Unaria unaria = (Unaria)theEObject;
				T result = caseUnaria(unaria);
				if (result == null) result = caseOperacion(unaria);
				if (result == null) result = caseValor(unaria);
				if (result == null) result = caseSentencia(unaria);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DiagramapseudocodigoPackage.OPERACION_COMPLETA: {
				OperacionCompleta operacionCompleta = (OperacionCompleta)theEObject;
				T result = caseOperacionCompleta(operacionCompleta);
				if (result == null) result = caseOperacion(operacionCompleta);
				if (result == null) result = caseValor(operacionCompleta);
				if (result == null) result = caseSentencia(operacionCompleta);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Algoritmo</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Algoritmo</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAlgoritmo(Algoritmo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Inicio</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Inicio</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInicio(Inicio object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sentencia</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sentencia</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSentencia(Sentencia object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Declaracion Basica</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Declaracion Basica</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeclaracionBasica(DeclaracionBasica object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Llamada Funcion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Llamada Funcion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLlamadaFuncion(LlamadaFuncion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable ID</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable ID</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariableID(VariableID object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>cadena</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>cadena</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casecadena(cadena object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cadena Caracteres</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cadena Caracteres</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCadenaCaracteres(CadenaCaracteres object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariable(Variable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operador</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operador</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperador(Operador object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entero</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entero</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntero(Entero object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Asignacion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Asignacion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAsignacion(Asignacion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Escribir</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Escribir</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEscribir(Escribir object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Funcion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Funcion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFuncion(Funcion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parametro</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parametro</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParametro(Parametro object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Leer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Leer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLeer(Leer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Real</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Real</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReal(Real object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Valor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Valor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValor(Valor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operacion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operacion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperacion(Operacion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Logico</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Logico</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLogico(Logico object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Si</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Si</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSi(Si object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sino</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sino</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSino(Sino object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bloque</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bloque</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBloque(Bloque object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mientras</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mientras</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMientras(Mientras object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Repetir</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Repetir</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRepetir(Repetir object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Desde</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Desde</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDesde(Desde object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subproceso</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subproceso</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubproceso(Subproceso object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Procedimiento</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Procedimiento</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcedimiento(Procedimiento object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Caracter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Caracter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCaracter(Caracter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Funcion Interna</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Funcion Interna</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFuncionInterna(FuncionInterna object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Segun</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Segun</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSegun(Segun object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Devolver</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Devolver</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDevolver(Devolver object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Caso</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Caso</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCaso(Caso object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constante</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constante</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstante(Constante object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVector(Vector object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Declaracion Definida</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Declaracion Definida</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeclaracionDefinida(DeclaracionDefinida object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Declaracion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Declaracion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeclaracion(Declaracion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Matriz</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Matriz</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMatriz(Matriz object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tipo Complejo</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tipo Complejo</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTipoComplejo(TipoComplejo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Registro</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Registro</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRegistro(Registro object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tipo</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tipo</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTipo(Tipo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tipo Definido</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tipo Definido</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTipoDefinido(TipoDefinido object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tipo Basico</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tipo Basico</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTipoBasico(TipoBasico object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Archivo</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Archivo</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArchivo(Archivo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enumerado</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enumerado</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnumerado(Enumerado object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subrango</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subrango</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubrango(Subrango object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Valor Complejo</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Valor Complejo</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValorComplejo(ValorComplejo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Valor Registro</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Valor Registro</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValorRegistro(ValorRegistro object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Campo Registro</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Campo Registro</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCampoRegistro(CampoRegistro object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Valor Vector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Valor Vector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValorVector(ValorVector object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Valor Matriz</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Valor Matriz</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValorMatriz(ValorMatriz object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Comentario</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Comentario</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComentario(Comentario object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Funcion Fichero Abrir</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Funcion Fichero Abrir</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFuncionFicheroAbrir(FuncionFicheroAbrir object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Funcion Fichero Cerrar</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Funcion Fichero Cerrar</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFuncionFicheroCerrar(FuncionFicheroCerrar object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Suma</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Suma</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSuma(Suma object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resta</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resta</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResta(Resta object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Multiplicacion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multiplicacion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMultiplicacion(Multiplicacion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Division Entera</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Division Entera</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDivisionEntera(DivisionEntera object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Or</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Or</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOr(Or object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>And</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>And</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnd(And object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Comparacion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Comparacion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComparacion(Comparacion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Igualdad</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Igualdad</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIgualdad(Igualdad object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subrango Numerico</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subrango Numerico</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubrangoNumerico(SubrangoNumerico object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subrango Enumerado</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subrango Enumerado</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubrangoEnumerado(SubrangoEnumerado object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Asignacion Normal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Asignacion Normal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAsignacionNormal(AsignacionNormal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Asignacion Compleja</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Asignacion Compleja</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAsignacionCompleja(AsignacionCompleja object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Codigo</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Codigo</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCodigo(Codigo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Modulo</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Modulo</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModulo(Modulo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cabecera Subproceso</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cabecera Subproceso</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCabeceraSubproceso(CabeceraSubproceso object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Implementacion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Implementacion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImplementacion(Implementacion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cabecera Procedimiento</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cabecera Procedimiento</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCabeceraProcedimiento(CabeceraProcedimiento object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cabecera Funcion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cabecera Funcion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCabeceraFuncion(CabeceraFuncion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mod</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mod</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMod(Mod object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Division Real</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Division Real</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDivisionReal(DivisionReal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operacion Parentesis</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operacion Parentesis</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperacionParentesis(OperacionParentesis object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unaria</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unaria</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnaria(Unaria object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operacion Completa</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operacion Completa</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperacionCompleta(OperacionCompleta object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //DiagramapseudocodigoSwitch
