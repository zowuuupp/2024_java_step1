package chapter06;

import javax.swing.JOptionPane;

public class SungJuk {
	
	//�������=�ʵ�
	private String std_num;
	private String std_name;
	private int java, oracle, spring;
	
	//������
	
	//�޼ҵ�
	public void Sum() {
		int sum = java+oracle+spring;
		System.out.println("�� �հ� : "+sum);
	}
	public void Avg() {
		double avg = (double)(java+oracle+spring) / 3 ;
		System.out.println("��� : "+avg);
	}

	public static void main(String[] args) {
		
		SungJuk rec = new SungJuk(); //SungJuk Ŭ������ ��ü����(rec)
		rec.std_num=JOptionPane.showInputDialog("�й�");
		rec.std_name=JOptionPane.showInputDialog("����");
		
		rec.java=Integer.parseInt(JOptionPane.showInputDialog("�ڹ�����  �Է�"));
		rec.oracle=Integer.parseInt(JOptionPane.showInputDialog("����Ŭ����  �Է�"));
		rec.spring=Integer.parseInt(JOptionPane.showInputDialog("����������  �Է�"));
		
		System.out.println("�й� - "+rec.std_num+" | ���� - "+rec.std_name+"���� �����Դϴ�.");
		System.out.println("==========================================================");
		rec.Sum();
		rec.Avg();
		
		
	}

}
