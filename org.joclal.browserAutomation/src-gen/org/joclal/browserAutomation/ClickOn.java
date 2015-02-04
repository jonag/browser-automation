/**
 */
package org.joclal.browserAutomation;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Click On</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.joclal.browserAutomation.ClickOn#getSelector <em>Selector</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.joclal.browserAutomation.BrowserAutomationPackage#getClickOn()
 * @model
 * @generated
 */
public interface ClickOn extends Action
{
  /**
	 * Returns the value of the '<em><b>Selector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Selector</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Selector</em>' containment reference.
	 * @see #setSelector(Selector)
	 * @see org.joclal.browserAutomation.BrowserAutomationPackage#getClickOn_Selector()
	 * @model containment="true"
	 * @generated
	 */
  Selector getSelector();

  /**
	 * Sets the value of the '{@link org.joclal.browserAutomation.ClickOn#getSelector <em>Selector</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selector</em>' containment reference.
	 * @see #getSelector()
	 * @generated
	 */
  void setSelector(Selector value);

} // ClickOn
