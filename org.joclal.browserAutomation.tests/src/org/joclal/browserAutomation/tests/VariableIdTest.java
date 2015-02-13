/**
 */
package org.joclal.browserAutomation.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import org.joclal.browserAutomation.BrowserAutomationFactory;
import org.joclal.browserAutomation.VariableId;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Variable Id</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class VariableIdTest extends SubroutineParamTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(VariableIdTest.class);
	}

	/**
	 * Constructs a new Variable Id test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableIdTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Variable Id test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected VariableId getFixture() {
		return (VariableId)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(BrowserAutomationFactory.eINSTANCE.createVariableId());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //VariableIdTest
