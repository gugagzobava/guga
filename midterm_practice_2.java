import acm.program.ConsoleProgram;

public class midterm_practice_2 extends ConsoleProgram{
	public void run(){
		String s = readLine();
		s = s.toUpperCase();
//		check(s);
		println(isIncreasing(s));
	}

//	private void check(String s) {
//		String result = "";
//		for(int i = 0; i < s.length(); i++){
//			if(s.charAt(i) > 'Z' || s.charAt(i) < 'A'){
//				
//			
//			}
//		}
//	}

	private boolean isIncreasing(String s) {
		int count = 0;
		for(int i = 0; i < s.length() - 1; i++){
			if(s.charAt(i) > 'Z' || s.charAt(i) < 'A'){
				count++;
			}
			if(s.charAt(i) > s.charAt(i + 1)){
				return false;
			}
		} if(count != 0){
			println("error");
		}
		return true;
		
		
		
	}

}
