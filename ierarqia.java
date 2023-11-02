import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class ierarqia extends GraphicsProgram {
	/** Width of each rectangle in pixels */
	private static final double RECT_WIDTH = 100;

	/** height of each rectangle in pixels */
	private static final double RECT_HEIGHT = 30;
	/** Gap length between rectangles in pixels */
	private static final double GAP_LENGTH = 30;
	/** Bigger gap length between rectangles in pixels */
	private static final double BIG_GAP_LENGTH = 200;

	public void run() {
		//draw each rectangle
		drawRect(getWidth() / 2 - RECT_WIDTH / 2, getHeight() / 2, RECT_WIDTH, RECT_HEIGHT, "ConsoleProgram"); // MidRect
		drawRect(getWidth() / 2 - RECT_WIDTH / 2, getHeight() / 2 - RECT_HEIGHT * 3 / 2 - BIG_GAP_LENGTH, RECT_WIDTH,
				RECT_HEIGHT, "Program"); // UpperRect
		drawRect(getWidth() / 2 - RECT_WIDTH * 3 / 2 - GAP_LENGTH, getHeight() / 2, RECT_WIDTH, RECT_HEIGHT, "GraphicsProgram"); // LeftRect
		drawRect(getWidth() / 2 + RECT_WIDTH / 2 + GAP_LENGTH, getHeight() / 2, RECT_WIDTH, RECT_HEIGHT, "DialogProgram"); // RightRect
		//connect upper rectangle to others
		connect(getWidth() / 2 + RECT_WIDTH + GAP_LENGTH, getHeight() / 2, getWidth() / 2,
				getHeight() / 2 - RECT_HEIGHT * 1 / 2 - BIG_GAP_LENGTH); // connects right to upper

		connect(getWidth() / 2 - RECT_WIDTH - GAP_LENGTH, getHeight() / 2, getWidth() / 2,
				getHeight() / 2 - RECT_HEIGHT * 1 / 2 - BIG_GAP_LENGTH); // connects left to upper
		connect(getWidth() / 2, getHeight() / 2, getWidth() / 2,
				getHeight() / 2 - RECT_HEIGHT * 1 / 2 - BIG_GAP_LENGTH); // connects mid to upper

	}

	private void connect(double i, double j, double k, double l) {
		//create and add line which connects 2 points
		GLine line = new GLine(i, j, k, l);
		add(line);

	}

	private void drawRect(double i, double j, double rectWidth, double rectHeight, String text) {
		GRect rect = new GRect(i, j, rectWidth, rectHeight);
		add(rect);
		//add label to write text in the centre of each rectangle
		GLabel label = new GLabel(text);
		double labelX = i + (rectWidth - label.getWidth()) / 2;
		double labelY = j + (rectHeight + label.getAscent()) / 2;
		add(label, labelX, labelY);

	}

}
