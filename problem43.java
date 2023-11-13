import java.awt.event.MouseEvent;

import acm.graphics.GOval;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

public class problem43 extends GraphicsProgram{
	private RandomGenerator rgen = RandomGenerator.getInstance();
    private GOval oval;
    double d = rgen.nextDouble(50, 100);

    public void run() {
        addMouseListeners();
    }

    public void mousePressed(MouseEvent e) {
        oval = new GOval(d, d);
        oval.setFilled(true);
        oval.setColor(rgen.nextColor());
        add(oval, e.getX(), e.getY());

        
    }

    public void mouseDragged(MouseEvent e) {
            double x = e.getX() - d / 2;
            double y = e.getY() - d / 2;
            oval.setLocation(x, y);
           
        }
    
   
}