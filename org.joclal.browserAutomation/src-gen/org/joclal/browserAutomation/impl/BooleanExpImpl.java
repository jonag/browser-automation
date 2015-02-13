/**
 */
package org.joclal.browserAutomation.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.joclal.browserAutomation.BooleanExp;
import org.joclal.browserAutomation.BrowserAutomationPackage;
import org.joclal.browserAutomation.Operator;
import org.joclal.browserAutomation.Value;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Boolean Exp</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.joclal.browserAutomation.impl.BooleanExpImpl#getLeftMember <em>Left Member</em>}</li>
 *   <li>{@link org.joclal.browserAutomation.impl.BooleanExpImpl#getOperator <em>Operator</em>}</li>
 *   <li>{@link org.joclal.browserAutomation.impl.BooleanExpImpl#getRightMember <em>Right Member</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BooleanExpImpl extends MinimalEObjectImpl.Container implements BooleanExp
{
  /**
   * The cached value of the '{@link #getLeftMember() <em>Left Member</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLeftMember()
   * @generated
   * @ordered
   */
  protected Value leftMember;

  /**
   * The default value of the '{@link #getOperator() <em>Operator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOperator()
   * @generated
   * @ordered
   */
  protected static final Operator OPERATOR_EDEFAULT = Operator.EQUALS;

  /**
   * The cached value of the '{@link #getOperator() <em>Operator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOperator()
   * @generated
   * @ordered
   */
  protected Operator operator = OPERATOR_EDEFAULT;

  /**
   * The cached value of the '{@link #getRightMember() <em>Right Member</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRightMember()
   * @generated
   * @ordered
   */
  protected Value rightMember;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BooleanExpImpl()
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
    return BrowserAutomationPackage.Literals.BOOLEAN_EXP;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Value getLeftMember()
  {
    return leftMember;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLeftMember(Value newLeftMember, NotificationChain msgs)
  {
    Value oldLeftMember = leftMember;
    leftMember = newLeftMember;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BrowserAutomationPackage.BOOLEAN_EXP__LEFT_MEMBER, oldLeftMember, newLeftMember);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLeftMember(Value newLeftMember)
  {
    if (newLeftMember != leftMember)
    {
      NotificationChain msgs = null;
      if (leftMember != null)
        msgs = ((InternalEObject)leftMember).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BrowserAutomationPackage.BOOLEAN_EXP__LEFT_MEMBER, null, msgs);
      if (newLeftMember != null)
        msgs = ((InternalEObject)newLeftMember).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BrowserAutomationPackage.BOOLEAN_EXP__LEFT_MEMBER, null, msgs);
      msgs = basicSetLeftMember(newLeftMember, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BrowserAutomationPackage.BOOLEAN_EXP__LEFT_MEMBER, newLeftMember, newLeftMember));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Operator getOperator()
  {
    return operator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOperator(Operator newOperator)
  {
    Operator oldOperator = operator;
    operator = newOperator == null ? OPERATOR_EDEFAULT : newOperator;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BrowserAutomationPackage.BOOLEAN_EXP__OPERATOR, oldOperator, operator));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Value getRightMember()
  {
    return rightMember;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRightMember(Value newRightMember, NotificationChain msgs)
  {
    Value oldRightMember = rightMember;
    rightMember = newRightMember;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BrowserAutomationPackage.BOOLEAN_EXP__RIGHT_MEMBER, oldRightMember, newRightMember);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRightMember(Value newRightMember)
  {
    if (newRightMember != rightMember)
    {
      NotificationChain msgs = null;
      if (rightMember != null)
        msgs = ((InternalEObject)rightMember).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BrowserAutomationPackage.BOOLEAN_EXP__RIGHT_MEMBER, null, msgs);
      if (newRightMember != null)
        msgs = ((InternalEObject)newRightMember).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BrowserAutomationPackage.BOOLEAN_EXP__RIGHT_MEMBER, null, msgs);
      msgs = basicSetRightMember(newRightMember, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BrowserAutomationPackage.BOOLEAN_EXP__RIGHT_MEMBER, newRightMember, newRightMember));
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
      case BrowserAutomationPackage.BOOLEAN_EXP__LEFT_MEMBER:
        return basicSetLeftMember(null, msgs);
      case BrowserAutomationPackage.BOOLEAN_EXP__RIGHT_MEMBER:
        return basicSetRightMember(null, msgs);
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
      case BrowserAutomationPackage.BOOLEAN_EXP__LEFT_MEMBER:
        return getLeftMember();
      case BrowserAutomationPackage.BOOLEAN_EXP__OPERATOR:
        return getOperator();
      case BrowserAutomationPackage.BOOLEAN_EXP__RIGHT_MEMBER:
        return getRightMember();
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
      case BrowserAutomationPackage.BOOLEAN_EXP__LEFT_MEMBER:
        setLeftMember((Value)newValue);
        return;
      case BrowserAutomationPackage.BOOLEAN_EXP__OPERATOR:
        setOperator((Operator)newValue);
        return;
      case BrowserAutomationPackage.BOOLEAN_EXP__RIGHT_MEMBER:
        setRightMember((Value)newValue);
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
      case BrowserAutomationPackage.BOOLEAN_EXP__LEFT_MEMBER:
        setLeftMember((Value)null);
        return;
      case BrowserAutomationPackage.BOOLEAN_EXP__OPERATOR:
        setOperator(OPERATOR_EDEFAULT);
        return;
      case BrowserAutomationPackage.BOOLEAN_EXP__RIGHT_MEMBER:
        setRightMember((Value)null);
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
      case BrowserAutomationPackage.BOOLEAN_EXP__LEFT_MEMBER:
        return leftMember != null;
      case BrowserAutomationPackage.BOOLEAN_EXP__OPERATOR:
        return operator != OPERATOR_EDEFAULT;
      case BrowserAutomationPackage.BOOLEAN_EXP__RIGHT_MEMBER:
        return rightMember != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (operator: ");
    result.append(operator);
    result.append(')');
    return result.toString();
  }

} //BooleanExpImpl
