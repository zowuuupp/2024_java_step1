package chapter03.switchtest;

import java.util.Scanner;

public class SwitchExample01 {

	public static void main(String[] args) {
		/*����ڷκ��� ���� �Է¹޾�, �ش� ���� ������ ����ϴ� ���α׷��� �ۼ��ϼ���.
		 * ��:3-5��, ����:6-8��, ����:9-11��, �ܿ�: 12-2��*/
		
		Scanner scan = new Scanner(System.in);
		System.out.print("���� ���� : ");
		
		int month=scan.nextInt();
		String season;
		
		switch (month) {
		case 3: case 4: case 5: {
			season="��";
			break;
		}
		case 6: case 7: case 8: {
			season="����";
			break;
		}
		case 9: case 10: case 11: {
			season="����";
			break;
		}
		case 12: case 1: case 2: {
			season="�ܿ�";
			break;
		}
		default:
			season="�� �� ����";
			System.out.println("�Է��Ͻ� ������ �߸� �Ǿ����ϴ�.");
			break;
		}
		
		System.out.println(month+"���� ������ "+season+"�Դϴ�.");
	}

}
