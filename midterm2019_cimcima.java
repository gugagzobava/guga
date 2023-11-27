import java.awt.Color;
import java.awt.event.MouseEvent;

import acm.graphics.GObject;
import acm.graphics.GOval;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

public class midterm2019_cimcima extends GraphicsProgram {
	private RandomGenerator rgen = RandomGenerator.getInstance();
	private static final int d = 50;
	private GOval ball;
	private GObject clickedObject = null;

	public void run() {
		addMouseListeners();
		while (true) {
			if (clickedObject != null) {
				while (clickedObject.getColor() != Color.GREEN) {
					Color color = flicking();
					clickedObject.setColor(color);
					pause(1000);
				}
			}
		}
	}

	public void mouseClicked(MouseEvent e) {
		GObject object = getElementAt(e.getX(), e.getY());
		if(object == null){
		ball = new GOval(e.getX() - d / 2, e.getY() - d / 2, d, d);
		add(ball);
		ball.setFilled(true);
		ball.setColor(flicking());
		
		} else {
			clickedObject = object;
		}
		

	}

	private Color flicking() {
		int x = rgen.nextInt(5);
		if (x == 1) {
			ball.setColor(Color.BLACK);
		}
		if (x == 2) {
			ball.setColor(Color.RED);
		}
		if (x == 3) {
			ball.setColor(Color.BLUE);
		}
		if (x == 4) {
			ball.setColor(Color.YELLOW);
		}
		if (x == 5) {
			ball.setColor(Color.GREEN);
		}
	
	
		return null;
	}

		
}