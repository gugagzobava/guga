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
		       
		        }

		       
		        }
		    
		
		


	