package local.home02.task01.main;
/*
 * Даны целые числа т, п. Если числа не равны, 
 * то заменить каждое из них одним и тем же числом, 
 * равным большему из исходных, а если равны, то заменить числа нулями.
 */

public class Task17 {
	
	public static void main(String[] args) {
		
		int m = 10;
		int n = 6;
		
		if(m != n) {
			if(m > n) {
				m = m;
				n = m;
			}
			else {
				m = n;
				n = n;	
			}	
		}
		else {
			m = 0;
			n = 0;
		}
		System.out.println("m = " + m);
		System.out.println("n = " + n);
	}
	

}