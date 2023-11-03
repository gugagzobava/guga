import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class targeti extends GraphicsProgram {
	public void run() {
		double r = 72;
		Color red = Color.RED;
		Color white = Color.WHITE;
		drawCircle(getWidth() / 2 - r, getHeight() / 2 - r , 2 * r, 2 * r, red);
//		drawCircle();
//		drawCircle();
	}

	private void drawCircle(double d, double e, double f, double g, Color paint) {
		GOval circle = new GOval (d, e, f, g);
		circle.setFilled(true);
		circle.setFillColor(paint);
		add(circle);
		
	}



	
}
