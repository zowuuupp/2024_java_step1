package chapter05;

import java.util.Scanner;

public class FuncTest07_1 {
	
	public static String EduStep(int edu) {
		String eduStep = null;
		switch (edu) {
		case 1: 
			eduStep="1�ܰ�";
			break;
			
		case 2: 
			eduStep="2�ܰ�";
			break;
			
		case 3: 
			eduStep="3�ܰ�";
			break;
			
		default:
			eduStep="�ش��ϴ� ���͵� �ܰ谡 �����ϴ�";
			break;
			
		}
		return eduStep;
		
	}

	public static void main(String[] args) {
		//����ڷκ��� ���͵� �ܰ踦 �Է¹޾Ƽ� EduStep ȣ���ϱ�
		//�޼ҵ带 ȣ���� ������� ��ȯ�޾� step�� ����
		
		Scanner scan = new Scanner(System.in);
		System.out.print("���͵� �ܰ踦 �Է��ϼ��� : ");
		int number = scan.nextInt();
		
		System.out.println("���� ���� �ܰ�� "+EduStep(number));
		
		
		
		
		
	}

}
