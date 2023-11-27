import acm.program.ConsoleProgram;

public class midterm2021_2_father extends ConsoleProgram {
	public void run() {
		String Anakin = "ATTGATTT";
		String Luke = "TGA";
		println(amIYourFatherLuke(Luke, Anakin));
	}

	private boolean amIYourFatherLuke(String luke, String anakin) {
		for (int i = 0; i < luke.length(); i++) {
			for (int j = i + 1; j < luke.length() + 1; j++) {
				String sameDNA = luke.substring(i, j);
				if (anakin.indexOf(sameDNA) != -1) {
					if (sameDNA.length() >= anakin.length() / 2) {
						return true;
					}
				}
			}
		}
		return false;
	}

}
