import acm.program.ConsoleProgram;

public class problem24 extends ConsoleProgram{
	public void run(){
		int n = readInt("Enter n: ");
		int divisors = 0;
		 for (int i = 1; i <= n; i++) {
			 if (n % i == 0) {
	                divisors++;
	            }
			 println( divisors );
		
		
		
		
		 }	
	}

	}
