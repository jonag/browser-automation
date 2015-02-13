/**
 */
package org.joclal.browserAutomation.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

import org.joclal.browserAutomation.BrowserAutomationPackage;
import org.joclal.browserAutomation.Selector;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Selector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.joclal.browserAutomation.impl.SelectorImpl#getHaydies <em>Haydies</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SelectorImpl extends MinimalEObjectImpl.Container implements Selector
{
  /**
   * The cached value of the '{@link #getHaydies() <em>Haydies</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHaydies()
   * @generated
   * @ordered
   */
  protected EList<String> haydies;

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
  public EList<String> getHaydies()
  {
    if (haydies == null)
    {
      haydies = new EDataTypeEList<String>(String.class, this, BrowserAutomationPackage.SELECTOR__HAYDIES);
    }
    return haydies;
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
      case BrowserAutomationPackage.SELECTOR__HAYDIES:
        return getHaydies();
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
      case BrowserAutomationPackage.SELECTOR__HAYDIES:
        getHaydies().clear();
        getHaydies().addAll((Collection<? extends String>)newValue);
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
      case BrowserAutomationPackage.SELECTOR__HAYDIES:
        getHaydies().clear();
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
      case BrowserAutomationPackage.SELECTOR__HAYDIES:
        return haydies != null && !haydies.isEmpty();
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
    result.append(" (haydies: ");
    result.append(haydies);
    result.append(')');
    return result.toString();
  }

} //SelectorImpl
