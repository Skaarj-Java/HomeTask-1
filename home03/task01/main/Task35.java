package local.home03.task01.main;
/*
 * Найдите количество четных цифр данного натурального числа.
 */
public class Task35 {
	
	public static void main(String[] args) {
		
		 int a = 22258489;
		 int chet = 0;
		 
		 while(a > 0) {
			 if(a % 2 == 0) {
				chet++; 
			 }
			 a = a / 10;
		 }
		 System.out.println("Количество четных цифр " + chet);
	 
		
	}

}
