package chapter03.fortest;

import java.util.Scanner;

public class ForExample01 {

	public static void main(String[] args) {
		// ����� ������ �Է� ���� ������ ������ �ο����� �Է� �ް�,
		// ������ ����� ���Ͻÿ�.(��, ����� �Ǽ��� ����� ��)
		
			Scanner scan = new Scanner(System.in);
			
			int i, cnt, sum=0, score;
			double avg;
			
			System.out.print("�� ���� ������ �˰� �����Ű���?");
			cnt=scan.nextInt();
			
			for(i=1 ; i<=cnt ; i++) {
				System.out.print(i+"��° ���� �Է� : ");
				score=scan.nextInt();
				
				sum+=score;
			}
			
			avg=(double)sum / cnt ;
			System.out.println(cnt+"�� ������ ������ : "+sum+"��, ����� "+avg+"�� �Դϴ�.");
			
			
			
			
	}

}
