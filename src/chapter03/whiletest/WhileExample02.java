package chapter03.whiletest;

public class WhileExample02 {

	public static void main(String[] args) {
		// ���丮�� �˰���
		/*
		 * 5! -> 5*4*3*2*1 => n! -> n*(n-1)*(n-2)*.....*1
		 */
		
		int number=5;
		int factorial=1;
		
		//���ڰ� 0�� �ƴ� ������ �ݺ��ϴ� ���丮�� ���
		while ( number>0) {
			factorial *= number;
			number--;
		}
		
		System.out.println("���丮�� ��� : "+factorial);
	}

}
