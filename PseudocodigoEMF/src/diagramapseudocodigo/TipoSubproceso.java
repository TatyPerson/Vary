/**
 */
package diagramapseudocodigo;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tipo Subproceso</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link diagramapseudocodigo.TipoSubproceso#getParametros <em>Parametros</em>}</li>
 * </ul>
 *
 * @see diagramapseudocodigo.DiagramapseudocodigoPackage#getTipoSubproceso()
 * @model
 * @generated
 */
public interface TipoSubproceso extends TipoComplejo {
	/**
	 * Returns the value of the '<em><b>Parametros</b></em>' containment reference list.
	 * The list contents are of type {@link diagramapseudocodigo.Parametro}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parametros</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parametros</em>' containment reference list.
	 * @see diagramapseudocodigo.DiagramapseudocodigoPackage#getTipoSubproceso_Parametros()
	 * @model containment="true"
	 * @generated
	 */
	EList<Parametro> getParametros();

} // TipoSubproceso
