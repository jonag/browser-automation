/*
* generated by Xtext
*/
package org.joclal;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class BrowserAutomationStandaloneSetup extends BrowserAutomationStandaloneSetupGenerated{

	public static void doSetup() {
		new BrowserAutomationStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}
