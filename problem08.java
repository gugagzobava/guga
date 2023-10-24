
import stanford.karel.SuperKarel;

public class problem08 extends SuperKarel {
	public void run() {
		move();
		transportAllBeepersToForth();
		move();
		minusBeepersOnNeighboringCells();
		
	}
	private void minusBeepersOnNeighboringCells() {
		while (beepersPresent()) {
			pickBeeper();
			move();
			pickBeeper();
			turnAround();
			move();
			turnAround();
		}
	}
	
	private void transportAllBeepersToForth() {
		while (beepersPresent()) {
			pickBeeper();
			move();
			move();
			putBeeper();
			turnAround();
			move();
			move();
			turnAround();
		}
	}
		
	
	
}