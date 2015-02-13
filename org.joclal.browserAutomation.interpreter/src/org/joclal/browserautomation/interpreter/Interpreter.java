package org.joclal.browserautomation.interpreter;

import java.util.List;

import org.joclal.browserAutomation.*;
import org.joclal.browserautomation.interpreter.utils.InterpreterUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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

	private void init() {
		// browser props
		System.setProperty("webdriver.chrome.driver", "res/chromedriver");
	}
	
	private void processAction(Action a){
		if(a instanceof Goto){
			processGoto((Goto) a);
		}else if(a instanceof ClickOn){
			processClickOn((ClickOn) a);
		}else if(a instanceof Fill){
			processFill((Fill) a);
		}else if(a instanceof Check){
			processCheck((Check) a);
		}else if(a instanceof Uncheck){
			processUncheck((Uncheck) a);
		}else if(a instanceof Let){
			processLet((Let) a);
		}else if(a instanceof DoWhile){
			processDoWhile((DoWhile) a);
		}else if(a instanceof IfThen){
			processIfThen((IfThen) a);
		}else if(a instanceof SubroutineCall){
			processSubroutineCall((SubroutineCall) a);
		}
	}
	
	private void processSubroutineCall(SubroutineCall a) {
		// TODO Auto-generated method stub
		
	}

	private void processIfThen(IfThen a) {
		// TODO Auto-generated method stub
		
	}

	private void processDoWhile(DoWhile a) {
		// TODO Auto-generated method stub
		
	}

	private void processLet(Let a) {
		// TODO Auto-generated method stub
		
	}

	private void processUncheck(Uncheck a) {
		// TODO Auto-generated method stub
		
	}

	private void processCheck(Check a) {
		// TODO Auto-generated method stub
		
	}

	private void processFill(Fill a) {
		Selector s = a.getField();
		List<String> sels = s.getHaydies();
		for(String sel : sels){
			WebElement element = this.getWebElement(sel);
			element.sendKeys(InterpreterUtils.getValue(a.getValue()));
		}
		
	}

	private void processClickOn(ClickOn a) {
		Selector s = a.getSelector();
		List<String> sels = s.getHaydies();
		for(String sel : sels){
			WebElement element = this.getWebElement(sel);
			element.click();
		}
	}

	private void processGoto(Goto a){
		Value urlValue = a.getUrl();
		String url = InterpreterUtils.getValue(urlValue);
		driver.get(url);
	}

	
	private WebElement getWebElement(String sel) {
		return driver.findElement(By.name(sel));
	}
	
}
