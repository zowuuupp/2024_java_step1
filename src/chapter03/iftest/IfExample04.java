package chapter03.iftest;

import javax.swing.JOptionPane;

public class IfExample04 {

	public static void main(String[] args) {
		/*���ð��� ������ ������ �Ƶ��� 1000�� -> 7
		���ð��� ������ �ʵ��л��� 2000�� -> 13
		���ð��� ������ ��,����л��� 3500�� -> 19
		���ð��� ������ ������ 5000��*/
		
		int age;
		
		age=Integer.parseInt(JOptionPane.showInputDialog("���̸� �Է��ϼ���"));
		
		int price;
		
		if (age <= 7) {
			price=1000;
			System.out.println("������ �Ƶ� ������ "+price+"���Դϴ�.");
		}else if (age <= 13) {
			price=2000;
			System.out.println("�ʵ��л� ������ "+price+"���Դϴ�.");
		}else if (age <= 19) {
			price=3500;
			System.out.println("��,����л� ������ "+price+"���Դϴ�.");
		}else {
			price=5000;
			System.out.println("���� ������ "+price+"���Դϴ�.");
		}
		
		System.out.println("========����=======");
		
		//���1
		int charge;
		if(age<=7) {
			charge=1000;
			System.out.println("������ �Ƶ��Դϴ�.");
		}else if (age<=13) {
			charge=2000;
			System.out.println("�ʵ��л� �Դϴ�.");
		}else if (age<=19) {
			charge=3500;
			System.out.println("��,����л� �Դϴ�.");
		}else {
			charge=5000;
			System.out.println("���� �Դϴ�.");
		} 
		
		System.out.println("������ "+charge+"�� �Դϴ�.");
		
		System.out.println("========����=======");
		
		//���2
		String dev;
		int money;
		
		if(age>=20) {
			dev="����";
			money=5000;
		}else if (age>=14) {
			dev="��,����л�";
			money=3500;
		}else if (age>=8) {
			dev="�ʵ��л�";
			money=2000;
		}else {
			dev="������ �Ƶ�";
			money=1000;
		}
		
		System.out.println(dev+"�̹Ƿ� ������ "+money+"�� �Դϴ�.");
		
		
		
		
	}

}
