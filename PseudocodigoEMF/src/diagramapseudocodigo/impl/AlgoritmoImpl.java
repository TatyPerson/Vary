/**
 */
package diagramapseudocodigo.impl;

import diagramapseudocodigo.Algoritmo;
import diagramapseudocodigo.Comentario;
import diagramapseudocodigo.Constante;
import diagramapseudocodigo.Declaracion;
import diagramapseudocodigo.DiagramapseudocodigoPackage;
import diagramapseudocodigo.Inicio;
import diagramapseudocodigo.Modulo;
import diagramapseudocodigo.Subproceso;
import diagramapseudocodigo.TipoComplejo;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Algoritmo</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link diagramapseudocodigo.impl.AlgoritmoImpl#getInicio <em>Inicio</em>}</li>
 *   <li>{@link diagramapseudocodigo.impl.AlgoritmoImpl#getSubprocesos <em>Subprocesos</em>}</li>
 *   <li>{@link diagramapseudocodigo.impl.AlgoritmoImpl#getNombre <em>Nombre</em>}</li>
 *   <li>{@link diagramapseudocodigo.impl.AlgoritmoImpl#getConstantes <em>Constantes</em>}</li>
 *   <li>{@link diagramapseudocodigo.impl.AlgoritmoImpl#getComplejos <em>Complejos</em>}</li>
 *   <li>{@link diagramapseudocodigo.impl.AlgoritmoImpl#getComentarios <em>Comentarios</em>}</li>
 *   <li>{@link diagramapseudocodigo.impl.AlgoritmoImpl#getGlobales <em>Globales</em>}</li>
 *   <li>{@link diagramapseudocodigo.impl.AlgoritmoImpl#getImportaciones <em>Importaciones</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AlgoritmoImpl extends CodigoImpl implements Algoritmo {
	/**
	 * The cached value of the '{@link #getInicio() <em>Inicio</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInicio()
	 * @generated
	 * @ordered
	 */
	protected Inicio inicio;

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
	 * The cached value of the '{@link #getComentarios() <em>Comentarios</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComentarios()
	 * @generated
	 * @ordered
	 */
	protected EList<Comentario> comentarios;

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
	 * The cached value of the '{@link #getImportaciones() <em>Importaciones</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportaciones()
	 * @generated
	 * @ordered
	 */
	protected EList<Modulo> importaciones;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlgoritmoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DiagramapseudocodigoPackage.Literals.ALGORITMO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Inicio getInicio() {
		return inicio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInicio(Inicio newInicio, NotificationChain msgs) {
		Inicio oldInicio = inicio;
		inicio = newInicio;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DiagramapseudocodigoPackage.ALGORITMO__INICIO, oldInicio, newInicio);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInicio(Inicio newInicio) {
		if (newInicio != inicio) {
			NotificationChain msgs = null;
			if (inicio != null)
				msgs = ((InternalEObject)inicio).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DiagramapseudocodigoPackage.ALGORITMO__INICIO, null, msgs);
			if (newInicio != null)
				msgs = ((InternalEObject)newInicio).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DiagramapseudocodigoPackage.ALGORITMO__INICIO, null, msgs);
			msgs = basicSetInicio(newInicio, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiagramapseudocodigoPackage.ALGORITMO__INICIO, newInicio, newInicio));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Subproceso> getSubprocesos() {
		if (subprocesos == null) {
			subprocesos = new EObjectContainmentEList<Subproceso>(Subproceso.class, this, DiagramapseudocodigoPackage.ALGORITMO__SUBPROCESOS);
		}
		return subprocesos;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DiagramapseudocodigoPackage.ALGORITMO__NOMBRE, oldNombre, nombre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Constante> getConstantes() {
		if (constantes == null) {
			constantes = new EObjectContainmentEList<Constante>(Constante.class, this, DiagramapseudocodigoPackage.ALGORITMO__CONSTANTES);
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
			complejos = new EObjectContainmentEList<TipoComplejo>(TipoComplejo.class, this, DiagramapseudocodigoPackage.ALGORITMO__COMPLEJOS);
		}
		return complejos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Comentario> getComentarios() {
		if (comentarios == null) {
			comentarios = new EObjectContainmentEList<Comentario>(Comentario.class, this, DiagramapseudocodigoPackage.ALGORITMO__COMENTARIOS);
		}
		return comentarios;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Declaracion> getGlobales() {
		if (globales == null) {
			globales = new EObjectContainmentEList<Declaracion>(Declaracion.class, this, DiagramapseudocodigoPackage.ALGORITMO__GLOBALES);
		}
		return globales;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Modulo> getImportaciones() {
		if (importaciones == null) {
			importaciones = new EObjectResolvingEList<Modulo>(Modulo.class, this, DiagramapseudocodigoPackage.ALGORITMO__IMPORTACIONES);
		}
		return importaciones;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DiagramapseudocodigoPackage.ALGORITMO__INICIO:
				return basicSetInicio(null, msgs);
			case DiagramapseudocodigoPackage.ALGORITMO__SUBPROCESOS:
				return ((InternalEList<?>)getSubprocesos()).basicRemove(otherEnd, msgs);
			case DiagramapseudocodigoPackage.ALGORITMO__CONSTANTES:
				return ((InternalEList<?>)getConstantes()).basicRemove(otherEnd, msgs);
			case DiagramapseudocodigoPackage.ALGORITMO__COMPLEJOS:
				return ((InternalEList<?>)getComplejos()).basicRemove(otherEnd, msgs);
			case DiagramapseudocodigoPackage.ALGORITMO__COMENTARIOS:
				return ((InternalEList<?>)getComentarios()).basicRemove(otherEnd, msgs);
			case DiagramapseudocodigoPackage.ALGORITMO__GLOBALES:
				return ((InternalEList<?>)getGlobales()).basicRemove(otherEnd, msgs);
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
			case DiagramapseudocodigoPackage.ALGORITMO__INICIO:
				return getInicio();
			case DiagramapseudocodigoPackage.ALGORITMO__SUBPROCESOS:
				return getSubprocesos();
			case DiagramapseudocodigoPackage.ALGORITMO__NOMBRE:
				return getNombre();
			case DiagramapseudocodigoPackage.ALGORITMO__CONSTANTES:
				return getConstantes();
			case DiagramapseudocodigoPackage.ALGORITMO__COMPLEJOS:
				return getComplejos();
			case DiagramapseudocodigoPackage.ALGORITMO__COMENTARIOS:
				return getComentarios();
			case DiagramapseudocodigoPackage.ALGORITMO__GLOBALES:
				return getGlobales();
			case DiagramapseudocodigoPackage.ALGORITMO__IMPORTACIONES:
				return getImportaciones();
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
			case DiagramapseudocodigoPackage.ALGORITMO__INICIO:
				setInicio((Inicio)newValue);
				return;
			case DiagramapseudocodigoPackage.ALGORITMO__SUBPROCESOS:
				getSubprocesos().clear();
				getSubprocesos().addAll((Collection<? extends Subproceso>)newValue);
				return;
			case DiagramapseudocodigoPackage.ALGORITMO__NOMBRE:
				setNombre((String)newValue);
				return;
			case DiagramapseudocodigoPackage.ALGORITMO__CONSTANTES:
				getConstantes().clear();
				getConstantes().addAll((Collection<? extends Constante>)newValue);
				return;
			case DiagramapseudocodigoPackage.ALGORITMO__COMPLEJOS:
				getComplejos().clear();
				getComplejos().addAll((Collection<? extends TipoComplejo>)newValue);
				return;
			case DiagramapseudocodigoPackage.ALGORITMO__COMENTARIOS:
				getComentarios().clear();
				getComentarios().addAll((Collection<? extends Comentario>)newValue);
				return;
			case DiagramapseudocodigoPackage.ALGORITMO__GLOBALES:
				getGlobales().clear();
				getGlobales().addAll((Collection<? extends Declaracion>)newValue);
				return;
			case DiagramapseudocodigoPackage.ALGORITMO__IMPORTACIONES:
				getImportaciones().clear();
				getImportaciones().addAll((Collection<? extends Modulo>)newValue);
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
			case DiagramapseudocodigoPackage.ALGORITMO__INICIO:
				setInicio((Inicio)null);
				return;
			case DiagramapseudocodigoPackage.ALGORITMO__SUBPROCESOS:
				getSubprocesos().clear();
				return;
			case DiagramapseudocodigoPackage.ALGORITMO__NOMBRE:
				setNombre(NOMBRE_EDEFAULT);
				return;
			case DiagramapseudocodigoPackage.ALGORITMO__CONSTANTES:
				getConstantes().clear();
				return;
			case DiagramapseudocodigoPackage.ALGORITMO__COMPLEJOS:
				getComplejos().clear();
				return;
			case DiagramapseudocodigoPackage.ALGORITMO__COMENTARIOS:
				getComentarios().clear();
				return;
			case DiagramapseudocodigoPackage.ALGORITMO__GLOBALES:
				getGlobales().clear();
				return;
			case DiagramapseudocodigoPackage.ALGORITMO__IMPORTACIONES:
				getImportaciones().clear();
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
			case DiagramapseudocodigoPackage.ALGORITMO__INICIO:
				return inicio != null;
			case DiagramapseudocodigoPackage.ALGORITMO__SUBPROCESOS:
				return subprocesos != null && !subprocesos.isEmpty();
			case DiagramapseudocodigoPackage.ALGORITMO__NOMBRE:
				return NOMBRE_EDEFAULT == null ? nombre != null : !NOMBRE_EDEFAULT.equals(nombre);
			case DiagramapseudocodigoPackage.ALGORITMO__CONSTANTES:
				return constantes != null && !constantes.isEmpty();
			case DiagramapseudocodigoPackage.ALGORITMO__COMPLEJOS:
				return complejos != null && !complejos.isEmpty();
			case DiagramapseudocodigoPackage.ALGORITMO__COMENTARIOS:
				return comentarios != null && !comentarios.isEmpty();
			case DiagramapseudocodigoPackage.ALGORITMO__GLOBALES:
				return globales != null && !globales.isEmpty();
			case DiagramapseudocodigoPackage.ALGORITMO__IMPORTACIONES:
				return importaciones != null && !importaciones.isEmpty();
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
		result.append(')');
		return result.toString();
	}

} //AlgoritmoImpl
