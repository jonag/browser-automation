/**
 */
package org.joclal.browserAutomation;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Browser</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.joclal.browserAutomation.BrowserAutomationPackage#getBrowser()
 * @model
 * @generated
 */
public enum Browser implements Enumerator
{
  /**
	 * The '<em><b>Chrome</b></em>' literal object.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #CHROME_VALUE
	 * @generated
	 * @ordered
	 */
  CHROME(0, "chrome", "Chrome"),

  /**
	 * The '<em><b>Safari</b></em>' literal object.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #SAFARI_VALUE
	 * @generated
	 * @ordered
	 */
  SAFARI(1, "safari", "Safari"),

  /**
	 * The '<em><b>Opera</b></em>' literal object.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #OPERA_VALUE
	 * @generated
	 * @ordered
	 */
  OPERA(2, "opera", "Opera"),

  /**
	 * The '<em><b>Firefox</b></em>' literal object.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #FIREFOX_VALUE
	 * @generated
	 * @ordered
	 */
  FIREFOX(3, "firefox", "Firefox"),

  /**
	 * The '<em><b>Ie</b></em>' literal object.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #IE_VALUE
	 * @generated
	 * @ordered
	 */
  IE(4, "ie", "Internet Explorer");

  /**
	 * The '<em><b>Chrome</b></em>' literal value.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Chrome</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @see #CHROME
	 * @model name="chrome" literal="Chrome"
	 * @generated
	 * @ordered
	 */
  public static final int CHROME_VALUE = 0;

  /**
	 * The '<em><b>Safari</b></em>' literal value.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Safari</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @see #SAFARI
	 * @model name="safari" literal="Safari"
	 * @generated
	 * @ordered
	 */
  public static final int SAFARI_VALUE = 1;

  /**
	 * The '<em><b>Opera</b></em>' literal value.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Opera</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @see #OPERA
	 * @model name="opera" literal="Opera"
	 * @generated
	 * @ordered
	 */
  public static final int OPERA_VALUE = 2;

  /**
	 * The '<em><b>Firefox</b></em>' literal value.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Firefox</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @see #FIREFOX
	 * @model name="firefox" literal="Firefox"
	 * @generated
	 * @ordered
	 */
  public static final int FIREFOX_VALUE = 3;

  /**
	 * The '<em><b>Ie</b></em>' literal value.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Ie</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @see #IE
	 * @model name="ie" literal="Internet Explorer"
	 * @generated
	 * @ordered
	 */
  public static final int IE_VALUE = 4;

  /**
	 * An array of all the '<em><b>Browser</b></em>' enumerators.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private static final Browser[] VALUES_ARRAY =
    new Browser[] {
			CHROME,
			SAFARI,
			OPERA,
			FIREFOX,
			IE,
		};

  /**
	 * A public read-only list of all the '<em><b>Browser</b></em>' enumerators.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final List<Browser> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
	 * Returns the '<em><b>Browser</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static Browser get(String literal)
  {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Browser result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

  /**
	 * Returns the '<em><b>Browser</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static Browser getByName(String name)
  {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Browser result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

  /**
	 * Returns the '<em><b>Browser</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static Browser get(int value)
  {
		switch (value) {
			case CHROME_VALUE: return CHROME;
			case SAFARI_VALUE: return SAFARI;
			case OPERA_VALUE: return OPERA;
			case FIREFOX_VALUE: return FIREFOX;
			case IE_VALUE: return IE;
		}
		return null;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private final int value;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private final String name;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private final String literal;

  /**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private Browser(int value, String name, String literal)
  {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public int getValue()
  {
	  return value;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String getName()
  {
	  return name;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String getLiteral()
  {
	  return literal;
	}

  /**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public String toString()
  {
		return literal;
	}
  
} //Browser
