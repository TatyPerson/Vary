/**
 */
package diagramapseudocodigo;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enumerado</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link diagramapseudocodigo.Enumerado#getPosiblesValores <em>Posibles Valores</em>}</li>
 * </ul>
 *
 * @see diagramapseudocodigo.DiagramapseudocodigoPackage#getEnumerado()
 * @model
 * @generated
 */
public interface Enumerado extends TipoComplejo {
	/**
	 * Returns the value of the '<em><b>Posibles Valores</b></em>' containment reference list.
	 * The list contents are of type {@link diagramapseudocodigo.Operacion}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Posibles Valores</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Posibles Valores</em>' containment reference list.
	 * @see diagramapseudocodigo.DiagramapseudocodigoPackage#getEnumerado_PosiblesValores()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Operacion> getPosiblesValores();

} // Enumerado
