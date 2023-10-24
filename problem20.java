import acm.program.ConsoleProgram;

public class problem20 extends ConsoleProgram{
	public void run(){
		int n = readInt("Enter n: ");
		int sum = 0;
		for (int i = 0; i<n ; i++) {
			int num = readInt("enter number #" + i + ":");
			sum += num; //sum = sum + num;
			
		}
		println ("sum:" + sum);
		
		
		
		
		
	}	
}