package chapter03.fortest;

import java.util.Scanner;

public class ForTest06 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int i;
		System.out.print("0���� ũ�鼭 11���� ���� ���ڸ� �Է��ϼ��� : ");
		int a=scan.nextInt();
		
		if (a>0 && a<11) {
			for (i=1 ; i<=a ; i++) {
				System.out.println("�����ϼ���~~");
				
			}
			
		} else {
			System.out.println("�Է� ���� �߸��Ǿ����ϴ�.");
		}
		
		System.out.println("���α׷� ����");
		


	}//main
}//class
