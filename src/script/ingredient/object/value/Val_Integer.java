package script.ingredient.object.value;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import script.ingredient.type.Ingredient;
import script.ingredient.type.SingleType;
import script.ingredient.type.ValueType;

public class Val_Integer extends Val_Core implements SingleType{

	Integer num;
	
	public Val_Integer(String matchstr) {
		super(matchstr);
		num = Integer.valueOf(matchstr);
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
