package chapter02;

public class Example03 {

	public static void main(String[] args) {
		//#1
		//���׿����ڸ� �̿��Ͽ� score1�� 60 ���� ũ�ų� ������ �հ�
		//�׷��� ������ ���հ����� ��ȯ �Ͻÿ�.
		int score1=60;
		
		String str1 = score1>=60 ? "�հ�" : "���հ�";
		System.out.println(str1);
		
		//String pass = (score>=60) ? "�հ�" : ���հ�";
		//System.out.println("�հ� ���� : "+pass);

		
		//#2
		//���׿����ڸ� �̿��Ͽ� score2�� 90���� ũ�� 'A'�̰�
		//score2�� 80���� ũ�� 'B' �� ���ϴ� ��� 'C'�� �����Ѵ�
		int score2=80;
		
		String str2 = score2>90 ? "A" : "B";
		String str3 = score2<=80 ? "C" : (str2);
		
		System.out.println(str3);
		
		//char grade;
		//grade=(score2>90)?'A' : ( (score2>80)? 'B' : 'C' )
		//System.out.println("���� : "+grade);
		
		
		
	}

}
