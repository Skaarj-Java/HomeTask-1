package local.home01.task01.main;
/*
 *  Дана длина ребра куба. 
 *  Найти площадь грани, площадь полной поверхности и объем этого куба.
 */

public class Task18 {
	
	public static void main(String[] args) {
		
		int a = 5;
		
		double S = Math.pow(a, 2);
		double Sall = S * 6;
		double V = Math.pow(a, 3);
		
		System.out.println("Площадь грани = " + S);
		System.out.println("площадь полной поверхности Sall = " + Sall);
		System.out.println("Объём куба = " + V);
		
		
		
		
		
		
	}

}