package local.home03.task01.main;
/*
 * ���� ��� ���������� ����� � � �. 
 * �� ���� ����� ��������� 2 �������������� �����: 
 * ������ ����� �������� ����� ��������� ������� ����� �, ����� �. 
 * ��� ��������� ������� ����� ������� �������� ����� �,����� �. 
 * ����� ����� � � � ���� �������� , 
 * ��� ������ �������������� ����� ������ ������� �� 99, � ������ �� 49
 */

public class Task37 {

	public static void main(String[] args) {
		
		int i;
		int y;
		int x;
		int x1;
		
		for(i = 10; i < 100; i++) {
			for(y = 10; y < 100; y++) {
				x = i* 100 + y;
				x1 = y * 100 + i;
				
				if(x % 99 == 0 && x1 % 49 == 0) {
					if(x1 % 100 == x /100 && x % 100 == x1 /100) {
						System.out.println(" ����� " + x + " " + x1);
					}
				}
				}
				
			}
		
		
		
		
		
	}

}
