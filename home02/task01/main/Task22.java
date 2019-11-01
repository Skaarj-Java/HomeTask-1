package local.home02.task01.main;
/*
 *  Перераспределить значения переменных х и у так, 
 *  чтобы в х оказалось большее из этих значений, а в y - меньшее.
 */

public class Task22 {
	
	public static void main(String[] args) {
		
		int x = 10;
		int y = 11;
		
		int x1 = x;
		int y1 = y;
		
		if(x < y) {
			x = y1;
			y = x1;
		}
		System.out.println("значение х = " + x);
		System.out.println("значение y = " + y);
		
	}

}

