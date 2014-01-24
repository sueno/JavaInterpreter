package script.ingredient.object.operation;

import java.util.List;

import script.ingredient.type.Ingredient;

public class Ope_Division extends Ope_Core {

	public Ope_Division() {
		super("/");
	}

	@Override
	public List<Ingredient> interpret(List<Ingredient> commandList) {
		return null;
	}

	@Override
	protected Double numCalc(Double val1, Double val2) {
		return val1 / val2;
	}

}
