import acm.program.ConsoleProgram;

public class problem48 extends ConsoleProgram{
	public void run() {
		String s = readLine("Enter string: ");
		printSymbolStatistics(s);
	}

	private void printSymbolStatistics(String s) {
		for(int i = 0; i < 26; i++) {
			char next = (char) ('a' + i);
			countSymbol(s, next);
			println("Symbol '" + next + "' occurs " + countSymbol + " times.");
		}
		
	}
	private int countSymbol(String s, char ch){
		int count = 0;
		for(int i = 0; i < s.length(); i++){
			if(s.charAt(i) == ch){
				count++;
			}
		}
		return count;
	}

}
