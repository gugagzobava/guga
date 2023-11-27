import acm.program.ConsoleProgram;

public class midterm2021_1_log extends ConsoleProgram {
	public void run() {
		int n = readInt("enter base: ");
		int m = readInt("enter argument: ");
		int result = m / n;
		int answer = 1;
		while(true){
		if(m / n != 1){
			result = result / n;
			answer++;
		} else{
			break;
		}
		}
		println("log(" + n + " ," + m + ") = " + answer);
	}

}
