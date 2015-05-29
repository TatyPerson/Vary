/**
 */
package diagramapseudocodigo;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Si</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link diagramapseudocodigo.Si#getSino <em>Sino</em>}</li>
 *   <li>{@link diagramapseudocodigo.Si#getDevuelve <em>Devuelve</em>}</li>
 * </ul>
 * </p>
 *
 * @see diagramapseudocodigo.DiagramapseudocodigoPackage#getSi()
 * @model
 * @generated
 */
public interface Si extends Bloque {
	/**
	 * Returns the value of the '<em><b>Sino</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sino</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sino</em>' containment reference.
	 * @see #setSino(Sino)
	 * @see diagramapseudocodigo.DiagramapseudocodigoPackage#getSi_Sino()
	 * @model containment="true"
	 * @generated
	 */
	Sino getSino();

	/**
	 * Sets the value of the '{@link diagramapseudocodigo.Si#getSino <em>Sino</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sino</em>' containment reference.
	 * @see #getSino()
	 * @generated
	 */
	void setSino(Sino value);

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
	 * @see diagramapseudocodigo.DiagramapseudocodigoPackage#getSi_Devuelve()
	 * @model containment="true"
	 * @generated
	 */
	Devolver getDevuelve();

	/**
	 * Sets the value of the '{@link diagramapseudocodigo.Si#getDevuelve <em>Devuelve</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Devuelve</em>' containment reference.
	 * @see #getDevuelve()
	 * @generated
	 */
	void setDevuelve(Devolver value);

} // Si
