package local.home03.task01.main;
/*
 * Найдите наибольшую цифру данного натурального числа.
 */   

public class Task33 {
	
	 public static void main(String[] args) {
			int a = 192345678;
			int max = 0;

			while (a > 0) {
			    if (a % 10 > max) {
				max = a % 10;
			    }

			    a = a / 10;
			}

			System.out.println("Наибольшая цифра " + max);
			
		    }

}