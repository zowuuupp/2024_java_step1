package chapter03.fortest;

import java.util.Scanner;

public class Fortest_Practice {

	public static void main(String[] args) {
		
		/*
		int i;
		System.out.println("1���� 10������ �� ���");
		for (i=0 ; i<10 ; i++) {
			System.out.println((i+1)+" ");
			
		}
		
		System.out.println("===============");
		
		int j;
		int sumj=0;
		
		for (j=0 ; j<10 ; j++) {
			System.out.println("1���� 10������ �� ���");
			System.out.println((j+1)+" ");
			sumj+=(j+1);
			
		}
		
		System.out.println("1���� 10������ �� : "+sumj);
	*/
		
		// ����� ������ �Է� ���� ������ ������ �ο����� �Է� �ް�,
		// ������ ����� ���Ͻÿ�.(��, ����� �Ǽ��� ����� ��)
	/*
		int i, num, score, sum=0;
		double avg;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("�л��� ����? : ");
		num=scan.nextInt();
		
		for (i=1 ; i<=num ; i++) {
			System.out.print(i+"�� �л��� ������? : ");
			score=scan.nextInt();
			
			sum+=score;
		}
		
		avg=(double)sum/num;
		
		System.out.println(num+"�� ������ ���� : "+sum);
		System.out.println(num+"�� ������ ��� : "+avg);
		
		*/
		//Ȧ�� ������ �����
		/*
		int i,j;
		for ( i=1 ; i<=9 ; i+=2) {
			for ( j=1 ; j<=9 ; j++) {
				System.out.println(i+"*"+j+"="+(i*j));
				
			}
			
		}
		*/
		
		// ������ ���� �Է¹��� ���� �ʰ��ϸ� �ݺ����� ���ߴ� ����
		
		/*
		int sum=0;
		int num;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("���Ͻô� ���ڸ� �Է��ϼ���. : ");
		num = scan.nextInt();
		
		for (int i=1 ; sum > num ; i++) {
			
			sum+=i;
			break;
			
		}
		
		System.out.println("���� �Է��� ���ڸ� �ʰ��Ͽ����ϴ�.");
		System.out.println("������ ���� �� : "+sum);
		*/
		
		/*
		System.out.println("1���� 100������ ���� ����϶�");
		int sum=0;
		
		for (int i=0; i<100 ; i++) {
			
			System.out.println((i+1)+" ");
			sum+=(i+1);
		}
		System.out.println("1���� 100������ ���� : "+sum+"�Դϴ�.");
		*/
		
		// ������ ���� �Է¹��� ���� �ʰ��ϸ� �ݺ����� ���ߴ� ����
		/*
		Scanner scan = new Scanner(System.in);
		System.out.print("���Ͻô� ���ڸ� �Է��ϼ���. : ");
		int count = scan.nextInt();
		int sum=0;
		int i;
		
		for (i=0; ; i++) {
			
			if ( sum > count) {
				
				break;
			} 		
			sum+=(i+1);
		}
		
		System.out.println(i+"��°������ ���� : "+sum);
		*/
		/*
		System.out.println("===0���� 100������ �� �� Ȧ���� ���� ���===");
		
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
		System.out.println("0���� 100������ �� �� Ȧ���� �� : "+sum);
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
		System.out.print("0���� ũ�鼭 11���� ���� ���ڸ� �Է��ϼ��� : ");
		int a=scan.nextInt();
		
		if ( a>0 && a<11) {
			
			for (i=0;i<a;i++) {
				
				
			}
		}
		*/
		
		//������ 2�ܺ��� 9�� ����
		
		/*
		int i, j;
		
		System.out.println("2�ܺ��� 9�ܱ����� ������ǥ");
		for (i=2; i<10 ;i++) {
			
			System.out.println("["+i+"]��");
			for (j=1; j<=9 ;j++) {
				
				System.out.println(i+"*"+j+"="+(j*i));
			}
		}
		*/
		/*
		//2�ܺ��� 9�ܱ��� fortest10 �״�� ǥ���غ���
		
		int i,j;
		for (i=2;i<=9;i++) {
			
			System.out.print("["+i+"��]"+"\t");
		}
			System.out.println();
		for (i=1 ; i<=9; i++) {
			
			for(j=2;j<=9;j++) {
				
				System.out.print(j+"*"+i+"="+j*i+"\t");
			}
			System.out.println();
		}
		*/
		
		/*����ڷκ��� ���� �Է¹޾�, �ش� ���� ������ ����ϴ� ���α׷��� �ۼ��ϼ���.
		 * ��:3-5��, ����:6-8��, ����:9-11��, �ܿ�: 12-2��*/
		/*
		String season;
		Scanner scan = new Scanner(System.in);
		System.out.print("���Ͻô� ���� �Է��ϼ���. : ");
		int month = scan.nextInt();
		
		switch (month) {
		case 3 : case 4 :case 5 : 
			
			season="��";
			break;
			
		case 6 : case 7 :case 8 : 
			
			season="����";
			break;
			
		case 9 : case 10 :case 11 : 
			
			season="����";
			break;
		
		case 12 : case 1 :case 2 : 
			
			season="�ܿ�";
			break;
		
		default :
			season="�� �� ����";
			System.out.println("�Է��Ͻ� ������ �߸��Ǿ����ϴ�.");
		}
		System.out.println(month+"���� ������ "+season+" �Դϴ�.");
		*/
		
		
	}
			
} 
		
		
