import acm.program.ConsoleProgram;

public class problem31 extends ConsoleProgram {
	public void run() {
		int n = readInt("Enter a positive integer: ");
		int divisors = 0;
		 for (int i = 1; i <= n; i++) {
			 if (n % i == 0) {
	                divisors++;
	            }
		 }
		 if (divisors <= 2) {
				println(n + " is a simple number" );
			} else {
				println (n + " is not a simple number");
			}
	}
}
