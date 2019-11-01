package local.home02.task01.main;
/*
 * Составить программу нахождения модуля выражения 
 * a*x*x + b*x + c при заданных значениях a, b, c и х
 */

public class Task07 {

	public static void main(String[] args) {
		
		int a = -3;
		int b = 4;
		int c = 11;
		int x = -1;
		
		int z = Math.abs(a * x * x + b * x + c);
		
		System.out.println("z = " + z);
	}
}
