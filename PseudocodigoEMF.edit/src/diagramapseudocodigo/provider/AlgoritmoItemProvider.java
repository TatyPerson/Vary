/**
 */
package diagramapseudocodigo.provider;


import diagramapseudocodigo.Algoritmo;
import diagramapseudocodigo.DiagramapseudocodigoFactory;
import diagramapseudocodigo.DiagramapseudocodigoPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link diagramapseudocodigo.Algoritmo} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AlgoritmoItemProvider
	extends CodigoItemProvider
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlgoritmoItemProvider(AdapterFactory adapterFactory) {
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

			addNombrePropertyDescriptor(object);
			addImportacionesPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
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
				 getString("_UI_Algoritmo_nombre_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Algoritmo_nombre_feature", "_UI_Algoritmo_type"),
				 DiagramapseudocodigoPackage.Literals.ALGORITMO__NOMBRE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Importaciones feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addImportacionesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Algoritmo_importaciones_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Algoritmo_importaciones_feature", "_UI_Algoritmo_type"),
				 DiagramapseudocodigoPackage.Literals.ALGORITMO__IMPORTACIONES,
				 true,
				 false,
				 true,
				 null,
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
			childrenFeatures.add(DiagramapseudocodigoPackage.Literals.ALGORITMO__TIENE);
			childrenFeatures.add(DiagramapseudocodigoPackage.Literals.ALGORITMO__FUNCION);
			childrenFeatures.add(DiagramapseudocodigoPackage.Literals.ALGORITMO__CONSTANTES);
			childrenFeatures.add(DiagramapseudocodigoPackage.Literals.ALGORITMO__TIPOCOMPLEJO);
			childrenFeatures.add(DiagramapseudocodigoPackage.Literals.ALGORITMO__COMENTARIOS);
			childrenFeatures.add(DiagramapseudocodigoPackage.Literals.ALGORITMO__GLOBAL);
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
	 * This returns Algoritmo.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Algoritmo"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Algoritmo)object).getNombre();
		return label == null || label.length() == 0 ?
			getString("_UI_Algoritmo_type") :
			getString("_UI_Algoritmo_type") + " " + label;
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

		switch (notification.getFeatureID(Algoritmo.class)) {
			case DiagramapseudocodigoPackage.ALGORITMO__NOMBRE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case DiagramapseudocodigoPackage.ALGORITMO__TIENE:
			case DiagramapseudocodigoPackage.ALGORITMO__FUNCION:
			case DiagramapseudocodigoPackage.ALGORITMO__CONSTANTES:
			case DiagramapseudocodigoPackage.ALGORITMO__TIPOCOMPLEJO:
			case DiagramapseudocodigoPackage.ALGORITMO__COMENTARIOS:
			case DiagramapseudocodigoPackage.ALGORITMO__GLOBAL:
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
				(DiagramapseudocodigoPackage.Literals.ALGORITMO__TIENE,
				 DiagramapseudocodigoFactory.eINSTANCE.createInicio()));

		newChildDescriptors.add
			(createChildParameter
				(DiagramapseudocodigoPackage.Literals.ALGORITMO__FUNCION,
				 DiagramapseudocodigoFactory.eINSTANCE.createFuncion()));

		newChildDescriptors.add
			(createChildParameter
				(DiagramapseudocodigoPackage.Literals.ALGORITMO__FUNCION,
				 DiagramapseudocodigoFactory.eINSTANCE.createProcedimiento()));

		newChildDescriptors.add
			(createChildParameter
				(DiagramapseudocodigoPackage.Literals.ALGORITMO__CONSTANTES,
				 DiagramapseudocodigoFactory.eINSTANCE.createConstantes()));

		newChildDescriptors.add
			(createChildParameter
				(DiagramapseudocodigoPackage.Literals.ALGORITMO__TIPOCOMPLEJO,
				 DiagramapseudocodigoFactory.eINSTANCE.createTipoComplejo()));

		newChildDescriptors.add
			(createChildParameter
				(DiagramapseudocodigoPackage.Literals.ALGORITMO__TIPOCOMPLEJO,
				 DiagramapseudocodigoFactory.eINSTANCE.createVector()));

		newChildDescriptors.add
			(createChildParameter
				(DiagramapseudocodigoPackage.Literals.ALGORITMO__TIPOCOMPLEJO,
				 DiagramapseudocodigoFactory.eINSTANCE.createMatriz()));

		newChildDescriptors.add
			(createChildParameter
				(DiagramapseudocodigoPackage.Literals.ALGORITMO__TIPOCOMPLEJO,
				 DiagramapseudocodigoFactory.eINSTANCE.createRegistro()));

		newChildDescriptors.add
			(createChildParameter
				(DiagramapseudocodigoPackage.Literals.ALGORITMO__TIPOCOMPLEJO,
				 DiagramapseudocodigoFactory.eINSTANCE.createArchivo()));

		newChildDescriptors.add
			(createChildParameter
				(DiagramapseudocodigoPackage.Literals.ALGORITMO__TIPOCOMPLEJO,
				 DiagramapseudocodigoFactory.eINSTANCE.createEnumerado()));

		newChildDescriptors.add
			(createChildParameter
				(DiagramapseudocodigoPackage.Literals.ALGORITMO__TIPOCOMPLEJO,
				 DiagramapseudocodigoFactory.eINSTANCE.createSubrango()));

		newChildDescriptors.add
			(createChildParameter
				(DiagramapseudocodigoPackage.Literals.ALGORITMO__TIPOCOMPLEJO,
				 DiagramapseudocodigoFactory.eINSTANCE.createSubrangoNumerico()));

		newChildDescriptors.add
			(createChildParameter
				(DiagramapseudocodigoPackage.Literals.ALGORITMO__TIPOCOMPLEJO,
				 DiagramapseudocodigoFactory.eINSTANCE.createSubrangoEnumerado()));

		newChildDescriptors.add
			(createChildParameter
				(DiagramapseudocodigoPackage.Literals.ALGORITMO__COMENTARIOS,
				 DiagramapseudocodigoFactory.eINSTANCE.createComentario()));

		newChildDescriptors.add
			(createChildParameter
				(DiagramapseudocodigoPackage.Literals.ALGORITMO__GLOBAL,
				 DiagramapseudocodigoFactory.eINSTANCE.createDeclaracion()));

		newChildDescriptors.add
			(createChildParameter
				(DiagramapseudocodigoPackage.Literals.ALGORITMO__GLOBAL,
				 DiagramapseudocodigoFactory.eINSTANCE.createDeclaracionVariable()));

		newChildDescriptors.add
			(createChildParameter
				(DiagramapseudocodigoPackage.Literals.ALGORITMO__GLOBAL,
				 DiagramapseudocodigoFactory.eINSTANCE.createDeclaracionPropia()));
	}

}
