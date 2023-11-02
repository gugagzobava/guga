import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class ierarqia extends GraphicsProgram {
	/** Width of each rectangle in pixels */
	private static final double RECT_WIDTH = 100;

	/** height of each rectangle in pixels */
	private static final double RECT_HEIGHT = 30;

	private static final double GAP_LENGTH = 30;

	private static final double BIG_GAP_LENGTH = 30;

	public void run() {
		drawRect(getWidth() / 2 - RECT_WIDTH / 2, getHeight() / 2, RECT_WIDTH, RECT_HEIGHT); // MidRect
		drawRect(getWidth() / 2 - RECT_WIDTH / 2, getHeight() / 2 - RECT_HEIGHT * 3 / 2 - BIG_GAP_LENGTH, RECT_WIDTH,
				RECT_HEIGHT); // UpperRect
		drawRect(getWidth() / 2 - RECT_WIDTH * 3 / 2 - GAP_LENGTH, getHeight() / 2, RECT_WIDTH, RECT_HEIGHT); // LeftRect
		drawRect(getWidth() / 2 + RECT_WIDTH / 2 + GAP_LENGTH, getHeight() / 2, RECT_WIDTH, RECT_HEIGHT); // RightRect
		connect(getWidth() / 2 + RECT_WIDTH + GAP_LENGTH, getHeight() / 2, getWidth() / 2,
				getHeight() / 2 - RECT_HEIGHT * 1 / 2 - BIG_GAP_LENGTH); // connectsrighttoupper

		connect(getWidth() / 2 - RECT_WIDTH - GAP_LENGTH, getHeight() / 2, getWidth() / 2,
				getHeight() / 2 - RECT_HEIGHT * 1 / 2 - BIG_GAP_LENGTH); // connectslefttoupper
		connect(getWidth() / 2, getHeight() / 2, getWidth() / 2,
				getHeight() / 2 - RECT_HEIGHT * 1 / 2 - BIG_GAP_LENGTH); // connectmidtoupper

	}

	private void connect(double i, double j, double k, double l) {
		GLine line = new GLine(i, j, k, l);
		add(line);
		
	}

	private void drawRect(double i, double j, double rectWidth, double rectHeight) {
		GRect rect = new GRect(i, j, rectWidth, rectHeight);
		add(rect);

	}

	private void connectMidToUpper() {
		double midRectWidth = getWidth() / 2;
		double midRectHeight = getHeight() / 2;
		double upperRectWidth = getWidth() / 2;
		double upperRectHeight = getHeight() / 2 - RECT_HEIGHT * 1 / 2 - BIG_GAP_LENGTH;
		GLine line = new GLine(midRectWidth, midRectHeight, upperRectWidth, upperRectHeight);
		add(line);

	}

}
