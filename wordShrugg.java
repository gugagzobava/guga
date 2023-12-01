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
			if (current == s.charAt(i - 1)) {
				count++;
			}
			print(count);
			print(current);
			count = 1;
			
		}

	}

}
//import acm.program.ConsoleProgram;
//
//public class wordShrugg extends ConsoleProgram {
//    public void run() {
//        String s = readLine();
//        longestRunCompression(s);
//        println(); // Print a newline at the end
//    }
//
//    private void longestRunCompression(String s) {
//        int count = 1;
//
//        for (int i = 0; i < s.length(); i++) {
//            char current = s.charAt(i);
//            if (i < s.length() - 1 && current == s.charAt(i + 1)) {
//                // If the current character is the same as the next one, increment the count
//                count++;
//            } else {
//                // If a new character is encountered or the end of the string is reached,
//                // print the count and the character
//                System.out.print(count);
//                System.out.print(current);
//                // Reset the count for the next character
//                count = 1;
//            }
//        }
//    }
//}