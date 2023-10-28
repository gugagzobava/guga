import acm.program.ConsoleProgram;

public class problem30 extends ConsoleProgram {
	public void run() {
		int n = readInt("Enter a positive integer: ");
		int result = 0;
		while (n != 0){
			int number = n % 10;
			result = result * 10 + number;
			n /= 10;
		}
		println ("Reversed number is: " + result);
	}
}
