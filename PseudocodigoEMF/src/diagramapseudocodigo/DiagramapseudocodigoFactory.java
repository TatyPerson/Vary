/**
 */
package diagramapseudocodigo;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see diagramapseudocodigo.DiagramapseudocodigoPackage
 * @generated
 */
public interface DiagramapseudocodigoFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DiagramapseudocodigoFactory eINSTANCE = diagramapseudocodigo.impl.DiagramapseudocodigoFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Algoritmo</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Algoritmo</em>'.
	 * @generated
	 */
	Algoritmo createAlgoritmo();

	/**
	 * Returns a new object of class '<em>Codigo</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Codigo</em>'.
	 * @generated
	 */
	Codigo createCodigo();

	/**
	 * Returns a new object of class '<em>Modulo</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Modulo</em>'.
	 * @generated
	 */
	Modulo createModulo();

	/**
	 * Returns a new object of class '<em>Cabecera Subproceso</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cabecera Subproceso</em>'.
	 * @generated
	 */
	CabeceraSubproceso createCabeceraSubproceso();

	/**
	 * Returns a new object of class '<em>Implementacion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Implementacion</em>'.
	 * @generated
	 */
	Implementacion createImplementacion();

	/**
	 * Returns a new object of class '<em>Cabecera Procedimiento</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cabecera Procedimiento</em>'.
	 * @generated
	 */
	CabeceraProcedimiento createCabeceraProcedimiento();

	/**
	 * Returns a new object of class '<em>Cabecera Funcion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cabecera Funcion</em>'.
	 * @generated
	 */
	CabeceraFuncion createCabeceraFuncion();

	/**
	 * Returns a new object of class '<em>Mod</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mod</em>'.
	 * @generated
	 */
	Mod createMod();

	/**
	 * Returns a new object of class '<em>Div</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Div</em>'.
	 * @generated
	 */
	Div createDiv();

	/**
	 * Returns a new object of class '<em>Operacion Parentesis</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Operacion Parentesis</em>'.
	 * @generated
	 */
	OperacionParentesis createOperacionParentesis();

	/**
	 * Returns a new object of class '<em>Unaria</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unaria</em>'.
	 * @generated
	 */
	Unaria createUnaria();

	/**
	 * Returns a new object of class '<em>Inicio</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Inicio</em>'.
	 * @generated
	 */
	Inicio createInicio();

	/**
	 * Returns a new object of class '<em>Declaracion Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Declaracion Variable</em>'.
	 * @generated
	 */
	DeclaracionVariable createDeclaracionVariable();

	/**
	 * Returns a new object of class '<em>Llamada Funcion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Llamada Funcion</em>'.
	 * @generated
	 */
	LlamadaFuncion createLlamadaFuncion();

	/**
	 * Returns a new object of class '<em>Variable ID</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Variable ID</em>'.
	 * @generated
	 */
	VariableID createVariableID();

	/**
	 * Returns a new object of class '<em>cadena</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>cadena</em>'.
	 * @generated
	 */
	cadena createcadena();

	/**
	 * Returns a new object of class '<em>Const Cadena</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Const Cadena</em>'.
	 * @generated
	 */
	ConstCadena createConstCadena();

	/**
	 * Returns a new object of class '<em>Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Variable</em>'.
	 * @generated
	 */
	Variable createVariable();

	/**
	 * Returns a new object of class '<em>Numero Entero</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Numero Entero</em>'.
	 * @generated
	 */
	NumeroEntero createNumeroEntero();

	/**
	 * Returns a new object of class '<em>Asignacion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Asignacion</em>'.
	 * @generated
	 */
	Asignacion createAsignacion();

	/**
	 * Returns a new object of class '<em>Escribir</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Escribir</em>'.
	 * @generated
	 */
	Escribir createEscribir();

	/**
	 * Returns a new object of class '<em>Funcion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Funcion</em>'.
	 * @generated
	 */
	Funcion createFuncion();

	/**
	 * Returns a new object of class '<em>Parametro Funcion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parametro Funcion</em>'.
	 * @generated
	 */
	ParametroFuncion createParametroFuncion();

	/**
	 * Returns a new object of class '<em>Leer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Leer</em>'.
	 * @generated
	 */
	Leer createLeer();

	/**
	 * Returns a new object of class '<em>Numero Decimal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Numero Decimal</em>'.
	 * @generated
	 */
	NumeroDecimal createNumeroDecimal();

	/**
	 * Returns a new object of class '<em>operacion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>operacion</em>'.
	 * @generated
	 */
	operacion createoperacion();

	/**
	 * Returns a new object of class '<em>Valor Booleano</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Valor Booleano</em>'.
	 * @generated
	 */
	ValorBooleano createValorBooleano();

	/**
	 * Returns a new object of class '<em>Si</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Si</em>'.
	 * @generated
	 */
	Si createSi();

	/**
	 * Returns a new object of class '<em>Sino</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sino</em>'.
	 * @generated
	 */
	Sino createSino();

	/**
	 * Returns a new object of class '<em>mientras</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>mientras</em>'.
	 * @generated
	 */
	mientras createmientras();

	/**
	 * Returns a new object of class '<em>repetir</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>repetir</em>'.
	 * @generated
	 */
	repetir createrepetir();

	/**
	 * Returns a new object of class '<em>desde</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>desde</em>'.
	 * @generated
	 */
	desde createdesde();

	/**
	 * Returns a new object of class '<em>Procedimiento</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Procedimiento</em>'.
	 * @generated
	 */
	Procedimiento createProcedimiento();

	/**
	 * Returns a new object of class '<em>Caracter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Caracter</em>'.
	 * @generated
	 */
	Caracter createCaracter();

	/**
	 * Returns a new object of class '<em>Internas</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Internas</em>'.
	 * @generated
	 */
	Internas createInternas();

	/**
	 * Returns a new object of class '<em>segun</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>segun</em>'.
	 * @generated
	 */
	segun createsegun();

	/**
	 * Returns a new object of class '<em>Devolver</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Devolver</em>'.
	 * @generated
	 */
	Devolver createDevolver();

	/**
	 * Returns a new object of class '<em>Caso</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Caso</em>'.
	 * @generated
	 */
	Caso createCaso();

	/**
	 * Returns a new object of class '<em>Constantes</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Constantes</em>'.
	 * @generated
	 */
	Constantes createConstantes();

	/**
	 * Returns a new object of class '<em>Vector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Vector</em>'.
	 * @generated
	 */
	Vector createVector();

	/**
	 * Returns a new object of class '<em>Declaracion Propia</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Declaracion Propia</em>'.
	 * @generated
	 */
	DeclaracionPropia createDeclaracionPropia();

	/**
	 * Returns a new object of class '<em>Declaracion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Declaracion</em>'.
	 * @generated
	 */
	Declaracion createDeclaracion();

	/**
	 * Returns a new object of class '<em>Matriz</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Matriz</em>'.
	 * @generated
	 */
	Matriz createMatriz();

	/**
	 * Returns a new object of class '<em>Tipo Complejo</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tipo Complejo</em>'.
	 * @generated
	 */
	TipoComplejo createTipoComplejo();

	/**
	 * Returns a new object of class '<em>Registro</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Registro</em>'.
	 * @generated
	 */
	Registro createRegistro();

	/**
	 * Returns a new object of class '<em>Tipo</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tipo</em>'.
	 * @generated
	 */
	Tipo createTipo();

	/**
	 * Returns a new object of class '<em>Tipo Definido</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tipo Definido</em>'.
	 * @generated
	 */
	TipoDefinido createTipoDefinido();

	/**
	 * Returns a new object of class '<em>Tipo Existente</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tipo Existente</em>'.
	 * @generated
	 */
	TipoExistente createTipoExistente();

	/**
	 * Returns a new object of class '<em>Archivo</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Archivo</em>'.
	 * @generated
	 */
	Archivo createArchivo();

	/**
	 * Returns a new object of class '<em>Enumerado</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Enumerado</em>'.
	 * @generated
	 */
	Enumerado createEnumerado();

	/**
	 * Returns a new object of class '<em>Subrango</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Subrango</em>'.
	 * @generated
	 */
	Subrango createSubrango();

	/**
	 * Returns a new object of class '<em>Valor Complejo</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Valor Complejo</em>'.
	 * @generated
	 */
	ValorComplejo createValorComplejo();

	/**
	 * Returns a new object of class '<em>Valor Registro</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Valor Registro</em>'.
	 * @generated
	 */
	ValorRegistro createValorRegistro();

	/**
	 * Returns a new object of class '<em>Campo Registro</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Campo Registro</em>'.
	 * @generated
	 */
	CampoRegistro createCampoRegistro();

	/**
	 * Returns a new object of class '<em>Valor Vector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Valor Vector</em>'.
	 * @generated
	 */
	ValorVector createValorVector();

	/**
	 * Returns a new object of class '<em>Valor Matriz</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Valor Matriz</em>'.
	 * @generated
	 */
	ValorMatriz createValorMatriz();

	/**
	 * Returns a new object of class '<em>Comentario</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Comentario</em>'.
	 * @generated
	 */
	Comentario createComentario();

	/**
	 * Returns a new object of class '<em>Funcion Fichero Abrir</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Funcion Fichero Abrir</em>'.
	 * @generated
	 */
	FuncionFicheroAbrir createFuncionFicheroAbrir();

	/**
	 * Returns a new object of class '<em>Funcion Fichero Cerrar</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Funcion Fichero Cerrar</em>'.
	 * @generated
	 */
	FuncionFicheroCerrar createFuncionFicheroCerrar();

	/**
	 * Returns a new object of class '<em>Suma</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Suma</em>'.
	 * @generated
	 */
	Suma createSuma();

	/**
	 * Returns a new object of class '<em>Resta</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resta</em>'.
	 * @generated
	 */
	Resta createResta();

	/**
	 * Returns a new object of class '<em>Multiplicacion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Multiplicacion</em>'.
	 * @generated
	 */
	Multiplicacion createMultiplicacion();

	/**
	 * Returns a new object of class '<em>Division</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Division</em>'.
	 * @generated
	 */
	Division createDivision();

	/**
	 * Returns a new object of class '<em>Or</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Or</em>'.
	 * @generated
	 */
	Or createOr();

	/**
	 * Returns a new object of class '<em>And</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>And</em>'.
	 * @generated
	 */
	And createAnd();

	/**
	 * Returns a new object of class '<em>Comparacion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Comparacion</em>'.
	 * @generated
	 */
	Comparacion createComparacion();

	/**
	 * Returns a new object of class '<em>Igualdad</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Igualdad</em>'.
	 * @generated
	 */
	Igualdad createIgualdad();

	/**
	 * Returns a new object of class '<em>Subrango Numerico</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Subrango Numerico</em>'.
	 * @generated
	 */
	SubrangoNumerico createSubrangoNumerico();

	/**
	 * Returns a new object of class '<em>Subrango Enumerado</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Subrango Enumerado</em>'.
	 * @generated
	 */
	SubrangoEnumerado createSubrangoEnumerado();

	/**
	 * Returns a new object of class '<em>Asignacion Normal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Asignacion Normal</em>'.
	 * @generated
	 */
	AsignacionNormal createAsignacionNormal();

	/**
	 * Returns a new object of class '<em>Asignacion Compleja</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Asignacion Compleja</em>'.
	 * @generated
	 */
	AsignacionCompleja createAsignacionCompleja();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DiagramapseudocodigoPackage getDiagramapseudocodigoPackage();

} //DiagramapseudocodigoFactory
