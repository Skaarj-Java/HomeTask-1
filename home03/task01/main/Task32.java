package local.home03.task01.main;

import java.io.InputStreamReader;
import java.util.Scanner;
/*
 *  ���������  ���������  �������������  ������  ��  �������  ������������  ��������. 
 *  �  �������� �������  �������  ���������  ������  �����  �  ����  �������������.  
 *  ���������  �������  �����  ���� �������, ������� � ������ �������������.
 */

public class Task32 {
	
	 public static void main(String[] args) {
		 
		    String x1 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ_";
			String x2 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ_0123456789";
			boolean x3 = true;
			Scanner sc = new Scanner(new InputStreamReader(System.in));

			String userString = sc.next();



			if (!x3) {
			    System.out.println("������ �������� ����������� �������");
			} 
			else {
			    System.out.println("������ �� �������� ����������� �������");
			}
		 
	 }

}
