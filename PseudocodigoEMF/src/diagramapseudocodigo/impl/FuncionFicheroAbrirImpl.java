/**
 */
package diagramapseudocodigo.impl;

import diagramapseudocodigo.DiagramapseudocodigoPackage;
import diagramapseudocodigo.FuncionFicheroAbrir;
import diagramapseudocodigo.ModoApertura;
import diagramapseudocodigo.operacion;
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
 * An implementation of the model object '<em><b>Funcion Fichero Abrir</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link diagramapseudocodigo.impl.FuncionFicheroAbrirImpl#getModo <em>Modo</em>}</li>
 *   <li>{@link diagramapseudocodigo.impl.FuncionFicheroAbrirImpl#getVariable <em>Variable</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FuncionFicheroAbrirImpl extends SentenciasImpl implements FuncionFicheroAbrir {
	/**
	 * The default value of the '{@link #getModo() <em>Modo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModo()
	 * @generated
	 * @ordered
	 */
	protected static final ModoApertura MODO_EDEFAULT = ModoApertura.ESCRITURA;

	/**
	 * The cached value of the '{@link #getModo() <em>Modo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModo()
	 * @generated
	 * @ordered
	 */
	protected ModoApertura modo = MODO_EDEFAULT;

	/**
	 * The cached value of the '{@link #getVariable() <em>Variable</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariable()
	 * @generated
	 * @ordered
	 */
	protected EList<operacion> variable;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FuncionFicheroAbrirImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DiagramapseudocodigoPackage.Literals.FUNCION_FICHERO_ABRIR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModoApertura getModo() {
		return modo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModo(ModoApertura newModo) {
		ModoApertura oldModo = modo;
		modo = newModo == null ? MODO_EDEFAULT : newModo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiagramapseudocodigoPackage.FUNCION_FICHERO_ABRIR__MODO, oldModo, modo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<operacion> getVariable() {
		if (variable == null) {
			variable = new EObjectContainmentEList<operacion>(operacion.class, this, DiagramapseudocodigoPackage.FUNCION_FICHERO_ABRIR__VARIABLE);
		}
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DiagramapseudocodigoPackage.FUNCION_FICHERO_ABRIR__VARIABLE:
				return ((InternalEList<?>)getVariable()).basicRemove(otherEnd, msgs);
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
			case DiagramapseudocodigoPackage.FUNCION_FICHERO_ABRIR__MODO:
				return getModo();
			case DiagramapseudocodigoPackage.FUNCION_FICHERO_ABRIR__VARIABLE:
				return getVariable();
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
			case DiagramapseudocodigoPackage.FUNCION_FICHERO_ABRIR__MODO:
				setModo((ModoApertura)newValue);
				return;
			case DiagramapseudocodigoPackage.FUNCION_FICHERO_ABRIR__VARIABLE:
				getVariable().clear();
				getVariable().addAll((Collection<? extends operacion>)newValue);
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
			case DiagramapseudocodigoPackage.FUNCION_FICHERO_ABRIR__MODO:
				setModo(MODO_EDEFAULT);
				return;
			case DiagramapseudocodigoPackage.FUNCION_FICHERO_ABRIR__VARIABLE:
				getVariable().clear();
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
			case DiagramapseudocodigoPackage.FUNCION_FICHERO_ABRIR__MODO:
				return modo != MODO_EDEFAULT;
			case DiagramapseudocodigoPackage.FUNCION_FICHERO_ABRIR__VARIABLE:
				return variable != null && !variable.isEmpty();
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
		result.append(" (modo: ");
		result.append(modo);
		result.append(')');
		return result.toString();
	}

} //FuncionFicheroAbrirImpl
