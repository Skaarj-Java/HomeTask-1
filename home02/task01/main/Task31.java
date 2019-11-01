package local.home02.task01.main;
/*
 * Заданы размеры  А, В прямоугольного отверстия и размеры  х,  у,  z  кирпича. 
 * Определить, пройдет ли кирпич через отверстие.
 */

public class Task31 {
	
	public static void main(String[] args) {
		
		int A = 10;
		int B = 15;
		
		int x = 11;
		int y = 50;
		int z = 7;
		
		if(x > A || z > B) {
			System.out.println("Кирпич не пройдёт через отвертие");
		}
		else {
			System.out.println("кирпич пройдёт через отверстие");
		}
	}

}
