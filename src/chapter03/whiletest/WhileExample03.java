package chapter03.whiletest;

import java.util.Scanner;

public class WhileExample03 {

	public static void main(String[] args) {
		
		boolean run = true;
		int balance = 0; //����(+) , ���(-), �ܾ���ȸ(balance)
		
		Scanner scan = new Scanner(System.in);
		
		
		while (run) {
			System.out.println("-------------------------------------");
			System.out.println("1.���� | 2.��� | 3.�ܰ� | 4.����");
			System.out.println("-------------------------------------");
			System.out.println("����>");
			int menuNum=Integer.parseInt(scan.nextLine()); // �� int meneNum = scan.nextint�� �ص� �ȴ�. �� �� ��ȯ �����ַ��� �̷��� �ϽŰ�.
			
			
			switch (menuNum) {
			case 1 : 
				System.out.println("���ݾ�>");
				int money1 = Integer.parseInt(scan.nextLine()); 
				balance+=money1;
				break;
				
				/* ������
				balance += Integer.parseInt(scan.nextLine());
				break;
				*/
				
			case 2 : 
				System.out.println("��ݾ�>");
				int money2 = Integer.parseInt(scan.nextLine());
				balance-=money2;
				break;
				
				/* ������
				balance -= Integer.parseInt(scan.nextLine());
				break;
				*/
				
			case 3 : 
				System.out.println("�ܰ��>");
				System.out.println(balance);
				break;
				
			case 4: 
				run=false;
				break;
			
			}

		} System.out.println("���� ���α׷��� �����մϴ�.");

	}

}
