package local.home01.task01.main;

public class Task16 {

	public static void main(String[] args) {
		
		
		int n = 3456;
		int m = 1;
		for (int i = 0; i < 4; i++) {
		    m *= n % 10;
		    n /= 10;
		    }
		System.out.println("Произведение: " + m);
	}
}
