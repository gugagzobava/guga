import java.awt.event.MouseEvent;

import acm.graphics.GOval;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

public class problem43 extends GraphicsProgram{
	private RandomGenerator rgen = RandomGenerator.getInstance();
    private GOval oval;
    private double lastX;
    private double lastY;

    public void run() {
        addMouseListeners();
    }

    public void mousePressed(MouseEvent e) {
        double d = rgen.nextDouble(50, 100);
        oval = new GOval(d, d);
        oval.setFilled(true);
        oval.setColor(rgen.nextColor());
        add(oval, e.getX(), e.getY());

        lastX = e.getX();
        lastY = e.getY();
    }

    public void mouseDragged(MouseEvent e) {
        if (oval != null) {
            double dx = e.getX() - lastX;
            double dy = e.getY() - lastY;
            oval.move(dx, dy);
            lastX = e.getX();
            lastY = e.getY();
        }
    }

    public void mouseReleased(MouseEvent e) {
        oval = null;
    }
//	private RandomGenerator rgen = RandomGenerator.getInstance();
//	private GOval oval;
//	public void run(){
//		addMouseListeners();
//	}
//		public void mousePressed(MouseEvent e){
//		double d = rgen.nextDouble(50, 100);
//		oval = new GOval(d, d);
//		oval.setFilled(true);
//		oval.setColor(rgen.nextColor());
//		add(oval, e.getX(), e.getY());
//		
//	}
//	public void mouseDragged(MouseEvent e){
//		
//		oval.move(e.getX(), e.getY());
//		
//	}
//	 public void mouseReleased(MouseEvent e) {
//	        oval = null;
//	    }

}
