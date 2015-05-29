/**
 */
package diagramapseudocodigo.impl;

import diagramapseudocodigo.DiagramapseudocodigoPackage;
import diagramapseudocodigo.ParametroFuncion;
import diagramapseudocodigo.Tipo;
import diagramapseudocodigo.TipoPaso;
import diagramapseudocodigo.Variable;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parametro Funcion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link diagramapseudocodigo.impl.ParametroFuncionImpl#getVariable <em>Variable</em>}</li>
 *   <li>{@link diagramapseudocodigo.impl.ParametroFuncionImpl#getPaso <em>Paso</em>}</li>
 *   <li>{@link diagramapseudocodigo.impl.ParametroFuncionImpl#getTipo <em>Tipo</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ParametroFuncionImpl extends MinimalEObjectImpl.Container implements ParametroFuncion {
	/**
	 * The cached value of the '{@link #getVariable() <em>Variable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariable()
	 * @generated
	 * @ordered
	 */
	protected Variable variable;

	/**
	 * The default value of the '{@link #getPaso() <em>Paso</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaso()
	 * @generated
	 * @ordered
	 */
	protected static final TipoPaso PASO_EDEFAULT = TipoPaso.ENTRADA;

	/**
	 * The cached value of the '{@link #getPaso() <em>Paso</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaso()
	 * @generated
	 * @ordered
	 */
	protected TipoPaso paso = PASO_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTipo() <em>Tipo</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTipo()
	 * @generated
	 * @ordered
	 */
	protected Tipo tipo;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParametroFuncionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DiagramapseudocodigoPackage.Literals.PARAMETRO_FUNCION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tipo getTipo() {
		return tipo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTipo(Tipo newTipo, NotificationChain msgs) {
		Tipo oldTipo = tipo;
		tipo = newTipo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DiagramapseudocodigoPackage.PARAMETRO_FUNCION__TIPO, oldTipo, newTipo);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTipo(Tipo newTipo) {
		if (newTipo != tipo) {
			NotificationChain msgs = null;
			if (tipo != null)
				msgs = ((InternalEObject)tipo).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DiagramapseudocodigoPackage.PARAMETRO_FUNCION__TIPO, null, msgs);
			if (newTipo != null)
				msgs = ((InternalEObject)newTipo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DiagramapseudocodigoPackage.PARAMETRO_FUNCION__TIPO, null, msgs);
			msgs = basicSetTipo(newTipo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiagramapseudocodigoPackage.PARAMETRO_FUNCION__TIPO, newTipo, newTipo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable getVariable() {
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVariable(Variable newVariable, NotificationChain msgs) {
		Variable oldVariable = variable;
		variable = newVariable;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DiagramapseudocodigoPackage.PARAMETRO_FUNCION__VARIABLE, oldVariable, newVariable);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVariable(Variable newVariable) {
		if (newVariable != variable) {
			NotificationChain msgs = null;
			if (variable != null)
				msgs = ((InternalEObject)variable).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DiagramapseudocodigoPackage.PARAMETRO_FUNCION__VARIABLE, null, msgs);
			if (newVariable != null)
				msgs = ((InternalEObject)newVariable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DiagramapseudocodigoPackage.PARAMETRO_FUNCION__VARIABLE, null, msgs);
			msgs = basicSetVariable(newVariable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiagramapseudocodigoPackage.PARAMETRO_FUNCION__VARIABLE, newVariable, newVariable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TipoPaso getPaso() {
		return paso;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPaso(TipoPaso newPaso) {
		TipoPaso oldPaso = paso;
		paso = newPaso == null ? PASO_EDEFAULT : newPaso;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiagramapseudocodigoPackage.PARAMETRO_FUNCION__PASO, oldPaso, paso));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DiagramapseudocodigoPackage.PARAMETRO_FUNCION__VARIABLE:
				return basicSetVariable(null, msgs);
			case DiagramapseudocodigoPackage.PARAMETRO_FUNCION__TIPO:
				return basicSetTipo(null, msgs);
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
			case DiagramapseudocodigoPackage.PARAMETRO_FUNCION__VARIABLE:
				return getVariable();
			case DiagramapseudocodigoPackage.PARAMETRO_FUNCION__PASO:
				return getPaso();
			case DiagramapseudocodigoPackage.PARAMETRO_FUNCION__TIPO:
				return getTipo();
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
			case DiagramapseudocodigoPackage.PARAMETRO_FUNCION__VARIABLE:
				setVariable((Variable)newValue);
				return;
			case DiagramapseudocodigoPackage.PARAMETRO_FUNCION__PASO:
				setPaso((TipoPaso)newValue);
				return;
			case DiagramapseudocodigoPackage.PARAMETRO_FUNCION__TIPO:
				setTipo((Tipo)newValue);
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
			case DiagramapseudocodigoPackage.PARAMETRO_FUNCION__VARIABLE:
				setVariable((Variable)null);
				return;
			case DiagramapseudocodigoPackage.PARAMETRO_FUNCION__PASO:
				setPaso(PASO_EDEFAULT);
				return;
			case DiagramapseudocodigoPackage.PARAMETRO_FUNCION__TIPO:
				setTipo((Tipo)null);
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
			case DiagramapseudocodigoPackage.PARAMETRO_FUNCION__VARIABLE:
				return variable != null;
			case DiagramapseudocodigoPackage.PARAMETRO_FUNCION__PASO:
				return paso != PASO_EDEFAULT;
			case DiagramapseudocodigoPackage.PARAMETRO_FUNCION__TIPO:
				return tipo != null;
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
		result.append(" (paso: ");
		result.append(paso);
		result.append(')');
		return result.toString();
	}

} //ParametroFuncionImpl
