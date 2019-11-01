package local.home01.task01.main;
/*
 * Вычислить корни квадратного уравнения  с заданными коэффициентами
 * (предполагается, что а≠0 
 * и что дискриминант уравнения неотрицателен) 
 */

public class Task25 {
	
	public static void main(String[] args) {
		
		int a = 1;
		int b = -8;
		int c = 12;
		
		double D = Math.pow(b, 2) - 4 * a * c;
		double x1 = (-b + Math.sqrt(D)) / 2 * a;
		double x2 = (-b - Math.sqrt(D)) / 2 * a;
		
		System.out.println("Первый корень квадратного уравнения = " + x1);
		System.out.println("Второй корень квадратного уравнения = " + x2);
	}

}
