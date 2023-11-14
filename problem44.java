import java.awt.event.MouseEvent;

import acm.graphics.GOval;
import acm.program.GraphicsProgram;

public class problem44 extends GraphicsProgram {
	private GOval oval = new GOval(d, d);;
	private static final int d = 50;

	public void run() {
		addMouseListeners();
		while (true) {
			oval.move(0, 1);
			pause(10);
		}
	}

	public void mouseClicked(MouseEvent e) {
		oval.setFilled(true);
		add(oval, e.getX() - d / 2, e.getY() - d / 2);

	}

}
