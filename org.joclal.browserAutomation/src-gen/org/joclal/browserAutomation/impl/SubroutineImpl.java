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
import org.joclal.browserAutomation.BrowserAutomationPackage;
import org.joclal.browserAutomation.Subroutine;
import org.joclal.browserAutomation.SubroutineParam;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Subroutine</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.joclal.browserAutomation.impl.SubroutineImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.joclal.browserAutomation.impl.SubroutineImpl#getParams <em>Params</em>}</li>
 *   <li>{@link org.joclal.browserAutomation.impl.SubroutineImpl#getActions <em>Actions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SubroutineImpl extends MinimalEObjectImpl.Container implements Subroutine
{
  /**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
  protected static final String NAME_EDEFAULT = null;

  /**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
  protected String name = NAME_EDEFAULT;

  /**
	 * The cached value of the '{@link #getParams() <em>Params</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getParams()
	 * @generated
	 * @ordered
	 */
  protected SubroutineParam params;

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
  protected SubroutineImpl()
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
		return BrowserAutomationPackage.Literals.SUBROUTINE;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String getName()
  {
		return name;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setName(String newName)
  {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BrowserAutomationPackage.SUBROUTINE__NAME, oldName, name));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public SubroutineParam getParams()
  {
		return params;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetParams(SubroutineParam newParams, NotificationChain msgs)
  {
		SubroutineParam oldParams = params;
		params = newParams;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BrowserAutomationPackage.SUBROUTINE__PARAMS, oldParams, newParams);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setParams(SubroutineParam newParams)
  {
		if (newParams != params) {
			NotificationChain msgs = null;
			if (params != null)
				msgs = ((InternalEObject)params).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BrowserAutomationPackage.SUBROUTINE__PARAMS, null, msgs);
			if (newParams != null)
				msgs = ((InternalEObject)newParams).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BrowserAutomationPackage.SUBROUTINE__PARAMS, null, msgs);
			msgs = basicSetParams(newParams, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BrowserAutomationPackage.SUBROUTINE__PARAMS, newParams, newParams));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList<Action> getActions()
  {
		if (actions == null) {
			actions = new EObjectContainmentEList<Action>(Action.class, this, BrowserAutomationPackage.SUBROUTINE__ACTIONS);
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
		switch (featureID) {
			case BrowserAutomationPackage.SUBROUTINE__PARAMS:
				return basicSetParams(null, msgs);
			case BrowserAutomationPackage.SUBROUTINE__ACTIONS:
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
		switch (featureID) {
			case BrowserAutomationPackage.SUBROUTINE__NAME:
				return getName();
			case BrowserAutomationPackage.SUBROUTINE__PARAMS:
				return getParams();
			case BrowserAutomationPackage.SUBROUTINE__ACTIONS:
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
		switch (featureID) {
			case BrowserAutomationPackage.SUBROUTINE__NAME:
				setName((String)newValue);
				return;
			case BrowserAutomationPackage.SUBROUTINE__PARAMS:
				setParams((SubroutineParam)newValue);
				return;
			case BrowserAutomationPackage.SUBROUTINE__ACTIONS:
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
		switch (featureID) {
			case BrowserAutomationPackage.SUBROUTINE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case BrowserAutomationPackage.SUBROUTINE__PARAMS:
				setParams((SubroutineParam)null);
				return;
			case BrowserAutomationPackage.SUBROUTINE__ACTIONS:
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
		switch (featureID) {
			case BrowserAutomationPackage.SUBROUTINE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case BrowserAutomationPackage.SUBROUTINE__PARAMS:
				return params != null;
			case BrowserAutomationPackage.SUBROUTINE__ACTIONS:
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //SubroutineImpl
