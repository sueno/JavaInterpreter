package script.ingredient.type;

public interface OperationType extends Ingredient{
	ValueType operation(ValueType var1, ValueType val2);
}

