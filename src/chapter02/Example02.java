package chapter02;

import java.util.Scanner;

public class Example02 {

	public static void main(String[] args) {
		/* 배, 사과, 오렌지를 키우고 있는데 하루에 생산되는 양은 각각 5개, 7개, 5개 입니다.
		 * 과수원에서 하루에 생산되는 총 과일의 갯수를 출력하고,
		 * 시간당(24) 전체 과일의 평균 생산 갯수를 출력 하시오.
		 * (단, 평균값을 담는 데이터 타입은 float)로 정의한다.
		 */
//#1 
		int pear=5;
		int apple=7;
		int orange=5;
		
		int fruitTotal=pear+apple+orange;
		float fruitAve=fruitTotal/24f;
		
		
		System.out.println("하루에 생산되는 총 과일의 갯수: "+fruitTotal+"개");
		System.out.println("시간당 전체 과일의 평균 생산 갯수:"+fruitAve+"개");
		
		
//#2    번외로 스캐너로 해보기
		Scanner scanner=new Scanner(System.in);
		
		System.out.print("배의 수 : ");
		int num1=scanner.nextInt();
		System.out.print("사과의 수 : ");
		int num2=scanner.nextInt();
		System.out.print("오렌지의 수 : ");
		int num3=scanner.nextInt();
		
		
		System.out.println("하루에 생산되는 총 과일의 갯수 : "+(num1+num2+num3)+"개");
		System.out.println("시간당 전체 과일의 평균 생산 갯수 : "+((float)(num1+num2+num3)/24)+"개");
		
		
		
		
		
		
		

	}

}
