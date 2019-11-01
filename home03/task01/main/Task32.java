package local.home03.task01.main;

import java.io.InputStreamReader;
import java.util.Scanner;
/*
 *  Проверить  введенную  пользователем  строку  на  наличие  недопустимых  символов. 
 *  В  качестве первого  символа  допустимы  только  буквы  и  знак  подчеркивания.  
 *  Остальные  символы  могут  быть буквами, цифрами и знаком подчеркивания.
 */

public class Task32 {
	
	 public static void main(String[] args) {
		 
		    String x1 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ_";
			String x2 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ_0123456789";
			boolean x3 = true;
			Scanner sc = new Scanner(new InputStreamReader(System.in));

			String userString = sc.next();



			if (!x3) {
			    System.out.println("Строка содержит запрещённые символы");
			} 
			else {
			    System.out.println("Строка не содержит запрещённые символы");
			}
		 
	 }

}
