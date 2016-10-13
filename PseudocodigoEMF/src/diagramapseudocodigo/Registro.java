/**
 */
package diagramapseudocodigo;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Registro</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link diagramapseudocodigo.Registro#getCampos <em>Campos</em>}</li>
 * </ul>
 *
 * @see diagramapseudocodigo.DiagramapseudocodigoPackage#getRegistro()
 * @model
 * @generated
 */
public interface Registro extends TipoComplejo {
	/**
	 * Returns the value of the '<em><b>Campos</b></em>' containment reference list.
	 * The list contents are of type {@link diagramapseudocodigo.Declaracion}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Campos</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Campos</em>' containment reference list.
	 * @see diagramapseudocodigo.DiagramapseudocodigoPackage#getRegistro_Campos()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Declaracion> getCampos();

} // Registro
