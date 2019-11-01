package local.home01.task01.main;
/*
 * Заданы координаты трех вершин треугольника
 * (х1 у2),(х2, у2),(х3, у3).
 * Найти его периметр и площадь.
 */

public class Task13 {
	
	public static void main(String[]  args) {
		
		int x1 = 1;
		int x2 = 2;
		int x3 = 3;
		int y1 = 4;
		int y2 = 5;
		int y3 = 6;
		
		double a = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
		double b = Math.sqrt(Math.pow(x3 - x1, 2) + Math.pow(y3 - y1, 2));
		double c = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));
		
		Double P = a + b + c;
		Double p = P / 2;
		Double S = Math.sqrt(p * (p - a) * (p - b) * (p - c));
		
		System.out.println("Периметр треуголника P = " + P);
		System.out.println("Площадь треуголника S = "+ S);
	}

}
