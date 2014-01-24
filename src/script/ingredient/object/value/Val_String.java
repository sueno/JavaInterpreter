package script.ingredient.object.value;

import java.util.List;

import script.ingredient.type.Ingredient;
import script.ingredient.type.StringType;
import script.ingredient.type.ValueType;

public class Val_String extends Val_Core implements StringType {

	String str;
	
	public Val_String(String matchstr) {
		super(matchstr);
		str = matchstr;
	}

	@Override
	public Object getValue() {
		return str;
	}

	@Override
	public ValueType getValueType() {
		return this;
	}

}
