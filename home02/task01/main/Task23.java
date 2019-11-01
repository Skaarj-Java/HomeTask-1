package local.home02.task01.main;

import java.util.Scanner;

/*
 *  Определить правильность даты, введенной с клавиатуры 
 *  (число  — от 1 до 31, месяц — от 1 до 12). 
 *  Если введены некорректные данные, то сообщить об этом
 */

public class Task23 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
	int x;
	int y;
	
	System.out.println("Введите число x  и месяц y");
	System.out.print("> ");
	x =  sc.nextInt();
	y =  sc.nextInt();
	
	if(y < 1 || y > 12) {
		System.out.println("неверно введена дата: месяц");
	}
	
	if(y == 1 || y == 3 || y == 5 || y == 7 || y == 8 || y == 10 || y == 12){
		
		if (x < 1 || x > 31) {
			System.out.println("Неверно введёно число");
		}
		else {
			System.out.println(y + " Месяц " + x + " День ");
		}
		
	}
	if(y == 2) {
		
		if(x < 1 || x > 28) {
			System.out.println("Неверно введёно число");
		}
		else {
			System.out.println(y + " Месяц " + x + " День ");
		}
		
	}
	if(y == 4 || y == 6 || y == 9 || y == 11) {
		
		
		if (x < 1 || x > 30) {
			System.out.println("Неверно введёно число");
		}
		else {
			System.out.println(y + " Месяц " + x + " День ");
		}
	}
		
	}

}
