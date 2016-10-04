/**
 */
package diagramapseudocodigo.impl;

import diagramapseudocodigo.Declaracion;
import diagramapseudocodigo.DiagramapseudocodigoPackage;
import diagramapseudocodigo.Parametro;
import diagramapseudocodigo.Sentencia;
import diagramapseudocodigo.Subproceso;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Subproceso</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link diagramapseudocodigo.impl.SubprocesoImpl#getParametros <em>Parametros</em>}</li>
 *   <li>{@link diagramapseudocodigo.impl.SubprocesoImpl#getSentencias <em>Sentencias</em>}</li>
 *   <li>{@link diagramapseudocodigo.impl.SubprocesoImpl#getNombre <em>Nombre</em>}</li>
 *   <li>{@link diagramapseudocodigo.impl.SubprocesoImpl#getDeclaraciones <em>Declaraciones</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class SubprocesoImpl extends MinimalEObjectImpl.Container implements Subproceso {
	/**
	 * The cached value of the '{@link #getParametros() <em>Parametros</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParametros()
	 * @generated
	 * @ordered
	 */
	protected EList<Parametro> parametros;

	/**
	 * The cached value of the '{@link #getSentencias() <em>Sentencias</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSentencias()
	 * @generated
	 * @ordered
	 */
	protected EList<Sentencia> sentencias;

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
	 * The cached value of the '{@link #getDeclaraciones() <em>Declaraciones</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeclaraciones()
	 * @generated
	 * @ordered
	 */
	protected EList<Declaracion> declaraciones;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubprocesoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DiagramapseudocodigoPackage.Literals.SUBPROCESO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Parametro> getParametros() {
		if (parametros == null) {
			parametros = new EObjectContainmentEList<Parametro>(Parametro.class, this, DiagramapseudocodigoPackage.SUBPROCESO__PARAMETROS);
		}
		return parametros;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Sentencia> getSentencias() {
		if (sentencias == null) {
			sentencias = new EObjectContainmentEList<Sentencia>(Sentencia.class, this, DiagramapseudocodigoPackage.SUBPROCESO__SENTENCIAS);
		}
		return sentencias;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DiagramapseudocodigoPackage.SUBPROCESO__NOMBRE, oldNombre, nombre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Declaracion> getDeclaraciones() {
		if (declaraciones == null) {
			declaraciones = new EObjectContainmentEList<Declaracion>(Declaracion.class, this, DiagramapseudocodigoPackage.SUBPROCESO__DECLARACIONES);
		}
		return declaraciones;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DiagramapseudocodigoPackage.SUBPROCESO__PARAMETROS:
				return ((InternalEList<?>)getParametros()).basicRemove(otherEnd, msgs);
			case DiagramapseudocodigoPackage.SUBPROCESO__SENTENCIAS:
				return ((InternalEList<?>)getSentencias()).basicRemove(otherEnd, msgs);
			case DiagramapseudocodigoPackage.SUBPROCESO__DECLARACIONES:
				return ((InternalEList<?>)getDeclaraciones()).basicRemove(otherEnd, msgs);
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
			case DiagramapseudocodigoPackage.SUBPROCESO__PARAMETROS:
				return getParametros();
			case DiagramapseudocodigoPackage.SUBPROCESO__SENTENCIAS:
				return getSentencias();
			case DiagramapseudocodigoPackage.SUBPROCESO__NOMBRE:
				return getNombre();
			case DiagramapseudocodigoPackage.SUBPROCESO__DECLARACIONES:
				return getDeclaraciones();
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
			case DiagramapseudocodigoPackage.SUBPROCESO__PARAMETROS:
				getParametros().clear();
				getParametros().addAll((Collection<? extends Parametro>)newValue);
				return;
			case DiagramapseudocodigoPackage.SUBPROCESO__SENTENCIAS:
				getSentencias().clear();
				getSentencias().addAll((Collection<? extends Sentencia>)newValue);
				return;
			case DiagramapseudocodigoPackage.SUBPROCESO__NOMBRE:
				setNombre((String)newValue);
				return;
			case DiagramapseudocodigoPackage.SUBPROCESO__DECLARACIONES:
				getDeclaraciones().clear();
				getDeclaraciones().addAll((Collection<? extends Declaracion>)newValue);
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
			case DiagramapseudocodigoPackage.SUBPROCESO__PARAMETROS:
				getParametros().clear();
				return;
			case DiagramapseudocodigoPackage.SUBPROCESO__SENTENCIAS:
				getSentencias().clear();
				return;
			case DiagramapseudocodigoPackage.SUBPROCESO__NOMBRE:
				setNombre(NOMBRE_EDEFAULT);
				return;
			case DiagramapseudocodigoPackage.SUBPROCESO__DECLARACIONES:
				getDeclaraciones().clear();
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
			case DiagramapseudocodigoPackage.SUBPROCESO__PARAMETROS:
				return parametros != null && !parametros.isEmpty();
			case DiagramapseudocodigoPackage.SUBPROCESO__SENTENCIAS:
				return sentencias != null && !sentencias.isEmpty();
			case DiagramapseudocodigoPackage.SUBPROCESO__NOMBRE:
				return NOMBRE_EDEFAULT == null ? nombre != null : !NOMBRE_EDEFAULT.equals(nombre);
			case DiagramapseudocodigoPackage.SUBPROCESO__DECLARACIONES:
				return declaraciones != null && !declaraciones.isEmpty();
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

} //SubprocesoImpl
