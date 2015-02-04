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
import org.joclal.browserAutomation.IfThen;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>If Then</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.joclal.browserAutomation.impl.IfThenImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.joclal.browserAutomation.impl.IfThenImpl#getThenActions <em>Then Actions</em>}</li>
 *   <li>{@link org.joclal.browserAutomation.impl.IfThenImpl#getElseActions <em>Else Actions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfThenImpl extends ActionImpl implements IfThen
{
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
   * The cached value of the '{@link #getThenActions() <em>Then Actions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getThenActions()
   * @generated
   * @ordered
   */
  protected EList<Action> thenActions;

  /**
   * The cached value of the '{@link #getElseActions() <em>Else Actions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElseActions()
   * @generated
   * @ordered
   */
  protected EList<Action> elseActions;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected IfThenImpl()
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
    return BrowserAutomationPackage.Literals.IF_THEN;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BrowserAutomationPackage.IF_THEN__CONDITION, oldCondition, newCondition);
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
        msgs = ((InternalEObject)condition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BrowserAutomationPackage.IF_THEN__CONDITION, null, msgs);
      if (newCondition != null)
        msgs = ((InternalEObject)newCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BrowserAutomationPackage.IF_THEN__CONDITION, null, msgs);
      msgs = basicSetCondition(newCondition, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BrowserAutomationPackage.IF_THEN__CONDITION, newCondition, newCondition));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Action> getThenActions()
  {
    if (thenActions == null)
    {
      thenActions = new EObjectContainmentEList<Action>(Action.class, this, BrowserAutomationPackage.IF_THEN__THEN_ACTIONS);
    }
    return thenActions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Action> getElseActions()
  {
    if (elseActions == null)
    {
      elseActions = new EObjectContainmentEList<Action>(Action.class, this, BrowserAutomationPackage.IF_THEN__ELSE_ACTIONS);
    }
    return elseActions;
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
      case BrowserAutomationPackage.IF_THEN__CONDITION:
        return basicSetCondition(null, msgs);
      case BrowserAutomationPackage.IF_THEN__THEN_ACTIONS:
        return ((InternalEList<?>)getThenActions()).basicRemove(otherEnd, msgs);
      case BrowserAutomationPackage.IF_THEN__ELSE_ACTIONS:
        return ((InternalEList<?>)getElseActions()).basicRemove(otherEnd, msgs);
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
      case BrowserAutomationPackage.IF_THEN__CONDITION:
        return getCondition();
      case BrowserAutomationPackage.IF_THEN__THEN_ACTIONS:
        return getThenActions();
      case BrowserAutomationPackage.IF_THEN__ELSE_ACTIONS:
        return getElseActions();
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
      case BrowserAutomationPackage.IF_THEN__CONDITION:
        setCondition((BooleanExp)newValue);
        return;
      case BrowserAutomationPackage.IF_THEN__THEN_ACTIONS:
        getThenActions().clear();
        getThenActions().addAll((Collection<? extends Action>)newValue);
        return;
      case BrowserAutomationPackage.IF_THEN__ELSE_ACTIONS:
        getElseActions().clear();
        getElseActions().addAll((Collection<? extends Action>)newValue);
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
      case BrowserAutomationPackage.IF_THEN__CONDITION:
        setCondition((BooleanExp)null);
        return;
      case BrowserAutomationPackage.IF_THEN__THEN_ACTIONS:
        getThenActions().clear();
        return;
      case BrowserAutomationPackage.IF_THEN__ELSE_ACTIONS:
        getElseActions().clear();
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
      case BrowserAutomationPackage.IF_THEN__CONDITION:
        return condition != null;
      case BrowserAutomationPackage.IF_THEN__THEN_ACTIONS:
        return thenActions != null && !thenActions.isEmpty();
      case BrowserAutomationPackage.IF_THEN__ELSE_ACTIONS:
        return elseActions != null && !elseActions.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //IfThenImpl
