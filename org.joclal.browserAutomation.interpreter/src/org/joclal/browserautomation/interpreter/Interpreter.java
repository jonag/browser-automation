package org.joclal.browserautomation.interpreter;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.joclal.browserAutomation.Action;
import org.joclal.browserAutomation.Browser;
import org.joclal.browserAutomation.BrowserAutomation;
import org.joclal.browserAutomation.Check;
import org.joclal.browserAutomation.ClickOn;
import org.joclal.browserAutomation.DoWhile;
import org.joclal.browserAutomation.Fill;
import org.joclal.browserAutomation.Goto;
import org.joclal.browserAutomation.IfThen;
import org.joclal.browserAutomation.Let;
import org.joclal.browserAutomation.Pick;
import org.joclal.browserAutomation.Selector;
import org.joclal.browserAutomation.SubroutineCall;
import org.joclal.browserAutomation.Uncheck;
import org.joclal.browserAutomation.Value;
import org.joclal.browserautomation.interpreter.utils.DriverFacade;
import org.joclal.browserautomation.interpreter.utils.InterpreterUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Interpreter {

	

	public void execute(BrowserAutomation script) {

		// no need to process subroutine defs

		// browser opening
		Browser b = script.getBrowser();
		DriverFacade.openBrowser(b.getLiteral());

		// first goto
		Value urlValue = script.getFirstGoTo().getUrl();
		String url = (String) InterpreterUtils.getValue(urlValue);
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
		}else if (a instanceof Pick){
			processPick((Pick) a);
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
	
	private void processSubroutineCall(SubroutineCall subCall) {
		//store parameters values
		int expected = subCall.getSubroutine().getParams().size();
		int received = subCall.getParams().size();
		if(expected != received){
			System.err.println(String.format("Incoherent number of parameters for subroutine %s. Expected %d, Given %d.", subCall.getSubroutine().getName(), expected, received));
		}
		int paramNumber = expected < received ? expected : received;
		Map<String, Value> params = new HashMap<String, Value>();
		for(int i = 0; i < paramNumber; i++){
			params.put("",subCall.getParams().get(i));
		}
		
		//create new context
		InterpreterUtils.newClosure();
		
		//push parameters in new context
		for(Entry<String, Value> entry : params.entrySet()){
			InterpreterUtils.setVar(entry.getKey(), entry.getValue());
		}
			
		//execute actions
		for(Action a : subCall.getSubroutine().getActions()){
			processAction(a);
		}
		
		//close context
		InterpreterUtils.finishClosure();
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
			element.sendKeys((String) InterpreterUtils.getValue(a.getValue()));
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
		String url = (String) InterpreterUtils.getValue(urlValue);
		DriverFacade.goTo(url);
	}
	
	private void processPick(Pick a) {
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
