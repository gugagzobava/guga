import java.awt.event.MouseEvent;

import acm.graphics.GOval;
import acm.program.GraphicsProgram;

public class problem44 extends GraphicsProgram {
	private GOval oval;
	private static final int d = 50;

	public void run() {
		addMouseListeners();
	}

	 public void mouseClicked(MouseEvent e) {
	        oval = new GOval(d, d);
	        oval.setFilled(true);
	        add(oval, e.getX(), e.getY());
	        moveOvalDown();
	        
	        }
	 

	private void moveOvalDown() {
		for (int i = 0; i < getHeight(); i++) {
            oval.move(0, 1);
            pause(5);
		
	}
	}
}
