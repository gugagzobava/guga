import java.awt.Color;

import acm.graphics.GRect;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

public class grid extends GraphicsProgram {
	private RandomGenerator rgen = RandomGenerator.getInstance();
	private int NUM_ROWS = 5;
	private int NUM_COLOMNS = 5;

	public void run() {
		double x = getWidth() / NUM_COLOMNS;
		double y = getHeight() / NUM_ROWS;	
		for (int rows = 0; rows < NUM_ROWS; rows++) {
			for (int colomns = 0; colomns < NUM_COLOMNS; colomns++) {
				GRect rect = new GRect(x, y);
				Color color = getRandomColor();
				rect.setFilled(true);
				rect.setColor(color);
				rect.setFillColor(color);
				add(rect, colomns * x, rows * y);
			
			}
		}
	}

	private Color getRandomColor() {
		int randomColor = rgen.nextInt(0, 2);
		if(randomColor == 0){
			return Color.GREEN;
		}
		if(randomColor == 1){
			return Color.BLUE;
		}
		return Color.YELLOW;
	}

}
