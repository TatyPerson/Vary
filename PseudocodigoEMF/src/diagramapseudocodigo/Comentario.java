/**
 */
package diagramapseudocodigo;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Comentario</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link diagramapseudocodigo.Comentario#getMensaje <em>Mensaje</em>}</li>
 * </ul>
 * </p>
 *
 * @see diagramapseudocodigo.DiagramapseudocodigoPackage#getComentario()
 * @model
 * @generated
 */
public interface Comentario extends EObject {

	/**
	 * Returns the value of the '<em><b>Mensaje</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mensaje</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mensaje</em>' attribute.
	 * @see #setMensaje(String)
	 * @see diagramapseudocodigo.DiagramapseudocodigoPackage#getComentario_Mensaje()
	 * @model required="true"
	 * @generated
	 */
	String getMensaje();

	/**
	 * Sets the value of the '{@link diagramapseudocodigo.Comentario#getMensaje <em>Mensaje</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mensaje</em>' attribute.
	 * @see #getMensaje()
	 * @generated
	 */
	void setMensaje(String value);
} // Comentario
