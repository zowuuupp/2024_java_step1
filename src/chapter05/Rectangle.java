package chapter05;

public class Rectangle {
	
	/* �簢���� ���̸� ����ϴ� �޼ҵ�  calculateArea �� �����ε� �Ͽ� ���ο� ���α���,
	�׸��� �� ���� ���̸� �޾Ƽ� ����� �� �ְ� ��������.
	�簢�� ���� ���(���簢��) = ���� x ����(�Ű����� 2��) ���� 5, ���� 3 
	�簢�� ���� ���(���簢��) = �� ���� ���� x �� ���� ����(�Ű����� 1��)  �� ���� ���� 4 */
	
	public double calculateArea(double a, double b) {
		return a*b;
	}
	public double calculateArea(double a) {
		return a*a;
	}
	
	public static void main(String[] args) {
		//��ü���� �ϱ�
		Rectangle rectangle = new Rectangle();
		double area1 = rectangle.calculateArea(5.0,3.0);
		double area2 = rectangle.calculateArea(4.0);
		System.out.println("�簢���� ���� (����5, ����3): "+area1);
		System.out.println("���簢���� ���� (�� ���� ����4): "+area2);
		
		
		
		
	}

}
