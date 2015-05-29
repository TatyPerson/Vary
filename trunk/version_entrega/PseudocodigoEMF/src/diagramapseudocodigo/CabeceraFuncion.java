/**
 */
package diagramapseudocodigo;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cabecera Funcion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link diagramapseudocodigo.CabeceraFuncion#getTipo <em>Tipo</em>}</li>
 * </ul>
 * </p>
 *
 * @see diagramapseudocodigo.DiagramapseudocodigoPackage#getCabeceraFuncion()
 * @model
 * @generated
 */
public interface CabeceraFuncion extends CabeceraSubproceso {
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
	 * @see diagramapseudocodigo.DiagramapseudocodigoPackage#getCabeceraFuncion_Tipo()
	 * @model required="true"
	 * @generated
	 */
	TipoVariable getTipo();

	/**
	 * Sets the value of the '{@link diagramapseudocodigo.CabeceraFuncion#getTipo <em>Tipo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tipo</em>' attribute.
	 * @see diagramapseudocodigo.TipoVariable
	 * @see #getTipo()
	 * @generated
	 */
	void setTipo(TipoVariable value);

} // CabeceraFuncion
