import java.awt.Color;

import acm.graphics.GOval;
import acm.program.GraphicsProgram;

public class triali extends GraphicsProgram{
	public void run() {
		GOval planet = new GOval (150, 150);
		planet.setFilled(true);
		planet.setColor(Color.RED);
		add(planet, getWidth() / 2 - 75, getHeight() / 2 - 75);
	}

}
