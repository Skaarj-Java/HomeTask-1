package local.home03.task01.main;
/*
 * Даны числовой ряд и некоторое число е. 
 * Найти сумму тех членов ряда, модуль которых больше 
 * или равен заданному е. Общий член ряда имеет вид:
 */

public class Task18 {
	
	public static void main(String [] args) {
		
		int n;
		double e = 0.75;
		double an;
		double sum = 0;
		
		for(n = 1;;n++) {
			an = Math.pow(-1, (n - 1)) / n;
			
			if(an >= e) {
				sum = sum + an;	
			}
			else {
				break;
			}
			System.out.println(sum);
			}
			
			
		
		
	}
		
	
}
