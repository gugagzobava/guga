import acm.program.ConsoleProgram;

public class geometric_progression extends ConsoleProgram {
	public void run() {

		int b1 = readInt();
		if (b1 == -1) {
			println("progresia");
		}

		int b2 = readInt();

		int q = b2 / b1;

		while (true) {
			 if (b2 == -1 && q == b2 / b1 ) {
	                println("It is a geometric progression.");
	                break;
	            }

	            
			b1 = b2;
			b2 = readInt("");
		}
		if (b2 != b1 * q) {
            println("Not a geometric progression.");
          //  break;
        }

	}
}