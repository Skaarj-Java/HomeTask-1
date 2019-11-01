package local.home01.task01.main;
/*
 * Дано натуральное число Т, 
 * которое представляет длительность прошедшего времени в секундах. 
 * Вывести данное значение длительности в часах,
 * минутах и секундах в следующей форме:
 * ННч ММмин SSc.
 */

public class Task22 {
	
	public static void main(String[] args) {
		
		int T = 4250;
		
		int M = T / 3600;
		int Y = T - M * 3600;
		int G = Y / 60;
		int H = T % 60;
		
		System.out.println(M + " ч " );
		System.out.println(G + " мин ");
		System.out.println(H + " с ");
			
	}

}

