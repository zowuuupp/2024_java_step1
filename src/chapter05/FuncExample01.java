package chapter05;

import chapter02.Example01;

public class FuncExample01 {
	
	/*�� ������ �Է¹޾Ƽ�(=�Ű�����) �� ���� ����Ͽ� ��ȯ�ϴ� �޼ҵ带 �����غ�����.*/
	
	public static int sum1( int a , int b) {
		//int hap=a+b;
		//return hap;
		return a+b;
		
	}
	public static void sum2( int a , int b) {
		
		System.out.println("���2 "+(a+b));
	}
	
	public static void main(String[] args) {
		
		Example01 ex1=new Example01();
		
		int num1=10;
		int num2=20;
		//���1
		int result=sum1(num1,num2);
		System.out.println("���1 "+result);
		
		//���2
		sum2(num1,num2);
		
		
	}
	
	//FuncTest01 ���� ��
	
	
	
}
