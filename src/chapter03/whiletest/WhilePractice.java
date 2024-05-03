package chapter03.whiletest;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class WhilePractice {

	public static void main(String[] args) {
		
		
		//자료들을 입력하는 데 총 입력한 자료의 갯수는 몇 개이며 합과 평균은 어떻게 되는가?
		
		/*
		int num, cnt=0, sum=0 ;
		double avg;
		
		Scanner scan = new Scanner(System.in);
		
		while (true) {
			
			System.out.print("값을 입력해주세요. : ");
			num = scan.nextInt();
			if( num ==0 ) {
				
				break;
			}
			sum+=num;
			cnt++;
		}
		
		System.out.println("횟수 : "+cnt);
		System.out.println("합 : "+sum);
		*/
		/*
		int num=1;
		int sum=0;
		
		do {
			
			sum+=num;
			num++;
		} while (num<=10);
		System.out.println("합 : "+sum);
		*/
		/*
		int num=1;
		int sum=0;
		for (int i=0; i<10; i++) {
			
			sum+=num;
			num++;
		}
		System.out.println(sum);
		*/
		
		//OTP 인증을 진행할 것이다. do while 문을 이용하여 만들어라
		/*
		int DB , ID , PW;
		DB = Integer.parseInt(JOptionPane.showInputDialog("OTP DB"));
		PW = Integer.parseInt(JOptionPane.showInputDialog("OTP PW"));
		
		do {
			
			ID = Integer.parseInt(JOptionPane.showInputDialog("OTP ID"));
			if ( DB == ID) {
				
				int Pass = Integer.parseInt(JOptionPane.showInputDialog("비밀번호를 입력하세요."));
				if ( PW == Pass) {
					
					System.out.print("로그인에 성공하셨습니다.");
					break;
				}
				else {
					
					System.out.println("PW를 잘못 입력하셨습니다. 처음부터 다시 진행해주세요.");
				}
			}
			else if ( DB != ID) {
				
				System.out.println("ID를 잘못 입력하셨습니다. 다시 입력하세요");
			}
		} while (true);
		*/
		
		// "1.입력하기 2.출력하기 3.삭제하기 4.끝내기 작업할 번호를 선택해주세요 : " 를 while문을 이용하여 나타내어라.
		/*
		int num;
		
		Scanner scan = new Scanner(System.in);
		while (true) {
			
			System.out.println("======================");
			System.out.print("작업할 번호를 선택해주세요. : "+"\n");
			System.out.println("======================");
			num = scan.nextInt();
			switch (num) {
			case 1: 

				System.out.println("1.입력하기");
				break;
			case 2: 

				System.out.println("2.출력하기");
				break;	
			case 3: 

				System.out.println("3.삭제하기");
				break;
			
			case 4: 

				break;
			default:
				break;
			}
		}
		*/
		
		boolean run = true;
		int num;
		int save=0;
		int money;
		
		Scanner scan = new Scanner(System.in);
		
		
		while (run) {
			System.out.println("-------------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("-------------------------------------");
			System.out.println("선택>");
		
			num=scan.nextInt();
		
			if (num == 1) {
			
				System.out.println("예금을 선택하셨습니다. 금액을 입력해주세요.");
				money=scan.nextInt();
				save+=money;
			}
			else if (num == 2) {
				
				System.out.println("출금을 선택하셨습니다. 금액을 입력해주세요.");
				money=scan.nextInt();
				if (money > save) {
					
					System.out.println("금액을 초과하셨습니다. 금액을 다시 입력해주세요.");
				}
				else {
					
					save-=money;
				}
			}
			else if (num == 3) {
				
				System.out.println("잔고를 선택하셨습니다. 잔고의 금액은 "+save+"원 입니다.");
			}
			else if (num == 4) {
				
				System.out.println("프로그램을 종료합니다.");
			}
			else {
				
				System.out.println("번호를 잘못 입력하였습니다. 번호를 다시 입력해주세요.");
			}
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
