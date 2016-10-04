/**
 */
package diagramapseudocodigo.provider;


import diagramapseudocodigo.DiagramapseudocodigoFactory;
import diagramapseudocodigo.DiagramapseudocodigoPackage;
import diagramapseudocodigo.FuncionInterna;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link diagramapseudocodigo.FuncionInterna} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class FuncionInternaItemProvider extends ValorItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FuncionInternaItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addEAttribute0rence0PropertyDescriptor(object);
			addNegacionesFinalesPropertyDescriptor(object);
			addNegacionesInicialesPropertyDescriptor(object);
			addNombrePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the EAttribute0rence0 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEAttribute0rence0PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Operacion_EAttribute0rence0_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Operacion_EAttribute0rence0_feature", "_UI_Operacion_type"),
				 DiagramapseudocodigoPackage.Literals.OPERACION__EATTRIBUTE0RENCE0,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Negaciones Finales feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNegacionesFinalesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Operacion_negacionesFinales_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Operacion_negacionesFinales_feature", "_UI_Operacion_type"),
				 DiagramapseudocodigoPackage.Literals.OPERACION__NEGACIONES_FINALES,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Negaciones Iniciales feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNegacionesInicialesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Operacion_negacionesIniciales_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Operacion_negacionesIniciales_feature", "_UI_Operacion_type"),
				 DiagramapseudocodigoPackage.Literals.OPERACION__NEGACIONES_INICIALES,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Nombre feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNombrePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FuncionInterna_nombre_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FuncionInterna_nombre_feature", "_UI_FuncionInterna_type"),
				 DiagramapseudocodigoPackage.Literals.FUNCION_INTERNA__NOMBRE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(DiagramapseudocodigoPackage.Literals.FUNCION_INTERNA__OPERADORES);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns FuncionInterna.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/FuncionInterna"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((FuncionInterna)object).getNombre();
		return label == null || label.length() == 0 ?
			getString("_UI_FuncionInterna_type") :
			getString("_UI_FuncionInterna_type") + " " + label;
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(FuncionInterna.class)) {
			case DiagramapseudocodigoPackage.FUNCION_INTERNA__NEGACIONES_FINALES:
			case DiagramapseudocodigoPackage.FUNCION_INTERNA__NEGACIONES_INICIALES:
			case DiagramapseudocodigoPackage.FUNCION_INTERNA__NOMBRE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case DiagramapseudocodigoPackage.FUNCION_INTERNA__OPERADORES:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(DiagramapseudocodigoPackage.Literals.FUNCION_INTERNA__OPERADORES,
				 DiagramapseudocodigoFactory.eINSTANCE.createLlamadaFuncion()));

		newChildDescriptors.add
			(createChildParameter
				(DiagramapseudocodigoPackage.Literals.FUNCION_INTERNA__OPERADORES,
				 DiagramapseudocodigoFactory.eINSTANCE.createVariableID()));

		newChildDescriptors.add
			(createChildParameter
				(DiagramapseudocodigoPackage.Literals.FUNCION_INTERNA__OPERADORES,
				 DiagramapseudocodigoFactory.eINSTANCE.createCadenaCaracteres()));

		newChildDescriptors.add
			(createChildParameter
				(DiagramapseudocodigoPackage.Literals.FUNCION_INTERNA__OPERADORES,
				 DiagramapseudocodigoFactory.eINSTANCE.createEntero()));

		newChildDescriptors.add
			(createChildParameter
				(DiagramapseudocodigoPackage.Literals.FUNCION_INTERNA__OPERADORES,
				 DiagramapseudocodigoFactory.eINSTANCE.createReal()));

		newChildDescriptors.add
			(createChildParameter
				(DiagramapseudocodigoPackage.Literals.FUNCION_INTERNA__OPERADORES,
				 DiagramapseudocodigoFactory.eINSTANCE.createOperacion()));

		newChildDescriptors.add
			(createChildParameter
				(DiagramapseudocodigoPackage.Literals.FUNCION_INTERNA__OPERADORES,
				 DiagramapseudocodigoFactory.eINSTANCE.createLogico()));

		newChildDescriptors.add
			(createChildParameter
				(DiagramapseudocodigoPackage.Literals.FUNCION_INTERNA__OPERADORES,
				 DiagramapseudocodigoFactory.eINSTANCE.createCaracter()));

		newChildDescriptors.add
			(createChildParameter
				(DiagramapseudocodigoPackage.Literals.FUNCION_INTERNA__OPERADORES,
				 DiagramapseudocodigoFactory.eINSTANCE.createFuncionInterna()));

		newChildDescriptors.add
			(createChildParameter
				(DiagramapseudocodigoPackage.Literals.FUNCION_INTERNA__OPERADORES,
				 DiagramapseudocodigoFactory.eINSTANCE.createValorComplejo()));

		newChildDescriptors.add
			(createChildParameter
				(DiagramapseudocodigoPackage.Literals.FUNCION_INTERNA__OPERADORES,
				 DiagramapseudocodigoFactory.eINSTANCE.createValorRegistro()));

		newChildDescriptors.add
			(createChildParameter
				(DiagramapseudocodigoPackage.Literals.FUNCION_INTERNA__OPERADORES,
				 DiagramapseudocodigoFactory.eINSTANCE.createValorVector()));

		newChildDescriptors.add
			(createChildParameter
				(DiagramapseudocodigoPackage.Literals.FUNCION_INTERNA__OPERADORES,
				 DiagramapseudocodigoFactory.eINSTANCE.createValorMatriz()));

		newChildDescriptors.add
			(createChildParameter
				(DiagramapseudocodigoPackage.Literals.FUNCION_INTERNA__OPERADORES,
				 DiagramapseudocodigoFactory.eINSTANCE.createSuma()));

		newChildDescriptors.add
			(createChildParameter
				(DiagramapseudocodigoPackage.Literals.FUNCION_INTERNA__OPERADORES,
				 DiagramapseudocodigoFactory.eINSTANCE.createResta()));

		newChildDescriptors.add
			(createChildParameter
				(DiagramapseudocodigoPackage.Literals.FUNCION_INTERNA__OPERADORES,
				 DiagramapseudocodigoFactory.eINSTANCE.createMultiplicacion()));

		newChildDescriptors.add
			(createChildParameter
				(DiagramapseudocodigoPackage.Literals.FUNCION_INTERNA__OPERADORES,
				 DiagramapseudocodigoFactory.eINSTANCE.createDivisionEntera()));

		newChildDescriptors.add
			(createChildParameter
				(DiagramapseudocodigoPackage.Literals.FUNCION_INTERNA__OPERADORES,
				 DiagramapseudocodigoFactory.eINSTANCE.createOr()));

		newChildDescriptors.add
			(createChildParameter
				(DiagramapseudocodigoPackage.Literals.FUNCION_INTERNA__OPERADORES,
				 DiagramapseudocodigoFactory.eINSTANCE.createAnd()));

		newChildDescriptors.add
			(createChildParameter
				(DiagramapseudocodigoPackage.Literals.FUNCION_INTERNA__OPERADORES,
				 DiagramapseudocodigoFactory.eINSTANCE.createComparacion()));

		newChildDescriptors.add
			(createChildParameter
				(DiagramapseudocodigoPackage.Literals.FUNCION_INTERNA__OPERADORES,
				 DiagramapseudocodigoFactory.eINSTANCE.createIgualdad()));

		newChildDescriptors.add
			(createChildParameter
				(DiagramapseudocodigoPackage.Literals.FUNCION_INTERNA__OPERADORES,
				 DiagramapseudocodigoFactory.eINSTANCE.createMod()));

		newChildDescriptors.add
			(createChildParameter
				(DiagramapseudocodigoPackage.Literals.FUNCION_INTERNA__OPERADORES,
				 DiagramapseudocodigoFactory.eINSTANCE.createDivisionReal()));

		newChildDescriptors.add
			(createChildParameter
				(DiagramapseudocodigoPackage.Literals.FUNCION_INTERNA__OPERADORES,
				 DiagramapseudocodigoFactory.eINSTANCE.createOperacionParentesis()));

		newChildDescriptors.add
			(createChildParameter
				(DiagramapseudocodigoPackage.Literals.FUNCION_INTERNA__OPERADORES,
				 DiagramapseudocodigoFactory.eINSTANCE.createUnaria()));

		newChildDescriptors.add
			(createChildParameter
				(DiagramapseudocodigoPackage.Literals.FUNCION_INTERNA__OPERADORES,
				 DiagramapseudocodigoFactory.eINSTANCE.createOperacionCompleta()));
	}

}
