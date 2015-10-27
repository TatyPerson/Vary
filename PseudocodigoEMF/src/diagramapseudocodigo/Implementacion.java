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
 *   <li>{@link diagramapseudocodigo.Implementacion#getFuncion <em>Funcion</em>}</li>
 *   <li>{@link diagramapseudocodigo.Implementacion#getGlobal <em>Global</em>}</li>
 *   <li>{@link diagramapseudocodigo.Implementacion#getConstantes <em>Constantes</em>}</li>
 *   <li>{@link diagramapseudocodigo.Implementacion#getTipocomplejo <em>Tipocomplejo</em>}</li>
 * </ul>
 *
 * @see diagramapseudocodigo.DiagramapseudocodigoPackage#getImplementacion()
 * @model
 * @generated
 */
public interface Implementacion extends EObject {
	/**
	 * Returns the value of the '<em><b>Funcion</b></em>' containment reference list.
	 * The list contents are of type {@link diagramapseudocodigo.Subproceso}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Funcion</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Funcion</em>' containment reference list.
	 * @see diagramapseudocodigo.DiagramapseudocodigoPackage#getImplementacion_Funcion()
	 * @model containment="true"
	 * @generated
	 */
	EList<Subproceso> getFuncion();

	/**
	 * Returns the value of the '<em><b>Global</b></em>' containment reference list.
	 * The list contents are of type {@link diagramapseudocodigo.Declaracion}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Global</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Global</em>' containment reference list.
	 * @see diagramapseudocodigo.DiagramapseudocodigoPackage#getImplementacion_Global()
	 * @model containment="true"
	 * @generated
	 */
	EList<Declaracion> getGlobal();

	/**
	 * Returns the value of the '<em><b>Constantes</b></em>' containment reference list.
	 * The list contents are of type {@link diagramapseudocodigo.Constantes}.
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
	EList<Constantes> getConstantes();

	/**
	 * Returns the value of the '<em><b>Tipocomplejo</b></em>' containment reference list.
	 * The list contents are of type {@link diagramapseudocodigo.TipoComplejo}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tipocomplejo</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tipocomplejo</em>' containment reference list.
	 * @see diagramapseudocodigo.DiagramapseudocodigoPackage#getImplementacion_Tipocomplejo()
	 * @model containment="true"
	 * @generated
	 */
	EList<TipoComplejo> getTipocomplejo();

} // Implementacion
