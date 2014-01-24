package script.ingredient.type;

import java.util.List;

public interface SyntaxType extends Ingredient {
	int getBlockScopeIndex(List<Ingredient> commandList, int startIndex);
	
}
