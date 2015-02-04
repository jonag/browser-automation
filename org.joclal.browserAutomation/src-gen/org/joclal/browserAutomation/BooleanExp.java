/**
 */
package org.joclal.browserAutomation;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Boolean Exp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.joclal.browserAutomation.BooleanExp#getLeftMember <em>Left Member</em>}</li>
 *   <li>{@link org.joclal.browserAutomation.BooleanExp#getOperator <em>Operator</em>}</li>
 *   <li>{@link org.joclal.browserAutomation.BooleanExp#getRightMember <em>Right Member</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.joclal.browserAutomation.BrowserAutomationPackage#getBooleanExp()
 * @model
 * @generated
 */
public interface BooleanExp extends EObject
{
  /**
   * Returns the value of the '<em><b>Left Member</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Left Member</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left Member</em>' containment reference.
   * @see #setLeftMember(Value)
   * @see org.joclal.browserAutomation.BrowserAutomationPackage#getBooleanExp_LeftMember()
   * @model containment="true"
   * @generated
   */
  Value getLeftMember();

  /**
   * Sets the value of the '{@link org.joclal.browserAutomation.BooleanExp#getLeftMember <em>Left Member</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left Member</em>' containment reference.
   * @see #getLeftMember()
   * @generated
   */
  void setLeftMember(Value value);

  /**
   * Returns the value of the '<em><b>Operator</b></em>' attribute.
   * The literals are from the enumeration {@link org.joclal.browserAutomation.Operator}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Operator</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operator</em>' attribute.
   * @see org.joclal.browserAutomation.Operator
   * @see #setOperator(Operator)
   * @see org.joclal.browserAutomation.BrowserAutomationPackage#getBooleanExp_Operator()
   * @model
   * @generated
   */
  Operator getOperator();

  /**
   * Sets the value of the '{@link org.joclal.browserAutomation.BooleanExp#getOperator <em>Operator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Operator</em>' attribute.
   * @see org.joclal.browserAutomation.Operator
   * @see #getOperator()
   * @generated
   */
  void setOperator(Operator value);

  /**
   * Returns the value of the '<em><b>Right Member</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right Member</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right Member</em>' containment reference.
   * @see #setRightMember(Value)
   * @see org.joclal.browserAutomation.BrowserAutomationPackage#getBooleanExp_RightMember()
   * @model containment="true"
   * @generated
   */
  Value getRightMember();

  /**
   * Sets the value of the '{@link org.joclal.browserAutomation.BooleanExp#getRightMember <em>Right Member</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right Member</em>' containment reference.
   * @see #getRightMember()
   * @generated
   */
  void setRightMember(Value value);

} // BooleanExp
