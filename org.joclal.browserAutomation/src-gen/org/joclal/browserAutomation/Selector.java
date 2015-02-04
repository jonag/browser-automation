/**
 */
package org.joclal.browserAutomation;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Selector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.joclal.browserAutomation.Selector#getSel <em>Sel</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.joclal.browserAutomation.BrowserAutomationPackage#getSelector()
 * @model
 * @generated
 */
public interface Selector extends EObject
{
  /**
	 * Returns the value of the '<em><b>Sel</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sel</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Sel</em>' containment reference.
	 * @see #setSel(DomID)
	 * @see org.joclal.browserAutomation.BrowserAutomationPackage#getSelector_Sel()
	 * @model containment="true"
	 * @generated
	 */
  DomID getSel();

  /**
	 * Sets the value of the '{@link org.joclal.browserAutomation.Selector#getSel <em>Sel</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sel</em>' containment reference.
	 * @see #getSel()
	 * @generated
	 */
  void setSel(DomID value);

} // Selector
