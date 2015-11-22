/**
 */
package diagramapseudocodigo.impl;

import diagramapseudocodigo.DiagramapseudocodigoPackage;
import diagramapseudocodigo.SubrangoNumerico;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Subrango Numerico</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link diagramapseudocodigo.impl.SubrangoNumericoImpl#getLimite_inf <em>Limite inf</em>}</li>
 *   <li>{@link diagramapseudocodigo.impl.SubrangoNumericoImpl#getLimite_sup <em>Limite sup</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubrangoNumericoImpl extends SubrangoImpl implements SubrangoNumerico {
	/**
	 * The default value of the '{@link #getLimite_inf() <em>Limite inf</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLimite_inf()
	 * @generated
	 * @ordered
	 */
	protected static final int LIMITE_INF_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLimite_inf() <em>Limite inf</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLimite_inf()
	 * @generated
	 * @ordered
	 */
	protected int limite_inf = LIMITE_INF_EDEFAULT;

	/**
	 * The default value of the '{@link #getLimite_sup() <em>Limite sup</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLimite_sup()
	 * @generated
	 * @ordered
	 */
	protected static final int LIMITE_SUP_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLimite_sup() <em>Limite sup</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLimite_sup()
	 * @generated
	 * @ordered
	 */
	protected int limite_sup = LIMITE_SUP_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubrangoNumericoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DiagramapseudocodigoPackage.Literals.SUBRANGO_NUMERICO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLimite_inf() {
		return limite_inf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLimite_inf(int newLimite_inf) {
		int oldLimite_inf = limite_inf;
		limite_inf = newLimite_inf;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiagramapseudocodigoPackage.SUBRANGO_NUMERICO__LIMITE_INF, oldLimite_inf, limite_inf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLimite_sup() {
		return limite_sup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLimite_sup(int newLimite_sup) {
		int oldLimite_sup = limite_sup;
		limite_sup = newLimite_sup;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiagramapseudocodigoPackage.SUBRANGO_NUMERICO__LIMITE_SUP, oldLimite_sup, limite_sup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DiagramapseudocodigoPackage.SUBRANGO_NUMERICO__LIMITE_INF:
				return getLimite_inf();
			case DiagramapseudocodigoPackage.SUBRANGO_NUMERICO__LIMITE_SUP:
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
			case DiagramapseudocodigoPackage.SUBRANGO_NUMERICO__LIMITE_INF:
				setLimite_inf((Integer)newValue);
				return;
			case DiagramapseudocodigoPackage.SUBRANGO_NUMERICO__LIMITE_SUP:
				setLimite_sup((Integer)newValue);
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
			case DiagramapseudocodigoPackage.SUBRANGO_NUMERICO__LIMITE_INF:
				setLimite_inf(LIMITE_INF_EDEFAULT);
				return;
			case DiagramapseudocodigoPackage.SUBRANGO_NUMERICO__LIMITE_SUP:
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
			case DiagramapseudocodigoPackage.SUBRANGO_NUMERICO__LIMITE_INF:
				return limite_inf != LIMITE_INF_EDEFAULT;
			case DiagramapseudocodigoPackage.SUBRANGO_NUMERICO__LIMITE_SUP:
				return limite_sup != LIMITE_SUP_EDEFAULT;
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

} //SubrangoNumericoImpl
