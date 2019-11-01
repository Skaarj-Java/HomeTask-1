package local.home02.task01.main;
/*
 * Составить  программу,  которая  определит  по  трем  введенным  сторонам,  
 * является  ли  данный  треугольник равносторонним
 */

public class Task09 {
	
	public static void main(String[] args) {
		
		
		int a = 5;
		int b = 6;
		int c = 7;
		
		if(a == b && b == c) {
			System.out.println("треуголник является равносторонним");
		}
		else {
			System.out.println("треуголник не является равносторонним");
		}
		

}
}