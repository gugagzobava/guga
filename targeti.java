import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class targeti extends GraphicsProgram {
	private static final double r = 72;
	private static final double a = 46.7716535433;
	private static final double b = 21.5433070866;

	public void run() {
		Color red = Color.RED;
		Color white = Color.WHITE;
		drawCircle(getWidth() / 2 - r, getHeight() / 2 - r, 2 * r, 2 * r, red);
		drawCircle(getWidth() / 2 - a, getHeight() / 2 - a, 2 * a, 2 * a, white);
		drawCircle(getWidth() / 2 - b, getHeight() / 2 - b, 2 * b, 2 * b, red);
	}

	private void drawCircle(double d, double e, double f, double g, Color paint) {
		GOval circle = new GOval(d, e, f, g);
		circle.setFilled(true);
		circle.setColor(paint);
		add(circle);

	}

}
