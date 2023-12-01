import acm.program.ConsoleProgram;

public class frontCoding extends ConsoleProgram {
	public void run() {
		String a = "million";
		String b = "millenia";
		println(FrontCoding(a, b));

	}

	private String FrontCoding(String a, String b) {
		return prefix(a, b);
	}

	private String prefix(String a, String b) {
		String result = "";
		int count = 0;
		for (int i = 0; i < Math.min(a.length(), b.length()); i++) {
			char currentA = a.charAt(i);
			char currentB = b.charAt(i);
			if (currentA == currentB) {
				result += currentA;
				count++;
			} else {
				break;

			}

		}
		return result;
	}
}