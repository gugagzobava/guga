import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class targeti extends GraphicsProgram {
	public void run() {
		double r = 72;
		drawCircle(getWidth() / 2 - r, getHeight() / 2 - r , 2 * r, 2 * r);
//		drawCircle();
//		drawCircle();
	}

	private void drawCircle(double d, double e, double f, double g) {
		GOval circle = new GOval (d, e, f, g);
		add(circle);
		
	}



	
}
