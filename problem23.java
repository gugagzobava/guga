import acm.program.ConsoleProgram;

public class problem23 extends ConsoleProgram {
	public void run() {
		int n = readInt("Enter n: ");
		int sum = 0;
        
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
		println (sum);
		
		
		
	}

}
