package chapter03.whiletest;

import java.util.Random;
import java.util.Scanner;

public class WhileExample05 {

	public static void main(String[] args) {
		
		/*���� ���߱� ����
		1���� 100���� ������ ���ڸ� �����ϰ�, ���ڸ� ���ߴ� ����
		���� �Է��� ���ڰ� ��ǻ�Ͱ� ������ ���ں��� ũ�� "�� ���� ���ڸ� �����ϼ���" ���
		���� �Է��� ���ڰ� ��ǻ�Ͱ� ������ ���ں��� ������ "�� ū ���ڸ� �����ϼ���" ���
		������ ���ڸ� ��Ȯ�� ���� ������ ������ �ݺ�
		���⶧���� �ɸ� �õ� Ƚ���� ����Ͽ� ������ �޽����� ���*/
		Scanner scan = new Scanner(System.in);
		
		Random random = new Random();  // ���� import ��������� ctrl shift o �̴�
		int targetNumber = random.nextInt(100)+1; //��ǻ�� ���� ����
		int guess;
		int count=0;
		
		System.out.println("1���� 100������ ���ڸ� ���纸����.");
		
		do {
			//����ڰ� ������ ���� �Է� �޾Ƽ� ī��Ʈ �ϳ��� �ø���
			System.out.print("���� �Ͻô� ���ڸ� �Է����ּ��� : ");
			guess = scan.nextInt();
			
			count++;
			//���� �Է��� ���ڰ� ��ǻ�Ͱ� ������ ���ں��� ũ�� "�� ���� ���ڸ� �����ϼ���" ���
			//���� �Է��� ���ڰ� ��ǻ�Ͱ� ������ ���ں��� ������ "�� ū ���ڸ� �����ϼ���" ���
			if(guess>targetNumber) {
				System.out.println("�� ���� ���ڸ� �����ϼ���");
				
			} else if (guess<targetNumber) {
				System.out.println("�� ū ���ڸ� �����ϼ���");
				
			} 	
			
		} while (guess != targetNumber);
		System.out.println();
		System.out.println("�����մϴ�! "+count+"�� ���� ���߾����ϴ�.");
		System.out.println("PC�� ������ ���� : "+targetNumber);
		System.out.println("User�� ������ ���� : "+guess);
	}

}
