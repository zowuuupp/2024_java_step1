package chapter02;

import java.util.Scanner;

public class Example01 {

	public static void main(String[] args) {
		// 534���� å�� �л� 30���� �Ȱ��� ������ ������ ��,
		// �л��� ��� ������, ���������� � ������ ���غ���
				
		int books=534;
		int students=30;
		
		//�л��� �� ���� ������ å�� ��
		int booksPerStudents = (books/students);
		System.out.println("�л��� �� ���� ������ å�� �� : "+booksPerStudents);
		//���� å�� ��
		int bookLeft=(books & students);
		System.out.println("���� å�� �� : "+bookLeft);
		
		//���� ��ĳ�ʷ� ȥ�� �غ���
		Scanner scanner=new Scanner(System.in);
		
		System.out.print("å�� �� : "); // ���⼭ println�� print �� �ٲ��ִ� ������ �Է¶����� �Է�Ŀ���� ���� ������ ���� �� �ƴ϶� �ڷ� ���� �ϱ� ���ؼ� �� �� ����.
		int num1=scanner.nextInt();
		System.out.print("�л� �� : ");
		int num2=scanner.nextInt();
		
		System.out.println("�л��� �� ���� ������ å�� �� : "+(num1/num2));
		System.out.println("���� å�� �� : "+(num1%num2));
		
		
		

	}

}
