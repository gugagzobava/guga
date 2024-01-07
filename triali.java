import java.awt.Color;

import acm.graphics.GOval;
import acm.program.GraphicsProgram;

public class triali extends GraphicsProgram{
	public void run() {
		addSun();
		addEarth();
	}

	private void addEarth() {
		GOval earth = new GOval (10, 10);
		earth.setFilled(true);
		earth.setColor(Color.BLUE);
		add(earth, getWidth() / 2 - 75, getHeight() / 2 - 75);
		
	}

	private void addSun() {
		GOval sun = new GOval (150, 150);
		sun.setFilled(true);
		sun.setColor(Color.YELLOW);
		add(sun, getWidth() / 2 - 75, getHeight() / 2 - 75);
		
	}

}
