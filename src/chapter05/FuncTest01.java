package chapter05;

import javax.swing.JOptionPane;

import chapter02.Example01;

public class FuncTest01 {
	
	//�հ� �޼ҵ�
		public static void sum(int num1, int num2) { //static�� new�� ���� �ʰ� �ٷ� ����� ����. ��ü�� ���� ������ �ϱ��ϴ� �������� ����. �Լ��� ���ο��� �ҷ��ٰ� ���� ���.
			int total=num1+num2;
			System.out.println(total);
		}
		

		public static void main(String[] args) {
			//�ΰ��� int���� �Է¹ޱ�
			int a, b;
			a=Integer.parseInt(JOptionPane.showInputDialog("��1"));
			b=Integer.parseInt(JOptionPane.showInputDialog("��2"));
			/*
			int sum=a+b;
			System.out.println(sum);
	       */
			sum(a,b);
			
			
		}

	}


	/*����������
	public : �ش� ����� � Ŭ������ ��Ű������ ���� ����
	protected : �ش� ����� ���� ��Ű�� ���� Ŭ����, �ش� Ŭ������ ����� Ŭ�������� ���� ����
	default : �ش� ����� ���� ��Ű�� �� Ŭ������������ ���� ����(���� ������ ��� ���Ҷ��� ����)
	private : �ش� ����� ����� Ŭ���� �������� ���� ����*/

