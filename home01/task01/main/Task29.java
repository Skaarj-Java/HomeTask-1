package local.home01.task01.main;
/*
 *  Найти (в радианах в градусах) 
 *  все углы треугольника со сторонами а, b, с
 */

public class Task29 {
	
	public static void main(String[] args) {
		
	int a = 2;
	int b = 3;
	int c = 4;
	
	double x1 = Math.pow(b, 2) + Math.pow(c, 2) - Math.pow(a, 2);
	double x2 = 2 * b * c;
	
	double alf = Math.acos(x1 / x2);
	
	double x3 = Math.pow(a, 2) + Math.pow(c, 2) - Math.pow(b, 2);
	double x4 = 2 * a * c;
	
	double bet = Math.acos(x3 / x4);
	
	double x5 = Math.pow(a, 2) + Math.pow(b, 2) - Math.pow(c, 2);
	double x6 = 2 * b * a;
	
	double gam = Math.acos(x5 / x6);
	
	double Ralf = alf * 180 / Math.PI;
	double Rbet = bet * 180 / Math.PI;
	double Rgam = gam * 180 / Math.PI;
	
	System.out.println("Альфа = " + Ralf);
	System.out.println("Бетта = " + Rbet);
	System.out.println("Гамма = " + Rgam);
	System.out.println("Радианы Альфа = " + alf);
	System.out.println("Радианы бетта = " + bet);
	System.out.println("Радианы гамма = " + gam);
	
	double j = Ralf + Rbet + Rgam;
	System.out.println("Сумма всех углов = " + j);
	
	
	
	
		
		
	}

}