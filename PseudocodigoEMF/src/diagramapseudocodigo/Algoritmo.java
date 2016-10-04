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
 *   <li>{@link diagramapseudocodigo.Algoritmo#getInicio <em>Inicio</em>}</li>
 *   <li>{@link diagramapseudocodigo.Algoritmo#getSubprocesos <em>Subprocesos</em>}</li>
 *   <li>{@link diagramapseudocodigo.Algoritmo#getNombre <em>Nombre</em>}</li>
 *   <li>{@link diagramapseudocodigo.Algoritmo#getConstantes <em>Constantes</em>}</li>
 *   <li>{@link diagramapseudocodigo.Algoritmo#getComplejos <em>Complejos</em>}</li>
 *   <li>{@link diagramapseudocodigo.Algoritmo#getComentarios <em>Comentarios</em>}</li>
 *   <li>{@link diagramapseudocodigo.Algoritmo#getGlobales <em>Globales</em>}</li>
 *   <li>{@link diagramapseudocodigo.Algoritmo#getImportaciones <em>Importaciones</em>}</li>
 * </ul>
 *
 * @see diagramapseudocodigo.DiagramapseudocodigoPackage#getAlgoritmo()
 * @model
 * @generated
 */
public interface Algoritmo extends Codigo {
	/**
	 * Returns the value of the '<em><b>Inicio</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inicio</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inicio</em>' containment reference.
	 * @see #setInicio(Inicio)
	 * @see diagramapseudocodigo.DiagramapseudocodigoPackage#getAlgoritmo_Inicio()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Inicio getInicio();

	/**
	 * Sets the value of the '{@link diagramapseudocodigo.Algoritmo#getInicio <em>Inicio</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inicio</em>' containment reference.
	 * @see #getInicio()
	 * @generated
	 */
	void setInicio(Inicio value);

	/**
	 * Returns the value of the '<em><b>Subprocesos</b></em>' containment reference list.
	 * The list contents are of type {@link diagramapseudocodigo.Subproceso}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subprocesos</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subprocesos</em>' containment reference list.
	 * @see diagramapseudocodigo.DiagramapseudocodigoPackage#getAlgoritmo_Subprocesos()
	 * @model containment="true"
	 * @generated
	 */
	EList<Subproceso> getSubprocesos();

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
	 * The list contents are of type {@link diagramapseudocodigo.Constante}.
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
	EList<Constante> getConstantes();

	/**
	 * Returns the value of the '<em><b>Complejos</b></em>' containment reference list.
	 * The list contents are of type {@link diagramapseudocodigo.TipoComplejo}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Complejos</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Complejos</em>' containment reference list.
	 * @see diagramapseudocodigo.DiagramapseudocodigoPackage#getAlgoritmo_Complejos()
	 * @model containment="true"
	 * @generated
	 */
	EList<TipoComplejo> getComplejos();

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
	 * Returns the value of the '<em><b>Globales</b></em>' containment reference list.
	 * The list contents are of type {@link diagramapseudocodigo.Declaracion}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Globales</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Globales</em>' containment reference list.
	 * @see diagramapseudocodigo.DiagramapseudocodigoPackage#getAlgoritmo_Globales()
	 * @model containment="true"
	 * @generated
	 */
	EList<Declaracion> getGlobales();

	/**
	 * Returns the value of the '<em><b>Importaciones</b></em>' reference list.
	 * The list contents are of type {@link diagramapseudocodigo.Modulo}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Importaciones</em>' reference list isn't clear,
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
