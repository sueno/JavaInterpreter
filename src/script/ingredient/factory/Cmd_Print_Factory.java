package script.ingredient.factory;

import script.classes.IScope;
import script.ingredient.object.command.Cmd_Print;

public class Cmd_Print_Factory extends AbstractFactory{
	
	@Override
	public String parse(IScope curenntScope, String command) {
		if (command.startsWith("print")) {
			instance = new Cmd_Print();
			return command.substring(5);
		}
		return null;
	}
}
