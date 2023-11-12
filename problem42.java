import java.awt.event.MouseEvent;

import acm.graphics.GLine;

import acm.program.GraphicsProgram;

public class problem42 extends GraphicsProgram{
	public void run() {
		addMouseListeners();
	}
	public void mouseDragged(MouseEvent e){
		 GLine section = new GLine(e.getX(), e.getY(), e.getX(), e.getY());
	        add(section);
		
	}

}
