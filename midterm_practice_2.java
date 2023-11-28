import acm.program.ConsoleProgram;

public class midterm_practice_2 extends ConsoleProgram{
	public void run(){
		String s = readLine();
		s = s.toUpperCase();
		println(isIncreasing(s));
	}


	private boolean isIncreasing(String s) {
		char b;
		char c = 'a';
		for(int i = 0; i < s.length(); i++){
			if(s.charAt(i) > 'A' && s.charAt(i) < 'Z'){
				b = c;
				c = s.charAt(i);
				if(b>=c)return false;
				
			}
		
		} 
		return true;
		
		
		
	}

}
