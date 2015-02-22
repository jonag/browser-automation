/**
 */
package org.joclal.browserAutomation;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Subroutine Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.joclal.browserAutomation.SubroutineCall#getSubroutine <em>Subroutine</em>}</li>
 *   <li>{@link org.joclal.browserAutomation.SubroutineCall#getParams <em>Params</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.joclal.browserAutomation.BrowserAutomationPackage#getSubroutineCall()
 * @model
 * @generated
 */
public interface SubroutineCall extends Action
{
  /**
   * Returns the value of the '<em><b>Subroutine</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Subroutine</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Subroutine</em>' reference.
   * @see #setSubroutine(Subroutine)
   * @see org.joclal.browserAutomation.BrowserAutomationPackage#getSubroutineCall_Subroutine()
   * @model
   * @generated
   */
  Subroutine getSubroutine();

  /**
   * Sets the value of the '{@link org.joclal.browserAutomation.SubroutineCall#getSubroutine <em>Subroutine</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Subroutine</em>' reference.
   * @see #getSubroutine()
   * @generated
   */
  void setSubroutine(Subroutine value);

  /**
   * Returns the value of the '<em><b>Params</b></em>' containment reference list.
   * The list contents are of type {@link org.joclal.browserAutomation.Value}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Params</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Params</em>' containment reference list.
   * @see org.joclal.browserAutomation.BrowserAutomationPackage#getSubroutineCall_Params()
   * @model containment="true"
   * @generated
   */
  EList<Value> getParams();

} // SubroutineCall
