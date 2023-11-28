import acm.program.ConsoleProgram;

public class midterm_practice_2 extends ConsoleProgram{
	public void run(){
		String s = readLine();
		isIncreasing(s);
	}

	private boolean isIncreasing(String s) {
		for(int i = 0; i < s.length(); i++){
			if(s.charAt(i) > s.charAt(i + 1)){
				return false;
			}
		}
		return true;
		
		
		
	}

}
