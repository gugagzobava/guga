import acm.program.ConsoleProgram;

public class frontCoding extends ConsoleProgram {
	public void run() {
		String a = "million";
		String b = "millenia";
		int count = 0;
		int counta = 0;
		int countb = 0;
		String remainingA = "";
		String remainingB = "";
		println(FrontCoding(a, b, count, counta, countb, remainingA, remainingB));

	}

	private String FrontCoding(String a, String b, int count, int counta, int countb, String remainingA, String remainingB) {
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
			counta = a.length() - count;
			countb = b.length() - count;
			remainingA = a.substring(count);
			remainingB = b.substring(count);

		}
		return count + result + "*" +counta + remainingA + countb + remainingB;
	}
}
