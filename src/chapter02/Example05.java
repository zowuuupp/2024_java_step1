package chapter02;

public class Example05 {

	public static void main(String[] args) {
		/* �����濡 51�� ����(������ : number)
		 * �� ���� ������� ���θ� �Ǻ��ϴ� ���α׷�
		 * �����濡 ����� ���� ����� "����Դϴ�"
		 * �׷��� ���� ��� "���� �Ǵ� 0�Դϴ�." ��� ����� �Ǿ����
		 */
		
		//���� �ʱ�ȭ
		int number=51;
		
		//���迬���ڸ� ����Ͽ� ��� ���� �Ǵ�
		boolean isPositive=(number > 0) ;
		
		//���� ������ ���

		String str = (number>0)? "����Դϴ�" : "���� �Ǵ� 0�Դϴ�.";
		//String str = isPositive? "����Դϴ�" : "���� �Ǵ� 0�Դϴ�.";
		System.out.println(str);
		
		
		/*int _num = 0;
		String numResult = (0 < _num) ? "���" : (0 > _num)? "����" : "0" ; 
		System.out.println(numResult + " �Դϴ�.");
		*/
		
		
		
		
	}

}
