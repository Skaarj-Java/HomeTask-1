package local.home03.task01.main;
/*
 * � �����������  �����  ����������  �������  �����.  
 * �����  ����������  �����  ��������  ��  7,  
 * �� �������� �������� �����. ����� ��� �����.
 */

public class Task39 {
	
	public static void main(String[] args) {
	
			for (int i = 100; i <= 999; i++) {
			    int x = i - (i / 100) * 100;

			    if (x * 7 == i) {
				System.out.println(i);
			    }
			}
		
	}

}
