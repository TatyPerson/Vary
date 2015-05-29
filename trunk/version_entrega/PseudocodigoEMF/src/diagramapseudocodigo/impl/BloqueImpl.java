/**
 */
package diagramapseudocodigo.impl;

import diagramapseudocodigo.Bloque;
import diagramapseudocodigo.DiagramapseudocodigoPackage;
import diagramapseudocodigo.Sentencias;
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
 * An implementation of the model object '<em><b>Bloque</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link diagramapseudocodigo.impl.BloqueImpl#getValor <em>Valor</em>}</li>
 *   <li>{@link diagramapseudocodigo.impl.BloqueImpl#getSentencias <em>Sentencias</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class BloqueImpl extends SentenciasImpl implements Bloque {
	/**
	 * The cached value of the '{@link #getValor() <em>Valor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValor()
	 * @generated
	 * @ordered
	 */
	protected operacion valor;

	/**
	 * The cached value of the '{@link #getSentencias() <em>Sentencias</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSentencias()
	 * @generated
	 * @ordered
	 */
	protected EList<Sentencias> sentencias;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BloqueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DiagramapseudocodigoPackage.Literals.BLOQUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public operacion getValor() {
		return valor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValor(operacion newValor, NotificationChain msgs) {
		operacion oldValor = valor;
		valor = newValor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DiagramapseudocodigoPackage.BLOQUE__VALOR, oldValor, newValor);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValor(operacion newValor) {
		if (newValor != valor) {
			NotificationChain msgs = null;
			if (valor != null)
				msgs = ((InternalEObject)valor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DiagramapseudocodigoPackage.BLOQUE__VALOR, null, msgs);
			if (newValor != null)
				msgs = ((InternalEObject)newValor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DiagramapseudocodigoPackage.BLOQUE__VALOR, null, msgs);
			msgs = basicSetValor(newValor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiagramapseudocodigoPackage.BLOQUE__VALOR, newValor, newValor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Sentencias> getSentencias() {
		if (sentencias == null) {
			sentencias = new EObjectContainmentEList<Sentencias>(Sentencias.class, this, DiagramapseudocodigoPackage.BLOQUE__SENTENCIAS);
		}
		return sentencias;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DiagramapseudocodigoPackage.BLOQUE__VALOR:
				return basicSetValor(null, msgs);
			case DiagramapseudocodigoPackage.BLOQUE__SENTENCIAS:
				return ((InternalEList<?>)getSentencias()).basicRemove(otherEnd, msgs);
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
			case DiagramapseudocodigoPackage.BLOQUE__VALOR:
				return getValor();
			case DiagramapseudocodigoPackage.BLOQUE__SENTENCIAS:
				return getSentencias();
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
			case DiagramapseudocodigoPackage.BLOQUE__VALOR:
				setValor((operacion)newValue);
				return;
			case DiagramapseudocodigoPackage.BLOQUE__SENTENCIAS:
				getSentencias().clear();
				getSentencias().addAll((Collection<? extends Sentencias>)newValue);
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
			case DiagramapseudocodigoPackage.BLOQUE__VALOR:
				setValor((operacion)null);
				return;
			case DiagramapseudocodigoPackage.BLOQUE__SENTENCIAS:
				getSentencias().clear();
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
			case DiagramapseudocodigoPackage.BLOQUE__VALOR:
				return valor != null;
			case DiagramapseudocodigoPackage.BLOQUE__SENTENCIAS:
				return sentencias != null && !sentencias.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //BloqueImpl
