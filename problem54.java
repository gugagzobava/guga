import acm.program.ConsoleProgram;

public class problem54 extends ConsoleProgram{
	public void run() {
		int n = readInt("Enter amount of numbers: ");
		int[] curr = new int[n];
		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
        	curr[i] = readInt();
        	if(curr[i] > largest){
        		secondLargest = largest;
        		largest = curr[i];     		
        	}
        	if(curr[i] > secondLargest && curr[i] < largest){
        		secondLargest = curr[i];
        	}
        }
        println(largest + "and" + secondLargest + "are biggest numbers");
	}

}
