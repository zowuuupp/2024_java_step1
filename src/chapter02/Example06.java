package chapter02;

import java.util.Scanner;

public class Example06 {

	public static void main(String[] args) {
		/*Scanner �� ����Ͽ� 
		�� ���� �Ҹ���(boolean) ���� isSunny�� isWarm�� �Է¹޾�, 
		������ ȭâ�ϸ鼭 �������� ���θ� ����ϴ� ���α׷��� �ۼ��ϼ���.
		(������ ȭâ�ϸ鼭 ���������� ���� ���� isNiceWeather ���� �ۼ��ϼ���.)*/
		
		Scanner scanner =new Scanner(System.in);
		
		System.out.print("������ ȭâ�Ѱ���? (true/false) : ");
		boolean isSunny=scanner.nextBoolean();
		System.out.print("������ �����Ѱ���? (true/false) : ");
		boolean isWarm=scanner.nextBoolean();
		
		boolean isNiceWeather=(isSunny == true) && (isWarm == true);
		System.out.print("������ ȭâ�ϸ鼭 �����Ѱ���? : "+isNiceWeather);
		
		// boolean isNiceWeather = isSunny && isWarm;
		
		
		

	}

}
