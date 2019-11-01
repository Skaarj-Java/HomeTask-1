package local.home02.task01.main;

import java.util.Scanner;

public class Task34 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x;
		int y = 17;
		int m;
		int n;
		
		System.out.println("Книга стоит 17р ");
		
		System.out.println("Введите сумму");
		System.out.print("> ");
		x =  sc.nextInt();
		
		if(x < y) {
			m = y - x;
			System.out.println("доплатите " + m + " р");
			
		}
		if(x == y) {
			System.out.println("спасибо");
		}
		if(x > y) {
			n = x - y;
			System.out.println("Ваша сдача " + n + " р");
		}
	}

}
