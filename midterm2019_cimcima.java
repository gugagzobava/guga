import java.awt.Color;
import java.awt.event.MouseEvent;

import acm.graphics.GOval;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

public class midterm2019_cimcima extends GraphicsProgram {
	private RandomGenerator rgen = RandomGenerator.getInstance();
	private static final int d = 50;
	private GOval ball;

	public void run() {
		addMouseListeners();

	}

	public void mouseClicked(MouseEvent e) {
		if (ball != null) {
			remove(ball);
		}
		ball = new GOval(e.getX() - d / 2, e.getY() - d / 2, d, d);
		add(ball);
		ball.setFilled(true);
		ball.setColor(rgen.nextColor());
		// int x = rgen.nextInt(1,5);
		 for (int i = 0; i < 5; i++) {
	            int x = rgen.nextInt(1, 6); // Change to 6 to include 5 as a possibility
	            switch (x) {
	                case 1:
	                    ball.setColor(Color.BLACK);
	                    break;
	                case 2:
	                    ball.setColor(Color.RED);
	                    break;
	                case 3:
	                    ball.setColor(Color.BLUE);
	                    break;
	                case 4:
	                    ball.setColor(Color.YELLOW);
	                    break;
	                case 5:
	                    ball.setColor(Color.GREEN);
	                    break;
	            }
	            pause(1000);
	        }
	    }
	}
//		while (true) {
//			int x = rgen.nextInt(1, 5);
//			if (x == 1) {
//				ball.setColor(Color.BLACK);
//			}
//			if (x == 2) {
//				ball.setColor(Color.RED);
//			}
//			if (x == 3) {
//				ball.setColor(Color.BLUE);
//			}
//			if (x == 4) {
//				ball.setColor(Color.YELLOW);
//			}
//			if (x == 5) {
//				ball.setColor(Color.GREEN);
//break;
//			}
//			pause(1000);
//		}
//
//	}
//}