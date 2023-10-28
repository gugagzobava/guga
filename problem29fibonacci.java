import acm.program.ConsoleProgram;

public class problem29fibonacci extends ConsoleProgram {
	public void run(){
		int n = readInt("Enter a positive integer: ");
		int answer = calculateFibonacci(n);
		println("Fibonacci number is " + answer);
		
		
	}
	private int calculateFibonacci(int n) {
	int first = 0;
	int second = 1;
	int answer = 0;
	
	if (n == 0){
		answer = first;
	} else if (n == 1){
		answer = second;
		
	} else {
		for (int i = 2; i <= n; i++){
			answer = first + second;
			first = second;
			second = answer;
			
		}
	}	
	return answer;
}
}
