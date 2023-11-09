import acm.graphics.GOval;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

public class problem41 extends GraphicsProgram {
	private static final int RADIUS = 20;
	private static final int DELAY = 5;
	private static final double V_X_MAX = 3;
	private static final double V_Y_MAX = 3;
	private RandomGenerator rgen = RandomGenerator.getInstance();
	public void run() {
		GOval ball = new GOval(2 * RADIUS, 2 * RADIUS);
		ball.setFilled(true);
		add(ball, getWidth() / 2 - RADIUS, getHeight() / 2 - RADIUS);
		
		double vx = rgen.nextDouble(1, V_X_MAX);
		double vy = rgen.nextDouble(1, V_Y_MAX);
		while (true) {
			ball.move(vx, vy);
			pause(DELAY);
		}
	}

}
