import acm.program.ConsoleProgram;

public class midterm_practice_5 extends ConsoleProgram{
	public void run(){
		String a = "mama asa";
		String b = "mimaiam";
		println(anagrams(a, b));
		
			
		
	}

	private boolean anagrams(String a, String b) {
		a = a.toLowerCase();
		b = b.toLowerCase();
		int difference = 0;
		for(int i = 0; i < a.length(); i++){
			if(a.charAt(i) != b.charAt(i)){
				difference++;
				if (difference > 1){
					return false;
				} else{
				return true;
				}
			}
			char current = a.charAt(i);
			 if (Character.isLetter(current)) {
	                int occurrencesA = countOccurrences(a, current);
	                int occurrencesB = countOccurrences(b, current);
	                if (occurrencesA != occurrencesB) {
	                    return false;
	                }
	            }
		}
		return true;
	}

	private int countOccurrences(String a, char current) {
		int count = 0;
        for (int i = 0; i < a.length(); i++) {
            current = a.charAt(i);
            if(Character.isLetter(current)){
            	count++;
            }
        }
		return count;
	}

	

}
