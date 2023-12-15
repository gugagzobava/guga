import java.util.ArrayList;
import java.util.HashMap;

import acm.program.ConsoleProgram;

public class hashampExamples extends ConsoleProgram{
	public void run(){
		HashMap <String,Integer> hashMap = new HashMap<String,Integer>();
		ArrayList <Integer> arrayList = new ArrayList<Integer>();
		hashMap.put("ABDD", 2000);
		hashMap.put("ABC", 3000);
		if(!hashMap.containsKey(key)){
			hashMap.put(key, value);
		}
		hashMap.putIfAbsent(key, value);
		
		hashMap.getOrDefault(key, 0);
		hashMap.get(key);
		
		for (String x : hashMap.keySet()){
			println(x + "" + hashMap.get(x));
		}
//		println(hashMap.size());
		println(hashMap.toString());
	}

}
