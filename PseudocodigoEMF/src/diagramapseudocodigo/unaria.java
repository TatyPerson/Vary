/**
 */
package diagramapseudocodigo;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>unaria</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link diagramapseudocodigo.unaria#getSsigno <em>Ssigno</em>}</li>
 *   <li>{@link diagramapseudocodigo.unaria#getVariable <em>Variable</em>}</li>
 * </ul>
 * </p>
 *
 * @see diagramapseudocodigo.DiagramapseudocodigoPackage#getunaria()
 * @model
 * @generated
 */
public interface unaria extends valor {
	/**
	 * Returns the value of the '<em><b>Variable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variable</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable</em>' containment reference.
	 * @see #setVariable(valor)
	 * @see diagramapseudocodigo.DiagramapseudocodigoPackage#getunaria_Variable()
	 * @model containment="true" required="true"
	 * @generated
	 */
	valor getVariable();

	/**
	 * Sets the value of the '{@link diagramapseudocodigo.unaria#getVariable <em>Variable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable</em>' containment reference.
	 * @see #getVariable()
	 * @generated
	 */
	void setVariable(valor value);

	/**
	 * Returns the value of the '<em><b>Ssigno</b></em>' attribute.
	 * The literals are from the enumeration {@link diagramapseudocodigo.neg}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ssigno</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ssigno</em>' attribute.
	 * @see diagramapseudocodigo.neg
	 * @see #setSsigno(neg)
	 * @see diagramapseudocodigo.DiagramapseudocodigoPackage#getunaria_Ssigno()
	 * @model required="true"
	 * @generated
	 */
	neg getSsigno();

	/**
	 * Sets the value of the '{@link diagramapseudocodigo.unaria#getSsigno <em>Ssigno</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ssigno</em>' attribute.
	 * @see diagramapseudocodigo.neg
	 * @see #getSsigno()
	 * @generated
	 */
	void setSsigno(neg value);

} // unaria
