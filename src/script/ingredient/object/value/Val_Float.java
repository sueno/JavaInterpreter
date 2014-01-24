package script.ingredient.object.value;

import java.util.List;

import script.ingredient.type.Ingredient;
import script.ingredient.type.SingleType;
import script.ingredient.type.ValueType;

public class Val_Float extends Val_Core implements SingleType{

	Float num;
	
	protected Val_Float(String matchstr) {
		super(matchstr);
		num = Float.valueOf(matchstr);
	}
	
	@Override
	public Object getValue() {
		return num;
	}

	@Override
	public Double getSingle() {
		return num*1.0;
	}

	@Override
	public ValueType getValueType() {
		return this;
	}
	
}
