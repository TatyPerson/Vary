/**
 */
package diagramapseudocodigo.impl;

import diagramapseudocodigo.Bloque;
import diagramapseudocodigo.DiagramapseudocodigoPackage;
import diagramapseudocodigo.Operacion;
import diagramapseudocodigo.Sentencia;

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
 * An implementation of the model object '<em><b>Bloque</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link diagramapseudocodigo.impl.BloqueImpl#getCondicion <em>Condicion</em>}</li>
 *   <li>{@link diagramapseudocodigo.impl.BloqueImpl#getSentencias <em>Sentencias</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class BloqueImpl extends SentenciaImpl implements Bloque {
	/**
	 * The cached value of the '{@link #getCondicion() <em>Condicion</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondicion()
	 * @generated
	 * @ordered
	 */
	protected Operacion condicion;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BloqueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DiagramapseudocodigoPackage.Literals.BLOQUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operacion getCondicion() {
		return condicion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCondicion(Operacion newCondicion, NotificationChain msgs) {
		Operacion oldCondicion = condicion;
		condicion = newCondicion;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DiagramapseudocodigoPackage.BLOQUE__CONDICION, oldCondicion, newCondicion);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCondicion(Operacion newCondicion) {
		if (newCondicion != condicion) {
			NotificationChain msgs = null;
			if (condicion != null)
				msgs = ((InternalEObject)condicion).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DiagramapseudocodigoPackage.BLOQUE__CONDICION, null, msgs);
			if (newCondicion != null)
				msgs = ((InternalEObject)newCondicion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DiagramapseudocodigoPackage.BLOQUE__CONDICION, null, msgs);
			msgs = basicSetCondicion(newCondicion, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiagramapseudocodigoPackage.BLOQUE__CONDICION, newCondicion, newCondicion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Sentencia> getSentencias() {
		if (sentencias == null) {
			sentencias = new EObjectContainmentEList<Sentencia>(Sentencia.class, this, DiagramapseudocodigoPackage.BLOQUE__SENTENCIAS);
		}
		return sentencias;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DiagramapseudocodigoPackage.BLOQUE__CONDICION:
				return basicSetCondicion(null, msgs);
			case DiagramapseudocodigoPackage.BLOQUE__SENTENCIAS:
				return ((InternalEList<?>)getSentencias()).basicRemove(otherEnd, msgs);
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
			case DiagramapseudocodigoPackage.BLOQUE__CONDICION:
				return getCondicion();
			case DiagramapseudocodigoPackage.BLOQUE__SENTENCIAS:
				return getSentencias();
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
			case DiagramapseudocodigoPackage.BLOQUE__CONDICION:
				setCondicion((Operacion)newValue);
				return;
			case DiagramapseudocodigoPackage.BLOQUE__SENTENCIAS:
				getSentencias().clear();
				getSentencias().addAll((Collection<? extends Sentencia>)newValue);
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
			case DiagramapseudocodigoPackage.BLOQUE__CONDICION:
				setCondicion((Operacion)null);
				return;
			case DiagramapseudocodigoPackage.BLOQUE__SENTENCIAS:
				getSentencias().clear();
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
			case DiagramapseudocodigoPackage.BLOQUE__CONDICION:
				return condicion != null;
			case DiagramapseudocodigoPackage.BLOQUE__SENTENCIAS:
				return sentencias != null && !sentencias.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //BloqueImpl
