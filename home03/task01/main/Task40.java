package local.home03.task01.main;
/*
 * Получить все числа, не превышающие заданного числа N, 
 * которые делятся без остатка на все свои цифры.
 */

public class Task40 {
	
	public static void main(String[] args) {
		
		int x = 100;
		
		for (int i = 10; i <= x; i++) {
		    int m = i;
		    boolean t = false;

		    while (m > 0) {

			if (m % 10 == 0) {
			    t = false;
			    break;
			}

			if (i % (m % 10) == 0) {
			    t = true;
			} 
			else {
			    t = false;
			    break;
			}

			m = m / 10;
		    }

		    if (t) {
			System.out.println(i);
		    }
		}
	}

}
