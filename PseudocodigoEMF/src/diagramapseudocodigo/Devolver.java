/**
 */
package diagramapseudocodigo;

import org.eclipse.emf.ecore.EObject;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Devolver</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link diagramapseudocodigo.Devolver#getEReference0 <em>EReference0</em>}</li>
 *   <li>{@link diagramapseudocodigo.Devolver#getDevuelve <em>Devuelve</em>}</li>
 * </ul>
 * </p>
 *
 * @see diagramapseudocodigo.DiagramapseudocodigoPackage#getDevolver()
 * @model
 * @generated
 */
public interface Devolver extends EObject {
	/**
	 * Returns the value of the '<em><b>EReference0</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EReference0</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EReference0</em>' reference.
	 * @see #setEReference0(Devolver)
	 * @see diagramapseudocodigo.DiagramapseudocodigoPackage#getDevolver_EReference0()
	 * @model
	 * @generated
	 */
	Devolver getEReference0();

	/**
	 * Sets the value of the '{@link diagramapseudocodigo.Devolver#getEReference0 <em>EReference0</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EReference0</em>' reference.
	 * @see #getEReference0()
	 * @generated
	 */
	void setEReference0(Devolver value);

	/**
	 * Returns the value of the '<em><b>Devuelve</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Devuelve</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Devuelve</em>' containment reference.
	 * @see #setDevuelve(operacion)
	 * @see diagramapseudocodigo.DiagramapseudocodigoPackage#getDevolver_Devuelve()
	 * @model containment="true" required="true"
	 * @generated
	 */
	operacion getDevuelve();

	/**
	 * Sets the value of the '{@link diagramapseudocodigo.Devolver#getDevuelve <em>Devuelve</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Devuelve</em>' containment reference.
	 * @see #getDevuelve()
	 * @generated
	 */
	void setDevuelve(operacion value);

} // Devolver
