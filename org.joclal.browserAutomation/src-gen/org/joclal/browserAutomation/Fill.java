/**
 */
package org.joclal.browserAutomation;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fill</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.joclal.browserAutomation.Fill#getField <em>Field</em>}</li>
 *   <li>{@link org.joclal.browserAutomation.Fill#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.joclal.browserAutomation.BrowserAutomationPackage#getFill()
 * @model
 * @generated
 */
public interface Fill extends Action
{
  /**
   * Returns the value of the '<em><b>Field</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Field</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Field</em>' containment reference.
   * @see #setField(Selector)
   * @see org.joclal.browserAutomation.BrowserAutomationPackage#getFill_Field()
   * @model containment="true"
   * @generated
   */
  Selector getField();

  /**
   * Sets the value of the '{@link org.joclal.browserAutomation.Fill#getField <em>Field</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Field</em>' containment reference.
   * @see #getField()
   * @generated
   */
  void setField(Selector value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' containment reference.
   * @see #setValue(Value)
   * @see org.joclal.browserAutomation.BrowserAutomationPackage#getFill_Value()
   * @model containment="true"
   * @generated
   */
  Value getValue();

  /**
   * Sets the value of the '{@link org.joclal.browserAutomation.Fill#getValue <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' containment reference.
   * @see #getValue()
   * @generated
   */
  void setValue(Value value);

} // Fill
