/**
 */
package org.joclal.browserAutomation.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.joclal.browserAutomation.BrowserAutomationPackage;
import org.joclal.browserAutomation.DomID;
import org.joclal.browserAutomation.Selector;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Selector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.joclal.browserAutomation.impl.SelectorImpl#getSel <em>Sel</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SelectorImpl extends MinimalEObjectImpl.Container implements Selector
{
  /**
   * The cached value of the '{@link #getSel() <em>Sel</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSel()
   * @generated
   * @ordered
   */
  protected DomID sel;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SelectorImpl()
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
    return BrowserAutomationPackage.Literals.SELECTOR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DomID getSel()
  {
    return sel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSel(DomID newSel, NotificationChain msgs)
  {
    DomID oldSel = sel;
    sel = newSel;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BrowserAutomationPackage.SELECTOR__SEL, oldSel, newSel);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSel(DomID newSel)
  {
    if (newSel != sel)
    {
      NotificationChain msgs = null;
      if (sel != null)
        msgs = ((InternalEObject)sel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BrowserAutomationPackage.SELECTOR__SEL, null, msgs);
      if (newSel != null)
        msgs = ((InternalEObject)newSel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BrowserAutomationPackage.SELECTOR__SEL, null, msgs);
      msgs = basicSetSel(newSel, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BrowserAutomationPackage.SELECTOR__SEL, newSel, newSel));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case BrowserAutomationPackage.SELECTOR__SEL:
        return basicSetSel(null, msgs);
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
    switch (featureID)
    {
      case BrowserAutomationPackage.SELECTOR__SEL:
        return getSel();
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
    switch (featureID)
    {
      case BrowserAutomationPackage.SELECTOR__SEL:
        setSel((DomID)newValue);
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
    switch (featureID)
    {
      case BrowserAutomationPackage.SELECTOR__SEL:
        setSel((DomID)null);
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
    switch (featureID)
    {
      case BrowserAutomationPackage.SELECTOR__SEL:
        return sel != null;
    }
    return super.eIsSet(featureID);
  }

} //SelectorImpl
