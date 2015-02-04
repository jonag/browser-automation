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
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.joclal.browserAutomation.Action;
import org.joclal.browserAutomation.Browser;
import org.joclal.browserAutomation.BrowserAutomationPackage;
import org.joclal.browserAutomation.Goto;
import org.joclal.browserAutomation.Model;
import org.joclal.browserAutomation.Subroutine;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.joclal.browserAutomation.impl.ModelImpl#getSubroutines <em>Subroutines</em>}</li>
 *   <li>{@link org.joclal.browserAutomation.impl.ModelImpl#getBrowser <em>Browser</em>}</li>
 *   <li>{@link org.joclal.browserAutomation.impl.ModelImpl#getFirstGoTo <em>First Go To</em>}</li>
 *   <li>{@link org.joclal.browserAutomation.impl.ModelImpl#getActions <em>Actions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModelImpl extends MinimalEObjectImpl.Container implements Model
{
  /**
   * The cached value of the '{@link #getSubroutines() <em>Subroutines</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSubroutines()
   * @generated
   * @ordered
   */
  protected EList<Subroutine> subroutines;

  /**
   * The default value of the '{@link #getBrowser() <em>Browser</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBrowser()
   * @generated
   * @ordered
   */
  protected static final Browser BROWSER_EDEFAULT = Browser.CHROME;

  /**
   * The cached value of the '{@link #getBrowser() <em>Browser</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBrowser()
   * @generated
   * @ordered
   */
  protected Browser browser = BROWSER_EDEFAULT;

  /**
   * The cached value of the '{@link #getFirstGoTo() <em>First Go To</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFirstGoTo()
   * @generated
   * @ordered
   */
  protected Goto firstGoTo;

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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ModelImpl()
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
    return BrowserAutomationPackage.Literals.MODEL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Subroutine> getSubroutines()
  {
    if (subroutines == null)
    {
      subroutines = new EObjectContainmentEList<Subroutine>(Subroutine.class, this, BrowserAutomationPackage.MODEL__SUBROUTINES);
    }
    return subroutines;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Browser getBrowser()
  {
    return browser;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBrowser(Browser newBrowser)
  {
    Browser oldBrowser = browser;
    browser = newBrowser == null ? BROWSER_EDEFAULT : newBrowser;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BrowserAutomationPackage.MODEL__BROWSER, oldBrowser, browser));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Goto getFirstGoTo()
  {
    return firstGoTo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFirstGoTo(Goto newFirstGoTo, NotificationChain msgs)
  {
    Goto oldFirstGoTo = firstGoTo;
    firstGoTo = newFirstGoTo;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BrowserAutomationPackage.MODEL__FIRST_GO_TO, oldFirstGoTo, newFirstGoTo);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFirstGoTo(Goto newFirstGoTo)
  {
    if (newFirstGoTo != firstGoTo)
    {
      NotificationChain msgs = null;
      if (firstGoTo != null)
        msgs = ((InternalEObject)firstGoTo).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BrowserAutomationPackage.MODEL__FIRST_GO_TO, null, msgs);
      if (newFirstGoTo != null)
        msgs = ((InternalEObject)newFirstGoTo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BrowserAutomationPackage.MODEL__FIRST_GO_TO, null, msgs);
      msgs = basicSetFirstGoTo(newFirstGoTo, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BrowserAutomationPackage.MODEL__FIRST_GO_TO, newFirstGoTo, newFirstGoTo));
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
      actions = new EObjectContainmentEList<Action>(Action.class, this, BrowserAutomationPackage.MODEL__ACTIONS);
    }
    return actions;
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
      case BrowserAutomationPackage.MODEL__SUBROUTINES:
        return ((InternalEList<?>)getSubroutines()).basicRemove(otherEnd, msgs);
      case BrowserAutomationPackage.MODEL__FIRST_GO_TO:
        return basicSetFirstGoTo(null, msgs);
      case BrowserAutomationPackage.MODEL__ACTIONS:
        return ((InternalEList<?>)getActions()).basicRemove(otherEnd, msgs);
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
      case BrowserAutomationPackage.MODEL__SUBROUTINES:
        return getSubroutines();
      case BrowserAutomationPackage.MODEL__BROWSER:
        return getBrowser();
      case BrowserAutomationPackage.MODEL__FIRST_GO_TO:
        return getFirstGoTo();
      case BrowserAutomationPackage.MODEL__ACTIONS:
        return getActions();
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
      case BrowserAutomationPackage.MODEL__SUBROUTINES:
        getSubroutines().clear();
        getSubroutines().addAll((Collection<? extends Subroutine>)newValue);
        return;
      case BrowserAutomationPackage.MODEL__BROWSER:
        setBrowser((Browser)newValue);
        return;
      case BrowserAutomationPackage.MODEL__FIRST_GO_TO:
        setFirstGoTo((Goto)newValue);
        return;
      case BrowserAutomationPackage.MODEL__ACTIONS:
        getActions().clear();
        getActions().addAll((Collection<? extends Action>)newValue);
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
      case BrowserAutomationPackage.MODEL__SUBROUTINES:
        getSubroutines().clear();
        return;
      case BrowserAutomationPackage.MODEL__BROWSER:
        setBrowser(BROWSER_EDEFAULT);
        return;
      case BrowserAutomationPackage.MODEL__FIRST_GO_TO:
        setFirstGoTo((Goto)null);
        return;
      case BrowserAutomationPackage.MODEL__ACTIONS:
        getActions().clear();
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
      case BrowserAutomationPackage.MODEL__SUBROUTINES:
        return subroutines != null && !subroutines.isEmpty();
      case BrowserAutomationPackage.MODEL__BROWSER:
        return browser != BROWSER_EDEFAULT;
      case BrowserAutomationPackage.MODEL__FIRST_GO_TO:
        return firstGoTo != null;
      case BrowserAutomationPackage.MODEL__ACTIONS:
        return actions != null && !actions.isEmpty();
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
    result.append(" (browser: ");
    result.append(browser);
    result.append(')');
    return result.toString();
  }

} //ModelImpl
