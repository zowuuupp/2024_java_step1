package chapter02;

import java.util.Scanner;

public class Example02 {

	public static void main(String[] args) {
		/* ��, ���, �������� Ű��� �ִµ� �Ϸ翡 ����Ǵ� ���� ���� 5��, 7��, 5�� �Դϴ�.
		 * ���������� �Ϸ翡 ����Ǵ� �� ������ ������ ����ϰ�,
		 * �ð���(24) ��ü ������ ��� ���� ������ ��� �Ͻÿ�.
		 * (��, ��հ��� ��� ������ Ÿ���� float)�� �����Ѵ�.
		 */
//#1 
		int pear=5;
		int apple=7;
		int orange=5;
		
		int fruitTotal=pear+apple+orange;
		float fruitAve=fruitTotal/24f;
		
		
		System.out.println("�Ϸ翡 ����Ǵ� �� ������ ����: "+fruitTotal+"��");
		System.out.println("�ð��� ��ü ������ ��� ���� ����:"+fruitAve+"��");
		
		
//#2    ���ܷ� ��ĳ�ʷ� �غ���
		Scanner scanner=new Scanner(System.in);
		
		System.out.print("���� �� : ");
		int num1=scanner.nextInt();
		System.out.print("����� �� : ");
		int num2=scanner.nextInt();
		System.out.print("�������� �� : ");
		int num3=scanner.nextInt();
		
		
		System.out.println("�Ϸ翡 ����Ǵ� �� ������ ���� : "+(num1+num2+num3)+"��");
		System.out.println("�ð��� ��ü ������ ��� ���� ���� : "+((float)(num1+num2+num3)/24)+"��");
		
		
		
		
		
		
		

	}

}
