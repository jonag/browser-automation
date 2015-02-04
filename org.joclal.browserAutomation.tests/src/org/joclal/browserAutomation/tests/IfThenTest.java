/**
 */
package org.joclal.browserAutomation.tests;

import junit.framework.TestCase;
import junit.textui.TestRunner;

import org.joclal.browserAutomation.BrowserAutomationFactory;
import org.joclal.browserAutomation.IfThen;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>If Then</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class IfThenTest extends TestCase {

	/**
	 * The fixture for this If Then test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfThen fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(IfThenTest.class);
	}

	/**
	 * Constructs a new If Then test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfThenTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this If Then test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(IfThen fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this If Then test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected IfThen getFixture() {
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
		setFixture(BrowserAutomationFactory.eINSTANCE.createIfThen());
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

} //IfThenTest
