/**
 */
package org.joclal.browserAutomation.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.joclal.browserAutomation.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BrowserAutomationFactoryImpl extends EFactoryImpl implements BrowserAutomationFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static BrowserAutomationFactory init()
  {
    try
    {
      BrowserAutomationFactory theBrowserAutomationFactory = (BrowserAutomationFactory)EPackage.Registry.INSTANCE.getEFactory(BrowserAutomationPackage.eNS_URI);
      if (theBrowserAutomationFactory != null)
      {
        return theBrowserAutomationFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new BrowserAutomationFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BrowserAutomationFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case BrowserAutomationPackage.BROWSER_AUTOMATION: return createBrowserAutomation();
      case BrowserAutomationPackage.ACTION: return createAction();
      case BrowserAutomationPackage.GOTO: return createGoto();
      case BrowserAutomationPackage.CLICK_ON: return createClickOn();
      case BrowserAutomationPackage.SELECTOR: return createSelector();
      case BrowserAutomationPackage.FILL: return createFill();
      case BrowserAutomationPackage.CHECK: return createCheck();
      case BrowserAutomationPackage.UNCHECK: return createUncheck();
      case BrowserAutomationPackage.SELECT_OPTION: return createSelectOption();
      case BrowserAutomationPackage.LET: return createLet();
      case BrowserAutomationPackage.LET_VALUE: return createLetValue();
      case BrowserAutomationPackage.VALUE: return createValue();
      case BrowserAutomationPackage.DO_WHILE: return createDoWhile();
      case BrowserAutomationPackage.BOOLEAN_EXP: return createBooleanExp();
      case BrowserAutomationPackage.IF_THEN: return createIfThen();
      case BrowserAutomationPackage.SUBROUTINE: return createSubroutine();
      case BrowserAutomationPackage.SUBROUTINE_CALL: return createSubroutineCall();
      case BrowserAutomationPackage.VARIABLE_ID: return createVariableId();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case BrowserAutomationPackage.BROWSER:
        return createBrowserFromString(eDataType, initialValue);
      case BrowserAutomationPackage.OPERATOR:
        return createOperatorFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case BrowserAutomationPackage.BROWSER:
        return convertBrowserToString(eDataType, instanceValue);
      case BrowserAutomationPackage.OPERATOR:
        return convertOperatorToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BrowserAutomation createBrowserAutomation()
  {
    BrowserAutomationImpl browserAutomation = new BrowserAutomationImpl();
    return browserAutomation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Action createAction()
  {
    ActionImpl action = new ActionImpl();
    return action;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Goto createGoto()
  {
    GotoImpl goto_ = new GotoImpl();
    return goto_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ClickOn createClickOn()
  {
    ClickOnImpl clickOn = new ClickOnImpl();
    return clickOn;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Selector createSelector()
  {
    SelectorImpl selector = new SelectorImpl();
    return selector;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Fill createFill()
  {
    FillImpl fill = new FillImpl();
    return fill;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Check createCheck()
  {
    CheckImpl check = new CheckImpl();
    return check;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Uncheck createUncheck()
  {
    UncheckImpl uncheck = new UncheckImpl();
    return uncheck;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SelectOption createSelectOption()
  {
    SelectOptionImpl selectOption = new SelectOptionImpl();
    return selectOption;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Let createLet()
  {
    LetImpl let = new LetImpl();
    return let;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LetValue createLetValue()
  {
    LetValueImpl letValue = new LetValueImpl();
    return letValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Value createValue()
  {
    ValueImpl value = new ValueImpl();
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DoWhile createDoWhile()
  {
    DoWhileImpl doWhile = new DoWhileImpl();
    return doWhile;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BooleanExp createBooleanExp()
  {
    BooleanExpImpl booleanExp = new BooleanExpImpl();
    return booleanExp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IfThen createIfThen()
  {
    IfThenImpl ifThen = new IfThenImpl();
    return ifThen;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Subroutine createSubroutine()
  {
    SubroutineImpl subroutine = new SubroutineImpl();
    return subroutine;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SubroutineCall createSubroutineCall()
  {
    SubroutineCallImpl subroutineCall = new SubroutineCallImpl();
    return subroutineCall;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VariableId createVariableId()
  {
    VariableIdImpl variableId = new VariableIdImpl();
    return variableId;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Browser createBrowserFromString(EDataType eDataType, String initialValue)
  {
    Browser result = Browser.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertBrowserToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Operator createOperatorFromString(EDataType eDataType, String initialValue)
  {
    Operator result = Operator.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertOperatorToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BrowserAutomationPackage getBrowserAutomationPackage()
  {
    return (BrowserAutomationPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static BrowserAutomationPackage getPackage()
  {
    return BrowserAutomationPackage.eINSTANCE;
  }

} //BrowserAutomationFactoryImpl
