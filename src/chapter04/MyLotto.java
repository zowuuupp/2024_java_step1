package chapter04;

import java.util.Random;

import javax.swing.JOptionPane;

public class MyLotto {

	public static void main(String[] args) {
		
		//�ζǹ�ȣ 6���� ���� �迭
		int number;
		int cnt=0;
		int lotto[]=new int[6];
		
		System.out.println("===== �̹� �� �ζ� �����ȣ =====");
		number=Integer.parseInt(JOptionPane.showInputDialog("���ϴ� �ζ� ���� Ƚ���� �Է��ϼ���."));
		
		/* 
		//�ߺ�����X
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
		//�ߺ����� ���1 (�𸣰ʹ�)
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
		
		
		//�ߺ����� ���2
		while (number>cnt) {
			
			System.out.print("["+ (cnt+1) +"] : ");
			
			outer : for (int i=0; i<lotto.length;) {
				
						lotto[i]=new Random().nextInt(45)+1;
						for (int j=0 ; j<i ; j++) {
							
							if(lotto[i]==lotto[j]) {
								
								continue outer; // �б������� �̵�
							}
						}//in for
						System.out.print(lotto[i]+" ");
						i++;
						
					}//out for
					cnt++;
					System.out.println();
		
		}
		
		
		/*
		// �ߺ����� ���2 outer ���� ����.
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
