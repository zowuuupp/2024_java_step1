package chapter03.iftest;

import java.util.Scanner;

public class IfExample07 {

	public static void main(String[] args) {
		// Scanner ���
		
		Scanner scan=new Scanner(System.in);
		
		//num1
		System.out.print("1. ù ��° �� : ");
		double num1=Double.parseDouble(scan.nextLine());  // scan.nextline �� String�̴�. �̰Ÿ� �׳� (double)�δ� �� �ٲ۴�. �ڷ����� �ڷ����� �ƴϰ� class�� �ڷ����̴�.
		System.out.println("ù��° �Է¹��� �� ��� : "+num1);
		//num2
		System.out.print("2. �� ��° �� : ");
		double num2=Double.parseDouble(scan.nextLine());
		System.out.println("�ι�° �Է¹��� �� ��� : "+num2);
		
		
		
		

	}

}
