/**
 */
package org.joclal.browserAutomation.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import org.joclal.browserAutomation.BrowserAutomationFactory;
import org.joclal.browserAutomation.DomID;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Dom ID</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DomIDTest extends TestCase {

	/**
	 * The fixture for this Dom ID test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DomID fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DomIDTest.class);
	}

	/**
	 * Constructs a new Dom ID test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomIDTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Dom ID test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(DomID fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Dom ID test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DomID getFixture() {
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
		setFixture(BrowserAutomationFactory.eINSTANCE.createDomID());
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

} //DomIDTest
