package local.home02.task01.main;
/*
 * Вычислить значение функции
 */

public class Task37 {
	
	public static void main(String[] args) {
		
		int x = 6;
		double F;
		
		if(x >= 3) {
			F = -x * x + 3 * x + 9;
			System.out.println(" Значение функции равно " + F);
		}
		if(x < 5) {
			F = 1 / (Math.pow(x, 3) - 6);
			System.out.println(" Значение функции равно " + F);
		}
		
	}

}
