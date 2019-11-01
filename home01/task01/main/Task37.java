package local.home01.task01.main;
/*
 * Составить линейную программу, 
 * печатающую значение  true,  
 * если указанное высказывание является истинным, и
 * false — в противном случае
 */

public class Task37 {
	
	public static void main(String[] args) {
		

		int a = 22;
		boolean m;
		
		m = a / 10 >= 1 && a / 10 < 10 && a % 2 == 0;
		
		System.out.println("1." + m);
		
		//2.//
		
		int b = 2671;
		boolean n;
		int vtor = 0;
		 int perv = 0;
		
		while(b > 0) {
			if(b >= 100) {
				vtor = vtor + (b % 10);
			}
			else {
				perv = perv + (b % 10);
			}
			b = b / 10;
		}
		
		n = vtor == perv;
		
		System.out.println("2." + n);
		
		//3.//
		
		int M = 221;
		int sum = 0;
		boolean k;
		while(M > 0) {
			sum = sum + (M % 10);
			M = M / 10;
		}
		k = sum % 2 == 0;
		System.out.println("3." + k);
		
		//4.//
		
		int x = 3;

		int l = -5;
		int o = 10;

		if (o < x && x < o) {
		    System.out.println("4." + true);
		} else {
		    System.out.println("4." + false);
		}
		
		//5.//
		
		int r = 50;
		int s = 0;

		for (int i = 0; i < 3; i++) {
		    s = s + (r % 10);
		    r = r / 10;
		}

		if (r * r == s * s * s) {
		    System.out.println("5." + true);
		} else {
		    System.out.println("5." + false);
		}
		
		//6.//
		
		int t = 1;
		int y = 2;
		int u = 3;

		if ((t == y && a != u) || (t == u && t != y) || (y == u && y != t)) {
		    System.out.println("6." + true);
		} else {
		    System.out.println("6." + false);
		}
		
		//7.//
		
		int B = 257;

		int a1 = B / 100;
		int b1 = B / 10 % 10;
		int c1 = B % 10;

		if (a1 + b1 == c1 || a1 + c1 == b1 || b1 + c1 == a1) {
		    System.out.println("7." + true);
		} else {
		    System.out.println("7." + false);
		}
		
		//8.//
		
		int Y = 8;
		int A = 2;
		
		Y = Y / A;
		if(Y == 1) {
			System.out.println("8." + true);
		}
		else { 
			Y = Y / A;
			if(Y == 1) {
				System.out.println("8." + true);
			}
			else { 
				Y = Y / A;
				if(Y == 1) {
					System.out.println("8." + true);
				}
				else {
					Y = Y / A;
					if (Y == 1) {
						System.out.println("8." + true);
					}
					else {
						System.out.println("8." + false);
					}
				}
			}
		}
		
		//9.//
		
		int m1 = 2;
		int n1 = 2;

		int a2 = 1;
		int b2 = 2;
		int c2 = 3;

		if (n1 == (a2 * Math.pow(m1, 2) + b2 * m1 + c2)) {
		    System.out.println("9." + true);
		} else {
		    System.out.println("9." + false);
		}

		
	}
	
	
}