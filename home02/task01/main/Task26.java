package local.home02.task01.main;
/*
 * Написать программу нахождения суммы большего и меньшего из трех чисел.
 */

public class Task26 {
	
	public static void main(String[] args) {
		
		int a = 15;
		int b = 20;
		int c = 5;
		
		int slag1 = 0;
		int slag2 = 0;
		
		if(a > b && a > c) {
			slag1 = a;
		}
		if(b > a && b > c) {
			slag1 = b;
		}
		if(c > b && c > a) {
			slag1 = c;
		}
		if(a < b && a < c) {
			slag2 = a;
		}
		if(b < a && b < c) {
			slag2 = b;
		}
		if(c < b && c < a) {
			slag2 = c;
		}
		
		
		
		
		int sum = slag1 + slag2;
		System.out.println("Сумма наибольшегои  наименьшего = " + sum);
		
	}

}
