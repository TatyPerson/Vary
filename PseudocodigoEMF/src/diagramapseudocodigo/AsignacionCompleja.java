/**
 */
package diagramapseudocodigo;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Asignacion Compleja</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link diagramapseudocodigo.AsignacionCompleja#getOperador <em>Operador</em>}</li>
 *   <li>{@link diagramapseudocodigo.AsignacionCompleja#getValor_asignacion <em>Valor asignacion</em>}</li>
 * </ul>
 *
 * @see diagramapseudocodigo.DiagramapseudocodigoPackage#getAsignacionCompleja()
 * @model
 * @generated
 */
public interface AsignacionCompleja extends Asignacion {
	/**
	 * Returns the value of the '<em><b>Operador</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operador</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operador</em>' containment reference.
	 * @see #setOperador(Operacion)
	 * @see diagramapseudocodigo.DiagramapseudocodigoPackage#getAsignacionCompleja_Operador()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Operacion getOperador();

	/**
	 * Sets the value of the '{@link diagramapseudocodigo.AsignacionCompleja#getOperador <em>Operador</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operador</em>' containment reference.
	 * @see #getOperador()
	 * @generated
	 */
	void setOperador(Operacion value);

	/**
	 * Returns the value of the '<em><b>Valor asignacion</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Valor asignacion</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valor asignacion</em>' containment reference.
	 * @see #setValor_asignacion(Operacion)
	 * @see diagramapseudocodigo.DiagramapseudocodigoPackage#getAsignacionCompleja_Valor_asignacion()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Operacion getValor_asignacion();

	/**
	 * Sets the value of the '{@link diagramapseudocodigo.AsignacionCompleja#getValor_asignacion <em>Valor asignacion</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valor asignacion</em>' containment reference.
	 * @see #getValor_asignacion()
	 * @generated
	 */
	void setValor_asignacion(Operacion value);

} // AsignacionCompleja
