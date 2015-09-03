/**
 */
package diagramapseudocodigo;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exportacion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link diagramapseudocodigo.Exportacion#getConstantes <em>Constantes</em>}</li>
 *   <li>{@link diagramapseudocodigo.Exportacion#getGlobales <em>Globales</em>}</li>
 *   <li>{@link diagramapseudocodigo.Exportacion#getTipocomplejo <em>Tipocomplejo</em>}</li>
 *   <li>{@link diagramapseudocodigo.Exportacion#getExporta_funciones <em>Exporta funciones</em>}</li>
 * </ul>
 * </p>
 *
 * @see diagramapseudocodigo.DiagramapseudocodigoPackage#getExportacion()
 * @model
 * @generated
 */
public interface Exportacion extends EObject {
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
	 * @see diagramapseudocodigo.DiagramapseudocodigoPackage#getExportacion_Constantes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Constantes> getConstantes();

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
	 * @see diagramapseudocodigo.DiagramapseudocodigoPackage#getExportacion_Globales()
	 * @model containment="true"
	 * @generated
	 */
	EList<Declaracion> getGlobales();

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
	 * @see diagramapseudocodigo.DiagramapseudocodigoPackage#getExportacion_Tipocomplejo()
	 * @model containment="true"
	 * @generated
	 */
	EList<TipoComplejo> getTipocomplejo();

	/**
	 * Returns the value of the '<em><b>Exporta funciones</b></em>' containment reference list.
	 * The list contents are of type {@link diagramapseudocodigo.CabeceraSubproceso}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exporta funciones</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exporta funciones</em>' containment reference list.
	 * @see diagramapseudocodigo.DiagramapseudocodigoPackage#getExportacion_Exporta_funciones()
	 * @model containment="true"
	 * @generated
	 */
	EList<CabeceraSubproceso> getExporta_funciones();

} // Exportacion
