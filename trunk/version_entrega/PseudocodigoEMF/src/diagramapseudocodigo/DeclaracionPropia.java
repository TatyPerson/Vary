/**
 */
package diagramapseudocodigo;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Declaracion Propia</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link diagramapseudocodigo.DeclaracionPropia#getTipo <em>Tipo</em>}</li>
 *   <li>{@link diagramapseudocodigo.DeclaracionPropia#getVariable <em>Variable</em>}</li>
 * </ul>
 * </p>
 *
 * @see diagramapseudocodigo.DiagramapseudocodigoPackage#getDeclaracionPropia()
 * @model
 * @generated
 */
public interface DeclaracionPropia extends Declaracion {
	/**
	 * Returns the value of the '<em><b>Tipo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tipo</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tipo</em>' attribute.
	 * @see #setTipo(String)
	 * @see diagramapseudocodigo.DiagramapseudocodigoPackage#getDeclaracionPropia_Tipo()
	 * @model required="true"
	 * @generated
	 */
	String getTipo();

	/**
	 * Sets the value of the '{@link diagramapseudocodigo.DeclaracionPropia#getTipo <em>Tipo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tipo</em>' attribute.
	 * @see #getTipo()
	 * @generated
	 */
	void setTipo(String value);

	/**
	 * Returns the value of the '<em><b>Variable</b></em>' containment reference list.
	 * The list contents are of type {@link diagramapseudocodigo.Variable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variable</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable</em>' containment reference list.
	 * @see diagramapseudocodigo.DiagramapseudocodigoPackage#getDeclaracionPropia_Variable()
	 * @model containment="true"
	 * @generated
	 */
	EList<Variable> getVariable();

} // DeclaracionPropia
