package chapter03.iftest;

import java.util.Scanner;

public class IfExample11 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.print("���̵� : ");
		String ID=scan.nextLine();

		
		if (ID.equals("admin")) { //ID�� ��ġ ������ 
			System.out.print("��й�ȣ : "); //����� �Է��ϰ� �ϴµ�
			int pass = Integer.parseInt(scan.nextLine()); // �� ����� int�� ��ȯ�����ָ�
			if (pass==240219) { //�н����� ��ġ Ȯ���� �Ѵ�.
			System.out.println(ID+"�� ȯ���մϴ�.");
		}else {
			System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
		}
		}
		else {
		    System.out.println("������ ID�� �����Ͽ� �ּ���.");
			
		}//if
		
		
		

	}//main

}
