import java.awt.Color;
import java.awt.event.MouseEvent;

import acm.graphics.GRect;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

public class grid extends GraphicsProgram {
	private RandomGenerator rgen = RandomGenerator.getInstance();
	private int NUM_ROWS = 5;
	private int NUM_COLOMNS = 5;
	private GRect firstClicked = null;
	private GRect secondClicked = null;

	public void run() {
		drawGrid();
		addMouseListeners();

	}

	public void mouseClicked(MouseEvent e) {
		GRect obj = (GRect) getElementAt(e.getX(), e.getY());
		if (obj == null) {
			return;
		}
		if (firstClicked == null) {
			firstClicked = obj;
		} else if (secondClicked == null) {
			secondClicked = obj;
		}
		Color firstRectColor = firstClicked.getColor();
		Color firstRectFillColor = firstClicked.getFillColor();

		Color secondRectColor = secondClicked.getColor();
		Color secondRectFillColor = secondClicked.getFillColor();

		if (firstRectColor.equals(secondRectColor) && firstRectFillColor.equals(secondRectFillColor)) {
			remove(firstClicked);
			remove(secondClicked);

			// Clear selections for the next click
			firstClicked = null;
			secondClicked = null;
		} else {
			// If not a match, reset selections
			firstClicked = null;
			secondClicked = null;
		}
	}

	private void drawGrid() {
		double x = getWidth() / NUM_COLOMNS;
		double y = getHeight() / NUM_ROWS;
		for (int rows = 0; rows < NUM_ROWS; rows++) {
			for (int colomns = 0; colomns < NUM_COLOMNS; colomns++) {
				GRect rect = new GRect(x, y);
				Color fillColor = getRandomColor();
				Color borderColor = getRandomColor();
				rect.setColor(fillColor);
				rect.setFilled(true);
				rect.setFillColor(borderColor);
				add(rect, colomns * x, rows * y);

			}
		}

	}

	private Color getRandomColor() {
		int randomColor = rgen.nextInt(0, 2);
		if (randomColor == 0) {
			return Color.GREEN;
		}
		if (randomColor == 1) {
			return Color.BLUE;
		}
		return Color.YELLOW;
	}

}
