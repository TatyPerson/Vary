/**
 */
package diagramapseudocodigo;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Caracter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link diagramapseudocodigo.Caracter#getContenido <em>Contenido</em>}</li>
 * </ul>
 * </p>
 *
 * @see diagramapseudocodigo.DiagramapseudocodigoPackage#getCaracter()
 * @model
 * @generated
 */
public interface Caracter extends Operador, operacion {
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
	 * @see diagramapseudocodigo.DiagramapseudocodigoPackage#getCaracter_Contenido()
	 * @model required="true"
	 * @generated
	 */
	String getContenido();

	/**
	 * Sets the value of the '{@link diagramapseudocodigo.Caracter#getContenido <em>Contenido</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contenido</em>' attribute.
	 * @see #getContenido()
	 * @generated
	 */
	void setContenido(String value);

} // Caracter
