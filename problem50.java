import java.util.StringTokenizer;

import acm.program.ConsoleProgram;

public class problem50 extends ConsoleProgram {
	public void run() {
		String str = readLine("Enter text: ");
		StringTokenizer tokenizer = new StringTokenizer(str, "o");
		int wordcounts = tokenizer.countTokens();
		println(wordcounts);
	}
}
