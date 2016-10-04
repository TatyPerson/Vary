/**
 */
package diagramapseudocodigo.impl;

import diagramapseudocodigo.Declaracion;
import diagramapseudocodigo.DiagramapseudocodigoPackage;
import diagramapseudocodigo.Inicio;
import diagramapseudocodigo.Sentencia;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Inicio</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link diagramapseudocodigo.impl.InicioImpl#getSentencias <em>Sentencias</em>}</li>
 *   <li>{@link diagramapseudocodigo.impl.InicioImpl#getDeclaraciones <em>Declaraciones</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InicioImpl extends MinimalEObjectImpl.Container implements Inicio {
	/**
	 * The cached value of the '{@link #getSentencias() <em>Sentencias</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSentencias()
	 * @generated
	 * @ordered
	 */
	protected EList<Sentencia> sentencias;

	/**
	 * The cached value of the '{@link #getDeclaraciones() <em>Declaraciones</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeclaraciones()
	 * @generated
	 * @ordered
	 */
	protected EList<Declaracion> declaraciones;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InicioImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DiagramapseudocodigoPackage.Literals.INICIO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Sentencia> getSentencias() {
		if (sentencias == null) {
			sentencias = new EObjectContainmentEList<Sentencia>(Sentencia.class, this, DiagramapseudocodigoPackage.INICIO__SENTENCIAS);
		}
		return sentencias;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Declaracion> getDeclaraciones() {
		if (declaraciones == null) {
			declaraciones = new EObjectContainmentEList<Declaracion>(Declaracion.class, this, DiagramapseudocodigoPackage.INICIO__DECLARACIONES);
		}
		return declaraciones;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DiagramapseudocodigoPackage.INICIO__SENTENCIAS:
				return ((InternalEList<?>)getSentencias()).basicRemove(otherEnd, msgs);
			case DiagramapseudocodigoPackage.INICIO__DECLARACIONES:
				return ((InternalEList<?>)getDeclaraciones()).basicRemove(otherEnd, msgs);
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
			case DiagramapseudocodigoPackage.INICIO__SENTENCIAS:
				return getSentencias();
			case DiagramapseudocodigoPackage.INICIO__DECLARACIONES:
				return getDeclaraciones();
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
			case DiagramapseudocodigoPackage.INICIO__SENTENCIAS:
				getSentencias().clear();
				getSentencias().addAll((Collection<? extends Sentencia>)newValue);
				return;
			case DiagramapseudocodigoPackage.INICIO__DECLARACIONES:
				getDeclaraciones().clear();
				getDeclaraciones().addAll((Collection<? extends Declaracion>)newValue);
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
			case DiagramapseudocodigoPackage.INICIO__SENTENCIAS:
				getSentencias().clear();
				return;
			case DiagramapseudocodigoPackage.INICIO__DECLARACIONES:
				getDeclaraciones().clear();
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
			case DiagramapseudocodigoPackage.INICIO__SENTENCIAS:
				return sentencias != null && !sentencias.isEmpty();
			case DiagramapseudocodigoPackage.INICIO__DECLARACIONES:
				return declaraciones != null && !declaraciones.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //InicioImpl
