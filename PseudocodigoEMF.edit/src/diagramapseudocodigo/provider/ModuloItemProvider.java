/**
 */
package diagramapseudocodigo.provider;


import diagramapseudocodigo.DiagramapseudocodigoFactory;
import diagramapseudocodigo.DiagramapseudocodigoPackage;
import diagramapseudocodigo.Modulo;

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
 * This is the item provider adapter for a {@link diagramapseudocodigo.Modulo} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ModuloItemProvider extends CodigoItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModuloItemProvider(AdapterFactory adapterFactory) {
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
			addExporta_tiposPropertyDescriptor(object);
			addExporta_constantesPropertyDescriptor(object);
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
				 getString("_UI_Modulo_nombre_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Modulo_nombre_feature", "_UI_Modulo_type"),
				 DiagramapseudocodigoPackage.Literals.MODULO__NOMBRE,
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
				 getString("_UI_Modulo_importaciones_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Modulo_importaciones_feature", "_UI_Modulo_type"),
				 DiagramapseudocodigoPackage.Literals.MODULO__IMPORTACIONES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Exporta tipos feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addExporta_tiposPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Modulo_exporta_tipos_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Modulo_exporta_tipos_feature", "_UI_Modulo_type"),
				 DiagramapseudocodigoPackage.Literals.MODULO__EXPORTA_TIPOS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Exporta constantes feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addExporta_constantesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Modulo_exporta_constantes_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Modulo_exporta_constantes_feature", "_UI_Modulo_type"),
				 DiagramapseudocodigoPackage.Literals.MODULO__EXPORTA_CONSTANTES,
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
			childrenFeatures.add(DiagramapseudocodigoPackage.Literals.MODULO__IMPLEMENTACION);
			childrenFeatures.add(DiagramapseudocodigoPackage.Literals.MODULO__EXPORTA_GLOBALES);
			childrenFeatures.add(DiagramapseudocodigoPackage.Literals.MODULO__EXPORTA_SUBPROCESOS);
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
	 * This returns Modulo.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Modulo"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Modulo)object).getNombre();
		return label == null || label.length() == 0 ?
			getString("_UI_Modulo_type") :
			getString("_UI_Modulo_type") + " " + label;
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

		switch (notification.getFeatureID(Modulo.class)) {
			case DiagramapseudocodigoPackage.MODULO__NOMBRE:
			case DiagramapseudocodigoPackage.MODULO__EXPORTA_TIPOS:
			case DiagramapseudocodigoPackage.MODULO__EXPORTA_CONSTANTES:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case DiagramapseudocodigoPackage.MODULO__IMPLEMENTACION:
			case DiagramapseudocodigoPackage.MODULO__EXPORTA_GLOBALES:
			case DiagramapseudocodigoPackage.MODULO__EXPORTA_SUBPROCESOS:
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
				(DiagramapseudocodigoPackage.Literals.MODULO__IMPLEMENTACION,
				 DiagramapseudocodigoFactory.eINSTANCE.createImplementacion()));

		newChildDescriptors.add
			(createChildParameter
				(DiagramapseudocodigoPackage.Literals.MODULO__EXPORTA_GLOBALES,
				 DiagramapseudocodigoFactory.eINSTANCE.createDeclaracion()));

		newChildDescriptors.add
			(createChildParameter
				(DiagramapseudocodigoPackage.Literals.MODULO__EXPORTA_GLOBALES,
				 DiagramapseudocodigoFactory.eINSTANCE.createDeclaracionBasica()));

		newChildDescriptors.add
			(createChildParameter
				(DiagramapseudocodigoPackage.Literals.MODULO__EXPORTA_GLOBALES,
				 DiagramapseudocodigoFactory.eINSTANCE.createDeclaracionDefinida()));

		newChildDescriptors.add
			(createChildParameter
				(DiagramapseudocodigoPackage.Literals.MODULO__EXPORTA_SUBPROCESOS,
				 DiagramapseudocodigoFactory.eINSTANCE.createCabeceraSubproceso()));

		newChildDescriptors.add
			(createChildParameter
				(DiagramapseudocodigoPackage.Literals.MODULO__EXPORTA_SUBPROCESOS,
				 DiagramapseudocodigoFactory.eINSTANCE.createCabeceraProcedimiento()));

		newChildDescriptors.add
			(createChildParameter
				(DiagramapseudocodigoPackage.Literals.MODULO__EXPORTA_SUBPROCESOS,
				 DiagramapseudocodigoFactory.eINSTANCE.createCabeceraFuncion()));
	}

}
