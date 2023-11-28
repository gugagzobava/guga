import acm.program.ConsoleProgram;

public class midterm_practice_2 extends ConsoleProgram{
	public void run(){
		while(true){
		String s = readLine();
		s = s.toUpperCase();
		check(s);
		println(isIncreasing(s));
	}
	}

	private void check(String s) {
		for(int i = 0; i < s.length(); i++){
			if(s.charAt(i) < 'Z' && s.charAt(i) > 'A'){
				println(isIncreasing(s));
			} else {
				println("error");
			}
		}
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
