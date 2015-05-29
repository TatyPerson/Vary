/**
 */
package diagramapseudocodigo;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Funcion Fichero</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link diagramapseudocodigo.FuncionFichero#getNombre <em>Nombre</em>}</li>
 *   <li>{@link diagramapseudocodigo.FuncionFichero#getModo <em>Modo</em>}</li>
 *   <li>{@link diagramapseudocodigo.FuncionFichero#getVariable <em>Variable</em>}</li>
 * </ul>
 * </p>
 *
 * @see diagramapseudocodigo.DiagramapseudocodigoPackage#getFuncionFichero()
 * @model
 * @generated
 */
public interface FuncionFichero extends Sentencias {
	/**
	 * Returns the value of the '<em><b>Nombre</b></em>' attribute.
	 * The literals are from the enumeration {@link diagramapseudocodigo.NombreFuncionFichero}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nombre</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre</em>' attribute.
	 * @see diagramapseudocodigo.NombreFuncionFichero
	 * @see #setNombre(NombreFuncionFichero)
	 * @see diagramapseudocodigo.DiagramapseudocodigoPackage#getFuncionFichero_Nombre()
	 * @model required="true"
	 * @generated
	 */
	NombreFuncionFichero getNombre();

	/**
	 * Sets the value of the '{@link diagramapseudocodigo.FuncionFichero#getNombre <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre</em>' attribute.
	 * @see diagramapseudocodigo.NombreFuncionFichero
	 * @see #getNombre()
	 * @generated
	 */
	void setNombre(NombreFuncionFichero value);

	/**
	 * Returns the value of the '<em><b>Modo</b></em>' attribute.
	 * The literals are from the enumeration {@link diagramapseudocodigo.ModoApertura}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modo</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modo</em>' attribute.
	 * @see diagramapseudocodigo.ModoApertura
	 * @see #setModo(ModoApertura)
	 * @see diagramapseudocodigo.DiagramapseudocodigoPackage#getFuncionFichero_Modo()
	 * @model required="true"
	 * @generated
	 */
	ModoApertura getModo();

	/**
	 * Sets the value of the '{@link diagramapseudocodigo.FuncionFichero#getModo <em>Modo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modo</em>' attribute.
	 * @see diagramapseudocodigo.ModoApertura
	 * @see #getModo()
	 * @generated
	 */
	void setModo(ModoApertura value);

	/**
	 * Returns the value of the '<em><b>Variable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variable</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable</em>' containment reference.
	 * @see #setVariable(Operador)
	 * @see diagramapseudocodigo.DiagramapseudocodigoPackage#getFuncionFichero_Variable()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Operador getVariable();

	/**
	 * Sets the value of the '{@link diagramapseudocodigo.FuncionFichero#getVariable <em>Variable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable</em>' containment reference.
	 * @see #getVariable()
	 * @generated
	 */
	void setVariable(Operador value);

} // FuncionFichero
