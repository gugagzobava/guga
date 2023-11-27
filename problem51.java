import acm.program.ConsoleProgram;

public class problem51 extends ConsoleProgram{
	public void run(){
		String s = readLine("enter string; ");
		removeDup(s);
		
	}

	private void removeDup(String s) {
		 String result = "";
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
           
            for (int j = 0; j < result.length(); j++) {
             //   if (currentChar == result.charAt(j)) {
                	 if (currentChar != result.charAt(j)) {
                         result += currentChar;
                     }
                }
            }
           
        }
       
		
	//}

}
