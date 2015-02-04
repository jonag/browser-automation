/**
 */
package org.joclal.browserAutomation;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Check</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.joclal.browserAutomation.Check#getCheckbox <em>Checkbox</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.joclal.browserAutomation.BrowserAutomationPackage#getCheck()
 * @model
 * @generated
 */
public interface Check extends Action
{
  /**
	 * Returns the value of the '<em><b>Checkbox</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Checkbox</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Checkbox</em>' containment reference.
	 * @see #setCheckbox(Selector)
	 * @see org.joclal.browserAutomation.BrowserAutomationPackage#getCheck_Checkbox()
	 * @model containment="true"
	 * @generated
	 */
  Selector getCheckbox();

  /**
	 * Sets the value of the '{@link org.joclal.browserAutomation.Check#getCheckbox <em>Checkbox</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Checkbox</em>' containment reference.
	 * @see #getCheckbox()
	 * @generated
	 */
  void setCheckbox(Selector value);

} // Check
