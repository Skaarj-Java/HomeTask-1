package local.home01.task01.main;
/*
 *  Известна длина окружности. 
 *  Найти площадь круга, ограниченного этой окружностью.
 */

public class Task20 {
	
	public static void main(String[] args ) {
		
		int L = 20;
		double S = Math.PI * Math.pow(L / (2 * Math.PI), 2);
		
		System.out.println("Площадь круга = " + S);
		
		
		
	}

}
