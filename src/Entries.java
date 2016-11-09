import java.util.ArrayList;

/**
 * 
 *  @author anjoshigor
 *  
 * **/

/**
 * @class Entries
 * @description a model class for the entries
 * @attributes
 * value - the real value of the entries
 * nextUse - a list with the indices of the next occurrences
 * **/

public class Entries {
	private int value;
	private ArrayList<Integer> nextUse;
	
	public Entries(int value) {
		this.value = value;
		this.nextUse = new ArrayList<>();
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public ArrayList<Integer> getNextUse() {
		return nextUse;
	}

	public void setNextUse(ArrayList<Integer> nextUse) {
		this.nextUse = nextUse;
	}


}
