import java.awt.event.MouseEvent;

import acm.graphics.GOval;
import acm.program.GraphicsProgram;

public class problem44 extends GraphicsProgram {
	private GOval oval;
	private static final int d = 50;

	public void run() {
		addMouseListeners();
	}

	 public void mouse(MouseEvent e) {
	        oval = new GOval(d, d);
	        oval.setFilled(true);
	        add(oval, e.getX(), e.getY());
	        while(oval.getY() < getHeight()){
	        	oval.move(0, 1);
	        	pause(5);
	        }

	 }
}
