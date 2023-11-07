import acm.graphics.GOval;
import acm.program.GraphicsProgram;

public class problem40 extends GraphicsProgram {
	public void run() {
		GOval ball = new GOval(100, 100);
		add(ball, 0, getHeight() / 2 - 50);
		double dx = 1;
		while (true) {
			ball.move(dx, 0);
			if (ball.getX() <= 0 || ball.getX() + ball.getWidth() / 2 >= getWidth()) {
				dx = -dx;
			}

			pause(5);

		}

	}

}
