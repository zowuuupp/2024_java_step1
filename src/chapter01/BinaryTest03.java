package chapter01;

public class BinaryTest03 {

	public static void main(String[] args) {
		//맨 앞자리 0 -> 양수, 1 -> 음수
		int num1=0B00000000000000000000000000000101; //+5
		int num2=0B11111111111111111111111111111010; //1의 보수 -> -6
		int num3=0B11111111111111111111111111111011; //2의 보수 -> -5
		
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);

		System.out.println("num1 : "+num1);
		System.out.println("num1이 1의 보수 : "+num2);
		System.out.println("num1의 2의 보수 : "+num3);
		System.out.println("num1+num3 : "+(num1+num3));
		
		int hNum=0x09; //16진수(Hex)
		int hNum1=0x0A;
		int hNum2=0x0F;
		int hNum3=0xA0;
		int hNum4=0xE0;
		System.out.println("16진수 : "+hNum);
		System.out.println("16진수 : "+hNum1);
		System.out.println("16진수 : "+hNum2);
		System.out.println("16진수 : "+hNum3);
		System.out.println("16진수 : "+hNum4);
		
		
		

	}

}
