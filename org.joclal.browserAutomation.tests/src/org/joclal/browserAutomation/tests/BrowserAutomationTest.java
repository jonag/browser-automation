/**
 */
package org.joclal.browserAutomation.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import org.joclal.browserAutomation.BrowserAutomation;
import org.joclal.browserAutomation.BrowserAutomationFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Browser Automation</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class BrowserAutomationTest extends TestCase {

	/**
	 * The fixture for this Browser Automation test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BrowserAutomation fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(BrowserAutomationTest.class);
	}

	/**
	 * Constructs a new Browser Automation test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BrowserAutomationTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Browser Automation test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(BrowserAutomation fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Browser Automation test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BrowserAutomation getFixture() {
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
		setFixture(BrowserAutomationFactory.eINSTANCE.createBrowserAutomation());
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

} //BrowserAutomationTest
