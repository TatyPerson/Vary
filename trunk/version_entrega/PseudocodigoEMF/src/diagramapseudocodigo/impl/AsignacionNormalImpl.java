/**
 */
package diagramapseudocodigo.impl;

import diagramapseudocodigo.AsignacionNormal;
import diagramapseudocodigo.DiagramapseudocodigoPackage;
import diagramapseudocodigo.operacion;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Asignacion Normal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link diagramapseudocodigo.impl.AsignacionNormalImpl#getMat <em>Mat</em>}</li>
 *   <li>{@link diagramapseudocodigo.impl.AsignacionNormalImpl#getValor_asignacion <em>Valor asignacion</em>}</li>
 *   <li>{@link diagramapseudocodigo.impl.AsignacionNormalImpl#getOperador <em>Operador</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AsignacionNormalImpl extends AsignacionImpl implements AsignacionNormal {
	/**
	 * The cached value of the '{@link #getMat() <em>Mat</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMat()
	 * @generated
	 * @ordered
	 */
	protected EList<String> mat;

	/**
	 * The default value of the '{@link #getValor_asignacion() <em>Valor asignacion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValor_asignacion()
	 * @generated
	 * @ordered
	 */
	protected static final String VALOR_ASIGNACION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValor_asignacion() <em>Valor asignacion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValor_asignacion()
	 * @generated
	 * @ordered
	 */
	protected String valor_asignacion = VALOR_ASIGNACION_EDEFAULT;

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
	public AsignacionNormalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DiagramapseudocodigoPackage.Literals.ASIGNACION_NORMAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getMat() {
		if (mat == null) {
			mat = new EDataTypeUniqueEList<String>(String.class, this, DiagramapseudocodigoPackage.ASIGNACION_NORMAL__MAT);
		}
		return mat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValor_asignacion() {
		return valor_asignacion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValor_asignacion(String newValor_asignacion) {
		String oldValor_asignacion = valor_asignacion;
		valor_asignacion = newValor_asignacion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiagramapseudocodigoPackage.ASIGNACION_NORMAL__VALOR_ASIGNACION, oldValor_asignacion, valor_asignacion));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DiagramapseudocodigoPackage.ASIGNACION_NORMAL__OPERADOR, oldOperador, newOperador);
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
				msgs = ((InternalEObject)operador).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DiagramapseudocodigoPackage.ASIGNACION_NORMAL__OPERADOR, null, msgs);
			if (newOperador != null)
				msgs = ((InternalEObject)newOperador).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DiagramapseudocodigoPackage.ASIGNACION_NORMAL__OPERADOR, null, msgs);
			msgs = basicSetOperador(newOperador, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiagramapseudocodigoPackage.ASIGNACION_NORMAL__OPERADOR, newOperador, newOperador));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DiagramapseudocodigoPackage.ASIGNACION_NORMAL__OPERADOR:
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
			case DiagramapseudocodigoPackage.ASIGNACION_NORMAL__MAT:
				return getMat();
			case DiagramapseudocodigoPackage.ASIGNACION_NORMAL__VALOR_ASIGNACION:
				return getValor_asignacion();
			case DiagramapseudocodigoPackage.ASIGNACION_NORMAL__OPERADOR:
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
			case DiagramapseudocodigoPackage.ASIGNACION_NORMAL__MAT:
				getMat().clear();
				getMat().addAll((Collection<? extends String>)newValue);
				return;
			case DiagramapseudocodigoPackage.ASIGNACION_NORMAL__VALOR_ASIGNACION:
				setValor_asignacion((String)newValue);
				return;
			case DiagramapseudocodigoPackage.ASIGNACION_NORMAL__OPERADOR:
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
			case DiagramapseudocodigoPackage.ASIGNACION_NORMAL__MAT:
				getMat().clear();
				return;
			case DiagramapseudocodigoPackage.ASIGNACION_NORMAL__VALOR_ASIGNACION:
				setValor_asignacion(VALOR_ASIGNACION_EDEFAULT);
				return;
			case DiagramapseudocodigoPackage.ASIGNACION_NORMAL__OPERADOR:
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
			case DiagramapseudocodigoPackage.ASIGNACION_NORMAL__MAT:
				return mat != null && !mat.isEmpty();
			case DiagramapseudocodigoPackage.ASIGNACION_NORMAL__VALOR_ASIGNACION:
				return VALOR_ASIGNACION_EDEFAULT == null ? valor_asignacion != null : !VALOR_ASIGNACION_EDEFAULT.equals(valor_asignacion);
			case DiagramapseudocodigoPackage.ASIGNACION_NORMAL__OPERADOR:
				return operador != null;
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
		result.append(" (Mat: ");
		result.append(mat);
		result.append(", valor_asignacion: ");
		result.append(valor_asignacion);
		result.append(')');
		return result.toString();
	}

} //AsignacionNormalImpl
