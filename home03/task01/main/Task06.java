package local.home03.task01.main;

import java.util.Scanner;
/*
 * Напишите  программу,  где  пользователь  вводит любое  
 * целое  положительное  число. А  программа суммирует все числа 
 * от 1 до введенного пользователем числа.
 */

public class Task06 {
	
	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x;
		
		System.out.println("Введите целое и положительное число x  ");
		System.out.print("> ");
		x =  sc.nextInt();
		
		int i = 1;
		int sum = 0;
		while(i <= x) {
			sum = sum + i;
			i++;
		}
		System.out.println("sum = " + sum);
		
		
	}
	

}