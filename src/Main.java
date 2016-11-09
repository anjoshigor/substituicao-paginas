import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


public class Main {
	
	
	public static void main(String[] args) {
		int numberOfFrames = 0;
		List<Entries> entriesList = new ArrayList<>();
		
	    //Getting input from terminal
	    try {
	        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
	        String x;
	        numberOfFrames = Integer.parseInt(input.readLine());
	        
	        while( (x = input.readLine()) != null ) {
	        	  entriesList.add(new Entries(Integer.parseInt(x)));
	          }
	        } catch (IOException e) {
	            e.getMessage();
	      
	        }
	    /*
	    findOccurences(entriesList);
	    printList(entriesList);
	    */
	    
	    Fifo fifoAlgo = new Fifo();
	    fifoAlgo.simulate(entriesList, numberOfFrames);
	    
	}
	
	/**
	 * Looks for all entries occurrences and populates the netUse attribute field
	 * **/
	private static void findOccurences(List<Entries> list){
		Entries currentEntry;
		
		for (int i = 0; i < list.size(); i++) {
			
			currentEntry = list.get(i);
			int lookFor = currentEntry.getValue();
			
			for (int j = i+1; j < list.size(); j++) {
				
				if(list.get(j).getValue() == lookFor)
					currentEntry.getNextUse().add(j);
			}
			
		}
		
	}
	
	
	/**
	 * Prints the two Entries attributes
	 * **/
	private static void printList(List<Entries> list){
		for (Entries entries : list) {
			System.out.print(entries.getValue()+" ");
			
			for (Integer next : entries.getNextUse()) {
				System.out.print(next+" ");
			}
			
			System.out.println("");
		}
	}

}
