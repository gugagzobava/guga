import java.awt.event.MouseEvent;

import acm.graphics.GLine;

import acm.program.GraphicsProgram;

public class problem42 extends GraphicsProgram{
	  private double startX;
	    private double startY;

	    public void run() {
	        addMouseListeners();
	    }

	    public void mousePressed(MouseEvent e) {
	        startX = e.getX();
	        startY = e.getY();
	    }

	    public void mouseDragged(MouseEvent e) {
	        double endX = e.getX();
	        double endY = e.getY();

	        GLine section = new GLine(startX, startY, endX, endY);
	        add(section);

	        startX = endX;
	        startY = endY;
	    }
//	public void run() {
//		addMouseListeners();
//	}
//	public void mouseDragged(MouseEvent e){
//		 GLine section = new GLine(e.getX(), e.getY(), e.getX(), e.getY());
//	        add(section);
//		
//	}

}
