package chapter02;

public class StringConcat {

	public static void main(String[] args) {
		
		//String �����濡�� +�� ��������ڰ� �ƴ� ��ȣ������(���� �����ϴ� ������)�� ���
		//��, �ݵ�� ���ڿ��� ���� ����Ǿ�� ��
		
		String str1 = "JDK"+14; // 14�� �����̴�. String�� ������ �����ϴ�. JDK ���� ���鸸 �൵ ������ �����ϴ�.
		String str2 = str1 + " ���";
		System.out.println(str2);
		//� ���� ���� ���� �Ǵ��Ŀ� ���� �ٸ� ����� ����
		String str3 = "JDK"+11+13;
		String str4 = 11+13+"JDK";
		System.out.println(str3);
		System.out.println(str4);
		
		String str5 ="���� ���� ����" + 11+13 +"JDK";
		System.out.println(str5);
		
		

	}

}
