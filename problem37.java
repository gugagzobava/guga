import acm.program.ConsoleProgram;
import acm.util.RandomGenerator;

public class problem37 extends ConsoleProgram {
	private RandomGenerator rgen = RandomGenerator.getInstance();

	public void run() {
		int n = readInt("Place your bid: ");
		int x = rgen.nextInt(0, 36);
		if (n == x) {
			println("you win");
		} else {
			println("you lost");
		}

	}

}
