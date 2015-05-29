/**
 */
package diagramapseudocodigo.impl;

import diagramapseudocodigo.Devolver;
import diagramapseudocodigo.DiagramapseudocodigoPackage;
import diagramapseudocodigo.Si;
import diagramapseudocodigo.Sino;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Si</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link diagramapseudocodigo.impl.SiImpl#getSino <em>Sino</em>}</li>
 *   <li>{@link diagramapseudocodigo.impl.SiImpl#getDevuelve <em>Devuelve</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SiImpl extends BloqueImpl implements Si {
	/**
	 * The cached value of the '{@link #getSino() <em>Sino</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSino()
	 * @generated
	 * @ordered
	 */
	protected Sino sino;

	/**
	 * The cached value of the '{@link #getDevuelve() <em>Devuelve</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDevuelve()
	 * @generated
	 * @ordered
	 */
	protected Devolver devuelve;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SiImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DiagramapseudocodigoPackage.Literals.SI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sino getSino() {
		return sino;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSino(Sino newSino, NotificationChain msgs) {
		Sino oldSino = sino;
		sino = newSino;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DiagramapseudocodigoPackage.SI__SINO, oldSino, newSino);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSino(Sino newSino) {
		if (newSino != sino) {
			NotificationChain msgs = null;
			if (sino != null)
				msgs = ((InternalEObject)sino).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DiagramapseudocodigoPackage.SI__SINO, null, msgs);
			if (newSino != null)
				msgs = ((InternalEObject)newSino).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DiagramapseudocodigoPackage.SI__SINO, null, msgs);
			msgs = basicSetSino(newSino, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiagramapseudocodigoPackage.SI__SINO, newSino, newSino));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Devolver getDevuelve() {
		return devuelve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDevuelve(Devolver newDevuelve, NotificationChain msgs) {
		Devolver oldDevuelve = devuelve;
		devuelve = newDevuelve;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DiagramapseudocodigoPackage.SI__DEVUELVE, oldDevuelve, newDevuelve);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDevuelve(Devolver newDevuelve) {
		if (newDevuelve != devuelve) {
			NotificationChain msgs = null;
			if (devuelve != null)
				msgs = ((InternalEObject)devuelve).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DiagramapseudocodigoPackage.SI__DEVUELVE, null, msgs);
			if (newDevuelve != null)
				msgs = ((InternalEObject)newDevuelve).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DiagramapseudocodigoPackage.SI__DEVUELVE, null, msgs);
			msgs = basicSetDevuelve(newDevuelve, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiagramapseudocodigoPackage.SI__DEVUELVE, newDevuelve, newDevuelve));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DiagramapseudocodigoPackage.SI__SINO:
				return basicSetSino(null, msgs);
			case DiagramapseudocodigoPackage.SI__DEVUELVE:
				return basicSetDevuelve(null, msgs);
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
			case DiagramapseudocodigoPackage.SI__SINO:
				return getSino();
			case DiagramapseudocodigoPackage.SI__DEVUELVE:
				return getDevuelve();
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
			case DiagramapseudocodigoPackage.SI__SINO:
				setSino((Sino)newValue);
				return;
			case DiagramapseudocodigoPackage.SI__DEVUELVE:
				setDevuelve((Devolver)newValue);
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
			case DiagramapseudocodigoPackage.SI__SINO:
				setSino((Sino)null);
				return;
			case DiagramapseudocodigoPackage.SI__DEVUELVE:
				setDevuelve((Devolver)null);
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
			case DiagramapseudocodigoPackage.SI__SINO:
				return sino != null;
			case DiagramapseudocodigoPackage.SI__DEVUELVE:
				return devuelve != null;
		}
		return super.eIsSet(featureID);
	}

} //SiImpl
