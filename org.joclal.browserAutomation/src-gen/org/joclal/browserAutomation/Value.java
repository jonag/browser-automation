/**
 */
package org.joclal.browserAutomation;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.joclal.browserAutomation.Value#getString <em>String</em>}</li>
 *   <li>{@link org.joclal.browserAutomation.Value#getVariable <em>Variable</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.joclal.browserAutomation.BrowserAutomationPackage#getValue()
 * @model
 * @generated
 */
public interface Value extends EObject
{
  /**
   * Returns the value of the '<em><b>String</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>String</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>String</em>' attribute.
   * @see #setString(String)
   * @see org.joclal.browserAutomation.BrowserAutomationPackage#getValue_String()
   * @model
   * @generated
   */
  String getString();

  /**
   * Sets the value of the '{@link org.joclal.browserAutomation.Value#getString <em>String</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>String</em>' attribute.
   * @see #getString()
   * @generated
   */
  void setString(String value);

  /**
   * Returns the value of the '<em><b>Variable</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variable</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variable</em>' reference.
   * @see #setVariable(VariableId)
   * @see org.joclal.browserAutomation.BrowserAutomationPackage#getValue_Variable()
   * @model
   * @generated
   */
  VariableId getVariable();

  /**
   * Sets the value of the '{@link org.joclal.browserAutomation.Value#getVariable <em>Variable</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Variable</em>' reference.
   * @see #getVariable()
   * @generated
   */
  void setVariable(VariableId value);

} // Value
