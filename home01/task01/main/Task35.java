package local.home01.task01.main;
/*
 * Даны натуральные числа М и N. 
 * Вывести старшую цифру дробной части 
 * и младшую цифру целой части числа M/N
 */
public class Task35 {

	
	public static void main(String[] args) {
		
		int M = 105;
		int N = 25;
		
		double m = (int)(10 * M / N) % 10;
		double n = (int)(M /N) % 10;
		
		System.out.println("Сташая цифра дробной части = " + m);
		System.out.println("Младшая цифра целой части = " + n);
		
	}
}
