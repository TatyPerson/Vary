/**
 */
package diagramapseudocodigo.impl;

import diagramapseudocodigo.Caso;
import diagramapseudocodigo.Devolver;
import diagramapseudocodigo.DiagramapseudocodigoPackage;
import diagramapseudocodigo.Sentencias;
import diagramapseudocodigo.operacion;
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
 * An implementation of the model object '<em><b>Caso</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link diagramapseudocodigo.impl.CasoImpl#getDevuelve <em>Devuelve</em>}</li>
 *   <li>{@link diagramapseudocodigo.impl.CasoImpl#getSentencias <em>Sentencias</em>}</li>
 *   <li>{@link diagramapseudocodigo.impl.CasoImpl#getOperador <em>Operador</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CasoImpl extends MinimalEObjectImpl.Container implements Caso {
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
	 * The cached value of the '{@link #getSentencias() <em>Sentencias</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSentencias()
	 * @generated
	 * @ordered
	 */
	protected EList<Sentencias> sentencias;

	/**
	 * The cached value of the '{@link #getOperador() <em>Operador</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperador()
	 * @generated
	 * @ordered
	 */
	protected operacion operador;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CasoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DiagramapseudocodigoPackage.Literals.CASO;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DiagramapseudocodigoPackage.CASO__DEVUELVE, oldDevuelve, newDevuelve);
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
				msgs = ((InternalEObject)devuelve).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DiagramapseudocodigoPackage.CASO__DEVUELVE, null, msgs);
			if (newDevuelve != null)
				msgs = ((InternalEObject)newDevuelve).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DiagramapseudocodigoPackage.CASO__DEVUELVE, null, msgs);
			msgs = basicSetDevuelve(newDevuelve, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiagramapseudocodigoPackage.CASO__DEVUELVE, newDevuelve, newDevuelve));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Sentencias> getSentencias() {
		if (sentencias == null) {
			sentencias = new EObjectContainmentEList<Sentencias>(Sentencias.class, this, DiagramapseudocodigoPackage.CASO__SENTENCIAS);
		}
		return sentencias;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public operacion getOperador() {
		return operador;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOperador(operacion newOperador, NotificationChain msgs) {
		operacion oldOperador = operador;
		operador = newOperador;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DiagramapseudocodigoPackage.CASO__OPERADOR, oldOperador, newOperador);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperador(operacion newOperador) {
		if (newOperador != operador) {
			NotificationChain msgs = null;
			if (operador != null)
				msgs = ((InternalEObject)operador).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DiagramapseudocodigoPackage.CASO__OPERADOR, null, msgs);
			if (newOperador != null)
				msgs = ((InternalEObject)newOperador).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DiagramapseudocodigoPackage.CASO__OPERADOR, null, msgs);
			msgs = basicSetOperador(newOperador, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiagramapseudocodigoPackage.CASO__OPERADOR, newOperador, newOperador));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DiagramapseudocodigoPackage.CASO__DEVUELVE:
				return basicSetDevuelve(null, msgs);
			case DiagramapseudocodigoPackage.CASO__SENTENCIAS:
				return ((InternalEList<?>)getSentencias()).basicRemove(otherEnd, msgs);
			case DiagramapseudocodigoPackage.CASO__OPERADOR:
				return basicSetOperador(null, msgs);
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
			case DiagramapseudocodigoPackage.CASO__DEVUELVE:
				return getDevuelve();
			case DiagramapseudocodigoPackage.CASO__SENTENCIAS:
				return getSentencias();
			case DiagramapseudocodigoPackage.CASO__OPERADOR:
				return getOperador();
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
			case DiagramapseudocodigoPackage.CASO__DEVUELVE:
				setDevuelve((Devolver)newValue);
				return;
			case DiagramapseudocodigoPackage.CASO__SENTENCIAS:
				getSentencias().clear();
				getSentencias().addAll((Collection<? extends Sentencias>)newValue);
				return;
			case DiagramapseudocodigoPackage.CASO__OPERADOR:
				setOperador((operacion)newValue);
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
			case DiagramapseudocodigoPackage.CASO__DEVUELVE:
				setDevuelve((Devolver)null);
				return;
			case DiagramapseudocodigoPackage.CASO__SENTENCIAS:
				getSentencias().clear();
				return;
			case DiagramapseudocodigoPackage.CASO__OPERADOR:
				setOperador((operacion)null);
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
			case DiagramapseudocodigoPackage.CASO__DEVUELVE:
				return devuelve != null;
			case DiagramapseudocodigoPackage.CASO__SENTENCIAS:
				return sentencias != null && !sentencias.isEmpty();
			case DiagramapseudocodigoPackage.CASO__OPERADOR:
				return operador != null;
		}
		return super.eIsSet(featureID);
	}

} //CasoImpl
