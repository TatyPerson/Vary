/**
 */
package diagramapseudocodigo;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parametro</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link diagramapseudocodigo.Parametro#getVariable <em>Variable</em>}</li>
 *   <li>{@link diagramapseudocodigo.Parametro#getPaso <em>Paso</em>}</li>
 *   <li>{@link diagramapseudocodigo.Parametro#getTipo <em>Tipo</em>}</li>
 * </ul>
 *
 * @see diagramapseudocodigo.DiagramapseudocodigoPackage#getParametro()
 * @model
 * @generated
 */
public interface Parametro extends EObject {
	/**
	 * Returns the value of the '<em><b>Variable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variable</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable</em>' containment reference.
	 * @see #setVariable(Variable)
	 * @see diagramapseudocodigo.DiagramapseudocodigoPackage#getParametro_Variable()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Variable getVariable();

	/**
	 * Sets the value of the '{@link diagramapseudocodigo.Parametro#getVariable <em>Variable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable</em>' containment reference.
	 * @see #getVariable()
	 * @generated
	 */
	void setVariable(Variable value);

	/**
	 * Returns the value of the '<em><b>Paso</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Paso</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Paso</em>' attribute.
	 * @see #setPaso(String)
	 * @see diagramapseudocodigo.DiagramapseudocodigoPackage#getParametro_Paso()
	 * @model required="true"
	 * @generated
	 */
	String getPaso();

	/**
	 * Sets the value of the '{@link diagramapseudocodigo.Parametro#getPaso <em>Paso</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Paso</em>' attribute.
	 * @see #getPaso()
	 * @generated
	 */
	void setPaso(String value);

	/**
	 * Returns the value of the '<em><b>Tipo</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tipo</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tipo</em>' containment reference.
	 * @see #setTipo(Tipo)
	 * @see diagramapseudocodigo.DiagramapseudocodigoPackage#getParametro_Tipo()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Tipo getTipo();

	/**
	 * Sets the value of the '{@link diagramapseudocodigo.Parametro#getTipo <em>Tipo</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tipo</em>' containment reference.
	 * @see #getTipo()
	 * @generated
	 */
	void setTipo(Tipo value);

} // Parametro
