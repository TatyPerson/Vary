/**
 */
package diagramapseudocodigo.impl;

import diagramapseudocodigo.DiagramapseudocodigoPackage;
import diagramapseudocodigo.Operacion;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operacion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link diagramapseudocodigo.impl.OperacionImpl#getEAttribute0rence0 <em>EAttribute0rence0</em>}</li>
 *   <li>{@link diagramapseudocodigo.impl.OperacionImpl#getNegacionesFinales <em>Negaciones Finales</em>}</li>
 *   <li>{@link diagramapseudocodigo.impl.OperacionImpl#getNegacionesIniciales <em>Negaciones Iniciales</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OperacionImpl extends ValorImpl implements Operacion {
	/**
	 * The cached value of the '{@link #getEAttribute0rence0() <em>EAttribute0rence0</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEAttribute0rence0()
	 * @generated
	 * @ordered
	 */
	protected Operacion eAttribute0rence0;

	/**
	 * The cached value of the '{@link #getNegacionesFinales() <em>Negaciones Finales</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNegacionesFinales()
	 * @generated
	 * @ordered
	 */
	protected EList<String> negacionesFinales;

	/**
	 * The cached value of the '{@link #getNegacionesIniciales() <em>Negaciones Iniciales</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNegacionesIniciales()
	 * @generated
	 * @ordered
	 */
	protected EList<String> negacionesIniciales;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperacionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DiagramapseudocodigoPackage.Literals.OPERACION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operacion getEAttribute0rence0() {
		if (eAttribute0rence0 != null && eAttribute0rence0.eIsProxy()) {
			InternalEObject oldEAttribute0rence0 = (InternalEObject)eAttribute0rence0;
			eAttribute0rence0 = (Operacion)eResolveProxy(oldEAttribute0rence0);
			if (eAttribute0rence0 != oldEAttribute0rence0) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DiagramapseudocodigoPackage.OPERACION__EATTRIBUTE0RENCE0, oldEAttribute0rence0, eAttribute0rence0));
			}
		}
		return eAttribute0rence0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operacion basicGetEAttribute0rence0() {
		return eAttribute0rence0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEAttribute0rence0(Operacion newEAttribute0rence0) {
		Operacion oldEAttribute0rence0 = eAttribute0rence0;
		eAttribute0rence0 = newEAttribute0rence0;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiagramapseudocodigoPackage.OPERACION__EATTRIBUTE0RENCE0, oldEAttribute0rence0, eAttribute0rence0));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getNegacionesFinales() {
		if (negacionesFinales == null) {
			negacionesFinales = new EDataTypeUniqueEList<String>(String.class, this, DiagramapseudocodigoPackage.OPERACION__NEGACIONES_FINALES);
		}
		return negacionesFinales;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getNegacionesIniciales() {
		if (negacionesIniciales == null) {
			negacionesIniciales = new EDataTypeUniqueEList<String>(String.class, this, DiagramapseudocodigoPackage.OPERACION__NEGACIONES_INICIALES);
		}
		return negacionesIniciales;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DiagramapseudocodigoPackage.OPERACION__EATTRIBUTE0RENCE0:
				if (resolve) return getEAttribute0rence0();
				return basicGetEAttribute0rence0();
			case DiagramapseudocodigoPackage.OPERACION__NEGACIONES_FINALES:
				return getNegacionesFinales();
			case DiagramapseudocodigoPackage.OPERACION__NEGACIONES_INICIALES:
				return getNegacionesIniciales();
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
			case DiagramapseudocodigoPackage.OPERACION__EATTRIBUTE0RENCE0:
				setEAttribute0rence0((Operacion)newValue);
				return;
			case DiagramapseudocodigoPackage.OPERACION__NEGACIONES_FINALES:
				getNegacionesFinales().clear();
				getNegacionesFinales().addAll((Collection<? extends String>)newValue);
				return;
			case DiagramapseudocodigoPackage.OPERACION__NEGACIONES_INICIALES:
				getNegacionesIniciales().clear();
				getNegacionesIniciales().addAll((Collection<? extends String>)newValue);
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
			case DiagramapseudocodigoPackage.OPERACION__EATTRIBUTE0RENCE0:
				setEAttribute0rence0((Operacion)null);
				return;
			case DiagramapseudocodigoPackage.OPERACION__NEGACIONES_FINALES:
				getNegacionesFinales().clear();
				return;
			case DiagramapseudocodigoPackage.OPERACION__NEGACIONES_INICIALES:
				getNegacionesIniciales().clear();
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
			case DiagramapseudocodigoPackage.OPERACION__EATTRIBUTE0RENCE0:
				return eAttribute0rence0 != null;
			case DiagramapseudocodigoPackage.OPERACION__NEGACIONES_FINALES:
				return negacionesFinales != null && !negacionesFinales.isEmpty();
			case DiagramapseudocodigoPackage.OPERACION__NEGACIONES_INICIALES:
				return negacionesIniciales != null && !negacionesIniciales.isEmpty();
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
		result.append(" (negacionesFinales: ");
		result.append(negacionesFinales);
		result.append(", negacionesIniciales: ");
		result.append(negacionesIniciales);
		result.append(')');
		return result.toString();
	}

} //OperacionImpl
