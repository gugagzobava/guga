import acm.program.ConsoleProgram;

public class frontCoding extends ConsoleProgram {
	public void run() {
		String a = "million";
		String b = "millenia";
		int count = 0;
		int counta = a.length() - count;
		int countb = b.length() - count;
		println(FrontCoding(a, b, count));

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
