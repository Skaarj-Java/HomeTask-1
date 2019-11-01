package local.home02.task01.main;
/*
 * Даны  действительные числа  х  и  у,  не равные друг  другу.  
 * Меньшее  из  этих  двух чисел заменить половиной их 
 * суммы, а большее — их удвоенным произведением.
 */

public class Task15 {
	
	public static void main(String[] args) {
		
		double x = 10;
		double y = 7;
		
		if(x < y) {
			
			x = (x + y) / 2;
			y = 2 * x * y;
			
		}
		if (y < x) {
			
		    y = (x + y) / 2;
			x = 2 * x * y;
			
		}
		System.out.println("y = " + y);
		System.out.println("x = " + x);
		
		
	}

}