/**
 */
package diagramapseudocodigo;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Inicio</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link diagramapseudocodigo.Inicio#getSentencias <em>Sentencias</em>}</li>
 *   <li>{@link diagramapseudocodigo.Inicio#getDeclaraciones <em>Declaraciones</em>}</li>
 * </ul>
 *
 * @see diagramapseudocodigo.DiagramapseudocodigoPackage#getInicio()
 * @model
 * @generated
 */
public interface Inicio extends EObject {
	/**
	 * Returns the value of the '<em><b>Sentencias</b></em>' containment reference list.
	 * The list contents are of type {@link diagramapseudocodigo.Sentencia}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sentencias</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sentencias</em>' containment reference list.
	 * @see diagramapseudocodigo.DiagramapseudocodigoPackage#getInicio_Sentencias()
	 * @model containment="true"
	 * @generated
	 */
	EList<Sentencia> getSentencias();

	/**
	 * Returns the value of the '<em><b>Declaraciones</b></em>' containment reference list.
	 * The list contents are of type {@link diagramapseudocodigo.Declaracion}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Declaraciones</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Declaraciones</em>' containment reference list.
	 * @see diagramapseudocodigo.DiagramapseudocodigoPackage#getInicio_Declaraciones()
	 * @model containment="true"
	 * @generated
	 */
	EList<Declaracion> getDeclaraciones();

} // Inicio
