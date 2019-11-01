package local.home02.task01.main;
/*
 * Определить, делителем каких чисел а, b, с является число k.
 */

public class Task20 {
	
	public static void main(String[] args) {
		
		int a = 15;
		int b = 12;
		int c = 23;
		int k = 3;
		
		if(a % k == 0) {
			System.out.println("k является делителем числа a");
		}
		if(b % k == 0) {
			System.out.println("k является делителем числа b");
		}
		if(c % k == 0) {
			System.out.println("k является делителем числа c");
		}
	}
	

}
