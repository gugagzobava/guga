import acm.program.ConsoleProgram;
import acm.util.RandomGenerator;

public class problem35 extends ConsoleProgram {
	private RandomGenerator rgen = RandomGenerator.getInstance();
	public void run() {
		int result = rgen.nextInt(0,1);
		if (result == 1) {
			println("heads");
			} else {
				println("tails");
		}
	}
	

}
