/**
 */
package org.joclal.browserAutomation;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Subroutine Param</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.joclal.browserAutomation.SubroutineParam#getName <em>Name</em>}</li>
 *   <li>{@link org.joclal.browserAutomation.SubroutineParam#getNext <em>Next</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.joclal.browserAutomation.BrowserAutomationPackage#getSubroutineParam()
 * @model
 * @generated
 */
public interface SubroutineParam extends EObject
{
  /**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(VariableId)
	 * @see org.joclal.browserAutomation.BrowserAutomationPackage#getSubroutineParam_Name()
	 * @model containment="true"
	 * @generated
	 */
  VariableId getName();

  /**
	 * Sets the value of the '{@link org.joclal.browserAutomation.SubroutineParam#getName <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' containment reference.
	 * @see #getName()
	 * @generated
	 */
  void setName(VariableId value);

  /**
	 * Returns the value of the '<em><b>Next</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Next</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Next</em>' containment reference.
	 * @see #setNext(SubroutineParam)
	 * @see org.joclal.browserAutomation.BrowserAutomationPackage#getSubroutineParam_Next()
	 * @model containment="true"
	 * @generated
	 */
  SubroutineParam getNext();

  /**
	 * Sets the value of the '{@link org.joclal.browserAutomation.SubroutineParam#getNext <em>Next</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next</em>' containment reference.
	 * @see #getNext()
	 * @generated
	 */
  void setNext(SubroutineParam value);

} // SubroutineParam
