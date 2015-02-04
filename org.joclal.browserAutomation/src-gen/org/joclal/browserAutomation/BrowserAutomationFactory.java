/**
 */
package org.joclal.browserAutomation;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.joclal.browserAutomation.BrowserAutomationPackage
 * @generated
 */
public interface BrowserAutomationFactory extends EFactory
{
  /**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  BrowserAutomationFactory eINSTANCE = org.joclal.browserAutomation.impl.BrowserAutomationFactoryImpl.init();

  /**
	 * Returns a new object of class '<em>Model</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model</em>'.
	 * @generated
	 */
  Model createModel();

  /**
	 * Returns a new object of class '<em>Action</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Action</em>'.
	 * @generated
	 */
  Action createAction();

  /**
	 * Returns a new object of class '<em>Goto</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Goto</em>'.
	 * @generated
	 */
  Goto createGoto();

  /**
	 * Returns a new object of class '<em>Click On</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Click On</em>'.
	 * @generated
	 */
  ClickOn createClickOn();

  /**
	 * Returns a new object of class '<em>Selector</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Selector</em>'.
	 * @generated
	 */
  Selector createSelector();

  /**
	 * Returns a new object of class '<em>Dom ID</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dom ID</em>'.
	 * @generated
	 */
  DomID createDomID();

  /**
	 * Returns a new object of class '<em>Subroutine Param</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Subroutine Param</em>'.
	 * @generated
	 */
  SubroutineParam createSubroutineParam();

  /**
	 * Returns a new object of class '<em>Fill</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fill</em>'.
	 * @generated
	 */
  Fill createFill();

  /**
	 * Returns a new object of class '<em>Check</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Check</em>'.
	 * @generated
	 */
  Check createCheck();

  /**
	 * Returns a new object of class '<em>Uncheck</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Uncheck</em>'.
	 * @generated
	 */
  Uncheck createUncheck();

  /**
	 * Returns a new object of class '<em>Let</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Let</em>'.
	 * @generated
	 */
  Let createLet();

  /**
	 * Returns a new object of class '<em>Let Value</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Let Value</em>'.
	 * @generated
	 */
  LetValue createLetValue();

  /**
	 * Returns a new object of class '<em>Value</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Value</em>'.
	 * @generated
	 */
  Value createValue();

  /**
	 * Returns a new object of class '<em>Do While</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Do While</em>'.
	 * @generated
	 */
  DoWhile createDoWhile();

  /**
	 * Returns a new object of class '<em>Boolean Exp</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Boolean Exp</em>'.
	 * @generated
	 */
  BooleanExp createBooleanExp();

  /**
	 * Returns a new object of class '<em>If Then</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>If Then</em>'.
	 * @generated
	 */
  IfThen createIfThen();

  /**
	 * Returns a new object of class '<em>Subroutine</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Subroutine</em>'.
	 * @generated
	 */
  Subroutine createSubroutine();

  /**
	 * Returns a new object of class '<em>Subroutine Call</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Subroutine Call</em>'.
	 * @generated
	 */
  SubroutineCall createSubroutineCall();

  /**
	 * Returns a new object of class '<em>Variable Id</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Variable Id</em>'.
	 * @generated
	 */
  VariableId createVariableId();

  /**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
  BrowserAutomationPackage getBrowserAutomationPackage();

} //BrowserAutomationFactory
