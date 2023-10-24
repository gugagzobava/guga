import java.math.BigDecimal;

import acm.program.ConsoleProgram;

public class problem17 extends ConsoleProgram {
	public void run(){
		double a = readDouble("Enter real number: ");
		calculateInDouble(a);
		calculateInBigDecimal(a);
	}
		private void calculateInBigDecimal(double a) {
		BigDecimal decimal = new BigDecimal("" + a);
		
		int integerPart = decimal.intValue();
		BigDecimal franctionPart = decimal.remainder(BigDecimal.ONE);
		
		println("Integer part: " + integerPart);
		println("Franction part: " + franctionPart);
		
		
	}
		private void calculateInDouble(double a) {
			int integerPart = (int)a;
			double franctionPart = a - integerPart;
			
			println("Integer part: " + integerPart);
			println("Franction part: " + franctionPart);
			
		
	}
		
		
		
		
		
		
	}
	
	