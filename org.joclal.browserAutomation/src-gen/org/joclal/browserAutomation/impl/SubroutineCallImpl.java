/**
 */
package org.joclal.browserAutomation.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.joclal.browserAutomation.BrowserAutomationPackage;
import org.joclal.browserAutomation.Subroutine;
import org.joclal.browserAutomation.SubroutineCall;
import org.joclal.browserAutomation.Value;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Subroutine Call</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.joclal.browserAutomation.impl.SubroutineCallImpl#getSubroutine <em>Subroutine</em>}</li>
 *   <li>{@link org.joclal.browserAutomation.impl.SubroutineCallImpl#getParams <em>Params</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SubroutineCallImpl extends ActionImpl implements SubroutineCall
{
  /**
   * The cached value of the '{@link #getSubroutine() <em>Subroutine</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSubroutine()
   * @generated
   * @ordered
   */
  protected Subroutine subroutine;

  /**
   * The cached value of the '{@link #getParams() <em>Params</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParams()
   * @generated
   * @ordered
   */
  protected EList<Value> params;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SubroutineCallImpl()
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
    return BrowserAutomationPackage.Literals.SUBROUTINE_CALL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Subroutine getSubroutine()
  {
    if (subroutine != null && subroutine.eIsProxy())
    {
      InternalEObject oldSubroutine = (InternalEObject)subroutine;
      subroutine = (Subroutine)eResolveProxy(oldSubroutine);
      if (subroutine != oldSubroutine)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, BrowserAutomationPackage.SUBROUTINE_CALL__SUBROUTINE, oldSubroutine, subroutine));
      }
    }
    return subroutine;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Subroutine basicGetSubroutine()
  {
    return subroutine;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSubroutine(Subroutine newSubroutine)
  {
    Subroutine oldSubroutine = subroutine;
    subroutine = newSubroutine;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BrowserAutomationPackage.SUBROUTINE_CALL__SUBROUTINE, oldSubroutine, subroutine));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Value> getParams()
  {
    if (params == null)
    {
      params = new EObjectContainmentEList<Value>(Value.class, this, BrowserAutomationPackage.SUBROUTINE_CALL__PARAMS);
    }
    return params;
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
      case BrowserAutomationPackage.SUBROUTINE_CALL__PARAMS:
        return ((InternalEList<?>)getParams()).basicRemove(otherEnd, msgs);
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
      case BrowserAutomationPackage.SUBROUTINE_CALL__SUBROUTINE:
        if (resolve) return getSubroutine();
        return basicGetSubroutine();
      case BrowserAutomationPackage.SUBROUTINE_CALL__PARAMS:
        return getParams();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case BrowserAutomationPackage.SUBROUTINE_CALL__SUBROUTINE:
        setSubroutine((Subroutine)newValue);
        return;
      case BrowserAutomationPackage.SUBROUTINE_CALL__PARAMS:
        getParams().clear();
        getParams().addAll((Collection<? extends Value>)newValue);
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
      case BrowserAutomationPackage.SUBROUTINE_CALL__SUBROUTINE:
        setSubroutine((Subroutine)null);
        return;
      case BrowserAutomationPackage.SUBROUTINE_CALL__PARAMS:
        getParams().clear();
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
      case BrowserAutomationPackage.SUBROUTINE_CALL__SUBROUTINE:
        return subroutine != null;
      case BrowserAutomationPackage.SUBROUTINE_CALL__PARAMS:
        return params != null && !params.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //SubroutineCallImpl
