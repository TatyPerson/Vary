/**
 */
package diagramapseudocodigo;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Negativa</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link diagramapseudocodigo.Negativa#getValor_operacion <em>Valor operacion</em>}</li>
 * </ul>
 * </p>
 *
 * @see diagramapseudocodigo.DiagramapseudocodigoPackage#getNegativa()
 * @model
 * @generated
 */
public interface Negativa extends operacion {
	/**
	 * Returns the value of the '<em><b>Valor operacion</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Valor operacion</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valor operacion</em>' containment reference.
	 * @see #setValor_operacion(operacion)
	 * @see diagramapseudocodigo.DiagramapseudocodigoPackage#getNegativa_Valor_operacion()
	 * @model containment="true" required="true"
	 * @generated
	 */
	operacion getValor_operacion();

	/**
	 * Sets the value of the '{@link diagramapseudocodigo.Negativa#getValor_operacion <em>Valor operacion</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valor operacion</em>' containment reference.
	 * @see #getValor_operacion()
	 * @generated
	 */
	void setValor_operacion(operacion value);

} // Negativa
