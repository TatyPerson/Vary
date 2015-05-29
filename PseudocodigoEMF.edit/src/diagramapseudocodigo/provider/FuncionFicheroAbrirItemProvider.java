/**
 */
package diagramapseudocodigo.provider;


import diagramapseudocodigo.DiagramapseudocodigoFactory;
import diagramapseudocodigo.DiagramapseudocodigoPackage;
import diagramapseudocodigo.FuncionFicheroAbrir;
import diagramapseudocodigo.ModoApertura;

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
 * This is the item provider adapter for a {@link diagramapseudocodigo.FuncionFicheroAbrir} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class FuncionFicheroAbrirItemProvider
	extends SentenciasItemProvider
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
	public FuncionFicheroAbrirItemProvider(AdapterFactory adapterFactory) {
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

			addModoPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Modo feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addModoPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FuncionFicheroAbrir_modo_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FuncionFicheroAbrir_modo_feature", "_UI_FuncionFicheroAbrir_type"),
				 DiagramapseudocodigoPackage.Literals.FUNCION_FICHERO_ABRIR__MODO,
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
			childrenFeatures.add(DiagramapseudocodigoPackage.Literals.FUNCION_FICHERO_ABRIR__VARIABLE);
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
	 * This returns FuncionFicheroAbrir.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/FuncionFicheroAbrir"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		ModoApertura labelValue = ((FuncionFicheroAbrir)object).getModo();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ?
			getString("_UI_FuncionFicheroAbrir_type") :
			getString("_UI_FuncionFicheroAbrir_type") + " " + label;
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

		switch (notification.getFeatureID(FuncionFicheroAbrir.class)) {
			case DiagramapseudocodigoPackage.FUNCION_FICHERO_ABRIR__MODO:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case DiagramapseudocodigoPackage.FUNCION_FICHERO_ABRIR__VARIABLE:
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
				(DiagramapseudocodigoPackage.Literals.FUNCION_FICHERO_ABRIR__VARIABLE,
				 DiagramapseudocodigoFactory.eINSTANCE.createLlamadaFuncion()));

		newChildDescriptors.add
			(createChildParameter
				(DiagramapseudocodigoPackage.Literals.FUNCION_FICHERO_ABRIR__VARIABLE,
				 DiagramapseudocodigoFactory.eINSTANCE.createVariableID()));

		newChildDescriptors.add
			(createChildParameter
				(DiagramapseudocodigoPackage.Literals.FUNCION_FICHERO_ABRIR__VARIABLE,
				 DiagramapseudocodigoFactory.eINSTANCE.createConstCadena()));

		newChildDescriptors.add
			(createChildParameter
				(DiagramapseudocodigoPackage.Literals.FUNCION_FICHERO_ABRIR__VARIABLE,
				 DiagramapseudocodigoFactory.eINSTANCE.createNumeroEntero()));

		newChildDescriptors.add
			(createChildParameter
				(DiagramapseudocodigoPackage.Literals.FUNCION_FICHERO_ABRIR__VARIABLE,
				 DiagramapseudocodigoFactory.eINSTANCE.createNumeroDecimal()));

		newChildDescriptors.add
			(createChildParameter
				(DiagramapseudocodigoPackage.Literals.FUNCION_FICHERO_ABRIR__VARIABLE,
				 DiagramapseudocodigoFactory.eINSTANCE.createoperacion()));

		newChildDescriptors.add
			(createChildParameter
				(DiagramapseudocodigoPackage.Literals.FUNCION_FICHERO_ABRIR__VARIABLE,
				 DiagramapseudocodigoFactory.eINSTANCE.createValorBooleano()));

		newChildDescriptors.add
			(createChildParameter
				(DiagramapseudocodigoPackage.Literals.FUNCION_FICHERO_ABRIR__VARIABLE,
				 DiagramapseudocodigoFactory.eINSTANCE.createCaracter()));

		newChildDescriptors.add
			(createChildParameter
				(DiagramapseudocodigoPackage.Literals.FUNCION_FICHERO_ABRIR__VARIABLE,
				 DiagramapseudocodigoFactory.eINSTANCE.createInternas()));

		newChildDescriptors.add
			(createChildParameter
				(DiagramapseudocodigoPackage.Literals.FUNCION_FICHERO_ABRIR__VARIABLE,
				 DiagramapseudocodigoFactory.eINSTANCE.createValorComplejo()));

		newChildDescriptors.add
			(createChildParameter
				(DiagramapseudocodigoPackage.Literals.FUNCION_FICHERO_ABRIR__VARIABLE,
				 DiagramapseudocodigoFactory.eINSTANCE.createValorRegistro()));

		newChildDescriptors.add
			(createChildParameter
				(DiagramapseudocodigoPackage.Literals.FUNCION_FICHERO_ABRIR__VARIABLE,
				 DiagramapseudocodigoFactory.eINSTANCE.createValorVector()));

		newChildDescriptors.add
			(createChildParameter
				(DiagramapseudocodigoPackage.Literals.FUNCION_FICHERO_ABRIR__VARIABLE,
				 DiagramapseudocodigoFactory.eINSTANCE.createValorMatriz()));

		newChildDescriptors.add
			(createChildParameter
				(DiagramapseudocodigoPackage.Literals.FUNCION_FICHERO_ABRIR__VARIABLE,
				 DiagramapseudocodigoFactory.eINSTANCE.createSuma()));

		newChildDescriptors.add
			(createChildParameter
				(DiagramapseudocodigoPackage.Literals.FUNCION_FICHERO_ABRIR__VARIABLE,
				 DiagramapseudocodigoFactory.eINSTANCE.createResta()));

		newChildDescriptors.add
			(createChildParameter
				(DiagramapseudocodigoPackage.Literals.FUNCION_FICHERO_ABRIR__VARIABLE,
				 DiagramapseudocodigoFactory.eINSTANCE.createMultiplicacion()));

		newChildDescriptors.add
			(createChildParameter
				(DiagramapseudocodigoPackage.Literals.FUNCION_FICHERO_ABRIR__VARIABLE,
				 DiagramapseudocodigoFactory.eINSTANCE.createDivision()));

		newChildDescriptors.add
			(createChildParameter
				(DiagramapseudocodigoPackage.Literals.FUNCION_FICHERO_ABRIR__VARIABLE,
				 DiagramapseudocodigoFactory.eINSTANCE.createOr()));

		newChildDescriptors.add
			(createChildParameter
				(DiagramapseudocodigoPackage.Literals.FUNCION_FICHERO_ABRIR__VARIABLE,
				 DiagramapseudocodigoFactory.eINSTANCE.createAnd()));

		newChildDescriptors.add
			(createChildParameter
				(DiagramapseudocodigoPackage.Literals.FUNCION_FICHERO_ABRIR__VARIABLE,
				 DiagramapseudocodigoFactory.eINSTANCE.createComparacion()));

		newChildDescriptors.add
			(createChildParameter
				(DiagramapseudocodigoPackage.Literals.FUNCION_FICHERO_ABRIR__VARIABLE,
				 DiagramapseudocodigoFactory.eINSTANCE.createIgualdad()));

		newChildDescriptors.add
			(createChildParameter
				(DiagramapseudocodigoPackage.Literals.FUNCION_FICHERO_ABRIR__VARIABLE,
				 DiagramapseudocodigoFactory.eINSTANCE.createNegativa()));

		newChildDescriptors.add
			(createChildParameter
				(DiagramapseudocodigoPackage.Literals.FUNCION_FICHERO_ABRIR__VARIABLE,
				 DiagramapseudocodigoFactory.eINSTANCE.createNegacion()));
	}

}
