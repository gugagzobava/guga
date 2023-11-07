import acm.graphics.GOval;
import acm.program.GraphicsProgram;

public class problem40 extends GraphicsProgram{
	public void run() {
		GOval ball = new GOval (100, 100, getHeight() / 2 - 50, 0);
		add(ball);
		while (true){
			ball.move(1,0);
			pause(5);
		}
		
		
		
	}

}
