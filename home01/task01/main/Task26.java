package local.home01.task01.main;
/*
 * Найти площадь треугольника, две стороны которого равны а и b, 
 * а угол между этими сторонами у
 */

public class Task26 {
	
	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		int y = 45;
		
		double S = 1 / 2 * a * b * Math.sin(y);
		
		System.out.println("Площадь треуголника равна = " + S);
	}

}
