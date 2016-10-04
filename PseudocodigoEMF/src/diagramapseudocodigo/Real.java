/**
 */
package diagramapseudocodigo;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Real</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link diagramapseudocodigo.Real#getValor <em>Valor</em>}</li>
 * </ul>
 *
 * @see diagramapseudocodigo.DiagramapseudocodigoPackage#getReal()
 * @model
 * @generated
 */
public interface Real extends Operador, Operacion {
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
	 * @see diagramapseudocodigo.DiagramapseudocodigoPackage#getReal_Valor()
	 * @model required="true"
	 * @generated
	 */
	float getValor();

	/**
	 * Sets the value of the '{@link diagramapseudocodigo.Real#getValor <em>Valor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valor</em>' attribute.
	 * @see #getValor()
	 * @generated
	 */
	void setValor(float value);

} // Real
