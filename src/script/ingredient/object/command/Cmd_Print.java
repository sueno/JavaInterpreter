package script.ingredient.object.command;

import java.util.List;

import script.ingredient.object.IngredientObj;
import script.ingredient.type.CommandType;
import script.ingredient.type.Ingredient;
import script.ingredient.type.ObjectType;
import script.ingredient.type.OperationType;
import script.ingredient.type.ValueType;
import script.ingredient.type.VariableType;

public class Cmd_Print extends IngredientObj implements CommandType {

	public Cmd_Print() {
		super("print");
	}

	@Override
	public List<Ingredient> interpret(List<Ingredient> commandList) {
		int index = commandList.indexOf(this);
		List<Ingredient> newList = cloneStartToIndex(commandList, index+1);
		if (newList != null) {
			Ingredient result = calc(newList);
			if (result != null && result instanceof ValueType) {
				System.out.println(""+((ValueType)result).getValue());
			}
		}
		return cloneEndToIndex(commandList, index);
	}

}
