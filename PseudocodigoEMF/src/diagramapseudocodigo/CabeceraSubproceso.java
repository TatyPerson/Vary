/**
 */
package diagramapseudocodigo;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cabecera Subproceso</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link diagramapseudocodigo.CabeceraSubproceso#getNombre <em>Nombre</em>}</li>
 *   <li>{@link diagramapseudocodigo.CabeceraSubproceso#getParametrofuncion <em>Parametrofuncion</em>}</li>
 * </ul>
 *
 * @see diagramapseudocodigo.DiagramapseudocodigoPackage#getCabeceraSubproceso()
 * @model
 * @generated
 */
public interface CabeceraSubproceso extends EObject {
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
	 * @see diagramapseudocodigo.DiagramapseudocodigoPackage#getCabeceraSubproceso_Nombre()
	 * @model required="true"
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link diagramapseudocodigo.CabeceraSubproceso#getNombre <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre</em>' attribute.
	 * @see #getNombre()
	 * @generated
	 */
	void setNombre(String value);

	/**
	 * Returns the value of the '<em><b>Parametrofuncion</b></em>' containment reference list.
	 * The list contents are of type {@link diagramapseudocodigo.ParametroFuncion}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parametrofuncion</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parametrofuncion</em>' containment reference list.
	 * @see diagramapseudocodigo.DiagramapseudocodigoPackage#getCabeceraSubproceso_Parametrofuncion()
	 * @model containment="true"
	 * @generated
	 */
	EList<ParametroFuncion> getParametrofuncion();

} // CabeceraSubproceso
