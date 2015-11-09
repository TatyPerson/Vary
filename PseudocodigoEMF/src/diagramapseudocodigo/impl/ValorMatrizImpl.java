/**
 */
package diagramapseudocodigo.impl;

import diagramapseudocodigo.CampoRegistro;
import diagramapseudocodigo.DiagramapseudocodigoPackage;
import diagramapseudocodigo.ValorMatriz;
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
 * An implementation of the model object '<em><b>Valor Matriz</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link diagramapseudocodigo.impl.ValorMatrizImpl#getNombre_matriz <em>Nombre matriz</em>}</li>
 *   <li>{@link diagramapseudocodigo.impl.ValorMatrizImpl#getCampo <em>Campo</em>}</li>
 *   <li>{@link diagramapseudocodigo.impl.ValorMatrizImpl#getPrimerIndice <em>Primer Indice</em>}</li>
 *   <li>{@link diagramapseudocodigo.impl.ValorMatrizImpl#getSegundoIndice <em>Segundo Indice</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ValorMatrizImpl extends ValorComplejoImpl implements ValorMatriz {
	/**
	 * The default value of the '{@link #getNombre_matriz() <em>Nombre matriz</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombre_matriz()
	 * @generated
	 * @ordered
	 */
	protected static final String NOMBRE_MATRIZ_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNombre_matriz() <em>Nombre matriz</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombre_matriz()
	 * @generated
	 * @ordered
	 */
	protected String nombre_matriz = NOMBRE_MATRIZ_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCampo() <em>Campo</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCampo()
	 * @generated
	 * @ordered
	 */
	protected EList<CampoRegistro> campo;

	/**
	 * The cached value of the '{@link #getPrimerIndice() <em>Primer Indice</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimerIndice()
	 * @generated
	 * @ordered
	 */
	protected operacion primerIndice;

	/**
	 * The cached value of the '{@link #getSegundoIndice() <em>Segundo Indice</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSegundoIndice()
	 * @generated
	 * @ordered
	 */
	protected operacion segundoIndice;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValorMatrizImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DiagramapseudocodigoPackage.Literals.VALOR_MATRIZ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNombre_matriz() {
		return nombre_matriz;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombre_matriz(String newNombre_matriz) {
		String oldNombre_matriz = nombre_matriz;
		nombre_matriz = newNombre_matriz;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiagramapseudocodigoPackage.VALOR_MATRIZ__NOMBRE_MATRIZ, oldNombre_matriz, nombre_matriz));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CampoRegistro> getCampo() {
		if (campo == null) {
			campo = new EObjectContainmentEList<CampoRegistro>(CampoRegistro.class, this, DiagramapseudocodigoPackage.VALOR_MATRIZ__CAMPO);
		}
		return campo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public operacion getPrimerIndice() {
		return primerIndice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrimerIndice(operacion newPrimerIndice, NotificationChain msgs) {
		operacion oldPrimerIndice = primerIndice;
		primerIndice = newPrimerIndice;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DiagramapseudocodigoPackage.VALOR_MATRIZ__PRIMER_INDICE, oldPrimerIndice, newPrimerIndice);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrimerIndice(operacion newPrimerIndice) {
		if (newPrimerIndice != primerIndice) {
			NotificationChain msgs = null;
			if (primerIndice != null)
				msgs = ((InternalEObject)primerIndice).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DiagramapseudocodigoPackage.VALOR_MATRIZ__PRIMER_INDICE, null, msgs);
			if (newPrimerIndice != null)
				msgs = ((InternalEObject)newPrimerIndice).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DiagramapseudocodigoPackage.VALOR_MATRIZ__PRIMER_INDICE, null, msgs);
			msgs = basicSetPrimerIndice(newPrimerIndice, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiagramapseudocodigoPackage.VALOR_MATRIZ__PRIMER_INDICE, newPrimerIndice, newPrimerIndice));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public operacion getSegundoIndice() {
		return segundoIndice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSegundoIndice(operacion newSegundoIndice, NotificationChain msgs) {
		operacion oldSegundoIndice = segundoIndice;
		segundoIndice = newSegundoIndice;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DiagramapseudocodigoPackage.VALOR_MATRIZ__SEGUNDO_INDICE, oldSegundoIndice, newSegundoIndice);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSegundoIndice(operacion newSegundoIndice) {
		if (newSegundoIndice != segundoIndice) {
			NotificationChain msgs = null;
			if (segundoIndice != null)
				msgs = ((InternalEObject)segundoIndice).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DiagramapseudocodigoPackage.VALOR_MATRIZ__SEGUNDO_INDICE, null, msgs);
			if (newSegundoIndice != null)
				msgs = ((InternalEObject)newSegundoIndice).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DiagramapseudocodigoPackage.VALOR_MATRIZ__SEGUNDO_INDICE, null, msgs);
			msgs = basicSetSegundoIndice(newSegundoIndice, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiagramapseudocodigoPackage.VALOR_MATRIZ__SEGUNDO_INDICE, newSegundoIndice, newSegundoIndice));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DiagramapseudocodigoPackage.VALOR_MATRIZ__CAMPO:
				return ((InternalEList<?>)getCampo()).basicRemove(otherEnd, msgs);
			case DiagramapseudocodigoPackage.VALOR_MATRIZ__PRIMER_INDICE:
				return basicSetPrimerIndice(null, msgs);
			case DiagramapseudocodigoPackage.VALOR_MATRIZ__SEGUNDO_INDICE:
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
			case DiagramapseudocodigoPackage.VALOR_MATRIZ__NOMBRE_MATRIZ:
				return getNombre_matriz();
			case DiagramapseudocodigoPackage.VALOR_MATRIZ__CAMPO:
				return getCampo();
			case DiagramapseudocodigoPackage.VALOR_MATRIZ__PRIMER_INDICE:
				return getPrimerIndice();
			case DiagramapseudocodigoPackage.VALOR_MATRIZ__SEGUNDO_INDICE:
				return getSegundoIndice();
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
			case DiagramapseudocodigoPackage.VALOR_MATRIZ__NOMBRE_MATRIZ:
				setNombre_matriz((String)newValue);
				return;
			case DiagramapseudocodigoPackage.VALOR_MATRIZ__CAMPO:
				getCampo().clear();
				getCampo().addAll((Collection<? extends CampoRegistro>)newValue);
				return;
			case DiagramapseudocodigoPackage.VALOR_MATRIZ__PRIMER_INDICE:
				setPrimerIndice((operacion)newValue);
				return;
			case DiagramapseudocodigoPackage.VALOR_MATRIZ__SEGUNDO_INDICE:
				setSegundoIndice((operacion)newValue);
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
			case DiagramapseudocodigoPackage.VALOR_MATRIZ__NOMBRE_MATRIZ:
				setNombre_matriz(NOMBRE_MATRIZ_EDEFAULT);
				return;
			case DiagramapseudocodigoPackage.VALOR_MATRIZ__CAMPO:
				getCampo().clear();
				return;
			case DiagramapseudocodigoPackage.VALOR_MATRIZ__PRIMER_INDICE:
				setPrimerIndice((operacion)null);
				return;
			case DiagramapseudocodigoPackage.VALOR_MATRIZ__SEGUNDO_INDICE:
				setSegundoIndice((operacion)null);
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
			case DiagramapseudocodigoPackage.VALOR_MATRIZ__NOMBRE_MATRIZ:
				return NOMBRE_MATRIZ_EDEFAULT == null ? nombre_matriz != null : !NOMBRE_MATRIZ_EDEFAULT.equals(nombre_matriz);
			case DiagramapseudocodigoPackage.VALOR_MATRIZ__CAMPO:
				return campo != null && !campo.isEmpty();
			case DiagramapseudocodigoPackage.VALOR_MATRIZ__PRIMER_INDICE:
				return primerIndice != null;
			case DiagramapseudocodigoPackage.VALOR_MATRIZ__SEGUNDO_INDICE:
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
		result.append(" (nombre_matriz: ");
		result.append(nombre_matriz);
		result.append(')');
		return result.toString();
	}

} //ValorMatrizImpl
