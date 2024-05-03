package chapter03.whiletest;

import java.util.Scanner;

public class WhileExample03 {

	public static void main(String[] args) {
		
		boolean run = true;
		int balance = 0; //예금(+) , 출금(-), 잔액조회(balance)
		
		Scanner scan = new Scanner(System.in);
		
		
		while (run) {
			System.out.println("-------------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("-------------------------------------");
			System.out.println("선택>");
			int menuNum=Integer.parseInt(scan.nextLine()); // 걍 int meneNum = scan.nextint로 해도 된다. 걍 형 변환 보여주려고 이렇게 하신거.
			
			
			switch (menuNum) {
			case 1 : 
				System.out.println("예금액>");
				int money1 = Integer.parseInt(scan.nextLine()); 
				balance+=money1;
				break;
				
				/* 선생님
				balance += Integer.parseInt(scan.nextLine());
				break;
				*/
				
			case 2 : 
				System.out.println("출금액>");
				int money2 = Integer.parseInt(scan.nextLine());
				balance-=money2;
				break;
				
				/* 선생님
				balance -= Integer.parseInt(scan.nextLine());
				break;
				*/
				
			case 3 : 
				System.out.println("잔고액>");
				System.out.println(balance);
				break;
				
			case 4: 
				run=false;
				break;
			
			}

		} System.out.println("예산 프로그램을 종료합니다.");

	}

}
