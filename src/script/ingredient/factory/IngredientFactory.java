package script.ingredient.factory;

import script.classes.ClassObj;
import script.classes.IScope;
import script.ingredient.type.Ingredient;

public interface IngredientFactory {
	String parse(IScope curenntScope, String command);
	Ingredient newInstance();
}
