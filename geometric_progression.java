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
				if(b2 == -1){
					break;
				}
				check = false;
			}
			
		}
		if (check){
			println("progresia");
		} else {
			println("ara");
		}

	}
}