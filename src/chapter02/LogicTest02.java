package chapter02;

public class LogicTest02 {

	public static void main(String[] args) {


		int num1=10;
		int i=2;
		
		boolean value=(i=i+2)<10 && (num1=num1+2)<10;
		System.out.println(i);//4
		System.out.println(num1);//12
		System.out.println(value);//F
		
		System.out.println("======================");
	    value=(i=i+2)<10 || (num1=num1+2)<10; // �ѹ� ���� �� boolean �ϸ� ���� ����.
		System.out.println(i); //6
		System.out.println(num1);//������� ��� 14�̴�. �ٵ� 12�̴�. ���ϱ�? �պκ��� true �̹Ƿ� ������ true. �׷��Ƿ� ������ �������� ����. 
		System.out.println(value);//T		
		
		
		
	}

}
