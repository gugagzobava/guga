import acm.program.ConsoleProgram;

public class geometric_progression extends ConsoleProgram {
	public void run() {
int b1 = readInt("Enter the first term (or -1 to exit): ");
        
        if (b1 == -1) {
            println("You need to enter at least two terms.");
            return;
        }

        int b2 = readInt("Enter the second term: ");

        int q = b2 / b1;

        while (true) {
            if (b2 == -1) {
                println("It is a geometric progression.");
                break;
            }

            if (b2 != b1 * q) {
                println("Not a geometric progression.");
                break;
            }

            b1 = b2;
            b2 = readInt("Enter the next term (or -1 to finish): ");
        }
//		int b1 = readInt();
//		if (b1 == -1) {
//			
//		}
//
//		int b2 = readInt();
//
//		int q = b2 / b1;
//
//		while (q == b2 / b1) {
//			 if (b2 == -1) {
//	                println("It is a geometric progression.");
//	                break;
//	            }
//			 if (b2 != b1 * q) {
//		            println("Not a geometric progression.");
//		            break;
//		        }
//
//	            
//			b1 = b2;
//			b2 = readInt("");
//		}
//		

	}
}