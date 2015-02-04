/**
 */
package org.joclal.browserAutomation.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.joclal.browserAutomation.Action;
import org.joclal.browserAutomation.BooleanExp;
import org.joclal.browserAutomation.Browser;
import org.joclal.browserAutomation.BrowserAutomationFactory;
import org.joclal.browserAutomation.BrowserAutomationPackage;
import org.joclal.browserAutomation.Check;
import org.joclal.browserAutomation.ClickOn;
import org.joclal.browserAutomation.DoWhile;
import org.joclal.browserAutomation.DomID;
import org.joclal.browserAutomation.Fill;
import org.joclal.browserAutomation.Goto;
import org.joclal.browserAutomation.IfThen;
import org.joclal.browserAutomation.Let;
import org.joclal.browserAutomation.LetValue;
import org.joclal.browserAutomation.Model;
import org.joclal.browserAutomation.Operator;
import org.joclal.browserAutomation.Selector;
import org.joclal.browserAutomation.Subroutine;
import org.joclal.browserAutomation.SubroutineCall;
import org.joclal.browserAutomation.SubroutineParam;
import org.joclal.browserAutomation.Uncheck;
import org.joclal.browserAutomation.Value;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BrowserAutomationPackageImpl extends EPackageImpl implements BrowserAutomationPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass modelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass actionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass gotoEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass clickOnEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass selectorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass domIDEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass subroutineParamEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fillEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass checkEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass uncheckEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass letEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass letValueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass valueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass doWhileEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass booleanExpEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ifThenEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass subroutineEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass subroutineCallEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum browserEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum operatorEEnum = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see org.joclal.browserAutomation.BrowserAutomationPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private BrowserAutomationPackageImpl()
  {
    super(eNS_URI, BrowserAutomationFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link BrowserAutomationPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static BrowserAutomationPackage init()
  {
    if (isInited) return (BrowserAutomationPackage)EPackage.Registry.INSTANCE.getEPackage(BrowserAutomationPackage.eNS_URI);

    // Obtain or create and register package
    BrowserAutomationPackageImpl theBrowserAutomationPackage = (BrowserAutomationPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof BrowserAutomationPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new BrowserAutomationPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theBrowserAutomationPackage.createPackageContents();

    // Initialize created meta-data
    theBrowserAutomationPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theBrowserAutomationPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(BrowserAutomationPackage.eNS_URI, theBrowserAutomationPackage);
    return theBrowserAutomationPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getModel()
  {
    return modelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModel_Subroutines()
  {
    return (EReference)modelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getModel_Browser()
  {
    return (EAttribute)modelEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModel_FirstGoTo()
  {
    return (EReference)modelEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModel_Actions()
  {
    return (EReference)modelEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAction()
  {
    return actionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGoto()
  {
    return gotoEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGoto_Url()
  {
    return (EReference)gotoEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getClickOn()
  {
    return clickOnEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getClickOn_Selector()
  {
    return (EReference)clickOnEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSelector()
  {
    return selectorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSelector_Sel()
  {
    return (EReference)selectorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDomID()
  {
    return domIDEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDomID_Name()
  {
    return (EAttribute)domIDEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDomID_Next()
  {
    return (EReference)domIDEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSubroutineParam()
  {
    return subroutineParamEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSubroutineParam_Name()
  {
    return (EAttribute)subroutineParamEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSubroutineParam_Next()
  {
    return (EReference)subroutineParamEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFill()
  {
    return fillEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFill_Field()
  {
    return (EReference)fillEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFill_Value()
  {
    return (EReference)fillEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCheck()
  {
    return checkEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCheck_Checkbox()
  {
    return (EReference)checkEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUncheck()
  {
    return uncheckEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUncheck_Checkbox()
  {
    return (EReference)uncheckEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLet()
  {
    return letEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLet_Name()
  {
    return (EAttribute)letEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLet_Value()
  {
    return (EReference)letEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLetValue()
  {
    return letValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLetValue_Selector()
  {
    return (EReference)letValueEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLetValue_Value()
  {
    return (EReference)letValueEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getValue()
  {
    return valueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getValue_String()
  {
    return (EAttribute)valueEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getValue_Int()
  {
    return (EAttribute)valueEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getValue_Let()
  {
    return (EReference)valueEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDoWhile()
  {
    return doWhileEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDoWhile_Actions()
  {
    return (EReference)doWhileEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDoWhile_Condition()
  {
    return (EReference)doWhileEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBooleanExp()
  {
    return booleanExpEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBooleanExp_LeftMember()
  {
    return (EReference)booleanExpEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBooleanExp_Operator()
  {
    return (EAttribute)booleanExpEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBooleanExp_RightMember()
  {
    return (EReference)booleanExpEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIfThen()
  {
    return ifThenEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIfThen_Condition()
  {
    return (EReference)ifThenEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIfThen_ThenActions()
  {
    return (EReference)ifThenEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIfThen_ElseActions()
  {
    return (EReference)ifThenEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSubroutine()
  {
    return subroutineEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSubroutine_Name()
  {
    return (EAttribute)subroutineEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSubroutine_Params()
  {
    return (EReference)subroutineEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSubroutine_Actions()
  {
    return (EReference)subroutineEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSubroutineCall()
  {
    return subroutineCallEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSubroutineCall_Subroutine()
  {
    return (EReference)subroutineCallEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getBrowser()
  {
    return browserEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getOperator()
  {
    return operatorEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BrowserAutomationFactory getBrowserAutomationFactory()
  {
    return (BrowserAutomationFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    modelEClass = createEClass(MODEL);
    createEReference(modelEClass, MODEL__SUBROUTINES);
    createEAttribute(modelEClass, MODEL__BROWSER);
    createEReference(modelEClass, MODEL__FIRST_GO_TO);
    createEReference(modelEClass, MODEL__ACTIONS);

    actionEClass = createEClass(ACTION);

    gotoEClass = createEClass(GOTO);
    createEReference(gotoEClass, GOTO__URL);

    clickOnEClass = createEClass(CLICK_ON);
    createEReference(clickOnEClass, CLICK_ON__SELECTOR);

    selectorEClass = createEClass(SELECTOR);
    createEReference(selectorEClass, SELECTOR__SEL);

    domIDEClass = createEClass(DOM_ID);
    createEAttribute(domIDEClass, DOM_ID__NAME);
    createEReference(domIDEClass, DOM_ID__NEXT);

    subroutineParamEClass = createEClass(SUBROUTINE_PARAM);
    createEAttribute(subroutineParamEClass, SUBROUTINE_PARAM__NAME);
    createEReference(subroutineParamEClass, SUBROUTINE_PARAM__NEXT);

    fillEClass = createEClass(FILL);
    createEReference(fillEClass, FILL__FIELD);
    createEReference(fillEClass, FILL__VALUE);

    checkEClass = createEClass(CHECK);
    createEReference(checkEClass, CHECK__CHECKBOX);

    uncheckEClass = createEClass(UNCHECK);
    createEReference(uncheckEClass, UNCHECK__CHECKBOX);

    letEClass = createEClass(LET);
    createEAttribute(letEClass, LET__NAME);
    createEReference(letEClass, LET__VALUE);

    letValueEClass = createEClass(LET_VALUE);
    createEReference(letValueEClass, LET_VALUE__SELECTOR);
    createEReference(letValueEClass, LET_VALUE__VALUE);

    valueEClass = createEClass(VALUE);
    createEAttribute(valueEClass, VALUE__STRING);
    createEAttribute(valueEClass, VALUE__INT);
    createEReference(valueEClass, VALUE__LET);

    doWhileEClass = createEClass(DO_WHILE);
    createEReference(doWhileEClass, DO_WHILE__ACTIONS);
    createEReference(doWhileEClass, DO_WHILE__CONDITION);

    booleanExpEClass = createEClass(BOOLEAN_EXP);
    createEReference(booleanExpEClass, BOOLEAN_EXP__LEFT_MEMBER);
    createEAttribute(booleanExpEClass, BOOLEAN_EXP__OPERATOR);
    createEReference(booleanExpEClass, BOOLEAN_EXP__RIGHT_MEMBER);

    ifThenEClass = createEClass(IF_THEN);
    createEReference(ifThenEClass, IF_THEN__CONDITION);
    createEReference(ifThenEClass, IF_THEN__THEN_ACTIONS);
    createEReference(ifThenEClass, IF_THEN__ELSE_ACTIONS);

    subroutineEClass = createEClass(SUBROUTINE);
    createEAttribute(subroutineEClass, SUBROUTINE__NAME);
    createEReference(subroutineEClass, SUBROUTINE__PARAMS);
    createEReference(subroutineEClass, SUBROUTINE__ACTIONS);

    subroutineCallEClass = createEClass(SUBROUTINE_CALL);
    createEReference(subroutineCallEClass, SUBROUTINE_CALL__SUBROUTINE);

    // Create enums
    browserEEnum = createEEnum(BROWSER);
    operatorEEnum = createEEnum(OPERATOR);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    gotoEClass.getESuperTypes().add(this.getAction());
    clickOnEClass.getESuperTypes().add(this.getAction());
    fillEClass.getESuperTypes().add(this.getAction());
    checkEClass.getESuperTypes().add(this.getAction());
    uncheckEClass.getESuperTypes().add(this.getAction());
    letEClass.getESuperTypes().add(this.getAction());
    doWhileEClass.getESuperTypes().add(this.getAction());
    ifThenEClass.getESuperTypes().add(this.getAction());
    subroutineCallEClass.getESuperTypes().add(this.getAction());

    // Initialize classes and features; add operations and parameters
    initEClass(modelEClass, Model.class, "Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getModel_Subroutines(), this.getSubroutine(), null, "subroutines", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getModel_Browser(), this.getBrowser(), "browser", null, 0, 1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModel_FirstGoTo(), this.getGoto(), null, "firstGoTo", null, 0, 1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModel_Actions(), this.getAction(), null, "actions", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(actionEClass, Action.class, "Action", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(gotoEClass, Goto.class, "Goto", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getGoto_Url(), this.getValue(), null, "url", null, 0, 1, Goto.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(clickOnEClass, ClickOn.class, "ClickOn", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getClickOn_Selector(), this.getSelector(), null, "selector", null, 0, 1, ClickOn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(selectorEClass, Selector.class, "Selector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSelector_Sel(), this.getDomID(), null, "sel", null, 0, 1, Selector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(domIDEClass, DomID.class, "DomID", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDomID_Name(), ecorePackage.getEString(), "name", null, 0, 1, DomID.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDomID_Next(), this.getDomID(), null, "next", null, 0, 1, DomID.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(subroutineParamEClass, SubroutineParam.class, "SubroutineParam", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSubroutineParam_Name(), ecorePackage.getEString(), "name", null, 0, 1, SubroutineParam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSubroutineParam_Next(), this.getSubroutineParam(), null, "next", null, 0, 1, SubroutineParam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(fillEClass, Fill.class, "Fill", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getFill_Field(), this.getSelector(), null, "field", null, 0, 1, Fill.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFill_Value(), this.getValue(), null, "value", null, 0, 1, Fill.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(checkEClass, Check.class, "Check", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCheck_Checkbox(), this.getSelector(), null, "checkbox", null, 0, 1, Check.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(uncheckEClass, Uncheck.class, "Uncheck", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getUncheck_Checkbox(), this.getSelector(), null, "checkbox", null, 0, 1, Uncheck.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(letEClass, Let.class, "Let", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getLet_Name(), ecorePackage.getEString(), "name", null, 0, 1, Let.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLet_Value(), this.getLetValue(), null, "value", null, 0, 1, Let.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(letValueEClass, LetValue.class, "LetValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getLetValue_Selector(), this.getSelector(), null, "selector", null, 0, 1, LetValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLetValue_Value(), this.getValue(), null, "value", null, 0, 1, LetValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(valueEClass, Value.class, "Value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getValue_String(), ecorePackage.getEString(), "string", null, 0, 1, Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getValue_Int(), ecorePackage.getEInt(), "int", null, 0, 1, Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getValue_Let(), this.getLet(), null, "let", null, 0, 1, Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(doWhileEClass, DoWhile.class, "DoWhile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDoWhile_Actions(), this.getAction(), null, "actions", null, 0, -1, DoWhile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDoWhile_Condition(), this.getBooleanExp(), null, "condition", null, 0, 1, DoWhile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(booleanExpEClass, BooleanExp.class, "BooleanExp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBooleanExp_LeftMember(), this.getValue(), null, "leftMember", null, 0, 1, BooleanExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getBooleanExp_Operator(), this.getOperator(), "operator", null, 0, 1, BooleanExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBooleanExp_RightMember(), this.getValue(), null, "rightMember", null, 0, 1, BooleanExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ifThenEClass, IfThen.class, "IfThen", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getIfThen_Condition(), this.getBooleanExp(), null, "condition", null, 0, 1, IfThen.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getIfThen_ThenActions(), this.getAction(), null, "thenActions", null, 0, -1, IfThen.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getIfThen_ElseActions(), this.getAction(), null, "elseActions", null, 0, -1, IfThen.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(subroutineEClass, Subroutine.class, "Subroutine", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSubroutine_Name(), ecorePackage.getEString(), "name", null, 0, 1, Subroutine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSubroutine_Params(), this.getSubroutineParam(), null, "params", null, 0, -1, Subroutine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSubroutine_Actions(), this.getAction(), null, "actions", null, 0, -1, Subroutine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(subroutineCallEClass, SubroutineCall.class, "SubroutineCall", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSubroutineCall_Subroutine(), this.getSubroutine(), null, "subroutine", null, 0, 1, SubroutineCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(browserEEnum, Browser.class, "Browser");
    addEEnumLiteral(browserEEnum, Browser.CHROME);
    addEEnumLiteral(browserEEnum, Browser.SAFARI);
    addEEnumLiteral(browserEEnum, Browser.OPERA);
    addEEnumLiteral(browserEEnum, Browser.FIREFOX);
    addEEnumLiteral(browserEEnum, Browser.IE);

    initEEnum(operatorEEnum, Operator.class, "Operator");
    addEEnumLiteral(operatorEEnum, Operator.EQUALS);
    addEEnumLiteral(operatorEEnum, Operator.GT);
    addEEnumLiteral(operatorEEnum, Operator.LT);
    addEEnumLiteral(operatorEEnum, Operator.GTE);
    addEEnumLiteral(operatorEEnum, Operator.LTE);

    // Create resource
    createResource(eNS_URI);
  }

} //BrowserAutomationPackageImpl
