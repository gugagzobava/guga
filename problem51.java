import acm.program.ConsoleProgram;

public class problem51 extends ConsoleProgram {
	public void run() {
		String s = readLine("enter string; ");
		removeDup(s);

	}

	private void removeDup(String s) {
		String result = "";
		for (int i = 0; i < s.length(); i++) {
			char currentChar = s.charAt(i);

			if (result.indexOf(currentChar) == -1) {
				result += currentChar;
			}
		}

		println(result);

	}

}
