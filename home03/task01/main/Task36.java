package local.home03.task01.main;
/*
 * ���  ����������  �����,  ����������  ����  ��  ������  , 
 * ��������  �������������  �����,  ������� ������� �� �� ������������. 
 * ����� ��� �����. */

public class Task36 {
	
	public static void main(String[] args) {
		
		int i;
		int y;
		int x;
		
		for(i = 10; i < 100; i++) {
			for(y = 10; y < 100; y++) {
				x = i* 100 + y;
				
				if(x % (i * y) == 0 ) {
					System.out.println(" ����� " + x);
				}
			}
		}
		
	}

}
