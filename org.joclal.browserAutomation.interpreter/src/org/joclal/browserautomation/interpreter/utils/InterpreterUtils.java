package org.joclal.browserautomation.interpreter.utils;

import java.util.HashMap;

import org.joclal.browserAutomation.*;

public class InterpreterUtils {
	
	public static HashMap<String, String> varList = new HashMap<>();

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
		return varList.get(v.getName());
	}
	
}
