import acm.program.ConsoleProgram;

public class midterm2021_1_log extends ConsoleProgram {
	public void run() {
		int n = readInt("enter base: ");
		int m = readInt("enter argument: ");
		int result = m;
		int answer = 0;
		while(result >= n){
			result = result / n;
			answer++;
		}
		println("log(" + n + " ," + m + ") = " + answer);
	}

}
