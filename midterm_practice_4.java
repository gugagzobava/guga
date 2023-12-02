import java.util.StringTokenizer;

import acm.program.ConsoleProgram;

public class midterm_practice_4 extends ConsoleProgram{
	public void run(){
		
			String s = readLine();
			println(reverseWords(s));
		}

		private String reverseWords(String s) {
			String result = "";
			StringTokenizer tokenizer = new StringTokenizer(s);
			while (tokenizer.hasMoreTokens()) {
				String word = tokenizer.nextToken();
				  result += reverse(word) + " ";
			}
			return result;
	}

		private String reverse(String word) {
			 String reversed = "";
		        for (int i = 0; i < word.length(); i++) {
		            reversed += word.charAt(i) + reversed;
		        }
		        return reversed;
		    }
		}


