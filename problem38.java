import acm.program.ConsoleProgram;
import acm.util.RandomGenerator;

public class problem38 extends ConsoleProgram {
	private RandomGenerator rgen = RandomGenerator.getInstance();

	public void run() {
		int balance = 1000;
		println("Your balance is " + balance);
		while (true) {
			int n = readInt("Choose number: ");
			if (n > 36) {
				println("Illegal number format ");
			} else {
				int bid = readInt("Enter your bid: ");
				if (bid > balance) {
					println("You don't have enough money");
				} else {
					int x = rgen.nextInt(0, 36);
					println("Roulette result is " + x);
					if (n == x) {
						println("you win");
						balance = balance + bid;
					} else {
						println("you lost");
						balance = balance - bid;
					}
					println("Your balance is " + balance);
				}
			}
		}

	}
}