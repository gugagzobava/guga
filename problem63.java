import java.util.HashMap;
import java.util.HashSet;
import java.util.StringTokenizer;

import acm.program.ConsoleProgram;

public class problem63 extends ConsoleProgram {
	public void run() {
		HashMap<String, HashSet<String>> map = new HashMap<String, HashSet<String>>();

		while (true) {
			String line = readLine();
			if (line.isEmpty()) {
				break;
			}
			StringTokenizer tokenizer = new StringTokenizer(line);
			String a = tokenizer.nextToken();
			String b = tokenizer.nextToken();
			map.putIfAbsent(b, new HashSet<String>());
			map.get(b).add(a);
		}
		String name = null;
		int ans = 0;
		for(String friend : map.keySet()){
			int amount = map.get(friend).size();
			if(amount > ans){
				ans = amount;
				name = friend;
			}
		}
		println(name);
	}

}
