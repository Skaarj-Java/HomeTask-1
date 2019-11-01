package local.home03.task01.main;
/*
 * Составить программу нахождения произведения квадратов первых двухсот чисел.
 */

public class Task10 {
	
	public static void main(String [] args) {
		
		long i = 1;
		long pr = 1;
		
		while(i <= 200) {
			pr = (long) (pr * Math.pow(i, 2));
			i++;
			
			
		}
		System.out.println("произведение = " + pr);
	}
		
		
	}
	
