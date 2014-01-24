package script.ingredient.object.value;

import java.util.ArrayList;
import java.util.List;

import script.ingredient.object.IngredientObj;
import script.ingredient.type.Ingredient;
import script.ingredient.type.OperationType;
import script.ingredient.type.ValueType;
import script.ingredient.type.VariableType;

public abstract class Val_Core extends IngredientObj implements ValueType{

	public Val_Core(String matchstr) {
		super(matchstr);
	}

	@Override
	public List<Ingredient> interpret(List<Ingredient> commandList) {
		if (commandList.size()<=1) {
			return commandList;
		}

		int index = commandList.indexOf(this);
		if (index+2<commandList.size()
				&& commandList.get(index+1) instanceof OperationType 
				&& commandList.get(index+2) instanceof ValueType ) {
			OperationType ope = (OperationType)commandList.get(index+1);
			ValueType val2 = (ValueType)commandList.get(index+2);
			ValueType result = ope.operation(this, val2);
			List<Ingredient> list = clone(commandList);
			list.remove(index);
			list.remove(index);
			list.remove(index);
			list.add(index,result);
			return list;
		} else {
			return commandList;
		}
	}
}
