import acm.program.ConsoleProgram;

public class midterm_practice_3 extends ConsoleProgram {
	public void run(){
		String s = readLine();
		println(upperLower(s));
	}

	private String upperLower(String s) {
		String result = " ";
		for(int i = 0; i < s.length(); i++){
			char currentChar = s.charAt(i);
			if(currentChar == ' '){
				String x = ("" +s.charAt(i+1));
				x = x.toUpperCase();
			}
			result += currentChar;
		}
		return result;
	}

}
