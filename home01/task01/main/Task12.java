package local.home01.task01.main;
/*
 * Вычислить расстояние между двумя точками
 * с данными координатами (х1, у1)и (x2, у2)
 */

public class Task12 {
	
	public static void main(String[] args) {
		
		int x1= 4;
		int x2 = 8;
		int y1 = 3;
		int y2 = 6;
		
		double S = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
		
		System.out.println("Расстояние между двумя точками = " + S);
		
				
		
	}

}

