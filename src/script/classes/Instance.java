package script.classes;

import java.util.HashMap;
import java.util.Map;

import script.ingredient.type.ClassType;
import script.ingredient.type.MethodType;
import script.ingredient.type.ValueType;
import script.ingredient.type.VariableType;

public class Instance implements IObject{


	private ClassType classType;

	private Map<VariableType, ValueType> fieldMap = new HashMap<VariableType, ValueType>();
	//private Map<String, MethodType> methodMap = new HashMap<String, MethodType>();
	
	@Override
	public ClassType getClassType() {
		return classType;
	}

	@Override
	public boolean setField(VariableType key, ValueType value) {
		fieldMap.put(key, value);
		return true;
	}

	@Override
	public ValueType getField(VariableType key) {
		return fieldMap.get(key);
	}

	@Override
	public ValueType callMethod(MethodType method, ValueType... params) {
		// TODO Auto-generated method stub
		return null;
	}

}
