/**
 */
package diagramapseudocodigo;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Segun</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link diagramapseudocodigo.Segun#getCasos <em>Casos</em>}</li>
 *   <li>{@link diagramapseudocodigo.Segun#getDevuelve <em>Devuelve</em>}</li>
 * </ul>
 *
 * @see diagramapseudocodigo.DiagramapseudocodigoPackage#getSegun()
 * @model
 * @generated
 */
public interface Segun extends Bloque {
	/**
	 * Returns the value of the '<em><b>Casos</b></em>' containment reference list.
	 * The list contents are of type {@link diagramapseudocodigo.Caso}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Casos</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Casos</em>' containment reference list.
	 * @see diagramapseudocodigo.DiagramapseudocodigoPackage#getSegun_Casos()
	 * @model containment="true"
	 * @generated
	 */
	EList<Caso> getCasos();

	/**
	 * Returns the value of the '<em><b>Devuelve</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Devuelve</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Devuelve</em>' containment reference.
	 * @see #setDevuelve(Devolver)
	 * @see diagramapseudocodigo.DiagramapseudocodigoPackage#getSegun_Devuelve()
	 * @model containment="true"
	 * @generated
	 */
	Devolver getDevuelve();

	/**
	 * Sets the value of the '{@link diagramapseudocodigo.Segun#getDevuelve <em>Devuelve</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Devuelve</em>' containment reference.
	 * @see #getDevuelve()
	 * @generated
	 */
	void setDevuelve(Devolver value);

} // Segun
