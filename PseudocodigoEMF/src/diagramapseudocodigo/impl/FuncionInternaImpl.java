/**
 */
package diagramapseudocodigo.impl;

import diagramapseudocodigo.DiagramapseudocodigoPackage;
import diagramapseudocodigo.FuncionInterna;
import diagramapseudocodigo.Operacion;
import diagramapseudocodigo.Sentencia;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Funcion Interna</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link diagramapseudocodigo.impl.FuncionInternaImpl#getEAttribute0rence0 <em>EAttribute0rence0</em>}</li>
 *   <li>{@link diagramapseudocodigo.impl.FuncionInternaImpl#getNegacionesFinales <em>Negaciones Finales</em>}</li>
 *   <li>{@link diagramapseudocodigo.impl.FuncionInternaImpl#getNegacionesIniciales <em>Negaciones Iniciales</em>}</li>
 *   <li>{@link diagramapseudocodigo.impl.FuncionInternaImpl#getNombre <em>Nombre</em>}</li>
 *   <li>{@link diagramapseudocodigo.impl.FuncionInternaImpl#getOperadores <em>Operadores</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FuncionInternaImpl extends ValorImpl implements FuncionInterna {
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
	 * The default value of the '{@link #getNombre() <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombre()
	 * @generated
	 * @ordered
	 */
	protected static final String NOMBRE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNombre() <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombre()
	 * @generated
	 * @ordered
	 */
	protected String nombre = NOMBRE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOperadores() <em>Operadores</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperadores()
	 * @generated
	 * @ordered
	 */
	protected EList<Operacion> operadores;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FuncionInternaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DiagramapseudocodigoPackage.Literals.FUNCION_INTERNA;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DiagramapseudocodigoPackage.FUNCION_INTERNA__EATTRIBUTE0RENCE0, oldEAttribute0rence0, eAttribute0rence0));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DiagramapseudocodigoPackage.FUNCION_INTERNA__EATTRIBUTE0RENCE0, oldEAttribute0rence0, eAttribute0rence0));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getNegacionesFinales() {
		if (negacionesFinales == null) {
			negacionesFinales = new EDataTypeUniqueEList<String>(String.class, this, DiagramapseudocodigoPackage.FUNCION_INTERNA__NEGACIONES_FINALES);
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
			negacionesIniciales = new EDataTypeUniqueEList<String>(String.class, this, DiagramapseudocodigoPackage.FUNCION_INTERNA__NEGACIONES_INICIALES);
		}
		return negacionesIniciales;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombre(String newNombre) {
		String oldNombre = nombre;
		nombre = newNombre;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiagramapseudocodigoPackage.FUNCION_INTERNA__NOMBRE, oldNombre, nombre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Operacion> getOperadores() {
		if (operadores == null) {
			operadores = new EObjectContainmentEList<Operacion>(Operacion.class, this, DiagramapseudocodigoPackage.FUNCION_INTERNA__OPERADORES);
		}
		return operadores;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DiagramapseudocodigoPackage.FUNCION_INTERNA__OPERADORES:
				return ((InternalEList<?>)getOperadores()).basicRemove(otherEnd, msgs);
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
			case DiagramapseudocodigoPackage.FUNCION_INTERNA__EATTRIBUTE0RENCE0:
				if (resolve) return getEAttribute0rence0();
				return basicGetEAttribute0rence0();
			case DiagramapseudocodigoPackage.FUNCION_INTERNA__NEGACIONES_FINALES:
				return getNegacionesFinales();
			case DiagramapseudocodigoPackage.FUNCION_INTERNA__NEGACIONES_INICIALES:
				return getNegacionesIniciales();
			case DiagramapseudocodigoPackage.FUNCION_INTERNA__NOMBRE:
				return getNombre();
			case DiagramapseudocodigoPackage.FUNCION_INTERNA__OPERADORES:
				return getOperadores();
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
			case DiagramapseudocodigoPackage.FUNCION_INTERNA__EATTRIBUTE0RENCE0:
				setEAttribute0rence0((Operacion)newValue);
				return;
			case DiagramapseudocodigoPackage.FUNCION_INTERNA__NEGACIONES_FINALES:
				getNegacionesFinales().clear();
				getNegacionesFinales().addAll((Collection<? extends String>)newValue);
				return;
			case DiagramapseudocodigoPackage.FUNCION_INTERNA__NEGACIONES_INICIALES:
				getNegacionesIniciales().clear();
				getNegacionesIniciales().addAll((Collection<? extends String>)newValue);
				return;
			case DiagramapseudocodigoPackage.FUNCION_INTERNA__NOMBRE:
				setNombre((String)newValue);
				return;
			case DiagramapseudocodigoPackage.FUNCION_INTERNA__OPERADORES:
				getOperadores().clear();
				getOperadores().addAll((Collection<? extends Operacion>)newValue);
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
			case DiagramapseudocodigoPackage.FUNCION_INTERNA__EATTRIBUTE0RENCE0:
				setEAttribute0rence0((Operacion)null);
				return;
			case DiagramapseudocodigoPackage.FUNCION_INTERNA__NEGACIONES_FINALES:
				getNegacionesFinales().clear();
				return;
			case DiagramapseudocodigoPackage.FUNCION_INTERNA__NEGACIONES_INICIALES:
				getNegacionesIniciales().clear();
				return;
			case DiagramapseudocodigoPackage.FUNCION_INTERNA__NOMBRE:
				setNombre(NOMBRE_EDEFAULT);
				return;
			case DiagramapseudocodigoPackage.FUNCION_INTERNA__OPERADORES:
				getOperadores().clear();
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
			case DiagramapseudocodigoPackage.FUNCION_INTERNA__EATTRIBUTE0RENCE0:
				return eAttribute0rence0 != null;
			case DiagramapseudocodigoPackage.FUNCION_INTERNA__NEGACIONES_FINALES:
				return negacionesFinales != null && !negacionesFinales.isEmpty();
			case DiagramapseudocodigoPackage.FUNCION_INTERNA__NEGACIONES_INICIALES:
				return negacionesIniciales != null && !negacionesIniciales.isEmpty();
			case DiagramapseudocodigoPackage.FUNCION_INTERNA__NOMBRE:
				return NOMBRE_EDEFAULT == null ? nombre != null : !NOMBRE_EDEFAULT.equals(nombre);
			case DiagramapseudocodigoPackage.FUNCION_INTERNA__OPERADORES:
				return operadores != null && !operadores.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Sentencia.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == Operacion.class) {
			switch (derivedFeatureID) {
				case DiagramapseudocodigoPackage.FUNCION_INTERNA__EATTRIBUTE0RENCE0: return DiagramapseudocodigoPackage.OPERACION__EATTRIBUTE0RENCE0;
				case DiagramapseudocodigoPackage.FUNCION_INTERNA__NEGACIONES_FINALES: return DiagramapseudocodigoPackage.OPERACION__NEGACIONES_FINALES;
				case DiagramapseudocodigoPackage.FUNCION_INTERNA__NEGACIONES_INICIALES: return DiagramapseudocodigoPackage.OPERACION__NEGACIONES_INICIALES;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == Sentencia.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == Operacion.class) {
			switch (baseFeatureID) {
				case DiagramapseudocodigoPackage.OPERACION__EATTRIBUTE0RENCE0: return DiagramapseudocodigoPackage.FUNCION_INTERNA__EATTRIBUTE0RENCE0;
				case DiagramapseudocodigoPackage.OPERACION__NEGACIONES_FINALES: return DiagramapseudocodigoPackage.FUNCION_INTERNA__NEGACIONES_FINALES;
				case DiagramapseudocodigoPackage.OPERACION__NEGACIONES_INICIALES: return DiagramapseudocodigoPackage.FUNCION_INTERNA__NEGACIONES_INICIALES;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(", nombre: ");
		result.append(nombre);
		result.append(')');
		return result.toString();
	}

} //FuncionInternaImpl
