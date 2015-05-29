/**
 */
package diagramapseudocodigo.impl;

import diagramapseudocodigo.Devolver;
import diagramapseudocodigo.DiagramapseudocodigoPackage;
import diagramapseudocodigo.Funcion;
import diagramapseudocodigo.TipoVariable;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Funcion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link diagramapseudocodigo.impl.FuncionImpl#getTipo <em>Tipo</em>}</li>
 *   <li>{@link diagramapseudocodigo.impl.FuncionImpl#getDevuelve <em>Devuelve</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FuncionImpl extends SubprocesoImpl implements Funcion {
	/**
	 * The default value of the '{@link #getTipo() <em>Tipo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTipo()
	 * @generated
	 * @ordered
	 */
	protected static final TipoVariable TIPO_EDEFAULT = TipoVariable.ENTERO;

	/**
	 * The cached value of the '{@link #getTipo() <em>Tipo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTipo()
	 * @generated
	 * @ordered
	 */
	protected TipoVariable tipo = TIPO_EDEFAULT;

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
	public FuncionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DiagramapseudocodigoPackage.Literals.FUNCION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TipoVariable getTipo() {
		return tipo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTipo(TipoVariable newTipo) {
		TipoVariable oldTipo = tipo;
		tipo = newTipo == null ? TIPO_EDEFAULT : newTipo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiagramapseudocodigoPackage.FUNCION__TIPO, oldTipo, tipo));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DiagramapseudocodigoPackage.FUNCION__DEVUELVE, oldDevuelve, newDevuelve);
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
				msgs = ((InternalEObject)devuelve).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DiagramapseudocodigoPackage.FUNCION__DEVUELVE, null, msgs);
			if (newDevuelve != null)
				msgs = ((InternalEObject)newDevuelve).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DiagramapseudocodigoPackage.FUNCION__DEVUELVE, null, msgs);
			msgs = basicSetDevuelve(newDevuelve, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiagramapseudocodigoPackage.FUNCION__DEVUELVE, newDevuelve, newDevuelve));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DiagramapseudocodigoPackage.FUNCION__DEVUELVE:
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
			case DiagramapseudocodigoPackage.FUNCION__TIPO:
				return getTipo();
			case DiagramapseudocodigoPackage.FUNCION__DEVUELVE:
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
			case DiagramapseudocodigoPackage.FUNCION__TIPO:
				setTipo((TipoVariable)newValue);
				return;
			case DiagramapseudocodigoPackage.FUNCION__DEVUELVE:
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
			case DiagramapseudocodigoPackage.FUNCION__TIPO:
				setTipo(TIPO_EDEFAULT);
				return;
			case DiagramapseudocodigoPackage.FUNCION__DEVUELVE:
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
			case DiagramapseudocodigoPackage.FUNCION__TIPO:
				return tipo != TIPO_EDEFAULT;
			case DiagramapseudocodigoPackage.FUNCION__DEVUELVE:
				return devuelve != null;
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
		result.append(" (tipo: ");
		result.append(tipo);
		result.append(')');
		return result.toString();
	}

} //FuncionImpl
