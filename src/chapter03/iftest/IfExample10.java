package chapter03.iftest;

import java.util.Scanner;

public class IfExample10 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.print("���̵� : ");
		String ID=scan.nextLine();
		System.out.print("��й�ȣ : ");
		String PW=scan.nextLine();
		
		int pass = Integer.parseInt(PW);
		
		if (ID.equals("admin")) {
			if (pass==240219) {
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
