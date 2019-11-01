package local.home01.task01.main;
/*
 * Вычислить значение выражения по формуле
 * (все переменные принимают действительные значения)
 */

public class Task08 {
	
	public static void main(String[] args) {
		
		
		int b = 1;
		int a = 5;
		int c = 4;
		
		int x1 = 2;// знaчение первой степени //
		int x2 = 3;// значение второй степени //
		int x3 = -2;// значение третьей степени //

		
		double y1 = (b + Math.sqrt(Math.pow(b, x1) + 4 * a * c));
		//Делимое выражения//
		int y2 = 2 * a;
		//Делитель выражения//
		double y3 = Math.pow(a, x2) * c + Math.pow(b, x3);
		//Вычитатель выражения //
		
		double s = y1 / y2 - y3;// значение выражения //
		
		System.out.println("Значение выражения s = " + s);
		
		
	}

}

