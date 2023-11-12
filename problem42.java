import java.awt.event.MouseEvent;

import acm.graphics.GOval;
import acm.program.GraphicsProgram;

public class problem42 extends GraphicsProgram{
	public void run() {
		addMouseListeners();
	}
	public void mousePressed(MouseEvent e){
		 GOval dot1 = new GOval(e.getX(), e.getY(), 5, 5);
         add(dot1);
         GOval dot2 = new GOval(e.getX(), e.getY(), 5, 5);
         add(dot2);
		
	}

}
