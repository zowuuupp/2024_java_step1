package chapter03.whiletest;

import java.util.Scanner;

public class WhileExample04 {

	public static void main(String[] args) {
		
		boolean run = true;
		int num;
		int save=0;
		int money;
		
		Scanner scan = new Scanner(System.in);
		
		
		while (run) {
			System.out.println("-------------------------------------");
			System.out.println("1.���� | 2.��� | 3.�ܰ� | 4.����");
			System.out.println("-------------------------------------");
			System.out.println("����>");
			
			num = scan.nextInt(); 
			
			if (num==1) {
				System.out.println("������ �����ϼ̽��ϴ�.");
				System.out.println("���� �ݾ� : "+save);
				System.out.print("�Ա��� �ݾ��� �Է��ϼ��� : ");
				money = scan.nextInt();
				
				if (money<0) {
					System.out.println("�ݾ��� �߸� �Է��ϼ̽��ϴ�.");
				}
				save+=money;
			} else if (num==2) {
				System.out.println("����� �����ϼ̽��ϴ�.");
				System.out.println("���� �ݾ� : "+save);
				System.out.print("����� �ݾ��� �Է��ϼ��� : ");
				money = scan.nextInt();
				
				if (save<money) {
					System.out.println("�ܾ��� �����ϹǷ� ����� �Ұ����մϴ�.");
					System.out.println("���� �Ա��� �������ּ���.");
				} else if (save>=money) {
					save-=money;
				}
				
			} else if (num==3) {
				System.out.println("�ܰ� Ȯ���� �����ϼ̽��ϴ�.");
				System.out.println("�ܾ� Ȯ�� : "+save);
			} else if (num==4) {
				System.out.println("���Ḧ �����ϼ̽��ϴ�.");
				run=false;
			} else {
				System.out.println("�߸��� ���� ��ȣ�� �����ϼ̽��ϴ�.");
			}

			
		} System.out.println("���α׷��� �����մϴ�.");

	}

}
