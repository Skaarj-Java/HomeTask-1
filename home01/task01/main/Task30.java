package local.home01.task01.main;
/*
 *  Три сопротивления R1 R2, и R3 соединены параллельно.
 *  Найдите сопротивление соединения
 */

public class Task30 {

	public static void main(String[] args) {

		
		int R1 = 2;
		int R2 = 4;
		int R3 = 5;
		
		double x1 = (double)1 / R1;
		double x2 = (double)1 / R2;
		double x3 = (double)1 / R3;
		
		
		
		double R = ((double)(1) / (x1 + x2 + x3));
		
		System.out.println("Сопротивление соединения = " + R);
		
		
	}
}
