package local.home03.task01.main;

import java.util.Scanner;


/*
 *  Для каждого натурального числа в промежутке от m  до n  
 *  вывести все делители, 
 *  кроме единицы и самого числа. m и n вводятся с клавиатуры.
 */

public class Task27 {
	
	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		int n;
		int m;
		
		System.out.println("Введите промежуток  m  n  ");
		System.out.print("> ");
		m =  sc.nextInt();
		n =  sc.nextInt();
		
		int i;
		int j;

		for ( i = m; i <= n; i++) {
		    for ( j = 2; j < i; j++) {
			if (i % j == 0) {
			    System.out.println(j + " является делителем числа " + i);
			}
		    }
		}		
			
		
			
			
		
		
	}

}
