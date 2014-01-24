package script.ingredient.type;

public interface ValueType extends Ingredient{
	Object getValue();
	ValueType getValueType();
}
