package chapter03.whiletest;

import javax.swing.JOptionPane;

public class Do_WhileTest08 {

	public static void main(String[] args) {
		
		int num1, num2;
		
		do {
			num1=Integer.parseInt(JOptionPane.showInputDialog("OTP DB"));
			num2=Integer.parseInt(JOptionPane.showInputDialog("OTP USER"));
			
			if ( num1 == num2) {
				System.out.println("������ �����Ͽ����ϴ�.");
			}else {
				System.out.println("�ٽ� �Է��ϼ���.");
			}
			
		} while (num1 != num2);
		
	}

}
