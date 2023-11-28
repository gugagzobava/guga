import acm.program.ConsoleProgram;

public class midterm_practice_2 extends ConsoleProgram{
	public void run(){
		String s = readLine();
		println(isIncreasing(s));
	}

	private boolean isIncreasing(String s) {
		for(int i = 0; i < s.length() - 1; i++){
			if(s.charAt(i) > s.charAt(i + 1)){
				return false;
			}
		}
		return true;
		
		
		
	}

}
