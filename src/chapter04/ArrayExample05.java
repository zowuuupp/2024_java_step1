package chapter04;

import java.util.Scanner;

public class ArrayExample05 {

	public static void main(String[] args) {
		
		//학생수을 입력받아, 점수를 입력하고 점수리스트를 출력하고 총점과 평균을 분석하는 프로젝트
		boolean run=true;
				
		int studentNum=0;
		int[] score=null; //이게 일반적인 예의?
				
		Scanner scan=new Scanner(System.in);
				
		while(run) {
			System.out.println("-----------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("-----------------------------------------------");
			System.out.print("선택> ");
			
			int selectNo=Integer.parseInt(scan.nextLine());
			
			if(selectNo==1) {
				
				System.out.print("학생수> ");
				studentNum=Integer.parseInt(scan.nextLine());
				score = new int [studentNum]; //첨자를 이용하여 공간확보
			} else if (selectNo==2) {
				
				for (int i=0; i<score.length; i++) {
					
					System.out.print("score["+(i+1)+"]> ");
					score[i]=Integer.parseInt(scan.nextLine()); //score배열방에 요소 입소
					}
			} else if (selectNo==3) {
					
				for (int i=0; i<score.length; i++) {
					
				System.out.print("score["+(i+1)+"]> "+score[i]);
				System.out.println();
				}
			} else if (selectNo==4) {
				/*
				int max =0;
				int sum =0;
				double avg=0.0;
				
				for(int i=0;i<score.length;i++) {
				max= max < score[i] ? score[i] : max; //최고점수
				sum += score[i]; //총점
				}
				
				avg=sum/(double)studentNum;
				System.out.println("최고 점수 : "+max);
				System.out.println("총점 : "+sum);
				System.out.println(String.format("평균 : %.2f",avg));
				*/
				int sum=0;
				int max=0;
				double avg;
				
				for (int i=0; i<score.length; i++) {
					
					if (score[i]>max) {
						
						max=score[i];
					}
					sum+=score[i];
				}
				avg=(double)sum/studentNum;
				
				System.out.println("최고 점수 : "+max);
				System.out.println("총점 : "+sum);
				System.out.println("평균 : "+avg);
				
				
			} else if (selectNo==5) {
				
				run=false;
			}
			
		}//while
		System.out.println("프로그램 종료");
		
		
		
		
		
		
	}

}
