import acm.program.ConsoleProgram;

public class frontCoding extends ConsoleProgram {
	public void run() {
		String a = "million";
		String b = "millenia";
		int count = 0;
		int counta = a.length() - count;
		int countb = b.length() - count;
//		String remainingA = a.substring(count - 1);
//		String remainingB = b.substring(count - 1);
		println(FrontCoding(a, b, count) + "*" + Math.min(counta, countb));

	}

	private String FrontCoding(String a, String b, int count) {
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

		}
		return count + result;
	}
}
