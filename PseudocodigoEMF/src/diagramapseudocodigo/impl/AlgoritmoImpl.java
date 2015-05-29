/**
 */
package diagramapseudocodigo.impl;

import diagramapseudocodigo.Algoritmo;
import diagramapseudocodigo.Comentario;
import diagramapseudocodigo.Constantes;
import diagramapseudocodigo.Declaracion;
import diagramapseudocodigo.DiagramapseudocodigoPackage;
import diagramapseudocodigo.Inicio;
import diagramapseudocodigo.Modulo;
import diagramapseudocodigo.Subproceso;
import diagramapseudocodigo.TipoComplejo;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Algoritmo</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link diagramapseudocodigo.impl.AlgoritmoImpl#getTiene <em>Tiene</em>}</li>
 *   <li>{@link diagramapseudocodigo.impl.AlgoritmoImpl#getFuncion <em>Funcion</em>}</li>
 *   <li>{@link diagramapseudocodigo.impl.AlgoritmoImpl#getNombre <em>Nombre</em>}</li>
 *   <li>{@link diagramapseudocodigo.impl.AlgoritmoImpl#getConstantes <em>Constantes</em>}</li>
 *   <li>{@link diagramapseudocodigo.impl.AlgoritmoImpl#getTipocomplejo <em>Tipocomplejo</em>}</li>
 *   <li>{@link diagramapseudocodigo.impl.AlgoritmoImpl#getComentarios <em>Comentarios</em>}</li>
 *   <li>{@link diagramapseudocodigo.impl.AlgoritmoImpl#getGlobal <em>Global</em>}</li>
 *   <li>{@link diagramapseudocodigo.impl.AlgoritmoImpl#getImportaciones <em>Importaciones</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AlgoritmoImpl extends CodigoImpl implements Algoritmo {
	/**
	 * The cached value of the '{@link #getTiene() <em>Tiene</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTiene()
	 * @generated
	 * @ordered
	 */
	protected Inicio tiene;

	/**
	 * The cached value of the '{@link #getFuncion() <em>Funcion</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFuncion()
	 * @generated
	 * @ordered
	 */
	protected EList<Subproceso> funcion;

	/**
	 * The default value of the '{@link #getNombre() <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombre()
	 * @generated
	 * @ordered
	 */
	protected static final String NOMBRE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNombre() <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombre()
	 * @generated
	 * @ordered
	 */
	protected String nombre = NOMBRE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getConstantes() <em>Constantes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstantes()
	 * @generated
	 * @ordered
	 */
	protected EList<Constantes> constantes;

	/**
	 * The cached value of the '{@link #getTipocomplejo() <em>Tipocomplejo</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTipocomplejo()
	 * @generated
	 * @ordered
	 */
	protected EList<TipoComplejo> tipocomplejo;

	/**
	 * The cached value of the '{@link #getComentarios() <em>Comentarios</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComentarios()
	 * @generated
	 * @ordered
	 */
	protected EList<Comentario> comentarios;

	/**
	 * The cached value of the '{@link #getGlobal() <em>Global</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlobal()
	 * @generated
	 * @ordered
	 */
	protected EList<Declaracion> global;

	/**
	 * The cached value of the '{@link #getImportaciones() <em>Importaciones</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportaciones()
	 * @generated
	 * @ordered
	 */
	protected EList<Modulo> importaciones;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlgoritmoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DiagramapseudocodigoPackage.Literals.ALGORITMO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Inicio getTiene() {
		return tiene;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTiene(Inicio newTiene, NotificationChain msgs) {
		Inicio oldTiene = tiene;
		tiene = newTiene;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DiagramapseudocodigoPackage.ALGORITMO__TIENE, oldTiene, newTiene);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTiene(Inicio newTiene) {
		if (newTiene != tiene) {
			NotificationChain msgs = null;
			if (tiene != null)
				msgs = ((InternalEObject)tiene).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DiagramapseudocodigoPackage.ALGORITMO__TIENE, null, msgs);
			if (newTiene != null)
				msgs = ((InternalEObject)newTiene).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DiagramapseudocodigoPackage.ALGORITMO__TIENE, null, msgs);
			msgs = basicSetTiene(newTiene, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiagramapseudocodigoPackage.ALGORITMO__TIENE, newTiene, newTiene));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Subproceso> getFuncion() {
		if (funcion == null) {
			funcion = new EObjectContainmentEList<Subproceso>(Subproceso.class, this, DiagramapseudocodigoPackage.ALGORITMO__FUNCION);
		}
		return funcion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombre(String newNombre) {
		String oldNombre = nombre;
		nombre = newNombre;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiagramapseudocodigoPackage.ALGORITMO__NOMBRE, oldNombre, nombre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Constantes> getConstantes() {
		if (constantes == null) {
			constantes = new EObjectContainmentEList<Constantes>(Constantes.class, this, DiagramapseudocodigoPackage.ALGORITMO__CONSTANTES);
		}
		return constantes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TipoComplejo> getTipocomplejo() {
		if (tipocomplejo == null) {
			tipocomplejo = new EObjectContainmentEList<TipoComplejo>(TipoComplejo.class, this, DiagramapseudocodigoPackage.ALGORITMO__TIPOCOMPLEJO);
		}
		return tipocomplejo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Comentario> getComentarios() {
		if (comentarios == null) {
			comentarios = new EObjectContainmentEList<Comentario>(Comentario.class, this, DiagramapseudocodigoPackage.ALGORITMO__COMENTARIOS);
		}
		return comentarios;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Declaracion> getGlobal() {
		if (global == null) {
			global = new EObjectContainmentEList<Declaracion>(Declaracion.class, this, DiagramapseudocodigoPackage.ALGORITMO__GLOBAL);
		}
		return global;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Modulo> getImportaciones() {
		if (importaciones == null) {
			importaciones = new EObjectResolvingEList<Modulo>(Modulo.class, this, DiagramapseudocodigoPackage.ALGORITMO__IMPORTACIONES);
		}
		return importaciones;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DiagramapseudocodigoPackage.ALGORITMO__TIENE:
				return basicSetTiene(null, msgs);
			case DiagramapseudocodigoPackage.ALGORITMO__FUNCION:
				return ((InternalEList<?>)getFuncion()).basicRemove(otherEnd, msgs);
			case DiagramapseudocodigoPackage.ALGORITMO__CONSTANTES:
				return ((InternalEList<?>)getConstantes()).basicRemove(otherEnd, msgs);
			case DiagramapseudocodigoPackage.ALGORITMO__TIPOCOMPLEJO:
				return ((InternalEList<?>)getTipocomplejo()).basicRemove(otherEnd, msgs);
			case DiagramapseudocodigoPackage.ALGORITMO__COMENTARIOS:
				return ((InternalEList<?>)getComentarios()).basicRemove(otherEnd, msgs);
			case DiagramapseudocodigoPackage.ALGORITMO__GLOBAL:
				return ((InternalEList<?>)getGlobal()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DiagramapseudocodigoPackage.ALGORITMO__TIENE:
				return getTiene();
			case DiagramapseudocodigoPackage.ALGORITMO__FUNCION:
				return getFuncion();
			case DiagramapseudocodigoPackage.ALGORITMO__NOMBRE:
				return getNombre();
			case DiagramapseudocodigoPackage.ALGORITMO__CONSTANTES:
				return getConstantes();
			case DiagramapseudocodigoPackage.ALGORITMO__TIPOCOMPLEJO:
				return getTipocomplejo();
			case DiagramapseudocodigoPackage.ALGORITMO__COMENTARIOS:
				return getComentarios();
			case DiagramapseudocodigoPackage.ALGORITMO__GLOBAL:
				return getGlobal();
			case DiagramapseudocodigoPackage.ALGORITMO__IMPORTACIONES:
				return getImportaciones();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DiagramapseudocodigoPackage.ALGORITMO__TIENE:
				setTiene((Inicio)newValue);
				return;
			case DiagramapseudocodigoPackage.ALGORITMO__FUNCION:
				getFuncion().clear();
				getFuncion().addAll((Collection<? extends Subproceso>)newValue);
				return;
			case DiagramapseudocodigoPackage.ALGORITMO__NOMBRE:
				setNombre((String)newValue);
				return;
			case DiagramapseudocodigoPackage.ALGORITMO__CONSTANTES:
				getConstantes().clear();
				getConstantes().addAll((Collection<? extends Constantes>)newValue);
				return;
			case DiagramapseudocodigoPackage.ALGORITMO__TIPOCOMPLEJO:
				getTipocomplejo().clear();
				getTipocomplejo().addAll((Collection<? extends TipoComplejo>)newValue);
				return;
			case DiagramapseudocodigoPackage.ALGORITMO__COMENTARIOS:
				getComentarios().clear();
				getComentarios().addAll((Collection<? extends Comentario>)newValue);
				return;
			case DiagramapseudocodigoPackage.ALGORITMO__GLOBAL:
				getGlobal().clear();
				getGlobal().addAll((Collection<? extends Declaracion>)newValue);
				return;
			case DiagramapseudocodigoPackage.ALGORITMO__IMPORTACIONES:
				getImportaciones().clear();
				getImportaciones().addAll((Collection<? extends Modulo>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case DiagramapseudocodigoPackage.ALGORITMO__TIENE:
				setTiene((Inicio)null);
				return;
			case DiagramapseudocodigoPackage.ALGORITMO__FUNCION:
				getFuncion().clear();
				return;
			case DiagramapseudocodigoPackage.ALGORITMO__NOMBRE:
				setNombre(NOMBRE_EDEFAULT);
				return;
			case DiagramapseudocodigoPackage.ALGORITMO__CONSTANTES:
				getConstantes().clear();
				return;
			case DiagramapseudocodigoPackage.ALGORITMO__TIPOCOMPLEJO:
				getTipocomplejo().clear();
				return;
			case DiagramapseudocodigoPackage.ALGORITMO__COMENTARIOS:
				getComentarios().clear();
				return;
			case DiagramapseudocodigoPackage.ALGORITMO__GLOBAL:
				getGlobal().clear();
				return;
			case DiagramapseudocodigoPackage.ALGORITMO__IMPORTACIONES:
				getImportaciones().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case DiagramapseudocodigoPackage.ALGORITMO__TIENE:
				return tiene != null;
			case DiagramapseudocodigoPackage.ALGORITMO__FUNCION:
				return funcion != null && !funcion.isEmpty();
			case DiagramapseudocodigoPackage.ALGORITMO__NOMBRE:
				return NOMBRE_EDEFAULT == null ? nombre != null : !NOMBRE_EDEFAULT.equals(nombre);
			case DiagramapseudocodigoPackage.ALGORITMO__CONSTANTES:
				return constantes != null && !constantes.isEmpty();
			case DiagramapseudocodigoPackage.ALGORITMO__TIPOCOMPLEJO:
				return tipocomplejo != null && !tipocomplejo.isEmpty();
			case DiagramapseudocodigoPackage.ALGORITMO__COMENTARIOS:
				return comentarios != null && !comentarios.isEmpty();
			case DiagramapseudocodigoPackage.ALGORITMO__GLOBAL:
				return global != null && !global.isEmpty();
			case DiagramapseudocodigoPackage.ALGORITMO__IMPORTACIONES:
				return importaciones != null && !importaciones.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (nombre: ");
		result.append(nombre);
		result.append(')');
		return result.toString();
	}

} //AlgoritmoImpl
