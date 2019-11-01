package local.home02.task01.main;
/*
 * Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). 
 * Определить, будут ли они расположены на одной прямой. 
 */

public class Task29 {
	
	public static void main(String[] args) {
		
		int x1 = -5;
		int x2 = 6;
		int x3 = 2;
		int y1 = 19;
		int y2 = 8;
		int y3 = 12;
		
		if((x1 - x3) * (y2 - y3) - (x2 - x3) * (y1 - y3) == 0) {
			System.out.println("Точки расположены на одной прямой");
		}
		else {
			System.out.println("Точки не расположены на одной прямой");
		}
	}

}