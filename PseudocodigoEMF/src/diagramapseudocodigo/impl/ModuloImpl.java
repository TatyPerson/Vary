/**
 */
package diagramapseudocodigo.impl;

import diagramapseudocodigo.CabeceraSubproceso;
import diagramapseudocodigo.Declaracion;
import diagramapseudocodigo.DiagramapseudocodigoPackage;
import diagramapseudocodigo.Implementacion;
import diagramapseudocodigo.Modulo;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Modulo</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link diagramapseudocodigo.impl.ModuloImpl#getNombre <em>Nombre</em>}</li>
 *   <li>{@link diagramapseudocodigo.impl.ModuloImpl#getImplementacion <em>Implementacion</em>}</li>
 *   <li>{@link diagramapseudocodigo.impl.ModuloImpl#getImportaciones <em>Importaciones</em>}</li>
 *   <li>{@link diagramapseudocodigo.impl.ModuloImpl#getExporta_globales <em>Exporta globales</em>}</li>
 *   <li>{@link diagramapseudocodigo.impl.ModuloImpl#getExporta_tipos <em>Exporta tipos</em>}</li>
 *   <li>{@link diagramapseudocodigo.impl.ModuloImpl#getExporta_constantes <em>Exporta constantes</em>}</li>
 *   <li>{@link diagramapseudocodigo.impl.ModuloImpl#getExporta_subprocesos <em>Exporta subprocesos</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModuloImpl extends CodigoImpl implements Modulo {
	/**
	 * The default value of the '{@link #getNombre() <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombre()
	 * @generated
	 * @ordered
	 */
	protected static final String NOMBRE_EDEFAULT = "";

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
	 * The cached value of the '{@link #getImplementacion() <em>Implementacion</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplementacion()
	 * @generated
	 * @ordered
	 */
	protected Implementacion implementacion;

	/**
	 * The cached value of the '{@link #getImportaciones() <em>Importaciones</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportaciones()
	 * @generated
	 * @ordered
	 */
	protected EList<Modulo> importaciones;

	/**
	 * The cached value of the '{@link #getExporta_globales() <em>Exporta globales</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExporta_globales()
	 * @generated
	 * @ordered
	 */
	protected EList<Declaracion> exporta_globales;

	/**
	 * The cached value of the '{@link #getExporta_tipos() <em>Exporta tipos</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExporta_tipos()
	 * @generated
	 * @ordered
	 */
	protected EList<String> exporta_tipos;

	/**
	 * The cached value of the '{@link #getExporta_constantes() <em>Exporta constantes</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExporta_constantes()
	 * @generated
	 * @ordered
	 */
	protected EList<String> exporta_constantes;

	/**
	 * The cached value of the '{@link #getExporta_subprocesos() <em>Exporta subprocesos</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExporta_subprocesos()
	 * @generated
	 * @ordered
	 */
	protected EList<CabeceraSubproceso> exporta_subprocesos;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModuloImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DiagramapseudocodigoPackage.Literals.MODULO;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DiagramapseudocodigoPackage.MODULO__NOMBRE, oldNombre, nombre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Implementacion getImplementacion() {
		return implementacion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImplementacion(Implementacion newImplementacion, NotificationChain msgs) {
		Implementacion oldImplementacion = implementacion;
		implementacion = newImplementacion;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DiagramapseudocodigoPackage.MODULO__IMPLEMENTACION, oldImplementacion, newImplementacion);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImplementacion(Implementacion newImplementacion) {
		if (newImplementacion != implementacion) {
			NotificationChain msgs = null;
			if (implementacion != null)
				msgs = ((InternalEObject)implementacion).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DiagramapseudocodigoPackage.MODULO__IMPLEMENTACION, null, msgs);
			if (newImplementacion != null)
				msgs = ((InternalEObject)newImplementacion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DiagramapseudocodigoPackage.MODULO__IMPLEMENTACION, null, msgs);
			msgs = basicSetImplementacion(newImplementacion, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiagramapseudocodigoPackage.MODULO__IMPLEMENTACION, newImplementacion, newImplementacion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Modulo> getImportaciones() {
		if (importaciones == null) {
			importaciones = new EObjectResolvingEList<Modulo>(Modulo.class, this, DiagramapseudocodigoPackage.MODULO__IMPORTACIONES);
		}
		return importaciones;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Declaracion> getExporta_globales() {
		if (exporta_globales == null) {
			exporta_globales = new EObjectContainmentEList<Declaracion>(Declaracion.class, this, DiagramapseudocodigoPackage.MODULO__EXPORTA_GLOBALES);
		}
		return exporta_globales;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getExporta_tipos() {
		if (exporta_tipos == null) {
			exporta_tipos = new EDataTypeEList<String>(String.class, this, DiagramapseudocodigoPackage.MODULO__EXPORTA_TIPOS);
		}
		return exporta_tipos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getExporta_constantes() {
		if (exporta_constantes == null) {
			exporta_constantes = new EDataTypeEList<String>(String.class, this, DiagramapseudocodigoPackage.MODULO__EXPORTA_CONSTANTES);
		}
		return exporta_constantes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CabeceraSubproceso> getExporta_subprocesos() {
		if (exporta_subprocesos == null) {
			exporta_subprocesos = new EObjectContainmentEList<CabeceraSubproceso>(CabeceraSubproceso.class, this, DiagramapseudocodigoPackage.MODULO__EXPORTA_SUBPROCESOS);
		}
		return exporta_subprocesos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DiagramapseudocodigoPackage.MODULO__IMPLEMENTACION:
				return basicSetImplementacion(null, msgs);
			case DiagramapseudocodigoPackage.MODULO__EXPORTA_GLOBALES:
				return ((InternalEList<?>)getExporta_globales()).basicRemove(otherEnd, msgs);
			case DiagramapseudocodigoPackage.MODULO__EXPORTA_SUBPROCESOS:
				return ((InternalEList<?>)getExporta_subprocesos()).basicRemove(otherEnd, msgs);
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
			case DiagramapseudocodigoPackage.MODULO__NOMBRE:
				return getNombre();
			case DiagramapseudocodigoPackage.MODULO__IMPLEMENTACION:
				return getImplementacion();
			case DiagramapseudocodigoPackage.MODULO__IMPORTACIONES:
				return getImportaciones();
			case DiagramapseudocodigoPackage.MODULO__EXPORTA_GLOBALES:
				return getExporta_globales();
			case DiagramapseudocodigoPackage.MODULO__EXPORTA_TIPOS:
				return getExporta_tipos();
			case DiagramapseudocodigoPackage.MODULO__EXPORTA_CONSTANTES:
				return getExporta_constantes();
			case DiagramapseudocodigoPackage.MODULO__EXPORTA_SUBPROCESOS:
				return getExporta_subprocesos();
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
			case DiagramapseudocodigoPackage.MODULO__NOMBRE:
				setNombre((String)newValue);
				return;
			case DiagramapseudocodigoPackage.MODULO__IMPLEMENTACION:
				setImplementacion((Implementacion)newValue);
				return;
			case DiagramapseudocodigoPackage.MODULO__IMPORTACIONES:
				getImportaciones().clear();
				getImportaciones().addAll((Collection<? extends Modulo>)newValue);
				return;
			case DiagramapseudocodigoPackage.MODULO__EXPORTA_GLOBALES:
				getExporta_globales().clear();
				getExporta_globales().addAll((Collection<? extends Declaracion>)newValue);
				return;
			case DiagramapseudocodigoPackage.MODULO__EXPORTA_TIPOS:
				getExporta_tipos().clear();
				getExporta_tipos().addAll((Collection<? extends String>)newValue);
				return;
			case DiagramapseudocodigoPackage.MODULO__EXPORTA_CONSTANTES:
				getExporta_constantes().clear();
				getExporta_constantes().addAll((Collection<? extends String>)newValue);
				return;
			case DiagramapseudocodigoPackage.MODULO__EXPORTA_SUBPROCESOS:
				getExporta_subprocesos().clear();
				getExporta_subprocesos().addAll((Collection<? extends CabeceraSubproceso>)newValue);
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
			case DiagramapseudocodigoPackage.MODULO__NOMBRE:
				setNombre(NOMBRE_EDEFAULT);
				return;
			case DiagramapseudocodigoPackage.MODULO__IMPLEMENTACION:
				setImplementacion((Implementacion)null);
				return;
			case DiagramapseudocodigoPackage.MODULO__IMPORTACIONES:
				getImportaciones().clear();
				return;
			case DiagramapseudocodigoPackage.MODULO__EXPORTA_GLOBALES:
				getExporta_globales().clear();
				return;
			case DiagramapseudocodigoPackage.MODULO__EXPORTA_TIPOS:
				getExporta_tipos().clear();
				return;
			case DiagramapseudocodigoPackage.MODULO__EXPORTA_CONSTANTES:
				getExporta_constantes().clear();
				return;
			case DiagramapseudocodigoPackage.MODULO__EXPORTA_SUBPROCESOS:
				getExporta_subprocesos().clear();
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
			case DiagramapseudocodigoPackage.MODULO__NOMBRE:
				return NOMBRE_EDEFAULT == null ? nombre != null : !NOMBRE_EDEFAULT.equals(nombre);
			case DiagramapseudocodigoPackage.MODULO__IMPLEMENTACION:
				return implementacion != null;
			case DiagramapseudocodigoPackage.MODULO__IMPORTACIONES:
				return importaciones != null && !importaciones.isEmpty();
			case DiagramapseudocodigoPackage.MODULO__EXPORTA_GLOBALES:
				return exporta_globales != null && !exporta_globales.isEmpty();
			case DiagramapseudocodigoPackage.MODULO__EXPORTA_TIPOS:
				return exporta_tipos != null && !exporta_tipos.isEmpty();
			case DiagramapseudocodigoPackage.MODULO__EXPORTA_CONSTANTES:
				return exporta_constantes != null && !exporta_constantes.isEmpty();
			case DiagramapseudocodigoPackage.MODULO__EXPORTA_SUBPROCESOS:
				return exporta_subprocesos != null && !exporta_subprocesos.isEmpty();
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
		result.append(" (nombre: ");
		result.append(nombre);
		result.append(", exporta_tipos: ");
		result.append(exporta_tipos);
		result.append(", exporta_constantes: ");
		result.append(exporta_constantes);
		result.append(')');
		return result.toString();
	}

} //ModuloImpl
