package local.home02.task01.main;
/*
 * Вычислить значение функции
 */

public class Task38 {
	
public static void main(String[] args) {
		
		int x = 1;
		double F;
		
		if(x >= 0 && x <= 3) {
			F = x * x;
			System.out.println(" Значение функции равно " + F);
		}
		if(x > 3 || x < 0) {
			F = 4;
			System.out.println(" Значение функции равно " + F);
		}
		
	}

}
