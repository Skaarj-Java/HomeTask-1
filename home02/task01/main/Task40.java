package local.home02.task01.main;
/*
 * Вычислить значение функции
 */

public class Task40 {
	
public static void main(String[] args) {
		
		int x = 2;
		double F;
		
		if(x <= 13) {
			F = -x * x * x + 9;
			System.out.println(" Значение функции равно " + F);
		}
		if(x > 13) {
			F = -(3 / (x + 1));
			System.out.println(" Значение функции равно " + F);
		}
		
	}
	

}
