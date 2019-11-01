package local.home01.task01.main;

/*
 * Написать код для решения задачи. В n малых бидонах 80 л молока.
 * Сколько литров молока в m больших бидонах, если в каждом большом бидоне
 * на 12 л. Больше чем в малом?
 */

public class Task06 {
	
	public static void main(String[] args) {
		
		int n = 5;//Количество малых бидонов //
		int m = 8;//Количество больших бидонов //
		int g = 80;// Всего л молока в малых бидонах //
		int a = g / n; // Литров молока в малом бидоне //
		int b = a + 12; // Литров молока в большом бидоне //
		int c = b * m; // Всего литров молока во всех больших бидонах //
		
		System.out.println("Литров молока в больших m бидонах = " + c);
		
		if(c > g) 
			System.out.println("В больших бидонах молока больше, чем в малых");
			
		
		else  
			System.out.println("В больших бидонах молока меньше, чем в малых");
		
			
		}
}