import java.awt.event.MouseEvent;

import acm.graphics.GLine;

import acm.program.GraphicsProgram;

public class problem42 extends GraphicsProgram{
	 GLine section = new GLine(e.getX(), e.getY(), e.getX(), e.getY());
	public void run() {
		addMouseListeners();
	}
	public void mousePressed(MouseEvent e){
		
	        add(section);
		
	}
	 public void mouseDragged(MouseEvent e) {
	        // Update the second vertex as the mouse is dragged
	        section.setEndPoint(e.getX(), e.getY());
	 }

}
