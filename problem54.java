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
        		largest = secondLargest;
        		curr[i] = largest;     		
        	}
        	if(curr[i] > secondLargest && curr[i] < largest){
        		curr[i] = secondLargest;
        	}
        }
        println(largest + "and" + secondLargest + "are biggest numbers");
	}

}
