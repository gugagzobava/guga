import java.util.HashMap;

import acm.program.ConsoleProgram;

public class problem61 extends ConsoleProgram {
	public void run() {
		int m = readInt();
		int n = readInt();
		int[] array = new int[n];
		for (int i = 0; i < n; i++) {
			array[i] = readInt();
		}
		boolean found = false;
		HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
		for (int i = 0; i < n; i++) {
			if (hashMap.containsKey(m - array[i])) {

				found = true;
				println(array[i] + " " + (m - array[i]));
				break;
			}
		//	hashMap.put(array[i], i);
		}

		if (!found) {
			println("Not found");
		}
	}

}
