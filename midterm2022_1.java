import acm.program.ConsoleProgram;

public class midterm2022_1 extends ConsoleProgram {
	public void run() {
		String a = "lmao";
		String b = "nice";
		println(manipulate(a, b));
	}

	private boolean manipulate(String a, String b) {
		for (int i = 1; i < a.length(); i++) {
			String left = a.substring(0, i);
			String right = a.substring(i);
			for (char x = 0; x < 256; x++) {
				for (char y = 0; y < 256; y++) {
					String s = deleteCharacter(left, x) + deleteCharacter(right, y);
					if (s.equals(b)) {
						return true;
					}
				}
			}
		}
		return false;

	}
	private String deleteCharacter(String s, char c){
		String result = "";
		for(int i = 0; i<s.length(); i++){
			if(s.charAt(i) != c){
				result += s.charAt(i);
				
			}
		}
		return result;
	}

}
