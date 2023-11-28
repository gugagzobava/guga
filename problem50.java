import java.util.StringTokenizer;

import acm.program.ConsoleProgram;

public class problem50 extends ConsoleProgram {
	public void run() {
		int count = 0;
		String str = readLine("Enter text: ");
		StringTokenizer tokenizer = new StringTokenizer(str, " ");
		while(tokenizer.hasMoreTokens()){
		tokenizer.nextToken();
		count++;
		}
		println(count);
	}
}
