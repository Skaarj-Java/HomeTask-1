package local.home02.task01.main;
/*
 *  Вычислить значение функции
 */

public class Task36 {
	
	public static void main(String[] args) {
		
		int x = 5;
		double F;
		
		if(x <= 3) {
			F = x * x - 3 * x + 9;
			System.out.println(" Значение функции равно " + F);
		}
		if(x > 3) {
			F = 1 / (Math.pow(x, 3) + 6);
			System.out.println(" Значение функции равно " + F);
		}
	}
		

}