package chapter03.fortest;

import java.util.Scanner;

public class ForTest03 {

	public static void main(String[] args) {
		// 입력받은 수를 초과하면 반복문을 멈추는 조건
		
		int i,sum=0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");
		int num = scan.nextInt();
		
		for(i=1 ; ; i++) {
			
			if (sum>num) {
				break;
				
			}
			
			sum+=i;
		}
		
		System.out.println((i-1)+"번째까지의 총합 : "+sum);
		
		/* i = 1 , sum = 1 , num = 10
		   i = 2 , sum = 3 , num = 10
		   i = 3 , sum = 6 , num = 10
		   i = 4 , sum = 10 , num = 10
		   i = 5 , sum = 15 , 
		 */

	}

}
