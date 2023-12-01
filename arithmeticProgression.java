import acm.program.ConsoleProgram;

public class arithmeticProgression extends ConsoleProgram {
	public void run() {
		int a1 = readInt();
		int a2 = readInt();
		int d = a2 - a1; 
		boolean check = true;
		while (a1 != -1) {
			a1 = a2;
			a2 = readInt();
			if (a2 != a1 + d ) {
				if(a2 == -1){
				break;
			}
				check = false;
			}
		}
		if(check){
			println("Arithemtic progression");
		} else {
			println("Not an arithmetic progression");
		}
	}
}
