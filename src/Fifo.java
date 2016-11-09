import java.util.List;

import org.apache.commons.collections4.queue.CircularFifoQueue;


public class Fifo {
	private int numberOfPageErrors;

	public Fifo() {
		this.numberOfPageErrors = 0;
	}

	public int getNumberOfPageErrors() {
		return numberOfPageErrors;
	}

	public void setNumberOfPageErrors(int numberOfPageErrors) {
		this.numberOfPageErrors = numberOfPageErrors;
	}
	
	public void simulate(List<Entries> list, int numberOfFrames){
		CircularFifoQueue<Entries> frames = new CircularFifoQueue<Entries>(numberOfFrames);
		boolean found;
		
		for (Entries entryOnList : list) {
			found = false;
			
			for (Entries entryOnFrame : frames) {
				
				if(entryOnList.getValue() == entryOnFrame.getValue()){
					found = true;
					break;
				}
			}
			
			if(!found){
				numberOfPageErrors++;
				frames.add(entryOnList);
			}
		}
		
		System.out.println("FIFO "+numberOfPageErrors);
	}
	
}
