/**
 */
package diagramapseudocodigo.provider;


import diagramapseudocodigo.DiagramapseudocodigoFactory;
import diagramapseudocodigo.DiagramapseudocodigoPackage;
import diagramapseudocodigo.Inicio;

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
 * This is the item provider adapter for a {@link diagramapseudocodigo.Inicio} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class InicioItemProvider
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
	public InicioItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(DiagramapseudocodigoPackage.Literals.INICIO__TIENE);
			childrenFeatures.add(DiagramapseudocodigoPackage.Literals.INICIO__DECLARACION);
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
	 * This returns Inicio.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Inicio"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_Inicio_type");
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

		switch (notification.getFeatureID(Inicio.class)) {
			case DiagramapseudocodigoPackage.INICIO__TIENE:
			case DiagramapseudocodigoPackage.INICIO__DECLARACION:
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
				(DiagramapseudocodigoPackage.Literals.INICIO__TIENE,
				 DiagramapseudocodigoFactory.eINSTANCE.createLlamadaFuncion()));

		newChildDescriptors.add
			(createChildParameter
				(DiagramapseudocodigoPackage.Literals.INICIO__TIENE,
				 DiagramapseudocodigoFactory.eINSTANCE.createVariableID()));

		newChildDescriptors.add
			(createChildParameter
				(DiagramapseudocodigoPackage.Literals.INICIO__TIENE,
				 DiagramapseudocodigoFactory.eINSTANCE.createConstCadena()));

		newChildDescriptors.add
			(createChildParameter
				(DiagramapseudocodigoPackage.Literals.INICIO__TIENE,
				 DiagramapseudocodigoFactory.eINSTANCE.createNumeroEntero()));

		newChildDescriptors.add
			(createChildParameter
				(DiagramapseudocodigoPackage.Literals.INICIO__TIENE,
				 DiagramapseudocodigoFactory.eINSTANCE.createAsignacion()));

		newChildDescriptors.add
			(createChildParameter
				(DiagramapseudocodigoPackage.Literals.INICIO__TIENE,
				 DiagramapseudocodigoFactory.eINSTANCE.createEscribir()));

		newChildDescriptors.add
			(createChildParameter
				(DiagramapseudocodigoPackage.Literals.INICIO__TIENE,
				 DiagramapseudocodigoFactory.eINSTANCE.createLeer()));

		newChildDescriptors.add
			(createChildParameter
				(DiagramapseudocodigoPackage.Literals.INICIO__TIENE,
				 DiagramapseudocodigoFactory.eINSTANCE.createNumeroDecimal()));

		newChildDescriptors.add
			(createChildParameter
				(DiagramapseudocodigoPackage.Literals.INICIO__TIENE,
				 DiagramapseudocodigoFactory.eINSTANCE.createoperacion()));

		newChildDescriptors.add
			(createChildParameter
				(DiagramapseudocodigoPackage.Literals.INICIO__TIENE,
				 DiagramapseudocodigoFactory.eINSTANCE.createValorBooleano()));

		newChildDescriptors.add
			(createChildParameter
				(DiagramapseudocodigoPackage.Literals.INICIO__TIENE,
				 DiagramapseudocodigoFactory.eINSTANCE.createSi()));

		newChildDescriptors.add
			(createChildParameter
				(DiagramapseudocodigoPackage.Literals.INICIO__TIENE,
				 DiagramapseudocodigoFactory.eINSTANCE.createmientras()));

		newChildDescriptors.add
			(createChildParameter
				(DiagramapseudocodigoPackage.Literals.INICIO__TIENE,
				 DiagramapseudocodigoFactory.eINSTANCE.createrepetir()));

		newChildDescriptors.add
			(createChildParameter
				(DiagramapseudocodigoPackage.Literals.INICIO__TIENE,
				 DiagramapseudocodigoFactory.eINSTANCE.createdesde()));

		newChildDescriptors.add
			(createChildParameter
				(DiagramapseudocodigoPackage.Literals.INICIO__TIENE,
				 DiagramapseudocodigoFactory.eINSTANCE.createCaracter()));

		newChildDescriptors.add
			(createChildParameter
				(DiagramapseudocodigoPackage.Literals.INICIO__TIENE,
				 DiagramapseudocodigoFactory.eINSTANCE.createInternas()));

		newChildDescriptors.add
			(createChildParameter
				(DiagramapseudocodigoPackage.Literals.INICIO__TIENE,
				 DiagramapseudocodigoFactory.eINSTANCE.createsegun()));

		newChildDescriptors.add
			(createChildParameter
				(DiagramapseudocodigoPackage.Literals.INICIO__TIENE,
				 DiagramapseudocodigoFactory.eINSTANCE.createValorComplejo()));

		newChildDescriptors.add
			(createChildParameter
				(DiagramapseudocodigoPackage.Literals.INICIO__TIENE,
				 DiagramapseudocodigoFactory.eINSTANCE.createValorRegistro()));

		newChildDescriptors.add
			(createChildParameter
				(DiagramapseudocodigoPackage.Literals.INICIO__TIENE,
				 DiagramapseudocodigoFactory.eINSTANCE.createValorVector()));

		newChildDescriptors.add
			(createChildParameter
				(DiagramapseudocodigoPackage.Literals.INICIO__TIENE,
				 DiagramapseudocodigoFactory.eINSTANCE.createValorMatriz()));

		newChildDescriptors.add
			(createChildParameter
				(DiagramapseudocodigoPackage.Literals.INICIO__TIENE,
				 DiagramapseudocodigoFactory.eINSTANCE.createFuncionFicheroAbrir()));

		newChildDescriptors.add
			(createChildParameter
				(DiagramapseudocodigoPackage.Literals.INICIO__TIENE,
				 DiagramapseudocodigoFactory.eINSTANCE.createFuncionFicheroCerrar()));

		newChildDescriptors.add
			(createChildParameter
				(DiagramapseudocodigoPackage.Literals.INICIO__TIENE,
				 DiagramapseudocodigoFactory.eINSTANCE.createSuma()));

		newChildDescriptors.add
			(createChildParameter
				(DiagramapseudocodigoPackage.Literals.INICIO__TIENE,
				 DiagramapseudocodigoFactory.eINSTANCE.createResta()));

		newChildDescriptors.add
			(createChildParameter
				(DiagramapseudocodigoPackage.Literals.INICIO__TIENE,
				 DiagramapseudocodigoFactory.eINSTANCE.createMultiplicacion()));

		newChildDescriptors.add
			(createChildParameter
				(DiagramapseudocodigoPackage.Literals.INICIO__TIENE,
				 DiagramapseudocodigoFactory.eINSTANCE.createDivision()));

		newChildDescriptors.add
			(createChildParameter
				(DiagramapseudocodigoPackage.Literals.INICIO__TIENE,
				 DiagramapseudocodigoFactory.eINSTANCE.createOr()));

		newChildDescriptors.add
			(createChildParameter
				(DiagramapseudocodigoPackage.Literals.INICIO__TIENE,
				 DiagramapseudocodigoFactory.eINSTANCE.createAnd()));

		newChildDescriptors.add
			(createChildParameter
				(DiagramapseudocodigoPackage.Literals.INICIO__TIENE,
				 DiagramapseudocodigoFactory.eINSTANCE.createComparacion()));

		newChildDescriptors.add
			(createChildParameter
				(DiagramapseudocodigoPackage.Literals.INICIO__TIENE,
				 DiagramapseudocodigoFactory.eINSTANCE.createIgualdad()));

		newChildDescriptors.add
			(createChildParameter
				(DiagramapseudocodigoPackage.Literals.INICIO__TIENE,
				 DiagramapseudocodigoFactory.eINSTANCE.createNegativa()));

		newChildDescriptors.add
			(createChildParameter
				(DiagramapseudocodigoPackage.Literals.INICIO__TIENE,
				 DiagramapseudocodigoFactory.eINSTANCE.createNegacion()));

		newChildDescriptors.add
			(createChildParameter
				(DiagramapseudocodigoPackage.Literals.INICIO__TIENE,
				 DiagramapseudocodigoFactory.eINSTANCE.createAsignacionNormal()));

		newChildDescriptors.add
			(createChildParameter
				(DiagramapseudocodigoPackage.Literals.INICIO__TIENE,
				 DiagramapseudocodigoFactory.eINSTANCE.createAsignacionCompleja()));

		newChildDescriptors.add
			(createChildParameter
				(DiagramapseudocodigoPackage.Literals.INICIO__DECLARACION,
				 DiagramapseudocodigoFactory.eINSTANCE.createDeclaracion()));

		newChildDescriptors.add
			(createChildParameter
				(DiagramapseudocodigoPackage.Literals.INICIO__DECLARACION,
				 DiagramapseudocodigoFactory.eINSTANCE.createDeclaracionVariable()));

		newChildDescriptors.add
			(createChildParameter
				(DiagramapseudocodigoPackage.Literals.INICIO__DECLARACION,
				 DiagramapseudocodigoFactory.eINSTANCE.createDeclaracionPropia()));
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
