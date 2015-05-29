/**
 */
package diagramapseudocodigo;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Datos</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link diagramapseudocodigo.Datos#getContenido <em>Contenido</em>}</li>
 * </ul>
 * </p>
 *
 * @see diagramapseudocodigo.DiagramapseudocodigoPackage#getDatos()
 * @model
 * @generated
 */
public interface Datos extends EObject {
	/**
	 * Returns the value of the '<em><b>Contenido</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contenido</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contenido</em>' attribute.
	 * @see #setContenido(String)
	 * @see diagramapseudocodigo.DiagramapseudocodigoPackage#getDatos_Contenido()
	 * @model required="true"
	 * @generated
	 */
	String getContenido();

	/**
	 * Sets the value of the '{@link diagramapseudocodigo.Datos#getContenido <em>Contenido</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contenido</em>' attribute.
	 * @see #getContenido()
	 * @generated
	 */
	void setContenido(String value);

} // Datos
