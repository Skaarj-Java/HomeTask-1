package local.home01.task01.main;
/*
 * Найти площадь кольца, 
 * внутренний радиус которого равен r, а внешний — R (R> r)
 */

public class Task23 {
	
	public static void main(String[] args) {
		
		
		int R = 10;
		int r = 5;
				
		double S = Math.PI * Math.pow(R, 2);
		double s = Math.PI * Math.pow(r, 2);
		double sk = S - s;
		
		System.out.println(" Площадь кольца = " + sk);
		
		
	}

}