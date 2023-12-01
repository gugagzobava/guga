import acm.program.ConsoleProgram;

public class arithmeticProgression extends ConsoleProgram{
	public void run(){	
			int a1 = readInt();
			int a2 = readInt();
			int d = a2 - a1;
			while(true){
				a1 = a2;
				a2 = readInt();
				if(a2 != a1 + d){
					if(a2 == -1){
						println("Not an arithmetic progression");
						break;
					}
				} else {
					if(a2 == -1){
						println("Arithmetic progression");
						break;
					}
				}
			}
	}

}
