import acm.program.ConsoleProgram;

public class geometric_progression extends ConsoleProgram{
	public void run(){
		int b1 = readInt();
		int b2 = readInt();
		while(b1 != -1){
			 b1 = readInt("Enter the first term (b1): ");
	            b2 = readInt("Enter the second term (b2): ");
	        }

	        int q = 0; // Initialize q with some value (you might want to use readInt to get q)
	        if (q == b2 / b1) {
	            println("Geometric progression");
	        } else {
	            println("Not a geometric progression");
	        }
		}
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
