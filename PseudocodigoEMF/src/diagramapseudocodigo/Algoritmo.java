/**
 */
package diagramapseudocodigo;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Algoritmo</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link diagramapseudocodigo.Algoritmo#getTiene <em>Tiene</em>}</li>
 *   <li>{@link diagramapseudocodigo.Algoritmo#getFuncion <em>Funcion</em>}</li>
 *   <li>{@link diagramapseudocodigo.Algoritmo#getNombre <em>Nombre</em>}</li>
 *   <li>{@link diagramapseudocodigo.Algoritmo#getConstantes <em>Constantes</em>}</li>
 *   <li>{@link diagramapseudocodigo.Algoritmo#getTipocomplejo <em>Tipocomplejo</em>}</li>
 *   <li>{@link diagramapseudocodigo.Algoritmo#getComentarios <em>Comentarios</em>}</li>
 *   <li>{@link diagramapseudocodigo.Algoritmo#getGlobal <em>Global</em>}</li>
 *   <li>{@link diagramapseudocodigo.Algoritmo#getImportaciones <em>Importaciones</em>}</li>
 * </ul>
 *
 * @see diagramapseudocodigo.DiagramapseudocodigoPackage#getAlgoritmo()
 * @model
 * @generated
 */
public interface Algoritmo extends Codigo {
	/**
	 * Returns the value of the '<em><b>Tiene</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tiene</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tiene</em>' containment reference.
	 * @see #setTiene(Inicio)
	 * @see diagramapseudocodigo.DiagramapseudocodigoPackage#getAlgoritmo_Tiene()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Inicio getTiene();

	/**
	 * Sets the value of the '{@link diagramapseudocodigo.Algoritmo#getTiene <em>Tiene</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tiene</em>' containment reference.
	 * @see #getTiene()
	 * @generated
	 */
	void setTiene(Inicio value);

	/**
	 * Returns the value of the '<em><b>Funcion</b></em>' containment reference list.
	 * The list contents are of type {@link diagramapseudocodigo.Subproceso}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Funcion</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Funcion</em>' containment reference list.
	 * @see diagramapseudocodigo.DiagramapseudocodigoPackage#getAlgoritmo_Funcion()
	 * @model containment="true"
	 * @generated
	 */
	EList<Subproceso> getFuncion();

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
	 * @see diagramapseudocodigo.DiagramapseudocodigoPackage#getAlgoritmo_Nombre()
	 * @model
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link diagramapseudocodigo.Algoritmo#getNombre <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre</em>' attribute.
	 * @see #getNombre()
	 * @generated
	 */
	void setNombre(String value);

	/**
	 * Returns the value of the '<em><b>Constantes</b></em>' containment reference list.
	 * The list contents are of type {@link diagramapseudocodigo.Constantes}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constantes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constantes</em>' containment reference list.
	 * @see diagramapseudocodigo.DiagramapseudocodigoPackage#getAlgoritmo_Constantes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Constantes> getConstantes();

	/**
	 * Returns the value of the '<em><b>Tipocomplejo</b></em>' containment reference list.
	 * The list contents are of type {@link diagramapseudocodigo.TipoComplejo}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tipocomplejo</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tipocomplejo</em>' containment reference list.
	 * @see diagramapseudocodigo.DiagramapseudocodigoPackage#getAlgoritmo_Tipocomplejo()
	 * @model containment="true"
	 * @generated
	 */
	EList<TipoComplejo> getTipocomplejo();

	/**
	 * Returns the value of the '<em><b>Comentarios</b></em>' containment reference list.
	 * The list contents are of type {@link diagramapseudocodigo.Comentario}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comentarios</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comentarios</em>' containment reference list.
	 * @see diagramapseudocodigo.DiagramapseudocodigoPackage#getAlgoritmo_Comentarios()
	 * @model containment="true"
	 * @generated
	 */
	EList<Comentario> getComentarios();

	/**
	 * Returns the value of the '<em><b>Global</b></em>' containment reference list.
	 * The list contents are of type {@link diagramapseudocodigo.Declaracion}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Global</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Global</em>' containment reference list.
	 * @see diagramapseudocodigo.DiagramapseudocodigoPackage#getAlgoritmo_Global()
	 * @model containment="true"
	 * @generated
	 */
	EList<Declaracion> getGlobal();

	/**
	 * Returns the value of the '<em><b>Importaciones</b></em>' reference list.
	 * The list contents are of type {@link diagramapseudocodigo.Modulo}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Importaciones</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Importaciones</em>' reference list.
	 * @see diagramapseudocodigo.DiagramapseudocodigoPackage#getAlgoritmo_Importaciones()
	 * @model
	 * @generated
	 */
	EList<Modulo> getImportaciones();

} // Algoritmo
