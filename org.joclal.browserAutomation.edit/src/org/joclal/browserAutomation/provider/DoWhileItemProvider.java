/**
 */
package org.joclal.browserAutomation.provider;


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

import org.joclal.browserAutomation.BrowserAutomationFactory;
import org.joclal.browserAutomation.BrowserAutomationPackage;
import org.joclal.browserAutomation.DoWhile;

/**
 * This is the item provider adapter for a {@link org.joclal.browserAutomation.DoWhile} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DoWhileItemProvider extends ActionItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DoWhileItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(BrowserAutomationPackage.Literals.DO_WHILE__ACTIONS);
			childrenFeatures.add(BrowserAutomationPackage.Literals.DO_WHILE__CONDITION);
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
	 * This returns DoWhile.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/DoWhile"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_DoWhile_type");
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

		switch (notification.getFeatureID(DoWhile.class)) {
			case BrowserAutomationPackage.DO_WHILE__ACTIONS:
			case BrowserAutomationPackage.DO_WHILE__CONDITION:
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
				(BrowserAutomationPackage.Literals.DO_WHILE__ACTIONS,
				 BrowserAutomationFactory.eINSTANCE.createAction()));

		newChildDescriptors.add
			(createChildParameter
				(BrowserAutomationPackage.Literals.DO_WHILE__ACTIONS,
				 BrowserAutomationFactory.eINSTANCE.createGoto()));

		newChildDescriptors.add
			(createChildParameter
				(BrowserAutomationPackage.Literals.DO_WHILE__ACTIONS,
				 BrowserAutomationFactory.eINSTANCE.createClickOn()));

		newChildDescriptors.add
			(createChildParameter
				(BrowserAutomationPackage.Literals.DO_WHILE__ACTIONS,
				 BrowserAutomationFactory.eINSTANCE.createFill()));

		newChildDescriptors.add
			(createChildParameter
				(BrowserAutomationPackage.Literals.DO_WHILE__ACTIONS,
				 BrowserAutomationFactory.eINSTANCE.createCheck()));

		newChildDescriptors.add
			(createChildParameter
				(BrowserAutomationPackage.Literals.DO_WHILE__ACTIONS,
				 BrowserAutomationFactory.eINSTANCE.createUncheck()));

		newChildDescriptors.add
			(createChildParameter
				(BrowserAutomationPackage.Literals.DO_WHILE__ACTIONS,
				 BrowserAutomationFactory.eINSTANCE.createLet()));

		newChildDescriptors.add
			(createChildParameter
				(BrowserAutomationPackage.Literals.DO_WHILE__ACTIONS,
				 BrowserAutomationFactory.eINSTANCE.createDoWhile()));

		newChildDescriptors.add
			(createChildParameter
				(BrowserAutomationPackage.Literals.DO_WHILE__ACTIONS,
				 BrowserAutomationFactory.eINSTANCE.createIfThen()));

		newChildDescriptors.add
			(createChildParameter
				(BrowserAutomationPackage.Literals.DO_WHILE__ACTIONS,
				 BrowserAutomationFactory.eINSTANCE.createSubroutineCall()));

		newChildDescriptors.add
			(createChildParameter
				(BrowserAutomationPackage.Literals.DO_WHILE__CONDITION,
				 BrowserAutomationFactory.eINSTANCE.createBooleanExp()));
	}

}
