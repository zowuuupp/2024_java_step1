package chapter02;

public class Bit_Test01 {

	public static void main(String[] args) {
		
		int num1=5; // 0101
		int num2=10; // 1010
		
		//Bit OR(|) : �ϳ��� 1�̸� 1�� ����� ��ȯ , (| �ϳ��� ��Ʈ�����̴�. ||�� �������̴�.)
		int result=num1 | num2;
		System.out.println(result);//1111
		//Bit AND(&) : ��� 1�̸� 1�� ����� ��ȯ
		int result2=num1 & num2;
		System.out.println(result2);//0000
		//Bit XOR(^) : 0�� 1�� ũ�ν� �Ǹ� 1�� ����� ��ȯ
		int result3=num1 ^ num2;
		System.out.println(result3);//1111
		
		
		
		
		
		
		
		

	}

}
