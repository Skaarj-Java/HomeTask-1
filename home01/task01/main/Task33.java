package local.home01.task01.main;
/*
 * Ввести любой символ и определить его порядковый номер, 
 * а также указать предыдущий и последующий символы
 */

public class Task33 {
	
	public static void main(String[] args) {
		
		char ch = 'u';
		int chCode;
		chCode = (int)ch;
		
		int chNext;
		int chPred;
		
		chNext = chCode + 1;
		chPred = chCode - 1;
		
		
		
		System.out.println((char)chNext);
		System.out.println(ch);
		System.out.println((char)(chPred));
		
		
		
		
	}

}