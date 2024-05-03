package chapter02;

public class Bit_Test01 {

	public static void main(String[] args) {
		
		int num1=5; // 0101
		int num2=10; // 1010
		
		//Bit OR(|) : 하나라도 1이면 1로 결과값 반환 , (| 하나는 비트연산이다. ||는 논리연산이다.)
		int result=num1 | num2;
		System.out.println(result);//1111
		//Bit AND(&) : 모두 1이면 1로 결과값 변환
		int result2=num1 & num2;
		System.out.println(result2);//0000
		//Bit XOR(^) : 0과 1이 크로스 되면 1로 결과값 변환
		int result3=num1 ^ num2;
		System.out.println(result3);//1111
		
		
		
		
		
		
		
		

	}

}
