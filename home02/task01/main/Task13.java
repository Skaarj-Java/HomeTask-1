package local.home02.task01.main;
/*
 * Даны две точки  А(х1, у1)  и  В(х2, у2).  
 * Составить алгоритм, определяющий, 
 * которая из точек находится ближе к началу координат
 */

public class Task13 {
	
	public static void main(String[] args) {
		
		int x1 = 3;
		int x2 = 4;
		int y1 = 8;
		int y2 = 1;
		
		double S1 = Math.sqrt(Math.pow(x1 - 0, 2) + Math.pow(y1 - 0, 2));
		double S2 = Math.sqrt(Math.pow(x2 - 0, 2) + Math.pow(y2 - 0, 2));
		
		if(S1 < S2) {
			System.out.println("точка B  ближе");
			}
		if(S1 > S2) {
			System.out.println("точка A  ближе");		
		}
		if (S1 == S2) {
			System.out.println("расстояние до начала координат одинаковое");
	}

}
}
