package chapter04;

import java.util.Random;

import javax.swing.JOptionPane;

public class MyLotto {

	public static void main(String[] args) {
		
		//로또번호 6개를 담을 배열
		int number;
		int cnt=0;
		int lotto[]=new int[6];
		
		System.out.println("===== 이번 주 로또 예상번호 =====");
		number=Integer.parseInt(JOptionPane.showInputDialog("원하는 로또 구매 횟수를 입력하세요."));
		
		/* 
		//중복제거X
		while ( number > cnt) {

			System.out.print("["+ (cnt+1) +"] : ");
			cnt++;
			for ( int i = 0 ; i<lotto.length ; i++) {
				lotto[i]=(int)(Math.random()*45+1);
				System.out.print(lotto[i]+" ");
			}
			
		}
		System.out.println();
		*/ 
		
		/*
		//중복제거 방법1 (모르것다)
		while ( number > cnt) {

			System.out.print("["+ (cnt+1) +"] : ");
			for (int i=0 ; i < lotto.length; i++) {
				Random random = new Random();
				lotto[i]=random.nextInt(45)+1;
				System.out.print(lotto[i]+" ");
			
				int j=i+1;
				lotto[j]=random.nextInt(45)+1;
				
					if (lotto[j] == lotto [i]) {
						
						i--; 
					}

			}
			
		}
		System.out.println();
		cnt++;
		*/ 
		
		
		//중복제거 방법2
		while (number>cnt) {
			
			System.out.print("["+ (cnt+1) +"] : ");
			
			outer : for (int i=0; i<lotto.length;) {
				
						lotto[i]=new Random().nextInt(45)+1;
						for (int j=0 ; j<i ; j++) {
							
							if(lotto[i]==lotto[j]) {
								
								continue outer; // 분기점으로 이동
							}
						}//in for
						System.out.print(lotto[i]+" ");
						i++;
						
					}//out for
					cnt++;
					System.out.println();
		
		}
		
		
		/*
		// 중복제거 방법2 outer 없이 적기.
		for(int i=0;i<lotto.length;i++) {
			lotto[i]=random.nextInt(45)+1;
			for(int j=0;j<i;j++) {	
				if(lotto[i]==lotto[j]) {
					i--;
					break;
				}
			}
		}
		for(int i=0;i<lotto.length;i++) {
			System.out.print(lotto[i] + " ");
      
		}
		System.out.println();
		cnt++;
		*/
		
	}

}
