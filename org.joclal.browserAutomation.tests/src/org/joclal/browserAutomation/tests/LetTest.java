/**
 */
package org.joclal.browserAutomation.tests;

import junit.textui.TestRunner;

import org.joclal.browserAutomation.BrowserAutomationFactory;
import org.joclal.browserAutomation.Let;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Let</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class LetTest extends ActionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(LetTest.class);
	}

	/**
	 * Constructs a new Let test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LetTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Let test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Let getFixture() {
		return (Let)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(BrowserAutomationFactory.eINSTANCE.createLet());
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

} //LetTest
