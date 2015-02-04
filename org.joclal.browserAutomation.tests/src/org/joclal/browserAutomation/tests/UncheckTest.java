/**
 */
package org.joclal.browserAutomation.tests;

import junit.textui.TestRunner;

import org.joclal.browserAutomation.BrowserAutomationFactory;
import org.joclal.browserAutomation.Uncheck;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Uncheck</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class UncheckTest extends ActionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(UncheckTest.class);
	}

	/**
	 * Constructs a new Uncheck test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UncheckTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Uncheck test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Uncheck getFixture() {
		return (Uncheck)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(BrowserAutomationFactory.eINSTANCE.createUncheck());
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

} //UncheckTest
