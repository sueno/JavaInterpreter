package script.ingredient.factory;

import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import script.classes.ClassObj;
import script.classes.IScope;
import script.ingredient.object.value.Val_Integer;
import script.ingredient.object.value.Val_String;

public class Val_String_Factory extends AbstractFactory{

	@Override
	public String parse(IScope curenntScope, String command) {
		Matcher m = Pattern.compile("^\\\".*\\\"").matcher(command);
		if (m.find()) {
			String matchValue = m.group();
			instance = new Val_String(matchValue.substring(1,matchValue.length()-1));
			return command.substring(matchValue.length());
		}
		return null;
	}

}
