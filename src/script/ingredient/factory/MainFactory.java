package script.ingredient.factory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

import script.classes.ClassObj;
import script.classes.IObject;
import script.classes.IScope;
import script.classes.Instance;
import script.exec.MainStaticClassField;
import script.ingredient.object.operation.Ope_Division;
import script.ingredient.object.operation.Ope_Minus;
import script.ingredient.object.operation.Ope_Multiplication;
import script.ingredient.type.Ingredient;

public class MainFactory {

	private static MainFactory mainFactory = new MainFactory();
	
	private MainStaticClassField mainStaticClassField;
	private IObject currentScope = new Instance();

	private MainFactory() {
		mainStaticClassField = MainStaticClassField.getInstance();
		mainStaticClassField.pushObject(currentScope);
	}

	private List<IngredientFactory> factoryList = new ArrayList<IngredientFactory>(Arrays.asList(
			new Cmd_Print_Factory(),
			new Ope_Equal_Factory(), new Ope_Plus_Factory(), new Ope_Minus_Factory(), new Ope_Multiplication_Factory(), new Ope_Division_Factory(),
			new Val_Integer_Factory(), new Val_String_Factory(),
			new Var_Variable_Factory()
			));

	public List<Ingredient> command_parseToIngredience(String command) {
		List<Ingredient> commandIngredient = new ArrayList<Ingredient>();
		while (command.length() > 0) {
			int length = command.length();
			for (IngredientFactory factory : factoryList) {
				// ignore space
				command = command.replaceFirst("^\\s+", "");

				String matchStr = factory.parse(currentScope, command);
				if (matchStr != null) {
					command = matchStr;
					Ingredient ingr = factory.newInstance();
					commandIngredient.add(ingr);
					break;
				}
			}
			if (length == command.length()) {
				return null;
			}
		}
		return commandIngredient;
	}

	public static MainFactory getInstance() {
		return mainFactory;
	}

}
