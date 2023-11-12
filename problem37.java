import acm.program.ConsoleProgram;
import acm.util.RandomGenerator;

public class problem37 extends ConsoleProgram {
	private RandomGenerator rgen = RandomGenerator.getInstance();

	public void run() {
		while (true) {
			int n = readInt("Place your bid to number: ");
			if (n > 36) {
				println("Illegal number format ");
			} else {
				int x = rgen.nextInt(0, 36);
				println("Roulette result is " + x);
				if (n == x) {
					println("you win");
				} else {
					println("you lost");
				}
			}
		}
	}

}
