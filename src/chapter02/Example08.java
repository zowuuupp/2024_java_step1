package chapter02;

import java.util.Scanner;

public class Example08 {

	public static void main(String[] args) {
		// 두 개의 숫자를 입력 받아서 첫 번째 숫자(num1)가 두 번째 숫자(num2)보다
	    // 큰지 여부를 출력하는 프로그램을 작성하세요.
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.print("첫 번째 숫자 : ");
		int num1 = scan.nextInt();
		System.out.print("두 번째 숫자 : ");
		int num2 = scan.nextInt();
		
		String result = num1 > num2 ? "크다" : "작다";
		String result2 = num1 == num2 ? "같다" : result;
		System.out.print("첫 번째 숫자와 두 번째 숫자의 크기 여부 : "+result2);
		
		
		
		

	}

}
