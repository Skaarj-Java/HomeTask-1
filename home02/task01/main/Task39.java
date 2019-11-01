package local.home02.task01.main;
/*
 * Вычислить значение функции
 */

public class Task39 {
	
public static void main(String[] args) {
		
		int x = 4;
		double F;
		
		if(x >= 8) {
			F = -x * x + x - 9;
			System.out.println(" Значение функции равно " + F);
		}
		if(x < 8) {
			F = 1 / (Math.pow(x, 4) - 6);
			System.out.println(" Значение функции равно " + F);
		}
		
	}
	

}
