package org.joclal.browserautomation.interpreter.utils;

import java.util.HashMap;

import org.joclal.browserAutomation.*;

public class InterpreterUtils {
	
	public static HashMap<String, Value> varList = new HashMap<>();

	public static String getValue(Value v){
		if(v.getString() != null){
			return v.getString();
		}else if(v.getVariable() != null){
			return getValue(v.getVariable());
		}else{
			return null;
		}
	}
	
	public static String getValue(VariableId v){
		return getValue(varList.get(v.getName()));
	}

	public static void setVar(Let let) {
	Value v = null;
		if(let.getValue().getSelector() != null && varList.containsKey(let.getValue().getSelector().getHaydies().get(0))){
			//referenced value
			v = varList.get(let.getValue().getSelector().getHaydies().get(0));
		}else{
			//classical value
			v = let.getValue().getValue();
		}
		varList.put(let.getId().getName(), v);
	}
	
}
