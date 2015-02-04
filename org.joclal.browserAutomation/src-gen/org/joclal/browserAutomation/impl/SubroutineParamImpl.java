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
import org.joclal.browserAutomation.SubroutineParam;
import org.joclal.browserAutomation.VariableId;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Subroutine Param</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.joclal.browserAutomation.impl.SubroutineParamImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.joclal.browserAutomation.impl.SubroutineParamImpl#getNext <em>Next</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SubroutineParamImpl extends MinimalEObjectImpl.Container implements SubroutineParam
{
  /**
	 * The cached value of the '{@link #getName() <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
  protected VariableId name;

  /**
	 * The cached value of the '{@link #getNext() <em>Next</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getNext()
	 * @generated
	 * @ordered
	 */
  protected SubroutineParam next;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected SubroutineParamImpl()
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
		return BrowserAutomationPackage.Literals.SUBROUTINE_PARAM;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public VariableId getName()
  {
		return name;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetName(VariableId newName, NotificationChain msgs)
  {
		VariableId oldName = name;
		name = newName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BrowserAutomationPackage.SUBROUTINE_PARAM__NAME, oldName, newName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setName(VariableId newName)
  {
		if (newName != name) {
			NotificationChain msgs = null;
			if (name != null)
				msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BrowserAutomationPackage.SUBROUTINE_PARAM__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BrowserAutomationPackage.SUBROUTINE_PARAM__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BrowserAutomationPackage.SUBROUTINE_PARAM__NAME, newName, newName));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public SubroutineParam getNext()
  {
		return next;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetNext(SubroutineParam newNext, NotificationChain msgs)
  {
		SubroutineParam oldNext = next;
		next = newNext;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BrowserAutomationPackage.SUBROUTINE_PARAM__NEXT, oldNext, newNext);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setNext(SubroutineParam newNext)
  {
		if (newNext != next) {
			NotificationChain msgs = null;
			if (next != null)
				msgs = ((InternalEObject)next).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BrowserAutomationPackage.SUBROUTINE_PARAM__NEXT, null, msgs);
			if (newNext != null)
				msgs = ((InternalEObject)newNext).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BrowserAutomationPackage.SUBROUTINE_PARAM__NEXT, null, msgs);
			msgs = basicSetNext(newNext, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BrowserAutomationPackage.SUBROUTINE_PARAM__NEXT, newNext, newNext));
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
			case BrowserAutomationPackage.SUBROUTINE_PARAM__NAME:
				return basicSetName(null, msgs);
			case BrowserAutomationPackage.SUBROUTINE_PARAM__NEXT:
				return basicSetNext(null, msgs);
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
			case BrowserAutomationPackage.SUBROUTINE_PARAM__NAME:
				return getName();
			case BrowserAutomationPackage.SUBROUTINE_PARAM__NEXT:
				return getNext();
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
			case BrowserAutomationPackage.SUBROUTINE_PARAM__NAME:
				setName((VariableId)newValue);
				return;
			case BrowserAutomationPackage.SUBROUTINE_PARAM__NEXT:
				setNext((SubroutineParam)newValue);
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
			case BrowserAutomationPackage.SUBROUTINE_PARAM__NAME:
				setName((VariableId)null);
				return;
			case BrowserAutomationPackage.SUBROUTINE_PARAM__NEXT:
				setNext((SubroutineParam)null);
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
			case BrowserAutomationPackage.SUBROUTINE_PARAM__NAME:
				return name != null;
			case BrowserAutomationPackage.SUBROUTINE_PARAM__NEXT:
				return next != null;
		}
		return super.eIsSet(featureID);
	}

} //SubroutineParamImpl
