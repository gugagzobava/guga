import acm.graphics.GOval;
import acm.program.GraphicsProgram;

public class problem40 extends GraphicsProgram{
	public void run() {
		GOval ball = new GOval (100, 100);
		add(ball, 0, getHeight() / 2 - 50);
		while (true){
			ball.move(1,0);
			pause(5);
		}
		
		
		
	}

}
