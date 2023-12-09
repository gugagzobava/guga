import acm.program.ConsoleProgram;

public class problem57 extends ConsoleProgram {
	public void run() {
		String a = "ai ra mzis";
		String b = "sizmari";
		println(isAnagram(a, b));
	}

	private boolean isAnagram(String a, String b) {
		int[] countA = new int[26];
		int[] countB = new int[26];
		for (int i = 0; i < a.length(); i++) {
			char curr = a.charAt(i);
			if (Character.isLetter(curr)) {
				countA[curr - 'a']++;
			}
		}
		for (int i = 0; i < b.length(); i++) {
			char curr = b.charAt(i);
			if (Character.isLetter(curr)) {
				countB[curr - 'a']++;
			}
		}
		for (int i = 0; i < 26; i++) {
			if (countA[i] != countB[i]) {
				return false;
			}
		}
		return true;

	}
}
