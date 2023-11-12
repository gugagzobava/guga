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
	        add(oval, e.getX() - d / 2, e.getY() - d / 2);
	        moveOvalDown();
	    }

	    private void moveOvalDown() {
	        while (oval.getY() < getHeight() - d) {
	            oval.move(0, 1);
	            pause(100);
	        }
	    }
//	private GOval oval;
//	private static final int d = 50;
//
//	public void run() {
//		addMouseListeners();
//	}
//
//	public void mouseClicked(MouseEvent e) {
//		oval = new GOval(d, d);
//		oval.setFilled(true);
//		add(oval, e.getX() - d / 2, e.getY() - d / 2);
//		moveOvalDown();
//
//	}
//
//	private void moveOvalDown() {
//		double i = oval.getY();
//		for (i = 0; i < getHeight() ; i++) {
//			oval.move(0, 1);
//			pause(100);
//
//		}
//	}
}
