package script.ingredient.factory;

import script.classes.ClassObj;
import script.classes.IScope;
import script.ingredient.object.operation.Ope_Minus;
import script.ingredient.object.operation.Ope_Plus;
import script.ingredient.type.Ingredient;

public class Ope_Minus_Factory extends AbstractFactory{
	
	@Override
	public String parse(IScope curenntScope, String command) {
		if (command.startsWith("-")) {
			instance = new Ope_Minus();
			return command.substring(1);
		}
		return null;
	}
}
