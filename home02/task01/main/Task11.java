package local.home02.task01.main;
/*
 * Составить программу, которая определит площадь какого треугольника больше
 */

public class Task11 {
	
	public static void main(String[] args) {
		
		int a1 = 3;
		int b1 = 4;
		int c1 = 5;
		
		int a2 = 2;
		int b2 = 6;
		int c2 = 3;
		
		int p1 = (a1 + b1 + c1) / 2;
		int p2 = (a2 +  b2 + c2) / 2;
		
		double s1 = Math.sqrt(p1 * (p1 - a1) * (p1 - b1) * (p1 - c1)); 
		double s2 =	Math.sqrt(p2 * (p2 - a2) * (p2 - a2) * (p2 - a2));
		
		if(s1 < s2) {
			System.out.println("площадь треугольника s2 больше");
			}
		if(s1 > s2) {
			System.out.println("площадь треуголника s1 больше");		
		}
		if (s1 == s2) {
			System.out.println("площади раны");
		}
	}

}
