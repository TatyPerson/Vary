/**
 */
package diagramapseudocodigo;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Matriz</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link diagramapseudocodigo.Matriz#getNombre <em>Nombre</em>}</li>
 *   <li>{@link diagramapseudocodigo.Matriz#getValor <em>Valor</em>}</li>
 *   <li>{@link diagramapseudocodigo.Matriz#getTipo <em>Tipo</em>}</li>
 * </ul>
 * </p>
 *
 * @see diagramapseudocodigo.DiagramapseudocodigoPackage#getMatriz()
 * @model
 * @generated
 */
public interface Matriz extends TipoComplejo {
	/**
	 * Returns the value of the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nombre</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre</em>' attribute.
	 * @see #setNombre(String)
	 * @see diagramapseudocodigo.DiagramapseudocodigoPackage#getMatriz_Nombre()
	 * @model required="true"
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link diagramapseudocodigo.Matriz#getNombre <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre</em>' attribute.
	 * @see #getNombre()
	 * @generated
	 */
	void setNombre(String value);

	/**
	 * Returns the value of the '<em><b>Valor</b></em>' containment reference list.
	 * The list contents are of type {@link diagramapseudocodigo.operacion}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Valor</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valor</em>' containment reference list.
	 * @see diagramapseudocodigo.DiagramapseudocodigoPackage#getMatriz_Valor()
	 * @model containment="true" upper="2"
	 * @generated
	 */
	EList<operacion> getValor();

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
	 * @see diagramapseudocodigo.DiagramapseudocodigoPackage#getMatriz_Tipo()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Tipo getTipo();

	/**
	 * Sets the value of the '{@link diagramapseudocodigo.Matriz#getTipo <em>Tipo</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tipo</em>' containment reference.
	 * @see #getTipo()
	 * @generated
	 */
	void setTipo(Tipo value);

} // Matriz
