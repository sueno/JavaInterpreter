package script.ingredient.type;

import java.util.List;

public interface Ingredient {
	List<Ingredient> interpret(List<Ingredient> commandList);
	Ingredient calc(List<Ingredient> commandList);
}
