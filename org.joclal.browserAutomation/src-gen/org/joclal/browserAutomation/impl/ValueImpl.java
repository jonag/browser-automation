/**
 */
package org.joclal.browserAutomation.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.joclal.browserAutomation.BrowserAutomationPackage;
import org.joclal.browserAutomation.Let;
import org.joclal.browserAutomation.Value;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.joclal.browserAutomation.impl.ValueImpl#getString <em>String</em>}</li>
 *   <li>{@link org.joclal.browserAutomation.impl.ValueImpl#getInt <em>Int</em>}</li>
 *   <li>{@link org.joclal.browserAutomation.impl.ValueImpl#getLet <em>Let</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ValueImpl extends MinimalEObjectImpl.Container implements Value
{
  /**
   * The default value of the '{@link #getString() <em>String</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getString()
   * @generated
   * @ordered
   */
  protected static final String STRING_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getString() <em>String</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getString()
   * @generated
   * @ordered
   */
  protected String string = STRING_EDEFAULT;

  /**
   * The default value of the '{@link #getInt() <em>Int</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInt()
   * @generated
   * @ordered
   */
  protected static final int INT_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getInt() <em>Int</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInt()
   * @generated
   * @ordered
   */
  protected int int_ = INT_EDEFAULT;

  /**
   * The cached value of the '{@link #getLet() <em>Let</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLet()
   * @generated
   * @ordered
   */
  protected Let let;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ValueImpl()
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
    return BrowserAutomationPackage.Literals.VALUE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getString()
  {
    return string;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setString(String newString)
  {
    String oldString = string;
    string = newString;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BrowserAutomationPackage.VALUE__STRING, oldString, string));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getInt()
  {
    return int_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInt(int newInt)
  {
    int oldInt = int_;
    int_ = newInt;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BrowserAutomationPackage.VALUE__INT, oldInt, int_));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Let getLet()
  {
    if (let != null && let.eIsProxy())
    {
      InternalEObject oldLet = (InternalEObject)let;
      let = (Let)eResolveProxy(oldLet);
      if (let != oldLet)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, BrowserAutomationPackage.VALUE__LET, oldLet, let));
      }
    }
    return let;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Let basicGetLet()
  {
    return let;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLet(Let newLet)
  {
    Let oldLet = let;
    let = newLet;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BrowserAutomationPackage.VALUE__LET, oldLet, let));
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
      case BrowserAutomationPackage.VALUE__STRING:
        return getString();
      case BrowserAutomationPackage.VALUE__INT:
        return getInt();
      case BrowserAutomationPackage.VALUE__LET:
        if (resolve) return getLet();
        return basicGetLet();
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
      case BrowserAutomationPackage.VALUE__STRING:
        setString((String)newValue);
        return;
      case BrowserAutomationPackage.VALUE__INT:
        setInt((Integer)newValue);
        return;
      case BrowserAutomationPackage.VALUE__LET:
        setLet((Let)newValue);
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
      case BrowserAutomationPackage.VALUE__STRING:
        setString(STRING_EDEFAULT);
        return;
      case BrowserAutomationPackage.VALUE__INT:
        setInt(INT_EDEFAULT);
        return;
      case BrowserAutomationPackage.VALUE__LET:
        setLet((Let)null);
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
      case BrowserAutomationPackage.VALUE__STRING:
        return STRING_EDEFAULT == null ? string != null : !STRING_EDEFAULT.equals(string);
      case BrowserAutomationPackage.VALUE__INT:
        return int_ != INT_EDEFAULT;
      case BrowserAutomationPackage.VALUE__LET:
        return let != null;
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
    result.append(" (string: ");
    result.append(string);
    result.append(", int: ");
    result.append(int_);
    result.append(')');
    return result.toString();
  }

} //ValueImpl
