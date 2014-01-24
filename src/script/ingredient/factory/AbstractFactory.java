package script.ingredient.factory;

import script.ingredient.type.Ingredient;

public abstract class AbstractFactory implements IngredientFactory {

	Ingredient instance;

	@Override
	public Ingredient newInstance() {
		return instance;
	}
	
	
}
