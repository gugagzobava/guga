import acm.program.ConsoleProgram;

public class midterm2019_2_palindromi extends ConsoleProgram {
	private int n;
	public void run(){
		n = readInt("enter number: ");
		ispalindrom();
		
		
	}

	private boolean ispalindrom() {
		int result = 0;
		while(n != 0){
			int m = n % 10;
			n /= 10;
			result = result * 10 + m;
		}
		if (n == result){
			return true;
		} else{
			return false;
		}
		
		
	}
	

}
