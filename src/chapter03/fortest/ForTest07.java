package chapter03.fortest;

import java.util.Scanner;

public class ForTest07 {

	public static void main(String[] args) {
		// 10개의 정수를 입력 받아서 3의 배수, 5의 배수를 각각 출력
		
		Scanner scan = new Scanner(System.in);
		
		int a , cnt3=0, cnt5=0;
		System.out.print("정수를 입력하세요 : ");
		a = scan.nextInt();
		
		for(int i=1 ; i<=a; i++) {
			if (i%3==0) {
				cnt3++;
			}
			if(i%5==0) {
				cnt5++;
			}
			
		}//for
		
		System.out.println("3의 배수 : " + cnt3 +"개");
		System.out.println("5의 배수 : " + cnt5 +"개");
		
		
		

	}

}
