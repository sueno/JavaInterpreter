package script.exec;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

import script.classes.ClassObj;
import script.classes.IObject;
import script.classes.Instance;
import script.ingredient.type.ClassType;
import script.ingredient.type.Ingredient;
import script.ingredient.type.MethodType;
import script.ingredient.type.ValueType;
import script.ingredient.type.VariableType;

public class MainStaticClassField {
	
	private static MainStaticClassField mainStaticClassField = new MainStaticClassField(); 
	
	private MainStaticClassField() {
	}
	
	//@TODO add 
	private Map<ClassType, ClassObj> classMap = new HashMap<ClassType, ClassObj>();
	
	public boolean addClass(ClassType key, ClassObj value) {
		if (!classMap.containsKey(key)) {
			classMap.put(key, value);
			return true;
		} else {
			return false;
		}
	}
	
	public ClassObj getClass(ClassType key) {
		return classMap.get(key);
	}

	private Stack<IObject> stackObject = new Stack<IObject>();
	
	public boolean pushObject(IObject object) {
		stackObject.push(object);
		return true;
	}
	
	public IObject popObject() {
		return stackObject.pop();
	}
	
	public static MainStaticClassField getInstance() {
		return mainStaticClassField;
	}
}
