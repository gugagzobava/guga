import acm.program.ConsoleProgram;

public class frontCoding extends ConsoleProgram {
	public void run() {
		String a = "million";
		String b = "millenia";
		int count = 0;
		int counta = 0;
		println(FrontCoding(a, b, count, counta));

	}

	private String FrontCoding(String a, String b, int count, int counta) {
		String result = "";
		for (int i = 0; i < Math.min(a.length(), b.length()); i++) {
			char currentA = a.charAt(i);
			char currentB = b.charAt(i);
			if (currentA == currentB) {
				result += currentA;
				count++;

			} else {
				break;
			}
			int counta = a.length() - count;
			int countb = b.length() - count;
			String remainingA = a.substring(count);
			String remainingB = b.substring(count);

		}
		return count + result + counta;
	}
}
