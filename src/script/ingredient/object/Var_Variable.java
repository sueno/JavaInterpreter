package script.ingredient.object;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import script.classes.IClass;
import script.classes.IScope;
import script.ingredient.object.syntax.Stx_Equal;
import script.ingredient.object.value.Val_Core;
import script.ingredient.type.Ingredient;
import script.ingredient.type.OperationType;
import script.ingredient.type.ValueType;
import script.ingredient.type.VariableType;

public class Var_Variable extends Val_Core implements VariableType {

	IScope currentScope;
	
	public Var_Variable(IScope currentScope, String matchstr) {
		super(matchstr);
		this.currentScope = currentScope;
	}

	@Override
	public java.util.List<Ingredient> interpret(java.util.List<Ingredient> commandList) {
		List<Ingredient> superExecList = super.interpret(commandList);
		if (commandList.size()!=superExecList.size()) {
			return superExecList;
		}

		if (2<commandList.size()
			&& commandList.get(1) instanceof Stx_Equal 
			&& commandList.get(2) instanceof ValueType ) {
			List<Ingredient> list = cloneStartToIndex(commandList, 2);
			Ingredient result = list.get(0).calc(list);
			if (result != null && result instanceof ValueType) {
				currentScope.setField(this, (ValueType)result);
				return new ArrayList<Ingredient>(Arrays.asList(result));
			}
		} else {
		}
		return null;
	}
	
	@Override
	public Object getValue() {
		ValueType obj = currentScope.getField(this);
		return obj!=null ? obj.getValue():null;
	}

	@Override
	public ValueType getValueType() {
		return currentScope.getField(this);
	}
	
	
}
