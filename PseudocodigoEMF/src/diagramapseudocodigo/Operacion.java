/**
 */
package diagramapseudocodigo;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operacion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link diagramapseudocodigo.Operacion#getEAttribute0rence0 <em>EAttribute0rence0</em>}</li>
 *   <li>{@link diagramapseudocodigo.Operacion#getNegacionesFinales <em>Negaciones Finales</em>}</li>
 *   <li>{@link diagramapseudocodigo.Operacion#getNegacionesIniciales <em>Negaciones Iniciales</em>}</li>
 *   <li>{@link diagramapseudocodigo.Operacion#getLeft <em>Left</em>}</li>
 *   <li>{@link diagramapseudocodigo.Operacion#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @see diagramapseudocodigo.DiagramapseudocodigoPackage#getOperacion()
 * @model
 * @generated
 */
public interface Operacion extends Valor, Sentencia {
	/**
	 * Returns the value of the '<em><b>EAttribute0rence0</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EAttribute0rence0</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EAttribute0rence0</em>' reference.
	 * @see #setEAttribute0rence0(Operacion)
	 * @see diagramapseudocodigo.DiagramapseudocodigoPackage#getOperacion_EAttribute0rence0()
	 * @model
	 * @generated
	 */
	Operacion getEAttribute0rence0();

	/**
	 * Sets the value of the '{@link diagramapseudocodigo.Operacion#getEAttribute0rence0 <em>EAttribute0rence0</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EAttribute0rence0</em>' reference.
	 * @see #getEAttribute0rence0()
	 * @generated
	 */
	void setEAttribute0rence0(Operacion value);

	/**
	 * Returns the value of the '<em><b>Negaciones Finales</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Negaciones Finales</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Negaciones Finales</em>' attribute list.
	 * @see diagramapseudocodigo.DiagramapseudocodigoPackage#getOperacion_NegacionesFinales()
	 * @model
	 * @generated
	 */
	EList<String> getNegacionesFinales();

	/**
	 * Returns the value of the '<em><b>Negaciones Iniciales</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Negaciones Iniciales</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Negaciones Iniciales</em>' attribute list.
	 * @see diagramapseudocodigo.DiagramapseudocodigoPackage#getOperacion_NegacionesIniciales()
	 * @model
	 * @generated
	 */
	EList<String> getNegacionesIniciales();

	/**
	 * Returns the value of the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left</em>' containment reference.
	 * @see #setLeft(Operacion)
	 * @see diagramapseudocodigo.DiagramapseudocodigoPackage#getOperacion_Left()
	 * @model containment="true"
	 * @generated
	 */
	Operacion getLeft();

	/**
	 * Sets the value of the '{@link diagramapseudocodigo.Operacion#getLeft <em>Left</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left</em>' containment reference.
	 * @see #getLeft()
	 * @generated
	 */
	void setLeft(Operacion value);

	/**
	 * Returns the value of the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Right</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right</em>' containment reference.
	 * @see #setRight(Operacion)
	 * @see diagramapseudocodigo.DiagramapseudocodigoPackage#getOperacion_Right()
	 * @model containment="true"
	 * @generated
	 */
	Operacion getRight();

	/**
	 * Sets the value of the '{@link diagramapseudocodigo.Operacion#getRight <em>Right</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right</em>' containment reference.
	 * @see #getRight()
	 * @generated
	 */
	void setRight(Operacion value);

} // Operacion
