import acm.program.ConsoleProgram;

public class problem25 extends ConsoleProgram {
	public void run(){
		int a = readInt("enter first number: ");
		int b = readInt("enter second number: ");
		 int lcd = calculateLCD(a, b);
		 println (lcd);
		
	}

	public static int calculateLCD(int a, int b) {
		return (a*b)/calculateGCD(a,b);
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
