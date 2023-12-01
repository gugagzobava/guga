import acm.program.ConsoleProgram;

public class wordShrugg extends ConsoleProgram {
	public void run() {
		String s = readLine();
		longestRunCompression(s);
		
	}

	private void longestRunCompression(String s) {
		for(int i = 0; i < s.length(); i++){
			int count = 1;
			char current = s.charAt(i);
			if(current == s.charAt(i+1)){
				count++;
			} else{
			print(count);
            print(current);
            count = 1;
		}
		}
		println();
	}

}
