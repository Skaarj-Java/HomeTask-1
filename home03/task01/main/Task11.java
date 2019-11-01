package local.home03.task01.main;
/*
 * Составить программу нахождения разности кубов первых двухсот чисел
 */

public class Task11 {
	
	public static void main(String [] args) {
		
		int i = 1;
		long raz = 0;
		while(i <= 200) {
			if(i % 2 == 1) {
				raz = (long) (Math.pow(i, 3) - raz); 
			}
			i++;
		}
		System.out.println("raz = " + raz);
		
		
	}
	

}