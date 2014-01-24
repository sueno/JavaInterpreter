package script.ingredient.factory;

import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import script.classes.ClassObj;
import script.classes.IScope;
import script.ingredient.object.value.Val_Integer;

public class Val_Integer_Factory extends AbstractFactory{

	@Override
	public String parse(IScope curenntScope, String command) {
		Matcher m = Pattern.compile("^[\\d]+").matcher(command);
		if (m.find()&&!command.startsWith("[0-9]+\\.")) {
			String matchValue = m.group();
			instance = new Val_Integer(matchValue);
			return command.substring(matchValue.length());
		}
		return null;
	}

}
