package local.home01.task01.main;
/*
 * Текущее показание электронных часов: 
 * т ч (0 ≤ т ≤23) п  мин  (0 ≤  п ≤59) к  с (0 ≤к ≤59). 
 * Какое время будут показывать часы через р ч q мин r с?
 */

public class Task32 {
	
	public static void main(String[] args) {
		
		int m = 1900;
		int n = 337;
		int c = 1000;
		
		int p = 20;
		int q = 30;
		int r = 45;
		
		int min1 = 0;
		int hour1 = 0;
		
		int sec = c + r;
		if(sec >= 60) {
			min1 = sec / 60;
			sec %= 60;	
		}
		
		int min = n + q + min1;
		if(min >= 60) {
			hour1 = min / 60;
			min %= 60;
		}
		
		int hour = m + p + hour1;
		if (hour >=24) {
			hour %= 24;
		}
		
		System.out.println("Количество часов = " + hour);
		System.out.println("Количество минут = " + min);
		System.out.println("Количество секунд = " + sec);
}
}