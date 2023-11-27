import java.awt.event.MouseEvent;

import acm.graphics.GOval;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

public class midterm2019_cimcima extends GraphicsProgram{
	private RandomGenerator rgen = RandomGenerator.getInstance();
	private static final int d = 50;
	private GOval ball;
	public void run(){
		addMouseListeners();
		
	}
	public void mouseClicked(MouseEvent e){
		ball = new GOval(e.getX() - d / 2, e.getY() - d / 2, d, d);
		add(ball);
	}

}
