package chapter03.switchtest;

import java.util.Scanner;

public class SwitchCase04 {

	public static void main(String[] args) {
		// Scanner Ŭ������ �ν��Ͻ� ���� sc�� ���� �Է¹���
		
		//��� �����
		
		// A, a -> �ֿ����
		// B, b -> �����
		// ������ -> �Ϲݰ�
		// charAt(0) : String -> char
		
		Scanner sc = new Scanner(System.in);
		System.out.print("ȸ������ ����� ��� �ǽó���? : ");
		char grade = sc.nextLine().charAt(0); // String�� �ֻ��� ������. char�� �ٲٱ� ���ؼ��� �տ� ĳ���� �ϴ°��� �ƴ϶� �ڿ� .charAt�� ���ش�. // A,a,B,b....
		String dev;
		
		switch (grade) {
		case 'A': case 'a': {
			dev="�ֿ�� ��";
			break;
		}
		case 'B': case 'b': {
			dev="��� ��";
			break;
		}
		
		default: 
			dev="�Ϲ� ��";
			break;
		}
		
		System.out.println(grade+"����̹Ƿ� ȸ������ "+dev+"�Դϴ�.");
		
		
	}

}
