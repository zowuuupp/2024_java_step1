package chapter01;

public class Constant15 {

	public static void main(String[] args) {
		// ��� : ������ �ʴ� ��
		
		final int MAX_NUM=100; // ����� ��� �̸��� ���� �빮�ڷ� ���ش�. ��Ȯ�� ��� �� �ʱ�ȭ
		final int MIN_NUM;// ���� �̶� �Ѵ�.
		final double PI=3.14;
		
		MIN_NUM=0; // ���ͳ� ��
        //PI=3.141592; // ���ͳ� ��
		
		//���� MIN_NUM=0; �� ������ �� ������ �� �ؿ��� ������ ���. ���ͳΰ� ����� final�� ����Ǿ� �־� ERROR
		
		System.out.println(MAX_NUM);
		System.out.println(MIN_NUM);
		System.out.println(PI);
		
		
		
	}

}
