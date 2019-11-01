package local.home03.task01.main;
/*
 *  Даны числовой ряд и некоторое число е.
 *   Найти сумму тех членов ряда, модуль которых больше 
 *   или равен заданному е. Общий член ряда имеет вид:
 */

public class Task19 {
	
	public static void main(String [] args) {
		
		int n = 1;
		double e = 0.25;
		double an;
		double sum = 0;
		
		while(n < 100) {
			an = (double)(1) / Math.pow(2, n) + (double)(1) / Math.pow(3, n);
			
			if(an >= e) {
				sum = sum + an;	
			}
			else {
				break;
			}
			System.out.println(sum);
			n++;
			}
		
		
	}

}
