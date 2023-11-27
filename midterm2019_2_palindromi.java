import acm.program.ConsoleProgram;

public class midterm2019_2_palindromi extends ConsoleProgram {

	public void run(){
		int n = readInt("enter number: ");
		ispalindrom(n);
		
		
	}

	private boolean ispalindrom(int n) {
		int number = n;
		int result = 0;
		while(n != 0){
			int m = n % 10;
			n /= 10;
			result = result * 10 + m;
		}
		if (number == result){
			return true;
		} else{
			return false;
		}
		
		
	}
	

}
