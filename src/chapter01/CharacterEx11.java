package chapter01;

public class CharacterEx11 {

	public static void main(String[] args) {
		//A:65 / a:97   , B:66
		
		int a=65;
		System.out.println(a);
		System.out.println(a+10);
		
		
		System.out.println("-----------------");
		// ����� ����ȯ int -> char (long ���� int�� ���� �� ������ ����ȯ)
		System.out.println((char)a); // �ƽ�Ű �ڵ� ( �����ε� ���ڶ�� ��ӵǾ� �ִ°�, int�� char�� ��ȯ)
		System.out.println("-----------------");
		
		int b=66;
		System.out.println(b);
		System.out.println((char)b);
		System.out.println("-----------------");
		
		int a2=97;
		System.out.println(a2);
		System.out.println((char)a2);
		System.out.println("-----------------");
		
		int b2=70;
		System.out.println(b2);
		System.out.println((char)b2);
		
		
		
		
		
	}

}
