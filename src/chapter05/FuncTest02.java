package chapter05;

import javax.swing.JOptionPane;

public class FuncTest02 {
	
	//�հ� �޼ҵ�
		public void sum(int num1, int num2) { //����
			int totla=num1+num2;
			System.out.println(totla);
		}
		
		public static void main(String[] args) { //Data
			//�ΰ��� int���� �Է¹ޱ�
			int a, b;
			a=Integer.parseInt(JOptionPane.showInputDialog("��1"));
			b=Integer.parseInt(JOptionPane.showInputDialog("��2"));
			/*
			int sum=a+b;
			System.out.println(sum);
	       */
			FuncTest02 Obj=new FuncTest02();
			Obj.sum(a,b); //�ǸŰ����� ���
			
		}

	}


	/*����������
	public : �ش� ����� � Ŭ������ ��Ű������ ���� ����
	protected : �ش� ����� ���� ��Ű�� ���� Ŭ����, �ش� Ŭ������ ����� Ŭ�������� ���� ����
	default : �ش� ����� ���� ��Ű�� �� Ŭ������������ ���� ����(���� ������ ��� ���Ҷ��� ����)
	private : �ش� ����� ����� Ŭ���� �������� ���� ����*/

