/**
 */
package diagramapseudocodigo;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Funcion Fichero Cerrar</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link diagramapseudocodigo.FuncionFicheroCerrar#getVariable <em>Variable</em>}</li>
 * </ul>
 *
 * @see diagramapseudocodigo.DiagramapseudocodigoPackage#getFuncionFicheroCerrar()
 * @model
 * @generated
 */
public interface FuncionFicheroCerrar extends Sentencia {
	/**
	 * Returns the value of the '<em><b>Variable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variable</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable</em>' containment reference.
	 * @see #setVariable(Operacion)
	 * @see diagramapseudocodigo.DiagramapseudocodigoPackage#getFuncionFicheroCerrar_Variable()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Operacion getVariable();

	/**
	 * Sets the value of the '{@link diagramapseudocodigo.FuncionFicheroCerrar#getVariable <em>Variable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable</em>' containment reference.
	 * @see #getVariable()
	 * @generated
	 */
	void setVariable(Operacion value);

} // FuncionFicheroCerrar
