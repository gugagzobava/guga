import acm.program.ConsoleProgram;

public class midterm_practice_2 extends ConsoleProgram {
	public void run() {
		String s = readLine();
		
		s = s.toUpperCase();
		println(isIncreasing(s));
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

}
