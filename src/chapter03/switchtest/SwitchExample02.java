package chapter03.switchtest;

import java.util.Scanner;

public class SwitchExample02 {

	public static void main(String[] args) {
		/*
		����ڷκ��� ������ �Է¹޾�(1~7) �ش� ���Ͽ� � ������ ������ ����ϴ� ���α׷��� �ۼ��ϼ���.
		(������:������, ȭ����:���İ�Ƽ,------,�Ͽ���:�ʹ�)-->�������� �԰������ �ƹ��ų� 
		 */
		
		Scanner scan = new Scanner(System.in);
		
		String eat, day;
		
		System.out.print("� �丮�� ������?");
		day = scan.nextLine();
		
		switch (day) {
		case "������": case "�����": {
			eat="��������";
			break;
		}
		case "ȭ����": {
			eat="���";
			break;
		}
		case "������": case "�ݿ���": {
			eat="��ȭ�丮";
			break;
		}
		case "�����": {
			eat="������";
			break;
		}
		case "�Ͽ���": {
			eat="�ʹ�";
			break;
		}
		default:
			eat="������ �߸� �Է��ϼ̽��ϴ�.";
			break;
		}
		
		System.out.println(day+"���� "+eat+"��(��) ���� �����Դϴ�.");
	}

}
