import acm.program.ConsoleProgram;
import acm.util.RandomGenerator;

public class problem36 extends ConsoleProgram {
	private RandomGenerator rgen = RandomGenerator.getInstance();

	public void run() {
		int flips = 0;
		int headsInRow = 0;
		while (true) {
			int result = rgen.nextInt(0, 1);
			flips++;
			if (result == 1) {
				println("heads");
				headsInRow++;
				break;
			} else {
				println("tails");
				headsInRow = 0;
			}
		}
		println("it took " + flips + " flips to get heads");
	}

}
