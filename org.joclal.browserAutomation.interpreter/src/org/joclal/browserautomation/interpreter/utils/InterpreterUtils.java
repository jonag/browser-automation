package org.joclal.browserautomation.interpreter.utils;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

import org.joclal.browserAutomation.*;

public class InterpreterUtils {
	
	private static Stack<Map<String, Value>> varStack = new Stack<>();
	public static HashMap<String, Value> currentVars = new HashMap<>();

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
		return getValue(currentVars.get(v.getName()));
	}

	public static void setVar(Let let) {
	Value v = null;
		if(let.getValue().getSelector() != null && currentVars.containsKey(let.getValue().getSelector().getHaydies().get(0))){
			//referenced value
			v = currentVars.get(let.getValue().getSelector().getHaydies().get(0));
		}else{
			//classical value
			v = let.getValue().getValue();
		}
		currentVars.put(let.getId().getName(), v);
	}
	
	public static void newClosure(){
		HashMap<String, Value> newVars = new HashMap<>();
		//fill new map with current vars
		for(String key : currentVars.keySet()){
			newVars.put(key, currentVars.get(key));
		}
		varStack.push(currentVars);
		currentVars = newVars;
	}
	
	public static void finishClosure(){
		currentVars = (HashMap<String, Value>) varStack.pop();
	}
	
	public static Boolean processCondition(BooleanExp c){
		return processCondition(c.getLeftMember(), c.getOperator(), c.getRightMember());
	}
	
	public static Boolean processCondition(Value left, Operator op, Value right){
		switch(op.getValue()){
			case Operator.EQUALS_VALUE:
				return getValue(left).equals(getValue(right));
			case Operator.NOT_EQUALS_VALUE:
				return !getValue(left).equals(getValue(right));
			default:
				throw new UnsupportedOperationException("You can't compare String orders");
			/*case Operator.GT_VALUE:
				break;
			case Operator.GTE_VALUE:
				break;
			case Operator.LT_VALUE:
				break;
			case Operator.LTE_VALUE:
				break;*/
		}
	}
	
}
