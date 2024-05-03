package chapter02;

import java.util.Scanner;

public class Bit_Test03 {

	public static void main(String[] args) {
		// 키보드 입력값 받기
		Scanner scanner=new Scanner(System.in); // 좌측에 있는 수많은 코드들 중에서 입력에 대한 코드만 가져와서 입력을 하겠다. 일단 전체적인 식 자체를 다 외우자.
		
		System.out.print("첫번째 수자 입력 : ");
		int num1=scanner.nextInt();
		System.out.print("두번째 수자 입력 : ");
		int num2=scanner.nextInt();
		
		//System.out.println(num1); 확인 끝나서 이렇게 함.
		//System.out.println(num2); 
		
		int andResult= num1 & num2;
		int orResult= num1 | num2;
		int xorResult= num1 ^ num2;
		
		System.out.println("비트 AND 결과 : "+andResult);
		System.out.println("비트 OR 결과 : "+orResult);
		System.out.println("비트 XOR 결과 : "+xorResult);
		
		
	}

}
