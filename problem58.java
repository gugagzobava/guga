import java.lang.reflect.Array;

import acm.program.ConsoleProgram;

public class problem58 extends ConsoleProgram {
	public void run(){
		int[][] array = new int [5][5];
		magicMatrix(array);
		
	}
	private boolean magicMatrix(int[][] array) {
		for(int i = 0; i < array.length; i++){
			if(array.length != array[i].length){
				return false;
			}
		}
		int n = array.length;
		boolean[] seen = new boolean [n * n];
		for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++){
				if(array[i][j] < 1 || array[i][j] > n * n || seen[array[i][j] - 1]){
					return false;
				}
				seen[array[i][j] - 1] = true;
			}
		}
		return true;
		
	}
}
