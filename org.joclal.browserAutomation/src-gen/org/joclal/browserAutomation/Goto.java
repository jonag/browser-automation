/**
 */
package org.joclal.browserAutomation;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Goto</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.joclal.browserAutomation.Goto#getUrl <em>Url</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.joclal.browserAutomation.BrowserAutomationPackage#getGoto()
 * @model
 * @generated
 */
public interface Goto extends Action
{
  /**
	 * Returns the value of the '<em><b>Url</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Url</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Url</em>' containment reference.
	 * @see #setUrl(Value)
	 * @see org.joclal.browserAutomation.BrowserAutomationPackage#getGoto_Url()
	 * @model containment="true"
	 * @generated
	 */
  Value getUrl();

  /**
	 * Sets the value of the '{@link org.joclal.browserAutomation.Goto#getUrl <em>Url</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url</em>' containment reference.
	 * @see #getUrl()
	 * @generated
	 */
  void setUrl(Value value);

} // Goto
