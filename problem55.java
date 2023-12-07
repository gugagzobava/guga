import java.util.Arrays;

import acm.program.ConsoleProgram;

public class problem55 extends ConsoleProgram {
	public void run() {
		int n = readInt("Enter amount of numbers: ");
		int[] numbers = new int[n];
		for (int i = 0; i < n; i++) {
			numbers[i] = readInt();
		}
		Arrays.sort(numbers);
	
	  for (int i = 0; i < n; i++) {
          println(numbers[i]);
	  }
}
}
