package local.home02.task01.main;
/*
 * Написать программу, которая по заданным трем числам определяет, 
 * является ли сумма каких-либо двух из них положительной.
 */

public class Task32 {
	
	public static void main(String[] args) {
		
		int a = 10;
		int b = -8;
		int c = -14;
		
		int sum1 = a + b;
		int sum2 = b + c;
		int sum3 = a + c;
		
		if(sum1 >= 0 || sum2 >= 0 || sum3 >= 0) {
			System.out.println("сумма каких-либо двух из них является положительной");
		}
		else {
			System.out.println("сумма каких-либо двух из них не является положительной");
		}
		
		
	}
	

}