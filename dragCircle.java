import java.awt.event.MouseEvent;

import acm.graphics.GOval;
import acm.graphics.GPoint;
import acm.program.GraphicsProgram;

public class dragCircle extends GraphicsProgram {
	private static final int RADIUS = 20;
	private int r = RADIUS;
	private GPoint curr;
	private GPoint start;
	private GOval ball;
	public void run(){
		addMouseListeners();
		ball = new GOval(getWidth() / 2 - r, getHeight() / 2 - r, 2 * r, 2 * r);
		add(ball);
	}
	public void mousePressed (MouseEvent e){
		start = new GPoint(e.getX(), e.getY());
	}
	public void mouseDragged (MouseEvent e){
		curr = new GPoint (e.getX(), e.getY());
		double diffx = start.getX() - getWidth() / 2;
		double diffy = start.getY() - getHeight() / 2;
		double dist = Math.sqrt(diffx * diffx + diffy * diffy);
		double diffx1 = curr.getX() - getWidth() / 2;
		double diffy1 = curr.getY() - getWidth() / 2;
		double dist1 = Math.sqrt(diffx1 * diffx1 + diffy1 * diffy1);
		if(dist1 > dist){
			r++;
		}
		if(dist1 < dist){
			remove(ball);
			ball.setSize(2*r, 2*r);
			add(ball, getWidth() / 2 - r, getHeight() / 2 - r);
		}
	}
}
