import acm.program.ConsoleProgram;

public class problem45 extends ConsoleProgram {
	public void run() {
		String text = readLine("Enter text: ");
		String symbolText = readLine("Enter symbol: ");
		char symbol = symbolText.charAt(0);
		int numbOccurences = 0;
		for (int i = 0; i < text.length(); i++){
			if(text.charAt(i) == symbol){
				numbOccurences ++;
			}
		}
		
		println("This symbol appears in the text " + numbOccurences + "times. ");
	}

}
