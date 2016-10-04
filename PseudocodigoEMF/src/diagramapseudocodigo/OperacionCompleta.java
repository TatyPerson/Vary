/**
 */
package diagramapseudocodigo;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operacion Completa</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link diagramapseudocodigo.OperacionCompleta#getValor_operacion <em>Valor operacion</em>}</li>
 * </ul>
 *
 * @see diagramapseudocodigo.DiagramapseudocodigoPackage#getOperacionCompleta()
 * @model
 * @generated
 */
public interface OperacionCompleta extends Operacion {
	/**
	 * Returns the value of the '<em><b>Valor operacion</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Valor operacion</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valor operacion</em>' containment reference.
	 * @see #setValor_operacion(Operacion)
	 * @see diagramapseudocodigo.DiagramapseudocodigoPackage#getOperacionCompleta_Valor_operacion()
	 * @model containment="true"
	 * @generated
	 */
	Operacion getValor_operacion();

	/**
	 * Sets the value of the '{@link diagramapseudocodigo.OperacionCompleta#getValor_operacion <em>Valor operacion</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valor operacion</em>' containment reference.
	 * @see #getValor_operacion()
	 * @generated
	 */
	void setValor_operacion(Operacion value);

} // OperacionCompleta
