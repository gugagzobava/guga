import acm.program.ConsoleProgram;
import acm.util.RandomGenerator;

public class problem35 extends ConsoleProgram {
	private RandomGenerator rgen = RandomGenerator.getInstance();

	public void run() {
		int flips = 0;
		while (true) {
			int result = rgen.nextInt(0, 1);
			flips++;
			if (result == 1) {
				println("heads");
				break;
			} else {
				println("tails");
			}
		}
	}

}
