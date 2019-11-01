package local.home03.task01.main;
/*
 *  Вычислить значения функции на отрезке [а,b] c шагом h:
 */

public class Task08 {
	
	public static void main(String [] args) {
		
		int a = -3;
		int b = 20;
		int y = 0;
		int c = 100;
		int h = 2;
		while(a <= b) {
			if(a == 15) {
				y = (a + c) * 2;
				
			}
			if(a != 15) {
				y = (a - c) * 2;
			}
			a = a + h;
			System.out.println("y = " + y);
		}
		
		
	}
	

}
