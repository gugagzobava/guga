import acm.graphics.GRect;
import acm.program.GraphicsProgram;

public class grid extends GraphicsProgram {
	private int NUM_ROWS = 5;
	private int NUM_COLOUMNS = 5; 
	public void run() {
		GRect rect = new GRect(getWidth() / NUM_COLOUMNS, getHeight() / NUM_ROWS);
		add(rect);
	}

}
