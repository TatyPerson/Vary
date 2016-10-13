/**
 */
package diagramapseudocodigo.impl;

import diagramapseudocodigo.Comparacion;
import diagramapseudocodigo.DiagramapseudocodigoPackage;
import diagramapseudocodigo.signo;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Comparacion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link diagramapseudocodigo.impl.ComparacionImpl#getSigno_op <em>Signo op</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComparacionImpl extends OperacionImpl implements Comparacion {
	/**
	 * The default value of the '{@link #getSigno_op() <em>Signo op</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSigno_op()
	 * @generated
	 * @ordered
	 */
	protected static final signo SIGNO_OP_EDEFAULT = signo.SUM;

	/**
	 * The cached value of the '{@link #getSigno_op() <em>Signo op</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSigno_op()
	 * @generated
	 * @ordered
	 */
	protected signo signo_op = SIGNO_OP_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComparacionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DiagramapseudocodigoPackage.Literals.COMPARACION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public signo getSigno_op() {
		return signo_op;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSigno_op(signo newSigno_op) {
		signo oldSigno_op = signo_op;
		signo_op = newSigno_op == null ? SIGNO_OP_EDEFAULT : newSigno_op;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiagramapseudocodigoPackage.COMPARACION__SIGNO_OP, oldSigno_op, signo_op));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DiagramapseudocodigoPackage.COMPARACION__SIGNO_OP:
				return getSigno_op();
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
			case DiagramapseudocodigoPackage.COMPARACION__SIGNO_OP:
				setSigno_op((signo)newValue);
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
			case DiagramapseudocodigoPackage.COMPARACION__SIGNO_OP:
				setSigno_op(SIGNO_OP_EDEFAULT);
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
			case DiagramapseudocodigoPackage.COMPARACION__SIGNO_OP:
				return signo_op != SIGNO_OP_EDEFAULT;
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
		result.append(" (signo_op: ");
		result.append(signo_op);
		result.append(')');
		return result.toString();
	}

} //ComparacionImpl
