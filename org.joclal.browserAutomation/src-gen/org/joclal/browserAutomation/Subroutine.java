/**
 */
package org.joclal.browserAutomation;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Subroutine</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.joclal.browserAutomation.Subroutine#getName <em>Name</em>}</li>
 *   <li>{@link org.joclal.browserAutomation.Subroutine#getParams <em>Params</em>}</li>
 *   <li>{@link org.joclal.browserAutomation.Subroutine#getActions <em>Actions</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.joclal.browserAutomation.BrowserAutomationPackage#getSubroutine()
 * @model
 * @generated
 */
public interface Subroutine extends EObject
{
  /**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.joclal.browserAutomation.BrowserAutomationPackage#getSubroutine_Name()
	 * @model
	 * @generated
	 */
  String getName();

  /**
	 * Sets the value of the '{@link org.joclal.browserAutomation.Subroutine#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
  void setName(String value);

  /**
	 * Returns the value of the '<em><b>Params</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Params</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Params</em>' containment reference.
	 * @see #setParams(SubroutineParam)
	 * @see org.joclal.browserAutomation.BrowserAutomationPackage#getSubroutine_Params()
	 * @model containment="true"
	 * @generated
	 */
  SubroutineParam getParams();

  /**
	 * Sets the value of the '{@link org.joclal.browserAutomation.Subroutine#getParams <em>Params</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Params</em>' containment reference.
	 * @see #getParams()
	 * @generated
	 */
  void setParams(SubroutineParam value);

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
	 * @see org.joclal.browserAutomation.BrowserAutomationPackage#getSubroutine_Actions()
	 * @model containment="true"
	 * @generated
	 */
  EList<Action> getActions();

} // Subroutine
