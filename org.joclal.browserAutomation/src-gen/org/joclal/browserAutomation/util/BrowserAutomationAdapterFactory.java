/**
 */
package org.joclal.browserAutomation.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.joclal.browserAutomation.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.joclal.browserAutomation.BrowserAutomationPackage
 * @generated
 */
public class BrowserAutomationAdapterFactory extends AdapterFactoryImpl
{
  /**
	 * The cached model package.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected static BrowserAutomationPackage modelPackage;

  /**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public BrowserAutomationAdapterFactory()
  {
		if (modelPackage == null) {
			modelPackage = BrowserAutomationPackage.eINSTANCE;
		}
	}

  /**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
  @Override
  public boolean isFactoryForType(Object object)
  {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

  /**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected BrowserAutomationSwitch<Adapter> modelSwitch =
    new BrowserAutomationSwitch<Adapter>() {
			@Override
			public Adapter caseModel(Model object) {
				return createModelAdapter();
			}
			@Override
			public Adapter caseAction(Action object) {
				return createActionAdapter();
			}
			@Override
			public Adapter caseGoto(Goto object) {
				return createGotoAdapter();
			}
			@Override
			public Adapter caseClickOn(ClickOn object) {
				return createClickOnAdapter();
			}
			@Override
			public Adapter caseSelector(Selector object) {
				return createSelectorAdapter();
			}
			@Override
			public Adapter caseDomID(DomID object) {
				return createDomIDAdapter();
			}
			@Override
			public Adapter caseSubroutineParam(SubroutineParam object) {
				return createSubroutineParamAdapter();
			}
			@Override
			public Adapter caseFill(Fill object) {
				return createFillAdapter();
			}
			@Override
			public Adapter caseCheck(Check object) {
				return createCheckAdapter();
			}
			@Override
			public Adapter caseUncheck(Uncheck object) {
				return createUncheckAdapter();
			}
			@Override
			public Adapter caseLet(Let object) {
				return createLetAdapter();
			}
			@Override
			public Adapter caseLetValue(LetValue object) {
				return createLetValueAdapter();
			}
			@Override
			public Adapter caseValue(Value object) {
				return createValueAdapter();
			}
			@Override
			public Adapter caseDoWhile(DoWhile object) {
				return createDoWhileAdapter();
			}
			@Override
			public Adapter caseBooleanExp(BooleanExp object) {
				return createBooleanExpAdapter();
			}
			@Override
			public Adapter caseIfThen(IfThen object) {
				return createIfThenAdapter();
			}
			@Override
			public Adapter caseSubroutine(Subroutine object) {
				return createSubroutineAdapter();
			}
			@Override
			public Adapter caseSubroutineCall(SubroutineCall object) {
				return createSubroutineCallAdapter();
			}
			@Override
			public Adapter caseVariableId(VariableId object) {
				return createVariableIdAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

  /**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
  @Override
  public Adapter createAdapter(Notifier target)
  {
		return modelSwitch.doSwitch((EObject)target);
	}


  /**
	 * Creates a new adapter for an object of class '{@link org.joclal.browserAutomation.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.joclal.browserAutomation.Model
	 * @generated
	 */
  public Adapter createModelAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.joclal.browserAutomation.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.joclal.browserAutomation.Action
	 * @generated
	 */
  public Adapter createActionAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.joclal.browserAutomation.Goto <em>Goto</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.joclal.browserAutomation.Goto
	 * @generated
	 */
  public Adapter createGotoAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.joclal.browserAutomation.ClickOn <em>Click On</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.joclal.browserAutomation.ClickOn
	 * @generated
	 */
  public Adapter createClickOnAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.joclal.browserAutomation.Selector <em>Selector</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.joclal.browserAutomation.Selector
	 * @generated
	 */
  public Adapter createSelectorAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.joclal.browserAutomation.DomID <em>Dom ID</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.joclal.browserAutomation.DomID
	 * @generated
	 */
  public Adapter createDomIDAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.joclal.browserAutomation.SubroutineParam <em>Subroutine Param</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.joclal.browserAutomation.SubroutineParam
	 * @generated
	 */
  public Adapter createSubroutineParamAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.joclal.browserAutomation.Fill <em>Fill</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.joclal.browserAutomation.Fill
	 * @generated
	 */
  public Adapter createFillAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.joclal.browserAutomation.Check <em>Check</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.joclal.browserAutomation.Check
	 * @generated
	 */
  public Adapter createCheckAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.joclal.browserAutomation.Uncheck <em>Uncheck</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.joclal.browserAutomation.Uncheck
	 * @generated
	 */
  public Adapter createUncheckAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.joclal.browserAutomation.Let <em>Let</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.joclal.browserAutomation.Let
	 * @generated
	 */
  public Adapter createLetAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.joclal.browserAutomation.LetValue <em>Let Value</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.joclal.browserAutomation.LetValue
	 * @generated
	 */
  public Adapter createLetValueAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.joclal.browserAutomation.Value <em>Value</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.joclal.browserAutomation.Value
	 * @generated
	 */
  public Adapter createValueAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.joclal.browserAutomation.DoWhile <em>Do While</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.joclal.browserAutomation.DoWhile
	 * @generated
	 */
  public Adapter createDoWhileAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.joclal.browserAutomation.BooleanExp <em>Boolean Exp</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.joclal.browserAutomation.BooleanExp
	 * @generated
	 */
  public Adapter createBooleanExpAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.joclal.browserAutomation.IfThen <em>If Then</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.joclal.browserAutomation.IfThen
	 * @generated
	 */
  public Adapter createIfThenAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.joclal.browserAutomation.Subroutine <em>Subroutine</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.joclal.browserAutomation.Subroutine
	 * @generated
	 */
  public Adapter createSubroutineAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.joclal.browserAutomation.SubroutineCall <em>Subroutine Call</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.joclal.browserAutomation.SubroutineCall
	 * @generated
	 */
  public Adapter createSubroutineCallAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.joclal.browserAutomation.VariableId <em>Variable Id</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.joclal.browserAutomation.VariableId
	 * @generated
	 */
  public Adapter createVariableIdAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
  public Adapter createEObjectAdapter()
  {
		return null;
	}

} //BrowserAutomationAdapterFactory
