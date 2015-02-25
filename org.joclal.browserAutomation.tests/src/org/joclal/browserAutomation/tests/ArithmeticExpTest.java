/**
 */
package org.joclal.browserAutomation.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import org.joclal.browserAutomation.ArithmeticExp;
import org.joclal.browserAutomation.BrowserAutomationFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Arithmetic Exp</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ArithmeticExpTest extends TestCase {

	/**
	 * The fixture for this Arithmetic Exp test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArithmeticExp fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ArithmeticExpTest.class);
	}

	/**
	 * Constructs a new Arithmetic Exp test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArithmeticExpTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Arithmetic Exp test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(ArithmeticExp fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Arithmetic Exp test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArithmeticExp getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(BrowserAutomationFactory.eINSTANCE.createArithmeticExp());
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

} //ArithmeticExpTest
