package local.home03.task01.main;
/*
 * Требуется определить факториал числа, которое ввел пользователь
 */

public class Task25 {
	
	public static void main(String[] args) {
		
		int a;
		int n  = 5;
		double f = 1;
		
		for(a = 1; a < n; ){
			f = f * a;
			a++;
		}
		if(n == 0) {
			System.out.println("0! = 1");
		}
		if(a == n) {
			System.out.println(n +"! =  " + f);
		}
	}

}
