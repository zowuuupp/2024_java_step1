package chapter03.whiletest;

import java.util.Scanner;

public class WhileTest09 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int num;
		
		while (true) {
			System.out.print("1.�Է��ϱ� 2.����ϱ� 3.�����ϱ� 4.������ �۾��� ��ȣ�� �������ּ��� : ");
			num=scan.nextInt();
			System.out.println();
			
			switch (num) {
			case 1:  //case �ȿ��� { } ��� �ȴ�.
				System.out.println("�Է��ϱ⸦ �����ϼ̽��ϴ�.");
				break;
			
			case 2: 
				System.out.println("����ϱ⸦ �����ϼ̽��ϴ�.");
				break;
			
			case 3: 
				System.out.println("�����ϱ⸦ �����ϼ̽��ϴ�.");
				break;
			
			case 4: 
				System.out.println("������ �۾��� ��ȣ�� �������ּ���.");
				break;
			
			default:
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			}
			if (num==4) {
				break;
			}
			
		}
		
		
	}

}
