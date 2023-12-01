import acm.program.ConsoleProgram;

public class UnEvil extends ConsoleProgram {
	public void run() {
		String s = "how arxxe yommunn?";
		println(unEvilText(s));

	}
	private String unEvilText(String s) {
        String result = "";
        s = s.toLowerCase(); // Convert to lowercase for case-insensitivity

        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);

            // Check if the current character is different from the next one
            if (i == s.length() - 1 || current != s.charAt(i + 1)) {
                result += current;
            }
        }

        return result;
    }
//	private String unEvilText(String s) {
//		String result = "";
//		for (int i = 0; i < s.length(); i++) {
//			char current = s.charAt(i);
//			boolean isDuplicate = false;
//			while (i < s.length() - 1 && current == s.charAt(i + 1)) {
//				isDuplicate = true;
//				i++;
//			}
//			if (!isDuplicate) {
//				result += current;
//			}
//
//		}
//		return result;
//	}

}
