package chapter01;

public class TypeInnference13 {

	public static void main(String[] args) {
		// ������ ����ȯ: ���� �޸𸮿��� ū �޸𸮷� �ڿ������� ����ȯ�� �Ǵ� ��(byte->int)
		byte bNum=10;
		int iNum=bNum;
		
		System.out.println(bNum);
		System.out.println(iNum);
		
		int i2Num=10;
		// byte b2Num=i2Num; // ERROR , ū �޸𸮿��� ���� �޸𸮷δ� �� �ȴ�.
		
		System.out.println(i2Num);
		System.out.println("------------------");

		// ������ ����ȯ: �� ������ ���� �ڿ������� �Ͻ��� ����ȯ(int->float)
		
		int i3Num=10;
		float fNum=i3Num;
		
		System.out.println(i3Num);
		System.out.println(fNum);
		
		float f2Num=10.0f;
		//int i3Num=f2Num; // ERROR , ������ �ſ��� �ܼ��� �����δ� �� �ȴ�.
		
		
		System.out.println(f2Num);
		
		
		
		
		
		
		
		

	}

}
