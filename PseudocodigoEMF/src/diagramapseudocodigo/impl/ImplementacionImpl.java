/**
 */
package diagramapseudocodigo.impl;

import diagramapseudocodigo.Constantes;
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
 *   <li>{@link diagramapseudocodigo.impl.ImplementacionImpl#getFuncion <em>Funcion</em>}</li>
 *   <li>{@link diagramapseudocodigo.impl.ImplementacionImpl#getGlobal <em>Global</em>}</li>
 *   <li>{@link diagramapseudocodigo.impl.ImplementacionImpl#getConstantes <em>Constantes</em>}</li>
 *   <li>{@link diagramapseudocodigo.impl.ImplementacionImpl#getTipocomplejo <em>Tipocomplejo</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImplementacionImpl extends MinimalEObjectImpl.Container implements Implementacion {
	/**
	 * The cached value of the '{@link #getFuncion() <em>Funcion</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFuncion()
	 * @generated
	 * @ordered
	 */
	protected EList<Subproceso> funcion;

	/**
	 * The cached value of the '{@link #getGlobal() <em>Global</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlobal()
	 * @generated
	 * @ordered
	 */
	protected EList<Declaracion> global;

	/**
	 * The cached value of the '{@link #getConstantes() <em>Constantes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstantes()
	 * @generated
	 * @ordered
	 */
	protected EList<Constantes> constantes;

	/**
	 * The cached value of the '{@link #getTipocomplejo() <em>Tipocomplejo</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTipocomplejo()
	 * @generated
	 * @ordered
	 */
	protected EList<TipoComplejo> tipocomplejo;

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
	public EList<Subproceso> getFuncion() {
		if (funcion == null) {
			funcion = new EObjectContainmentEList<Subproceso>(Subproceso.class, this, DiagramapseudocodigoPackage.IMPLEMENTACION__FUNCION);
		}
		return funcion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Declaracion> getGlobal() {
		if (global == null) {
			global = new EObjectContainmentEList<Declaracion>(Declaracion.class, this, DiagramapseudocodigoPackage.IMPLEMENTACION__GLOBAL);
		}
		return global;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Constantes> getConstantes() {
		if (constantes == null) {
			constantes = new EObjectContainmentEList<Constantes>(Constantes.class, this, DiagramapseudocodigoPackage.IMPLEMENTACION__CONSTANTES);
		}
		return constantes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TipoComplejo> getTipocomplejo() {
		if (tipocomplejo == null) {
			tipocomplejo = new EObjectContainmentEList<TipoComplejo>(TipoComplejo.class, this, DiagramapseudocodigoPackage.IMPLEMENTACION__TIPOCOMPLEJO);
		}
		return tipocomplejo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DiagramapseudocodigoPackage.IMPLEMENTACION__FUNCION:
				return ((InternalEList<?>)getFuncion()).basicRemove(otherEnd, msgs);
			case DiagramapseudocodigoPackage.IMPLEMENTACION__GLOBAL:
				return ((InternalEList<?>)getGlobal()).basicRemove(otherEnd, msgs);
			case DiagramapseudocodigoPackage.IMPLEMENTACION__CONSTANTES:
				return ((InternalEList<?>)getConstantes()).basicRemove(otherEnd, msgs);
			case DiagramapseudocodigoPackage.IMPLEMENTACION__TIPOCOMPLEJO:
				return ((InternalEList<?>)getTipocomplejo()).basicRemove(otherEnd, msgs);
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
			case DiagramapseudocodigoPackage.IMPLEMENTACION__FUNCION:
				return getFuncion();
			case DiagramapseudocodigoPackage.IMPLEMENTACION__GLOBAL:
				return getGlobal();
			case DiagramapseudocodigoPackage.IMPLEMENTACION__CONSTANTES:
				return getConstantes();
			case DiagramapseudocodigoPackage.IMPLEMENTACION__TIPOCOMPLEJO:
				return getTipocomplejo();
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
			case DiagramapseudocodigoPackage.IMPLEMENTACION__FUNCION:
				getFuncion().clear();
				getFuncion().addAll((Collection<? extends Subproceso>)newValue);
				return;
			case DiagramapseudocodigoPackage.IMPLEMENTACION__GLOBAL:
				getGlobal().clear();
				getGlobal().addAll((Collection<? extends Declaracion>)newValue);
				return;
			case DiagramapseudocodigoPackage.IMPLEMENTACION__CONSTANTES:
				getConstantes().clear();
				getConstantes().addAll((Collection<? extends Constantes>)newValue);
				return;
			case DiagramapseudocodigoPackage.IMPLEMENTACION__TIPOCOMPLEJO:
				getTipocomplejo().clear();
				getTipocomplejo().addAll((Collection<? extends TipoComplejo>)newValue);
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
			case DiagramapseudocodigoPackage.IMPLEMENTACION__FUNCION:
				getFuncion().clear();
				return;
			case DiagramapseudocodigoPackage.IMPLEMENTACION__GLOBAL:
				getGlobal().clear();
				return;
			case DiagramapseudocodigoPackage.IMPLEMENTACION__CONSTANTES:
				getConstantes().clear();
				return;
			case DiagramapseudocodigoPackage.IMPLEMENTACION__TIPOCOMPLEJO:
				getTipocomplejo().clear();
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
			case DiagramapseudocodigoPackage.IMPLEMENTACION__FUNCION:
				return funcion != null && !funcion.isEmpty();
			case DiagramapseudocodigoPackage.IMPLEMENTACION__GLOBAL:
				return global != null && !global.isEmpty();
			case DiagramapseudocodigoPackage.IMPLEMENTACION__CONSTANTES:
				return constantes != null && !constantes.isEmpty();
			case DiagramapseudocodigoPackage.IMPLEMENTACION__TIPOCOMPLEJO:
				return tipocomplejo != null && !tipocomplejo.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ImplementacionImpl
