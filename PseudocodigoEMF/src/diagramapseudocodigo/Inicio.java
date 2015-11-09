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
 * <ul>
 *   <li>{@link diagramapseudocodigo.Inicio#getTiene <em>Tiene</em>}</li>
 *   <li>{@link diagramapseudocodigo.Inicio#getDeclaracion <em>Declaracion</em>}</li>
 * </ul>
 * </p>
 *
 * @see diagramapseudocodigo.DiagramapseudocodigoPackage#getInicio()
 * @model
 * @generated
 */
public interface Inicio extends EObject {
	/**
	 * Returns the value of the '<em><b>Tiene</b></em>' containment reference list.
	 * The list contents are of type {@link diagramapseudocodigo.Sentencias}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tiene</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tiene</em>' containment reference list.
	 * @see diagramapseudocodigo.DiagramapseudocodigoPackage#getInicio_Tiene()
	 * @model containment="true"
	 * @generated
	 */
	EList<Sentencias> getTiene();

	/**
	 * Returns the value of the '<em><b>Declaracion</b></em>' containment reference list.
	 * The list contents are of type {@link diagramapseudocodigo.Declaracion}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Declaracion</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Declaracion</em>' containment reference list.
	 * @see diagramapseudocodigo.DiagramapseudocodigoPackage#getInicio_Declaracion()
	 * @model containment="true"
	 * @generated
	 */
	EList<Declaracion> getDeclaracion();

} // Inicio
