/**
 */
package diagramapseudocodigo.impl;

import diagramapseudocodigo.CampoRegistro;
import diagramapseudocodigo.DiagramapseudocodigoPackage;
import diagramapseudocodigo.Operacion;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Campo Registro</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link diagramapseudocodigo.impl.CampoRegistroImpl#getNombre_campo <em>Nombre campo</em>}</li>
 *   <li>{@link diagramapseudocodigo.impl.CampoRegistroImpl#getEReference0 <em>EReference0</em>}</li>
 *   <li>{@link diagramapseudocodigo.impl.CampoRegistroImpl#getPrimerIndice <em>Primer Indice</em>}</li>
 *   <li>{@link diagramapseudocodigo.impl.CampoRegistroImpl#getSegundoIndice <em>Segundo Indice</em>}</li>
 * </ul>
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
	 * The cached value of the '{@link #getEReference0() <em>EReference0</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEReference0()
	 * @generated
	 * @ordered
	 */
	protected CampoRegistro eReference0;

	/**
	 * The cached value of the '{@link #getPrimerIndice() <em>Primer Indice</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimerIndice()
	 * @generated
	 * @ordered
	 */
	protected Operacion primerIndice;

	/**
	 * The cached value of the '{@link #getSegundoIndice() <em>Segundo Indice</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSegundoIndice()
	 * @generated
	 * @ordered
	 */
	protected Operacion segundoIndice;

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
	public CampoRegistro getEReference0() {
		if (eReference0 != null && eReference0.eIsProxy()) {
			InternalEObject oldEReference0 = (InternalEObject)eReference0;
			eReference0 = (CampoRegistro)eResolveProxy(oldEReference0);
			if (eReference0 != oldEReference0) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DiagramapseudocodigoPackage.CAMPO_REGISTRO__EREFERENCE0, oldEReference0, eReference0));
			}
		}
		return eReference0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CampoRegistro basicGetEReference0() {
		return eReference0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEReference0(CampoRegistro newEReference0) {
		CampoRegistro oldEReference0 = eReference0;
		eReference0 = newEReference0;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiagramapseudocodigoPackage.CAMPO_REGISTRO__EREFERENCE0, oldEReference0, eReference0));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operacion getPrimerIndice() {
		return primerIndice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrimerIndice(Operacion newPrimerIndice, NotificationChain msgs) {
		Operacion oldPrimerIndice = primerIndice;
		primerIndice = newPrimerIndice;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DiagramapseudocodigoPackage.CAMPO_REGISTRO__PRIMER_INDICE, oldPrimerIndice, newPrimerIndice);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrimerIndice(Operacion newPrimerIndice) {
		if (newPrimerIndice != primerIndice) {
			NotificationChain msgs = null;
			if (primerIndice != null)
				msgs = ((InternalEObject)primerIndice).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DiagramapseudocodigoPackage.CAMPO_REGISTRO__PRIMER_INDICE, null, msgs);
			if (newPrimerIndice != null)
				msgs = ((InternalEObject)newPrimerIndice).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DiagramapseudocodigoPackage.CAMPO_REGISTRO__PRIMER_INDICE, null, msgs);
			msgs = basicSetPrimerIndice(newPrimerIndice, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiagramapseudocodigoPackage.CAMPO_REGISTRO__PRIMER_INDICE, newPrimerIndice, newPrimerIndice));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operacion getSegundoIndice() {
		return segundoIndice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSegundoIndice(Operacion newSegundoIndice, NotificationChain msgs) {
		Operacion oldSegundoIndice = segundoIndice;
		segundoIndice = newSegundoIndice;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DiagramapseudocodigoPackage.CAMPO_REGISTRO__SEGUNDO_INDICE, oldSegundoIndice, newSegundoIndice);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSegundoIndice(Operacion newSegundoIndice) {
		if (newSegundoIndice != segundoIndice) {
			NotificationChain msgs = null;
			if (segundoIndice != null)
				msgs = ((InternalEObject)segundoIndice).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DiagramapseudocodigoPackage.CAMPO_REGISTRO__SEGUNDO_INDICE, null, msgs);
			if (newSegundoIndice != null)
				msgs = ((InternalEObject)newSegundoIndice).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DiagramapseudocodigoPackage.CAMPO_REGISTRO__SEGUNDO_INDICE, null, msgs);
			msgs = basicSetSegundoIndice(newSegundoIndice, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiagramapseudocodigoPackage.CAMPO_REGISTRO__SEGUNDO_INDICE, newSegundoIndice, newSegundoIndice));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DiagramapseudocodigoPackage.CAMPO_REGISTRO__PRIMER_INDICE:
				return basicSetPrimerIndice(null, msgs);
			case DiagramapseudocodigoPackage.CAMPO_REGISTRO__SEGUNDO_INDICE:
				return basicSetSegundoIndice(null, msgs);
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
			case DiagramapseudocodigoPackage.CAMPO_REGISTRO__NOMBRE_CAMPO:
				return getNombre_campo();
			case DiagramapseudocodigoPackage.CAMPO_REGISTRO__EREFERENCE0:
				if (resolve) return getEReference0();
				return basicGetEReference0();
			case DiagramapseudocodigoPackage.CAMPO_REGISTRO__PRIMER_INDICE:
				return getPrimerIndice();
			case DiagramapseudocodigoPackage.CAMPO_REGISTRO__SEGUNDO_INDICE:
				return getSegundoIndice();
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
			case DiagramapseudocodigoPackage.CAMPO_REGISTRO__EREFERENCE0:
				setEReference0((CampoRegistro)newValue);
				return;
			case DiagramapseudocodigoPackage.CAMPO_REGISTRO__PRIMER_INDICE:
				setPrimerIndice((Operacion)newValue);
				return;
			case DiagramapseudocodigoPackage.CAMPO_REGISTRO__SEGUNDO_INDICE:
				setSegundoIndice((Operacion)newValue);
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
			case DiagramapseudocodigoPackage.CAMPO_REGISTRO__EREFERENCE0:
				setEReference0((CampoRegistro)null);
				return;
			case DiagramapseudocodigoPackage.CAMPO_REGISTRO__PRIMER_INDICE:
				setPrimerIndice((Operacion)null);
				return;
			case DiagramapseudocodigoPackage.CAMPO_REGISTRO__SEGUNDO_INDICE:
				setSegundoIndice((Operacion)null);
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
			case DiagramapseudocodigoPackage.CAMPO_REGISTRO__EREFERENCE0:
				return eReference0 != null;
			case DiagramapseudocodigoPackage.CAMPO_REGISTRO__PRIMER_INDICE:
				return primerIndice != null;
			case DiagramapseudocodigoPackage.CAMPO_REGISTRO__SEGUNDO_INDICE:
				return segundoIndice != null;
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
