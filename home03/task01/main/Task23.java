package local.home03.task01.main;
/*
 * Составить программу для вычисления значений функции  F(x) на отрезке 
 * [а, b] с шагом h. Результат представить в виде таблицы,
 *  первый столбец которой – значения   аргумента, 
 *  второй - соответствующие значения функции:
 */


public class Task23 {
	
public static void main(String [] args) {
		
		int a = 8;
		int b = 20;
		double h = 1;
		double F = 0;
		
		System.out.println(" x|" + " F ");
		while(a <= b) {
			F =Math.cos(a / 3) / (Math.sin(a / 3) + 0.5 * Math.sin(a));
			System.out.println(" " + a + "| " + F);
			a = (int) (a + h);
				
		}
		
	}
	

}