package local.home03.task01.main;
/*
 * ���  ���������  ������������  �����  ����������, 
 * ��������  ��  ���  �����  �������������� ����������. 
 * ��������������, ��� � ����� �� ����� ��� ����. ��������: 1357, 963.
 */

public class Task38 {
	
	public static void main(String[] args) {
		
		int a = 12345;
		int k = 0;
		int x = 0;
		boolean prog = true;

		while (a > 0) {

		    if (k != 0) {
			if (x - (a % 10) != k) {
			    prog = false; 
			}
		    } 
		    else {
			if (x != 0) {
			    k = x - a % 10;
			}
		    }

		    x = a % 10;
		    a = a / 10;
		}

		if (prog) {
		    System.out.println("��� �������������� ����������");
		} 
		else {
		    System.out.println("��� �� �������������� ����������");
		}
		
	}
	

}
