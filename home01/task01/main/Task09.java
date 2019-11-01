package local.home01.task01.main;
/*
 * Вычислить значение выражения по формуле
 * (все переменные принимают действительные значения)
 */

public class Task09 {
	
	public static void main(String[] args) {
		
	int a = 20;
	int b = 10;
	int c = 4;
	int d = 1;
	
	int x1 = a / c;//Первый множитель//
	int x2 = b / d;//Второй множитель//
	int y1 = a * b - c;//Делимое//
	int y2 = c * d;//Делитель//
	int z1 = x1 * x2;//Вычитаемое//
	int z2 = y1 / y2;//Вычитатель//
	int s = z1 - z2;//Разность(Значение выраженя)//
	
	System.out.println("Значение выражения S = " + s);
	
	}

}

