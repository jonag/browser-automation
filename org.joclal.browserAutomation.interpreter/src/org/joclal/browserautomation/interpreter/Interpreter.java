package org.joclal.browserautomation.interpreter;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.joclal.browserAutomation.*;
import org.joclal.browserautomation.interpreter.utils.DriverFacade;
import org.joclal.browserautomation.interpreter.utils.InterpreterUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.Select;

public class Interpreter {

	

	public void execute(BrowserAutomation script) {

		// processing subroutines
		for (Subroutine s : script.getSubroutines()) {

		}

		// browser opening
		Browser b = script.getBrowser();
		DriverFacade.openBrowser(b.getLiteral());

		// first goto
		Value urlValue = script.getFirstGoTo().getUrl();
		String url = InterpreterUtils.getValue(urlValue);
		DriverFacade.goTo(url);
		
		// actions
		for(Action a :script.getActions()){
			processAction(a);
		}

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
		}else if (a instanceof SelectOption){
			processSelectOption((SelectOption) a);
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

	private void processIfThen(IfThen truc) {
		InterpreterUtils.newClosure();
		if(InterpreterUtils.processCondition(truc.getCondition())){
			for(Action a: truc.getThenActions()){
				processAction(a);
			}
		}else{
			for(Action a: truc.getElseActions()){
				processAction(a);
			}
		}
		InterpreterUtils.finishClosure();
	}

	private void processDoWhile(DoWhile truc) {
		InterpreterUtils.newClosure();
		Boolean condition = true;
		while(condition){
			for(Action a : truc.getActions()){
				processAction(a);
			}
			condition = InterpreterUtils.processCondition(truc.getCondition());
		}
		InterpreterUtils.finishClosure();
	}

	private void processLet(Let a) {
		InterpreterUtils.setVar(a);
		
	}

	private void processUncheck(Uncheck a) {
		Selector s = a.getCheckbox();
		List<WebElement> elements = DriverFacade.getWebElement(s.getId());
		for(WebElement element : elements){
			if(element.getTagName().equalsIgnoreCase("input") && element.getAttribute("type").equalsIgnoreCase("checkbox") && element.getAttribute("selected").equalsIgnoreCase("selected")){
				element.click();
				if(DriverFacade.hasUrlChanged()) break;
			}
		}
	}

	private void processCheck(Check a) {
		Selector s = a.getCheckbox();
		List<WebElement> elements = DriverFacade.getWebElement(s.getId());
		for(WebElement element : elements){
			if(element.getTagName().equalsIgnoreCase("input") && element.getAttribute("type").equalsIgnoreCase("checkbox") && !element.getAttribute("selected").equalsIgnoreCase("selected")){
				element.click();
				if(DriverFacade.hasUrlChanged()) break;
			}
		}
	}

	private void processFill(Fill a) {
		Selector s = a.getField();
		List<WebElement> elements = DriverFacade.getWebElement(s.getId());
		for(WebElement element : elements){
			element.sendKeys(InterpreterUtils.getValue(a.getValue()));
			if(DriverFacade.hasUrlChanged()) break;
		}
		
	}

	private void processClickOn(ClickOn a) {
		Selector s = a.getSelector();
		List<WebElement> elements = DriverFacade.getWebElement(s.getId());
		for(WebElement element : elements){
			element.click();
			if(DriverFacade.hasUrlChanged()) break;
		}
	}

	private void processGoto(Goto a){
		Value urlValue = a.getUrl();
		String url = InterpreterUtils.getValue(urlValue);
		DriverFacade.goTo(url);
	}
	
	private void processSelectOption(SelectOption a) {
		String value = a.getValue();
		Selector s = a.getSelect();
		List<WebElement> elements = DriverFacade.getWebElement(s.getId());
		for (WebElement webElement : elements) {
			Select select = new Select(webElement);
			select.selectByValue(value);
			if(DriverFacade.hasUrlChanged()) break;
		}
	}
	
}
