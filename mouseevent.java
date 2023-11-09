import java.awt.Color;

import acm.graphics.GObject;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;
import javafx.scene.input.MouseEvent;

public class mouseevent extends GraphicsProgram{
	public void run() {
		GRect rect = new GRect (100, 100);
		rect.setFilled(true);
		add(rect);
		
		GRect rect2 = new GRect (100, 100);
		rect2.setFilled(true);
		add(rect2, 200, 200);
		
		addMouseListeners();
	}
	public void mouseClicked (MouseEvent e) {
//		e.getY();
		
		GObject obj = getElementAt(e.getX(), e.getY());
		if (obj != null){
			obj.setColor(Color.RED);
		}
	}

}
