import java.awt.event.MouseEvent;

import acm.graphics.GOval;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

public class problem43 extends GraphicsProgram{
	private RandomGenerator rgen = RandomGenerator.getInstance();
	private GOval oval;
	public void run(){
		addMouseListeners();
		double d = rgen.nextDouble(50, 100);
		oval = new GOval(d, d);
		oval.setFilled(true);
		oval.setColor(rgen.nextColor());
		double x = rgen.nextDouble(0, getWidth() - d);
		double y = rgen.nextDouble(0, getHeight() - d);
		add(oval, x, y);
		
	}
	public void mouseDragged(MouseEvent e){
		
		oval.move(e.getX(), e.getY());
		
	}

}
