import acm.program.ConsoleProgram;

public class UnEvil extends ConsoleProgram {
	public void run() {
		String s = "how arxxe youuunn?";
		println(unEvilText(s));

	}

	private String unEvilText(String s) {
		String result = "";
		int count = 1;
		for (int i = 0; i < s.length(); i++) {
			char current = s.charAt(i);
	//		boolean isDuplicate = false;
			while (i < s.length() - 1 && current == s.charAt(i + 1)) {
	//			isDuplicate = true;
				i++;
				count++;
			}
			if (count <= 2) {
				result += current;
			}

		}
		return result;
	}

}
