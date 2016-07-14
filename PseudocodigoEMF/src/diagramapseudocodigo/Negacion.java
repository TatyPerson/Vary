/**
 */
package diagramapseudocodigo;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Negacion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link diagramapseudocodigo.Negacion#getSigno <em>Signo</em>}</li>
 * </ul>
 *
 * @see diagramapseudocodigo.DiagramapseudocodigoPackage#getNegacion()
 * @model
 * @generated
 */
public interface Negacion extends operacion {
	/**
	 * Returns the value of the '<em><b>Signo</b></em>' attribute.
	 * The literals are from the enumeration {@link diagramapseudocodigo.signoNegacion}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Signo</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signo</em>' attribute.
	 * @see diagramapseudocodigo.signoNegacion
	 * @see #setSigno(signoNegacion)
	 * @see diagramapseudocodigo.DiagramapseudocodigoPackage#getNegacion_Signo()
	 * @model
	 * @generated
	 */
	signoNegacion getSigno();

	/**
	 * Sets the value of the '{@link diagramapseudocodigo.Negacion#getSigno <em>Signo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signo</em>' attribute.
	 * @see diagramapseudocodigo.signoNegacion
	 * @see #getSigno()
	 * @generated
	 */
	void setSigno(signoNegacion value);

} // Negacion
