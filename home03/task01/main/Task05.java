package local.home03.task01.main;
/*
 *  С  помощью  оператора  while  напишите  программу  определения  суммы  
 *  всех  нечетных  чисел  в диапазоне от 1 до 99 включительно.
 */

public class Task05 {
	
	public static void main(String [] args) {
		
		int i = 1;
		int Sum = 0;
		while(i <= 99) {
			if(i % 2 == 1) {
				Sum = Sum + i; 
			}
			i++;
		}
		System.out.println("Sum = " + Sum);
	}
	

}
