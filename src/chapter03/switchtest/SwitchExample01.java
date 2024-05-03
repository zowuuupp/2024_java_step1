package chapter03.switchtest;

import java.util.Scanner;

public class SwitchExample01 {

	public static void main(String[] args) {
		/*사용자로부터 월을 입력받아, 해당 월의 계절을 출력하는 프로그램을 작성하세요.
		 * 봄:3-5월, 여름:6-8월, 가을:9-11월, 겨울: 12-2월*/
		
		Scanner scan = new Scanner(System.in);
		System.out.print("계절 계산기 : ");
		
		int month=scan.nextInt();
		String season;
		
		switch (month) {
		case 3: case 4: case 5: {
			season="봄";
			break;
		}
		case 6: case 7: case 8: {
			season="여름";
			break;
		}
		case 9: case 10: case 11: {
			season="가을";
			break;
		}
		case 12: case 1: case 2: {
			season="겨울";
			break;
		}
		default:
			season="알 수 없음";
			System.out.println("입력하신 월수가 잘못 되었습니다.");
			break;
		}
		
		System.out.println(month+"월의 계절은 "+season+"입니다.");
	}

}
