import acm.program.ConsoleProgram;

public class midterm_practice_5 extends ConsoleProgram{
	public void run(){
//		
		  String a = "mama mia";
	        String b = "mimaiam";
	        println(anagrams(a, b));
	    }

	    private boolean anagrams(String a, String b) {
	        a = a.toLowerCase();
	        b = b.toLowerCase();
	        int difference = 0;

	        for (int i = 0; i < a.length(); i++) {
	            if (a.charAt(i) != b.charAt(i)) {
	                difference++;
	                if (difference > 1) {
	                    return false;
	                }
	            }
	            return true;
	        }

	           
	        

	       return checkAnagrams(a, b);
	    }

	    private boolean checkAnagrams(String a, String b) {
	        for (char c = 'a'; c <= 'z'; c++) {
	            int occurrencesA = countOccurrences(a, c);
	            int occurrencesB = countOccurrences(b, c);

	            if (occurrencesA != occurrencesB) {
	                return false;
	            }
	        }

	        return true;
	    }

	    private int countOccurrences(String s, char c) {
	        int count = 0;
	        for (int i = 0; i < s.length(); i++) {
	            if (Character.isLetter(s.charAt(i)) && s.charAt(i) == c) {
	                count++;
	            }
	        }
	        return count;
	}

	

}
