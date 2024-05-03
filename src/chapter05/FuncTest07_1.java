package chapter05;

import java.util.Scanner;

public class FuncTest07_1 {
	
	public static String EduStep(int edu) {
		String eduStep = null;
		switch (edu) {
		case 1: 
			eduStep="1단계";
			break;
			
		case 2: 
			eduStep="2단계";
			break;
			
		case 3: 
			eduStep="3단계";
			break;
			
		default:
			eduStep="해당하는 스터디 단계가 없습니다";
			break;
			
		}
		return eduStep;
		
	}

	public static void main(String[] args) {
		//사용자로부터 스터디 단계를 입력받아서 EduStep 호출하기
		//메소드를 호출한 결과값을 변환받아 step에 저장
		
		Scanner scan = new Scanner(System.in);
		System.out.print("스터디 단계를 입력하세요 : ");
		int number = scan.nextInt();
		
		System.out.println("현재 수업 단계는 "+EduStep(number));
		
		
		
		
		
	}

}
