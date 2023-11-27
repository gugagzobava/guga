import java.util.StringTokenizer;

import acm.program.ConsoleProgram;

public class skyisblue extends ConsoleProgram{
	public void run(){
		String str = "the sky is blue";
		StringTokenizer tokenizer = new StringTokenizer(str, "");
		for(int count =0; tokenizer.hasMoreTokens(); count++){
		println(tokenizer.nextToken()+ count);
	}
	}

}
