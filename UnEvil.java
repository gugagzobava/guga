import acm.program.ConsoleProgram;

public class UnEvil extends ConsoleProgram{
	public void run(){
		String s = "how arxxe yommu?";
		println(unEvilText(s));
		
	}

	private String unEvilText(String s) {
		String result = "";
		for(int i = 0; i < s.length(); i++){
			char current = s.charAt(i);
			 if (i == s.length() - 1 || current != s.charAt(i + 1)) {
	                result += current;
	            }
//			if(i < s.length() - 1 && current == s.charAt(i + 1)){
//				result = s.substring(0, i) + s.substring(i+2);
//			}
		}
		return result;
	}

}
