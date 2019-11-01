package local.home01.task01.main;
/*
 * Дано действительное число  х. 
 * Не пользуясь  никакими другими арифметическими операциями, 
 * кроме умножения, сложения и вычитания, 
 * вычислите за минимальное число операций
 */

public class Task39 {
	
	public static void main(String[] args) {
		
		int x = 2;
		double a = 2 * x * x * (x * x + 2) - x * (3 * x * x -5) + 6;
		
		System.out.println("a = " + a);
		
		
	}

}
