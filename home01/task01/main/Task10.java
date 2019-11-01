package local.home01.task01.main;
/*
 *  Вычислить значение выражения по формуле
 *  (все переменные принимают действительные значения)
 */

public class Task10 {
	
	public static void main(String[] args) {
		
		int x = 30;
		int y = 0;
		
		double z1 = Math.sin(x) + Math.cos(y);
		double z2 = Math.cos(x) - Math.asin(y);
		double z3 = Math.tan(x * y);
		
		double s = z1 / z2 * z3;
		
		System.out.println("Значение выражения = " + s);
		
		
		
	}

}
