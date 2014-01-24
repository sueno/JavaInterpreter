package script.ingredient.factory;

import script.classes.ClassObj;
import script.classes.IScope;
import script.ingredient.object.syntax.Stx_Equal;

public class Ope_Equal_Factory extends AbstractFactory{

	@Override
	public String parse(IScope curenntScope, String command) {
		if (command.startsWith("=")&&!command.startsWith("==")) {
			instance = new Stx_Equal();
			return command.substring(1);
		}
		return null;
	}

}
