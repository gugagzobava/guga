import acm.program.ConsoleProgram;

public class midterm_practice_3 extends ConsoleProgram {
	public void run(){
		String s = readLine();
		println(upperLower(s));
	}

	private String upperLower(String s) {
	//	String result = "";
		for(int i = 0; i < s.length(); i++){
			char currentChar = s.charAt(i);
			if(currentChar == ' '){
                s = s.substring(0, i) + Character.toUpperCase(currentChar) + s.substring(i + 1);

				//Character.toUpperCase(s.charAt(i+1));
			}
//			result += currentChar;
		}
		return s;
	}

}
