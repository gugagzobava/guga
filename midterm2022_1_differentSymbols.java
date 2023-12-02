\import acm.program.ConsoleProgram;

public class midterm2022_1_differentSymbols extends ConsoleProgram {
	private String end = "END";
	public void run() {
		String result = "";
		int maxCount = 0;
		while (true) {
			String s = readLine("");

			if (s.equals(end)) {
				break;
			}
			int num = countCharacters(s);
			if (num > maxCount){
				maxCount = num;
				result = s;
		}
		
		}
		println(result);

	}

	private int countCharacters(String s) {
		String result = "";
		for (int i = 0; i < s.length(); i++){
			if(!result.contains("" + s.charAt(i))){
				result += s.charAt(i);
			}
		}
		return result.length();
	}

}
