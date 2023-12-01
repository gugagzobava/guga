import acm.program.ConsoleProgram;

public class dogs extends ConsoleProgram{
	private String name;
	public void run (){
		println("Welcome to grand opening of the new Freeuni dog park!");
		while(!name.equals("")){
			name = readLine("What is your dog's name ?");
			int size = readInt("How big is your dog? Enter a number; 1 - small, 2 - medium, 3 - large ");
			int candy = 2 * size;
			println("Oh boy! " + name + " gets " + candy + "dog treats." );
		}
	}

}
