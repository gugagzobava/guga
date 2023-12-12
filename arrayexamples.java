import java.util.Arrays;

import acm.program.ConsoleProgram;

public class arrayexamples extends ConsoleProgram{
	public void run(){
		String[][] a = new String[10][10];
		a[3][4] = "HELLO"; 
		println(Arrays.deepToString(a));
	}

}
