import java.util.StringTokenizer;

import acm.program.ConsoleProgram;

public class skyisblue extends ConsoleProgram{
	public void run(){
	      String str = "the sky is blue";
	        StringTokenizer tokenizer = new StringTokenizer(str, " ");
	        while (tokenizer.hasMoreTokens()) {
	        	print(tokenizer.nextToken() + " ");
	        }
	        println();
	    }
	}
//		String str = "the sky is blue";
//		StringTokenizer tokenizer = new StringTokenizer(str, " ");
//		while (tokenizer.hasMoreTokens()) {
//            String token = tokenizer.nextToken();
//            print(token + " ");
//        }
//		println();
//	}
	


