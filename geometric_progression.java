import acm.program.ConsoleProgram;

public class geometric_progression extends ConsoleProgram {
	public void run() {
		int b1 = readInt();
		int b2 = readInt();
		int q = b2 / b1;
		boolean check = true;
		while(true){
			b1 = b2;
			b2 = readInt();
			if(b2 != b1 * q){
				check = false;
			}
			if(b2 == -1){
				break;
			}
		}
		if (check){
			println("progresia");
		} else {
			println("ara");
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