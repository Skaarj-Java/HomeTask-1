package local.home01.task01.main;
/*
 * Дана величина  А,  выражающая объем информации в байтах.  
 * Перевести  А  в более крупные единицы  измерения информации.
 */

public class Task34 {
	
	public static void main(String[] args) {
		
		double A = 1;
		
		double B = A / 1024;
		double C = B / 1024;
		double D = C / 1024;
		
		System.out.println("B = " + B);	
		System.out.println("C = " + C);
		System.out.println("D = " + D);
	}

}
