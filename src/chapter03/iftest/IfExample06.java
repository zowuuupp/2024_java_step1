package chapter03.iftest;

public class IfExample06 {

	public static void main(String[] args) {
		// 1�� ~ 6������ ���� �� ����. �� ������ �н� ���(������ �������� �ޱ�)
		int num=(int)(Math.random()*6)+1;    // *6�� 6�� ���ٴ� ��. �׷��� 0 1 2 3 4 5 �̱� ������ +1�� ��ü������ �� ���ش�.
		
		if (num==1) {
			System.out.println("1�� -> ����");
		}else if (num==2) {
			System.out.println("2�� -> ��¡��Ƣ��");
		}else if (num==3) {
			System.out.println("3�� -> �");
		}else if (num==4) {
			System.out.println("4�� -> �踻��Ƣ��");
		}else if (num==5) {
			System.out.println("5�� -> ���");
		}else {
			System.out.println("6�� -> ������");
		}
		
		
		
		

	}//main

}//class
