import java.awt.event.MouseEvent;

import acm.graphics.GLine;

import acm.program.GraphicsProgram;

public class problem42 extends GraphicsProgram {
	private GLine section;
	public void run() {
		addMouseListeners();
	}

	public void mousePressed(MouseEvent e) {
		GLine section = new GLine(e.getX(), e.getY(), e.getX(), e.getY());
		add(section);

	}

	public void mouseDragged(MouseEvent e) {
		// Update the second vertex as the mouse is dragged
		section.setEndPoint(e.getX(), e.getY());

	}
}
