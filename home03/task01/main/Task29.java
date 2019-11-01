package local.home03.task01.main;
/*
 * Даны два числа. Определить цифры, 
 * входящие в запись как первого так и второго числа.
 */

public class Task29 {
	
	public static void main(String[] args) {
		
		int x = 234;
		int y = 345;
		
		int n = y;
		int m = x;
		
		while(x > 0) {
			m = x % 10;
			
			while(y > 0) {
				n = y % 10;
				if (m == n) {
					System.out.println("Цифра " + m + " входит в состав обеих чисел");
					break;
				}
				y = y / 10;
			}
			x = x / 10;
		}
		
	}
	

}