package local.home01.task01.main;
/*
 * Найти площадь равнобедренной трапеции
 * с основаниями а и b и углом α при большем основании а
 */

public class Task24 {
	
	public static void main(String[] args) {
		
		int α = 45;
		int a = 6;
		int b = 4;
		
		double h = (a - b) / 2 * Math.tan(α);
		double t = ((a + b) * h) / 2;
		
		System.out.println("Площадь равнобедренной трапеции = " + t);
		
		
	}
	

}
