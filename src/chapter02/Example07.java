package chapter02;

import java.util.Scanner;

public class Example07 {

	public static void main(String[] args) {
		// �� �ڸ��� ���ڸ� �Է¹޾� (scan)
		// ���ڰ� ¦������ Ȧ������ ����ϴ� ���α׷�(���� ������ ���)
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("�� �ڸ��� ���ڸ� �Է��ϼ���. : ");
		int num=scan.nextInt();
		
		String result = (num % 2 == 1) ? "Ȧ��" : "¦��";
		System.out.println(result);
		
		// int remainder=num % 2;
		// boolean isOdd=remainder==1;        // true/false
		// String rs = isOdd ? "Ȧ��" : "¦��";
		
		
		
		
		
		

	}

}
