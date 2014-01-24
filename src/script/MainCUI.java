package script;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import script.exec.MainStaticClassField;
import script.ingredient.factory.MainFactory;
import script.ingredient.type.Ingredient;


public class MainCUI {

	
	public static void main(String[] args) throws IOException {
		MainCUI main = new MainCUI();
		main.scan();
		
	}
	
	public void scan() throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		MainFactory factory = MainFactory.getInstance();
		MainStaticClassField mainField = MainStaticClassField.getInstance();
		
		while (true) {
			String lineCommand = br.readLine();
			if (lineCommand.equals("exit")) {
				break;
			}
			
			List<Ingredient> commandList = factory.command_parseToIngredience(lineCommand);
			if (commandList != null) {
				Ingredient result = commandList.get(0).calc(commandList);
//				System.out.println("Result : "+result);
			} else {
				System.err.println("info : illigal command.");
			}
		}
	}
	
}
