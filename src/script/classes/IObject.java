package script.classes;

import script.ingredient.type.ClassType;
import script.ingredient.type.MethodType;
import script.ingredient.type.ValueType;
import script.ingredient.type.VariableType;

public interface IObject extends IScope {
	ClassType getClassType();
	
	boolean setField(VariableType key, ValueType value);
	ValueType getField(VariableType key);
	
	ValueType callMethod(MethodType method, ValueType... params);
}
