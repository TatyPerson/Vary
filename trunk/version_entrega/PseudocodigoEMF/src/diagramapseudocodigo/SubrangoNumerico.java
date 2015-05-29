/**
 */
package diagramapseudocodigo;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Subrango Numerico</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link diagramapseudocodigo.SubrangoNumerico#getLimite_inf <em>Limite inf</em>}</li>
 *   <li>{@link diagramapseudocodigo.SubrangoNumerico#getLimite_sup <em>Limite sup</em>}</li>
 * </ul>
 * </p>
 *
 * @see diagramapseudocodigo.DiagramapseudocodigoPackage#getSubrangoNumerico()
 * @model
 * @generated
 */
public interface SubrangoNumerico extends Subrango {
	/**
	 * Returns the value of the '<em><b>Limite inf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Limite inf</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Limite inf</em>' attribute.
	 * @see #setLimite_inf(int)
	 * @see diagramapseudocodigo.DiagramapseudocodigoPackage#getSubrangoNumerico_Limite_inf()
	 * @model required="true"
	 * @generated
	 */
	int getLimite_inf();

	/**
	 * Sets the value of the '{@link diagramapseudocodigo.SubrangoNumerico#getLimite_inf <em>Limite inf</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Limite inf</em>' attribute.
	 * @see #getLimite_inf()
	 * @generated
	 */
	void setLimite_inf(int value);

	/**
	 * Returns the value of the '<em><b>Limite sup</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Limite sup</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Limite sup</em>' attribute.
	 * @see #setLimite_sup(int)
	 * @see diagramapseudocodigo.DiagramapseudocodigoPackage#getSubrangoNumerico_Limite_sup()
	 * @model required="true"
	 * @generated
	 */
	int getLimite_sup();

	/**
	 * Sets the value of the '{@link diagramapseudocodigo.SubrangoNumerico#getLimite_sup <em>Limite sup</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Limite sup</em>' attribute.
	 * @see #getLimite_sup()
	 * @generated
	 */
	void setLimite_sup(int value);

} // SubrangoNumerico
