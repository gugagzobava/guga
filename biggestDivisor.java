import acm.program.ConsoleProgram;

public class biggestDivisor extends ConsoleProgram{
	public void run(){
		int n = readInt("enter a number: ");
		println(largestPrimeDivisor(n));
		
	}

	private int largestPrimeDivisor(int n) {
		for(int i = 2; i <= n; i++){
			if(n % i == 0 && isPrime(i)){
				return i;
			}
		}
		return n;
	}

	private boolean isPrime(int i) {
		int count = 0;
		for(int j = 1; j <= i; j++){
			if (i % j == 0){
				count++;
			}
		}
		if (count > 2){
			return false;
		}
		return true;
	}

}
