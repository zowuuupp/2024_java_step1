package chapter03.iftest;

import javax.swing.JOptionPane;

public class IfExample08 {

	public static void main(String[] args) {

		int num1 , num2 ;
		
		num1=Integer.parseInt(JOptionPane.showInputDialog("값1"));
		num2=Integer.parseInt(JOptionPane.showInputDialog("값2"));
		
		if (num1 > num2) {
			System.out.println("값1이 큽니다.");
		}else if (num1 < num2) {
			System.out.println("값2이 큽니다.");
		}else {
			 System.out.println("두 수는 같습니다.");
		}
		
		/*if (num1 > num2) {
			System.out.println("값1이 큽니다.");
		}else if (num1 < num2) {
			System.out.println("값2이 큽니다.");
		}else if (num1 == num2) {
			 System.out.println("두 수는 같습니다.");
		}else {
			 System.out.println("다시 입력해 주세요.");
		}
		*/
	}

}
