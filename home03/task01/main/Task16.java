package local.home03.task01.main;
/*
 *  Вычислить: (1+2)*(1+2+3)*...*(1+2+...+10)
 */

public class Task16 {
	
	public static void main(String [] args) {
		
		int i = 2;
		int a = 3;
		long p = a;
		
		while(i <= 10) {
			i = i + 1;
			a = a + i;
			p = p * a;	
		}
		System.out.println("p = " + p);
	}

}
