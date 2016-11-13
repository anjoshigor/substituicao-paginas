import java.util.ArrayList;
import java.util.List;

public class Lru {
	private int numberOfPageErrors;

	public Lru() {
		this.numberOfPageErrors = 0;
	}

	public int getNumberOfPageErrors() {
		return numberOfPageErrors;
	}

	public void setNumberOfPageErrors(int numberOfPageErrors) {
		this.numberOfPageErrors = numberOfPageErrors;
	}
	
	public void simulate(List<Entries> list, int numberOfFrames){
		boolean found = false;
		
		ArrayList<Entries> stack = new ArrayList<>(numberOfFrames);
		final int BASE = numberOfFrames-1;
		final int TOPO = 0;
		
		for (Entries entry : list) {
			found = false;
			
			for (Entries frame : stack) {
				/**IF FOUND**/
				if (frame.getValue() == entry.getValue()){
					stack.remove(frame);
					stack.add(TOPO,entry);
					found = true;
					break;
				}
			}
			
			/**IF NOT FOUND**/
			if(!found){
				if (stack.size() != numberOfFrames){
					numberOfPageErrors++;
					stack.add(TOPO,entry);
				} else {
					numberOfPageErrors++;
					stack.remove(BASE);
					stack.add(TOPO,entry);
				}
					
			}
			
		}
					
		
		
		System.out.println("LRU "+numberOfPageErrors);
	}
	
}
	

