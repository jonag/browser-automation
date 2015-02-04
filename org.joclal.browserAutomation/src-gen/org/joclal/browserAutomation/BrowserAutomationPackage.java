/**
 */
package org.joclal.browserAutomation;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.joclal.browserAutomation.BrowserAutomationFactory
 * @model kind="package"
 * @generated
 */
public interface BrowserAutomationPackage extends EPackage
{
  /**
	 * The package name.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  String eNAME = "browserAutomation";

  /**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  String eNS_URI = "http://www.joclal.org/BrowserAutomation";

  /**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  String eNS_PREFIX = "browserAutomation";

  /**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  BrowserAutomationPackage eINSTANCE = org.joclal.browserAutomation.impl.BrowserAutomationPackageImpl.init();

  /**
	 * The meta object id for the '{@link org.joclal.browserAutomation.impl.ModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.joclal.browserAutomation.impl.ModelImpl
	 * @see org.joclal.browserAutomation.impl.BrowserAutomationPackageImpl#getModel()
	 * @generated
	 */
  int MODEL = 0;

  /**
	 * The feature id for the '<em><b>Browser</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MODEL__BROWSER = 0;

  /**
	 * The feature id for the '<em><b>First Go To</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MODEL__FIRST_GO_TO = 1;

  /**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MODEL__ACTIONS = 2;

  /**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MODEL_FEATURE_COUNT = 3;

  /**
	 * The meta object id for the '{@link org.joclal.browserAutomation.impl.ActionImpl <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.joclal.browserAutomation.impl.ActionImpl
	 * @see org.joclal.browserAutomation.impl.BrowserAutomationPackageImpl#getAction()
	 * @generated
	 */
  int ACTION = 1;

  /**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ACTION_FEATURE_COUNT = 0;

  /**
	 * The meta object id for the '{@link org.joclal.browserAutomation.impl.GotoImpl <em>Goto</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.joclal.browserAutomation.impl.GotoImpl
	 * @see org.joclal.browserAutomation.impl.BrowserAutomationPackageImpl#getGoto()
	 * @generated
	 */
  int GOTO = 2;

  /**
	 * The feature id for the '<em><b>Url</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int GOTO__URL = ACTION_FEATURE_COUNT + 0;

  /**
	 * The number of structural features of the '<em>Goto</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int GOTO_FEATURE_COUNT = ACTION_FEATURE_COUNT + 1;

  /**
	 * The meta object id for the '{@link org.joclal.browserAutomation.impl.ClickOnImpl <em>Click On</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.joclal.browserAutomation.impl.ClickOnImpl
	 * @see org.joclal.browserAutomation.impl.BrowserAutomationPackageImpl#getClickOn()
	 * @generated
	 */
  int CLICK_ON = 3;

  /**
	 * The feature id for the '<em><b>Selector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CLICK_ON__SELECTOR = ACTION_FEATURE_COUNT + 0;

  /**
	 * The number of structural features of the '<em>Click On</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CLICK_ON_FEATURE_COUNT = ACTION_FEATURE_COUNT + 1;

  /**
	 * The meta object id for the '{@link org.joclal.browserAutomation.impl.SelectorImpl <em>Selector</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.joclal.browserAutomation.impl.SelectorImpl
	 * @see org.joclal.browserAutomation.impl.BrowserAutomationPackageImpl#getSelector()
	 * @generated
	 */
  int SELECTOR = 4;

  /**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SELECTOR__ID = 0;

  /**
	 * The number of structural features of the '<em>Selector</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SELECTOR_FEATURE_COUNT = 1;

  /**
	 * The meta object id for the '{@link org.joclal.browserAutomation.impl.FillImpl <em>Fill</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.joclal.browserAutomation.impl.FillImpl
	 * @see org.joclal.browserAutomation.impl.BrowserAutomationPackageImpl#getFill()
	 * @generated
	 */
  int FILL = 5;

  /**
	 * The feature id for the '<em><b>Field</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int FILL__FIELD = ACTION_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int FILL__VALUE = ACTION_FEATURE_COUNT + 1;

  /**
	 * The number of structural features of the '<em>Fill</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int FILL_FEATURE_COUNT = ACTION_FEATURE_COUNT + 2;

  /**
	 * The meta object id for the '{@link org.joclal.browserAutomation.impl.CheckImpl <em>Check</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.joclal.browserAutomation.impl.CheckImpl
	 * @see org.joclal.browserAutomation.impl.BrowserAutomationPackageImpl#getCheck()
	 * @generated
	 */
  int CHECK = 6;

  /**
	 * The feature id for the '<em><b>Checkbox</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CHECK__CHECKBOX = ACTION_FEATURE_COUNT + 0;

  /**
	 * The number of structural features of the '<em>Check</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CHECK_FEATURE_COUNT = ACTION_FEATURE_COUNT + 1;

  /**
	 * The meta object id for the '{@link org.joclal.browserAutomation.impl.UncheckImpl <em>Uncheck</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.joclal.browserAutomation.impl.UncheckImpl
	 * @see org.joclal.browserAutomation.impl.BrowserAutomationPackageImpl#getUncheck()
	 * @generated
	 */
  int UNCHECK = 7;

  /**
	 * The feature id for the '<em><b>Checkbox</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int UNCHECK__CHECKBOX = ACTION_FEATURE_COUNT + 0;

  /**
	 * The number of structural features of the '<em>Uncheck</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int UNCHECK_FEATURE_COUNT = ACTION_FEATURE_COUNT + 1;

  /**
	 * The meta object id for the '{@link org.joclal.browserAutomation.impl.LetImpl <em>Let</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.joclal.browserAutomation.impl.LetImpl
	 * @see org.joclal.browserAutomation.impl.BrowserAutomationPackageImpl#getLet()
	 * @generated
	 */
  int LET = 8;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LET__NAME = ACTION_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LET__VALUE = ACTION_FEATURE_COUNT + 1;

  /**
	 * The number of structural features of the '<em>Let</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LET_FEATURE_COUNT = ACTION_FEATURE_COUNT + 2;

  /**
	 * The meta object id for the '{@link org.joclal.browserAutomation.impl.LetValueImpl <em>Let Value</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.joclal.browserAutomation.impl.LetValueImpl
	 * @see org.joclal.browserAutomation.impl.BrowserAutomationPackageImpl#getLetValue()
	 * @generated
	 */
  int LET_VALUE = 9;

  /**
	 * The feature id for the '<em><b>Selector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LET_VALUE__SELECTOR = 0;

  /**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LET_VALUE__VALUE = 1;

  /**
	 * The number of structural features of the '<em>Let Value</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LET_VALUE_FEATURE_COUNT = 2;

  /**
	 * The meta object id for the '{@link org.joclal.browserAutomation.impl.ValueImpl <em>Value</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.joclal.browserAutomation.impl.ValueImpl
	 * @see org.joclal.browserAutomation.impl.BrowserAutomationPackageImpl#getValue()
	 * @generated
	 */
  int VALUE = 10;

  /**
	 * The feature id for the '<em><b>String</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int VALUE__STRING = 0;

  /**
	 * The feature id for the '<em><b>Int</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int VALUE__INT = 1;

  /**
	 * The feature id for the '<em><b>Let</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int VALUE__LET = 2;

  /**
	 * The number of structural features of the '<em>Value</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int VALUE_FEATURE_COUNT = 3;

  /**
	 * The meta object id for the '{@link org.joclal.browserAutomation.impl.DoWhileImpl <em>Do While</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.joclal.browserAutomation.impl.DoWhileImpl
	 * @see org.joclal.browserAutomation.impl.BrowserAutomationPackageImpl#getDoWhile()
	 * @generated
	 */
  int DO_WHILE = 11;

  /**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int DO_WHILE__ACTIONS = 0;

  /**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int DO_WHILE__CONDITION = 1;

  /**
	 * The number of structural features of the '<em>Do While</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int DO_WHILE_FEATURE_COUNT = 2;

  /**
	 * The meta object id for the '{@link org.joclal.browserAutomation.impl.BooleanExpImpl <em>Boolean Exp</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.joclal.browserAutomation.impl.BooleanExpImpl
	 * @see org.joclal.browserAutomation.impl.BrowserAutomationPackageImpl#getBooleanExp()
	 * @generated
	 */
  int BOOLEAN_EXP = 12;

  /**
	 * The feature id for the '<em><b>Left Member</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int BOOLEAN_EXP__LEFT_MEMBER = 0;

  /**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int BOOLEAN_EXP__OPERATOR = 1;

  /**
	 * The feature id for the '<em><b>Right Member</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int BOOLEAN_EXP__RIGHT_MEMBER = 2;

  /**
	 * The number of structural features of the '<em>Boolean Exp</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int BOOLEAN_EXP_FEATURE_COUNT = 3;

  /**
	 * The meta object id for the '{@link org.joclal.browserAutomation.impl.IfThenImpl <em>If Then</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.joclal.browserAutomation.impl.IfThenImpl
	 * @see org.joclal.browserAutomation.impl.BrowserAutomationPackageImpl#getIfThen()
	 * @generated
	 */
  int IF_THEN = 13;

  /**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int IF_THEN__CONDITION = 0;

  /**
	 * The feature id for the '<em><b>Then Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int IF_THEN__THEN_ACTIONS = 1;

  /**
	 * The feature id for the '<em><b>Else Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int IF_THEN__ELSE_ACTIONS = 2;

  /**
	 * The number of structural features of the '<em>If Then</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int IF_THEN_FEATURE_COUNT = 3;

  /**
	 * The meta object id for the '{@link org.joclal.browserAutomation.Browser <em>Browser</em>}' enum.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.joclal.browserAutomation.Browser
	 * @see org.joclal.browserAutomation.impl.BrowserAutomationPackageImpl#getBrowser()
	 * @generated
	 */
  int BROWSER = 14;

  /**
	 * The meta object id for the '{@link org.joclal.browserAutomation.Operator <em>Operator</em>}' enum.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.joclal.browserAutomation.Operator
	 * @see org.joclal.browserAutomation.impl.BrowserAutomationPackageImpl#getOperator()
	 * @generated
	 */
  int OPERATOR = 15;


  /**
	 * Returns the meta object for class '{@link org.joclal.browserAutomation.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see org.joclal.browserAutomation.Model
	 * @generated
	 */
  EClass getModel();

  /**
	 * Returns the meta object for the attribute '{@link org.joclal.browserAutomation.Model#getBrowser <em>Browser</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Browser</em>'.
	 * @see org.joclal.browserAutomation.Model#getBrowser()
	 * @see #getModel()
	 * @generated
	 */
  EAttribute getModel_Browser();

  /**
	 * Returns the meta object for the containment reference '{@link org.joclal.browserAutomation.Model#getFirstGoTo <em>First Go To</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>First Go To</em>'.
	 * @see org.joclal.browserAutomation.Model#getFirstGoTo()
	 * @see #getModel()
	 * @generated
	 */
  EReference getModel_FirstGoTo();

  /**
	 * Returns the meta object for the containment reference list '{@link org.joclal.browserAutomation.Model#getActions <em>Actions</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actions</em>'.
	 * @see org.joclal.browserAutomation.Model#getActions()
	 * @see #getModel()
	 * @generated
	 */
  EReference getModel_Actions();

  /**
	 * Returns the meta object for class '{@link org.joclal.browserAutomation.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see org.joclal.browserAutomation.Action
	 * @generated
	 */
  EClass getAction();

  /**
	 * Returns the meta object for class '{@link org.joclal.browserAutomation.Goto <em>Goto</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Goto</em>'.
	 * @see org.joclal.browserAutomation.Goto
	 * @generated
	 */
  EClass getGoto();

  /**
	 * Returns the meta object for the containment reference '{@link org.joclal.browserAutomation.Goto#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Url</em>'.
	 * @see org.joclal.browserAutomation.Goto#getUrl()
	 * @see #getGoto()
	 * @generated
	 */
  EReference getGoto_Url();

  /**
	 * Returns the meta object for class '{@link org.joclal.browserAutomation.ClickOn <em>Click On</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Click On</em>'.
	 * @see org.joclal.browserAutomation.ClickOn
	 * @generated
	 */
  EClass getClickOn();

  /**
	 * Returns the meta object for the containment reference '{@link org.joclal.browserAutomation.ClickOn#getSelector <em>Selector</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Selector</em>'.
	 * @see org.joclal.browserAutomation.ClickOn#getSelector()
	 * @see #getClickOn()
	 * @generated
	 */
  EReference getClickOn_Selector();

  /**
	 * Returns the meta object for class '{@link org.joclal.browserAutomation.Selector <em>Selector</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Selector</em>'.
	 * @see org.joclal.browserAutomation.Selector
	 * @generated
	 */
  EClass getSelector();

  /**
	 * Returns the meta object for the attribute '{@link org.joclal.browserAutomation.Selector#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.joclal.browserAutomation.Selector#getId()
	 * @see #getSelector()
	 * @generated
	 */
  EAttribute getSelector_Id();

  /**
	 * Returns the meta object for class '{@link org.joclal.browserAutomation.Fill <em>Fill</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fill</em>'.
	 * @see org.joclal.browserAutomation.Fill
	 * @generated
	 */
  EClass getFill();

  /**
	 * Returns the meta object for the containment reference '{@link org.joclal.browserAutomation.Fill#getField <em>Field</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Field</em>'.
	 * @see org.joclal.browserAutomation.Fill#getField()
	 * @see #getFill()
	 * @generated
	 */
  EReference getFill_Field();

  /**
	 * Returns the meta object for the containment reference '{@link org.joclal.browserAutomation.Fill#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see org.joclal.browserAutomation.Fill#getValue()
	 * @see #getFill()
	 * @generated
	 */
  EReference getFill_Value();

  /**
	 * Returns the meta object for class '{@link org.joclal.browserAutomation.Check <em>Check</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Check</em>'.
	 * @see org.joclal.browserAutomation.Check
	 * @generated
	 */
  EClass getCheck();

  /**
	 * Returns the meta object for the containment reference '{@link org.joclal.browserAutomation.Check#getCheckbox <em>Checkbox</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Checkbox</em>'.
	 * @see org.joclal.browserAutomation.Check#getCheckbox()
	 * @see #getCheck()
	 * @generated
	 */
  EReference getCheck_Checkbox();

  /**
	 * Returns the meta object for class '{@link org.joclal.browserAutomation.Uncheck <em>Uncheck</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Uncheck</em>'.
	 * @see org.joclal.browserAutomation.Uncheck
	 * @generated
	 */
  EClass getUncheck();

  /**
	 * Returns the meta object for the containment reference '{@link org.joclal.browserAutomation.Uncheck#getCheckbox <em>Checkbox</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Checkbox</em>'.
	 * @see org.joclal.browserAutomation.Uncheck#getCheckbox()
	 * @see #getUncheck()
	 * @generated
	 */
  EReference getUncheck_Checkbox();

  /**
	 * Returns the meta object for class '{@link org.joclal.browserAutomation.Let <em>Let</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Let</em>'.
	 * @see org.joclal.browserAutomation.Let
	 * @generated
	 */
  EClass getLet();

  /**
	 * Returns the meta object for the attribute '{@link org.joclal.browserAutomation.Let#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.joclal.browserAutomation.Let#getName()
	 * @see #getLet()
	 * @generated
	 */
  EAttribute getLet_Name();

  /**
	 * Returns the meta object for the containment reference '{@link org.joclal.browserAutomation.Let#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see org.joclal.browserAutomation.Let#getValue()
	 * @see #getLet()
	 * @generated
	 */
  EReference getLet_Value();

  /**
	 * Returns the meta object for class '{@link org.joclal.browserAutomation.LetValue <em>Let Value</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Let Value</em>'.
	 * @see org.joclal.browserAutomation.LetValue
	 * @generated
	 */
  EClass getLetValue();

  /**
	 * Returns the meta object for the containment reference '{@link org.joclal.browserAutomation.LetValue#getSelector <em>Selector</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Selector</em>'.
	 * @see org.joclal.browserAutomation.LetValue#getSelector()
	 * @see #getLetValue()
	 * @generated
	 */
  EReference getLetValue_Selector();

  /**
	 * Returns the meta object for the containment reference '{@link org.joclal.browserAutomation.LetValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see org.joclal.browserAutomation.LetValue#getValue()
	 * @see #getLetValue()
	 * @generated
	 */
  EReference getLetValue_Value();

  /**
	 * Returns the meta object for class '{@link org.joclal.browserAutomation.Value <em>Value</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value</em>'.
	 * @see org.joclal.browserAutomation.Value
	 * @generated
	 */
  EClass getValue();

  /**
	 * Returns the meta object for the attribute '{@link org.joclal.browserAutomation.Value#getString <em>String</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>String</em>'.
	 * @see org.joclal.browserAutomation.Value#getString()
	 * @see #getValue()
	 * @generated
	 */
  EAttribute getValue_String();

  /**
	 * Returns the meta object for the attribute '{@link org.joclal.browserAutomation.Value#getInt <em>Int</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Int</em>'.
	 * @see org.joclal.browserAutomation.Value#getInt()
	 * @see #getValue()
	 * @generated
	 */
  EAttribute getValue_Int();

  /**
	 * Returns the meta object for the reference '{@link org.joclal.browserAutomation.Value#getLet <em>Let</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Let</em>'.
	 * @see org.joclal.browserAutomation.Value#getLet()
	 * @see #getValue()
	 * @generated
	 */
  EReference getValue_Let();

  /**
	 * Returns the meta object for class '{@link org.joclal.browserAutomation.DoWhile <em>Do While</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Do While</em>'.
	 * @see org.joclal.browserAutomation.DoWhile
	 * @generated
	 */
  EClass getDoWhile();

  /**
	 * Returns the meta object for the containment reference list '{@link org.joclal.browserAutomation.DoWhile#getActions <em>Actions</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actions</em>'.
	 * @see org.joclal.browserAutomation.DoWhile#getActions()
	 * @see #getDoWhile()
	 * @generated
	 */
  EReference getDoWhile_Actions();

  /**
	 * Returns the meta object for the containment reference '{@link org.joclal.browserAutomation.DoWhile#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see org.joclal.browserAutomation.DoWhile#getCondition()
	 * @see #getDoWhile()
	 * @generated
	 */
  EReference getDoWhile_Condition();

  /**
	 * Returns the meta object for class '{@link org.joclal.browserAutomation.BooleanExp <em>Boolean Exp</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Exp</em>'.
	 * @see org.joclal.browserAutomation.BooleanExp
	 * @generated
	 */
  EClass getBooleanExp();

  /**
	 * Returns the meta object for the containment reference '{@link org.joclal.browserAutomation.BooleanExp#getLeftMember <em>Left Member</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left Member</em>'.
	 * @see org.joclal.browserAutomation.BooleanExp#getLeftMember()
	 * @see #getBooleanExp()
	 * @generated
	 */
  EReference getBooleanExp_LeftMember();

  /**
	 * Returns the meta object for the attribute '{@link org.joclal.browserAutomation.BooleanExp#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see org.joclal.browserAutomation.BooleanExp#getOperator()
	 * @see #getBooleanExp()
	 * @generated
	 */
  EAttribute getBooleanExp_Operator();

  /**
	 * Returns the meta object for the containment reference '{@link org.joclal.browserAutomation.BooleanExp#getRightMember <em>Right Member</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right Member</em>'.
	 * @see org.joclal.browserAutomation.BooleanExp#getRightMember()
	 * @see #getBooleanExp()
	 * @generated
	 */
  EReference getBooleanExp_RightMember();

  /**
	 * Returns the meta object for class '{@link org.joclal.browserAutomation.IfThen <em>If Then</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>If Then</em>'.
	 * @see org.joclal.browserAutomation.IfThen
	 * @generated
	 */
  EClass getIfThen();

  /**
	 * Returns the meta object for the containment reference '{@link org.joclal.browserAutomation.IfThen#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see org.joclal.browserAutomation.IfThen#getCondition()
	 * @see #getIfThen()
	 * @generated
	 */
  EReference getIfThen_Condition();

  /**
	 * Returns the meta object for the containment reference list '{@link org.joclal.browserAutomation.IfThen#getThenActions <em>Then Actions</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Then Actions</em>'.
	 * @see org.joclal.browserAutomation.IfThen#getThenActions()
	 * @see #getIfThen()
	 * @generated
	 */
  EReference getIfThen_ThenActions();

  /**
	 * Returns the meta object for the containment reference list '{@link org.joclal.browserAutomation.IfThen#getElseActions <em>Else Actions</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Else Actions</em>'.
	 * @see org.joclal.browserAutomation.IfThen#getElseActions()
	 * @see #getIfThen()
	 * @generated
	 */
  EReference getIfThen_ElseActions();

  /**
	 * Returns the meta object for enum '{@link org.joclal.browserAutomation.Browser <em>Browser</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Browser</em>'.
	 * @see org.joclal.browserAutomation.Browser
	 * @generated
	 */
  EEnum getBrowser();

  /**
	 * Returns the meta object for enum '{@link org.joclal.browserAutomation.Operator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Operator</em>'.
	 * @see org.joclal.browserAutomation.Operator
	 * @generated
	 */
  EEnum getOperator();

  /**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
  BrowserAutomationFactory getBrowserAutomationFactory();

  /**
	 * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
	 * @generated
	 */
  interface Literals
  {
    /**
		 * The meta object literal for the '{@link org.joclal.browserAutomation.impl.ModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.joclal.browserAutomation.impl.ModelImpl
		 * @see org.joclal.browserAutomation.impl.BrowserAutomationPackageImpl#getModel()
		 * @generated
		 */
    EClass MODEL = eINSTANCE.getModel();

    /**
		 * The meta object literal for the '<em><b>Browser</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute MODEL__BROWSER = eINSTANCE.getModel_Browser();

    /**
		 * The meta object literal for the '<em><b>First Go To</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference MODEL__FIRST_GO_TO = eINSTANCE.getModel_FirstGoTo();

    /**
		 * The meta object literal for the '<em><b>Actions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference MODEL__ACTIONS = eINSTANCE.getModel_Actions();

    /**
		 * The meta object literal for the '{@link org.joclal.browserAutomation.impl.ActionImpl <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.joclal.browserAutomation.impl.ActionImpl
		 * @see org.joclal.browserAutomation.impl.BrowserAutomationPackageImpl#getAction()
		 * @generated
		 */
    EClass ACTION = eINSTANCE.getAction();

    /**
		 * The meta object literal for the '{@link org.joclal.browserAutomation.impl.GotoImpl <em>Goto</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.joclal.browserAutomation.impl.GotoImpl
		 * @see org.joclal.browserAutomation.impl.BrowserAutomationPackageImpl#getGoto()
		 * @generated
		 */
    EClass GOTO = eINSTANCE.getGoto();

    /**
		 * The meta object literal for the '<em><b>Url</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference GOTO__URL = eINSTANCE.getGoto_Url();

    /**
		 * The meta object literal for the '{@link org.joclal.browserAutomation.impl.ClickOnImpl <em>Click On</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.joclal.browserAutomation.impl.ClickOnImpl
		 * @see org.joclal.browserAutomation.impl.BrowserAutomationPackageImpl#getClickOn()
		 * @generated
		 */
    EClass CLICK_ON = eINSTANCE.getClickOn();

    /**
		 * The meta object literal for the '<em><b>Selector</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference CLICK_ON__SELECTOR = eINSTANCE.getClickOn_Selector();

    /**
		 * The meta object literal for the '{@link org.joclal.browserAutomation.impl.SelectorImpl <em>Selector</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.joclal.browserAutomation.impl.SelectorImpl
		 * @see org.joclal.browserAutomation.impl.BrowserAutomationPackageImpl#getSelector()
		 * @generated
		 */
    EClass SELECTOR = eINSTANCE.getSelector();

    /**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute SELECTOR__ID = eINSTANCE.getSelector_Id();

    /**
		 * The meta object literal for the '{@link org.joclal.browserAutomation.impl.FillImpl <em>Fill</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.joclal.browserAutomation.impl.FillImpl
		 * @see org.joclal.browserAutomation.impl.BrowserAutomationPackageImpl#getFill()
		 * @generated
		 */
    EClass FILL = eINSTANCE.getFill();

    /**
		 * The meta object literal for the '<em><b>Field</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference FILL__FIELD = eINSTANCE.getFill_Field();

    /**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference FILL__VALUE = eINSTANCE.getFill_Value();

    /**
		 * The meta object literal for the '{@link org.joclal.browserAutomation.impl.CheckImpl <em>Check</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.joclal.browserAutomation.impl.CheckImpl
		 * @see org.joclal.browserAutomation.impl.BrowserAutomationPackageImpl#getCheck()
		 * @generated
		 */
    EClass CHECK = eINSTANCE.getCheck();

    /**
		 * The meta object literal for the '<em><b>Checkbox</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference CHECK__CHECKBOX = eINSTANCE.getCheck_Checkbox();

    /**
		 * The meta object literal for the '{@link org.joclal.browserAutomation.impl.UncheckImpl <em>Uncheck</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.joclal.browserAutomation.impl.UncheckImpl
		 * @see org.joclal.browserAutomation.impl.BrowserAutomationPackageImpl#getUncheck()
		 * @generated
		 */
    EClass UNCHECK = eINSTANCE.getUncheck();

    /**
		 * The meta object literal for the '<em><b>Checkbox</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference UNCHECK__CHECKBOX = eINSTANCE.getUncheck_Checkbox();

    /**
		 * The meta object literal for the '{@link org.joclal.browserAutomation.impl.LetImpl <em>Let</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.joclal.browserAutomation.impl.LetImpl
		 * @see org.joclal.browserAutomation.impl.BrowserAutomationPackageImpl#getLet()
		 * @generated
		 */
    EClass LET = eINSTANCE.getLet();

    /**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute LET__NAME = eINSTANCE.getLet_Name();

    /**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference LET__VALUE = eINSTANCE.getLet_Value();

    /**
		 * The meta object literal for the '{@link org.joclal.browserAutomation.impl.LetValueImpl <em>Let Value</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.joclal.browserAutomation.impl.LetValueImpl
		 * @see org.joclal.browserAutomation.impl.BrowserAutomationPackageImpl#getLetValue()
		 * @generated
		 */
    EClass LET_VALUE = eINSTANCE.getLetValue();

    /**
		 * The meta object literal for the '<em><b>Selector</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference LET_VALUE__SELECTOR = eINSTANCE.getLetValue_Selector();

    /**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference LET_VALUE__VALUE = eINSTANCE.getLetValue_Value();

    /**
		 * The meta object literal for the '{@link org.joclal.browserAutomation.impl.ValueImpl <em>Value</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.joclal.browserAutomation.impl.ValueImpl
		 * @see org.joclal.browserAutomation.impl.BrowserAutomationPackageImpl#getValue()
		 * @generated
		 */
    EClass VALUE = eINSTANCE.getValue();

    /**
		 * The meta object literal for the '<em><b>String</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute VALUE__STRING = eINSTANCE.getValue_String();

    /**
		 * The meta object literal for the '<em><b>Int</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute VALUE__INT = eINSTANCE.getValue_Int();

    /**
		 * The meta object literal for the '<em><b>Let</b></em>' reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference VALUE__LET = eINSTANCE.getValue_Let();

    /**
		 * The meta object literal for the '{@link org.joclal.browserAutomation.impl.DoWhileImpl <em>Do While</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.joclal.browserAutomation.impl.DoWhileImpl
		 * @see org.joclal.browserAutomation.impl.BrowserAutomationPackageImpl#getDoWhile()
		 * @generated
		 */
    EClass DO_WHILE = eINSTANCE.getDoWhile();

    /**
		 * The meta object literal for the '<em><b>Actions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference DO_WHILE__ACTIONS = eINSTANCE.getDoWhile_Actions();

    /**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference DO_WHILE__CONDITION = eINSTANCE.getDoWhile_Condition();

    /**
		 * The meta object literal for the '{@link org.joclal.browserAutomation.impl.BooleanExpImpl <em>Boolean Exp</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.joclal.browserAutomation.impl.BooleanExpImpl
		 * @see org.joclal.browserAutomation.impl.BrowserAutomationPackageImpl#getBooleanExp()
		 * @generated
		 */
    EClass BOOLEAN_EXP = eINSTANCE.getBooleanExp();

    /**
		 * The meta object literal for the '<em><b>Left Member</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference BOOLEAN_EXP__LEFT_MEMBER = eINSTANCE.getBooleanExp_LeftMember();

    /**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute BOOLEAN_EXP__OPERATOR = eINSTANCE.getBooleanExp_Operator();

    /**
		 * The meta object literal for the '<em><b>Right Member</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference BOOLEAN_EXP__RIGHT_MEMBER = eINSTANCE.getBooleanExp_RightMember();

    /**
		 * The meta object literal for the '{@link org.joclal.browserAutomation.impl.IfThenImpl <em>If Then</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.joclal.browserAutomation.impl.IfThenImpl
		 * @see org.joclal.browserAutomation.impl.BrowserAutomationPackageImpl#getIfThen()
		 * @generated
		 */
    EClass IF_THEN = eINSTANCE.getIfThen();

    /**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference IF_THEN__CONDITION = eINSTANCE.getIfThen_Condition();

    /**
		 * The meta object literal for the '<em><b>Then Actions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference IF_THEN__THEN_ACTIONS = eINSTANCE.getIfThen_ThenActions();

    /**
		 * The meta object literal for the '<em><b>Else Actions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference IF_THEN__ELSE_ACTIONS = eINSTANCE.getIfThen_ElseActions();

    /**
		 * The meta object literal for the '{@link org.joclal.browserAutomation.Browser <em>Browser</em>}' enum.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.joclal.browserAutomation.Browser
		 * @see org.joclal.browserAutomation.impl.BrowserAutomationPackageImpl#getBrowser()
		 * @generated
		 */
    EEnum BROWSER = eINSTANCE.getBrowser();

    /**
		 * The meta object literal for the '{@link org.joclal.browserAutomation.Operator <em>Operator</em>}' enum.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.joclal.browserAutomation.Operator
		 * @see org.joclal.browserAutomation.impl.BrowserAutomationPackageImpl#getOperator()
		 * @generated
		 */
    EEnum OPERATOR = eINSTANCE.getOperator();

  }

} //BrowserAutomationPackage
