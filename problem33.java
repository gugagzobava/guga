import java.util.Random;
import acm.graphics.*;
import acm.program.ConsoleProgram;


public class problem33 extends ConsoleProgram {
	public void run() {
		int r = new Random().nextInt(150) + 50;
		GOval oval = new GOval (getWidth() / 2 - r, getHeight() / 2 - r, 2 * r, 2 * r);
		oval.setFilled(true);
		add(oval);
		
		
		
		
		
	}

}
