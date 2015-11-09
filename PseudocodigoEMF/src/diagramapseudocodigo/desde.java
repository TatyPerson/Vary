/**
 */
package diagramapseudocodigo;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>desde</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link diagramapseudocodigo.desde#getAsignacion <em>Asignacion</em>}</li>
 * </ul>
 * </p>
 *
 * @see diagramapseudocodigo.DiagramapseudocodigoPackage#getdesde()
 * @model
 * @generated
 */
public interface desde extends Bloque {
	/**
	 * Returns the value of the '<em><b>Asignacion</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Asignacion</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Asignacion</em>' containment reference.
	 * @see #setAsignacion(AsignacionNormal)
	 * @see diagramapseudocodigo.DiagramapseudocodigoPackage#getdesde_Asignacion()
	 * @model containment="true" required="true"
	 * @generated
	 */
	AsignacionNormal getAsignacion();

	/**
	 * Sets the value of the '{@link diagramapseudocodigo.desde#getAsignacion <em>Asignacion</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Asignacion</em>' containment reference.
	 * @see #getAsignacion()
	 * @generated
	 */
	void setAsignacion(AsignacionNormal value);

} // desde
