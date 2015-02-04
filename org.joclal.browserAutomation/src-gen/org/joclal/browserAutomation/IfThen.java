/**
 */
package org.joclal.browserAutomation;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>If Then</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.joclal.browserAutomation.IfThen#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.joclal.browserAutomation.IfThen#getThenActions <em>Then Actions</em>}</li>
 *   <li>{@link org.joclal.browserAutomation.IfThen#getElseActions <em>Else Actions</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.joclal.browserAutomation.BrowserAutomationPackage#getIfThen()
 * @model
 * @generated
 */
public interface IfThen extends Action
{
  /**
	 * Returns the value of the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Condition</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' containment reference.
	 * @see #setCondition(BooleanExp)
	 * @see org.joclal.browserAutomation.BrowserAutomationPackage#getIfThen_Condition()
	 * @model containment="true"
	 * @generated
	 */
  BooleanExp getCondition();

  /**
	 * Sets the value of the '{@link org.joclal.browserAutomation.IfThen#getCondition <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' containment reference.
	 * @see #getCondition()
	 * @generated
	 */
  void setCondition(BooleanExp value);

  /**
	 * Returns the value of the '<em><b>Then Actions</b></em>' containment reference list.
	 * The list contents are of type {@link org.joclal.browserAutomation.Action}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Then Actions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Then Actions</em>' containment reference list.
	 * @see org.joclal.browserAutomation.BrowserAutomationPackage#getIfThen_ThenActions()
	 * @model containment="true"
	 * @generated
	 */
  EList<Action> getThenActions();

  /**
	 * Returns the value of the '<em><b>Else Actions</b></em>' containment reference list.
	 * The list contents are of type {@link org.joclal.browserAutomation.Action}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Else Actions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Else Actions</em>' containment reference list.
	 * @see org.joclal.browserAutomation.BrowserAutomationPackage#getIfThen_ElseActions()
	 * @model containment="true"
	 * @generated
	 */
  EList<Action> getElseActions();

} // IfThen
