package script.ingredient.object;

import java.util.List;

import script.ingredient.type.ClassType;
import script.ingredient.type.Ingredient;

public class Cls_Class extends IngredientObj implements ClassType {

	public Cls_Class(String matchstr) {
		super(matchstr);
	}

	@Override
	public List<Ingredient> interpret(List<Ingredient> commandList) {
		// TODO Auto-generated method stub
		return null;
	}

}
