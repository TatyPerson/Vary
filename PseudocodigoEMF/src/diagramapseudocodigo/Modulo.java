/**
 */
package diagramapseudocodigo;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Modulo</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link diagramapseudocodigo.Modulo#getNombre <em>Nombre</em>}</li>
 *   <li>{@link diagramapseudocodigo.Modulo#getImplementacion <em>Implementacion</em>}</li>
 *   <li>{@link diagramapseudocodigo.Modulo#getImportaciones <em>Importaciones</em>}</li>
 *   <li>{@link diagramapseudocodigo.Modulo#getExporta_globales <em>Exporta globales</em>}</li>
 *   <li>{@link diagramapseudocodigo.Modulo#getExporta_tipos <em>Exporta tipos</em>}</li>
 *   <li>{@link diagramapseudocodigo.Modulo#getExporta_constantes <em>Exporta constantes</em>}</li>
 *   <li>{@link diagramapseudocodigo.Modulo#getExporta_subprocesos <em>Exporta subprocesos</em>}</li>
 * </ul>
 *
 * @see diagramapseudocodigo.DiagramapseudocodigoPackage#getModulo()
 * @model
 * @generated
 */
public interface Modulo extends Codigo {
	/**
	 * Returns the value of the '<em><b>Nombre</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nombre</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre</em>' attribute.
	 * @see #setNombre(String)
	 * @see diagramapseudocodigo.DiagramapseudocodigoPackage#getModulo_Nombre()
	 * @model default="" id="true" required="true"
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link diagramapseudocodigo.Modulo#getNombre <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre</em>' attribute.
	 * @see #getNombre()
	 * @generated
	 */
	void setNombre(String value);

	/**
	 * Returns the value of the '<em><b>Implementacion</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Implementacion</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implementacion</em>' containment reference.
	 * @see #setImplementacion(Implementacion)
	 * @see diagramapseudocodigo.DiagramapseudocodigoPackage#getModulo_Implementacion()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Implementacion getImplementacion();

	/**
	 * Sets the value of the '{@link diagramapseudocodigo.Modulo#getImplementacion <em>Implementacion</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Implementacion</em>' containment reference.
	 * @see #getImplementacion()
	 * @generated
	 */
	void setImplementacion(Implementacion value);

	/**
	 * Returns the value of the '<em><b>Importaciones</b></em>' reference list.
	 * The list contents are of type {@link diagramapseudocodigo.Modulo}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Importaciones</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Importaciones</em>' reference list.
	 * @see diagramapseudocodigo.DiagramapseudocodigoPackage#getModulo_Importaciones()
	 * @model
	 * @generated
	 */
	EList<Modulo> getImportaciones();

	/**
	 * Returns the value of the '<em><b>Exporta globales</b></em>' containment reference list.
	 * The list contents are of type {@link diagramapseudocodigo.Declaracion}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exporta globales</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exporta globales</em>' containment reference list.
	 * @see diagramapseudocodigo.DiagramapseudocodigoPackage#getModulo_Exporta_globales()
	 * @model containment="true"
	 * @generated
	 */
	EList<Declaracion> getExporta_globales();

	/**
	 * Returns the value of the '<em><b>Exporta tipos</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exporta tipos</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exporta tipos</em>' attribute list.
	 * @see diagramapseudocodigo.DiagramapseudocodigoPackage#getModulo_Exporta_tipos()
	 * @model unique="false"
	 * @generated
	 */
	EList<String> getExporta_tipos();

	/**
	 * Returns the value of the '<em><b>Exporta constantes</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exporta constantes</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exporta constantes</em>' attribute list.
	 * @see diagramapseudocodigo.DiagramapseudocodigoPackage#getModulo_Exporta_constantes()
	 * @model unique="false"
	 * @generated
	 */
	EList<String> getExporta_constantes();

	/**
	 * Returns the value of the '<em><b>Exporta subprocesos</b></em>' containment reference list.
	 * The list contents are of type {@link diagramapseudocodigo.CabeceraSubproceso}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exporta subprocesos</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exporta subprocesos</em>' containment reference list.
	 * @see diagramapseudocodigo.DiagramapseudocodigoPackage#getModulo_Exporta_subprocesos()
	 * @model containment="true"
	 * @generated
	 */
	EList<CabeceraSubproceso> getExporta_subprocesos();

} // Modulo
