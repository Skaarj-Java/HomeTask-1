package local.home03.task01.main;
/*
 * Вывести  на  экран  соответствий  между  символами 
 * и  их  численными  обозначениями  в  памяти компьютера (Таблицу ASCII)
 */

public class Task26 {
	
	public static void main(String [] args) {
		
		int a;
		int b = 126;
		
		for(a = 33; a <= b; a++) {
			System.out.println(a + " - " + (char)(a));
		}
		
	}

}
