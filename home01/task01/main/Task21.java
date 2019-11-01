package local.home01.task01.main;
/*
 *  Дано действительное число R  вида nnn.ddd  (три цифровых  разряда в дробной и целой частях).
 *  Поменять местами дробную и целую части числа и вывести полученное значение числа
 */

public class Task21 {
	
	public static void main(String[] args) {
		
		double a = 123.456;
		
		double a1 = (int)(a % 1 * 1000) + (double)(int)(a / 1) / 1000;
		
		System.out.println("Полученное значение числа = " + a1);
	}

}
