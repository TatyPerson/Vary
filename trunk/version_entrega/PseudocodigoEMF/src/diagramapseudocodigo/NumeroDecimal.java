/**
 */
package diagramapseudocodigo;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Numero Decimal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link diagramapseudocodigo.NumeroDecimal#getValor <em>Valor</em>}</li>
 * </ul>
 * </p>
 *
 * @see diagramapseudocodigo.DiagramapseudocodigoPackage#getNumeroDecimal()
 * @model
 * @generated
 */
public interface NumeroDecimal extends Operador, operacion {
	/**
	 * Returns the value of the '<em><b>Valor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Valor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valor</em>' attribute.
	 * @see #setValor(float)
	 * @see diagramapseudocodigo.DiagramapseudocodigoPackage#getNumeroDecimal_Valor()
	 * @model required="true"
	 * @generated
	 */
	float getValor();

	/**
	 * Sets the value of the '{@link diagramapseudocodigo.NumeroDecimal#getValor <em>Valor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valor</em>' attribute.
	 * @see #getValor()
	 * @generated
	 */
	void setValor(float value);

} // NumeroDecimal
