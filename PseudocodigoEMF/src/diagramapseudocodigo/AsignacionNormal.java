/**
 */
package diagramapseudocodigo;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Asignacion Normal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link diagramapseudocodigo.AsignacionNormal#getMat <em>Mat</em>}</li>
 *   <li>{@link diagramapseudocodigo.AsignacionNormal#getValor_asignacion <em>Valor asignacion</em>}</li>
 *   <li>{@link diagramapseudocodigo.AsignacionNormal#getOperador <em>Operador</em>}</li>
 * </ul>
 * </p>
 *
 * @see diagramapseudocodigo.DiagramapseudocodigoPackage#getAsignacionNormal()
 * @model
 * @generated
 */
public interface AsignacionNormal extends Asignacion {
	/**
	 * Returns the value of the '<em><b>Mat</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mat</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mat</em>' attribute list.
	 * @see diagramapseudocodigo.DiagramapseudocodigoPackage#getAsignacionNormal_Mat()
	 * @model
	 * @generated
	 */
	EList<String> getMat();

	/**
	 * Returns the value of the '<em><b>Valor asignacion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Valor asignacion</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valor asignacion</em>' attribute.
	 * @see #setValor_asignacion(String)
	 * @see diagramapseudocodigo.DiagramapseudocodigoPackage#getAsignacionNormal_Valor_asignacion()
	 * @model required="true"
	 * @generated
	 */
	String getValor_asignacion();

	/**
	 * Sets the value of the '{@link diagramapseudocodigo.AsignacionNormal#getValor_asignacion <em>Valor asignacion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valor asignacion</em>' attribute.
	 * @see #getValor_asignacion()
	 * @generated
	 */
	void setValor_asignacion(String value);

	/**
	 * Returns the value of the '<em><b>Operador</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operador</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operador</em>' containment reference.
	 * @see #setOperador(operacion)
	 * @see diagramapseudocodigo.DiagramapseudocodigoPackage#getAsignacionNormal_Operador()
	 * @model containment="true" required="true"
	 * @generated
	 */
	operacion getOperador();

	/**
	 * Sets the value of the '{@link diagramapseudocodigo.AsignacionNormal#getOperador <em>Operador</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operador</em>' containment reference.
	 * @see #getOperador()
	 * @generated
	 */
	void setOperador(operacion value);

} // AsignacionNormal
