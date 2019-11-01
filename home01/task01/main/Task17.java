package local.home01.task01.main;
/*
 * Даны два числа. Найти среднее арифметическое кубов этих чисел 
 * и среднее геометрическое модулей этих чисел
 */

public class Task17 {
	
	public static void main(String[] args) {
		
		int a = 8;
		int b = -7;
		
		double U = (Math.pow(a, 3) + Math.pow(b, 3)) / 2;
		
		double G = Math.pow((Math.abs(a) * Math.abs(b)), 1 / 3);
		
		System.out.println("Среднее арифметическое кубов чисел = " + U);
		System.out.println("Среднее геометрическое модулей чисел = " + G);
		
		
		
		
		
	}

}
