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

import org.joclal.browserAutomation.Action;
import org.joclal.browserAutomation.BooleanExp;
import org.joclal.browserAutomation.BrowserAutomationPackage;
import org.joclal.browserAutomation.DoWhile;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Do While</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.joclal.browserAutomation.impl.DoWhileImpl#getActions <em>Actions</em>}</li>
 *   <li>{@link org.joclal.browserAutomation.impl.DoWhileImpl#getCondition <em>Condition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DoWhileImpl extends ActionImpl implements DoWhile
{
  /**
   * The cached value of the '{@link #getActions() <em>Actions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getActions()
   * @generated
   * @ordered
   */
  protected EList<Action> actions;

  /**
   * The cached value of the '{@link #getCondition() <em>Condition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCondition()
   * @generated
   * @ordered
   */
  protected BooleanExp condition;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DoWhileImpl()
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
    return BrowserAutomationPackage.Literals.DO_WHILE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Action> getActions()
  {
    if (actions == null)
    {
      actions = new EObjectContainmentEList<Action>(Action.class, this, BrowserAutomationPackage.DO_WHILE__ACTIONS);
    }
    return actions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BooleanExp getCondition()
  {
    return condition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCondition(BooleanExp newCondition, NotificationChain msgs)
  {
    BooleanExp oldCondition = condition;
    condition = newCondition;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BrowserAutomationPackage.DO_WHILE__CONDITION, oldCondition, newCondition);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCondition(BooleanExp newCondition)
  {
    if (newCondition != condition)
    {
      NotificationChain msgs = null;
      if (condition != null)
        msgs = ((InternalEObject)condition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BrowserAutomationPackage.DO_WHILE__CONDITION, null, msgs);
      if (newCondition != null)
        msgs = ((InternalEObject)newCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BrowserAutomationPackage.DO_WHILE__CONDITION, null, msgs);
      msgs = basicSetCondition(newCondition, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BrowserAutomationPackage.DO_WHILE__CONDITION, newCondition, newCondition));
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
      case BrowserAutomationPackage.DO_WHILE__ACTIONS:
        return ((InternalEList<?>)getActions()).basicRemove(otherEnd, msgs);
      case BrowserAutomationPackage.DO_WHILE__CONDITION:
        return basicSetCondition(null, msgs);
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
      case BrowserAutomationPackage.DO_WHILE__ACTIONS:
        return getActions();
      case BrowserAutomationPackage.DO_WHILE__CONDITION:
        return getCondition();
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
      case BrowserAutomationPackage.DO_WHILE__ACTIONS:
        getActions().clear();
        getActions().addAll((Collection<? extends Action>)newValue);
        return;
      case BrowserAutomationPackage.DO_WHILE__CONDITION:
        setCondition((BooleanExp)newValue);
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
      case BrowserAutomationPackage.DO_WHILE__ACTIONS:
        getActions().clear();
        return;
      case BrowserAutomationPackage.DO_WHILE__CONDITION:
        setCondition((BooleanExp)null);
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
      case BrowserAutomationPackage.DO_WHILE__ACTIONS:
        return actions != null && !actions.isEmpty();
      case BrowserAutomationPackage.DO_WHILE__CONDITION:
        return condition != null;
    }
    return super.eIsSet(featureID);
  }

} //DoWhileImpl
