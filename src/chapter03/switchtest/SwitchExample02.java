package chapter03.switchtest;

import java.util.Scanner;

public class SwitchExample02 {

	public static void main(String[] args) {
		/*
		사용자로부터 요일을 입력받아(1~7) 해당 요일에 어떤 음식을 먹을지 출력하는 프로그램을 작성하세요.
		(월요일:떡볶이, 화요일:스파게티,------,일요일:초밥)-->여러분이 먹고싶은거 아무거나 
		 */
		
		Scanner scan = new Scanner(System.in);
		
		String eat, day;
		
		System.out.print("어떤 요리를 먹을까?");
		day = scan.nextLine();
		
		switch (day) {
		case "월요일": case "목요일": {
			eat="제육덮밥";
			break;
		}
		case "화요일": {
			eat="돈까스";
			break;
		}
		case "수요일": case "금요일": {
			eat="중화요리";
			break;
		}
		case "토요일": {
			eat="수제비";
			break;
		}
		case "일요일": {
			eat="초밥";
			break;
		}
		default:
			eat="요일을 잘못 입력하셨습니다.";
			break;
		}
		
		System.out.println(day+"에는 "+eat+"를(을) 먹을 예정입니다.");
	}

}
