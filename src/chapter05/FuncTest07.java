package chapter05;

import java.util.Scanner;

public class FuncTest07 {
	
	public static void EduStep(int edu) { //static�� �����Ƿ� new �� ������ �� �ִ�.
		if(edu==1) {
			System.out.println("���� ���͵� �ܰ�� step1 �Դϴ�.");
		}
		else if (edu==2) {
			System.out.println("���� ���͵� �ܰ�� step2 �Դϴ�.");
		}
		else if (edu==3) {
			System.out.println("���� ���͵� �ܰ�� step3 �Դϴ�.");
		}
		else {
			System.out.println("�ش��ϴ� ���͵� �ܰ谡 �����ϴ�.");
		}
	}//�޼ҵ�

	public static void main(String[] args) {
		//����ڷκ��� ���͵� �ܰ踦 �Է¹޾Ƽ� EduStep ȣ���ϱ�
		
		Scanner scan = new Scanner(System.in);
		System.out.print("���͵� �ܰ踦 �Է��ϼ��� : ");
		
		int number = scan.nextInt();
		EduStep(number);
		
		
	}

}
