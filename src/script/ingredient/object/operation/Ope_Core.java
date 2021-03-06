package script.ingredient.object.operation;

import java.util.List;

import script.ingredient.object.IngredientObj;
import script.ingredient.object.value.Val_Single;
import script.ingredient.object.value.Val_String;
import script.ingredient.type.Ingredient;
import script.ingredient.type.OperationType;
import script.ingredient.type.SingleType;
import script.ingredient.type.ValueType;

public abstract class Ope_Core extends IngredientObj implements OperationType {
	
	public Ope_Core(String matchstr) {
		super(matchstr);
	}

	@Override
	public ValueType operation(ValueType val1, ValueType val2) {
		if (val1 != null && val2 != null) {
			if (val1.getValueType() instanceof SingleType && val2.getValueType() instanceof SingleType) {
				Double result = numCalc(((SingleType)val1.getValueType()).getSingle(), ((SingleType)val2.getValueType()).getSingle());
				return new Val_Single(result);
			} else {
				return new Val_String(objCalc(val1.getValue(), val2.getValue()));
			}
		} else {
			return null;
		}
	}

	protected abstract Double numCalc (Double val1, Double val2);
	
	protected String objCalc (Object val1, Object val2) {
		return val1 + "" + val2;
		
	}
}
