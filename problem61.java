import java.util.HashMap;

import acm.program.ConsoleProgram;

public class problem61 extends ConsoleProgram {
	public void run() {
	//	HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
		int m = readInt();
		int n = readInt();
		int[] array = new int[n];
		for (int i = 0; i < n; i++) {
			array[i] = readInt();
		}
		boolean found = false;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < i; j++) {
				if (array[i] == m - array[i]) {
					found = true;
					println(array[i] + " " + array[j]);
					break;
				}
			}
		}
		if(!found){
			println("Not found");
		}
	}

}
