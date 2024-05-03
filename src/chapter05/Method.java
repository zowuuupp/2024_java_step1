package chapter05;

import java.util.Scanner;

public class Method {
	
	//멤버변수(=필드)
	
	//생성자
	
	//메서드
	Scanner scan = new Scanner(System.in);
	
	void makeBread() {
		System.out.println("빵을 만듭니다.");
	}//메서드1
	
	//public은 생략이 가능하다.
	void makeBread(int count) {
		for (int i=0; i<count ; i++) {
			System.out.println((i+1)+"번째 빵을 만듭니다.");
		}
		System.out.println("요청하신 "+count+"개의 빵이 모두 완료되었습니다.");
	}//메서드2
	void makeBread(int count, String name) {
		for (int i=0; i<count ; i++) {
			System.out.println((i+1)+"번째 빵을 만듭니다.");
		}
		System.out.println("요청하신 "+count+"개의 "+name+"빵이 모두 완료되었습니다.");
	}//메서드3 , 매게 변수를 다르게 해서 여러개 만드는 걸 오버로딩
	//============================================================
	void order() {
		boolean run=true;
		while(run) {
			System.out.println("------------------------------------------");
			System.out.println("1. 빵 개수만 선택 | 2.빵 개수와 종류 선택 | 3.종료");
			System.out.println("------------------------------------------");
			System.out.println("선택>>");
			
			int input_num = scan.nextInt();
			/*
			switch (input_num) {
			case 1: 
				System.out.print("빵 갯수 입력 : ");
				int cnt1=scan.nextInt();
				makeBread(cnt1);
				break;
			case 2:
				System.out.print("빵 갯수 입력 : ");
				int cnt2=scan.nextInt();
				System.out.print("빵 종류 선택 : ");
				String name=scan.nextLine();
				makeBread(cnt2, name);
				break;
			case 3:
				System.out.println("프로그램 종료");
				run=false;
				break;
			default:
				System.out.println("잘못된 변호를 입력하셨습니다.");
			}
			*/
			
			if( input_num==1) {
				System.out.println("주문할 빵의 갯수:");
				int cnt=scan.nextInt();
				makeBread(cnt);
			}
			else if( input_num==2){
				System.out.println("주문할 빵의 갯수:");
				int cnt=scan.nextInt();
				System.out.println("주문할 빵의 종류:");
				String name=scan.next(); //둘 다 String이지만 차이가 있다. next()는 공백을 허용X. Hello World 이러면 Hello까지 인식 , nextLine()는 공백을 허용한다. 얘는 Hello World 인식
										// 그리고 nextLine은 엔터를 허용하지 않는다.
				makeBread(cnt, name);
			}
			else if( input_num==3) {
				System.out.println("프로그램 종료");
				run=false;
				break;
			}else {
				System.out.println("잘못된 번호 입니다.");
			}
		
		}//while
		
}
	
	
	

}
