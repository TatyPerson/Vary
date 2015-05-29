/**
 */
package diagramapseudocodigo;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Funcion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link diagramapseudocodigo.Funcion#getTipo <em>Tipo</em>}</li>
 *   <li>{@link diagramapseudocodigo.Funcion#getDevuelve <em>Devuelve</em>}</li>
 * </ul>
 * </p>
 *
 * @see diagramapseudocodigo.DiagramapseudocodigoPackage#getFuncion()
 * @model
 * @generated
 */
public interface Funcion extends Subproceso {
	/**
	 * Returns the value of the '<em><b>Tipo</b></em>' attribute.
	 * The literals are from the enumeration {@link diagramapseudocodigo.TipoVariable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tipo</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tipo</em>' attribute.
	 * @see diagramapseudocodigo.TipoVariable
	 * @see #setTipo(TipoVariable)
	 * @see diagramapseudocodigo.DiagramapseudocodigoPackage#getFuncion_Tipo()
	 * @model
	 * @generated
	 */
	TipoVariable getTipo();

	/**
	 * Sets the value of the '{@link diagramapseudocodigo.Funcion#getTipo <em>Tipo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tipo</em>' attribute.
	 * @see diagramapseudocodigo.TipoVariable
	 * @see #getTipo()
	 * @generated
	 */
	void setTipo(TipoVariable value);

	/**
	 * Returns the value of the '<em><b>Devuelve</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Devuelve</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Devuelve</em>' containment reference.
	 * @see #setDevuelve(Devolver)
	 * @see diagramapseudocodigo.DiagramapseudocodigoPackage#getFuncion_Devuelve()
	 * @model containment="true"
	 * @generated
	 */
	Devolver getDevuelve();

	/**
	 * Sets the value of the '{@link diagramapseudocodigo.Funcion#getDevuelve <em>Devuelve</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Devuelve</em>' containment reference.
	 * @see #getDevuelve()
	 * @generated
	 */
	void setDevuelve(Devolver value);

} // Funcion
