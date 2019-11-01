package local.home01.task01.main;
/*
 *  Вычислить периметр и площадь прямоугольного треугольникa
 *  по длинам а и b  двух катетов
 */

public class Task11 {
	
	public static void main(String[]args) {
		
	int a = 3;
	int b = 4;
	
	double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
	
	double P = a + b + c; 
	double S = 0.5 * a * b;
	
	System.out.println("Периметр прямоуголника =" + P);
	System.out.println("Площадь прямоуголного треугольника =" + S);
	
	
			
		
		
	}

}

