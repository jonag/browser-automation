package org.joclal.browserautomation.interpreter;

import org.joclal.browserAutomation.*;
import org.joclal.browserautomation.interpreter.utils.InterpreterUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Interpreter {

	WebDriver driver;

	public void execute(BrowserAutomation script) {

		init();

		// processing subroutines
		for (Subroutine s : script.getSubroutines()) {

		}

		// browser opening
		Browser b = script.getBrowser();
		switch (b.getLiteral()) {
//		case "Chrome":
//			driver = new ChromeDriver();
//			break;
//		case "Safari":
//			driver = new SafariDriver();
//			break;
		case "Firefox":
			driver = new FirefoxDriver();
			break;
		default:
			driver = new FirefoxDriver();
			break;
		}

		// first goto
		Value urlValue = script.getFirstGoTo().getUrl();
		String url = InterpreterUtils.getValue(urlValue);
		driver.get(url);
		
		// actions
		for(Action a :script.getActions()){
			processAction(a);
		}

	}
	
	private void processAction(Action a){
		//a.
	}

	private void init() {
		// browser props
		System.setProperty("webdriver.chrome.driver", "res/chromedriver");
	}

}
