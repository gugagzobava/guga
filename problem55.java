import java.util.Arrays;

import acm.program.ConsoleProgram;

public class problem55 extends ConsoleProgram {
	public void run() {
		int n = readInt("Enter amount of numbers: ");
		int[] numbers = new int[n];
		for (int i = 0; i < n; i++) {
			numbers[i] = readInt();
		}
		if (isSorted(numbers)) {
            println("The numbers are sorted.");
        } else {
            println("The numbers are not sorted.");
        }

	}

	private boolean isSorted(int[] numbers) {
		for(int i = 1; i < numbers.length; i++){
			if(numbers[i - 1] > numbers[i]){
				return false;
			}
		}
		return true;
	}
}
