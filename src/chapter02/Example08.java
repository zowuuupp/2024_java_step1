package chapter02;

import java.util.Scanner;

public class Example08 {

	public static void main(String[] args) {
		// �� ���� ���ڸ� �Է� �޾Ƽ� ù ��° ����(num1)�� �� ��° ����(num2)����
	    // ū�� ���θ� ����ϴ� ���α׷��� �ۼ��ϼ���.
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.print("ù ��° ���� : ");
		int num1 = scan.nextInt();
		System.out.print("�� ��° ���� : ");
		int num2 = scan.nextInt();
		
		String result = num1 > num2 ? "ũ��" : "�۴�";
		String result2 = num1 == num2 ? "����" : result;
		System.out.print("ù ��° ���ڿ� �� ��° ������ ũ�� ���� : "+result2);
		
		
		
		

	}

}
