import java.awt.Color;

import acm.graphics.GRect;
import acm.program.GraphicsProgram;

public class problem14 extends GraphicsProgram {
	private static final double headWidth = 200;
	private static final double headHeight = 200;
	private static final double eyeWidth = 50;
	private static final double eyeHeight = 50;
	private static final double mouthWidth = 150;
	private static final double mouthHeight = 30;

	public void run() {
		drawHead();
		drawLeftEye();
		drawRightEye();
		drawMouth();
	}

	private void drawMouth() {
		double x = getWidth() / 2 - mouthWidth / 2;
		double y = getHeight() / 2 + headHeight / 4 - mouthHeight / 2;
		GRect mouth = new GRect(x, y, mouthWidth, mouthHeight);
		mouth.setFilled(true);
		mouth.setFillColor(Color.white);
		mouth.setColor(Color.white);
		add(mouth);
	}

	private void drawRightEye() {
		double x = getWidth() / 2 + headWidth / 4 - eyeWidth / 2;
		double y = getHeight() / 2 - headHeight / 4 - eyeHeight / 2;
		GRect eye = new GRect(x, y, eyeWidth, eyeHeight);
		eye.setFilled(true);
		eye.setFillColor(Color.YELLOW);
		eye.setColor(Color.yellow);
		add(eye);
	}

	private void drawLeftEye() {
		double x = getWidth() / 2 - headWidth / 4 - eyeWidth / 2;
		double y = getHeight() / 2 - headHeight / 4 - eyeHeight / 2;
		GRect eye = new GRect(x, y, eyeWidth, eyeHeight);
		eye.setFilled(true);
		eye.setFillColor(Color.YELLOW);
		eye.setColor(Color.yellow);
		add(eye);

	}

	private void drawHead() {
		double x = getWidth() / 2 - headWidth / 2;
		double y = getHeight() / 2 - headHeight / 2;
		GRect head = new GRect(x, y, headWidth, headHeight);
		head.setFilled(true);
		head.setFillColor(Color.GRAY);
		head.setColor(Color.GRAY);
		add(head);

	}
}
