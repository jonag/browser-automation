/**
 */
package org.joclal.browserAutomation.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.joclal.browserAutomation.BrowserAutomationPackage;
import org.joclal.browserAutomation.Check;
import org.joclal.browserAutomation.Selector;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Check</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.joclal.browserAutomation.impl.CheckImpl#getCheckbox <em>Checkbox</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CheckImpl extends ActionImpl implements Check
{
  /**
	 * The cached value of the '{@link #getCheckbox() <em>Checkbox</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getCheckbox()
	 * @generated
	 * @ordered
	 */
  protected Selector checkbox;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected CheckImpl()
  {
		super();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  protected EClass eStaticClass()
  {
		return BrowserAutomationPackage.Literals.CHECK;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Selector getCheckbox()
  {
		return checkbox;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetCheckbox(Selector newCheckbox, NotificationChain msgs)
  {
		Selector oldCheckbox = checkbox;
		checkbox = newCheckbox;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BrowserAutomationPackage.CHECK__CHECKBOX, oldCheckbox, newCheckbox);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setCheckbox(Selector newCheckbox)
  {
		if (newCheckbox != checkbox) {
			NotificationChain msgs = null;
			if (checkbox != null)
				msgs = ((InternalEObject)checkbox).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BrowserAutomationPackage.CHECK__CHECKBOX, null, msgs);
			if (newCheckbox != null)
				msgs = ((InternalEObject)newCheckbox).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BrowserAutomationPackage.CHECK__CHECKBOX, null, msgs);
			msgs = basicSetCheckbox(newCheckbox, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BrowserAutomationPackage.CHECK__CHECKBOX, newCheckbox, newCheckbox));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
		switch (featureID) {
			case BrowserAutomationPackage.CHECK__CHECKBOX:
				return basicSetCheckbox(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
		switch (featureID) {
			case BrowserAutomationPackage.CHECK__CHECKBOX:
				return getCheckbox();
		}
		return super.eGet(featureID, resolve, coreType);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public void eSet(int featureID, Object newValue)
  {
		switch (featureID) {
			case BrowserAutomationPackage.CHECK__CHECKBOX:
				setCheckbox((Selector)newValue);
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
  public void eUnset(int featureID)
  {
		switch (featureID) {
			case BrowserAutomationPackage.CHECK__CHECKBOX:
				setCheckbox((Selector)null);
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
  public boolean eIsSet(int featureID)
  {
		switch (featureID) {
			case BrowserAutomationPackage.CHECK__CHECKBOX:
				return checkbox != null;
		}
		return super.eIsSet(featureID);
	}

} //CheckImpl
