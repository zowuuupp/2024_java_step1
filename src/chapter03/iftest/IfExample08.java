package chapter03.iftest;

import javax.swing.JOptionPane;

public class IfExample08 {

	public static void main(String[] args) {

		int num1 , num2 ;
		
		num1=Integer.parseInt(JOptionPane.showInputDialog("��1"));
		num2=Integer.parseInt(JOptionPane.showInputDialog("��2"));
		
		if (num1 > num2) {
			System.out.println("��1�� Ů�ϴ�.");
		}else if (num1 < num2) {
			System.out.println("��2�� Ů�ϴ�.");
		}else {
			 System.out.println("�� ���� �����ϴ�.");
		}
		
		/*if (num1 > num2) {
			System.out.println("��1�� Ů�ϴ�.");
		}else if (num1 < num2) {
			System.out.println("��2�� Ů�ϴ�.");
		}else if (num1 == num2) {
			 System.out.println("�� ���� �����ϴ�.");
		}else {
			 System.out.println("�ٽ� �Է��� �ּ���.");
		}
		*/
	}

}
