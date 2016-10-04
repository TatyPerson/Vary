/**
 */
package diagramapseudocodigo;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Subproceso</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link diagramapseudocodigo.Subproceso#getParametros <em>Parametros</em>}</li>
 *   <li>{@link diagramapseudocodigo.Subproceso#getSentencias <em>Sentencias</em>}</li>
 *   <li>{@link diagramapseudocodigo.Subproceso#getNombre <em>Nombre</em>}</li>
 *   <li>{@link diagramapseudocodigo.Subproceso#getDeclaraciones <em>Declaraciones</em>}</li>
 * </ul>
 *
 * @see diagramapseudocodigo.DiagramapseudocodigoPackage#getSubproceso()
 * @model abstract="true"
 * @generated
 */
public interface Subproceso extends EObject {
	/**
	 * Returns the value of the '<em><b>Parametros</b></em>' containment reference list.
	 * The list contents are of type {@link diagramapseudocodigo.Parametro}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parametros</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parametros</em>' containment reference list.
	 * @see diagramapseudocodigo.DiagramapseudocodigoPackage#getSubproceso_Parametros()
	 * @model containment="true"
	 * @generated
	 */
	EList<Parametro> getParametros();

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
	 * @see diagramapseudocodigo.DiagramapseudocodigoPackage#getSubproceso_Sentencias()
	 * @model containment="true"
	 * @generated
	 */
	EList<Sentencia> getSentencias();

	/**
	 * Returns the value of the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nombre</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre</em>' attribute.
	 * @see #setNombre(String)
	 * @see diagramapseudocodigo.DiagramapseudocodigoPackage#getSubproceso_Nombre()
	 * @model required="true"
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link diagramapseudocodigo.Subproceso#getNombre <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre</em>' attribute.
	 * @see #getNombre()
	 * @generated
	 */
	void setNombre(String value);

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
	 * @see diagramapseudocodigo.DiagramapseudocodigoPackage#getSubproceso_Declaraciones()
	 * @model containment="true"
	 * @generated
	 */
	EList<Declaracion> getDeclaraciones();

} // Subproceso
