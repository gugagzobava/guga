import acm.program.ConsoleProgram;

public class geometric_progression extends ConsoleProgram{
	public void run(){
		
	        int b1 = readInt();
	        if (b1 == -1) {
	            println("progresia");
	        }

	        int b2 = readInt();

	        int q = b2 / b1;

	        while (b2 != -1) {
	            if (b2 != b1 * q) {
	                println("Not a geometric progression.");
	            }

	            b1 = b2;
	            b2 = readInt("");
	        }
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
