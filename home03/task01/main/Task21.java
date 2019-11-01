package local.home03.task01.main;
/*
 *  Составить программу для вычисления значений функции 
 *  F(x) на отрезке [а, b] с шагом h. 
 *  Результат представить в виде таблицы, 
 *  первый столбец которой – значения   аргумента, 
 *  второй - соответствующие значения функции
 */

public class Task21 {
	
	public static void main(String [] args) {
		
		int a = 10;
		int b = 20;
		double h = 1;
		double F = 0;
		
		System.out.println(" x |" + " F ");
		while(a <= b) {
			F = a - Math.sin(a);
			System.out.println(" " + a + "| " + F);
			a = (int) (a + h);
				
		}
		
	}
	

}