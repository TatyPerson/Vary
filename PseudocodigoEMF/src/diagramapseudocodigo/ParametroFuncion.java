/**
 */
package diagramapseudocodigo;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parametro Funcion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link diagramapseudocodigo.ParametroFuncion#getVariable <em>Variable</em>}</li>
 *   <li>{@link diagramapseudocodigo.ParametroFuncion#getPaso <em>Paso</em>}</li>
 *   <li>{@link diagramapseudocodigo.ParametroFuncion#getTipo <em>Tipo</em>}</li>
 * </ul>
 * </p>
 *
 * @see diagramapseudocodigo.DiagramapseudocodigoPackage#getParametroFuncion()
 * @model
 * @generated
 */
public interface ParametroFuncion extends EObject {
	/**
	 * Returns the value of the '<em><b>Tipo</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tipo</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tipo</em>' containment reference.
	 * @see #setTipo(Tipo)
	 * @see diagramapseudocodigo.DiagramapseudocodigoPackage#getParametroFuncion_Tipo()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Tipo getTipo();

	/**
	 * Sets the value of the '{@link diagramapseudocodigo.ParametroFuncion#getTipo <em>Tipo</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tipo</em>' containment reference.
	 * @see #getTipo()
	 * @generated
	 */
	void setTipo(Tipo value);

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
	 * @see diagramapseudocodigo.DiagramapseudocodigoPackage#getParametroFuncion_Variable()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Variable getVariable();

	/**
	 * Sets the value of the '{@link diagramapseudocodigo.ParametroFuncion#getVariable <em>Variable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable</em>' containment reference.
	 * @see #getVariable()
	 * @generated
	 */
	void setVariable(Variable value);

	/**
	 * Returns the value of the '<em><b>Paso</b></em>' attribute.
	 * The literals are from the enumeration {@link diagramapseudocodigo.TipoPaso}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Paso</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Paso</em>' attribute.
	 * @see diagramapseudocodigo.TipoPaso
	 * @see #setPaso(TipoPaso)
	 * @see diagramapseudocodigo.DiagramapseudocodigoPackage#getParametroFuncion_Paso()
	 * @model required="true"
	 * @generated
	 */
	TipoPaso getPaso();

	/**
	 * Sets the value of the '{@link diagramapseudocodigo.ParametroFuncion#getPaso <em>Paso</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Paso</em>' attribute.
	 * @see diagramapseudocodigo.TipoPaso
	 * @see #getPaso()
	 * @generated
	 */
	void setPaso(TipoPaso value);

} // ParametroFuncion
