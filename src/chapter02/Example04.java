package chapter02;

public class Example04 {

	public static void main(String[] args) {
		//���� ���̸� ���ϼ���.(������*������*3.14)
		//������ :10, 3.14�� double�� �����Ͽ� ���Ͻÿ�
		//������ ������ num1 / 3.14 ������ pi / ���� ������ result
				
		//#1		
		int num1=10;
		double pi=3.14;
		
		double result = num1 * num1 * pi ;
		System.out.println("���� ���� : "+result);
		
		//int -> double ������ ����ȯ
		
		// double result = num1(int) * num1(int) * pi(double,8byte) ;
		
		//#2
		int num2 = 10;
		int num3 = 3;
		int num4 = 14;
		
		//String => double : Double.parseDouble
		//String => int : Integer.parseDouble
		
		double result2 = num2 * num2 * Double.parseDouble(num3+"."+num4);
		//int result2 = num2 * num2 * Integer.parseInt(num3+"."+num4);
		System.out.println("���� ���� : "+result2);
		
		

		
		
		
		
		
		

	}

}
