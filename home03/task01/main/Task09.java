package local.home03.task01.main;
/*
 * Найти сумму квадратов первых ста чисел.
 */

public class Task09 {
	
	public static void main(String [] args) {
		
		int i = 1;
		int sum = 0;
		
		while(i < 100) {
			sum = (int) (sum + Math.pow(i, 2));
			i++;
			
			
		}
		System.out.println("sum = " + sum);
	}
	

}
