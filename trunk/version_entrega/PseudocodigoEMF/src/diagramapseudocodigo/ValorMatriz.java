/**
 */
package diagramapseudocodigo;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Valor Matriz</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link diagramapseudocodigo.ValorMatriz#getNombre_matriz <em>Nombre matriz</em>}</li>
 *   <li>{@link diagramapseudocodigo.ValorMatriz#getCampo <em>Campo</em>}</li>
 *   <li>{@link diagramapseudocodigo.ValorMatriz#getPrimerIndice <em>Primer Indice</em>}</li>
 *   <li>{@link diagramapseudocodigo.ValorMatriz#getSegundoIndice <em>Segundo Indice</em>}</li>
 * </ul>
 * </p>
 *
 * @see diagramapseudocodigo.DiagramapseudocodigoPackage#getValorMatriz()
 * @model
 * @generated
 */
public interface ValorMatriz extends ValorComplejo {
	/**
	 * Returns the value of the '<em><b>Nombre matriz</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nombre matriz</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre matriz</em>' attribute.
	 * @see #setNombre_matriz(String)
	 * @see diagramapseudocodigo.DiagramapseudocodigoPackage#getValorMatriz_Nombre_matriz()
	 * @model required="true"
	 * @generated
	 */
	String getNombre_matriz();

	/**
	 * Sets the value of the '{@link diagramapseudocodigo.ValorMatriz#getNombre_matriz <em>Nombre matriz</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre matriz</em>' attribute.
	 * @see #getNombre_matriz()
	 * @generated
	 */
	void setNombre_matriz(String value);

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
	 * @see diagramapseudocodigo.DiagramapseudocodigoPackage#getValorMatriz_Campo()
	 * @model containment="true"
	 * @generated
	 */
	EList<CampoRegistro> getCampo();

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
	 * @see diagramapseudocodigo.DiagramapseudocodigoPackage#getValorMatriz_PrimerIndice()
	 * @model containment="true" required="true"
	 * @generated
	 */
	operacion getPrimerIndice();

	/**
	 * Sets the value of the '{@link diagramapseudocodigo.ValorMatriz#getPrimerIndice <em>Primer Indice</em>}' containment reference.
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
	 * @see diagramapseudocodigo.DiagramapseudocodigoPackage#getValorMatriz_SegundoIndice()
	 * @model containment="true" required="true"
	 * @generated
	 */
	operacion getSegundoIndice();

	/**
	 * Sets the value of the '{@link diagramapseudocodigo.ValorMatriz#getSegundoIndice <em>Segundo Indice</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Segundo Indice</em>' containment reference.
	 * @see #getSegundoIndice()
	 * @generated
	 */
	void setSegundoIndice(operacion value);

} // ValorMatriz
