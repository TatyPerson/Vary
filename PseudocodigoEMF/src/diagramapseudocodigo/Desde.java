/**
 */
package diagramapseudocodigo;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Desde</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link diagramapseudocodigo.Desde#getAsignacion <em>Asignacion</em>}</li>
 * </ul>
 *
 * @see diagramapseudocodigo.DiagramapseudocodigoPackage#getDesde()
 * @model
 * @generated
 */
public interface Desde extends Bloque {
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
	 * @see diagramapseudocodigo.DiagramapseudocodigoPackage#getDesde_Asignacion()
	 * @model containment="true" required="true"
	 * @generated
	 */
	AsignacionNormal getAsignacion();

	/**
	 * Sets the value of the '{@link diagramapseudocodigo.Desde#getAsignacion <em>Asignacion</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Asignacion</em>' containment reference.
	 * @see #getAsignacion()
	 * @generated
	 */
	void setAsignacion(AsignacionNormal value);

} // Desde
