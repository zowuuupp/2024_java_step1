package chapter04;

import javax.swing.JOptionPane;

public class ArrayTest02 {

	public static void main(String[] args) {
		
		String student[];
		student=new String[3];
		String phone[]=new String[3];
		
		for (int i=0 ; i<student.length;i++) {
			
			student[i]=JOptionPane.showInputDialog("�̸�");
			phone[i]=JOptionPane.showInputDialog("��ȭ��ȣ");
			System.out.println("�̸� : "+student[i]+" | "+"��ȭ��ȣ : "+phone[i]);
			
		}
		
		
		
		
	}

}
