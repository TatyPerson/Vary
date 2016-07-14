/**
 */
package diagramapseudocodigo;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>operacion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link diagramapseudocodigo.operacion#getEAttribute0rence0 <em>EAttribute0rence0</em>}</li>
 *   <li>{@link diagramapseudocodigo.operacion#getNegacionesFinales <em>Negaciones Finales</em>}</li>
 *   <li>{@link diagramapseudocodigo.operacion#getNegacionesIniciales <em>Negaciones Iniciales</em>}</li>
 * </ul>
 *
 * @see diagramapseudocodigo.DiagramapseudocodigoPackage#getoperacion()
 * @model
 * @generated
 */
public interface operacion extends valor, Sentencias {

	/**
	 * Returns the value of the '<em><b>EAttribute0rence0</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EAttribute0rence0</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EAttribute0rence0</em>' reference.
	 * @see #setEAttribute0rence0(operacion)
	 * @see diagramapseudocodigo.DiagramapseudocodigoPackage#getoperacion_EAttribute0rence0()
	 * @model
	 * @generated
	 */
	operacion getEAttribute0rence0();

	/**
	 * Sets the value of the '{@link diagramapseudocodigo.operacion#getEAttribute0rence0 <em>EAttribute0rence0</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EAttribute0rence0</em>' reference.
	 * @see #getEAttribute0rence0()
	 * @generated
	 */
	void setEAttribute0rence0(operacion value);

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
	 * @see diagramapseudocodigo.DiagramapseudocodigoPackage#getoperacion_NegacionesFinales()
	 * @model
	 * @generated
	 */
	EList<String> getNegacionesFinales();

	/**
	 * Returns the value of the '<em><b>Negaciones Iniciales</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Negaciones Iniciales</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Negaciones Iniciales</em>' attribute list.
	 * @see diagramapseudocodigo.DiagramapseudocodigoPackage#getoperacion_NegacionesIniciales()
	 * @model
	 * @generated
	 */
	EList<String> getNegacionesIniciales();

} // operacion
