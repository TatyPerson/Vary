/**
 */
package diagramapseudocodigo;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Declaracion Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link diagramapseudocodigo.DeclaracionVariable#getTipo <em>Tipo</em>}</li>
 *   <li>{@link diagramapseudocodigo.DeclaracionVariable#getVariable <em>Variable</em>}</li>
 * </ul>
 * </p>
 *
 * @see diagramapseudocodigo.DiagramapseudocodigoPackage#getDeclaracionVariable()
 * @model
 * @generated
 */
public interface DeclaracionVariable extends Declaracion {
	/**
	 * Returns the value of the '<em><b>Tipo</b></em>' attribute.
	 * The literals are from the enumeration {@link diagramapseudocodigo.TipoVariable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tipo</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tipo</em>' attribute.
	 * @see diagramapseudocodigo.TipoVariable
	 * @see #setTipo(TipoVariable)
	 * @see diagramapseudocodigo.DiagramapseudocodigoPackage#getDeclaracionVariable_Tipo()
	 * @model required="true"
	 * @generated
	 */
	TipoVariable getTipo();

	/**
	 * Sets the value of the '{@link diagramapseudocodigo.DeclaracionVariable#getTipo <em>Tipo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tipo</em>' attribute.
	 * @see diagramapseudocodigo.TipoVariable
	 * @see #getTipo()
	 * @generated
	 */
	void setTipo(TipoVariable value);

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
	 * @see diagramapseudocodigo.DiagramapseudocodigoPackage#getDeclaracionVariable_Variable()
	 * @model containment="true"
	 * @generated
	 */
	EList<Variable> getVariable();

} // DeclaracionVariable
