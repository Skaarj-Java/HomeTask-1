package local.home03.task01.main;
/*
 * Последовательность  аn строится  так:  а1 =  1,  an =6+  аn-1 ,  
 * для  каждого  n  >1  Составьте  программунахождения произведения 
 * первых 10 членов этой последовательности
 */

public class Task12 {
	
	public static void main(String [] args) {
		
		int i = 1;
		long pr = 1;
		int a = 1;
		
		
		while (i < 10) {
			a = 6 + a;		
			pr = pr * a;
			i++;
		}
		System.out.println("pr = " + pr);
		
		
	}
	

}