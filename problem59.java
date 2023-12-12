import acm.program.ConsoleProgram;

public class problem59 extends ConsoleProgram{
	public void run(){
		int[][] array = new int [5][7];
	}
	private boolean isFilled(int[][] array, int startX, int startY, int x, int y) {
		for(int i = startX; i < startX + x; i++){
			for (int j = startY; j < startY + y; j++){
				if(array[i][j] == 0){
					return false;
				}
			}
		}
		return true;
	}

}
