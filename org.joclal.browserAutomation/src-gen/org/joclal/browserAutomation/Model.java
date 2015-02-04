/**
 */
package org.joclal.browserAutomation;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.joclal.browserAutomation.Model#getBrowser <em>Browser</em>}</li>
 *   <li>{@link org.joclal.browserAutomation.Model#getFirstGoTo <em>First Go To</em>}</li>
 *   <li>{@link org.joclal.browserAutomation.Model#getActions <em>Actions</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.joclal.browserAutomation.BrowserAutomationPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
{
  /**
	 * Returns the value of the '<em><b>Browser</b></em>' attribute.
	 * The literals are from the enumeration {@link org.joclal.browserAutomation.Browser}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Browser</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Browser</em>' attribute.
	 * @see org.joclal.browserAutomation.Browser
	 * @see #setBrowser(Browser)
	 * @see org.joclal.browserAutomation.BrowserAutomationPackage#getModel_Browser()
	 * @model
	 * @generated
	 */
  Browser getBrowser();

  /**
	 * Sets the value of the '{@link org.joclal.browserAutomation.Model#getBrowser <em>Browser</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Browser</em>' attribute.
	 * @see org.joclal.browserAutomation.Browser
	 * @see #getBrowser()
	 * @generated
	 */
  void setBrowser(Browser value);

  /**
	 * Returns the value of the '<em><b>First Go To</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>First Go To</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>First Go To</em>' containment reference.
	 * @see #setFirstGoTo(Goto)
	 * @see org.joclal.browserAutomation.BrowserAutomationPackage#getModel_FirstGoTo()
	 * @model containment="true"
	 * @generated
	 */
  Goto getFirstGoTo();

  /**
	 * Sets the value of the '{@link org.joclal.browserAutomation.Model#getFirstGoTo <em>First Go To</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First Go To</em>' containment reference.
	 * @see #getFirstGoTo()
	 * @generated
	 */
  void setFirstGoTo(Goto value);

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
	 * @see org.joclal.browserAutomation.BrowserAutomationPackage#getModel_Actions()
	 * @model containment="true"
	 * @generated
	 */
  EList<Action> getActions();

} // Model
