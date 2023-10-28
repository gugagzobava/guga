import acm.program.ConsoleProgram;

public class problem32 extends ConsoleProgram {
	public void run(){
		println ("Prime numbers below 1000");
		 for (int n = 2; n < 1000; n++) {
	            if (countDivisors(n) == 2) {
	                println(n);
	            }
	        }
	    }

	private int countDivisors(int n) {
		int divisors = 0;
		 for (int i = 1; i <= n; i++) {
			 if (n % i == 0) {
	                divisors++;
			 }
		 }
		 return divisors;
	}
}

