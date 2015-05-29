/**
 */
package diagramapseudocodigo;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bloque</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link diagramapseudocodigo.Bloque#getValor <em>Valor</em>}</li>
 *   <li>{@link diagramapseudocodigo.Bloque#getSentencias <em>Sentencias</em>}</li>
 * </ul>
 * </p>
 *
 * @see diagramapseudocodigo.DiagramapseudocodigoPackage#getBloque()
 * @model abstract="true"
 * @generated
 */
public interface Bloque extends Sentencias {
	/**
	 * Returns the value of the '<em><b>Valor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Valor</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valor</em>' containment reference.
	 * @see #setValor(operacion)
	 * @see diagramapseudocodigo.DiagramapseudocodigoPackage#getBloque_Valor()
	 * @model containment="true" required="true"
	 * @generated
	 */
	operacion getValor();

	/**
	 * Sets the value of the '{@link diagramapseudocodigo.Bloque#getValor <em>Valor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valor</em>' containment reference.
	 * @see #getValor()
	 * @generated
	 */
	void setValor(operacion value);

	/**
	 * Returns the value of the '<em><b>Sentencias</b></em>' containment reference list.
	 * The list contents are of type {@link diagramapseudocodigo.Sentencias}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sentencias</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sentencias</em>' containment reference list.
	 * @see diagramapseudocodigo.DiagramapseudocodigoPackage#getBloque_Sentencias()
	 * @model containment="true"
	 * @generated
	 */
	EList<Sentencias> getSentencias();

} // Bloque
