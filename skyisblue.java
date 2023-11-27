import java.util.StringTokenizer;

import acm.program.ConsoleProgram;

public class skyisblue extends ConsoleProgram{
	public void run(){
	      String str = "the sky is blue";
	        StringTokenizer tokenizer = new StringTokenizer(str, " ");
	        String reversedString = "";
	        while (tokenizer.hasMoreTokens()) {
	            reversedString = tokenizer.nextToken() + " " + reversedString;
	        }
	        println(reversedString);
	    }
	}


