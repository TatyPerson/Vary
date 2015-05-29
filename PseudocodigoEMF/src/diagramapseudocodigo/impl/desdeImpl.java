/**
 */
package diagramapseudocodigo.impl;

import diagramapseudocodigo.AsignacionNormal;
import diagramapseudocodigo.DiagramapseudocodigoPackage;
import diagramapseudocodigo.desde;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>desde</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link diagramapseudocodigo.impl.desdeImpl#getAsignacion <em>Asignacion</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class desdeImpl extends BloqueImpl implements desde {
	/**
	 * The cached value of the '{@link #getAsignacion() <em>Asignacion</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAsignacion()
	 * @generated
	 * @ordered
	 */
	protected AsignacionNormal asignacion;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public desdeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DiagramapseudocodigoPackage.Literals.DESDE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AsignacionNormal getAsignacion() {
		return asignacion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAsignacion(AsignacionNormal newAsignacion, NotificationChain msgs) {
		AsignacionNormal oldAsignacion = asignacion;
		asignacion = newAsignacion;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DiagramapseudocodigoPackage.DESDE__ASIGNACION, oldAsignacion, newAsignacion);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAsignacion(AsignacionNormal newAsignacion) {
		if (newAsignacion != asignacion) {
			NotificationChain msgs = null;
			if (asignacion != null)
				msgs = ((InternalEObject)asignacion).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DiagramapseudocodigoPackage.DESDE__ASIGNACION, null, msgs);
			if (newAsignacion != null)
				msgs = ((InternalEObject)newAsignacion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DiagramapseudocodigoPackage.DESDE__ASIGNACION, null, msgs);
			msgs = basicSetAsignacion(newAsignacion, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiagramapseudocodigoPackage.DESDE__ASIGNACION, newAsignacion, newAsignacion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DiagramapseudocodigoPackage.DESDE__ASIGNACION:
				return basicSetAsignacion(null, msgs);
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
			case DiagramapseudocodigoPackage.DESDE__ASIGNACION:
				return getAsignacion();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DiagramapseudocodigoPackage.DESDE__ASIGNACION:
				setAsignacion((AsignacionNormal)newValue);
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
			case DiagramapseudocodigoPackage.DESDE__ASIGNACION:
				setAsignacion((AsignacionNormal)null);
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
			case DiagramapseudocodigoPackage.DESDE__ASIGNACION:
				return asignacion != null;
		}
		return super.eIsSet(featureID);
	}

} //desdeImpl
