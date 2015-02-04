/**
 */
package org.joclal.browserAutomation;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Let Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.joclal.browserAutomation.LetValue#getSelector <em>Selector</em>}</li>
 *   <li>{@link org.joclal.browserAutomation.LetValue#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.joclal.browserAutomation.BrowserAutomationPackage#getLetValue()
 * @model
 * @generated
 */
public interface LetValue extends EObject
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
   * @see org.joclal.browserAutomation.BrowserAutomationPackage#getLetValue_Selector()
   * @model containment="true"
   * @generated
   */
  Selector getSelector();

  /**
   * Sets the value of the '{@link org.joclal.browserAutomation.LetValue#getSelector <em>Selector</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Selector</em>' containment reference.
   * @see #getSelector()
   * @generated
   */
  void setSelector(Selector value);

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
   * @see org.joclal.browserAutomation.BrowserAutomationPackage#getLetValue_Value()
   * @model containment="true"
   * @generated
   */
  Value getValue();

  /**
   * Sets the value of the '{@link org.joclal.browserAutomation.LetValue#getValue <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' containment reference.
   * @see #getValue()
   * @generated
   */
  void setValue(Value value);

} // LetValue
