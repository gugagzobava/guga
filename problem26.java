import acm.program.ConsoleProgram;

public class problem26 extends ConsoleProgram {
	public void run(){
		int a = readInt("enter first number: ");
		int b = readInt("enter second number: ");
		 int gcd = calculateGCD(a, b);
		 println (gcd);
		
	}
	public static int calculateGCD(int a, int b) {
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        return a;

	}
}
