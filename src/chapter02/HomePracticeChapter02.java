package chapter02;

import java.util.Scanner;

public class HomePracticeChapter02 {

	public static void main(String[] args) {
		
		/*
		int mathScore=79;
		int engScore=95;
		int korScore=97;
		
		int total = mathScore + engScore + korScore;
		
		double avg = total / 3.0;
		
		System.out.println("총점 : "+total);
		System.out.println("평균 : "+avg);
		
		System.out.println("====AssignTest=====");
		
		int num1=15;
		int num2=30;
		
		System.out.println(num1);
		num1+=num2;// num1=num1+num2
		System.out.println(num1);
		
		int num3=20;
		System.out.println("num3=num3+10 : "+(num3+=10));
		System.out.println("num3=num3-10 : "+(num3-=10));
		System.out.println("num3=num3*10 : "+(num3*=10));
		System.out.println("num3=num3/10 : "+(double)(num3/=10));
		System.out.println("num3=num3%10 : "+(num3%=10));
		
		System.out.println("====전위연산=====");
		int gameScore=150;
		int lastScore1=++gameScore;
		System.out.println(gameScore);
		System.out.println(lastScore1);
		int lastScore2=--gameScore;
		System.out.println(gameScore); //150
		System.out.println(lastScore2); //150
		
		System.out.println("====후위연산=====");
		int lastScore3=gameScore++;
		System.out.println(lastScore3);//150
		System.out.println(gameScore);//151
		int lastScore4=gameScore--;
		System.out.println(lastScore4);//151
		System.out.println(gameScore);//150
		*/
		/*
		System.out.println("학생당 몇개씩 가지고, 최종적으로 몇개 남는지 구해보기");
		// 534개의 책을 학생 30명에게 똑같은 갯수로 나눠줄 때,
		// 학생당 몇개씩 가지고, 최종적으로 몇개 남는지 구해보기
		
		System.out.println("=======구분=======");
		
		/*Scanner scanner = new Scanner(System.in);
		
		System.out.print("책의 갯수 : ");
		int books = scanner.nextInt();
		System.out.print("학생의 수 : ");
		int students = scanner.nextInt();
		
		System.out.println("학생당 한 명이 가지는 책의 수 : "+(books/students));
		System.out.println("남는 책의 수 : "+(books%students));
		
		System.out.println("=======구분=======");
		*/
		
		/* 배, 사과, 오렌지를 키우고 있는데 하루에 생산되는 양은 각각 5개, 7개, 5개 입니다.
		 * 과수원에서 하루에 생산되는 총 과일의 갯수를 출력하고,
		 * 시간당(24) 전체 과일의 평균 생산 갯수를 출력 하시오.
		 * (단, 평균값을 담는 데이터 타입은 float)로 정의한다.
		 * */
		
		/*Scanner scan = new Scanner(System.in);
		
		System.out.print("배의 갯수 : ");
		int pear=scan.nextInt();
		System.out.print("사과의 갯수 : ");
		int apple=scan.nextInt();
		System.out.print("오렌지의 갯수 : ");
		int orange=scan.nextInt();
		
		System.out.println("하루에 생산되는 총 과일의 갯수 : "+(pear+apple+orange));
		System.out.println("시간당 전체 과일의 평균 생산 갯수 : "+(float)(pear+apple+orange)/24);
		
		
		System.out.println("=======구분=======");
		*/
		
		//score1이 60보다 크거나 같으면 합격 아니면 불합격으로 반환하시오
		
		/*
		// score2가 90보다 크면 A, 80보다 크면 B, 그 이하는 C로 간주한다.
		
		int score2=50;
		
		String result,result2;
		
		
		result = score2 >90 ? "A" : "B";
		result2 = score2 <=80 ? "C" : result ;
		
		System.out.println("이 학생의 등급 : "+result2);
		*/
		
		//원의 넓이를 구하세요.(반지름*반지름*3.14)
		//반지름 :10, 3.14는 double로 정의하여 구하시오
		//반지름 변수방 num1 / 3.14 변수방 pi / 넓이 변수방 result
		/*
		int num1=10;
		double pi=3.14;
		double result;
		
		result = num1 * num1 * pi;
		*/
		
		/*Scanner 을 사용하여 
		두 개의 불리언(boolean) 변수 isSunny와 isWarm을 입력받아, 
		날씨가 화창하면서 따뜻한지 여부를 출력하는 프로그램을 작성하세요.
		(날씨가 화창하면서 따뜻한지에 대한 변수 isNiceWeather 으로 작성하세요.)
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("날씨가 화창한가요? true/false : ");
		boolean isSunny=scan.nextBoolean();
		System.out.print("날씨가 따뜻한가요? true/false : ");
		boolean isWarm=scan.nextBoolean();
		boolean isWeather= isSunny && isWarm ;
		
		if ( isSunny == true  && isWarm==true ) {
			
			System.out.println("날씨가 화창하면서 따뜻하다.");
		} else if ( isSunny == true  && isWarm==false ) {
			
			System.out.println("날씨가 화창하지만 따뜻하지 않다.");
		} else if ( isSunny == false  && isWarm==true ) {
			
			System.out.println("날씨가 화창하지 않지만 따뜻하다.");
		} else {
			
			System.out.println("날씨가 화창하지 않고 따뜻하지 않다.");
		}
		System.out.println("======isWeather 확인========");
		System.out.println(isWeather);
		*/
		
		/*
		// 한 자릿수 숫자를 입력받아 (scan)
		// 숫자가 짝수인지 홀수인지 출력하는 프로그램(삼항 연산자 사용)
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("확인하고자 하는 숫자를 입력하세요. : ");
		int num=scan.nextInt();
		String result;
		
		result = num%2 ==0 ? "짝수" : "홀수";
		
		System.out.println("입력하신 숫자 홀수 짝수 여부 확인 : "+result);
		*/
		
		// 두 개의 숫자를 입력 받아서 첫 번째 숫자(num1)가 두 번째 숫자(num2)보다
	    // 큰지 여부를 출력하는 프로그램을 작성하세요.
		
		/*
		Scanner scan = new Scanner(System.in);
		System.out.print("첫 번째 숫자를 입력해 주세요 : ");
		int num1=scan.nextInt();
		System.out.print("두 번째 숫자를 입력해 주세요 : ");
		int num2=scan.nextInt();
		
		String result,result2;
		result = num1 > num2 ? "첫 번째 숫자가 크다" : "두 번째 숫자가 더 크다" ;
		result2 = num1 == num2 ? "첫 번째 숫자와 두 번째 숫자가 같다" : result ;
		
		System.out.println("2개의 숫자를 비교한 결과 : "+result2);
		*/
		
		
		
		
		
		
		

	}

}
