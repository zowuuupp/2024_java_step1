package chapter03.whiletest;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class WhilePractice {

	public static void main(String[] args) {
		
		
		//�ڷ���� �Է��ϴ� �� �� �Է��� �ڷ��� ������ �� ���̸� �հ� ����� ��� �Ǵ°�?
		
		/*
		int num, cnt=0, sum=0 ;
		double avg;
		
		Scanner scan = new Scanner(System.in);
		
		while (true) {
			
			System.out.print("���� �Է����ּ���. : ");
			num = scan.nextInt();
			if( num ==0 ) {
				
				break;
			}
			sum+=num;
			cnt++;
		}
		
		System.out.println("Ƚ�� : "+cnt);
		System.out.println("�� : "+sum);
		*/
		/*
		int num=1;
		int sum=0;
		
		do {
			
			sum+=num;
			num++;
		} while (num<=10);
		System.out.println("�� : "+sum);
		*/
		/*
		int num=1;
		int sum=0;
		for (int i=0; i<10; i++) {
			
			sum+=num;
			num++;
		}
		System.out.println(sum);
		*/
		
		//OTP ������ ������ ���̴�. do while ���� �̿��Ͽ� ������
		/*
		int DB , ID , PW;
		DB = Integer.parseInt(JOptionPane.showInputDialog("OTP DB"));
		PW = Integer.parseInt(JOptionPane.showInputDialog("OTP PW"));
		
		do {
			
			ID = Integer.parseInt(JOptionPane.showInputDialog("OTP ID"));
			if ( DB == ID) {
				
				int Pass = Integer.parseInt(JOptionPane.showInputDialog("��й�ȣ�� �Է��ϼ���."));
				if ( PW == Pass) {
					
					System.out.print("�α��ο� �����ϼ̽��ϴ�.");
					break;
				}
				else {
					
					System.out.println("PW�� �߸� �Է��ϼ̽��ϴ�. ó������ �ٽ� �������ּ���.");
				}
			}
			else if ( DB != ID) {
				
				System.out.println("ID�� �߸� �Է��ϼ̽��ϴ�. �ٽ� �Է��ϼ���");
			}
		} while (true);
		*/
		
		// "1.�Է��ϱ� 2.����ϱ� 3.�����ϱ� 4.������ �۾��� ��ȣ�� �������ּ��� : " �� while���� �̿��Ͽ� ��Ÿ�����.
		/*
		int num;
		
		Scanner scan = new Scanner(System.in);
		while (true) {
			
			System.out.println("======================");
			System.out.print("�۾��� ��ȣ�� �������ּ���. : "+"\n");
			System.out.println("======================");
			num = scan.nextInt();
			switch (num) {
			case 1: 

				System.out.println("1.�Է��ϱ�");
				break;
			case 2: 

				System.out.println("2.����ϱ�");
				break;	
			case 3: 

				System.out.println("3.�����ϱ�");
				break;
			
			case 4: 

				break;
			default:
				break;
			}
		}
		*/
		
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
		
			num=scan.nextInt();
		
			if (num == 1) {
			
				System.out.println("������ �����ϼ̽��ϴ�. �ݾ��� �Է����ּ���.");
				money=scan.nextInt();
				save+=money;
			}
			else if (num == 2) {
				
				System.out.println("����� �����ϼ̽��ϴ�. �ݾ��� �Է����ּ���.");
				money=scan.nextInt();
				if (money > save) {
					
					System.out.println("�ݾ��� �ʰ��ϼ̽��ϴ�. �ݾ��� �ٽ� �Է����ּ���.");
				}
				else {
					
					save-=money;
				}
			}
			else if (num == 3) {
				
				System.out.println("�ܰ� �����ϼ̽��ϴ�. �ܰ��� �ݾ��� "+save+"�� �Դϴ�.");
			}
			else if (num == 4) {
				
				System.out.println("���α׷��� �����մϴ�.");
			}
			else {
				
				System.out.println("��ȣ�� �߸� �Է��Ͽ����ϴ�. ��ȣ�� �ٽ� �Է����ּ���.");
			}
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
