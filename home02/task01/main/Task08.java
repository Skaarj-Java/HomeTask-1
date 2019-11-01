package local.home02.task01.main;
/*
 *Составить программу нахождения наименьшего из квадратов двух чисел а и b. 
 */

public class Task08 {
	
	public static void main(String[] args) {
		
		int a = 5;
		int b = 6;
		
		if(Math.pow(a, 2) < Math.pow(b, 2)) {
			System.out.println("квадрат числа а меньше");
			}
		if(Math.pow(a, 2) > Math.pow(b, 2)) {
			System.out.println("квадрат числа b меньше");		
		}
		if (Math.pow(a, 2) == Math.pow(b, 2)) {
			System.out.println("Эти квадраты числа равны");
		}
	}

}
