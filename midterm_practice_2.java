import acm.program.ConsoleProgram;

public class midterm_practice_2 extends ConsoleProgram {
	public void run() {
		String s = readLine();
		if (containsSymbol(s)) {
			println("Error: String contains symbols. Please enter only letters.");
		} else {
			s = s.toUpperCase();
			println(isIncreasing(s));
		}
	}

	private boolean isIncreasing(String s) {
		char lastChar = 'A';

		for (int i = 0; i < s.length(); i++) {
			char currentChar = s.charAt(i);
			if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
				if (currentChar <= lastChar) {
					return false;
				}
				lastChar = currentChar;

			}

		}
		return true;

	}

	private boolean containsSymbol(String s) {
		for (int i = 0; i < s.length(); i++) {
			char currentChar = s.charAt(i);
			if (!(currentChar >= 'A' && currentChar <= 'Z')) {
				return true; // Found a symbol
			}
		}
		return false; // No symbols found
	}

}
