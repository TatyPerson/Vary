/**
 */
package diagramapseudocodigo.impl;

import diagramapseudocodigo.CampoRegistro;
import diagramapseudocodigo.DiagramapseudocodigoPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Campo Registro</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link diagramapseudocodigo.impl.CampoRegistroImpl#getNombre_campo <em>Nombre campo</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CampoRegistroImpl extends MinimalEObjectImpl.Container implements CampoRegistro {
	/**
	 * The default value of the '{@link #getNombre_campo() <em>Nombre campo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombre_campo()
	 * @generated
	 * @ordered
	 */
	protected static final String NOMBRE_CAMPO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNombre_campo() <em>Nombre campo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombre_campo()
	 * @generated
	 * @ordered
	 */
	protected String nombre_campo = NOMBRE_CAMPO_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CampoRegistroImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DiagramapseudocodigoPackage.Literals.CAMPO_REGISTRO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNombre_campo() {
		return nombre_campo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombre_campo(String newNombre_campo) {
		String oldNombre_campo = nombre_campo;
		nombre_campo = newNombre_campo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiagramapseudocodigoPackage.CAMPO_REGISTRO__NOMBRE_CAMPO, oldNombre_campo, nombre_campo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DiagramapseudocodigoPackage.CAMPO_REGISTRO__NOMBRE_CAMPO:
				return getNombre_campo();
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
			case DiagramapseudocodigoPackage.CAMPO_REGISTRO__NOMBRE_CAMPO:
				setNombre_campo((String)newValue);
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
			case DiagramapseudocodigoPackage.CAMPO_REGISTRO__NOMBRE_CAMPO:
				setNombre_campo(NOMBRE_CAMPO_EDEFAULT);
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
			case DiagramapseudocodigoPackage.CAMPO_REGISTRO__NOMBRE_CAMPO:
				return NOMBRE_CAMPO_EDEFAULT == null ? nombre_campo != null : !NOMBRE_CAMPO_EDEFAULT.equals(nombre_campo);
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
		result.append(" (nombre_campo: ");
		result.append(nombre_campo);
		result.append(')');
		return result.toString();
	}

} //CampoRegistroImpl
