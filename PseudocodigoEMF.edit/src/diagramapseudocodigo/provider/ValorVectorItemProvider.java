/**
 */
package diagramapseudocodigo.provider;


import diagramapseudocodigo.DiagramapseudocodigoFactory;
import diagramapseudocodigo.DiagramapseudocodigoPackage;
import diagramapseudocodigo.ValorVector;

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
 * This is the item provider adapter for a {@link diagramapseudocodigo.ValorVector} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ValorVectorItemProvider extends ValorComplejoItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValorVectorItemProvider(AdapterFactory adapterFactory) {
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

			addNombre_vectorPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Nombre vector feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNombre_vectorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ValorVector_nombre_vector_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ValorVector_nombre_vector_feature", "_UI_ValorVector_type"),
				 DiagramapseudocodigoPackage.Literals.VALOR_VECTOR__NOMBRE_VECTOR,
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
			childrenFeatures.add(DiagramapseudocodigoPackage.Literals.VALOR_VECTOR__CAMPOS);
			childrenFeatures.add(DiagramapseudocodigoPackage.Literals.VALOR_VECTOR__INDICE);
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
	 * This returns ValorVector.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ValorVector"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ValorVector)object).getNombre_vector();
		return label == null || label.length() == 0 ?
			getString("_UI_ValorVector_type") :
			getString("_UI_ValorVector_type") + " " + label;
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

		switch (notification.getFeatureID(ValorVector.class)) {
			case DiagramapseudocodigoPackage.VALOR_VECTOR__NOMBRE_VECTOR:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case DiagramapseudocodigoPackage.VALOR_VECTOR__CAMPOS:
			case DiagramapseudocodigoPackage.VALOR_VECTOR__INDICE:
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
				(DiagramapseudocodigoPackage.Literals.VALOR_VECTOR__CAMPOS,
				 DiagramapseudocodigoFactory.eINSTANCE.createCampoRegistro()));

		newChildDescriptors.add
			(createChildParameter
				(DiagramapseudocodigoPackage.Literals.VALOR_VECTOR__INDICE,
				 DiagramapseudocodigoFactory.eINSTANCE.createLlamadaFuncion()));

		newChildDescriptors.add
			(createChildParameter
				(DiagramapseudocodigoPackage.Literals.VALOR_VECTOR__INDICE,
				 DiagramapseudocodigoFactory.eINSTANCE.createVariableID()));

		newChildDescriptors.add
			(createChildParameter
				(DiagramapseudocodigoPackage.Literals.VALOR_VECTOR__INDICE,
				 DiagramapseudocodigoFactory.eINSTANCE.createCadenaCaracteres()));

		newChildDescriptors.add
			(createChildParameter
				(DiagramapseudocodigoPackage.Literals.VALOR_VECTOR__INDICE,
				 DiagramapseudocodigoFactory.eINSTANCE.createEntero()));

		newChildDescriptors.add
			(createChildParameter
				(DiagramapseudocodigoPackage.Literals.VALOR_VECTOR__INDICE,
				 DiagramapseudocodigoFactory.eINSTANCE.createReal()));

		newChildDescriptors.add
			(createChildParameter
				(DiagramapseudocodigoPackage.Literals.VALOR_VECTOR__INDICE,
				 DiagramapseudocodigoFactory.eINSTANCE.createOperacion()));

		newChildDescriptors.add
			(createChildParameter
				(DiagramapseudocodigoPackage.Literals.VALOR_VECTOR__INDICE,
				 DiagramapseudocodigoFactory.eINSTANCE.createLogico()));

		newChildDescriptors.add
			(createChildParameter
				(DiagramapseudocodigoPackage.Literals.VALOR_VECTOR__INDICE,
				 DiagramapseudocodigoFactory.eINSTANCE.createCaracter()));

		newChildDescriptors.add
			(createChildParameter
				(DiagramapseudocodigoPackage.Literals.VALOR_VECTOR__INDICE,
				 DiagramapseudocodigoFactory.eINSTANCE.createFuncionInterna()));

		newChildDescriptors.add
			(createChildParameter
				(DiagramapseudocodigoPackage.Literals.VALOR_VECTOR__INDICE,
				 DiagramapseudocodigoFactory.eINSTANCE.createValorComplejo()));

		newChildDescriptors.add
			(createChildParameter
				(DiagramapseudocodigoPackage.Literals.VALOR_VECTOR__INDICE,
				 DiagramapseudocodigoFactory.eINSTANCE.createValorRegistro()));

		newChildDescriptors.add
			(createChildParameter
				(DiagramapseudocodigoPackage.Literals.VALOR_VECTOR__INDICE,
				 DiagramapseudocodigoFactory.eINSTANCE.createValorVector()));

		newChildDescriptors.add
			(createChildParameter
				(DiagramapseudocodigoPackage.Literals.VALOR_VECTOR__INDICE,
				 DiagramapseudocodigoFactory.eINSTANCE.createValorMatriz()));

		newChildDescriptors.add
			(createChildParameter
				(DiagramapseudocodigoPackage.Literals.VALOR_VECTOR__INDICE,
				 DiagramapseudocodigoFactory.eINSTANCE.createSuma()));

		newChildDescriptors.add
			(createChildParameter
				(DiagramapseudocodigoPackage.Literals.VALOR_VECTOR__INDICE,
				 DiagramapseudocodigoFactory.eINSTANCE.createResta()));

		newChildDescriptors.add
			(createChildParameter
				(DiagramapseudocodigoPackage.Literals.VALOR_VECTOR__INDICE,
				 DiagramapseudocodigoFactory.eINSTANCE.createMultiplicacion()));

		newChildDescriptors.add
			(createChildParameter
				(DiagramapseudocodigoPackage.Literals.VALOR_VECTOR__INDICE,
				 DiagramapseudocodigoFactory.eINSTANCE.createDivisionEntera()));

		newChildDescriptors.add
			(createChildParameter
				(DiagramapseudocodigoPackage.Literals.VALOR_VECTOR__INDICE,
				 DiagramapseudocodigoFactory.eINSTANCE.createOr()));

		newChildDescriptors.add
			(createChildParameter
				(DiagramapseudocodigoPackage.Literals.VALOR_VECTOR__INDICE,
				 DiagramapseudocodigoFactory.eINSTANCE.createAnd()));

		newChildDescriptors.add
			(createChildParameter
				(DiagramapseudocodigoPackage.Literals.VALOR_VECTOR__INDICE,
				 DiagramapseudocodigoFactory.eINSTANCE.createComparacion()));

		newChildDescriptors.add
			(createChildParameter
				(DiagramapseudocodigoPackage.Literals.VALOR_VECTOR__INDICE,
				 DiagramapseudocodigoFactory.eINSTANCE.createIgualdad()));

		newChildDescriptors.add
			(createChildParameter
				(DiagramapseudocodigoPackage.Literals.VALOR_VECTOR__INDICE,
				 DiagramapseudocodigoFactory.eINSTANCE.createMod()));

		newChildDescriptors.add
			(createChildParameter
				(DiagramapseudocodigoPackage.Literals.VALOR_VECTOR__INDICE,
				 DiagramapseudocodigoFactory.eINSTANCE.createDivisionReal()));

		newChildDescriptors.add
			(createChildParameter
				(DiagramapseudocodigoPackage.Literals.VALOR_VECTOR__INDICE,
				 DiagramapseudocodigoFactory.eINSTANCE.createOperacionParentesis()));

		newChildDescriptors.add
			(createChildParameter
				(DiagramapseudocodigoPackage.Literals.VALOR_VECTOR__INDICE,
				 DiagramapseudocodigoFactory.eINSTANCE.createOperacionCompleta()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == DiagramapseudocodigoPackage.Literals.OPERACION__LEFT ||
			childFeature == DiagramapseudocodigoPackage.Literals.OPERACION__RIGHT ||
			childFeature == DiagramapseudocodigoPackage.Literals.VALOR_VECTOR__INDICE;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
