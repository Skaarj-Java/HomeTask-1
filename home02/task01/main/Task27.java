package local.home02.task01.main;
/*
 *  Найти max{min(a, b), min(c, d)}.
 */

public class Task27 {
	
	public static void main(String[] args) {
		
		int a = 5;
		int b = 10;
		int c = 8;
		int d = 7;
		
		int min1;
		int min2;
		
		int max;
		
		if(a < b) {
			min1 = a;
		}
		else {
			min1 = b;
		}
		if(c < d) {
			min2 = c;
		}
		else {
			min2 = d;
		}
		if(min1 > min2) {
			max = min1;
		}
		else {
			max = min2;
		}
		System.out.println("max = " + max);
		
	}

}
