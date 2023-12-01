import acm.program.ConsoleProgram;
import acm.util.RandomGenerator;

public class dogs extends ConsoleProgram{
	private RandomGenerator rgen = RandomGenerator.getInstance();
	public void run (){
		int candyCounter = 0;
		println("Welcome to grand opening of the new Freeuni dog park!");
		while(true){
			String name = readLine("What is your dog's name ? ");
			if(name.equals("")){
				println("At the grand opening, there will be " + candyCounter + " dog treats.");
				break;
			}
			int size = readInt("How big is your dog? Enter a number; 1 - small, 2 - medium, 3 - large ");
			int candy = 2 * size;
			candyCounter += candy;
			println("Oh boy! " + name + " gets " + candy + " dog treats." );
			int toy = rgen.nextInt(0, 1);
			if(toy <= 0.25){
				println(name + " also won a squeaky toy");
			}
		}
	}

}
