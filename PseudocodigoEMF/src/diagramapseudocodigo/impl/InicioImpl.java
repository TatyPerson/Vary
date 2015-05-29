/**
 */
package diagramapseudocodigo.impl;

import diagramapseudocodigo.Declaracion;
import diagramapseudocodigo.DiagramapseudocodigoPackage;
import diagramapseudocodigo.Inicio;
import diagramapseudocodigo.Sentencias;
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
 * <ul>
 *   <li>{@link diagramapseudocodigo.impl.InicioImpl#getTiene <em>Tiene</em>}</li>
 *   <li>{@link diagramapseudocodigo.impl.InicioImpl#getDeclaracion <em>Declaracion</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InicioImpl extends MinimalEObjectImpl.Container implements Inicio {
	/**
	 * The cached value of the '{@link #getTiene() <em>Tiene</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTiene()
	 * @generated
	 * @ordered
	 */
	protected EList<Sentencias> tiene;

	/**
	 * The cached value of the '{@link #getDeclaracion() <em>Declaracion</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeclaracion()
	 * @generated
	 * @ordered
	 */
	protected EList<Declaracion> declaracion;

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
	public EList<Sentencias> getTiene() {
		if (tiene == null) {
			tiene = new EObjectContainmentEList<Sentencias>(Sentencias.class, this, DiagramapseudocodigoPackage.INICIO__TIENE);
		}
		return tiene;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Declaracion> getDeclaracion() {
		if (declaracion == null) {
			declaracion = new EObjectContainmentEList<Declaracion>(Declaracion.class, this, DiagramapseudocodigoPackage.INICIO__DECLARACION);
		}
		return declaracion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DiagramapseudocodigoPackage.INICIO__TIENE:
				return ((InternalEList<?>)getTiene()).basicRemove(otherEnd, msgs);
			case DiagramapseudocodigoPackage.INICIO__DECLARACION:
				return ((InternalEList<?>)getDeclaracion()).basicRemove(otherEnd, msgs);
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
			case DiagramapseudocodigoPackage.INICIO__TIENE:
				return getTiene();
			case DiagramapseudocodigoPackage.INICIO__DECLARACION:
				return getDeclaracion();
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
			case DiagramapseudocodigoPackage.INICIO__TIENE:
				getTiene().clear();
				getTiene().addAll((Collection<? extends Sentencias>)newValue);
				return;
			case DiagramapseudocodigoPackage.INICIO__DECLARACION:
				getDeclaracion().clear();
				getDeclaracion().addAll((Collection<? extends Declaracion>)newValue);
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
			case DiagramapseudocodigoPackage.INICIO__TIENE:
				getTiene().clear();
				return;
			case DiagramapseudocodigoPackage.INICIO__DECLARACION:
				getDeclaracion().clear();
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
			case DiagramapseudocodigoPackage.INICIO__TIENE:
				return tiene != null && !tiene.isEmpty();
			case DiagramapseudocodigoPackage.INICIO__DECLARACION:
				return declaracion != null && !declaracion.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //InicioImpl
