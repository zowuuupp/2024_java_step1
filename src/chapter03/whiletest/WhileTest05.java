package chapter03.whiletest;

import java.util.Scanner;

public class WhileTest05 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		while (true) {
			System.out.print("Java ������ ������ �Է��ϼ��� : ");
			int scr=scan.nextInt();
			
			if (scr>=60) {
				System.out.println("�հ��Դϴ�.");
				break;
			} 
			else if ( scr<0 || scr>100) {
				System.out.println("������ �߸� �Է��ϼ̽��ϴ�.");
				break;
			} 
			else {
				System.out.println("���հ��Դϴ�.");
				break;
			}
			
		}
		System.out.println("���α׷� ����");
		
		
		

		
	}

}
