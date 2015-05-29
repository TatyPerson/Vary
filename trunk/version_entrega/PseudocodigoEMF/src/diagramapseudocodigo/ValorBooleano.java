/**
 */
package diagramapseudocodigo;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Valor Booleano</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link diagramapseudocodigo.ValorBooleano#getValor <em>Valor</em>}</li>
 * </ul>
 * </p>
 *
 * @see diagramapseudocodigo.DiagramapseudocodigoPackage#getValorBooleano()
 * @model
 * @generated
 */
public interface ValorBooleano extends Operador, operacion {
	/**
	 * Returns the value of the '<em><b>Valor</b></em>' attribute.
	 * The literals are from the enumeration {@link diagramapseudocodigo.booleano}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Valor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valor</em>' attribute.
	 * @see diagramapseudocodigo.booleano
	 * @see #setValor(booleano)
	 * @see diagramapseudocodigo.DiagramapseudocodigoPackage#getValorBooleano_Valor()
	 * @model required="true"
	 * @generated
	 */
	booleano getValor();

	/**
	 * Sets the value of the '{@link diagramapseudocodigo.ValorBooleano#getValor <em>Valor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valor</em>' attribute.
	 * @see diagramapseudocodigo.booleano
	 * @see #getValor()
	 * @generated
	 */
	void setValor(booleano value);

} // ValorBooleano
