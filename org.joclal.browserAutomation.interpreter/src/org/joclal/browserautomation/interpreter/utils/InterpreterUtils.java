package org.joclal.browserautomation.interpreter.utils;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

import org.joclal.browserAutomation.*;

public class InterpreterUtils {
	
	private static Stack<Map<String, Value>> varStack = new Stack<>();
	private static HashMap<String, Value> currentVars = new HashMap<>();

	public static Object getValue(Value v){
		if(v.getString() != null){
			return v.getString();
		}else if(v.getVariable() != null){
			return getValue(v.getVariable());
		}else{
			return v.getInt();
		}
	}
	
	public static void setValue(Value v, Object val){
		if(v.getString() != null && val instanceof String){
			v.setString((String) val);
		}else if(v.getVariable() != null){
			setValue(currentVars.get(v.getVariable().getName()), val);
		}else{
			v.setInt((int) val);
		}
	}
	
	public static Object getValue(VariableId v){
		return getValue(currentVars.get(v.getName()));
	}

	public static void setVar(Let let) {
		Value v = null;
		if(let.getValue().getSelector() != null && currentVars.containsKey(let.getValue().getSelector().getId())){
			//referenced value
			v = currentVars.get(let.getValue().getSelector().getId());
		}else{
			//classical value
			v = let.getValue().getValue();
		}
		//currentVars.put(let.getId().getName(), v);
		setVar(let.getId().getName(), v);
	}
	
	public static void setVar(String name, Value value){
		/*Value v = null;
		if(value.getVariable() != null && currentVars.containsKey(value.getVariable().getName())){
			//referenced value
			v = currentVars.get(value.getVariable().getName());
		}else{
			//classical value
			v = value;
		}*/
		currentVars.put(name, value);
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
			case Operator.GT_VALUE:
				if (getValue(left) instanceof Integer && getValue(right) instanceof Integer){
					return (Integer) getValue(left) > (Integer) getValue(right);
				} else {
					throw new UnsupportedOperationException("You can't compare those objects");
				}
			case Operator.LT_VALUE:
				if (getValue(left) instanceof Integer && getValue(right) instanceof Integer){
					return (Integer) getValue(left) < (Integer) getValue(right);
				} else {
					throw new UnsupportedOperationException("You can't compare those objects");
				}
			case Operator.GTE_VALUE:
				if (getValue(left) instanceof Integer && getValue(right) instanceof Integer){
					return (Integer) getValue(left) >= (Integer) getValue(right);
				} else {
					throw new UnsupportedOperationException("You can't compare those objects");
				}
			case Operator.LTE_VALUE:
				if (getValue(left) instanceof Integer && getValue(right) instanceof Integer){
					return (Integer) getValue(left) <= (Integer) getValue(right);
				} else {
					throw new UnsupportedOperationException("You can't compare those objects");
				}
			default:
				throw new UnsupportedOperationException("You can't compare those objects");
		}
	}

	public static Object processArithmeticExp(ArithmeticExp operation) {
		return processArithmeticExp(operation.getLeftMember(), operation.getArithmetic(), operation.getRightMember());
	}

	private static Object processArithmeticExp(Value leftMember, Arithmetic arithmetic, Value rightMember) {
		switch(arithmetic.getValue()){
		case Arithmetic.SUM_VALUE:
			return (Integer) getValue(leftMember) + (Integer) getValue(rightMember);
		case Arithmetic.SUB_VALUE:
			return (Integer) getValue(leftMember) - (Integer) getValue(rightMember);
		}
		return null;
	}

	public static String toString(Object value) {
		if (value instanceof String){
			return ((String) value);
		} else if (value instanceof Integer){
			return (Integer.toString((Integer) value));
		} else {
			throw new UnsupportedOperationException("You can't cast value to String");
		}
	}

}
