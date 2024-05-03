package chapter03.whiletest;

import java.util.Scanner;

public class WhileTest05 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		while (true) {
			System.out.print("Java 교과목 점수를 입력하세요 : ");
			int scr=scan.nextInt();
			
			if (scr>=60) {
				System.out.println("합격입니다.");
				break;
			} 
			else if ( scr<0 || scr>100) {
				System.out.println("점수를 잘못 입력하셨습니다.");
				break;
			} 
			else {
				System.out.println("불합격입니다.");
				break;
			}
			
		}
		System.out.println("프로그램 종료");
		
		
		

		
	}

}
