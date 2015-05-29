/**
 */
package diagramapseudocodigo;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Campo Registro</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link diagramapseudocodigo.CampoRegistro#getNombre_campo <em>Nombre campo</em>}</li>
 * </ul>
 * </p>
 *
 * @see diagramapseudocodigo.DiagramapseudocodigoPackage#getCampoRegistro()
 * @model
 * @generated
 */
public interface CampoRegistro extends EObject {
	/**
	 * Returns the value of the '<em><b>Nombre campo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nombre campo</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre campo</em>' attribute.
	 * @see #setNombre_campo(String)
	 * @see diagramapseudocodigo.DiagramapseudocodigoPackage#getCampoRegistro_Nombre_campo()
	 * @model required="true"
	 * @generated
	 */
	String getNombre_campo();

	/**
	 * Sets the value of the '{@link diagramapseudocodigo.CampoRegistro#getNombre_campo <em>Nombre campo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre campo</em>' attribute.
	 * @see #getNombre_campo()
	 * @generated
	 */
	void setNombre_campo(String value);

} // CampoRegistro
