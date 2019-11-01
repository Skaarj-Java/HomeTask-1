package local.home02.task01.main;
/*
 * Даны три действительных числа. 
 * Возвести в квадрат те из них, значения которых неотрицательны, 
 * и в четвертую степень — отрицательные.
 */

public class Task12 {
	
	public static void main(String[] args) {
		
		int a = 10;
		int b = -15;
		int c = -18;
		
		if (a >= 0) {
			a = (int) Math.pow(a, 2);
		}
		else { 
			a = (int)Math.pow(a, 4);
		}
		if (b >= 0) {
			b = (int) Math.pow(b, 2);
		}
		else { 
			b = (int)Math.pow(b, 4);
		}
		if (c >= 0) {
			c = (int) Math.pow(c, 2);
		}
		else { 
			c = (int)Math.pow(c, 4);
		}
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
	
	}

}

