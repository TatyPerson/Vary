/**
 */
package diagramapseudocodigo;

import org.eclipse.emf.common.util.EList;




/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Internas</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link diagramapseudocodigo.Internas#getNombre <em>Nombre</em>}</li>
 *   <li>{@link diagramapseudocodigo.Internas#getOperadores <em>Operadores</em>}</li>
 * </ul>
 * </p>
 *
 * @see diagramapseudocodigo.DiagramapseudocodigoPackage#getInternas()
 * @model
 * @generated
 */
public interface Internas extends valor, operacion {
	/**
	 * Returns the value of the '<em><b>Nombre</b></em>' attribute.
	 * The literals are from the enumeration {@link diagramapseudocodigo.NombreInterna}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nombre</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre</em>' attribute.
	 * @see diagramapseudocodigo.NombreInterna
	 * @see #setNombre(NombreInterna)
	 * @see diagramapseudocodigo.DiagramapseudocodigoPackage#getInternas_Nombre()
	 * @model
	 * @generated
	 */
	NombreInterna getNombre();

	/**
	 * Sets the value of the '{@link diagramapseudocodigo.Internas#getNombre <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre</em>' attribute.
	 * @see diagramapseudocodigo.NombreInterna
	 * @see #getNombre()
	 * @generated
	 */
	void setNombre(NombreInterna value);

	/**
	 * Returns the value of the '<em><b>Operadores</b></em>' containment reference list.
	 * The list contents are of type {@link diagramapseudocodigo.operacion}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operadores</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operadores</em>' containment reference list.
	 * @see diagramapseudocodigo.DiagramapseudocodigoPackage#getInternas_Operadores()
	 * @model containment="true"
	 * @generated
	 */
	EList<operacion> getOperadores();

} // Internas
