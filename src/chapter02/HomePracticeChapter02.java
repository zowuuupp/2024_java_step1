package chapter02;

import java.util.Scanner;

public class HomePracticeChapter02 {

	public static void main(String[] args) {
		
		/*
		int mathScore=79;
		int engScore=95;
		int korScore=97;
		
		int total = mathScore + engScore + korScore;
		
		double avg = total / 3.0;
		
		System.out.println("���� : "+total);
		System.out.println("��� : "+avg);
		
		System.out.println("====AssignTest=====");
		
		int num1=15;
		int num2=30;
		
		System.out.println(num1);
		num1+=num2;// num1=num1+num2
		System.out.println(num1);
		
		int num3=20;
		System.out.println("num3=num3+10 : "+(num3+=10));
		System.out.println("num3=num3-10 : "+(num3-=10));
		System.out.println("num3=num3*10 : "+(num3*=10));
		System.out.println("num3=num3/10 : "+(double)(num3/=10));
		System.out.println("num3=num3%10 : "+(num3%=10));
		
		System.out.println("====��������=====");
		int gameScore=150;
		int lastScore1=++gameScore;
		System.out.println(gameScore);
		System.out.println(lastScore1);
		int lastScore2=--gameScore;
		System.out.println(gameScore); //150
		System.out.println(lastScore2); //150
		
		System.out.println("====��������=====");
		int lastScore3=gameScore++;
		System.out.println(lastScore3);//150
		System.out.println(gameScore);//151
		int lastScore4=gameScore--;
		System.out.println(lastScore4);//151
		System.out.println(gameScore);//150
		*/
		/*
		System.out.println("�л��� ��� ������, ���������� � ������ ���غ���");
		// 534���� å�� �л� 30���� �Ȱ��� ������ ������ ��,
		// �л��� ��� ������, ���������� � ������ ���غ���
		
		System.out.println("=======����=======");
		
		/*Scanner scanner = new Scanner(System.in);
		
		System.out.print("å�� ���� : ");
		int books = scanner.nextInt();
		System.out.print("�л��� �� : ");
		int students = scanner.nextInt();
		
		System.out.println("�л��� �� ���� ������ å�� �� : "+(books/students));
		System.out.println("���� å�� �� : "+(books%students));
		
		System.out.println("=======����=======");
		*/
		
		/* ��, ���, �������� Ű��� �ִµ� �Ϸ翡 ����Ǵ� ���� ���� 5��, 7��, 5�� �Դϴ�.
		 * ���������� �Ϸ翡 ����Ǵ� �� ������ ������ ����ϰ�,
		 * �ð���(24) ��ü ������ ��� ���� ������ ��� �Ͻÿ�.
		 * (��, ��հ��� ��� ������ Ÿ���� float)�� �����Ѵ�.
		 * */
		
		/*Scanner scan = new Scanner(System.in);
		
		System.out.print("���� ���� : ");
		int pear=scan.nextInt();
		System.out.print("����� ���� : ");
		int apple=scan.nextInt();
		System.out.print("�������� ���� : ");
		int orange=scan.nextInt();
		
		System.out.println("�Ϸ翡 ����Ǵ� �� ������ ���� : "+(pear+apple+orange));
		System.out.println("�ð��� ��ü ������ ��� ���� ���� : "+(float)(pear+apple+orange)/24);
		
		
		System.out.println("=======����=======");
		*/
		
		//score1�� 60���� ũ�ų� ������ �հ� �ƴϸ� ���հ����� ��ȯ�Ͻÿ�
		
		/*
		// score2�� 90���� ũ�� A, 80���� ũ�� B, �� ���ϴ� C�� �����Ѵ�.
		
		int score2=50;
		
		String result,result2;
		
		
		result = score2 >90 ? "A" : "B";
		result2 = score2 <=80 ? "C" : result ;
		
		System.out.println("�� �л��� ��� : "+result2);
		*/
		
		//���� ���̸� ���ϼ���.(������*������*3.14)
		//������ :10, 3.14�� double�� �����Ͽ� ���Ͻÿ�
		//������ ������ num1 / 3.14 ������ pi / ���� ������ result
		/*
		int num1=10;
		double pi=3.14;
		double result;
		
		result = num1 * num1 * pi;
		*/
		
		/*Scanner �� ����Ͽ� 
		�� ���� �Ҹ���(boolean) ���� isSunny�� isWarm�� �Է¹޾�, 
		������ ȭâ�ϸ鼭 �������� ���θ� ����ϴ� ���α׷��� �ۼ��ϼ���.
		(������ ȭâ�ϸ鼭 ���������� ���� ���� isNiceWeather ���� �ۼ��ϼ���.)
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("������ ȭâ�Ѱ���? true/false : ");
		boolean isSunny=scan.nextBoolean();
		System.out.print("������ �����Ѱ���? true/false : ");
		boolean isWarm=scan.nextBoolean();
		boolean isWeather= isSunny && isWarm ;
		
		if ( isSunny == true  && isWarm==true ) {
			
			System.out.println("������ ȭâ�ϸ鼭 �����ϴ�.");
		} else if ( isSunny == true  && isWarm==false ) {
			
			System.out.println("������ ȭâ������ �������� �ʴ�.");
		} else if ( isSunny == false  && isWarm==true ) {
			
			System.out.println("������ ȭâ���� ������ �����ϴ�.");
		} else {
			
			System.out.println("������ ȭâ���� �ʰ� �������� �ʴ�.");
		}
		System.out.println("======isWeather Ȯ��========");
		System.out.println(isWeather);
		*/
		
		/*
		// �� �ڸ��� ���ڸ� �Է¹޾� (scan)
		// ���ڰ� ¦������ Ȧ������ ����ϴ� ���α׷�(���� ������ ���)
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Ȯ���ϰ��� �ϴ� ���ڸ� �Է��ϼ���. : ");
		int num=scan.nextInt();
		String result;
		
		result = num%2 ==0 ? "¦��" : "Ȧ��";
		
		System.out.println("�Է��Ͻ� ���� Ȧ�� ¦�� ���� Ȯ�� : "+result);
		*/
		
		// �� ���� ���ڸ� �Է� �޾Ƽ� ù ��° ����(num1)�� �� ��° ����(num2)����
	    // ū�� ���θ� ����ϴ� ���α׷��� �ۼ��ϼ���.
		
		/*
		Scanner scan = new Scanner(System.in);
		System.out.print("ù ��° ���ڸ� �Է��� �ּ��� : ");
		int num1=scan.nextInt();
		System.out.print("�� ��° ���ڸ� �Է��� �ּ��� : ");
		int num2=scan.nextInt();
		
		String result,result2;
		result = num1 > num2 ? "ù ��° ���ڰ� ũ��" : "�� ��° ���ڰ� �� ũ��" ;
		result2 = num1 == num2 ? "ù ��° ���ڿ� �� ��° ���ڰ� ����" : result ;
		
		System.out.println("2���� ���ڸ� ���� ��� : "+result2);
		*/
		
		
		
		
		
		
		

	}

}
