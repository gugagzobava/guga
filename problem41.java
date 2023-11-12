import java.awt.event.MouseEvent;

import acm.graphics.GOval;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

public class problem41 extends GraphicsProgram {
	private RandomGenerator rgen = RandomGenerator.getInstance();
	private static final int d = 20;

	public void run() {
		addMouseListeners();

	}

	public void mouseMoved(MouseEvent e) {
		double x = e.getX();
		double y = e.getY();
		GOval oval = new GOval(x - d / 2, y - d / 2, d, d);
		oval.setFilled(true);
		oval.setColor(rgen.nextColor());
		add(oval);

	}

	public void mouseClicked(MouseEvent e) {
		if (e.getClickCount() == 3) {
			removeAll(); // Clear the canvas
		}
	}
}
