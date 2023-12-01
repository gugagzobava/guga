import acm.graphics.GRect;
import acm.program.GraphicsProgram;

public class grid extends GraphicsProgram {
	private int NUM_ROWS = 5;
	private int NUM_COLOUMNS = 5; 
	public void run() {
		int x = getWidth() / NUM_COLOUMNS;
		int y = getHeight() / NUM_ROWS;
		GRect rect = new GRect(x, y);
		for(int rows = 0; rows < NUM_ROWS; rows++){
			for (int coloumns = 0; coloumns < NUM_COLOUMNS; coloumns++){
				add(rect, rows * x, coloumns * y);
				
			}
		}
	}

}
