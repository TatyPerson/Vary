/**
 */
package diagramapseudocodigo;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Campo Registro</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link diagramapseudocodigo.CampoRegistro#getNombre_campo <em>Nombre campo</em>}</li>
 *   <li>{@link diagramapseudocodigo.CampoRegistro#getEReference0 <em>EReference0</em>}</li>
 *   <li>{@link diagramapseudocodigo.CampoRegistro#getPrimerIndice <em>Primer Indice</em>}</li>
 *   <li>{@link diagramapseudocodigo.CampoRegistro#getSegundoIndice <em>Segundo Indice</em>}</li>
 * </ul>
 *
 * @see diagramapseudocodigo.DiagramapseudocodigoPackage#getCampoRegistro()
 * @model
 * @generated
 */
public interface CampoRegistro extends EObject {
	/**
	 * Returns the value of the '<em><b>Nombre campo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nombre campo</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre campo</em>' attribute.
	 * @see #setNombre_campo(String)
	 * @see diagramapseudocodigo.DiagramapseudocodigoPackage#getCampoRegistro_Nombre_campo()
	 * @model required="true"
	 * @generated
	 */
	String getNombre_campo();

	/**
	 * Sets the value of the '{@link diagramapseudocodigo.CampoRegistro#getNombre_campo <em>Nombre campo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre campo</em>' attribute.
	 * @see #getNombre_campo()
	 * @generated
	 */
	void setNombre_campo(String value);

	/**
	 * Returns the value of the '<em><b>EReference0</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EReference0</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EReference0</em>' reference.
	 * @see #setEReference0(CampoRegistro)
	 * @see diagramapseudocodigo.DiagramapseudocodigoPackage#getCampoRegistro_EReference0()
	 * @model
	 * @generated
	 */
	CampoRegistro getEReference0();

	/**
	 * Sets the value of the '{@link diagramapseudocodigo.CampoRegistro#getEReference0 <em>EReference0</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EReference0</em>' reference.
	 * @see #getEReference0()
	 * @generated
	 */
	void setEReference0(CampoRegistro value);

	/**
	 * Returns the value of the '<em><b>Primer Indice</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Primer Indice</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Primer Indice</em>' containment reference.
	 * @see #setPrimerIndice(operacion)
	 * @see diagramapseudocodigo.DiagramapseudocodigoPackage#getCampoRegistro_PrimerIndice()
	 * @model containment="true"
	 * @generated
	 */
	operacion getPrimerIndice();

	/**
	 * Sets the value of the '{@link diagramapseudocodigo.CampoRegistro#getPrimerIndice <em>Primer Indice</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Primer Indice</em>' containment reference.
	 * @see #getPrimerIndice()
	 * @generated
	 */
	void setPrimerIndice(operacion value);

	/**
	 * Returns the value of the '<em><b>Segundo Indice</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Segundo Indice</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Segundo Indice</em>' containment reference.
	 * @see #setSegundoIndice(operacion)
	 * @see diagramapseudocodigo.DiagramapseudocodigoPackage#getCampoRegistro_SegundoIndice()
	 * @model containment="true"
	 * @generated
	 */
	operacion getSegundoIndice();

	/**
	 * Sets the value of the '{@link diagramapseudocodigo.CampoRegistro#getSegundoIndice <em>Segundo Indice</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Segundo Indice</em>' containment reference.
	 * @see #getSegundoIndice()
	 * @generated
	 */
	void setSegundoIndice(operacion value);

} // CampoRegistro
