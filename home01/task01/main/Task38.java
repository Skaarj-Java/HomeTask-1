package local.home01.task01.main;

public class Task38 {
	
	public static void main(String[] args) {
		
	int x = 5;
	int y = 0;
	// a) //
	if(x <= 4 && x >= -4 && y >= 0 && y <= 4 - Math.abs(x) ) {
		System.out.println("1.true");
	}
	else {
		System.out.println("1.false");
		
	}
	// b) //
	
	if(x <= 4 && x >= 4 && y >= -3 && y <= 0 || x >= -2 && x <= 2 && y >= 0 && y <= 4) {
		System.out.println("2.true");
	}
	else {
		System.out.println("2.false");
	}
	// c) //
	
	if(y >= 0 && x >= 0 && x * x + y * y <= 4 * 4 || y <= 0 && x >= 0 && x * x + y * y <= 5 * 5) {
		System.out.println("2.true");
	}
	else {
		System.out.println("2.false");
	}
	}

}
