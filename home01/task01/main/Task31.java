package local.home01.task01.main;
/*
 *  Составить программу для вычисления пути,
 *  пройденного лодкой, если ее скорость в стоячей воде v км/ч,
 *  скорость течения реки v1 км/ч,
 *  время движения по озеру t1 ч, 
 *  а против течения реки — t2 ч.
 */

public class Task31 {
	
	public static void main(String[] args) {
		
		int v = 5;
		int v1 = 2;
		int t2 = 2;
		int t1 = 3;
		int v3 = v - v1;
		
		int Sr = t2 * v3;
		int So = t1 * v;
		
		System.out.println("Расстоение пройденное против течение реки = " + Sr);
		System.out.println("Расстояние пройденное по озеру = " + So);
		
		
		
		

		
	}

}
