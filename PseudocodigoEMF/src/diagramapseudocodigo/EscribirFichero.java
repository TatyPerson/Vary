/**
 */
package diagramapseudocodigo;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Escribir Fichero</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link diagramapseudocodigo.EscribirFichero#getOperador <em>Operador</em>}</li>
 * </ul>
 *
 * @see diagramapseudocodigo.DiagramapseudocodigoPackage#getEscribirFichero()
 * @model
 * @generated
 */
public interface EscribirFichero extends Sentencias {
	/**
	 * Returns the value of the '<em><b>Operador</b></em>' containment reference list.
	 * The list contents are of type {@link diagramapseudocodigo.operacion}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operador</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operador</em>' containment reference list.
	 * @see diagramapseudocodigo.DiagramapseudocodigoPackage#getEscribirFichero_Operador()
	 * @model containment="true" upper="2"
	 * @generated
	 */
	EList<operacion> getOperador();

} // EscribirFichero
