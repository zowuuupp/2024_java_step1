package chapter03.switchtest;

import java.util.Scanner;

public class SwitchCase03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int month, day;
		
		System.out.print("���� �Է��ϼ���(1~12) : ");
		month=scan.nextInt();
		
		switch (month) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:{
			day=31;
			break;
		}
		case 2: {
			day=28;
			break;
		}
		case 4: case 6: case 9: case 11: {
			day=30;
			break;
		}
		default:
			day=0;
			System.out.println("�������� �ʴ� ���Դϴ�.");
			break;
		}//switch
		
		System.out.println(month+"���� "+day+"�ϱ��� �ֽ��ϴ�.");
		
		
	}//main

}//class
