import acm.program.ConsoleProgram;

public class wordShrugg extends ConsoleProgram {
	public void run() {
		String s = readLine();
		longestRunCompression(s);

	}

	private void longestRunCompression(String s) {
		int count = 1;

		for (int i = 0; i < s.length(); i++) {
			char current = s.charAt(i);
			if (i < s.length() - 1 && current == s.charAt(i + 1)) {
				count++;
			} else {
				if (count > 1) {
					print(count);
				}
				print(current);
				count = 1;
			}
		}
	}
}