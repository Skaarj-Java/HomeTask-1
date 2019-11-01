package local.home03.task01.main;
/*
 *  Вычислить значения функции на отрезке [а,b] c шагом h:
 */

public class Task07 {
	
	public static void main(String [] args) {
		
		int a = -5;
		int b = 5;
		int y = 0;
		int h = 1;
		while(a <= b) {
			if(a > 2) {
				y = - a;
				
			}
			if(a <= 2) {
				y = a;
			}
			a = a + h;
			System.out.println("y = " + y);
		}
		
	}

}
