/**
 */
package diagramapseudocodigo;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Escribir</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link diagramapseudocodigo.Escribir#getOperador <em>Operador</em>}</li>
 * </ul>
 *
 * @see diagramapseudocodigo.DiagramapseudocodigoPackage#getEscribir()
 * @model
 * @generated
 */
public interface Escribir extends Sentencia {
	/**
	 * Returns the value of the '<em><b>Operador</b></em>' containment reference list.
	 * The list contents are of type {@link diagramapseudocodigo.Operacion}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operador</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operador</em>' containment reference list.
	 * @see diagramapseudocodigo.DiagramapseudocodigoPackage#getEscribir_Operador()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Operacion> getOperador();

} // Escribir
