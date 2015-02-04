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
 *   <li>{@link org.joclal.browserAutomation.Value#getInt <em>Int</em>}</li>
 *   <li>{@link org.joclal.browserAutomation.Value#getLet <em>Let</em>}</li>
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
	 * Returns the value of the '<em><b>Int</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Int</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Int</em>' attribute.
	 * @see #setInt(int)
	 * @see org.joclal.browserAutomation.BrowserAutomationPackage#getValue_Int()
	 * @model
	 * @generated
	 */
  int getInt();

  /**
	 * Sets the value of the '{@link org.joclal.browserAutomation.Value#getInt <em>Int</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Int</em>' attribute.
	 * @see #getInt()
	 * @generated
	 */
  void setInt(int value);

  /**
	 * Returns the value of the '<em><b>Let</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Let</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Let</em>' reference.
	 * @see #setLet(Let)
	 * @see org.joclal.browserAutomation.BrowserAutomationPackage#getValue_Let()
	 * @model
	 * @generated
	 */
  Let getLet();

  /**
	 * Sets the value of the '{@link org.joclal.browserAutomation.Value#getLet <em>Let</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Let</em>' reference.
	 * @see #getLet()
	 * @generated
	 */
  void setLet(Let value);

} // Value
