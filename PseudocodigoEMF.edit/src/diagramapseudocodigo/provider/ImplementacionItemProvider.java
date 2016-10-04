/**
 */
package diagramapseudocodigo.provider;


import diagramapseudocodigo.DiagramapseudocodigoFactory;
import diagramapseudocodigo.DiagramapseudocodigoPackage;
import diagramapseudocodigo.Implementacion;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link diagramapseudocodigo.Implementacion} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ImplementacionItemProvider 
	extends ItemProviderAdapter
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
	public ImplementacionItemProvider(AdapterFactory adapterFactory) {
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

		}
		return itemPropertyDescriptors;
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
			childrenFeatures.add(DiagramapseudocodigoPackage.Literals.IMPLEMENTACION__SUBPROCESOS);
			childrenFeatures.add(DiagramapseudocodigoPackage.Literals.IMPLEMENTACION__GLOBALES);
			childrenFeatures.add(DiagramapseudocodigoPackage.Literals.IMPLEMENTACION__CONSTANTES);
			childrenFeatures.add(DiagramapseudocodigoPackage.Literals.IMPLEMENTACION__COMPLEJOS);
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
	 * This returns Implementacion.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Implementacion"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_Implementacion_type");
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

		switch (notification.getFeatureID(Implementacion.class)) {
			case DiagramapseudocodigoPackage.IMPLEMENTACION__SUBPROCESOS:
			case DiagramapseudocodigoPackage.IMPLEMENTACION__GLOBALES:
			case DiagramapseudocodigoPackage.IMPLEMENTACION__CONSTANTES:
			case DiagramapseudocodigoPackage.IMPLEMENTACION__COMPLEJOS:
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
				(DiagramapseudocodigoPackage.Literals.IMPLEMENTACION__SUBPROCESOS,
				 DiagramapseudocodigoFactory.eINSTANCE.createFuncion()));

		newChildDescriptors.add
			(createChildParameter
				(DiagramapseudocodigoPackage.Literals.IMPLEMENTACION__SUBPROCESOS,
				 DiagramapseudocodigoFactory.eINSTANCE.createProcedimiento()));

		newChildDescriptors.add
			(createChildParameter
				(DiagramapseudocodigoPackage.Literals.IMPLEMENTACION__GLOBALES,
				 DiagramapseudocodigoFactory.eINSTANCE.createDeclaracion()));

		newChildDescriptors.add
			(createChildParameter
				(DiagramapseudocodigoPackage.Literals.IMPLEMENTACION__GLOBALES,
				 DiagramapseudocodigoFactory.eINSTANCE.createDeclaracionBasica()));

		newChildDescriptors.add
			(createChildParameter
				(DiagramapseudocodigoPackage.Literals.IMPLEMENTACION__GLOBALES,
				 DiagramapseudocodigoFactory.eINSTANCE.createDeclaracionDefinida()));

		newChildDescriptors.add
			(createChildParameter
				(DiagramapseudocodigoPackage.Literals.IMPLEMENTACION__CONSTANTES,
				 DiagramapseudocodigoFactory.eINSTANCE.createConstante()));

		newChildDescriptors.add
			(createChildParameter
				(DiagramapseudocodigoPackage.Literals.IMPLEMENTACION__COMPLEJOS,
				 DiagramapseudocodigoFactory.eINSTANCE.createTipoComplejo()));

		newChildDescriptors.add
			(createChildParameter
				(DiagramapseudocodigoPackage.Literals.IMPLEMENTACION__COMPLEJOS,
				 DiagramapseudocodigoFactory.eINSTANCE.createVector()));

		newChildDescriptors.add
			(createChildParameter
				(DiagramapseudocodigoPackage.Literals.IMPLEMENTACION__COMPLEJOS,
				 DiagramapseudocodigoFactory.eINSTANCE.createMatriz()));

		newChildDescriptors.add
			(createChildParameter
				(DiagramapseudocodigoPackage.Literals.IMPLEMENTACION__COMPLEJOS,
				 DiagramapseudocodigoFactory.eINSTANCE.createRegistro()));

		newChildDescriptors.add
			(createChildParameter
				(DiagramapseudocodigoPackage.Literals.IMPLEMENTACION__COMPLEJOS,
				 DiagramapseudocodigoFactory.eINSTANCE.createArchivo()));

		newChildDescriptors.add
			(createChildParameter
				(DiagramapseudocodigoPackage.Literals.IMPLEMENTACION__COMPLEJOS,
				 DiagramapseudocodigoFactory.eINSTANCE.createEnumerado()));

		newChildDescriptors.add
			(createChildParameter
				(DiagramapseudocodigoPackage.Literals.IMPLEMENTACION__COMPLEJOS,
				 DiagramapseudocodigoFactory.eINSTANCE.createSubrango()));

		newChildDescriptors.add
			(createChildParameter
				(DiagramapseudocodigoPackage.Literals.IMPLEMENTACION__COMPLEJOS,
				 DiagramapseudocodigoFactory.eINSTANCE.createSubrangoNumerico()));

		newChildDescriptors.add
			(createChildParameter
				(DiagramapseudocodigoPackage.Literals.IMPLEMENTACION__COMPLEJOS,
				 DiagramapseudocodigoFactory.eINSTANCE.createSubrangoEnumerado()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return DiagramaPseudocodigoEditPlugin.INSTANCE;
	}

}
