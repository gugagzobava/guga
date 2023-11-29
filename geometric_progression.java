import acm.program.ConsoleProgram;

public class geometric_progression extends ConsoleProgram{
	public void run(){
		
	        int b1 = readInt("Enter the first term (or -1 to exit): ");
	        if (b1 == -1) {
	            println("You entered -1 without providing initial terms. Exiting.");
	            return;
	        }

	        int b2 = readInt("Enter the second term: ");

	        // Infer the common ratio (q) based on the first two terms
	        int q = (b2 != 0) ? b2 / b1 : 0;

	        while (b2 != -1) {
	            if (q == 0) {
	                println("The common ratio cannot be zero. Exiting.");
	                return;
	            }

	            if (b2 != b1 * q) {
	                println("Not a geometric progression.");
	                return;
	            }

	            b1 = b2;
	            b2 = readInt("Enter the next term (or -1 to exit): ");
	        }

	        // Check for geometric progression when -1 is entered
	        println("It is a geometric progression.");
	    }
	
//		int b1 = readInt();
//		int b2 = readInt();
//		while(b1 != -1){
//			b1 = b2;		
//		}
//		
//		int q;
//		if(q == b2 / b1){
//			println("progresia");
//		}
//	}
//	

}
