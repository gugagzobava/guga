import acm.program.ConsoleProgram;

public class wordShrugg extends ConsoleProgram {
	public void run() {
		String s = readLine();
		longestRunCompression(s);
		
	}

	private void longestRunCompression(String s) {
		String result = "";
		for(int i = 0; i < s.length(); i++){
			char current = s.charAt(i);
			if(result.indexOf(current) == -1){
				result += current;
			}
		}
		println(result);
	}

}
