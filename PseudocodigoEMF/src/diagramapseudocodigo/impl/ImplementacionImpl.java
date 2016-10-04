/**
 */
package diagramapseudocodigo.impl;

import diagramapseudocodigo.Constante;
import diagramapseudocodigo.Declaracion;
import diagramapseudocodigo.DiagramapseudocodigoPackage;
import diagramapseudocodigo.Implementacion;
import diagramapseudocodigo.Subproceso;
import diagramapseudocodigo.TipoComplejo;

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
 * An implementation of the model object '<em><b>Implementacion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link diagramapseudocodigo.impl.ImplementacionImpl#getSubprocesos <em>Subprocesos</em>}</li>
 *   <li>{@link diagramapseudocodigo.impl.ImplementacionImpl#getGlobales <em>Globales</em>}</li>
 *   <li>{@link diagramapseudocodigo.impl.ImplementacionImpl#getConstantes <em>Constantes</em>}</li>
 *   <li>{@link diagramapseudocodigo.impl.ImplementacionImpl#getComplejos <em>Complejos</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImplementacionImpl extends MinimalEObjectImpl.Container implements Implementacion {
	/**
	 * The cached value of the '{@link #getSubprocesos() <em>Subprocesos</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubprocesos()
	 * @generated
	 * @ordered
	 */
	protected EList<Subproceso> subprocesos;

	/**
	 * The cached value of the '{@link #getGlobales() <em>Globales</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlobales()
	 * @generated
	 * @ordered
	 */
	protected EList<Declaracion> globales;

	/**
	 * The cached value of the '{@link #getConstantes() <em>Constantes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstantes()
	 * @generated
	 * @ordered
	 */
	protected EList<Constante> constantes;

	/**
	 * The cached value of the '{@link #getComplejos() <em>Complejos</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComplejos()
	 * @generated
	 * @ordered
	 */
	protected EList<TipoComplejo> complejos;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImplementacionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DiagramapseudocodigoPackage.Literals.IMPLEMENTACION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Subproceso> getSubprocesos() {
		if (subprocesos == null) {
			subprocesos = new EObjectContainmentEList<Subproceso>(Subproceso.class, this, DiagramapseudocodigoPackage.IMPLEMENTACION__SUBPROCESOS);
		}
		return subprocesos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Declaracion> getGlobales() {
		if (globales == null) {
			globales = new EObjectContainmentEList<Declaracion>(Declaracion.class, this, DiagramapseudocodigoPackage.IMPLEMENTACION__GLOBALES);
		}
		return globales;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Constante> getConstantes() {
		if (constantes == null) {
			constantes = new EObjectContainmentEList<Constante>(Constante.class, this, DiagramapseudocodigoPackage.IMPLEMENTACION__CONSTANTES);
		}
		return constantes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TipoComplejo> getComplejos() {
		if (complejos == null) {
			complejos = new EObjectContainmentEList<TipoComplejo>(TipoComplejo.class, this, DiagramapseudocodigoPackage.IMPLEMENTACION__COMPLEJOS);
		}
		return complejos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DiagramapseudocodigoPackage.IMPLEMENTACION__SUBPROCESOS:
				return ((InternalEList<?>)getSubprocesos()).basicRemove(otherEnd, msgs);
			case DiagramapseudocodigoPackage.IMPLEMENTACION__GLOBALES:
				return ((InternalEList<?>)getGlobales()).basicRemove(otherEnd, msgs);
			case DiagramapseudocodigoPackage.IMPLEMENTACION__CONSTANTES:
				return ((InternalEList<?>)getConstantes()).basicRemove(otherEnd, msgs);
			case DiagramapseudocodigoPackage.IMPLEMENTACION__COMPLEJOS:
				return ((InternalEList<?>)getComplejos()).basicRemove(otherEnd, msgs);
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
			case DiagramapseudocodigoPackage.IMPLEMENTACION__SUBPROCESOS:
				return getSubprocesos();
			case DiagramapseudocodigoPackage.IMPLEMENTACION__GLOBALES:
				return getGlobales();
			case DiagramapseudocodigoPackage.IMPLEMENTACION__CONSTANTES:
				return getConstantes();
			case DiagramapseudocodigoPackage.IMPLEMENTACION__COMPLEJOS:
				return getComplejos();
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
			case DiagramapseudocodigoPackage.IMPLEMENTACION__SUBPROCESOS:
				getSubprocesos().clear();
				getSubprocesos().addAll((Collection<? extends Subproceso>)newValue);
				return;
			case DiagramapseudocodigoPackage.IMPLEMENTACION__GLOBALES:
				getGlobales().clear();
				getGlobales().addAll((Collection<? extends Declaracion>)newValue);
				return;
			case DiagramapseudocodigoPackage.IMPLEMENTACION__CONSTANTES:
				getConstantes().clear();
				getConstantes().addAll((Collection<? extends Constante>)newValue);
				return;
			case DiagramapseudocodigoPackage.IMPLEMENTACION__COMPLEJOS:
				getComplejos().clear();
				getComplejos().addAll((Collection<? extends TipoComplejo>)newValue);
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
			case DiagramapseudocodigoPackage.IMPLEMENTACION__SUBPROCESOS:
				getSubprocesos().clear();
				return;
			case DiagramapseudocodigoPackage.IMPLEMENTACION__GLOBALES:
				getGlobales().clear();
				return;
			case DiagramapseudocodigoPackage.IMPLEMENTACION__CONSTANTES:
				getConstantes().clear();
				return;
			case DiagramapseudocodigoPackage.IMPLEMENTACION__COMPLEJOS:
				getComplejos().clear();
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
			case DiagramapseudocodigoPackage.IMPLEMENTACION__SUBPROCESOS:
				return subprocesos != null && !subprocesos.isEmpty();
			case DiagramapseudocodigoPackage.IMPLEMENTACION__GLOBALES:
				return globales != null && !globales.isEmpty();
			case DiagramapseudocodigoPackage.IMPLEMENTACION__CONSTANTES:
				return constantes != null && !constantes.isEmpty();
			case DiagramapseudocodigoPackage.IMPLEMENTACION__COMPLEJOS:
				return complejos != null && !complejos.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ImplementacionImpl
