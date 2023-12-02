import acm.graphics.GOval;
import acm.program.GraphicsProgram;

public class dragCircle extends GraphicsProgram {
	private static final int RADIUS = 100;
	private int r = RADIUS;
	private GOval ball;
	public void run(){
		addMouseListeners();
		ball = new GOval(getWidth() / 2, getHeight() / 2, 2 * r, 2 * r);
		add(ball);
		
		
	}

}
