import java.awt.event.MouseEvent;

import acm.graphics.GLine;
import acm.graphics.GPoint;
import acm.program.ConsoleProgram;
import acm.program.GraphicsProgram;

public class midterm2021_3_texili extends GraphicsProgram {
	private GPoint lastPoint;
	private GLine line;

	public void run() {
		addMouseListeners();
		lastPoint = new GPoint(0, 0);
	}

	public void mousePressed(MouseEvent e) {
		line = new GLine(lastPoint.getX(), lastPoint.getY(), e.getX(), e.getY());
		add(line);
		lastPoint = new GPoint(e.getX(), e.getY());

	}
	public void mouseDragged(MouseEvent e) {
		
		lastPoint = new GPoint(e.getX(), e.getY());

	}
}
