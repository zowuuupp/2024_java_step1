package chapter03.fortest;

import java.util.Scanner;

public class Fortest_Practice {

	public static void main(String[] args) {
		
		/*
		int i;
		System.out.println("1부터 10까지의 수 출력");
		for (i=0 ; i<10 ; i++) {
			System.out.println((i+1)+" ");
			
		}
		
		System.out.println("===============");
		
		int j;
		int sumj=0;
		
		for (j=0 ; j<10 ; j++) {
			System.out.println("1부터 10까지의 수 출력");
			System.out.println((j+1)+" ");
			sumj+=(j+1);
			
		}
		
		System.out.println("1부터 10까지의 합 : "+sumj);
	*/
		
		// 몇명의 성적을 입력 받을 것인지 정수로 인원수를 입력 받고,
		// 총점과 평균을 구하시오.(단, 평균은 실수로 출력할 것)
	/*
		int i, num, score, sum=0;
		double avg;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("학생의 수는? : ");
		num=scan.nextInt();
		
		for (i=1 ; i<=num ; i++) {
			System.out.print(i+"번 학생의 성적은? : ");
			score=scan.nextInt();
			
			sum+=score;
		}
		
		avg=(double)sum/num;
		
		System.out.println(num+"명 성적의 총합 : "+sum);
		System.out.println(num+"명 성적의 평균 : "+avg);
		
		*/
		//홀수 구구단 만들기
		/*
		int i,j;
		for ( i=1 ; i<=9 ; i+=2) {
			for ( j=1 ; j<=9 ; j++) {
				System.out.println(i+"*"+j+"="+(i*j));
				
			}
			
		}
		*/
		
		// 누적된 합이 입력받은 수를 초과하면 반복문을 멈추는 조건
		
		/*
		int sum=0;
		int num;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("원하시는 숫자를 입력하세요. : ");
		num = scan.nextInt();
		
		for (int i=1 ; sum > num ; i++) {
			
			sum+=i;
			break;
			
		}
		
		System.out.println("합이 입력한 숫자를 초과하였습니다.");
		System.out.println("누적된 합의 값 : "+sum);
		*/
		
		/*
		System.out.println("1부터 100까지의 합을 출력하라");
		int sum=0;
		
		for (int i=0; i<100 ; i++) {
			
			System.out.println((i+1)+" ");
			sum+=(i+1);
		}
		System.out.println("1부터 100까지의 합은 : "+sum+"입니다.");
		*/
		
		// 숫자의 합이 입력받은 수를 초과하면 반복문을 멈추는 조건
		/*
		Scanner scan = new Scanner(System.in);
		System.out.print("원하시는 숫자를 입력하세요. : ");
		int count = scan.nextInt();
		int sum=0;
		int i;
		
		for (i=0; ; i++) {
			
			if ( sum > count) {
				
				break;
			} 		
			sum+=(i+1);
		}
		
		System.out.println(i+"번째까지의 총합 : "+sum);
		*/
		/*
		System.out.println("===0부터 100까지의 수 중 홀수의 합을 출력===");
		
		int sum=0;
		int num=0;
		int i;
		
		for (i=0 ; i<=100 ; i++) {
			
			if ( i%2 != 0 ) {
				
				num=i;
				System.out.println(num+" ");
				sum+=num;
			}
				
		}
		System.out.println("0부터 100까지의 수 중 홀수의 합 : "+sum);
		*/
		/*
		int i;
		char alpa='A';
		
		for (i=alpa ; i<='Z';i++) {
			
			System.out.println((char)i);
		}
		
		*/
		/*
		Scanner scan = new Scanner(System.in);
		
		int i;
		System.out.print("0보다 크면서 11보다 작은 숫자를 입력하세요 : ");
		int a=scan.nextInt();
		
		if ( a>0 && a<11) {
			
			for (i=0;i<a;i++) {
				
				
			}
		}
		*/
		
		//구구단 2단부터 9단 까지
		
		/*
		int i, j;
		
		System.out.println("2단부터 9단까지의 구구단표");
		for (i=2; i<10 ;i++) {
			
			System.out.println("["+i+"]단");
			for (j=1; j<=9 ;j++) {
				
				System.out.println(i+"*"+j+"="+(j*i));
			}
		}
		*/
		/*
		//2단부터 9단까지 fortest10 그대로 표현해보기
		
		int i,j;
		for (i=2;i<=9;i++) {
			
			System.out.print("["+i+"단]"+"\t");
		}
			System.out.println();
		for (i=1 ; i<=9; i++) {
			
			for(j=2;j<=9;j++) {
				
				System.out.print(j+"*"+i+"="+j*i+"\t");
			}
			System.out.println();
		}
		*/
		
		/*사용자로부터 월을 입력받아, 해당 월의 계절을 출력하는 프로그램을 작성하세요.
		 * 봄:3-5월, 여름:6-8월, 가을:9-11월, 겨울: 12-2월*/
		/*
		String season;
		Scanner scan = new Scanner(System.in);
		System.out.print("원하시는 월을 입력하세요. : ");
		int month = scan.nextInt();
		
		switch (month) {
		case 3 : case 4 :case 5 : 
			
			season="봄";
			break;
			
		case 6 : case 7 :case 8 : 
			
			season="여름";
			break;
			
		case 9 : case 10 :case 11 : 
			
			season="가을";
			break;
		
		case 12 : case 1 :case 2 : 
			
			season="겨울";
			break;
		
		default :
			season="알 수 없음";
			System.out.println("입력하신 월수가 잘못되었습니다.");
		}
		System.out.println(month+"월의 계절은 "+season+" 입니다.");
		*/
		
		
	}
			
} 
		
		
