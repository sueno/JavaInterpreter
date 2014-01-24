package script.classes;

import java.util.Map;

import script.ingredient.type.ClassType;
import script.ingredient.type.MethodType;
import script.ingredient.type.ValueType;
import script.ingredient.type.VariableType;

public interface IClass extends IScope {
	
	ClassType getClassType();
	
	boolean setField(VariableType key, ValueType value);
	ValueType getField(VariableType key);
	
	boolean setMethod(MethodType value);
	MethodType getMethod(String key);
	
	ValueType callMethod(IObject object, MethodType method, ValueType... param);
	
}
