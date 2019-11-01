package local.home03.task01.main;

/*
 *  Вычислить : 1+2+4+8+...+ 2 в 10 степени
 */

public class Task15 {
	
	public static void main(String [] args) {
		
		int i = 1;
		int sum = 1;
		
		while (i <= 10) {
			sum = (int) (sum + Math.pow(2, i));
			i++;
			
		}
		System.out.println("sum = " + sum);
	}
	

}

