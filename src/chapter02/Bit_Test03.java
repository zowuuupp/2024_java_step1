package chapter02;

import java.util.Scanner;

public class Bit_Test03 {

	public static void main(String[] args) {
		// Ű���� �Է°� �ޱ�
		Scanner scanner=new Scanner(System.in); // ������ �ִ� ������ �ڵ�� �߿��� �Է¿� ���� �ڵ常 �����ͼ� �Է��� �ϰڴ�. �ϴ� ��ü���� �� ��ü�� �� �ܿ���.
		
		System.out.print("ù��° ���� �Է� : ");
		int num1=scanner.nextInt();
		System.out.print("�ι�° ���� �Է� : ");
		int num2=scanner.nextInt();
		
		//System.out.println(num1); Ȯ�� ������ �̷��� ��.
		//System.out.println(num2); 
		
		int andResult= num1 & num2;
		int orResult= num1 | num2;
		int xorResult= num1 ^ num2;
		
		System.out.println("��Ʈ AND ��� : "+andResult);
		System.out.println("��Ʈ OR ��� : "+orResult);
		System.out.println("��Ʈ XOR ��� : "+xorResult);
		
		
	}

}
