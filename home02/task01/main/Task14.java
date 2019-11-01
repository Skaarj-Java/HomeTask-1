package local.home02.task01.main;
/*
 * Даны два угла треугольника (в градусах). 
 * Определить, существует ли такой треугольник, 
 * и если да, то будет ли он прямоугольным.
 */

public class Task14 {
	
	public static void main(String[] args) {
		
		int a = 45;
		int b = 55;
		
		if(a + b < 180) {
			System.out.println("Треуголник существует");
			}
		
		int c = 180 - (a + b);
		if (c == 90 || a == 90 || b == 90) {
			System.out.println("Треуголник прямоуголный");
		}
		else {
			System.out.println("Треуголник не прямоуголный");
		}
		
	}

}

