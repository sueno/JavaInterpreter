package script.ingredient.object;

import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;

import script.ingredient.type.Ingredient;

public abstract class IngredientObj implements Ingredient{

	protected String matchStr;
	
	public IngredientObj(String matchstr) {
		this.matchStr = matchstr;
	}
	@Override
	public Ingredient calc(List<Ingredient> commandList) {
		if (commandList == null) {
			return null;
		}
		
		List<Ingredient> commandObj = clone(commandList);
		int size = -1;
		while (commandObj!=null && 1<commandObj.size() && size!=commandObj.size() && commandObj.size()!=1) {
			size = commandObj.size();
			commandObj = commandObj.get(0).interpret(commandObj);
		}
		if (commandObj!=null && commandObj.size()==1) {
			return commandObj.get(0);
		} else {
			return null;
		}
	}

	
	@Override
	public String toString() {
		return matchStr;
	}
	
	@Override
	public int hashCode() {
		return toString().hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		return this.hashCode() == obj.hashCode();
	}

	protected List<Ingredient> clone(List<Ingredient> commandList) {
		return cloneSubIndex(commandList, 0, commandList.size());
	}
	
	protected List<Ingredient> cloneStartToIndex(List<Ingredient> commandList, int startIndex) {
		return cloneSubIndex(commandList, startIndex, commandList.size());
	}

	protected List<Ingredient> cloneEndToIndex(List<Ingredient> commandList, int lastIndex) {
		return cloneSubIndex(commandList, 0, lastIndex);
	}
	
	protected List<Ingredient> cloneSubIndex(List<Ingredient> commandList, int startIndex, int lastIndex) {
		if (startIndex<0 || commandList.size()<=startIndex || lastIndex < startIndex 
			|| lastIndex<1 || commandList.size()<lastIndex) {
			return null;
		}
		List<Ingredient> list = new ArrayList<Ingredient>();
		for (int i=startIndex; i<lastIndex; i++) {
			list.add(commandList.get(i));
		}
		return list;
	}
	
}
