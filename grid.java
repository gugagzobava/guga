import acm.graphics.GRect;
import acm.program.GraphicsProgram;

public class grid extends GraphicsProgram {
	private int NUM_ROWS = 5;
	private int NUM_COLOMNS = 5;

	public void run() {
		double x = getWidth() / NUM_COLOMNS;
		double y = getHeight() / NUM_ROWS;
		for (int rows = 0; rows < NUM_ROWS; rows++) {
			for (int colomns = 0; colomns < NUM_COLOMNS; colomns++) {
				GRect rect = new GRect(x, y);
				add(rect, rows * x, colomns * y);

			}
		}
	}

}
