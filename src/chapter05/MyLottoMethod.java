package chapter05;

import javax.swing.JOptionPane;

public class MyLottoMethod {

	public static void main(String[] args) {
		int number = Integer.parseInt(JOptionPane.showInputDialog("���ϴ� �ζ� ����Ƚ���� �Է��ϼ���"));
        int cnt = 0;
        System.out.println("==== �̹��� �ζ� �����ȣ ====");
        while (number > cnt) {
            System.out.print("[" + (cnt + 1) + "] : ");
            int[] lotto = new int[6];
            int index = 0;
            while (index < 6) {
                int num = (int) (Math.random() * 45) + 1;
                if (!contains(lotto, num)) { //�ߺ�üũ
                    lotto[index++] = num;
                }
            }
            for (int num : lotto) {
                System.out.print(num + " ");
            }
            System.out.println();
            cnt++;
          }//while
		
		
		
		
		
	}//main
	
	//�ߺ�üũ �޼ҵ�
	private static boolean contains(int[] a , int b) {
		for (int i: a) {
			if (i == b) { //�迭�濡 �ִ� ���� == ��� ���� ����
				return true; //�ߺ��� ���� ����
			}
		}
		return false; //�ߺ��� ���� ����
	} // !contain �� true ���� �ϱ� ������ contain�� false���� �Ѵ�.
}
