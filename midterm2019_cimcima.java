import java.awt.Color;
import java.awt.event.MouseEvent;

import acm.graphics.GOval;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

public class midterm2019_cimcima extends GraphicsProgram {
	private RandomGenerator rgen = RandomGenerator.getInstance();
	private static final int d = 50;
	private GOval ball;

	public void run() {
		addMouseListeners();

	}

	public void mouseClicked(MouseEvent e) {
		if (ball != null) {
			remove(ball);
		}
		ball = new GOval(e.getX() - d / 2, e.getY() - d / 2, d, d);
		add(ball);
		ball.setFilled(true);
		ball.setColor(rgen.nextColor());
		
		while (true) {
			int x = rgen.nextInt(1, 6);
			if (x == 1) {
				ball.setColor(Color.BLACK);
			}
			if (x == 2) {
				ball.setColor(Color.RED);
			}
			if (x == 3) {
				ball.setColor(Color.BLUE);
			}
			if (x == 4) {
				ball.setColor(Color.YELLOW);
			}
			if (x == 5) {
				ball.setColor(Color.GREEN);
			}
			pause(1000);
		}

	}
}