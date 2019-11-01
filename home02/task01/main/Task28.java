package local.home02.task01.main;
/*
 * Даны три числа a, b, с. Определить, какое из них равно d. 
 * Если ни одно не равно d, то найти max(d — a, d — b, d —c).
 */

public class Task28 {
	
	public static void main(String[] args) {
		
		int a = 10;
		int b = 12;
		int c = 14;
		
		
		int d = 11;
		int max = 0;
		
		int x1 = d - a;
		int x2 = d - b;
		int x3 = d - c;
		
		
		if(d == a) {
			System.out.println("a = d");
		}
		if(d == b) {
			System.out.println("b = d");
		}
		if(d == c) {
			System.out.println("c = d");
		}
		if(d != a && d != b && d != c) {
			if(x1 > x2 && x1 > x3) {
				max = x1;
			}
			if(x2 > x1 && x2 > x3) {
				max = x2;
			}
			if(x3 > x1 && x3 > x2) {
				max = x3;
			}
			System.out.println("max = " + max);
		}
		
		
		
		
	}

}
