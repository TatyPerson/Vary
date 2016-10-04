/**
 */
package diagramapseudocodigo.impl;

import diagramapseudocodigo.Caso;
import diagramapseudocodigo.Devolver;
import diagramapseudocodigo.DiagramapseudocodigoPackage;
import diagramapseudocodigo.Segun;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Segun</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link diagramapseudocodigo.impl.SegunImpl#getCasos <em>Casos</em>}</li>
 *   <li>{@link diagramapseudocodigo.impl.SegunImpl#getDevuelve <em>Devuelve</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SegunImpl extends BloqueImpl implements Segun {
	/**
	 * The cached value of the '{@link #getCasos() <em>Casos</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCasos()
	 * @generated
	 * @ordered
	 */
	protected EList<Caso> casos;

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
	public SegunImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DiagramapseudocodigoPackage.Literals.SEGUN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Caso> getCasos() {
		if (casos == null) {
			casos = new EObjectContainmentEList<Caso>(Caso.class, this, DiagramapseudocodigoPackage.SEGUN__CASOS);
		}
		return casos;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DiagramapseudocodigoPackage.SEGUN__DEVUELVE, oldDevuelve, newDevuelve);
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
				msgs = ((InternalEObject)devuelve).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DiagramapseudocodigoPackage.SEGUN__DEVUELVE, null, msgs);
			if (newDevuelve != null)
				msgs = ((InternalEObject)newDevuelve).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DiagramapseudocodigoPackage.SEGUN__DEVUELVE, null, msgs);
			msgs = basicSetDevuelve(newDevuelve, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiagramapseudocodigoPackage.SEGUN__DEVUELVE, newDevuelve, newDevuelve));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DiagramapseudocodigoPackage.SEGUN__CASOS:
				return ((InternalEList<?>)getCasos()).basicRemove(otherEnd, msgs);
			case DiagramapseudocodigoPackage.SEGUN__DEVUELVE:
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
			case DiagramapseudocodigoPackage.SEGUN__CASOS:
				return getCasos();
			case DiagramapseudocodigoPackage.SEGUN__DEVUELVE:
				return getDevuelve();
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
			case DiagramapseudocodigoPackage.SEGUN__CASOS:
				getCasos().clear();
				getCasos().addAll((Collection<? extends Caso>)newValue);
				return;
			case DiagramapseudocodigoPackage.SEGUN__DEVUELVE:
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
			case DiagramapseudocodigoPackage.SEGUN__CASOS:
				getCasos().clear();
				return;
			case DiagramapseudocodigoPackage.SEGUN__DEVUELVE:
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
			case DiagramapseudocodigoPackage.SEGUN__CASOS:
				return casos != null && !casos.isEmpty();
			case DiagramapseudocodigoPackage.SEGUN__DEVUELVE:
				return devuelve != null;
		}
		return super.eIsSet(featureID);
	}

} //SegunImpl
