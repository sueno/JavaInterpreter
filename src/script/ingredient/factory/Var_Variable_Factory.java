package script.ingredient.factory;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import script.classes.ClassObj;
import script.classes.IScope;
import script.ingredient.object.Var_Variable;

public class Var_Variable_Factory extends AbstractFactory {

	@Override
	public String parse(IScope currentScope, String command) {
		Matcher m = Pattern.compile("^[\\w\\d\\$]+").matcher(command);
		if (m.find()) {
			String matchValue = m.group();
			instance = new Var_Variable(currentScope, matchValue);
			return command.substring(matchValue.length());
		}
		return null;
	}

}
