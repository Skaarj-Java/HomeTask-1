package local.home03.task01.main;

import java.io.InputStreamReader;
import java.util.Scanner;
/*
 *  Написать программу, в которой вводятся два операнда Х и Y  и знак операции (+, –, /, *). Вычислить 
результат Z в зависимости от знака. Предусмотреть реакции на возможный неверный знак операции, а 
также  на  ввод  Y=0  при  делении.  Организовать  возможность  многократных  вычислений  без
перезагрузки программа (т.е. построить цикл). В качестве символа прекращения вычислений принять 
‘0’.
 */

public class Task28 {
	
	public static void main(String [] args) {
		
		Scanner sc = new Scanner(new InputStreamReader(System.in));
		
		int X;
		int Y;
		int n;
		
		System.out.println("Введите два операнда X и Y ");
		System.out.print("> ");
		X =  sc.nextInt();
		Y =  sc.nextInt();

		while(true){
			
		    System.out.print("Введите значение 0 для выхода из программы ");
			int x = sc.nextInt();

			if (x == 0) {
		    System.out.println("Закончено");
		    break;
		    }

			System.out.println("Введите знак");
			System.out.print("> ");
			char z = sc.next().charAt(0);
			
			switch(z) {
			case '*' :  n = X * Y;
			System.out.println(X * Y);
			break;
			case '/' : if(Y == 0) {
				System.out.println("Деление на 0");
				}
				else {
					n = X / Y;
					System.out.println(X / Y);
					}
			break;
			case '+' : n = X + Y;
			System.out.println(X + Y);
			break;
			case '-' : n = X - Y;
			System.out.println(X - Y);
			break;
			}
			
			
		} 

		

		
		
	}

}