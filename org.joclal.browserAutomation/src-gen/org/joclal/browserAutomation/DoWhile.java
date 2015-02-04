/**
 */
package org.joclal.browserAutomation;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Do While</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.joclal.browserAutomation.DoWhile#getActions <em>Actions</em>}</li>
 *   <li>{@link org.joclal.browserAutomation.DoWhile#getCondition <em>Condition</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.joclal.browserAutomation.BrowserAutomationPackage#getDoWhile()
 * @model
 * @generated
 */
public interface DoWhile extends EObject
{
  /**
	 * Returns the value of the '<em><b>Actions</b></em>' containment reference list.
	 * The list contents are of type {@link org.joclal.browserAutomation.Action}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Actions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Actions</em>' containment reference list.
	 * @see org.joclal.browserAutomation.BrowserAutomationPackage#getDoWhile_Actions()
	 * @model containment="true"
	 * @generated
	 */
  EList<Action> getActions();

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
	 * @see org.joclal.browserAutomation.BrowserAutomationPackage#getDoWhile_Condition()
	 * @model containment="true"
	 * @generated
	 */
  BooleanExp getCondition();

  /**
	 * Sets the value of the '{@link org.joclal.browserAutomation.DoWhile#getCondition <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' containment reference.
	 * @see #getCondition()
	 * @generated
	 */
  void setCondition(BooleanExp value);

} // DoWhile
