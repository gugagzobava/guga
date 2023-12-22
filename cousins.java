import java.util.HashMap;
import java.util.HashSet;
import java.util.StringTokenizer;

import acm.program.ConsoleProgram;

public class cousins extends ConsoleProgram{
	public void run(){
		HashMap<String, String> map = new HashMap<String, String>();
		while (true) {
			String line = readLine();
			if (line.isEmpty()) {
				break;
			}
			StringTokenizer tokenizer = new StringTokenizer(line);
			String a = tokenizer.nextToken();
			String b = tokenizer.nextToken();
			map.put(b, a);
		}
		for(String a : map.keySet()){
			for(String b : map.keySet()){
				String fatherA = map.get(a);
				String fatherB = map.get(b);
				if(map.get(a).equals(map.get(b))){
					continue;
				}
				if(map.get(fatherA) == null){
					continue;
				}
				if(map.get(fatherA).equals(map.get(fatherB))){
					println(b + "");
				}
			}
		}
	}

}
