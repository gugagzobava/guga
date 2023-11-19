import acm.program.ConsoleProgram;

public class problem46 extends ConsoleProgram {
	public void run() {
		String s = readLine("Enter string: ");
		println(findMostFrequentLetter(s));
	}

	private char findMostFrequentLetter(String s) {
		char result = '-';
		int max = 0;
		for(int i = 0; i < 26; i++){
			char next = (char)('a' + i);
			int countSymbol = countSymbolInString(s, next);
			if(countSymbol > max){
				max = countSymbol;
				result = next;
			}
		}
		return result;
	}
	
	private int countSymbolInString(String s, char ch) {
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			int current = s.charAt(i);
			if (current == ch) {
				count++;
			}
		}
		return count;
	}
//		String text = readLine("Enter text: ");
//		int maxCount = 0;
//		char maxChar;
//		for (int i = 0; i < text.length(); i++) {
//			int numOcc = numOccurences(text, text.charAt(i));
//			if (numOcc > maxCount){
//				maxCount = numOcc;
//				maxChar = text.charAt(i);
//			}
//		}
//		println("max char: " + maxChar);
//	}
//
//	private int numOccurences(String text, char symbol) {
//		int numOccurences = 0;
//		for (int i = 0; i < text.length(); i++) {
//			if (text.charAt(i) == symbol) {
//				numOccurences++;
//			}
//		}
//		return numOccurences;
//	}
}
