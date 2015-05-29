/**
 */
package diagramapseudocodigo.impl;

import diagramapseudocodigo.AsignacionCompleja;
import diagramapseudocodigo.DiagramapseudocodigoPackage;
import diagramapseudocodigo.operacion;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Asignacion Compleja</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link diagramapseudocodigo.impl.AsignacionComplejaImpl#getOperador <em>Operador</em>}</li>
 *   <li>{@link diagramapseudocodigo.impl.AsignacionComplejaImpl#getValor_asignacion <em>Valor asignacion</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AsignacionComplejaImpl extends AsignacionImpl implements AsignacionCompleja {
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
	 * The cached value of the '{@link #getValor_asignacion() <em>Valor asignacion</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValor_asignacion()
	 * @generated
	 * @ordered
	 */
	protected operacion valor_asignacion;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AsignacionComplejaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DiagramapseudocodigoPackage.Literals.ASIGNACION_COMPLEJA;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DiagramapseudocodigoPackage.ASIGNACION_COMPLEJA__OPERADOR, oldOperador, newOperador);
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
				msgs = ((InternalEObject)operador).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DiagramapseudocodigoPackage.ASIGNACION_COMPLEJA__OPERADOR, null, msgs);
			if (newOperador != null)
				msgs = ((InternalEObject)newOperador).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DiagramapseudocodigoPackage.ASIGNACION_COMPLEJA__OPERADOR, null, msgs);
			msgs = basicSetOperador(newOperador, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiagramapseudocodigoPackage.ASIGNACION_COMPLEJA__OPERADOR, newOperador, newOperador));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public operacion getValor_asignacion() {
		return valor_asignacion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValor_asignacion(operacion newValor_asignacion, NotificationChain msgs) {
		operacion oldValor_asignacion = valor_asignacion;
		valor_asignacion = newValor_asignacion;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DiagramapseudocodigoPackage.ASIGNACION_COMPLEJA__VALOR_ASIGNACION, oldValor_asignacion, newValor_asignacion);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValor_asignacion(operacion newValor_asignacion) {
		if (newValor_asignacion != valor_asignacion) {
			NotificationChain msgs = null;
			if (valor_asignacion != null)
				msgs = ((InternalEObject)valor_asignacion).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DiagramapseudocodigoPackage.ASIGNACION_COMPLEJA__VALOR_ASIGNACION, null, msgs);
			if (newValor_asignacion != null)
				msgs = ((InternalEObject)newValor_asignacion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DiagramapseudocodigoPackage.ASIGNACION_COMPLEJA__VALOR_ASIGNACION, null, msgs);
			msgs = basicSetValor_asignacion(newValor_asignacion, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiagramapseudocodigoPackage.ASIGNACION_COMPLEJA__VALOR_ASIGNACION, newValor_asignacion, newValor_asignacion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DiagramapseudocodigoPackage.ASIGNACION_COMPLEJA__OPERADOR:
				return basicSetOperador(null, msgs);
			case DiagramapseudocodigoPackage.ASIGNACION_COMPLEJA__VALOR_ASIGNACION:
				return basicSetValor_asignacion(null, msgs);
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
			case DiagramapseudocodigoPackage.ASIGNACION_COMPLEJA__OPERADOR:
				return getOperador();
			case DiagramapseudocodigoPackage.ASIGNACION_COMPLEJA__VALOR_ASIGNACION:
				return getValor_asignacion();
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
			case DiagramapseudocodigoPackage.ASIGNACION_COMPLEJA__OPERADOR:
				setOperador((operacion)newValue);
				return;
			case DiagramapseudocodigoPackage.ASIGNACION_COMPLEJA__VALOR_ASIGNACION:
				setValor_asignacion((operacion)newValue);
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
			case DiagramapseudocodigoPackage.ASIGNACION_COMPLEJA__OPERADOR:
				setOperador((operacion)null);
				return;
			case DiagramapseudocodigoPackage.ASIGNACION_COMPLEJA__VALOR_ASIGNACION:
				setValor_asignacion((operacion)null);
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
			case DiagramapseudocodigoPackage.ASIGNACION_COMPLEJA__OPERADOR:
				return operador != null;
			case DiagramapseudocodigoPackage.ASIGNACION_COMPLEJA__VALOR_ASIGNACION:
				return valor_asignacion != null;
		}
		return super.eIsSet(featureID);
	}

} //AsignacionComplejaImpl
