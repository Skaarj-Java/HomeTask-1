package local.home01.task01.main;
/*
 *  Дана сторона равностороннего треугольника.
 *  Найти площадь этого треугольника, его высоту,
 *  радиусы вписанной и описанной окружностей.
 */

public class Task19 {
	
	public static void main(String[] args) {
		
	int a = 4;
	int p = (a + a + a) / 2;
	double S = Math.sqrt(p * (p - a) * (p - a) * (p - a));
	int a1 = a / 2;
	double h = Math.sqrt(Math.pow(a, 2) - Math.pow(a1, 2));
	
	double r = a * Math.sqrt(3) / 6;
	double R = a * Math.sqrt(3) / 3;
	
	System.out.println("Площадь равностороннего треугольника" + S);
	System.out.println("Высота равностороннего треугольника" + h);
	System.out.println("Радиус вписанной окружности" + r);
	System.out.println("Радиус описанной окружности" + R);
	
	
	
	
		
	}

}
