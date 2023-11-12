import acm.graphics.GOval;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

public class problem33 extends GraphicsProgram {
	private RandomGenerator rgen = RandomGenerator.getInstance();

	public void run() {
		GOval oval = new GOval(rgen.nextInt(1, 100), rgen.nextInt(1, 100));
		oval.setFilled(true);
		oval.setColor(rgen.nextColor());
		add(oval, 200, 200);

	}

}
