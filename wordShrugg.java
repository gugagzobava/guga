import acm.program.ConsoleProgram;

public class wordShrugg extends ConsoleProgram {
	 public void run() {
	        String s = readLine();
	        longestRunCompression(s);
	    }

	    private void longestRunCompression(String s) {
	        int count = 1;

	        for (int i = 0; i < s.length(); i++) {
	            char current = s.charAt(i);
	            if (i < s.length() - 1 && current == s.charAt(i + 1)) {
	                // If the current character is the same as the next one, increment the count
	                count++;
	            } else {
	                // If a new character is encountered or the end of the string is reached,
	                // print the count and the character
	                print(count);
	                print(current);
	                // Reset the count for the next character
	                count = 1;
	            }
	        }
	        println(); // Print a newline at the end
	    }
//	public void run() {
//		String s = readLine();
//		longestRunCompression(s);
//		
//	}
//
//	private void longestRunCompression(String s) {
//		String result = "";
//		for(int i = 0; i < s.length(); i++){
//			char current = s.charAt(i);
//			if(result.indexOf(current) == -1){
//				result += current;
//			}
//		}
//		println(result);
//	}

}
