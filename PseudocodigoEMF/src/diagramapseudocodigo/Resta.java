/**
 */
package diagramapseudocodigo;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resta</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link diagramapseudocodigo.Resta#getLeft <em>Left</em>}</li>
 *   <li>{@link diagramapseudocodigo.Resta#getRight <em>Right</em>}</li>
 *   <li>{@link diagramapseudocodigo.Resta#getSigno_op <em>Signo op</em>}</li>
 * </ul>
 * </p>
 *
 * @see diagramapseudocodigo.DiagramapseudocodigoPackage#getResta()
 * @model
 * @generated
 */
public interface Resta extends operacion {
	/**
	 * Returns the value of the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left</em>' containment reference.
	 * @see #setLeft(operacion)
	 * @see diagramapseudocodigo.DiagramapseudocodigoPackage#getResta_Left()
	 * @model containment="true"
	 * @generated
	 */
	operacion getLeft();

	/**
	 * Sets the value of the '{@link diagramapseudocodigo.Resta#getLeft <em>Left</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left</em>' containment reference.
	 * @see #getLeft()
	 * @generated
	 */
	void setLeft(operacion value);

	/**
	 * Returns the value of the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Right</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right</em>' containment reference.
	 * @see #setRight(operacion)
	 * @see diagramapseudocodigo.DiagramapseudocodigoPackage#getResta_Right()
	 * @model containment="true"
	 * @generated
	 */
	operacion getRight();

	/**
	 * Sets the value of the '{@link diagramapseudocodigo.Resta#getRight <em>Right</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right</em>' containment reference.
	 * @see #getRight()
	 * @generated
	 */
	void setRight(operacion value);

	/**
	 * Returns the value of the '<em><b>Signo op</b></em>' attribute.
	 * The literals are from the enumeration {@link diagramapseudocodigo.signo}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Signo op</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signo op</em>' attribute.
	 * @see diagramapseudocodigo.signo
	 * @see #setSigno_op(signo)
	 * @see diagramapseudocodigo.DiagramapseudocodigoPackage#getResta_Signo_op()
	 * @model
	 * @generated
	 */
	signo getSigno_op();

	/**
	 * Sets the value of the '{@link diagramapseudocodigo.Resta#getSigno_op <em>Signo op</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signo op</em>' attribute.
	 * @see diagramapseudocodigo.signo
	 * @see #getSigno_op()
	 * @generated
	 */
	void setSigno_op(signo value);

} // Resta
