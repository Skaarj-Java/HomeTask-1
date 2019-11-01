package local.home03.task01.main;
/*
 *  Даны числовой ряд и некоторое число е. 
 *  Найти сумму тех членов ряда, модуль которых больше 
 *  или равен заданному е. Общий член ряда имеет вид:
 */

public class Task20 {
	
	public static void main(String [] args) {
		
		double n = 1;
		double e = 0.01;
		double an;
		double sum = 0;
		
		while(n < 100) {
			an = (double)(1) / ((3 * n - 2) * (3 * n + 1));
			
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