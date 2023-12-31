import java.util.StringTokenizer;

import acm.program.ConsoleProgram;

public class midterm_practice_3 extends ConsoleProgram {
	public void run() {
		String s = readLine();
		println(upperLower(s));
	}

	private String upperLower(String s) {
		String result = "";
		StringTokenizer tokenizer = new StringTokenizer(s);

		while (tokenizer.hasMoreTokens()) {
			String word = tokenizer.nextToken();
			char firstChar = Character.toUpperCase(word.charAt(0));
			String restOfWord = word.substring(1).toLowerCase();

			result += firstChar + restOfWord + " ";
		}

		return result;
	}

}
