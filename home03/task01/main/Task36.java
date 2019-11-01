package local.home03.task01.main;
/*
 * Два  двузначных  числа,  записанных  одно  за  другим  , 
 * образуют  четырёхзначное  число,  которое делится на их произведение. 
 * Найти эти числа. */

public class Task36 {
	
	public static void main(String[] args) {
		
		int i;
		int y;
		int x;
		
		for(i = 10; i < 100; i++) {
			for(y = 10; y < 100; y++) {
				x = i* 100 + y;
				
				if(x % (i * y) == 0 ) {
					System.out.println(" число " + x);
				}
			}
		}
		
	}

}
