/**
 */
package diagramapseudocodigo;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link diagramapseudocodigo.Vector#getValor <em>Valor</em>}</li>
 *   <li>{@link diagramapseudocodigo.Vector#getTipo <em>Tipo</em>}</li>
 *   <li>{@link diagramapseudocodigo.Vector#getNombre <em>Nombre</em>}</li>
 * </ul>
 * </p>
 *
 * @see diagramapseudocodigo.DiagramapseudocodigoPackage#getVector()
 * @model
 * @generated
 */
public interface Vector extends TipoComplejo {
	/**
	 * Returns the value of the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nombre</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre</em>' attribute.
	 * @see #setNombre(String)
	 * @see diagramapseudocodigo.DiagramapseudocodigoPackage#getVector_Nombre()
	 * @model required="true"
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link diagramapseudocodigo.Vector#getNombre <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre</em>' attribute.
	 * @see #getNombre()
	 * @generated
	 */
	void setNombre(String value);

	/**
	 * Returns the value of the '<em><b>Valor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Valor</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valor</em>' containment reference.
	 * @see #setValor(operacion)
	 * @see diagramapseudocodigo.DiagramapseudocodigoPackage#getVector_Valor()
	 * @model containment="true"
	 * @generated
	 */
	operacion getValor();

	/**
	 * Sets the value of the '{@link diagramapseudocodigo.Vector#getValor <em>Valor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valor</em>' containment reference.
	 * @see #getValor()
	 * @generated
	 */
	void setValor(operacion value);

	/**
	 * Returns the value of the '<em><b>Tipo</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tipo</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tipo</em>' containment reference.
	 * @see #setTipo(Tipo)
	 * @see diagramapseudocodigo.DiagramapseudocodigoPackage#getVector_Tipo()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Tipo getTipo();

	/**
	 * Sets the value of the '{@link diagramapseudocodigo.Vector#getTipo <em>Tipo</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tipo</em>' containment reference.
	 * @see #getTipo()
	 * @generated
	 */
	void setTipo(Tipo value);

} // Vector
