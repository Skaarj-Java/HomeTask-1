package local.home02.task01.main;

import java.util.Scanner;

public class Task33 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x;
	
		
		System.out.println("Введите пароль");
		System.out.print("> ");
		x =  sc.nextInt();
		
		if(x == 9583 || x == 1747) {
			System.out.println("доступны модули баз А, В, С");
		}
		if(x == 3331 || x == 7922) {
			System.out.println("доступны модули баз В, С");
		}
		if(x == 9455 || x == 8997) {
			System.out.println("доступен модуль базы С");
		}
		
		
		
		
	}

}
