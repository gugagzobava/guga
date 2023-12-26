import java.util.HashMap;
import java.util.Map;

import acm.program.ConsoleProgram;

public class bonusWinner extends ConsoleProgram{
	public void run(){
		
	}
	private String winner(Map <String, Integer> results){
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        	for(String result : results.values()){
        		frequencyMap.put(result, frequencyMap.getOrDefault(results,  0) + 1);
        			
        		}
        		
        	
		return null;
	}
}
	