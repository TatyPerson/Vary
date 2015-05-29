/**
 */
package diagramapseudocodigo;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Funcion Fichero Abrir</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link diagramapseudocodigo.FuncionFicheroAbrir#getModo <em>Modo</em>}</li>
 *   <li>{@link diagramapseudocodigo.FuncionFicheroAbrir#getVariable <em>Variable</em>}</li>
 * </ul>
 * </p>
 *
 * @see diagramapseudocodigo.DiagramapseudocodigoPackage#getFuncionFicheroAbrir()
 * @model
 * @generated
 */
public interface FuncionFicheroAbrir extends Sentencias {
	/**
	 * Returns the value of the '<em><b>Modo</b></em>' attribute.
	 * The literals are from the enumeration {@link diagramapseudocodigo.ModoApertura}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modo</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modo</em>' attribute.
	 * @see diagramapseudocodigo.ModoApertura
	 * @see #setModo(ModoApertura)
	 * @see diagramapseudocodigo.DiagramapseudocodigoPackage#getFuncionFicheroAbrir_Modo()
	 * @model required="true"
	 * @generated
	 */
	ModoApertura getModo();

	/**
	 * Sets the value of the '{@link diagramapseudocodigo.FuncionFicheroAbrir#getModo <em>Modo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modo</em>' attribute.
	 * @see diagramapseudocodigo.ModoApertura
	 * @see #getModo()
	 * @generated
	 */
	void setModo(ModoApertura value);

	/**
	 * Returns the value of the '<em><b>Variable</b></em>' containment reference list.
	 * The list contents are of type {@link diagramapseudocodigo.operacion}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variable</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable</em>' containment reference list.
	 * @see diagramapseudocodigo.DiagramapseudocodigoPackage#getFuncionFicheroAbrir_Variable()
	 * @model containment="true" lower="2" upper="2"
	 * @generated
	 */
	EList<operacion> getVariable();

} // FuncionFicheroAbrir
