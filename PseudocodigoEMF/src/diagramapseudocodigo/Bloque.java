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
 * </p>
 * <ul>
 *   <li>{@link diagramapseudocodigo.Bloque#getCondicion <em>Condicion</em>}</li>
 *   <li>{@link diagramapseudocodigo.Bloque#getSentencias <em>Sentencias</em>}</li>
 * </ul>
 *
 * @see diagramapseudocodigo.DiagramapseudocodigoPackage#getBloque()
 * @model abstract="true"
 * @generated
 */
public interface Bloque extends Sentencia {
	/**
	 * Returns the value of the '<em><b>Condicion</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condicion</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condicion</em>' containment reference.
	 * @see #setCondicion(Operacion)
	 * @see diagramapseudocodigo.DiagramapseudocodigoPackage#getBloque_Condicion()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Operacion getCondicion();

	/**
	 * Sets the value of the '{@link diagramapseudocodigo.Bloque#getCondicion <em>Condicion</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condicion</em>' containment reference.
	 * @see #getCondicion()
	 * @generated
	 */
	void setCondicion(Operacion value);

	/**
	 * Returns the value of the '<em><b>Sentencias</b></em>' containment reference list.
	 * The list contents are of type {@link diagramapseudocodigo.Sentencia}.
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
	EList<Sentencia> getSentencias();

} // Bloque
