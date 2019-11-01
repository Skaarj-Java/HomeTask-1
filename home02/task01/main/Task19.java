package local.home02.task01.main;
/*
 * Подсчитать количество положительных среди чисел а, b, с
 */


public class Task19 {
	
    public static void main(String[] args) {
		
		int a = 1;
		int b = -2;
		int x = -4;
		int k = 0;
		
		if (a >= 0) {
			k = k + 1;
		}
		if (b >= 0) {
			k = k + 1;
		}
		if(x >= 0) {
			k = k + 1;
		}
		System.out.println("количество положительных чисел = " + k);
	}

}
