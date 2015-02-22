package org.joclal.browserautomation.interpreter.utils;

import java.util.ArrayList;
import java.util.List;

import org.joclal.browserAutomation.Browser;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFacade {

	private static WebDriver driver;
	
	private static String currentURL = "";
	
	public static void openBrowser(String browser){
		switch (browser) {
//		case "Chrome":
//			DriverFacade = new ChromeDriver();
//			break;
//		case "Safari":
//			DriverFacade = new SafariDriver();
//			break;
		case "Firefox":
			driver = new FirefoxDriver();
			break;
		default:
			driver = new FirefoxDriver();
			break;
		}
	}
	
	public static void goTo(String url){
		driver.get(url);
		currentURL = driver.getCurrentUrl();
	}
	
	/**
	 * First step to find web elements
	 * @param selector
	 * @return
	 */
	public static List<WebElement> getWebElement(String selector){
		int chevronPos = selector.indexOf(">");
		if(chevronPos != -1){
			String initSelector = selector.substring(0, chevronPos);
			List<WebElement> stepResult = toto(initSelector, driver);
			return getWebElement(selector.substring(chevronPos+1, selector.length()), stepResult);
		}else{
			return toto(selector, driver);
		}
	}
	
	/**
	 * Recursive step : applies the selector on a set of web elements
	 * @param selector
	 * @param root
	 * @return
	 */
	private static List<WebElement> getWebElement(String selector, List<WebElement> root){
		int chevronPos = selector.indexOf(">");
		if(chevronPos != -1){
			String stepSelector = selector.substring(0, chevronPos);
			List<WebElement> stepResult = toto(stepSelector, driver);
			for(WebElement we : root){
				stepResult.addAll(toto(stepSelector, we));
			}
			return getWebElement(selector.substring(chevronPos+1, selector.length()), stepResult);
		}else{
			List<WebElement> finalResult = new ArrayList<WebElement>();
			for(WebElement we : root){
				finalResult.addAll(toto(selector, we));
			}
			return finalResult;
		}
	}
	
	private static List<WebElement> toto(String selector, SearchContext root){
		
		System.out.println("Recherche " + selector);
		
		List<WebElement> result;
		
		result = root.findElements(By.id(selector));
		if (result.size() > 0) {
			return result;
		}
		
		result = root.findElements(By.name(selector));
		if (result.size() > 0) {
			return result;
		}
		
		result = root.findElements(By.linkText(selector));
		if (result.size() > 0) {
			return result;
		}
		
		result = root.findElements(By.cssSelector("img[src='"+selector+"']"));
		if (result.size() > 0) {
			return result;
		}

		result = root.findElements(By.className(selector));
		if (result.size() > 0) {
			return result;
		}
		
		result = root.findElements(By.tagName(selector));
		if (result.size() > 0) {
			return result;
		}
		
		System.out.println("Aucun résultat trouvé :/");
		
		return result;
	}
	
	public static Boolean hasUrlChanged(){
		String url = driver.getCurrentUrl();
		if(!url.equalsIgnoreCase(currentURL)){
			//url has changed
			currentURL = url;
			return true;
		}else{
			//same page
			return false;
		}
	}
	
}
