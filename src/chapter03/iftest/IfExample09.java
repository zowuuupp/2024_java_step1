package chapter03.iftest;

import javax.swing.JOptionPane;

public class IfExample09 {

	public static void main(String[] args) {
		// �����ͼ�
		String ID="soldesk";
		int PW=240119;
		
		//��
		String id=JOptionPane.showInputDialog("���̵� �Է��ϼ���.");
		int pass=Integer.parseInt(JOptionPane.showInputDialog("�н����带 �Է��ϼ���.")); // JOptionPane.showInputDialog �� String�̴�. �̰Ÿ� �׳� (int)�δ� �� �ٲ۴�. �ڷ����� �ڷ����� �ƴϰ� class�� �ڷ����̴�.
		
		if(ID.equals(id)) {
			//��й�ȣ
			if(PW==pass) { //equals �� ���ϴ� �� ��찡 ���� String�̾���Ѵ�.
				System.out.println(ID+"�� ȯ���մϴ�."); 
			} else {
				System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
			}
		} else {
			System.out.println("��ġ�ϴ� ���̵� �����ϴ�.");
		}
		
		

	}

}
