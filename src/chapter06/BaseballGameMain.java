package chapter06;

import java.util.Random;
import java.util.Scanner;

public class BaseballGameMain {

	public static void main(String[] args) {
		/*
		Scanner scan=new Scanner(System.in);
	      
	      //��ǻ�Ͱ� �߻��� ���� 1��
	      int com1=0;
	      int com2=0;
	      int com3=0;
	      
	      do {
	         //1���� 9������ ���� �߻�
	         com1=new Random().nextInt(9)+1;
	         com2=new Random().nextInt(9)+1;
	         com3=new Random().nextInt(9)+1;
	      } while (com1==com2 || com1==com3 || com2 == com3);
	      
	      //��ǻ�� �غ� �Ϸ�
	      
	      //����ڰ� �Է��� ��
	      int user1=0;
	      int user2=0;
	      int user3=0;
	      
	      while(true) {
	         System.out.println("--1 ~ 9 ������ ���� �Է��ϼ���--");
	         System.out.print("ù��° ���� �Է��ϼ��� : ");
	         user1=scan.nextInt(); //����ڰ� �غ��� ��
	         System.out.print("�ι�° ���� �Է��ϼ��� : ");
	         user2=scan.nextInt(); //����ڰ� �غ��� ��
	         System.out.print("����° ���� �Է��ϼ��� : ");
	         user3=scan.nextInt(); //����ڰ� �غ��� ��
	         
	         int strike=0;
	         int ball=0;
	         
	          //���࿡ com1�� ����ڰ� �Է��� ù��°(user1) ���ڰ� ������ strike
	          //ù��°(user1) ���ڰ� com2 �Ǵ� com3�� ���ڸ� ������ ball
	         if(user1 == com1) { //���ڿ� �ڸ����� ��� ���� ���
	            strike ++;
	         }else if(user1 == com2 || user1 == com3) {//�ڸ��� Ʋ���� ���ڸ� ���� ���
	            ball++;
	         }
	         //---------------------------------------------
	         if(user2 == com2) { //���ڿ� �ڸ����� ��� ���� ���
	            strike ++;
	         }else if(user2 == com1 || user2 == com3) {//�ڸ��� Ʋ���� ���ڸ� ���� ���
	            ball++;
	         }
	         //------------------------------------------------
	         if(user3 == com3) { //���ڿ� �ڸ����� ��� ���� ���
	            strike ++;
	         }else if(user3 == com1 || user3 == com2) {//�ڸ��� Ʋ���� ���ڸ� ���� ���
	            ball++;
	         }
	         //-----------------------------------------------------
	         if(strike == 3) {
	            System.out.println("����!! - "+ com1 + com2 + com3);
	            break;
	         }else {
	            if(strike > 0 || ball > 0) {
	               System.out.println(strike +"Strike, "+ball+"Ball");
	            }else {//�ƹ��͵� ��ġ�ϴ� ���� ���� ���
	               System.out.println("OUT!!");
	               System.out.println("==========================");
	            }//in if
	         }//out if
	         
	         
	      }//while
 			*/
		
		String check = "";
		BaseballGame game = new BaseballGame();
		
		do {
			check = game.check();
		}while(check!="WIN");
			//WIN�� 3strike��.
		
		
		

	}

}
