import acm.program.ConsoleProgram;

public class midterm2021_1_log extends ConsoleProgram {
	public void run() {
		int n = readInt("enter base: ");
		int m = readInt("enter argument: ");
		int result = m / n;
		println("log(" + n + " ," + m + ") = " + result);
	}

}
