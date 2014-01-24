package script.ingredient.object.operation;

import java.util.List;

import script.ingredient.type.Ingredient;
import script.ingredient.type.SingleType;
import script.ingredient.type.OperationType;
import script.ingredient.type.ValueType;
import script.ingredient.type.VariableType;

public class Ope_Plus extends Ope_Core{

	public Ope_Plus() {
		super("+");
	}

	@Override
	public List<Ingredient> interpret(List<Ingredient> commandList) {
		List<Ingredient> list = cloneStartToIndex(commandList, 1);
		return list;
	}

	@Override
	protected Double numCalc(Double val1, Double val2) {
		return val1 + val2;
	}

}
