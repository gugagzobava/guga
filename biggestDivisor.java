import acm.program.ConsoleProgram;

public class biggestDivisor extends ConsoleProgram{
	public void run(){
		int n = readInt("enter a number: ");
		println(largestPrimeDivisor(n));
		
	}

	private int largestPrimeDivisor(int n) {
		for(int i = n-1; i >= 2; i--){
			if(n % i ==0){
				return i;
			}
		}
		return n;
	}

}
