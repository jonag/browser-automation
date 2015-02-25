/**
 */
package org.joclal.browserAutomation.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.joclal.browserAutomation.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.joclal.browserAutomation.BrowserAutomationPackage
 * @generated
 */
public class BrowserAutomationSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static BrowserAutomationPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BrowserAutomationSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = BrowserAutomationPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case BrowserAutomationPackage.BROWSER_AUTOMATION:
      {
        BrowserAutomation browserAutomation = (BrowserAutomation)theEObject;
        T result = caseBrowserAutomation(browserAutomation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BrowserAutomationPackage.ACTION:
      {
        Action action = (Action)theEObject;
        T result = caseAction(action);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BrowserAutomationPackage.GOTO:
      {
        Goto goto_ = (Goto)theEObject;
        T result = caseGoto(goto_);
        if (result == null) result = caseAction(goto_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BrowserAutomationPackage.CLICK_ON:
      {
        ClickOn clickOn = (ClickOn)theEObject;
        T result = caseClickOn(clickOn);
        if (result == null) result = caseAction(clickOn);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BrowserAutomationPackage.SELECTOR:
      {
        Selector selector = (Selector)theEObject;
        T result = caseSelector(selector);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BrowserAutomationPackage.FILL:
      {
        Fill fill = (Fill)theEObject;
        T result = caseFill(fill);
        if (result == null) result = caseAction(fill);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BrowserAutomationPackage.CHECK:
      {
        Check check = (Check)theEObject;
        T result = caseCheck(check);
        if (result == null) result = caseAction(check);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BrowserAutomationPackage.UNCHECK:
      {
        Uncheck uncheck = (Uncheck)theEObject;
        T result = caseUncheck(uncheck);
        if (result == null) result = caseAction(uncheck);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BrowserAutomationPackage.PICK:
      {
        Pick pick = (Pick)theEObject;
        T result = casePick(pick);
        if (result == null) result = caseAction(pick);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BrowserAutomationPackage.LET:
      {
        Let let = (Let)theEObject;
        T result = caseLet(let);
        if (result == null) result = caseAction(let);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BrowserAutomationPackage.LET_VALUE:
      {
        LetValue letValue = (LetValue)theEObject;
        T result = caseLetValue(letValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BrowserAutomationPackage.VALUE:
      {
        Value value = (Value)theEObject;
        T result = caseValue(value);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BrowserAutomationPackage.DO_WHILE:
      {
        DoWhile doWhile = (DoWhile)theEObject;
        T result = caseDoWhile(doWhile);
        if (result == null) result = caseAction(doWhile);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BrowserAutomationPackage.BOOLEAN_EXP:
      {
        BooleanExp booleanExp = (BooleanExp)theEObject;
        T result = caseBooleanExp(booleanExp);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BrowserAutomationPackage.IF_THEN:
      {
        IfThen ifThen = (IfThen)theEObject;
        T result = caseIfThen(ifThen);
        if (result == null) result = caseAction(ifThen);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BrowserAutomationPackage.SUBROUTINE:
      {
        Subroutine subroutine = (Subroutine)theEObject;
        T result = caseSubroutine(subroutine);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BrowserAutomationPackage.SUBROUTINE_CALL:
      {
        SubroutineCall subroutineCall = (SubroutineCall)theEObject;
        T result = caseSubroutineCall(subroutineCall);
        if (result == null) result = caseAction(subroutineCall);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BrowserAutomationPackage.VARIABLE_ID:
      {
        VariableId variableId = (VariableId)theEObject;
        T result = caseVariableId(variableId);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Browser Automation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Browser Automation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBrowserAutomation(BrowserAutomation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Action</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Action</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAction(Action object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Goto</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Goto</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGoto(Goto object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Click On</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Click On</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseClickOn(ClickOn object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Selector</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Selector</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSelector(Selector object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Fill</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Fill</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFill(Fill object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Check</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Check</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCheck(Check object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Uncheck</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Uncheck</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUncheck(Uncheck object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Pick</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Pick</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePick(Pick object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Let</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Let</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLet(Let object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Let Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Let Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLetValue(LetValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseValue(Value object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Do While</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Do While</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDoWhile(DoWhile object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Boolean Exp</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Boolean Exp</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBooleanExp(BooleanExp object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>If Then</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>If Then</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIfThen(IfThen object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Subroutine</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Subroutine</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSubroutine(Subroutine object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Subroutine Call</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Subroutine Call</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSubroutineCall(SubroutineCall object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Variable Id</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Variable Id</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVariableId(VariableId object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //BrowserAutomationSwitch
