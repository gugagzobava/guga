import acm.program.ConsoleProgram;

public class RL extends ConsoleProgram {
	public void run(){
		String s = "RLRRLRLLLRRLLR";
		countEqual(s){
			
			
		}
	}

	private int countEqual(String s) {
		countR = 0;
		countL = 0;
		for(int i = 0; i < s.length(); i++ ){
			if(s.charAt(i) == 'R'){
				countR++;
			}
		}
		
		
	}

}
