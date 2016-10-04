/**
 */
package diagramapseudocodigo;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Implementacion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link diagramapseudocodigo.Implementacion#getSubprocesos <em>Subprocesos</em>}</li>
 *   <li>{@link diagramapseudocodigo.Implementacion#getGlobales <em>Globales</em>}</li>
 *   <li>{@link diagramapseudocodigo.Implementacion#getConstantes <em>Constantes</em>}</li>
 *   <li>{@link diagramapseudocodigo.Implementacion#getComplejos <em>Complejos</em>}</li>
 * </ul>
 *
 * @see diagramapseudocodigo.DiagramapseudocodigoPackage#getImplementacion()
 * @model
 * @generated
 */
public interface Implementacion extends EObject {
	/**
	 * Returns the value of the '<em><b>Subprocesos</b></em>' containment reference list.
	 * The list contents are of type {@link diagramapseudocodigo.Subproceso}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subprocesos</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subprocesos</em>' containment reference list.
	 * @see diagramapseudocodigo.DiagramapseudocodigoPackage#getImplementacion_Subprocesos()
	 * @model containment="true"
	 * @generated
	 */
	EList<Subproceso> getSubprocesos();

	/**
	 * Returns the value of the '<em><b>Globales</b></em>' containment reference list.
	 * The list contents are of type {@link diagramapseudocodigo.Declaracion}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Globales</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Globales</em>' containment reference list.
	 * @see diagramapseudocodigo.DiagramapseudocodigoPackage#getImplementacion_Globales()
	 * @model containment="true"
	 * @generated
	 */
	EList<Declaracion> getGlobales();

	/**
	 * Returns the value of the '<em><b>Constantes</b></em>' containment reference list.
	 * The list contents are of type {@link diagramapseudocodigo.Constante}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constantes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constantes</em>' containment reference list.
	 * @see diagramapseudocodigo.DiagramapseudocodigoPackage#getImplementacion_Constantes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Constante> getConstantes();

	/**
	 * Returns the value of the '<em><b>Complejos</b></em>' containment reference list.
	 * The list contents are of type {@link diagramapseudocodigo.TipoComplejo}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Complejos</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Complejos</em>' containment reference list.
	 * @see diagramapseudocodigo.DiagramapseudocodigoPackage#getImplementacion_Complejos()
	 * @model containment="true"
	 * @generated
	 */
	EList<TipoComplejo> getComplejos();

} // Implementacion
