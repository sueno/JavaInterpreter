package script.classes;

import script.ingredient.type.ValueType;
import script.ingredient.type.VariableType;

public interface IScope {

	boolean setField(VariableType key, ValueType value);
	ValueType getField(VariableType key);
	
	//@TODO add method getter&setter
}
