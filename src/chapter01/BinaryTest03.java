package chapter01;

public class BinaryTest03 {

	public static void main(String[] args) {
		//�� ���ڸ� 0 -> ���, 1 -> ����
		int num1=0B00000000000000000000000000000101; //+5
		int num2=0B11111111111111111111111111111010; //1�� ���� -> -6
		int num3=0B11111111111111111111111111111011; //2�� ���� -> -5
		
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);

		System.out.println("num1 : "+num1);
		System.out.println("num1�� 1�� ���� : "+num2);
		System.out.println("num1�� 2�� ���� : "+num3);
		System.out.println("num1+num3 : "+(num1+num3));
		
		int hNum=0x09; //16����(Hex)
		int hNum1=0x0A;
		int hNum2=0x0F;
		int hNum3=0xA0;
		int hNum4=0xE0;
		System.out.println("16���� : "+hNum);
		System.out.println("16���� : "+hNum1);
		System.out.println("16���� : "+hNum2);
		System.out.println("16���� : "+hNum3);
		System.out.println("16���� : "+hNum4);
		
		
		

	}

}
