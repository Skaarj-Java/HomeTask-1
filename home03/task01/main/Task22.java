package local.home03.task01.main;
/*
 *   Составить программу для вычисления значений функции 
 *   F(x) на отрезке [а, b] с шагом h. 
 *   Результат представить в виде таблицы, 
 *   первый столбец которой – значения   аргумента, 
 *   второй - соответствующие значения функции:
 */

public class Task22 {
	
	public static void main(String [] args) {
		
		int a = 12;
		int b = 22;
		double h = 1;
		double F = 0;
		
		System.out.println(" x |" + " F ");
		while(a <= b) {
			F = Math.pow(Math.sin(a), 2);
			System.out.println(" " + a + "| " + F);
			a = (int) (a + h);
				
		}
		
	}

}
