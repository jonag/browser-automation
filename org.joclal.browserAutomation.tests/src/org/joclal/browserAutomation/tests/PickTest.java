/**
 */
package org.joclal.browserAutomation.tests;

import junit.textui.TestRunner;

import org.joclal.browserAutomation.BrowserAutomationFactory;
import org.joclal.browserAutomation.Pick;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Pick</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PickTest extends ActionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PickTest.class);
	}

	/**
	 * Constructs a new Pick test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PickTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Pick test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Pick getFixture() {
		return (Pick)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(BrowserAutomationFactory.eINSTANCE.createPick());
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

} //PickTest
