package local.home03.task01.main;

public class Task13 {
	
	public static void main(String [] args) {
		
		double a = -5;
		int b = 5;
		double h = 0.5;
		double y;
		
		System.out.println(" x    " + "  y");
		while(a <= b) {
			y = 5 - a * a / 2;
			System.out.println(a + " " + "| " + y);
			a = a + h;
			
		}
		
	}
	

}