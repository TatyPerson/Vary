/**
 */
package diagramapseudocodigo;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>incremento</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link diagramapseudocodigo.incremento#getNombre <em>Nombre</em>}</li>
 *   <li>{@link diagramapseudocodigo.incremento#getSsigno <em>Ssigno</em>}</li>
 * </ul>
 * </p>
 *
 * @see diagramapseudocodigo.DiagramapseudocodigoPackage#getincremento()
 * @model
 * @generated
 */
public interface incremento extends Sentencias {
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
	 * @see diagramapseudocodigo.DiagramapseudocodigoPackage#getincremento_Nombre()
	 * @model required="true"
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link diagramapseudocodigo.incremento#getNombre <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre</em>' attribute.
	 * @see #getNombre()
	 * @generated
	 */
	void setNombre(String value);

	/**
	 * Returns the value of the '<em><b>Ssigno</b></em>' attribute.
	 * The literals are from the enumeration {@link diagramapseudocodigo.inc}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ssigno</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ssigno</em>' attribute.
	 * @see diagramapseudocodigo.inc
	 * @see #setSsigno(inc)
	 * @see diagramapseudocodigo.DiagramapseudocodigoPackage#getincremento_Ssigno()
	 * @model required="true"
	 * @generated
	 */
	inc getSsigno();

	/**
	 * Sets the value of the '{@link diagramapseudocodigo.incremento#getSsigno <em>Ssigno</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ssigno</em>' attribute.
	 * @see diagramapseudocodigo.inc
	 * @see #getSsigno()
	 * @generated
	 */
	void setSsigno(inc value);

} // incremento
