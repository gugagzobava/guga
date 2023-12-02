import acm.program.ConsoleProgram;
import acm.util.RandomGenerator;

public class sequence extends ConsoleProgram{
	private static final int EXPERIMENTS = 1000;
	private RandomGenerator rgen = RandomGenerator.getInstance();
	private int n;
	public void run(){
		n = readInt();
		int sumFlips = 0;
		for(int i = 0; i < EXPERIMENTS; i++){
			int currFlips = holdExperiment();
			sumFlips += currFlips;
		}
		double avg = sumFlips / EXPERIMENTS;
		println(avg);
		
	}
	private int holdExperiment(){
		int flips = 0;
		while(n != 0){
			flips++;
			boolean isHeads = rgen.nextBoolean();
			if (isHeads){
				n /= 2;
			} else {
				n--;
			}
		}
		return flips;
	}

}
