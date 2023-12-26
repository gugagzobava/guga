import java.util.HashMap;
import java.util.Map;

import acm.program.ConsoleProgram;

public class bonusWinner extends ConsoleProgram {
	public void run() {

	}

	private String winner(Map<String, Integer> results) {
		Map<Integer, Integer> frequencyMap = new HashMap<>();
		for (int result : results.values()) {
			frequencyMap.put(result, frequencyMap.getOrDefault(results, 0) + 1);
		}
		String winner = null;
		for(String student : results.keySet()){
			int result = results.get(student);
			if(frequencyMap.get(result) == 1){
				if(winner == null ||results.get(winner) > result){
					winner = student;
				}
			}
		}

		return winner;
	}
}
