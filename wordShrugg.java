import acm.program.ConsoleProgram;

public class wordShrugg extends ConsoleProgram {
	public void run() {
		String s = readLine();
		longestRunCompression(s);
		
	}

	private void longestRunCompression(String s) {
		int count = 1;
		String result = "";
		for(int i = 0; i < s.length(); i++){
			char current = s.charAt(i);
			if(current == s.charAt(i+1)){
				count++;
			}
			print(count);
            print(current);
		}
		println(result);
	}

}
