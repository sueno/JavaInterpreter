package script.classes;

import java.util.HashMap;
import java.util.Map;

import script.ingredient.factory.Val_Integer_Factory;
import script.ingredient.type.ClassType;
import script.ingredient.type.MethodType;
import script.ingredient.type.ValueType;
import script.ingredient.type.VariableType;

public class ClassObj implements IClass {

	private ClassType classType;

	private Map<VariableType, ValueType> variableMap = new HashMap<VariableType, ValueType>();
	//private Map<String, MethodType> methodMap = new HashMap<String, MethodType>();
	
	@Override
	public ClassType getClassType() {
		return classType;
	}

	@Override
	public boolean setField(VariableType key, ValueType value) {
		if (!variableMap.containsKey(key)) {
			variableMap.put(key, value);
			return true;
		} else {
			return false;
		}
	}

	@Override
	public ValueType getField(VariableType key) {
		return variableMap.get(key);
	}
	
	@Override
	public boolean setMethod(MethodType value) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public MethodType getMethod(String key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ValueType callMethod(IObject object, MethodType method, ValueType... argument) {
		// TODO Auto-generated method stub
		return null;
	}
}
