package local.home01.task01.main;
/*
 * Найти частное произведений четных и нечетных 
 * цифр четырехзначного числа
 */

public class Task36 {
	
	public static void main(String[] args) {
		
	int a = 3434;
	double chet = 1;
	double nechet = 1;
	
	while (a / 10 > 0) {
		if ((a % 10) % 2 == 0) {
			chet = chet * (a % 10);
		}
		else {
			nechet = nechet * (a % 10);
		}
	a = a / 10;	
	}
	if (a % 2==0) {
		chet = chet * a;
	}
	else {
		nechet = nechet * a;
	}
	double N = chet / nechet;
	
	System.out.println("частное = " + N);
		
	}

}

