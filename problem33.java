import acm.graphics.GOval;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

public class problem33 extends GraphicsProgram {
	private RandomGenerator rgen = RandomGenerator.getInstance();

	public void run() {
		int d = rgen.nextInt(100, 500);
		GOval oval = new GOval(d, d);
		oval.setFilled(true);
		oval.setColor(rgen.nextColor());
		add(oval, getWidth() / 2 - d / 2, getHeight() / 2 - d / 2);

	}

}
