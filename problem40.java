import acm.graphics.GOval;
import acm.program.GraphicsProgram;

public class problem40 extends GraphicsProgram {
	private static final int r = 25;

	public void run() {
		GOval ball = new GOval(2 * r, 2 * r);
		ball.setFilled(true);
		add(ball, 0, getHeight() / 2 - r);
		int dx = 1;
		while (true) {
			ball.move(dx, 0);
			pause(5);
			if (ball.getX() == 0 || ball.getX() + 2 * r == getWidth()) {
				dx = -dx;
			}
		}
	}

}
