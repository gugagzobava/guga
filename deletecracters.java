import acm.program.ConsoleProgram;

public class deletecracters extends ConsoleProgram {
	public void run() {

		String a = "heeeelllllooo";
		String b = "hello";
		if (contains(a, b)) {
			println("true");

		} else {
			println("false");
		}
	}

	private boolean contains(String a, String b) {
		int prevIndex = 0;
		for (int i = 0; i < b.length(); i++) {
			prevIndex = a.indexOf(b.charAt(i), prevIndex) + 1;
			if (prevIndex == 0) {
				return false;
			}

		}
		return true;
	}
}
