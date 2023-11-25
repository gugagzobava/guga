import acm.program.ConsoleProgram;

public class problem49 extends ConsoleProgram {
	public void run(){
		String s = readLine("enter string: ");
		int number = StringToInt(s);
		println(number);
	
	}

	private int StringToInt(String s) {
		int result = 0;
		for(int i = 0; i < s.length(); i++){
			int n = s.charAt(i) - '1';
			result = result * 10 + n;
		}
		return result;
		
	}

}
