/**
 */
package diagramapseudocodigo.impl;

import diagramapseudocodigo.DiagramapseudocodigoPackage;
import diagramapseudocodigo.SubrangoEnumerado;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Subrango Enumerado</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link diagramapseudocodigo.impl.SubrangoEnumeradoImpl#getLimite_inf <em>Limite inf</em>}</li>
 *   <li>{@link diagramapseudocodigo.impl.SubrangoEnumeradoImpl#getLimite_sup <em>Limite sup</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SubrangoEnumeradoImpl extends SubrangoImpl implements SubrangoEnumerado {
	/**
	 * The default value of the '{@link #getLimite_inf() <em>Limite inf</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLimite_inf()
	 * @generated
	 * @ordered
	 */
	protected static final String LIMITE_INF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLimite_inf() <em>Limite inf</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLimite_inf()
	 * @generated
	 * @ordered
	 */
	protected String limite_inf = LIMITE_INF_EDEFAULT;

	/**
	 * The default value of the '{@link #getLimite_sup() <em>Limite sup</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLimite_sup()
	 * @generated
	 * @ordered
	 */
	protected static final String LIMITE_SUP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLimite_sup() <em>Limite sup</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLimite_sup()
	 * @generated
	 * @ordered
	 */
	protected String limite_sup = LIMITE_SUP_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubrangoEnumeradoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DiagramapseudocodigoPackage.Literals.SUBRANGO_ENUMERADO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLimite_inf() {
		return limite_inf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLimite_inf(String newLimite_inf) {
		String oldLimite_inf = limite_inf;
		limite_inf = newLimite_inf;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiagramapseudocodigoPackage.SUBRANGO_ENUMERADO__LIMITE_INF, oldLimite_inf, limite_inf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLimite_sup() {
		return limite_sup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLimite_sup(String newLimite_sup) {
		String oldLimite_sup = limite_sup;
		limite_sup = newLimite_sup;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiagramapseudocodigoPackage.SUBRANGO_ENUMERADO__LIMITE_SUP, oldLimite_sup, limite_sup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DiagramapseudocodigoPackage.SUBRANGO_ENUMERADO__LIMITE_INF:
				return getLimite_inf();
			case DiagramapseudocodigoPackage.SUBRANGO_ENUMERADO__LIMITE_SUP:
				return getLimite_sup();
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
			case DiagramapseudocodigoPackage.SUBRANGO_ENUMERADO__LIMITE_INF:
				setLimite_inf((String)newValue);
				return;
			case DiagramapseudocodigoPackage.SUBRANGO_ENUMERADO__LIMITE_SUP:
				setLimite_sup((String)newValue);
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
			case DiagramapseudocodigoPackage.SUBRANGO_ENUMERADO__LIMITE_INF:
				setLimite_inf(LIMITE_INF_EDEFAULT);
				return;
			case DiagramapseudocodigoPackage.SUBRANGO_ENUMERADO__LIMITE_SUP:
				setLimite_sup(LIMITE_SUP_EDEFAULT);
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
			case DiagramapseudocodigoPackage.SUBRANGO_ENUMERADO__LIMITE_INF:
				return LIMITE_INF_EDEFAULT == null ? limite_inf != null : !LIMITE_INF_EDEFAULT.equals(limite_inf);
			case DiagramapseudocodigoPackage.SUBRANGO_ENUMERADO__LIMITE_SUP:
				return LIMITE_SUP_EDEFAULT == null ? limite_sup != null : !LIMITE_SUP_EDEFAULT.equals(limite_sup);
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
		result.append(" (limite_inf: ");
		result.append(limite_inf);
		result.append(", limite_sup: ");
		result.append(limite_sup);
		result.append(')');
		return result.toString();
	}

} //SubrangoEnumeradoImpl
