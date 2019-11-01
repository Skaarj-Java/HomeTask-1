package local.home03.task01.main;

import java.util.Scanner;
/*
 *  Вводится натуральное число. 
 *  Найти сумму четных цифр, входящих в его состав. 
 *  Преобразовать его в другое число, 
 *  цифры которого будут следовать в обратном порядке 
 *  по сравнению с введенным числом.
 * 
 */

public class Task24 {
	
	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x;
		int chet = 0;
		
		System.out.println("Введите натуральное число x  ");
		System.out.print("> ");
		x =  sc.nextInt();
		int m = x;
		int p = 0;
		
		while (x / 10 > 0) {
			if ((x % 10) % 2 == 0) {
				chet = chet + (x % 10);
			}
			x = x / 10;
		}
		if (x % 2==0) {
			chet = chet + x;
		}
		System.out.println("сумма чётных цифр = " + chet);
		
		while(m > 0) {
			p = p * 10 + m % 10;
			m = m / 10;
		}
		System.out.println("Перевёрнутое число = " + p);
		
	
	

}
}
