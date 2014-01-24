package script.ingredient.object.syntax;

import java.util.List;

import script.ingredient.object.IngredientObj;
import script.ingredient.type.Ingredient;
import script.ingredient.type.OperationType;
import script.ingredient.type.SyntaxType;
import script.ingredient.type.ValueType;
import script.ingredient.type.VariableType;

public class Stx_Equal extends IngredientObj implements SyntaxType {

	public Stx_Equal() {
		super("=");
	}

	@Override
	public List<Ingredient> interpret(List<Ingredient> commandList) {
		return null;
	}

	@Override
	public int getBlockScopeIndex(List<Ingredient> commandList, int startIndex) {
		return commandList.size();
	}

}
