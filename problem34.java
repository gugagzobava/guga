
import acm.graphics.GOval;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

public class problem34 extends GraphicsProgram {
	private RandomGenerator rgen = RandomGenerator.getInstance();

	public void run() {
		for (int i = 0; i < 1000; i++) {
			int d = rgen.nextInt(100, 300);
			GOval oval = new GOval(d, d);
			oval.setFilled(true);
			oval.setColor(rgen.nextColor());
			double x = rgen.nextDouble(0, getWidth() - d);
			double y = rgen.nextDouble(0, getHeight() - d);
			add(oval, x, y);

		}

	}

}
