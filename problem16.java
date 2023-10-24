import acm.program.ConsoleProgram;

public class problem16 extends ConsoleProgram {
	public void run(){
		double a = readInt("enter first number: ");
		double b = readInt("enter second number: ");
		double c = readInt("enter third number: ");
		
		
		println(1 / (1/a + 1/b + 1/c));
	}
	
}
