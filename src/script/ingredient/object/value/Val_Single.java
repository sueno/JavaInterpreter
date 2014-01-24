package script.ingredient.object.value;

import script.ingredient.type.SingleType;
import script.ingredient.type.ValueType;

public class Val_Single extends Val_Core implements SingleType {

	Double num;
	
	public Val_Single(String matchstr) {
		super(matchstr);
		num = Double.parseDouble(matchstr);
	}
	
	public Val_Single(Double num) {
		super(num+"");
		this.num = num;
	}
	
	@Override
	public Object getValue() {
		if (num%1.0 == 0) {
			return new Integer((int)(num*1));
		} else {
			return num;
		}
	}


	@Override
	public Double getSingle() {
		return num;
	}

	@Override
	public ValueType getValueType() {
		return this;
	}
}
