
//import acm.program.ConsoleProgram;
//
//public class wordShrugg extends ConsoleProgram {
//	public void run() {
//		String s = readLine();
//		longestRunCompression(s);
//
//	}
//
//	private void longestRunCompression(String s) {
//		int count = 1;
//		for (int i = 1; i < s.length(); i++) {
//			char current = s.charAt(i);
//			if (current == s.charAt(i - 1)) {
//				count++;
//			} else {
//			System.out.print(count);
//			System.out.print(s.charAt(i-1));
//			count = 1;
//			}
//		}
//		 System.out.print(count);
//	        System.out.print(s.charAt(s.length() - 1));
////	}
//
//}
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
				// If the current character is the same as the next one,
				// increment the count
				count++;
			} else {
				System.out.print(count);
				System.out.print(current);
				count = 1;
			}
		}
	}
}