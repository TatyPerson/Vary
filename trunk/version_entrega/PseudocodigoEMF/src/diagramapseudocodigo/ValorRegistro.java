/**
 */
package diagramapseudocodigo;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Valor Registro</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link diagramapseudocodigo.ValorRegistro#getNombre_registro <em>Nombre registro</em>}</li>
 *   <li>{@link diagramapseudocodigo.ValorRegistro#getCampo <em>Campo</em>}</li>
 * </ul>
 * </p>
 *
 * @see diagramapseudocodigo.DiagramapseudocodigoPackage#getValorRegistro()
 * @model
 * @generated
 */
public interface ValorRegistro extends ValorComplejo {
	/**
	 * Returns the value of the '<em><b>Nombre registro</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nombre registro</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre registro</em>' attribute.
	 * @see #setNombre_registro(String)
	 * @see diagramapseudocodigo.DiagramapseudocodigoPackage#getValorRegistro_Nombre_registro()
	 * @model required="true"
	 * @generated
	 */
	String getNombre_registro();

	/**
	 * Sets the value of the '{@link diagramapseudocodigo.ValorRegistro#getNombre_registro <em>Nombre registro</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre registro</em>' attribute.
	 * @see #getNombre_registro()
	 * @generated
	 */
	void setNombre_registro(String value);

	/**
	 * Returns the value of the '<em><b>Campo</b></em>' containment reference list.
	 * The list contents are of type {@link diagramapseudocodigo.CampoRegistro}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Campo</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Campo</em>' containment reference list.
	 * @see diagramapseudocodigo.DiagramapseudocodigoPackage#getValorRegistro_Campo()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<CampoRegistro> getCampo();

} // ValorRegistro
