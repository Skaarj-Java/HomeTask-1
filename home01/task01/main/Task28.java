package local.home01.task01.main;
/*
 * Составить программу перевода радианной меры угла 
 * в градусы, минуты и секунды
 */

public class Task28 {
	
	public static void main(String[] args) {
		
		int r = 1;
		double gr = r * 180 / Math.PI;
		double min = gr % 1 * 60;
		double sek = min % 1 * 60;
		
		System.out.println("Градусы =  "  + gr);
		System.out.println("Минуты =  "  + min);
		System.out.println("Секунды =  "  + sek);
		
		
		
		
		
		
	}
}
