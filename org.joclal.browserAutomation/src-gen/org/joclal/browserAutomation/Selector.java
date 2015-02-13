/**
 */
package org.joclal.browserAutomation;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Selector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.joclal.browserAutomation.Selector#getHaydies <em>Haydies</em>}</li>
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
   * Returns the value of the '<em><b>Haydies</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Haydies</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Haydies</em>' attribute list.
   * @see org.joclal.browserAutomation.BrowserAutomationPackage#getSelector_Haydies()
   * @model unique="false"
   * @generated
   */
  EList<String> getHaydies();

} // Selector
