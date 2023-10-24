import stanford.karel.Karel;

public class problem02 extends Karel {
	public void run(){
		moveToTheBeeperPile();
		pickTenBeepers();
		move();
		putTenBeepers();
		
		
		
		
		
	}
	private void putTenBeepers() {
		for (int i = 0; i<10; i++){
			putBeeper();
		}
		
	}
	private void pickTenBeepers() {
		for (int i = 0; i<10; i++){
			pickBeeper();
		}
		
	}
	private void moveToTheBeeperPile() {
		for (int i = 0; i<4; i++){
			move();
		}
		}
	}
